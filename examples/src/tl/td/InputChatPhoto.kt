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
public sealed interface InputChatPhoto {
    @Serializable
    @SerialName("inputChatPhotoPrevious")
    @TLCombinatorId(0x0160E9D1)
    public data class InputChatPhotoPrevious(
        @SerialName("chat_photo_id")
        @get:JvmName("chatPhotoId")
        public val chatPhotoId: Long,
    ) : InputChatPhoto {
        public companion object
    }

    @Serializable
    @SerialName("inputChatPhotoStatic")
    @TLCombinatorId(0x75F7E2B3)
    public data class InputChatPhotoStatic(
        @get:JvmName("photo")
        public val photo: InputFile,
    ) : InputChatPhoto {
        public companion object
    }

    @Serializable
    @SerialName("inputChatPhotoAnimation")
    @TLCombinatorId(0x056A3422)
    public data class InputChatPhotoAnimation(
        @get:JvmName("animation")
        public val animation: InputFile,
        @SerialName("main_frame_timestamp")
        @get:JvmName("mainFrameTimestamp")
        public val mainFrameTimestamp: Double,
    ) : InputChatPhoto {
        public companion object
    }

    @Serializable
    @SerialName("inputChatPhotoSticker")
    @TLCombinatorId(0x4E6E735D)
    public data class InputChatPhotoSticker(
        @get:JvmName("sticker")
        public val sticker: ChatPhotoSticker,
    ) : InputChatPhoto {
        public companion object
    }

    public companion object
}