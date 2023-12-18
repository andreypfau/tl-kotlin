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
public sealed interface SecurePasswordKdfAlgo {
    @Serializable
    @SerialName("securePasswordKdfAlgoUnknown")
    @TLCombinatorId(0x4A8537)
    public object SecurePasswordKdfAlgoUnknown : SecurePasswordKdfAlgo

    @Serializable
    @SerialName("securePasswordKdfAlgoPBKDF2HMACSHA512iter100000")
    @TLCombinatorId(0xBBF2DDA0)
    public data class SecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000(
        @get:JvmName("salt")
        public val salt: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : SecurePasswordKdfAlgo {
        public companion object
    }

    @Serializable
    @SerialName("securePasswordKdfAlgoSHA512")
    @TLCombinatorId(0x86471D92)
    public data class SecurePasswordKdfAlgoSHA512(
        @get:JvmName("salt")
        public val salt: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : SecurePasswordKdfAlgo {
        public companion object
    }

    public companion object
}
