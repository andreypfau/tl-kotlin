// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("resPQ")
@TLCombinatorId(0x05162463)
public data class ResPQ(
    @TLFixedSize(value = 16)
    @get:JvmName("nonce")
    public val nonce: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("server_nonce")
    @TLFixedSize(value = 16)
    @get:JvmName("serverNonce")
    public val serverNonce: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("pq")
    public val pq: String,
    @SerialName("server_public_key_fingerprints")
    @get:JvmName("serverPublicKeyFingerprints")
    public val serverPublicKeyFingerprints: List<Long>,
) {
    public companion object
}
