package io.github.andreypfau.tl.parser

import io.github.andreypfau.tl.parser.ast.*
import me.alllex.parsus.parser.*
import me.alllex.parsus.token.literalToken
import me.alllex.parsus.token.regexToken

@Suppress("DANGEROUS_CHARACTERS", "ObjectPrivatePropertyName")
public object TLGrammar : Grammar<TLProgram>() {
    init {
        regexToken("\\s+", ignored = true)
        regexToken("//(.*)", ignored = true)
    }

    private val tripleMinus by literalToken("---")
    private val eq by literalToken("=")
    private val question by literalToken("?")
    private val dot by literalToken(".")
    private val semicolon by literalToken(";")
    private val colon by literalToken(":")
    private val hash by literalToken("#")
    private val bang by literalToken("!")
    private val lParen by literalToken("(")
    private val rParen by literalToken(")")
    private val lBrace by literalToken("{")
    private val rBrace by literalToken("}")
    private val lBracket by literalToken("[")
    private val rBracket by literalToken("]")
    private val plus by literalToken("+")
    private val mul by literalToken("*")
    private val comma by literalToken(",")
    private val percent by literalToken("%")
    private val underscore by literalToken("_")
    private val hex by regexToken("#[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]?[0-9a-f]?[0-9a-f]?[0-9a-f]?")
    private val digit by regexToken("\\d")
    private val natConst by oneOrMore(digit) map { digits ->
        buildString {
            digits.forEach {
                append(it.text)
            }
        }.toInt()
    }

    private val lcIdent by regexToken("[a-z][a-zA-Z0-9_]*")
    private val ucIdent by regexToken("[A-Z][a-zA-Z0-9_]*")
    private val lcIdentNs = regexToken("([a-z][a-zA-Z0-9_]*\\.)*[a-z][a-zA-Z0-9_]*")
    private val ucIdentNs = regexToken("([a-z][a-zA-Z0-9_]*\\.)*[A-Z][a-zA-Z0-9_]*")
    private val lcIdentFull by lcIdentNs * optional(hex) map { (head, tail) ->
        buildString {
            append(head.text)
            if (tail != null) {
                append(tail.text)
            }
        }
    }
    private val hashTypeIdent by hash map { HashTypeIdentifier }
    private val simpleTypeIdent by lcIdentNs map { SimpleTypeIdentifier(it.text) }
    private val boxedTypeIdent by ucIdentNs map { BoxedTypeIdentifier(it.text) }
    private val typeIdent by boxedTypeIdent or simpleTypeIdent or hashTypeIdent
    private val varIdent by lcIdent or ucIdent map {
        VariableIdentifier(it.text)
    }
    private val varIdentEmpty by underscore map {
        EmptyVariableIdentifier
    }
    private val varIdentOpt by varIdent or varIdentEmpty

    private val eNat by natConst map {
        ENat(it)
    }

    private val newKw by literalToken("New")
    private val finalKw by literalToken("Final")
    private val emptyKw by literalToken("Empty")

    private val newDecl by -newKw * boxedTypeIdent * -semicolon map {
        NewDeclaration(it)
    }
    private val finalDecl by -finalKw * boxedTypeIdent * -semicolon map {
        FinalDeclaration(it)
    }
    private val emptyDecl by -emptyKw * boxedTypeIdent * -semicolon map {
        EmptyDeclaration(it)
    }
    private val finalizationDecl by newDecl or finalDecl or emptyDecl

    private val shortCombName by lcIdentNs map {
        ShortCombinatorName(it.text)
    }

    private val fullCombName by lcIdentFull map {
        val split = it.split('#')
        val name = split[0]
        val hash = split.getOrNull(1)
        if (hash == null) {
            ShortCombinatorName(name)
        } else {
            FullCombinatorName(name, hash)
        }
    }

    private val emptyCombName by underscore map {
        EmptyCombinatorName
    }

    private val fullCombinatorId by fullCombName or emptyCombName
    private val combinatorId by shortCombName or emptyCombName

    private val subexpr: Parser<Expression> by ref(::term) or ref(::plusExpr)

    private val plusExpr by (eNat * -plus * ref(::subexpr)) map { (natExpr, subExpr) ->
        EPlusOperator(
            EExpression(
                listOf(
                    natExpr,
                    subExpr
                )
            )
        )
    }

    private val percentExpr by percent * oneOrMore(ref(::term)) map { (_, terms) ->
        val expression = if (terms.size > 1) {
            EExpression(terms)
        } else {
            terms[0]
        }
        EPercentOperator(expression)
    }

    private val expr by zeroOrMore(ref(::subexpr)) map {
        if (it.size > 1) {
            EExpression(it)
        } else {
            it.first()
        }
    }

    private val eTypeIdent by typeIdent map {
        ETypeIdentifier(it)
    }

    private val parenExpression by -lParen * expr * -rParen

    private val escapedExpr by eTypeIdent and -literalToken("<") and separated(
        expr,
        comma
    ) and -literalToken(">") map { (id, subExprs) ->
        EExpression(listOf(id) + subExprs)
    }

    private val term: Parser<Expression> by percentExpr or parenExpression or escapedExpr or eTypeIdent or eNat

    private val typeTerm by optional(bang) * term map { (bang, expr) ->
        val expression = if (bang != null) {
            EBangOperator(expr)
        } else {
            expr
        }
        TypeExpression(expression)
    }

    private val optArgs by -lBrace * oneOrMore(varIdent) * -colon * typeTerm * -rBrace map { (ids, argType) ->
        ids.map {
            OptionalArgument(it, argType)
        }
    }

    private val natTerm by term map {
        NatExpression(it)
    }

    private val condDef by varIdent * optional(-dot * natConst) * -question map { (id, nat) ->
        ConditionalDefinition(id, nat)
    }

    private val args4 by typeTerm map {
        listOf(Argument(EmptyVariableIdentifier, null, it))
    }

    private val args3 by parser {
        skip(lParen)
        val ids = oneOrMore(varIdent)()
        skip(colon)
        val argType = typeTerm()
        skip(rParen)
        ids.map {
            Argument(it, null, argType)
        }
    }
    private val args2 by parser {
        val id = varIdentOpt()
        skip(colon)
        skip(lParen)
        val cond = poll(condDef)
        val argType = typeTerm()
        skip(rParen)
        listOf(Argument(id, cond, argType))
    }

    private val args1 by parser {
        val id = varIdentOpt()
        skip(colon)
        val cond = poll(condDef)
        val argType = typeTerm()
        listOf(Argument(id, cond, argType))
    }
    private val args0 by parser {
        val id = poll(parser {
            varIdentOpt().also {
                skip(colon)
            }
        }) ?: EmptyVariableIdentifier
        val mult = poll(parser {
            natTerm().also {
                skip(mul)
            }
        })
        skip(lBracket)
        val args = zeroOrMore(ref(::args))().flatten()
        skip(rBracket)

        val argType = TypeExpression(
            expression = EMultiArg(
                multiplicity = mult,
                subArgs = args
            )
        )

        listOf(Argument(id, null, argType))
    }

    private val args: Parser<List<Argument>> by args0 or args1 or args2 or args3 or args4

    private val resultType2 by boxedTypeIdent * zeroOrMore(subexpr) map { (id, subExprs) ->
        ResultType(id, EExpression(subExprs))
    }
    private val resultType1 by boxedTypeIdent * -literalToken("<") * separated(
        subexpr,
        comma
    ) * -literalToken(">") map { (id, subExprs) ->
        ResultType(id, EExpression(subExprs))
    }
    private val resultType by resultType1 or resultType2

    private val combinatorDecl by parser {
        val id = fullCombinatorId()
        val optionalArgs = zeroOrMore(optArgs)().flatten()
        val args = zeroOrMore(args)().flatten()
        eq()
        val excl = poll(bang)
        val resultType = resultType()
        semicolon()

        CombinatorDeclaration(
            id,
            optionalArgs,
            args,
            excl != null,
            resultType
        )
    }

    private val builtinCombinatorDecl by parser<BuiltinCombinatorDeclaration>() {
        val id = fullCombinatorId()
        skip(question)
        skip(eq)
        val result = boxedTypeIdent()
        skip(semicolon)
        BuiltinCombinatorDeclaration(id, result)
    }
    private val partialAppDecl by parser<PartialApplicationDeclaration> {
        TODO()
    }

    private val declaration by combinatorDecl or builtinCombinatorDecl

    private val functionsKw = literalToken("functions")
    private val typesKw = literalToken("types")

    private val constrDeclarations = -(tripleMinus * typesKw * tripleMinus) * zeroOrMore(declaration) map {
        ConstructorDeclarations(it)
    }
    private val functionDeclarations = -(tripleMinus * functionsKw * tripleMinus) * zeroOrMore(declaration) map {
        FunctionDeclarations(it)
    }

    override val root: Parser<TLProgram> by parser {
        val head = oneOrMore(declaration)()
        val tail = zeroOrMore(constrDeclarations or functionDeclarations)()

        val constructors = mutableListOf<Declaration>()
        val functions = mutableListOf<Declaration>()

        constructors.addAll(head)
        tail.forEach {
            when (it) {
                is ConstructorDeclarations -> constructors.addAll(it.declarations)
                is FunctionDeclarations -> functions.addAll(it.declarations)
            }
        }

        TLProgram(ConstructorDeclarations(constructors), FunctionDeclarations(functions))
    }
}

public fun main() {
    val program = TLGrammar.parseOrThrow(
        """
    foo _:int = Foo;
    """.trimIndent()
    )
    println(program)
}
