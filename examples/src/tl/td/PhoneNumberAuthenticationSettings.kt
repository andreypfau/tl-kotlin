// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("phoneNumberAuthenticationSettings")
@TLCombinatorId(0xE29958B6)
public data class PhoneNumberAuthenticationSettings(
    @SerialName("allow_flash_call")
    @get:JvmName("allowFlashCall")
    public val allowFlashCall: Boolean,
    @SerialName("allow_missed_call")
    @get:JvmName("allowMissedCall")
    public val allowMissedCall: Boolean,
    @SerialName("is_current_phone_number")
    @get:JvmName("isCurrentPhoneNumber")
    public val isCurrentPhoneNumber: Boolean,
    @SerialName("allow_sms_retriever_api")
    @get:JvmName("allowSmsRetrieverApi")
    public val allowSmsRetrieverApi: Boolean,
    @SerialName("firebase_authentication_settings")
    @get:JvmName("firebaseAuthenticationSettings")
    public val firebaseAuthenticationSettings: FirebaseAuthenticationSettings,
    @SerialName("authentication_tokens")
    @get:JvmName("authenticationTokens")
    public val authenticationTokens: List<String>,
) {
    public companion object
}
