// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("addedReaction")
@TLCombinatorId(0x4B04819D)
public data class AddedReaction(
    @get:JvmName("type")
    public val type: ReactionType,
    @SerialName("sender_id")
    @get:JvmName("senderId")
    public val senderId: MessageSender,
    @SerialName("is_outgoing")
    @get:JvmName("isOutgoing")
    public val isOutgoing: Boolean,
    @get:JvmName("date")
    public val date: Int,
) {
    public companion object
}
