// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messageSenders")
@TLCombinatorId(0xD6DD047D)
public data class MessageSenders(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @get:JvmName("senders")
    public val senders: List<MessageSender>,
) {
    public companion object
}
