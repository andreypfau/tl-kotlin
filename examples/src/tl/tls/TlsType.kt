// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tls

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("tls.type")
@TLCombinatorId(0x12EB4386)
public data class TlsType(
    @get:JvmName("name")
    public val name: Int,
    @get:JvmName("id")
    public val id: String,
    @SerialName("constructors_num")
    @get:JvmName("constructorsNum")
    public val constructorsNum: Int,
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("arity")
    public val arity: Int,
    @SerialName("params_type")
    @get:JvmName("paramsType")
    public val paramsType: Long,
) {
    public companion object
}
