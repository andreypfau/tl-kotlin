// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("secureData")
@TLCombinatorId(0x8AEABEC3)
public data class SecureData(
    @get:JvmName("data")
    public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("data_hash")
    @get:JvmName("dataHash")
    public val dataHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("secret")
    public val secret: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}