// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("message")
@TLCombinatorId(0xB63F2EFD)
public data class Message(
    @get:JvmName("id")
    public val id: Long,
    @SerialName("sender_id")
    @get:JvmName("senderId")
    public val senderId: MessageSender,
    @SerialName("chat_id")
    @get:JvmName("chatId")
    public val chatId: Long,
    @SerialName("sending_state")
    @get:JvmName("sendingState")
    public val sendingState: MessageSendingState,
    @SerialName("scheduling_state")
    @get:JvmName("schedulingState")
    public val schedulingState: MessageSchedulingState,
    @SerialName("is_outgoing")
    @get:JvmName("isOutgoing")
    public val isOutgoing: Boolean,
    @SerialName("is_pinned")
    @get:JvmName("isPinned")
    public val isPinned: Boolean,
    @SerialName("can_be_edited")
    @get:JvmName("canBeEdited")
    public val canBeEdited: Boolean,
    @SerialName("can_be_forwarded")
    @get:JvmName("canBeForwarded")
    public val canBeForwarded: Boolean,
    @SerialName("can_be_replied_in_another_chat")
    @get:JvmName("canBeRepliedInAnotherChat")
    public val canBeRepliedInAnotherChat: Boolean,
    @SerialName("can_be_saved")
    @get:JvmName("canBeSaved")
    public val canBeSaved: Boolean,
    @SerialName("can_be_deleted_only_for_self")
    @get:JvmName("canBeDeletedOnlyForSelf")
    public val canBeDeletedOnlyForSelf: Boolean,
    @SerialName("can_be_deleted_for_all_users")
    @get:JvmName("canBeDeletedForAllUsers")
    public val canBeDeletedForAllUsers: Boolean,
    @SerialName("can_get_added_reactions")
    @get:JvmName("canGetAddedReactions")
    public val canGetAddedReactions: Boolean,
    @SerialName("can_get_statistics")
    @get:JvmName("canGetStatistics")
    public val canGetStatistics: Boolean,
    @SerialName("can_get_message_thread")
    @get:JvmName("canGetMessageThread")
    public val canGetMessageThread: Boolean,
    @SerialName("can_get_viewers")
    @get:JvmName("canGetViewers")
    public val canGetViewers: Boolean,
    @SerialName("can_get_media_timestamp_links")
    @get:JvmName("canGetMediaTimestampLinks")
    public val canGetMediaTimestampLinks: Boolean,
    @SerialName("can_report_reactions")
    @get:JvmName("canReportReactions")
    public val canReportReactions: Boolean,
    @SerialName("has_timestamped_media")
    @get:JvmName("hasTimestampedMedia")
    public val hasTimestampedMedia: Boolean,
    @SerialName("is_channel_post")
    @get:JvmName("isChannelPost")
    public val isChannelPost: Boolean,
    @SerialName("is_topic_message")
    @get:JvmName("isTopicMessage")
    public val isTopicMessage: Boolean,
    @SerialName("contains_unread_mention")
    @get:JvmName("containsUnreadMention")
    public val containsUnreadMention: Boolean,
    @get:JvmName("date")
    public val date: Int,
    @SerialName("edit_date")
    @get:JvmName("editDate")
    public val editDate: Int,
    @SerialName("forward_info")
    @get:JvmName("forwardInfo")
    public val forwardInfo: MessageForwardInfo,
    @SerialName("import_info")
    @get:JvmName("importInfo")
    public val importInfo: MessageImportInfo,
    @SerialName("interaction_info")
    @get:JvmName("interactionInfo")
    public val interactionInfo: MessageInteractionInfo,
    @SerialName("unread_reactions")
    @get:JvmName("unreadReactions")
    public val unreadReactions: List<UnreadReaction>,
    @SerialName("reply_to")
    @get:JvmName("replyTo")
    public val replyTo: MessageReplyTo,
    @SerialName("message_thread_id")
    @get:JvmName("messageThreadId")
    public val messageThreadId: Long,
    @SerialName("self_destruct_type")
    @get:JvmName("selfDestructType")
    public val selfDestructType: MessageSelfDestructType,
    @SerialName("self_destruct_in")
    @get:JvmName("selfDestructIn")
    public val selfDestructIn: Double,
    @SerialName("auto_delete_in")
    @get:JvmName("autoDeleteIn")
    public val autoDeleteIn: Double,
    @SerialName("via_bot_user_id")
    @get:JvmName("viaBotUserId")
    public val viaBotUserId: Long,
    @SerialName("author_signature")
    @get:JvmName("authorSignature")
    public val authorSignature: String,
    @SerialName("media_album_id")
    @get:JvmName("mediaAlbumId")
    public val mediaAlbumId: Long,
    @SerialName("restriction_reason")
    @get:JvmName("restrictionReason")
    public val restrictionReason: String,
    @get:JvmName("content")
    public val content: MessageContent,
    @SerialName("reply_markup")
    @get:JvmName("replyMarkup")
    public val replyMarkup: ReplyMarkup,
) {
    public companion object
}
