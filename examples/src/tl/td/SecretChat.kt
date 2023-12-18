// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("secretChat")
@TLCombinatorId(0xD7A70BCB)
public data class SecretChat(
    @get:JvmName("id")
    public val id: Int,
    @SerialName("user_id")
    @get:JvmName("userId")
    public val userId: Long,
    @get:JvmName("state")
    public val state: SecretChatState,
    @SerialName("is_outbound")
    @get:JvmName("isOutbound")
    public val isOutbound: Boolean,
    @SerialName("key_hash")
    @get:JvmName("keyHash")
    public val keyHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("layer")
    public val layer: Int,
) {
    public companion object
}