// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.adnl

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
public sealed interface AdnlProxy {
    @Serializable
    @SerialName("adnl.proxy.none")
    @TLCombinatorId(0x3532487B)
    public data class None(
        @TLFixedSize(value = 32)
        @get:JvmName("id")
        public val id: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AdnlProxy {
        public companion object
    }

    @Serializable
    @SerialName("adnl.proxy.fast")
    @TLCombinatorId(0x3A8B45B5)
    public data class Fast(
        @TLFixedSize(value = 32)
        @get:JvmName("id")
        public val id: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("shared_secret")
        @get:JvmName("sharedSecret")
        public val sharedSecret: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AdnlProxy {
        public companion object
    }

    public companion object
}