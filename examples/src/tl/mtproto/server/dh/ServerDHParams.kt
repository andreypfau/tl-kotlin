// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto.server.dh

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("server_DH_params_ok")
@TLCombinatorId(0xD0E8075C)
public data class ServerDHParams(
    @TLFixedSize(value = 16)
    @get:JvmName("nonce")
    public val nonce: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("server_nonce")
    @TLFixedSize(value = 16)
    @get:JvmName("serverNonce")
    public val serverNonce: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("encrypted_answer")
    @get:JvmName("encryptedAnswer")
    public val encryptedAnswer: String,
) {
    public companion object
}
