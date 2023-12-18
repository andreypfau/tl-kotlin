// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface ChannelMessagesFilter {
    @Serializable
    @SerialName("channelMessagesFilterEmpty")
    @TLCombinatorId(0x94D42EE7)
    public object ChannelMessagesFilterEmpty : tl.telegram.ChannelMessagesFilter

    @Serializable
    @SerialName("channelMessagesFilter")
    @TLCombinatorId(0xCD77D957)
    public data class ChannelMessagesFilter(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("exclude_new_messages")
        @TLConditional("flags", 1)
        @get:JvmName("excludeNewMessages")
        public val excludeNewMessages: Unit? = null,
        @get:JvmName("ranges")
        public val ranges: List<MessageRange>,
    ) : tl.telegram.ChannelMessagesFilter {
        public companion object
    }

    public companion object
}
