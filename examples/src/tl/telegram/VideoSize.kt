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
public sealed interface VideoSize {
    @Serializable
    @SerialName("videoSize")
    @TLCombinatorId(0xDE33B094)
    public data class VideoSize(
        @get:JvmName("flags")
        public val flags: Int,
        @get:JvmName("type")
        public val type: String,
        @get:JvmName("w")
        public val w: Int,
        @get:JvmName("h")
        public val h: Int,
        @get:JvmName("size")
        public val size: Int,
        @SerialName("video_start_ts")
        @TLConditional("flags", 0)
        @get:JvmName("videoStartTs")
        public val videoStartTs: Double? = null,
    ) : tl.telegram.VideoSize {
        public companion object
    }

    @Serializable
    @SerialName("videoSizeEmojiMarkup")
    @TLCombinatorId(0xF85C413C)
    public data class VideoSizeEmojiMarkup(
        @SerialName("emoji_id")
        @get:JvmName("emojiId")
        public val emojiId: Long,
        @SerialName("background_colors")
        @get:JvmName("backgroundColors")
        public val backgroundColors: List<Int>,
    ) : tl.telegram.VideoSize {
        public companion object
    }

    @Serializable
    @SerialName("videoSizeStickerMarkup")
    @TLCombinatorId(0xDA082FE)
    public data class VideoSizeStickerMarkup(
        @get:JvmName("stickerset")
        public val stickerset: InputStickerSet,
        @SerialName("sticker_id")
        @get:JvmName("stickerId")
        public val stickerId: Long,
        @SerialName("background_colors")
        @get:JvmName("backgroundColors")
        public val backgroundColors: List<Int>,
    ) : tl.telegram.VideoSize {
        public companion object
    }

    public companion object
}