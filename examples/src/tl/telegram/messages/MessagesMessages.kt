// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Chat
import tl.telegram.ForumTopic
import tl.telegram.Message
import tl.telegram.User

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface MessagesMessages {
    @Serializable
    @SerialName("messages.messages")
    @TLCombinatorId(0x8C718E87)
    public data class Messages(
        @get:JvmName("messages")
        public val messages: List<Message>,
        @get:JvmName("chats")
        public val chats: List<Chat>,
        @get:JvmName("users")
        public val users: List<User>,
    ) : MessagesMessages {
        public companion object
    }

    @Serializable
    @SerialName("messages.messagesSlice")
    @TLCombinatorId(0x3A54685E)
    public data class MessagesSlice(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 1)
        @get:JvmName("inexact")
        public val inexact: Unit? = null,
        @get:JvmName("count")
        public val count: Int,
        @SerialName("next_rate")
        @TLConditional("flags", 0)
        @get:JvmName("nextRate")
        public val nextRate: Int? = null,
        @SerialName("offset_id_offset")
        @TLConditional("flags", 2)
        @get:JvmName("offsetIdOffset")
        public val offsetIdOffset: Int? = null,
        @get:JvmName("messages")
        public val messages: List<Message>,
        @get:JvmName("chats")
        public val chats: List<Chat>,
        @get:JvmName("users")
        public val users: List<User>,
    ) : MessagesMessages {
        public companion object
    }

    @Serializable
    @SerialName("messages.channelMessages")
    @TLCombinatorId(0xC776BA4E)
    public data class ChannelMessages(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 1)
        @get:JvmName("inexact")
        public val inexact: Unit? = null,
        @get:JvmName("pts")
        public val pts: Int,
        @get:JvmName("count")
        public val count: Int,
        @SerialName("offset_id_offset")
        @TLConditional("flags", 2)
        @get:JvmName("offsetIdOffset")
        public val offsetIdOffset: Int? = null,
        @get:JvmName("messages")
        public val messages: List<Message>,
        @get:JvmName("topics")
        public val topics: List<ForumTopic>,
        @get:JvmName("chats")
        public val chats: List<Chat>,
        @get:JvmName("users")
        public val users: List<User>,
    ) : MessagesMessages {
        public companion object
    }

    @Serializable
    @SerialName("messages.messagesNotModified")
    @TLCombinatorId(0x74535F21)
    public data class MessagesNotModified(
        @get:JvmName("count")
        public val count: Int,
    ) : MessagesMessages {
        public companion object
    }

    public companion object
}
