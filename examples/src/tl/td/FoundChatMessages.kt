// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("foundChatMessages")
@TLCombinatorId(0x197AE424)
public data class FoundChatMessages(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @get:JvmName("messages")
    public val messages: List<Message>,
    @SerialName("next_from_message_id")
    @get:JvmName("nextFromMessageId")
    public val nextFromMessageId: Long,
) {
    public companion object
}
