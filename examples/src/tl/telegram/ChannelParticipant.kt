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
public sealed interface ChannelParticipant {
    @Serializable
    @SerialName("channelParticipant")
    @TLCombinatorId(0xC00C07C0)
    public data class ChannelParticipant(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @get:JvmName("date")
        public val date: Int,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    @Serializable
    @SerialName("channelParticipantSelf")
    @TLCombinatorId(0x35A8BFA7)
    public data class ChannelParticipantSelf(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("via_request")
        @TLConditional("flags", 0)
        @get:JvmName("viaRequest")
        public val viaRequest: Unit? = null,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("inviter_id")
        @get:JvmName("inviterId")
        public val inviterId: Long,
        @get:JvmName("date")
        public val date: Int,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    @Serializable
    @SerialName("channelParticipantCreator")
    @TLCombinatorId(0x2FE601D3)
    public data class ChannelParticipantCreator(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("admin_rights")
        @get:JvmName("adminRights")
        public val adminRights: ChatAdminRights,
        @TLConditional("flags", 0)
        @get:JvmName("rank")
        public val rank: String? = null,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    @Serializable
    @SerialName("channelParticipantAdmin")
    @TLCombinatorId(0x34C3BB53)
    public data class ChannelParticipantAdmin(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("can_edit")
        @TLConditional("flags", 0)
        @get:JvmName("canEdit")
        public val canEdit: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("self")
        public val self: Unit? = null,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("inviter_id")
        @TLConditional("flags", 1)
        @get:JvmName("inviterId")
        public val inviterId: Long? = null,
        @SerialName("promoted_by")
        @get:JvmName("promotedBy")
        public val promotedBy: Long,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("admin_rights")
        @get:JvmName("adminRights")
        public val adminRights: ChatAdminRights,
        @TLConditional("flags", 2)
        @get:JvmName("rank")
        public val rank: String? = null,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    @Serializable
    @SerialName("channelParticipantBanned")
    @TLCombinatorId(0x6DF8014E)
    public data class ChannelParticipantBanned(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("left")
        public val left: Unit? = null,
        @get:JvmName("peer")
        public val peer: Peer,
        @SerialName("kicked_by")
        @get:JvmName("kickedBy")
        public val kickedBy: Long,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("banned_rights")
        @get:JvmName("bannedRights")
        public val bannedRights: ChatBannedRights,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    @Serializable
    @SerialName("channelParticipantLeft")
    @TLCombinatorId(0x1B03F006)
    public data class ChannelParticipantLeft(
        @get:JvmName("peer")
        public val peer: Peer,
    ) : tl.telegram.ChannelParticipant {
        public companion object
    }

    public companion object
}