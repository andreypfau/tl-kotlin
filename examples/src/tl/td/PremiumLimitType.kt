// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class PremiumLimitType {
    @SerialName("premiumLimitTypeSupergroupCount")
    @TLCombinatorId(0xF13FF385)
    PREMIUM_LIMIT_TYPE_SUPERGROUP_COUNT,
    @SerialName("premiumLimitTypePinnedChatCount")
    @TLCombinatorId(0xC47543E1)
    PREMIUM_LIMIT_TYPE_PINNED_CHAT_COUNT,
    @SerialName("premiumLimitTypeCreatedPublicChatCount")
    @TLCombinatorId(0x1A96BEB9)
    PREMIUM_LIMIT_TYPE_CREATED_PUBLIC_CHAT_COUNT,
    @SerialName("premiumLimitTypeSavedAnimationCount")
    @TLCombinatorId(0xFED27D89)
    PREMIUM_LIMIT_TYPE_SAVED_ANIMATION_COUNT,
    @SerialName("premiumLimitTypeFavoriteStickerCount")
    @TLCombinatorId(0x2621E223)
    PREMIUM_LIMIT_TYPE_FAVORITE_STICKER_COUNT,
    @SerialName("premiumLimitTypeChatFolderCount")
    @TLCombinatorId(0x1680096E)
    PREMIUM_LIMIT_TYPE_CHAT_FOLDER_COUNT,
    @SerialName("premiumLimitTypeChatFolderChosenChatCount")
    @TLCombinatorId(0x64D14355)
    PREMIUM_LIMIT_TYPE_CHAT_FOLDER_CHOSEN_CHAT_COUNT,
    @SerialName("premiumLimitTypePinnedArchivedChatCount")
    @TLCombinatorId(0x588B2A0C)
    PREMIUM_LIMIT_TYPE_PINNED_ARCHIVED_CHAT_COUNT,
    @SerialName("premiumLimitTypeCaptionLength")
    @TLCombinatorId(0x1185D83A)
    PREMIUM_LIMIT_TYPE_CAPTION_LENGTH,
    @SerialName("premiumLimitTypeBioLength")
    @TLCombinatorId(0xBBA28603)
    PREMIUM_LIMIT_TYPE_BIO_LENGTH,
    @SerialName("premiumLimitTypeChatFolderInviteLinkCount")
    @TLCombinatorId(0xF854261A)
    PREMIUM_LIMIT_TYPE_CHAT_FOLDER_INVITE_LINK_COUNT,
    @SerialName("premiumLimitTypeShareableChatFolderCount")
    @TLCombinatorId(0x601EB4C7)
    PREMIUM_LIMIT_TYPE_SHAREABLE_CHAT_FOLDER_COUNT,
    @SerialName("premiumLimitTypeActiveStoryCount")
    @TLCombinatorId(0x8D2C269C)
    PREMIUM_LIMIT_TYPE_ACTIVE_STORY_COUNT,
    @SerialName("premiumLimitTypeWeeklySentStoryCount")
    @TLCombinatorId(0x0269C34B)
    PREMIUM_LIMIT_TYPE_WEEKLY_SENT_STORY_COUNT,
    @SerialName("premiumLimitTypeMonthlySentStoryCount")
    @TLCombinatorId(0x30D84B83)
    PREMIUM_LIMIT_TYPE_MONTHLY_SENT_STORY_COUNT,
    @SerialName("premiumLimitTypeStoryCaptionLength")
    @TLCombinatorId(0xBED53302)
    PREMIUM_LIMIT_TYPE_STORY_CAPTION_LENGTH,
    @SerialName("premiumLimitTypeStorySuggestedReactionAreaCount")
    @TLCombinatorId(0xBA42B807)
    PREMIUM_LIMIT_TYPE_STORY_SUGGESTED_REACTION_AREA_COUNT,
    ;

    public companion object
}
