// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatBoostSlots")
@TLCombinatorId(0x3C7F2815)
public data class ChatBoostSlots(
    @get:JvmName("slots")
    public val slots: List<ChatBoostSlot>,
) {
    public companion object
}