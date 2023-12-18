// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.overlay.broadcast

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("overlay.broadcast.toSign")
@TLCombinatorId(0xFA374E7C)
public data class OverlayBroadcastToSign(
    @TLFixedSize(value = 32)
    @get:JvmName("hash")
    public val hash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("date")
    public val date: Int,
) {
    public companion object
}
