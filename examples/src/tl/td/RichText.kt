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
public sealed interface RichText {
    @Serializable
    @SerialName("richTextPlain")
    @TLCombinatorId(0x1CC42966)
    public data class RichTextPlain(
        @get:JvmName("text")
        public val text: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextBold")
    @TLCombinatorId(0x63970F6C)
    public data class RichTextBold(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextItalic")
    @TLCombinatorId(0x6E77F03F)
    public data class RichTextItalic(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextUnderline")
    @TLCombinatorId(0xE00CFD8C)
    public data class RichTextUnderline(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextStrikethrough")
    @TLCombinatorId(0x2B1E6A51)
    public data class RichTextStrikethrough(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextFixed")
    @TLCombinatorId(0xB43681C7)
    public data class RichTextFixed(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextUrl")
    @TLCombinatorId(0x0500CF14)
    public data class RichTextUrl(
        @get:JvmName("text")
        public val text: RichText,
        @get:JvmName("url")
        public val url: String,
        @SerialName("is_cached")
        @get:JvmName("isCached")
        public val isCached: Boolean,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextEmailAddress")
    @TLCombinatorId(0x0262A2F7)
    public data class RichTextEmailAddress(
        @get:JvmName("text")
        public val text: RichText,
        @SerialName("email_address")
        @get:JvmName("emailAddress")
        public val emailAddress: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextSubscript")
    @TLCombinatorId(0xCC405A4C)
    public data class RichTextSubscript(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextSuperscript")
    @TLCombinatorId(0xE9377563)
    public data class RichTextSuperscript(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextMarked")
    @TLCombinatorId(0xB42ED382)
    public data class RichTextMarked(
        @get:JvmName("text")
        public val text: RichText,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextPhoneNumber")
    @TLCombinatorId(0x07A91543)
    public data class RichTextPhoneNumber(
        @get:JvmName("text")
        public val text: RichText,
        @SerialName("phone_number")
        @get:JvmName("phoneNumber")
        public val phoneNumber: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextIcon")
    @TLCombinatorId(0xA7C42B02)
    public data class RichTextIcon(
        @get:JvmName("document")
        public val document: Document,
        @get:JvmName("width")
        public val width: Int,
        @get:JvmName("height")
        public val height: Int,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextReference")
    @TLCombinatorId(0xBB9A1276)
    public data class RichTextReference(
        @get:JvmName("text")
        public val text: RichText,
        @SerialName("anchor_name")
        @get:JvmName("anchorName")
        public val anchorName: String,
        @get:JvmName("url")
        public val url: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextAnchor")
    @TLCombinatorId(0x4E7F1034)
    public data class RichTextAnchor(
        @get:JvmName("name")
        public val name: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTextAnchorLink")
    @TLCombinatorId(0xA41FD2D6)
    public data class RichTextAnchorLink(
        @get:JvmName("text")
        public val text: RichText,
        @SerialName("anchor_name")
        @get:JvmName("anchorName")
        public val anchorName: String,
        @get:JvmName("url")
        public val url: String,
    ) : RichText {
        public companion object
    }

    @Serializable
    @SerialName("richTexts")
    @TLCombinatorId(0x6232361D)
    public data class RichTexts(
        @get:JvmName("texts")
        public val texts: List<RichText>,
    ) : RichText {
        public companion object
    }

    public companion object
}