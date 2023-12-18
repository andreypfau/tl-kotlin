// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.secret

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class SendMessageAction {
    @SerialName("sendMessageTypingAction")
    @TLCombinatorId(0x16BF744E)
    SEND_MESSAGE_TYPING_ACTION,
    @SerialName("sendMessageCancelAction")
    @TLCombinatorId(0xFD5EC8F5)
    SEND_MESSAGE_CANCEL_ACTION,
    @SerialName("sendMessageRecordVideoAction")
    @TLCombinatorId(0xA187D66F)
    SEND_MESSAGE_RECORD_VIDEO_ACTION,
    @SerialName("sendMessageUploadVideoAction")
    @TLCombinatorId(0x92042FF7)
    SEND_MESSAGE_UPLOAD_VIDEO_ACTION,
    @SerialName("sendMessageRecordAudioAction")
    @TLCombinatorId(0xD52F73F7)
    SEND_MESSAGE_RECORD_AUDIO_ACTION,
    @SerialName("sendMessageUploadAudioAction")
    @TLCombinatorId(0xE6AC8A6F)
    SEND_MESSAGE_UPLOAD_AUDIO_ACTION,
    @SerialName("sendMessageUploadPhotoAction")
    @TLCombinatorId(0x990A3C1A)
    SEND_MESSAGE_UPLOAD_PHOTO_ACTION,
    @SerialName("sendMessageUploadDocumentAction")
    @TLCombinatorId(0x8FAEE98E)
    SEND_MESSAGE_UPLOAD_DOCUMENT_ACTION,
    @SerialName("sendMessageGeoLocationAction")
    @TLCombinatorId(0x176F8BA1)
    SEND_MESSAGE_GEO_LOCATION_ACTION,
    @SerialName("sendMessageChooseContactAction")
    @TLCombinatorId(0x628CBC6F)
    SEND_MESSAGE_CHOOSE_CONTACT_ACTION,
    @SerialName("sendMessageRecordRoundAction")
    @TLCombinatorId(0x88F27FBC)
    SEND_MESSAGE_RECORD_ROUND_ACTION,
    @SerialName("sendMessageUploadRoundAction")
    @TLCombinatorId(0xBB718624)
    SEND_MESSAGE_UPLOAD_ROUND_ACTION,
    ;

    public companion object
}