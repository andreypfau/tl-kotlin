// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.msg

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("msg.dataDecryptedArray")
@TLCombinatorId(0xE35C4709)
public data class MsgDataDecryptedArray(
    @get:JvmName("elements")
    public val elements: List<MsgDataDecrypted>,
) {
    public companion object
}
