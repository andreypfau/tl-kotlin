// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface MessageContent {
    @Serializable
    @SerialName("messageText")
    @TLCombinatorId(0xC13562AA)
    public data class MessageText(
        @get:JvmName("text")
        public val text: FormattedText,
        @SerialName("web_page")
        @get:JvmName("webPage")
        public val webPage: WebPage,
        @SerialName("link_preview_options")
        @get:JvmName("linkPreviewOptions")
        public val linkPreviewOptions: LinkPreviewOptions,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageAnimation")
    @TLCombinatorId(0x3EB366FC)
    public data class MessageAnimation(
        @get:JvmName("animation")
        public val animation: Animation,
        @get:JvmName("caption")
        public val caption: FormattedText,
        @SerialName("has_spoiler")
        @get:JvmName("hasSpoiler")
        public val hasSpoiler: Boolean,
        @SerialName("is_secret")
        @get:JvmName("isSecret")
        public val isSecret: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageAudio")
    @TLCombinatorId(0x107E741C)
    public data class MessageAudio(
        @get:JvmName("audio")
        public val audio: Audio,
        @get:JvmName("caption")
        public val caption: FormattedText,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageDocument")
    @TLCombinatorId(0x2394AB77)
    public data class MessageDocument(
        @get:JvmName("document")
        public val document: Document,
        @get:JvmName("caption")
        public val caption: FormattedText,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePhoto")
    @TLCombinatorId(0xE54B4AD2)
    public data class MessagePhoto(
        @get:JvmName("photo")
        public val photo: Photo,
        @get:JvmName("caption")
        public val caption: FormattedText,
        @SerialName("has_spoiler")
        @get:JvmName("hasSpoiler")
        public val hasSpoiler: Boolean,
        @SerialName("is_secret")
        @get:JvmName("isSecret")
        public val isSecret: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageExpiredPhoto")
    @TLCombinatorId(0xAC46DDF7)
    public object MessageExpiredPhoto : MessageContent

    @Serializable
    @SerialName("messageSticker")
    @TLCombinatorId(0xE5F0DCCA)
    public data class MessageSticker(
        @get:JvmName("sticker")
        public val sticker: Sticker,
        @SerialName("is_premium")
        @get:JvmName("isPremium")
        public val isPremium: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVideo")
    @TLCombinatorId(0xB63D003B)
    public data class MessageVideo(
        @get:JvmName("video")
        public val video: Video,
        @get:JvmName("caption")
        public val caption: FormattedText,
        @SerialName("has_spoiler")
        @get:JvmName("hasSpoiler")
        public val hasSpoiler: Boolean,
        @SerialName("is_secret")
        @get:JvmName("isSecret")
        public val isSecret: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageExpiredVideo")
    @TLCombinatorId(0xB7BF24C3)
    public object MessageExpiredVideo : MessageContent

    @Serializable
    @SerialName("messageVideoNote")
    @TLCombinatorId(0x396B2486)
    public data class MessageVideoNote(
        @SerialName("video_note")
        @get:JvmName("videoNote")
        public val videoNote: VideoNote,
        @SerialName("is_viewed")
        @get:JvmName("isViewed")
        public val isViewed: Boolean,
        @SerialName("is_secret")
        @get:JvmName("isSecret")
        public val isSecret: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVoiceNote")
    @TLCombinatorId(0x1F753FF5)
    public data class MessageVoiceNote(
        @SerialName("voice_note")
        @get:JvmName("voiceNote")
        public val voiceNote: VoiceNote,
        @get:JvmName("caption")
        public val caption: FormattedText,
        @SerialName("is_listened")
        @get:JvmName("isListened")
        public val isListened: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageLocation")
    @TLCombinatorId(0x121E4474)
    public data class MessageLocation(
        @get:JvmName("location")
        public val location: Location,
        @SerialName("live_period")
        @get:JvmName("livePeriod")
        public val livePeriod: Int,
        @SerialName("expires_in")
        @get:JvmName("expiresIn")
        public val expiresIn: Int,
        @get:JvmName("heading")
        public val heading: Int,
        @SerialName("proximity_alert_radius")
        @get:JvmName("proximityAlertRadius")
        public val proximityAlertRadius: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVenue")
    @TLCombinatorId(0x800F2175)
    public data class MessageVenue(
        @get:JvmName("venue")
        public val venue: Venue,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageContact")
    @TLCombinatorId(0xE1710C5A)
    public data class MessageContact(
        @get:JvmName("contact")
        public val contact: Contact,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageAnimatedEmoji")
    @TLCombinatorId(0x3621F5E2)
    public data class MessageAnimatedEmoji(
        @SerialName("animated_emoji")
        @get:JvmName("animatedEmoji")
        public val animatedEmoji: AnimatedEmoji,
        @get:JvmName("emoji")
        public val emoji: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageDice")
    @TLCombinatorId(0x42817239)
    public data class MessageDice(
        @SerialName("initial_state")
        @get:JvmName("initialState")
        public val initialState: DiceStickers,
        @SerialName("final_state")
        @get:JvmName("finalState")
        public val finalState: DiceStickers,
        @get:JvmName("emoji")
        public val emoji: String,
        @get:JvmName("value")
        public val `value`: Int,
        @SerialName("success_animation_frame_number")
        @get:JvmName("successAnimationFrameNumber")
        public val successAnimationFrameNumber: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageGame")
    @TLCombinatorId(0xFBDC6976)
    public data class MessageGame(
        @get:JvmName("game")
        public val game: Game,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePoll")
    @TLCombinatorId(0xD888B24D)
    public data class MessagePoll(
        @get:JvmName("poll")
        public val poll: Poll,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageStory")
    @TLCombinatorId(0x3329F2D4)
    public data class MessageStory(
        @SerialName("story_sender_chat_id")
        @get:JvmName("storySenderChatId")
        public val storySenderChatId: Long,
        @SerialName("story_id")
        @get:JvmName("storyId")
        public val storyId: Int,
        @SerialName("via_mention")
        @get:JvmName("viaMention")
        public val viaMention: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageInvoice")
    @TLCombinatorId(0x30C2DDD6)
    public data class MessageInvoice(
        @get:JvmName("title")
        public val title: String,
        @get:JvmName("description")
        public val description: FormattedText,
        @get:JvmName("photo")
        public val photo: Photo,
        @get:JvmName("currency")
        public val currency: String,
        @SerialName("total_amount")
        @get:JvmName("totalAmount")
        public val totalAmount: Long,
        @SerialName("start_parameter")
        @get:JvmName("startParameter")
        public val startParameter: String,
        @SerialName("is_test")
        @get:JvmName("isTest")
        public val isTest: Boolean,
        @SerialName("need_shipping_address")
        @get:JvmName("needShippingAddress")
        public val needShippingAddress: Boolean,
        @SerialName("receipt_message_id")
        @get:JvmName("receiptMessageId")
        public val receiptMessageId: Long,
        @SerialName("extended_media")
        @get:JvmName("extendedMedia")
        public val extendedMedia: MessageExtendedMedia,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageCall")
    @TLCombinatorId(0x201EDE00)
    public data class MessageCall(
        @SerialName("is_video")
        @get:JvmName("isVideo")
        public val isVideo: Boolean,
        @SerialName("discard_reason")
        @get:JvmName("discardReason")
        public val discardReason: CallDiscardReason,
        @get:JvmName("duration")
        public val duration: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVideoChatScheduled")
    @TLCombinatorId(0x916C1DB7)
    public data class MessageVideoChatScheduled(
        @SerialName("group_call_id")
        @get:JvmName("groupCallId")
        public val groupCallId: Int,
        @SerialName("start_date")
        @get:JvmName("startDate")
        public val startDate: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVideoChatStarted")
    @TLCombinatorId(0x1F114559)
    public data class MessageVideoChatStarted(
        @SerialName("group_call_id")
        @get:JvmName("groupCallId")
        public val groupCallId: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageVideoChatEnded")
    @TLCombinatorId(0x79262C57)
    public data class MessageVideoChatEnded(
        @get:JvmName("duration")
        public val duration: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageInviteVideoChatParticipants")
    @TLCombinatorId(0xA9086D0F)
    public data class MessageInviteVideoChatParticipants(
        @SerialName("group_call_id")
        @get:JvmName("groupCallId")
        public val groupCallId: Int,
        @SerialName("user_ids")
        @get:JvmName("userIds")
        public val userIds: List<Long>,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageBasicGroupChatCreate")
    @TLCombinatorId(0x2F68E71C)
    public data class MessageBasicGroupChatCreate(
        @get:JvmName("title")
        public val title: String,
        @SerialName("member_user_ids")
        @get:JvmName("memberUserIds")
        public val memberUserIds: List<Long>,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageSupergroupChatCreate")
    @TLCombinatorId(0xE61CB71B)
    public data class MessageSupergroupChatCreate(
        @get:JvmName("title")
        public val title: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatChangeTitle")
    @TLCombinatorId(0x2C99BB41)
    public data class MessageChatChangeTitle(
        @get:JvmName("title")
        public val title: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatChangePhoto")
    @TLCombinatorId(0xCF84454B)
    public data class MessageChatChangePhoto(
        @get:JvmName("photo")
        public val photo: ChatPhoto,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatDeletePhoto")
    @TLCombinatorId(0xF502A9E7)
    public object MessageChatDeletePhoto : MessageContent

    @Serializable
    @SerialName("messageChatAddMembers")
    @TLCombinatorId(0x6564FFD4)
    public data class MessageChatAddMembers(
        @SerialName("member_user_ids")
        @get:JvmName("memberUserIds")
        public val memberUserIds: List<Long>,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatJoinByLink")
    @TLCombinatorId(0x6E0F407F)
    public object MessageChatJoinByLink : MessageContent

    @Serializable
    @SerialName("messageChatJoinByRequest")
    @TLCombinatorId(0x4740CB7C)
    public object MessageChatJoinByRequest : MessageContent

    @Serializable
    @SerialName("messageChatDeleteMember")
    @TLCombinatorId(0x37E931A9)
    public data class MessageChatDeleteMember(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatUpgradeTo")
    @TLCombinatorId(0x063F549B)
    public data class MessageChatUpgradeTo(
        @SerialName("supergroup_id")
        @get:JvmName("supergroupId")
        public val supergroupId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatUpgradeFrom")
    @TLCombinatorId(0x136DAADC)
    public data class MessageChatUpgradeFrom(
        @get:JvmName("title")
        public val title: String,
        @SerialName("basic_group_id")
        @get:JvmName("basicGroupId")
        public val basicGroupId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePinMessage")
    @TLCombinatorId(0x38D55039)
    public data class MessagePinMessage(
        @SerialName("message_id")
        @get:JvmName("messageId")
        public val messageId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageScreenshotTaken")
    @TLCombinatorId(0xA2B86DAB)
    public object MessageScreenshotTaken : MessageContent

    @Serializable
    @SerialName("messageChatSetBackground")
    @TLCombinatorId(0x81819731)
    public data class MessageChatSetBackground(
        @SerialName("old_background_message_id")
        @get:JvmName("oldBackgroundMessageId")
        public val oldBackgroundMessageId: Long,
        @get:JvmName("background")
        public val background: ChatBackground,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatSetTheme")
    @TLCombinatorId(0x99AE9408)
    public data class MessageChatSetTheme(
        @SerialName("theme_name")
        @get:JvmName("themeName")
        public val themeName: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatSetMessageAutoDeleteTime")
    @TLCombinatorId(0x619E052E)
    public data class MessageChatSetMessageAutoDeleteTime(
        @SerialName("message_auto_delete_time")
        @get:JvmName("messageAutoDeleteTime")
        public val messageAutoDeleteTime: Int,
        @SerialName("from_user_id")
        @get:JvmName("fromUserId")
        public val fromUserId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageForumTopicCreated")
    @TLCombinatorId(0xB8CE47D1)
    public data class MessageForumTopicCreated(
        @get:JvmName("name")
        public val name: String,
        @get:JvmName("icon")
        public val icon: ForumTopicIcon,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageForumTopicEdited")
    @TLCombinatorId(0x00C0B780)
    public data class MessageForumTopicEdited(
        @get:JvmName("name")
        public val name: String,
        @SerialName("edit_icon_custom_emoji_id")
        @get:JvmName("editIconCustomEmojiId")
        public val editIconCustomEmojiId: Boolean,
        @SerialName("icon_custom_emoji_id")
        @get:JvmName("iconCustomEmojiId")
        public val iconCustomEmojiId: Long,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageForumTopicIsClosedToggled")
    @TLCombinatorId(0x4B578FE0)
    public data class MessageForumTopicIsClosedToggled(
        @SerialName("is_closed")
        @get:JvmName("isClosed")
        public val isClosed: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageForumTopicIsHiddenToggled")
    @TLCombinatorId(0x979393FE)
    public data class MessageForumTopicIsHiddenToggled(
        @SerialName("is_hidden")
        @get:JvmName("isHidden")
        public val isHidden: Boolean,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageSuggestProfilePhoto")
    @TLCombinatorId(0xB5611EE7)
    public data class MessageSuggestProfilePhoto(
        @get:JvmName("photo")
        public val photo: ChatPhoto,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageCustomServiceAction")
    @TLCombinatorId(0x5595C772)
    public data class MessageCustomServiceAction(
        @get:JvmName("text")
        public val text: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageGameScore")
    @TLCombinatorId(0x50299D7F)
    public data class MessageGameScore(
        @SerialName("game_message_id")
        @get:JvmName("gameMessageId")
        public val gameMessageId: Long,
        @SerialName("game_id")
        @get:JvmName("gameId")
        public val gameId: Long,
        @get:JvmName("score")
        public val score: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePaymentSuccessful")
    @TLCombinatorId(0x53D93CDC)
    public data class MessagePaymentSuccessful(
        @SerialName("invoice_chat_id")
        @get:JvmName("invoiceChatId")
        public val invoiceChatId: Long,
        @SerialName("invoice_message_id")
        @get:JvmName("invoiceMessageId")
        public val invoiceMessageId: Long,
        @get:JvmName("currency")
        public val currency: String,
        @SerialName("total_amount")
        @get:JvmName("totalAmount")
        public val totalAmount: Long,
        @SerialName("is_recurring")
        @get:JvmName("isRecurring")
        public val isRecurring: Boolean,
        @SerialName("is_first_recurring")
        @get:JvmName("isFirstRecurring")
        public val isFirstRecurring: Boolean,
        @SerialName("invoice_name")
        @get:JvmName("invoiceName")
        public val invoiceName: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePaymentSuccessfulBot")
    @TLCombinatorId(0x68E13EB9)
    public data class MessagePaymentSuccessfulBot(
        @get:JvmName("currency")
        public val currency: String,
        @SerialName("total_amount")
        @get:JvmName("totalAmount")
        public val totalAmount: Long,
        @SerialName("is_recurring")
        @get:JvmName("isRecurring")
        public val isRecurring: Boolean,
        @SerialName("is_first_recurring")
        @get:JvmName("isFirstRecurring")
        public val isFirstRecurring: Boolean,
        @SerialName("invoice_payload")
        @get:JvmName("invoicePayload")
        public val invoicePayload: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("shipping_option_id")
        @get:JvmName("shippingOptionId")
        public val shippingOptionId: String,
        @SerialName("order_info")
        @get:JvmName("orderInfo")
        public val orderInfo: OrderInfo,
        @SerialName("telegram_payment_charge_id")
        @get:JvmName("telegramPaymentChargeId")
        public val telegramPaymentChargeId: String,
        @SerialName("provider_payment_charge_id")
        @get:JvmName("providerPaymentChargeId")
        public val providerPaymentChargeId: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageGiftedPremium")
    @TLCombinatorId(0x078D1D0A)
    public data class MessageGiftedPremium(
        @SerialName("gifter_user_id")
        @get:JvmName("gifterUserId")
        public val gifterUserId: Long,
        @get:JvmName("currency")
        public val currency: String,
        @get:JvmName("amount")
        public val amount: Long,
        @get:JvmName("cryptocurrency")
        public val cryptocurrency: String,
        @SerialName("cryptocurrency_amount")
        @get:JvmName("cryptocurrencyAmount")
        public val cryptocurrencyAmount: Long,
        @SerialName("month_count")
        @get:JvmName("monthCount")
        public val monthCount: Int,
        @get:JvmName("sticker")
        public val sticker: Sticker,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePremiumGiftCode")
    @TLCombinatorId(0x7A9C468F)
    public data class MessagePremiumGiftCode(
        @SerialName("creator_id")
        @get:JvmName("creatorId")
        public val creatorId: MessageSender,
        @SerialName("is_from_giveaway")
        @get:JvmName("isFromGiveaway")
        public val isFromGiveaway: Boolean,
        @SerialName("is_unclaimed")
        @get:JvmName("isUnclaimed")
        public val isUnclaimed: Boolean,
        @SerialName("month_count")
        @get:JvmName("monthCount")
        public val monthCount: Int,
        @get:JvmName("sticker")
        public val sticker: Sticker,
        @get:JvmName("code")
        public val code: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePremiumGiveawayCreated")
    @TLCombinatorId(0x270F2C44)
    public object MessagePremiumGiveawayCreated : MessageContent

    @Serializable
    @SerialName("messagePremiumGiveaway")
    @TLCombinatorId(0x4AA0D0B0)
    public data class MessagePremiumGiveaway(
        @get:JvmName("parameters")
        public val parameters: PremiumGiveawayParameters,
        @SerialName("winner_count")
        @get:JvmName("winnerCount")
        public val winnerCount: Int,
        @SerialName("month_count")
        @get:JvmName("monthCount")
        public val monthCount: Int,
        @get:JvmName("sticker")
        public val sticker: Sticker,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageContactRegistered")
    @TLCombinatorId(0xA678FCFF)
    public object MessageContactRegistered : MessageContent

    @Serializable
    @SerialName("messageUserShared")
    @TLCombinatorId(0xD4DCB77C)
    public data class MessageUserShared(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("button_id")
        @get:JvmName("buttonId")
        public val buttonId: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageChatShared")
    @TLCombinatorId(0x22DB7091)
    public data class MessageChatShared(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
        @SerialName("button_id")
        @get:JvmName("buttonId")
        public val buttonId: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageBotWriteAccessAllowed")
    @TLCombinatorId(0x9A8AB7B4)
    public data class MessageBotWriteAccessAllowed(
        @get:JvmName("reason")
        public val reason: BotWriteAccessAllowReason,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageWebAppDataSent")
    @TLCombinatorId(0xFB033912)
    public data class MessageWebAppDataSent(
        @SerialName("button_text")
        @get:JvmName("buttonText")
        public val buttonText: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageWebAppDataReceived")
    @TLCombinatorId(0xFF7D1A15)
    public data class MessageWebAppDataReceived(
        @SerialName("button_text")
        @get:JvmName("buttonText")
        public val buttonText: String,
        @get:JvmName("data")
        public val `data`: String,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePassportDataSent")
    @TLCombinatorId(0x3CA45EF3)
    public data class MessagePassportDataSent(
        @get:JvmName("types")
        public val types: List<PassportElementType>,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messagePassportDataReceived")
    @TLCombinatorId(0xAE780EB8)
    public data class MessagePassportDataReceived(
        @get:JvmName("elements")
        public val elements: List<EncryptedPassportElement>,
        @get:JvmName("credentials")
        public val credentials: EncryptedCredentials,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageProximityAlertTriggered")
    @TLCombinatorId(0x0409F6D3)
    public data class MessageProximityAlertTriggered(
        @SerialName("traveler_id")
        @get:JvmName("travelerId")
        public val travelerId: MessageSender,
        @SerialName("watcher_id")
        @get:JvmName("watcherId")
        public val watcherId: MessageSender,
        @get:JvmName("distance")
        public val distance: Int,
    ) : MessageContent {
        public companion object
    }

    @Serializable
    @SerialName("messageUnsupported")
    @TLCombinatorId(0x93B6F585)
    public object MessageUnsupported : MessageContent

    public companion object
}