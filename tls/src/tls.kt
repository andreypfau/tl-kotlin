package io.github.andreypfau.tl.tls

import io.github.andreypfau.tl.serialization.annotation.TLConstructorId
import io.github.andreypfau.tl.serialization.annotation.TLFlag
import io.github.andreypfau.tl.serialization.annotation.TLNullable
import kotlinx.serialization.Serializable


/*

int#a8509bda ? = Int;
long#22076cba ? = Long;
double#2210c154 ? = Double;
string#b5286e24 ? = String;
boolFalse#bc799737 = Bool;
boolTrue#997275b5 = Bool;
vector#1cb5c415 t:Type # [ t ] = Vector t;
tuple#9770768a t:Type n:# [ t ] = Tuple t n;
vectorTotal#10133f47 t:Type total_count:int vector:%Vector t = VectorTotal t;

tls.schema_v2#3a2f9be2 version:int date:int types_num:# types:types_num*[ tls.Type ] constructor_num:# constructors:constructor_num*[ tls.Combinator ] functions_num:# functions:functions_num*[ tls.Combinator ] = tls.Schema;
tls.type#12eb4386 name:int id:string constructors_num:int flags:int arity:int params_type:long = tls.Type;
tls.combinator#5c0a1ed5 name:int id:string type_name:int left:tls.CombinatorLeft right:tls.CombinatorRight = tls.Combinator;
tls.combinatorLeftBuiltin#cd211f63 = tls.CombinatorLeft;
tls.combinatorLeft#4c12c6d9 args_num:# args:args_num*[ tls.Arg ] = tls.CombinatorLeft;
tls.combinatorRight#2c064372 value:tls.TypeExpr = tls.CombinatorRight;
tls.arg#29dfe61b id:string flags:# var_num:flags.1?int exist_var_num:flags.2?int exist_var_bit:flags.2?int type:tls.TypeExpr = tls.Arg;
tls.exprType#ecc9da78 _:tls.TypeExpr = tls.Expr;
tls.exprNat#dcb49bd8 _:tls.NatExpr = tls.Expr;
tls.natConst#8ce940b1 value:int = tls.NatExpr;
tls.natVar#4e8a14f0 dif:int var_num:int = tls.NatExpr;
tls.typeVar#0142ceae var_num:int flags:int = tls.TypeExpr;
tls.array#d9fb20de multiplicity:tls.NatExpr args_num:# args:args_num*[ tls.Arg ] = tls.TypeExpr;
tls.typeExpr#c1863d08 name:int flags:int children_num:# children:children_num*[ tls.Expr ] = tls.TypeExpr;
 */
@Serializable
sealed interface Tls {
    @Serializable
    sealed interface Schema : Tls

    @Serializable
    @TLConstructorId(0x3a2f9be2)
    data class SchemaV2(
        val version: Int,
        val date: Int,
        val types: List<Type>,
        val constructors: List<Combinator>,
        val functions: List<Combinator>
    ) : Schema, Tls

    @Serializable
    sealed interface Type : Tls

    @Serializable
    @TLConstructorId(0x12eb4386)
    data class TypeImpl(
        val name: Int,
        val id: String,
        val constructorsNum: Int,
        val flags: Int,
        val arity: Int,
        val paramsType: Long
    ) : Tls, Type {
        @OptIn(ExperimentalStdlibApi::class)
        override fun toString(): String {
            return "TypeImpl(name=${name.toHexString()}, id='$id', constructorsNum=$constructorsNum, flags=$flags, arity=$arity, paramsType=$paramsType)"
        }
    }

    @Serializable
    sealed interface Combinator : Tls

    @Serializable
    @TLConstructorId(0x5c0a1ed5)
    data class CombinatorImpl(
        val name: Int,
        val id: String,
        val typeName: Int,
        val left: CombinatorLeft,
        val right: CombinatorRight
    ) : Tls, Combinator {
        @OptIn(ExperimentalStdlibApi::class)
        override fun toString(): String {
            return "CombinatorImpl(name=${name.toHexString()}, id='$id', typeName=${typeName.toHexString()}, left=$left, right=$right)"
        }
    }

    @Serializable
    sealed interface CombinatorLeft : Tls

    @Serializable
    @TLConstructorId(0xcd211f63.toInt())
    data object CombinatorLeftBuiltin : CombinatorLeft, Tls

    @Serializable
    @TLConstructorId(0x4c12c6d9)
    data class CombinatorLeftCommon(
        val args: List<Arg>
    ) : CombinatorLeft, Tls

    @Serializable
    sealed interface CombinatorRight : Tls

    @Serializable
    @TLConstructorId(0x2c064372)
    data class CombinatorRightImpl(
        val value: TypeExpr
    ) : CombinatorRight

    @Serializable
    sealed interface Arg : Tls

    // tls.arg#29dfe61b id:string flags:# var_num:flags.1?int exist_var_num:flags.2?int exist_var_bit:flags.2?int type:tls.TypeExpr = tls.Arg;
    @Serializable
    @TLConstructorId(0x29dfe61b)
    data class ArgImpl(
        val id: String,
        @TLFlag
        val flags: Int,
        @TLNullable("flags", 1)
        val varNum: Int?,
        @TLNullable("flags", 2)
        val existVarNum: Int?,
        @TLNullable("flags", 2)
        val existVarBit: Int?,
        val type: TypeExpr
    ) : Arg

    @Serializable
    sealed interface Expr : Tls

    // tls.exprType#ecc9da78 _:tls.TypeExpr = tls.Expr;
    @Serializable
    @TLConstructorId(0xecc9da78.toInt())
    data class ExprType(
        val typeExpr: TypeExpr
    ) : Expr, Tls

    @Serializable
    @TLConstructorId(0xdcb49bd8.toInt())
    data class ExprNat(
        val natExpr: NatExpr
    ) : Expr, Tls

    @Serializable
    sealed interface NatExpr : Tls

    // tls.natConst#8ce940b1 value:int = tls.NatExpr;
    @Serializable
    @TLConstructorId(0x8ce940b1.toInt())
    data class NatConst(
        val value: Int
    ) : NatExpr

    // tls.natVar#4e8a14f0 dif:int var_num:int = tls.NatExpr;
    @Serializable
    @TLConstructorId(0x4e8a14f0)
    data class NatVar(
        val dif: Int,
        val varNum: Int
    ) : NatExpr

    @Serializable
    sealed interface TypeExpr : Tls

    @Serializable
    @TLConstructorId(0x0142ceae)
    data class TypeVar(
        val varNum: Int,
        val flags: Int
    ) : TypeExpr

    // tls.array#d9fb20de multiplicity:tls.NatExpr args_num:# args:args_num*[ tls.Arg ] = tls.TypeExpr;
    @Serializable
    @TLConstructorId(0xd9fb20de.toInt())
    data class Array(
        val multiplicity: NatExpr,
        val args: List<Arg>
    ) : TypeExpr

    // tls.typeExpr#c1863d08 name:int flags:int children_num:# children:children_num*[ tls.Expr ] = tls.TypeExpr;
    @Serializable
    @TLConstructorId(0xc1863d08.toInt())
    data class TypeExprImpl(
        val name: Int,
        val flags: Int,
        val children: List<Expr>
    ) : TypeExpr {
        @OptIn(ExperimentalStdlibApi::class)
        override fun toString(): String {
            return "TypeExprImpl(name=${name.toHexString()}, flags=$flags, children=$children)"
        }
    }
}
