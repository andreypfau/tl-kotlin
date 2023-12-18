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
public sealed interface ChannelAdminLogEventAction {
    @Serializable
    @SerialName("channelAdminLogEventActionChangeTitle")
    @TLCombinatorId(0xE6DFB825)
    public data class ChannelAdminLogEventActionChangeTitle(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: String,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: String,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeAbout")
    @TLCombinatorId(0x55188A2E)
    public data class ChannelAdminLogEventActionChangeAbout(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: String,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: String,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeUsername")
    @TLCombinatorId(0x6A4AFC38)
    public data class ChannelAdminLogEventActionChangeUsername(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: String,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: String,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangePhoto")
    @TLCombinatorId(0x434BD2AF)
    public data class ChannelAdminLogEventActionChangePhoto(
        @SerialName("prev_photo")
        @get:JvmName("prevPhoto")
        public val prevPhoto: Photo,
        @SerialName("new_photo")
        @get:JvmName("newPhoto")
        public val newPhoto: Photo,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleInvites")
    @TLCombinatorId(0x1B7907AE)
    public data class ChannelAdminLogEventActionToggleInvites(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleSignatures")
    @TLCombinatorId(0x26AE0971)
    public data class ChannelAdminLogEventActionToggleSignatures(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionUpdatePinned")
    @TLCombinatorId(0xE9E82C18)
    public data class ChannelAdminLogEventActionUpdatePinned(
        @get:JvmName("message")
        public val message: Message,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionEditMessage")
    @TLCombinatorId(0x709B2405)
    public data class ChannelAdminLogEventActionEditMessage(
        @SerialName("prev_message")
        @get:JvmName("prevMessage")
        public val prevMessage: Message,
        @SerialName("new_message")
        @get:JvmName("newMessage")
        public val newMessage: Message,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionDeleteMessage")
    @TLCombinatorId(0x42E047BB)
    public data class ChannelAdminLogEventActionDeleteMessage(
        @get:JvmName("message")
        public val message: Message,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantJoin")
    @TLCombinatorId(0x183040D3)
    public object ChannelAdminLogEventActionParticipantJoin : ChannelAdminLogEventAction

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantLeave")
    @TLCombinatorId(0xF89777F2)
    public object ChannelAdminLogEventActionParticipantLeave : ChannelAdminLogEventAction

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantInvite")
    @TLCombinatorId(0xE31C34D8)
    public data class ChannelAdminLogEventActionParticipantInvite(
        @get:JvmName("participant")
        public val participant: ChannelParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantToggleBan")
    @TLCombinatorId(0xE6D83D7E)
    public data class ChannelAdminLogEventActionParticipantToggleBan(
        @SerialName("prev_participant")
        @get:JvmName("prevParticipant")
        public val prevParticipant: ChannelParticipant,
        @SerialName("new_participant")
        @get:JvmName("newParticipant")
        public val newParticipant: ChannelParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantToggleAdmin")
    @TLCombinatorId(0xD5676710)
    public data class ChannelAdminLogEventActionParticipantToggleAdmin(
        @SerialName("prev_participant")
        @get:JvmName("prevParticipant")
        public val prevParticipant: ChannelParticipant,
        @SerialName("new_participant")
        @get:JvmName("newParticipant")
        public val newParticipant: ChannelParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeStickerSet")
    @TLCombinatorId(0xB1C3CAA7)
    public data class ChannelAdminLogEventActionChangeStickerSet(
        @SerialName("prev_stickerset")
        @get:JvmName("prevStickerset")
        public val prevStickerset: InputStickerSet,
        @SerialName("new_stickerset")
        @get:JvmName("newStickerset")
        public val newStickerset: InputStickerSet,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionTogglePreHistoryHidden")
    @TLCombinatorId(0x5F5C95F1)
    public data class ChannelAdminLogEventActionTogglePreHistoryHidden(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionDefaultBannedRights")
    @TLCombinatorId(0x2DF5FC0A)
    public data class ChannelAdminLogEventActionDefaultBannedRights(
        @SerialName("prev_banned_rights")
        @get:JvmName("prevBannedRights")
        public val prevBannedRights: ChatBannedRights,
        @SerialName("new_banned_rights")
        @get:JvmName("newBannedRights")
        public val newBannedRights: ChatBannedRights,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionStopPoll")
    @TLCombinatorId(0x8F079643)
    public data class ChannelAdminLogEventActionStopPoll(
        @get:JvmName("message")
        public val message: Message,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeLinkedChat")
    @TLCombinatorId(0x50C7AC8)
    public data class ChannelAdminLogEventActionChangeLinkedChat(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: Long,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Long,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeLocation")
    @TLCombinatorId(0xE6B76AE)
    public data class ChannelAdminLogEventActionChangeLocation(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: ChannelLocation,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: ChannelLocation,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleSlowMode")
    @TLCombinatorId(0x53909779)
    public data class ChannelAdminLogEventActionToggleSlowMode(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: Int,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Int,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionStartGroupCall")
    @TLCombinatorId(0x23209745)
    public data class ChannelAdminLogEventActionStartGroupCall(
        @get:JvmName("call")
        public val call: InputGroupCall,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionDiscardGroupCall")
    @TLCombinatorId(0xDB9F9140)
    public data class ChannelAdminLogEventActionDiscardGroupCall(
        @get:JvmName("call")
        public val call: InputGroupCall,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantMute")
    @TLCombinatorId(0xF92424D2)
    public data class ChannelAdminLogEventActionParticipantMute(
        @get:JvmName("participant")
        public val participant: GroupCallParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantUnmute")
    @TLCombinatorId(0xE64429C0)
    public data class ChannelAdminLogEventActionParticipantUnmute(
        @get:JvmName("participant")
        public val participant: GroupCallParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleGroupCallSetting")
    @TLCombinatorId(0x56D6A247)
    public data class ChannelAdminLogEventActionToggleGroupCallSetting(
        @SerialName("join_muted")
        @get:JvmName("joinMuted")
        public val joinMuted: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantJoinByInvite")
    @TLCombinatorId(0xFE9FC158)
    public data class ChannelAdminLogEventActionParticipantJoinByInvite(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("via_chatlist")
        @TLConditional("flags", 0)
        @get:JvmName("viaChatlist")
        public val viaChatlist: Unit? = null,
        @get:JvmName("invite")
        public val invite: ExportedChatInvite,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionExportedInviteDelete")
    @TLCombinatorId(0x5A50FCA4)
    public data class ChannelAdminLogEventActionExportedInviteDelete(
        @get:JvmName("invite")
        public val invite: ExportedChatInvite,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionExportedInviteRevoke")
    @TLCombinatorId(0x410A134E)
    public data class ChannelAdminLogEventActionExportedInviteRevoke(
        @get:JvmName("invite")
        public val invite: ExportedChatInvite,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionExportedInviteEdit")
    @TLCombinatorId(0xE90EBB59)
    public data class ChannelAdminLogEventActionExportedInviteEdit(
        @SerialName("prev_invite")
        @get:JvmName("prevInvite")
        public val prevInvite: ExportedChatInvite,
        @SerialName("new_invite")
        @get:JvmName("newInvite")
        public val newInvite: ExportedChatInvite,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantVolume")
    @TLCombinatorId(0x3E7F6847)
    public data class ChannelAdminLogEventActionParticipantVolume(
        @get:JvmName("participant")
        public val participant: GroupCallParticipant,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeHistoryTTL")
    @TLCombinatorId(0x6E941A38)
    public data class ChannelAdminLogEventActionChangeHistoryTTL(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: Int,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Int,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionParticipantJoinByRequest")
    @TLCombinatorId(0xAFB6144A)
    public data class ChannelAdminLogEventActionParticipantJoinByRequest(
        @get:JvmName("invite")
        public val invite: ExportedChatInvite,
        @SerialName("approved_by")
        @get:JvmName("approvedBy")
        public val approvedBy: Long,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleNoForwards")
    @TLCombinatorId(0xCB2AC766)
    public data class ChannelAdminLogEventActionToggleNoForwards(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionSendMessage")
    @TLCombinatorId(0x278F2868)
    public data class ChannelAdminLogEventActionSendMessage(
        @get:JvmName("message")
        public val message: Message,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeAvailableReactions")
    @TLCombinatorId(0xBE4E0EF8)
    public data class ChannelAdminLogEventActionChangeAvailableReactions(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: ChatReactions,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: ChatReactions,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeUsernames")
    @TLCombinatorId(0xF04FB3A9)
    public data class ChannelAdminLogEventActionChangeUsernames(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: List<String>,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: List<String>,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleForum")
    @TLCombinatorId(0x2CC6383)
    public data class ChannelAdminLogEventActionToggleForum(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionCreateTopic")
    @TLCombinatorId(0x58707D28)
    public data class ChannelAdminLogEventActionCreateTopic(
        @get:JvmName("topic")
        public val topic: ForumTopic,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionEditTopic")
    @TLCombinatorId(0xF06FE208)
    public data class ChannelAdminLogEventActionEditTopic(
        @SerialName("prev_topic")
        @get:JvmName("prevTopic")
        public val prevTopic: ForumTopic,
        @SerialName("new_topic")
        @get:JvmName("newTopic")
        public val newTopic: ForumTopic,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionDeleteTopic")
    @TLCombinatorId(0xAE168909)
    public data class ChannelAdminLogEventActionDeleteTopic(
        @get:JvmName("topic")
        public val topic: ForumTopic,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionPinTopic")
    @TLCombinatorId(0x5D8D353B)
    public data class ChannelAdminLogEventActionPinTopic(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("prev_topic")
        @TLConditional("flags", 0)
        @get:JvmName("prevTopic")
        public val prevTopic: ForumTopic? = null,
        @SerialName("new_topic")
        @TLConditional("flags", 1)
        @get:JvmName("newTopic")
        public val newTopic: ForumTopic? = null,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionToggleAntiSpam")
    @TLCombinatorId(0x64F36DFC)
    public data class ChannelAdminLogEventActionToggleAntiSpam(
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Boolean,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeColor")
    @TLCombinatorId(0x3C2B247B)
    public data class ChannelAdminLogEventActionChangeColor(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: Int,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Int,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    @Serializable
    @SerialName("channelAdminLogEventActionChangeBackgroundEmoji")
    @TLCombinatorId(0x445FC434)
    public data class ChannelAdminLogEventActionChangeBackgroundEmoji(
        @SerialName("prev_value")
        @get:JvmName("prevValue")
        public val prevValue: Long,
        @SerialName("new_value")
        @get:JvmName("newValue")
        public val newValue: Long,
    ) : ChannelAdminLogEventAction {
        public companion object
    }

    public companion object
}