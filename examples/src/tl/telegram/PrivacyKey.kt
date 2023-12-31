// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class PrivacyKey {
    @SerialName("privacyKeyStatusTimestamp")
    @TLCombinatorId(0xBC2EAB30)
    PRIVACY_KEY_STATUS_TIMESTAMP,
    @SerialName("privacyKeyChatInvite")
    @TLCombinatorId(0x500E6DFA)
    PRIVACY_KEY_CHAT_INVITE,
    @SerialName("privacyKeyPhoneCall")
    @TLCombinatorId(0x3D662B7B)
    PRIVACY_KEY_PHONE_CALL,
    @SerialName("privacyKeyPhoneP2P")
    @TLCombinatorId(0x39491CC8)
    PRIVACY_KEY_PHONE_P2P,
    @SerialName("privacyKeyForwards")
    @TLCombinatorId(0x69EC56A3)
    PRIVACY_KEY_FORWARDS,
    @SerialName("privacyKeyProfilePhoto")
    @TLCombinatorId(0x96151FED)
    PRIVACY_KEY_PROFILE_PHOTO,
    @SerialName("privacyKeyPhoneNumber")
    @TLCombinatorId(0xD19AE46D)
    PRIVACY_KEY_PHONE_NUMBER,
    @SerialName("privacyKeyAddedByPhone")
    @TLCombinatorId(0x42FFD42B)
    PRIVACY_KEY_ADDED_BY_PHONE,
    @SerialName("privacyKeyVoiceMessages")
    @TLCombinatorId(0x697F414)
    PRIVACY_KEY_VOICE_MESSAGES,
    @SerialName("privacyKeyAbout")
    @TLCombinatorId(0xA486B761)
    PRIVACY_KEY_ABOUT,
    ;

    public companion object
}
