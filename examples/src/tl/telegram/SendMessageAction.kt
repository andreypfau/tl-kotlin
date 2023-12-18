// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface SendMessageAction {
    @Serializable
    @SerialName("sendMessageTypingAction")
    @TLCombinatorId(0x16BF744E)
    public object SendMessageTypingAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageCancelAction")
    @TLCombinatorId(0xFD5EC8F5)
    public object SendMessageCancelAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageRecordVideoAction")
    @TLCombinatorId(0xA187D66F)
    public object SendMessageRecordVideoAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageUploadVideoAction")
    @TLCombinatorId(0xE9763AEC)
    public data class SendMessageUploadVideoAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageRecordAudioAction")
    @TLCombinatorId(0xD52F73F7)
    public object SendMessageRecordAudioAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageUploadAudioAction")
    @TLCombinatorId(0xF351D7AB)
    public data class SendMessageUploadAudioAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageUploadPhotoAction")
    @TLCombinatorId(0xD1D34A26)
    public data class SendMessageUploadPhotoAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageUploadDocumentAction")
    @TLCombinatorId(0xAA0CD9E4)
    public data class SendMessageUploadDocumentAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageGeoLocationAction")
    @TLCombinatorId(0x176F8BA1)
    public object SendMessageGeoLocationAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageChooseContactAction")
    @TLCombinatorId(0x628CBC6F)
    public object SendMessageChooseContactAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageGamePlayAction")
    @TLCombinatorId(0xDD6A8F48)
    public object SendMessageGamePlayAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageRecordRoundAction")
    @TLCombinatorId(0x88F27FBC)
    public object SendMessageRecordRoundAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageUploadRoundAction")
    @TLCombinatorId(0x243E1C66)
    public data class SendMessageUploadRoundAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("speakingInGroupCallAction")
    @TLCombinatorId(0xD92C2285)
    public object SpeakingInGroupCallAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageHistoryImportAction")
    @TLCombinatorId(0xDBDA9246)
    public data class SendMessageHistoryImportAction(
        @get:JvmName("progress")
        public val progress: Int,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageChooseStickerAction")
    @TLCombinatorId(0xB05AC6B1)
    public object SendMessageChooseStickerAction : SendMessageAction

    @Serializable
    @SerialName("sendMessageEmojiInteraction")
    @TLCombinatorId(0x25972BCB)
    public data class SendMessageEmojiInteraction(
        @get:JvmName("emoticon")
        public val emoticon: String,
        @SerialName("msg_id")
        @get:JvmName("msgId")
        public val msgId: Int,
        @get:JvmName("interaction")
        public val interaction: DataJSON,
    ) : SendMessageAction {
        public companion object
    }

    @Serializable
    @SerialName("sendMessageEmojiInteractionSeen")
    @TLCombinatorId(0xB665902E)
    public data class SendMessageEmojiInteractionSeen(
        @get:JvmName("emoticon")
        public val emoticon: String,
    ) : SendMessageAction {
        public companion object
    }

    public companion object
}