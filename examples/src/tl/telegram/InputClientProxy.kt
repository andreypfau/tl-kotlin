// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inputClientProxy")
@TLCombinatorId(0x75588B3F)
public data class InputClientProxy(
    @get:JvmName("address")
    public val address: String,
    @get:JvmName("port")
    public val port: Int,
) {
    public companion object
}
