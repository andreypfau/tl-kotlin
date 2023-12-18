// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("supergroupFullInfo")
@TLCombinatorId(0xC4C8CEDC)
public data class SupergroupFullInfo(
    @get:JvmName("photo")
    public val photo: ChatPhoto,
    @get:JvmName("description")
    public val description: String,
    @SerialName("member_count")
    @get:JvmName("memberCount")
    public val memberCount: Int,
    @SerialName("administrator_count")
    @get:JvmName("administratorCount")
    public val administratorCount: Int,
    @SerialName("restricted_count")
    @get:JvmName("restrictedCount")
    public val restrictedCount: Int,
    @SerialName("banned_count")
    @get:JvmName("bannedCount")
    public val bannedCount: Int,
    @SerialName("linked_chat_id")
    @get:JvmName("linkedChatId")
    public val linkedChatId: Long,
    @SerialName("slow_mode_delay")
    @get:JvmName("slowModeDelay")
    public val slowModeDelay: Int,
    @SerialName("slow_mode_delay_expires_in")
    @get:JvmName("slowModeDelayExpiresIn")
    public val slowModeDelayExpiresIn: Double,
    @SerialName("can_get_members")
    @get:JvmName("canGetMembers")
    public val canGetMembers: Boolean,
    @SerialName("has_hidden_members")
    @get:JvmName("hasHiddenMembers")
    public val hasHiddenMembers: Boolean,
    @SerialName("can_hide_members")
    @get:JvmName("canHideMembers")
    public val canHideMembers: Boolean,
    @SerialName("can_set_sticker_set")
    @get:JvmName("canSetStickerSet")
    public val canSetStickerSet: Boolean,
    @SerialName("can_set_location")
    @get:JvmName("canSetLocation")
    public val canSetLocation: Boolean,
    @SerialName("can_get_statistics")
    @get:JvmName("canGetStatistics")
    public val canGetStatistics: Boolean,
    @SerialName("can_toggle_aggressive_anti_spam")
    @get:JvmName("canToggleAggressiveAntiSpam")
    public val canToggleAggressiveAntiSpam: Boolean,
    @SerialName("is_all_history_available")
    @get:JvmName("isAllHistoryAvailable")
    public val isAllHistoryAvailable: Boolean,
    @SerialName("has_aggressive_anti_spam_enabled")
    @get:JvmName("hasAggressiveAntiSpamEnabled")
    public val hasAggressiveAntiSpamEnabled: Boolean,
    @SerialName("has_pinned_stories")
    @get:JvmName("hasPinnedStories")
    public val hasPinnedStories: Boolean,
    @SerialName("sticker_set_id")
    @get:JvmName("stickerSetId")
    public val stickerSetId: Long,
    @get:JvmName("location")
    public val location: ChatLocation,
    @SerialName("invite_link")
    @get:JvmName("inviteLink")
    public val inviteLink: ChatInviteLink,
    @SerialName("bot_commands")
    @get:JvmName("botCommands")
    public val botCommands: List<BotCommands>,
    @SerialName("upgraded_from_basic_group_id")
    @get:JvmName("upgradedFromBasicGroupId")
    public val upgradedFromBasicGroupId: Long,
    @SerialName("upgraded_from_max_message_id")
    @get:JvmName("upgradedFromMaxMessageId")
    public val upgradedFromMaxMessageId: Long,
) {
    public companion object
}
