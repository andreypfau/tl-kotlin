// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.Message
import tl.telegram.User

@Serializable
@SerialName("messages.discussionMessage")
@TLCombinatorId(0xA6341782)
public data class MessagesDiscussionMessage(
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("messages")
    public val messages: List<Message>,
    @SerialName("max_id")
    @TLConditional("flags", 0)
    @get:JvmName("maxId")
    public val maxId: Int? = null,
    @SerialName("read_inbox_max_id")
    @TLConditional("flags", 1)
    @get:JvmName("readInboxMaxId")
    public val readInboxMaxId: Int? = null,
    @SerialName("read_outbox_max_id")
    @TLConditional("flags", 2)
    @get:JvmName("readOutboxMaxId")
    public val readOutboxMaxId: Int? = null,
    @SerialName("unread_count")
    @get:JvmName("unreadCount")
    public val unreadCount: Int,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}