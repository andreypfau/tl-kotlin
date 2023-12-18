package io.github.andreypfau.tl.parser.ast

import io.github.andreypfau.kotlinx.crypto.crc32.crc32

public data class TLProgram(
    val constructors: ConstructorDeclarations,
    val functions: FunctionDeclarations
)

public sealed interface TLDeclarations {
    public val declarations: List<Declaration>
}

public data class ConstructorDeclarations(
    override val declarations: List<Declaration>
) : TLDeclarations

public data class FunctionDeclarations(
    override val declarations: List<Declaration>
) : TLDeclarations

public sealed interface Declaration

public sealed interface Identifier {
    public val name: String
}

public data class CombinatorDeclaration(
    val id: FullCombinatorIdentifier,
    val optionalArgs: List<OptionalArgument>,
    val args: List<Argument>,
    val bang: Boolean,
    val resultType: ResultType
) : Declaration {
    @OptIn(ExperimentalStdlibApi::class)
    public val fullCombinatorName: FullCombinatorName
        get() {
            return when (id) {
                EmptyCombinatorName,
                is ShortCombinatorName -> {
                    val hash = crc32(toString().encodeToByteArray())
                    FullCombinatorName(id.name, hash.toHexString())
                }

                is FullCombinatorName -> id
            }
        }

    override fun toString(): String =
        "$id ${optionalArgs.joinToString("") { "$it " }}${args.joinToString("") { "$it " }}${if (bang) "!" else ""}= $resultType"
}

public sealed interface PartialApplicationDeclaration : Declaration {
    public val expression: EExpression
}

public data class PartialTypeApplicationDeclaration(
    override val expression: EExpression
) : PartialApplicationDeclaration

public data class PartialCombinatorApplicationDeclaration(
    val id: CombinatorIdentifier,
    override val expression: EExpression
) : PartialApplicationDeclaration

public sealed interface FinalizationDeclaration : Declaration {
    public val id: BoxedTypeIdentifier
}

public data class FinalDeclaration(
    override val id: BoxedTypeIdentifier
) : FinalizationDeclaration

public data class NewDeclaration(
    override val id: BoxedTypeIdentifier
) : FinalizationDeclaration

public data class EmptyDeclaration(
    override val id: BoxedTypeIdentifier
) : FinalizationDeclaration


public sealed interface FullCombinatorIdentifier {
    public val name: String
}

public sealed interface CombinatorIdentifier : FullCombinatorIdentifier {
    override val name: String
}

public data class FullCombinatorName(
    override val name: String,
    val hash: String
) : FullCombinatorIdentifier {
    override fun toString(): String = "$name#$hash"

    override fun hashCode(): Int = hash.toInt(16)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FullCombinatorName) return false
        return name == other.name && hash == other.hash
    }
}

public data class ShortCombinatorName(
    override val name: String
) : CombinatorIdentifier {
    override fun toString(): String = name
}

public data object EmptyCombinatorName : CombinatorIdentifier {
    override val name: String get() = "_"
}

public sealed interface TypeIdentifier : Identifier {
    override val name: String
}

public data class BoxedTypeIdentifier(
    override val name: String
) : TypeIdentifier {
    override fun toString(): String = name
}

public data class SimpleTypeIdentifier(
    override val name: String
) : TypeIdentifier {
    override fun toString(): String = name
}

public data object HashTypeIdentifier : TypeIdentifier {
    override val name: String get() = "#"

    override fun toString(): String = "#"
}

public sealed interface OptionalVariableIdentifier : Identifier {
    override val name: String
}

public data class VariableIdentifier(
    override val name: String
) : OptionalVariableIdentifier {
    override fun toString(): String = name
}

public data object EmptyVariableIdentifier : OptionalVariableIdentifier {
    override val name: String get() = "_"

    override fun toString(): String = "_"
}

public data class TypeExpression(
    val expression: Expression
) {
    override fun toString(): String = expression.toString()
}

public data class NatExpression(
    val expression: Expression
)

public sealed interface Expression

public data class ETypeIdentifier(
    val id: TypeIdentifier
) : Expression {
    override fun toString(): String = id.toString()
}

public data class ENat(
    val value: Int
) : Expression

public sealed interface EOperator : Expression {
    public val expression: Expression
    public val kind: String
}

public data class EPercentOperator(
    override val expression: Expression
) : EOperator {
    override val kind: String get() = "%"
}

public data class EBangOperator(
    override val expression: Expression
) : EOperator {
    override val kind: String get() = "!"
}

public data class EPlusOperator(
    override val expression: EExpression
) : EOperator {
    override val kind: String get() = "+"
}

public data class EExpression(
    val subExpressions: List<Expression>
) : Expression {
    override fun toString(): String = subExpressions.joinToString(" ")
}

public data class EMultiArg(
    val multiplicity: NatExpression?,
    val subArgs: List<Argument>
) : Expression

public data class OptionalArgument(
    val id: VariableIdentifier,
    val argType: TypeExpression
)

public data class Argument(
    val id: OptionalVariableIdentifier,
    val conditionalDef: ConditionalDefinition?,
    val argType: TypeExpression
) {
    override fun toString(): String =
        "$id:${if (conditionalDef != null) "${conditionalDef.id.name}.${conditionalDef.nat}?" else ""}$argType"
}

public data class ConditionalDefinition(
    val id: VariableIdentifier,
    val nat: Int?
)

public data class ResultType(
    val id: BoxedTypeIdentifier,
    val expression: EExpression
) {
    override fun toString(): String = "$id$expression"
}

public data class BuiltinCombinatorDeclaration(
    val id: FullCombinatorIdentifier,
    val result: BoxedTypeIdentifier
) : Declaration
