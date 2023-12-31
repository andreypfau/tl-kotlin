// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.auth

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AuthSentCodeType {
    @Serializable
    @SerialName("auth.sentCodeTypeApp")
    @TLCombinatorId(0x3DBB5986)
    public data class SentCodeTypeApp(
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeSms")
    @TLCombinatorId(0xC000BBA2)
    public data class SentCodeTypeSms(
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeCall")
    @TLCombinatorId(0x5353E5A7)
    public data class SentCodeTypeCall(
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeFlashCall")
    @TLCombinatorId(0xAB03C6D9)
    public data class SentCodeTypeFlashCall(
        @get:JvmName("pattern")
        public val pattern: String,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeMissedCall")
    @TLCombinatorId(0x82006484)
    public data class SentCodeTypeMissedCall(
        @get:JvmName("prefix")
        public val prefix: String,
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeEmailCode")
    @TLCombinatorId(0xF450F59B)
    public data class SentCodeTypeEmailCode(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("apple_signin_allowed")
        @TLConditional("flags", 0)
        @get:JvmName("appleSigninAllowed")
        public val appleSigninAllowed: Unit? = null,
        @SerialName("google_signin_allowed")
        @TLConditional("flags", 1)
        @get:JvmName("googleSigninAllowed")
        public val googleSigninAllowed: Unit? = null,
        @SerialName("email_pattern")
        @get:JvmName("emailPattern")
        public val emailPattern: String,
        @get:JvmName("length")
        public val length: Int,
        @SerialName("reset_available_period")
        @TLConditional("flags", 3)
        @get:JvmName("resetAvailablePeriod")
        public val resetAvailablePeriod: Int? = null,
        @SerialName("reset_pending_date")
        @TLConditional("flags", 4)
        @get:JvmName("resetPendingDate")
        public val resetPendingDate: Int? = null,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeSetUpEmailRequired")
    @TLCombinatorId(0xA5491DEA)
    public data class SentCodeTypeSetUpEmailRequired(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("apple_signin_allowed")
        @TLConditional("flags", 0)
        @get:JvmName("appleSigninAllowed")
        public val appleSigninAllowed: Unit? = null,
        @SerialName("google_signin_allowed")
        @TLConditional("flags", 1)
        @get:JvmName("googleSigninAllowed")
        public val googleSigninAllowed: Unit? = null,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeFragmentSms")
    @TLCombinatorId(0xD9565C39)
    public data class SentCodeTypeFragmentSms(
        @get:JvmName("url")
        public val url: String,
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    @Serializable
    @SerialName("auth.sentCodeTypeFirebaseSms")
    @TLCombinatorId(0xE57B1432)
    public data class SentCodeTypeFirebaseSms(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("nonce")
        public val nonce: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
        @TLConditional("flags", 1)
        @get:JvmName("receipt")
        public val receipt: String? = null,
        @SerialName("push_timeout")
        @TLConditional("flags", 1)
        @get:JvmName("pushTimeout")
        public val pushTimeout: Int? = null,
        @get:JvmName("length")
        public val length: Int,
    ) : AuthSentCodeType {
        public companion object
    }

    public companion object
}
