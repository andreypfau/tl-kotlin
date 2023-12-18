// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface PrivateKey {
    @Serializable
    @SerialName("pk.unenc")
    @TLCombinatorId(0xB1DB9B30)
    public data class Unenc(
        @get:JvmName("data")
        public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : PrivateKey {
        public companion object
    }

    @Serializable
    @SerialName("pk.ed25519")
    @TLCombinatorId(0x49682317)
    public data class Ed25519(
        @TLFixedSize(value = 32)
        @get:JvmName("key")
        public val key: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : PrivateKey {
        public companion object
    }

    @Serializable
    @SerialName("pk.aes")
    @TLCombinatorId(0xA5E85137)
    public data class Aes(
        @TLFixedSize(value = 32)
        @get:JvmName("key")
        public val key: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : PrivateKey {
        public companion object
    }

    @Serializable
    @SerialName("pk.overlay")
    @TLCombinatorId(0x37A5F65B)
    public data class Overlay(
        @get:JvmName("name")
        public val name: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : PrivateKey {
        public companion object
    }

    public companion object
}
