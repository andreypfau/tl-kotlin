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
public sealed interface EmailAddressAuthentication {
    @Serializable
    @SerialName("emailAddressAuthenticationCode")
    @TLCombinatorId(0xC4CC19C2)
    public data class EmailAddressAuthenticationCode(
        @get:JvmName("code")
        public val code: String,
    ) : EmailAddressAuthentication {
        public companion object
    }

    @Serializable
    @SerialName("emailAddressAuthenticationAppleId")
    @TLCombinatorId(0x25C94869)
    public data class EmailAddressAuthenticationAppleId(
        @get:JvmName("token")
        public val token: String,
    ) : EmailAddressAuthentication {
        public companion object
    }

    @Serializable
    @SerialName("emailAddressAuthenticationGoogleId")
    @TLCombinatorId(0xFEDBE742)
    public data class EmailAddressAuthenticationGoogleId(
        @get:JvmName("token")
        public val token: String,
    ) : EmailAddressAuthentication {
        public companion object
    }

    public companion object
}
