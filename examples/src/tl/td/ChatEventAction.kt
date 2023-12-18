// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface ChatEventAction {
    @Serializable
    @SerialName("chatEventMessageEdited")
    @TLCombinatorId(0xE64FF5F8)
    public data class ChatEventMessageEdited(
        @SerialName("old_message")
        @get:JvmName("oldMessage")
        public val oldMessage: Message,
        @SerialName("new_message")
        @get:JvmName("newMessage")
        public val newMessage: Message,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMessageDeleted")
    @TLCombinatorId(0x37BFCD73)
    public data class ChatEventMessageDeleted(
        @get:JvmName("message")
        public val message: Message,
        @SerialName("can_report_anti_spam_false_positive")
        @get:JvmName("canReportAntiSpamFalsePositive")
        public val canReportAntiSpamFalsePositive: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMessagePinned")
    @TLCombinatorId(0x1A26AD1A)
    public data class ChatEventMessagePinned(
        @get:JvmName("message")
        public val message: Message,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMessageUnpinned")
    @TLCombinatorId(0xE9943B17)
    public data class ChatEventMessageUnpinned(
        @get:JvmName("message")
        public val message: Message,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventPollStopped")
    @TLCombinatorId(0x77CC8BE5)
    public data class ChatEventPollStopped(
        @get:JvmName("message")
        public val message: Message,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMemberJoined")
    @TLCombinatorId(0xF1F70924)
    public object ChatEventMemberJoined : ChatEventAction

    @Serializable
    @SerialName("chatEventMemberJoinedByInviteLink")
    @TLCombinatorId(0xA9D6DD7A)
    public data class ChatEventMemberJoinedByInviteLink(
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: ChatInviteLink,
        @SerialName("via_chat_folder_invite_link")
        @get:JvmName("viaChatFolderInviteLink")
        public val viaChatFolderInviteLink: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMemberJoinedByRequest")
    @TLCombinatorId(0x9DC87E3F)
    public data class ChatEventMemberJoinedByRequest(
        @SerialName("approver_user_id")
        @get:JvmName("approverUserId")
        public val approverUserId: Long,
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: ChatInviteLink,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMemberInvited")
    @TLCombinatorId(0x38D7BFC9)
    public data class ChatEventMemberInvited(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @get:JvmName("status")
        public val status: ChatMemberStatus,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMemberLeft")
    @TLCombinatorId(0xC778400F)
    public object ChatEventMemberLeft : ChatEventAction

    @Serializable
    @SerialName("chatEventMemberPromoted")
    @TLCombinatorId(0x1F4F6861)
    public data class ChatEventMemberPromoted(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("old_status")
        @get:JvmName("oldStatus")
        public val oldStatus: ChatMemberStatus,
        @SerialName("new_status")
        @get:JvmName("newStatus")
        public val newStatus: ChatMemberStatus,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMemberRestricted")
    @TLCombinatorId(0x5F951E05)
    public data class ChatEventMemberRestricted(
        @SerialName("member_id")
        @get:JvmName("memberId")
        public val memberId: MessageSender,
        @SerialName("old_status")
        @get:JvmName("oldStatus")
        public val oldStatus: ChatMemberStatus,
        @SerialName("new_status")
        @get:JvmName("newStatus")
        public val newStatus: ChatMemberStatus,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventAvailableReactionsChanged")
    @TLCombinatorId(0x97B8E0BF)
    public data class ChatEventAvailableReactionsChanged(
        @SerialName("old_available_reactions")
        @get:JvmName("oldAvailableReactions")
        public val oldAvailableReactions: ChatAvailableReactions,
        @SerialName("new_available_reactions")
        @get:JvmName("newAvailableReactions")
        public val newAvailableReactions: ChatAvailableReactions,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventDescriptionChanged")
    @TLCombinatorId(0x0254CF1E)
    public data class ChatEventDescriptionChanged(
        @SerialName("old_description")
        @get:JvmName("oldDescription")
        public val oldDescription: String,
        @SerialName("new_description")
        @get:JvmName("newDescription")
        public val newDescription: String,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventLinkedChatChanged")
    @TLCombinatorId(0x6B2271AF)
    public data class ChatEventLinkedChatChanged(
        @SerialName("old_linked_chat_id")
        @get:JvmName("oldLinkedChatId")
        public val oldLinkedChatId: Long,
        @SerialName("new_linked_chat_id")
        @get:JvmName("newLinkedChatId")
        public val newLinkedChatId: Long,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventLocationChanged")
    @TLCombinatorId(0xE7CDFD4E)
    public data class ChatEventLocationChanged(
        @SerialName("old_location")
        @get:JvmName("oldLocation")
        public val oldLocation: ChatLocation,
        @SerialName("new_location")
        @get:JvmName("newLocation")
        public val newLocation: ChatLocation,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventMessageAutoDeleteTimeChanged")
    @TLCombinatorId(0x01083F24)
    public data class ChatEventMessageAutoDeleteTimeChanged(
        @SerialName("old_message_auto_delete_time")
        @get:JvmName("oldMessageAutoDeleteTime")
        public val oldMessageAutoDeleteTime: Int,
        @SerialName("new_message_auto_delete_time")
        @get:JvmName("newMessageAutoDeleteTime")
        public val newMessageAutoDeleteTime: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventPermissionsChanged")
    @TLCombinatorId(0xB1D337A8)
    public data class ChatEventPermissionsChanged(
        @SerialName("old_permissions")
        @get:JvmName("oldPermissions")
        public val oldPermissions: ChatPermissions,
        @SerialName("new_permissions")
        @get:JvmName("newPermissions")
        public val newPermissions: ChatPermissions,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventPhotoChanged")
    @TLCombinatorId(0xCFA062C3)
    public data class ChatEventPhotoChanged(
        @SerialName("old_photo")
        @get:JvmName("oldPhoto")
        public val oldPhoto: ChatPhoto,
        @SerialName("new_photo")
        @get:JvmName("newPhoto")
        public val newPhoto: ChatPhoto,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventSlowModeDelayChanged")
    @TLCombinatorId(0x9D763C0B)
    public data class ChatEventSlowModeDelayChanged(
        @SerialName("old_slow_mode_delay")
        @get:JvmName("oldSlowModeDelay")
        public val oldSlowModeDelay: Int,
        @SerialName("new_slow_mode_delay")
        @get:JvmName("newSlowModeDelay")
        public val newSlowModeDelay: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventStickerSetChanged")
    @TLCombinatorId(0xB5E7558F)
    public data class ChatEventStickerSetChanged(
        @SerialName("old_sticker_set_id")
        @get:JvmName("oldStickerSetId")
        public val oldStickerSetId: Long,
        @SerialName("new_sticker_set_id")
        @get:JvmName("newStickerSetId")
        public val newStickerSetId: Long,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventTitleChanged")
    @TLCombinatorId(0x43990AD2)
    public data class ChatEventTitleChanged(
        @SerialName("old_title")
        @get:JvmName("oldTitle")
        public val oldTitle: String,
        @SerialName("new_title")
        @get:JvmName("newTitle")
        public val newTitle: String,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventUsernameChanged")
    @TLCombinatorId(0x6707B56B)
    public data class ChatEventUsernameChanged(
        @SerialName("old_username")
        @get:JvmName("oldUsername")
        public val oldUsername: String,
        @SerialName("new_username")
        @get:JvmName("newUsername")
        public val newUsername: String,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventActiveUsernamesChanged")
    @TLCombinatorId(0xA611ADE6)
    public data class ChatEventActiveUsernamesChanged(
        @SerialName("old_usernames")
        @get:JvmName("oldUsernames")
        public val oldUsernames: List<String>,
        @SerialName("new_usernames")
        @get:JvmName("newUsernames")
        public val newUsernames: List<String>,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventAccentColorChanged")
    @TLCombinatorId(0x2A327E32)
    public data class ChatEventAccentColorChanged(
        @SerialName("old_accent_color_id")
        @get:JvmName("oldAccentColorId")
        public val oldAccentColorId: Int,
        @SerialName("new_accent_color_id")
        @get:JvmName("newAccentColorId")
        public val newAccentColorId: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventBackgroundCustomEmojiChanged")
    @TLCombinatorId(0xD2671E9A)
    public data class ChatEventBackgroundCustomEmojiChanged(
        @SerialName("old_background_custom_emoji_id")
        @get:JvmName("oldBackgroundCustomEmojiId")
        public val oldBackgroundCustomEmojiId: Long,
        @SerialName("new_background_custom_emoji_id")
        @get:JvmName("newBackgroundCustomEmojiId")
        public val newBackgroundCustomEmojiId: Long,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventHasProtectedContentToggled")
    @TLCombinatorId(0xF5044201)
    public data class ChatEventHasProtectedContentToggled(
        @SerialName("has_protected_content")
        @get:JvmName("hasProtectedContent")
        public val hasProtectedContent: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventInvitesToggled")
    @TLCombinatorId(0xFC45966B)
    public data class ChatEventInvitesToggled(
        @SerialName("can_invite_users")
        @get:JvmName("canInviteUsers")
        public val canInviteUsers: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventIsAllHistoryAvailableToggled")
    @TLCombinatorId(0xA0B03C15)
    public data class ChatEventIsAllHistoryAvailableToggled(
        @SerialName("is_all_history_available")
        @get:JvmName("isAllHistoryAvailable")
        public val isAllHistoryAvailable: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventHasAggressiveAntiSpamEnabledToggled")
    @TLCombinatorId(0xF8875702)
    public data class ChatEventHasAggressiveAntiSpamEnabledToggled(
        @SerialName("has_aggressive_anti_spam_enabled")
        @get:JvmName("hasAggressiveAntiSpamEnabled")
        public val hasAggressiveAntiSpamEnabled: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventSignMessagesToggled")
    @TLCombinatorId(0xB1B9281E)
    public data class ChatEventSignMessagesToggled(
        @SerialName("sign_messages")
        @get:JvmName("signMessages")
        public val signMessages: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventInviteLinkEdited")
    @TLCombinatorId(0xE4920D62)
    public data class ChatEventInviteLinkEdited(
        @SerialName("old_invite_link")
        @get:JvmName("oldInviteLink")
        public val oldInviteLink: ChatInviteLink,
        @SerialName("new_invite_link")
        @get:JvmName("newInviteLink")
        public val newInviteLink: ChatInviteLink,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventInviteLinkRevoked")
    @TLCombinatorId(0xA1DBFFE3)
    public data class ChatEventInviteLinkRevoked(
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: ChatInviteLink,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventInviteLinkDeleted")
    @TLCombinatorId(0xACDA6167)
    public data class ChatEventInviteLinkDeleted(
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: ChatInviteLink,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventVideoChatCreated")
    @TLCombinatorId(0x6CA68A7B)
    public data class ChatEventVideoChatCreated(
        @SerialName("group_call_id")
        @get:JvmName("groupCallId")
        public val groupCallId: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventVideoChatEnded")
    @TLCombinatorId(0x61286C48)
    public data class ChatEventVideoChatEnded(
        @SerialName("group_call_id")
        @get:JvmName("groupCallId")
        public val groupCallId: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventVideoChatMuteNewParticipantsToggled")
    @TLCombinatorId(0xF87507FE)
    public data class ChatEventVideoChatMuteNewParticipantsToggled(
        @SerialName("mute_new_participants")
        @get:JvmName("muteNewParticipants")
        public val muteNewParticipants: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventVideoChatParticipantIsMutedToggled")
    @TLCombinatorId(0x1F1058F7)
    public data class ChatEventVideoChatParticipantIsMutedToggled(
        @SerialName("participant_id")
        @get:JvmName("participantId")
        public val participantId: MessageSender,
        @SerialName("is_muted")
        @get:JvmName("isMuted")
        public val isMuted: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventVideoChatParticipantVolumeLevelChanged")
    @TLCombinatorId(0x436F92BE)
    public data class ChatEventVideoChatParticipantVolumeLevelChanged(
        @SerialName("participant_id")
        @get:JvmName("participantId")
        public val participantId: MessageSender,
        @SerialName("volume_level")
        @get:JvmName("volumeLevel")
        public val volumeLevel: Int,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventIsForumToggled")
    @TLCombinatorId(0x5A63D119)
    public data class ChatEventIsForumToggled(
        @SerialName("is_forum")
        @get:JvmName("isForum")
        public val isForum: Boolean,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicCreated")
    @TLCombinatorId(0x7785FB42)
    public data class ChatEventForumTopicCreated(
        @SerialName("topic_info")
        @get:JvmName("topicInfo")
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicEdited")
    @TLCombinatorId(0x60DA2C0C)
    public data class ChatEventForumTopicEdited(
        @SerialName("old_topic_info")
        @get:JvmName("oldTopicInfo")
        public val oldTopicInfo: ForumTopicInfo,
        @SerialName("new_topic_info")
        @get:JvmName("newTopicInfo")
        public val newTopicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicToggleIsClosed")
    @TLCombinatorId(0xC69E4D3A)
    public data class ChatEventForumTopicToggleIsClosed(
        @SerialName("topic_info")
        @get:JvmName("topicInfo")
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicToggleIsHidden")
    @TLCombinatorId(0xA015EF2E)
    public data class ChatEventForumTopicToggleIsHidden(
        @SerialName("topic_info")
        @get:JvmName("topicInfo")
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicDeleted")
    @TLCombinatorId(0xB08F290D)
    public data class ChatEventForumTopicDeleted(
        @SerialName("topic_info")
        @get:JvmName("topicInfo")
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    @Serializable
    @SerialName("chatEventForumTopicPinned")
    @TLCombinatorId(0x7FC523EE)
    public data class ChatEventForumTopicPinned(
        @SerialName("old_topic_info")
        @get:JvmName("oldTopicInfo")
        public val oldTopicInfo: ForumTopicInfo,
        @SerialName("new_topic_info")
        @get:JvmName("newTopicInfo")
        public val newTopicInfo: ForumTopicInfo,
    ) : ChatEventAction {
        public companion object
    }

    public companion object
}