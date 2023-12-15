package io.github.andreypfau.tl.parser.ast

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
) : Declaration

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

public sealed interface FinalizationDeclaration :Declaration {
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
) : FullCombinatorIdentifier

public data class ShortCombinatorName(
    override val name: String
) : CombinatorIdentifier

public data object EmptyCombinatorName : CombinatorIdentifier {
    override val name: String get() = "_"
}

public sealed interface TypeIdentifier : Identifier {
    override val name: String
}

public data class BoxedTypeIdentifier(
    override val name: String
) : TypeIdentifier

public data class SimpleTypeIdentifier(
    override val name: String
) : TypeIdentifier

public data object HashTypeIdentifier : TypeIdentifier {
    override val name: String get() = "#"
}

public sealed interface OptionalVariableIdentifier : Identifier {
    override val name: String
}

public data class VariableIdentifier(
    override val name: String
) : OptionalVariableIdentifier

public data object EmptyVariableIdentifier : OptionalVariableIdentifier {
    override val name: String get() = "_"
}

public data class TypeExpression(
    val expression: Expression
)

public data class NatExpression(
    val expression: Expression
)

public sealed interface Expression

public data class ETypeIdentifier(
    val id: TypeIdentifier
) : Expression

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
) : Expression

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
)

public data class ConditionalDefinition(
    val id: VariableIdentifier,
    val nat: Int?
)

public data class ResultType(
    val id: BoxedTypeIdentifier,
    val expression: EExpression
)

public data class BuiltinCombinatorDeclaration(
    val id: FullCombinatorIdentifier,
    val result: BoxedTypeIdentifier
) : Declaration
