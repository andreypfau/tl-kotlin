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
public sealed interface InternalLinkType {
    @Serializable
    @SerialName("internalLinkTypeActiveSessions")
    @TLCombinatorId(0x706BBBAD)
    public object InternalLinkTypeActiveSessions : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeAttachmentMenuBot")
    @TLCombinatorId(0x644C4225)
    public data class InternalLinkTypeAttachmentMenuBot(
        @SerialName("target_chat")
        @get:JvmName("targetChat")
        public val targetChat: TargetChat,
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @get:JvmName("url")
        public val url: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeAuthenticationCode")
    @TLCombinatorId(0xF3874FF2)
    public data class InternalLinkTypeAuthenticationCode(
        @get:JvmName("code")
        public val code: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeBackground")
    @TLCombinatorId(0x0B0D2908)
    public data class InternalLinkTypeBackground(
        @SerialName("background_name")
        @get:JvmName("backgroundName")
        public val backgroundName: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeBotAddToChannel")
    @TLCombinatorId(0x538AC2C0)
    public data class InternalLinkTypeBotAddToChannel(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @SerialName("administrator_rights")
        @get:JvmName("administratorRights")
        public val administratorRights: ChatAdministratorRights,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeBotStart")
    @TLCombinatorId(0x3F985FED)
    public data class InternalLinkTypeBotStart(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @SerialName("start_parameter")
        @get:JvmName("startParameter")
        public val startParameter: String,
        @get:JvmName("autostart")
        public val autostart: Boolean,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeBotStartInGroup")
    @TLCombinatorId(0xCA0D8CCE)
    public data class InternalLinkTypeBotStartInGroup(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @SerialName("start_parameter")
        @get:JvmName("startParameter")
        public val startParameter: String,
        @SerialName("administrator_rights")
        @get:JvmName("administratorRights")
        public val administratorRights: ChatAdministratorRights,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeChangePhoneNumber")
    @TLCombinatorId(0xF0275B01)
    public object InternalLinkTypeChangePhoneNumber : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeChatBoost")
    @TLCombinatorId(0xD549FD40)
    public data class InternalLinkTypeChatBoost(
        @get:JvmName("url")
        public val url: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeChatFolderInvite")
    @TLCombinatorId(0x89B2493E)
    public data class InternalLinkTypeChatFolderInvite(
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeChatFolderSettings")
    @TLCombinatorId(0xBFFF055C)
    public object InternalLinkTypeChatFolderSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeChatInvite")
    @TLCombinatorId(0x198C3CD9)
    public data class InternalLinkTypeChatInvite(
        @SerialName("invite_link")
        @get:JvmName("inviteLink")
        public val inviteLink: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeDefaultMessageAutoDeleteTimerSettings")
    @TLCombinatorId(0x2BAAF931)
    public object InternalLinkTypeDefaultMessageAutoDeleteTimerSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeEditProfileSettings")
    @TLCombinatorId(0xC30E5066)
    public object InternalLinkTypeEditProfileSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeGame")
    @TLCombinatorId(0xF074ADCD)
    public data class InternalLinkTypeGame(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @SerialName("game_short_name")
        @get:JvmName("gameShortName")
        public val gameShortName: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeInstantView")
    @TLCombinatorId(0x69E4DF3F)
    public data class InternalLinkTypeInstantView(
        @get:JvmName("url")
        public val url: String,
        @SerialName("fallback_url")
        @get:JvmName("fallbackUrl")
        public val fallbackUrl: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeInvoice")
    @TLCombinatorId(0xF34C6DAC)
    public data class InternalLinkTypeInvoice(
        @SerialName("invoice_name")
        @get:JvmName("invoiceName")
        public val invoiceName: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeLanguagePack")
    @TLCombinatorId(0xA9870D6C)
    public data class InternalLinkTypeLanguagePack(
        @SerialName("language_pack_id")
        @get:JvmName("languagePackId")
        public val languagePackId: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeLanguageSettings")
    @TLCombinatorId(0xB019E6E6)
    public object InternalLinkTypeLanguageSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeMessage")
    @TLCombinatorId(0x3A535C52)
    public data class InternalLinkTypeMessage(
        @get:JvmName("url")
        public val url: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeMessageDraft")
    @TLCombinatorId(0x276FBAD5)
    public data class InternalLinkTypeMessageDraft(
        @get:JvmName("text")
        public val text: FormattedText,
        @SerialName("contains_link")
        @get:JvmName("containsLink")
        public val containsLink: Boolean,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePassportDataRequest")
    @TLCombinatorId(0xC50FCE81)
    public data class InternalLinkTypePassportDataRequest(
        @SerialName("bot_user_id")
        @get:JvmName("botUserId")
        public val botUserId: Long,
        @get:JvmName("scope")
        public val scope: String,
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @get:JvmName("nonce")
        public val nonce: String,
        @SerialName("callback_url")
        @get:JvmName("callbackUrl")
        public val callbackUrl: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePhoneNumberConfirmation")
    @TLCombinatorId(0x68BF6B16)
    public data class InternalLinkTypePhoneNumberConfirmation(
        @get:JvmName("hash")
        public val hash: String,
        @SerialName("phone_number")
        @get:JvmName("phoneNumber")
        public val phoneNumber: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePremiumFeatures")
    @TLCombinatorId(0x48884F49)
    public data class InternalLinkTypePremiumFeatures(
        @get:JvmName("referrer")
        public val referrer: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePremiumGiftCode")
    @TLCombinatorId(0xDE5C9892)
    public data class InternalLinkTypePremiumGiftCode(
        @get:JvmName("code")
        public val code: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePrivacyAndSecuritySettings")
    @TLCombinatorId(0xAD5F6ACF)
    public object InternalLinkTypePrivacyAndSecuritySettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeProxy")
    @TLCombinatorId(0xB1B12CEA)
    public data class InternalLinkTypeProxy(
        @get:JvmName("server")
        public val server: String,
        @get:JvmName("port")
        public val port: Int,
        @get:JvmName("type")
        public val type: ProxyType,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypePublicChat")
    @TLCombinatorId(0xA774573B)
    public data class InternalLinkTypePublicChat(
        @SerialName("chat_username")
        @get:JvmName("chatUsername")
        public val chatUsername: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeQrCodeAuthentication")
    @TLCombinatorId(0xBF121924)
    public object InternalLinkTypeQrCodeAuthentication : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeRestorePurchases")
    @TLCombinatorId(0x24203483)
    public object InternalLinkTypeRestorePurchases : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeSettings")
    @TLCombinatorId(0x177545B4)
    public object InternalLinkTypeSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeSideMenuBot")
    @TLCombinatorId(0xA260E77D)
    public data class InternalLinkTypeSideMenuBot(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @get:JvmName("url")
        public val url: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeStickerSet")
    @TLCombinatorId(0xA1464FA2)
    public data class InternalLinkTypeStickerSet(
        @SerialName("sticker_set_name")
        @get:JvmName("stickerSetName")
        public val stickerSetName: String,
        @SerialName("expect_custom_emoji")
        @get:JvmName("expectCustomEmoji")
        public val expectCustomEmoji: Boolean,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeStory")
    @TLCombinatorId(0x57BCE647)
    public data class InternalLinkTypeStory(
        @SerialName("story_sender_username")
        @get:JvmName("storySenderUsername")
        public val storySenderUsername: String,
        @SerialName("story_id")
        @get:JvmName("storyId")
        public val storyId: Int,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeTheme")
    @TLCombinatorId(0xF405F807)
    public data class InternalLinkTypeTheme(
        @SerialName("theme_name")
        @get:JvmName("themeName")
        public val themeName: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeThemeSettings")
    @TLCombinatorId(0xC14D3916)
    public object InternalLinkTypeThemeSettings : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeUnknownDeepLink")
    @TLCombinatorId(0x2549D7DB)
    public data class InternalLinkTypeUnknownDeepLink(
        @get:JvmName("link")
        public val link: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeUnsupportedProxy")
    @TLCombinatorId(0xDE399F09)
    public object InternalLinkTypeUnsupportedProxy : InternalLinkType

    @Serializable
    @SerialName("internalLinkTypeUserPhoneNumber")
    @TLCombinatorId(0x8B6D9A69)
    public data class InternalLinkTypeUserPhoneNumber(
        @SerialName("phone_number")
        @get:JvmName("phoneNumber")
        public val phoneNumber: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeUserToken")
    @TLCombinatorId(0xA8D7DB59)
    public data class InternalLinkTypeUserToken(
        @get:JvmName("token")
        public val token: String,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeVideoChat")
    @TLCombinatorId(0x8796F8B4)
    public data class InternalLinkTypeVideoChat(
        @SerialName("chat_username")
        @get:JvmName("chatUsername")
        public val chatUsername: String,
        @SerialName("invite_hash")
        @get:JvmName("inviteHash")
        public val inviteHash: String,
        @SerialName("is_live_stream")
        @get:JvmName("isLiveStream")
        public val isLiveStream: Boolean,
    ) : InternalLinkType {
        public companion object
    }

    @Serializable
    @SerialName("internalLinkTypeWebApp")
    @TLCombinatorId(0xFC98D04F)
    public data class InternalLinkTypeWebApp(
        @SerialName("bot_username")
        @get:JvmName("botUsername")
        public val botUsername: String,
        @SerialName("web_app_short_name")
        @get:JvmName("webAppShortName")
        public val webAppShortName: String,
        @SerialName("start_parameter")
        @get:JvmName("startParameter")
        public val startParameter: String,
    ) : InternalLinkType {
        public companion object
    }

    public companion object
}
