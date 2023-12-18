// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("forumTopic")
@TLCombinatorId(0x1213ACE6)
public data class ForumTopic(
    @get:JvmName("info")
    public val info: ForumTopicInfo,
    @SerialName("last_message")
    @get:JvmName("lastMessage")
    public val lastMessage: Message,
    @SerialName("is_pinned")
    @get:JvmName("isPinned")
    public val isPinned: Boolean,
    @SerialName("unread_count")
    @get:JvmName("unreadCount")
    public val unreadCount: Int,
    @SerialName("last_read_inbox_message_id")
    @get:JvmName("lastReadInboxMessageId")
    public val lastReadInboxMessageId: Long,
    @SerialName("last_read_outbox_message_id")
    @get:JvmName("lastReadOutboxMessageId")
    public val lastReadOutboxMessageId: Long,
    @SerialName("unread_mention_count")
    @get:JvmName("unreadMentionCount")
    public val unreadMentionCount: Int,
    @SerialName("unread_reaction_count")
    @get:JvmName("unreadReactionCount")
    public val unreadReactionCount: Int,
    @SerialName("notification_settings")
    @get:JvmName("notificationSettings")
    public val notificationSettings: ChatNotificationSettings,
    @SerialName("draft_message")
    @get:JvmName("draftMessage")
    public val draftMessage: DraftMessage,
) {
    public companion object
}