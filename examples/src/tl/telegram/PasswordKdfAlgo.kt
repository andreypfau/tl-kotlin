// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface PasswordKdfAlgo {
    @Serializable
    @SerialName("passwordKdfAlgoUnknown")
    @TLCombinatorId(0xD45AB096)
    public object PasswordKdfAlgoUnknown : PasswordKdfAlgo

    @Serializable
    @SerialName("passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow")
    @TLCombinatorId(0x3A912D4A)
    public data class PasswordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow(
        @get:JvmName("salt1")
        public val salt1: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("salt2")
        public val salt2: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("g")
        public val g: Int,
        @get:JvmName("p")
        public val p: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : PasswordKdfAlgo {
        public companion object
    }

    public companion object
}
