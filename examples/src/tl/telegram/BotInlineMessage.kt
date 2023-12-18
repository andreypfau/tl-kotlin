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
public sealed interface BotInlineMessage {
    @Serializable
    @SerialName("botInlineMessageMediaAuto")
    @TLCombinatorId(0x764CF810)
    public data class BotInlineMessageMediaAuto(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("invert_media")
        @TLConditional("flags", 3)
        @get:JvmName("invertMedia")
        public val invertMedia: Unit? = null,
        @get:JvmName("message")
        public val message: String,
        @TLConditional("flags", 1)
        @get:JvmName("entities")
        public val entities: List<MessageEntity>? = null,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageText")
    @TLCombinatorId(0x8C7F65E2)
    public data class BotInlineMessageText(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("no_webpage")
        @TLConditional("flags", 0)
        @get:JvmName("noWebpage")
        public val noWebpage: Unit? = null,
        @SerialName("invert_media")
        @TLConditional("flags", 3)
        @get:JvmName("invertMedia")
        public val invertMedia: Unit? = null,
        @get:JvmName("message")
        public val message: String,
        @TLConditional("flags", 1)
        @get:JvmName("entities")
        public val entities: List<MessageEntity>? = null,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageMediaGeo")
    @TLCombinatorId(0x51846FD)
    public data class BotInlineMessageMediaGeo(
        @get:JvmName("flags")
        public val flags: Int,
        @get:JvmName("geo")
        public val geo: GeoPoint,
        @TLConditional("flags", 0)
        @get:JvmName("heading")
        public val heading: Int? = null,
        @TLConditional("flags", 1)
        @get:JvmName("period")
        public val period: Int? = null,
        @SerialName("proximity_notification_radius")
        @TLConditional("flags", 3)
        @get:JvmName("proximityNotificationRadius")
        public val proximityNotificationRadius: Int? = null,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageMediaVenue")
    @TLCombinatorId(0x8A86659C)
    public data class BotInlineMessageMediaVenue(
        @get:JvmName("flags")
        public val flags: Int,
        @get:JvmName("geo")
        public val geo: GeoPoint,
        @get:JvmName("title")
        public val title: String,
        @get:JvmName("address")
        public val address: String,
        @get:JvmName("provider")
        public val provider: String,
        @SerialName("venue_id")
        @get:JvmName("venueId")
        public val venueId: String,
        @SerialName("venue_type")
        @get:JvmName("venueType")
        public val venueType: String,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageMediaContact")
    @TLCombinatorId(0x18D1CDC2)
    public data class BotInlineMessageMediaContact(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("phone_number")
        @get:JvmName("phoneNumber")
        public val phoneNumber: String,
        @SerialName("first_name")
        @get:JvmName("firstName")
        public val firstName: String,
        @SerialName("last_name")
        @get:JvmName("lastName")
        public val lastName: String,
        @get:JvmName("vcard")
        public val vcard: String,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageMediaInvoice")
    @TLCombinatorId(0x354A9B09)
    public data class BotInlineMessageMediaInvoice(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("shipping_address_requested")
        @TLConditional("flags", 1)
        @get:JvmName("shippingAddressRequested")
        public val shippingAddressRequested: Unit? = null,
        @TLConditional("flags", 3)
        @get:JvmName("test")
        public val test: Unit? = null,
        @get:JvmName("title")
        public val title: String,
        @get:JvmName("description")
        public val description: String,
        @TLConditional("flags", 0)
        @get:JvmName("photo")
        public val photo: WebDocument? = null,
        @get:JvmName("currency")
        public val currency: String,
        @SerialName("total_amount")
        @get:JvmName("totalAmount")
        public val totalAmount: Long,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    @Serializable
    @SerialName("botInlineMessageMediaWebPage")
    @TLCombinatorId(0x809AD9A6)
    public data class BotInlineMessageMediaWebPage(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("invert_media")
        @TLConditional("flags", 3)
        @get:JvmName("invertMedia")
        public val invertMedia: Unit? = null,
        @SerialName("force_large_media")
        @TLConditional("flags", 4)
        @get:JvmName("forceLargeMedia")
        public val forceLargeMedia: Unit? = null,
        @SerialName("force_small_media")
        @TLConditional("flags", 5)
        @get:JvmName("forceSmallMedia")
        public val forceSmallMedia: Unit? = null,
        @TLConditional("flags", 7)
        @get:JvmName("manual")
        public val manual: Unit? = null,
        @TLConditional("flags", 8)
        @get:JvmName("safe")
        public val safe: Unit? = null,
        @get:JvmName("message")
        public val message: String,
        @TLConditional("flags", 1)
        @get:JvmName("entities")
        public val entities: List<MessageEntity>? = null,
        @get:JvmName("url")
        public val url: String,
        @SerialName("reply_markup")
        @TLConditional("flags", 2)
        @get:JvmName("replyMarkup")
        public val replyMarkup: ReplyMarkup? = null,
    ) : BotInlineMessage {
        public companion object
    }

    public companion object
}
