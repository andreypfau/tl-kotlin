// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.overlay.broadcastfec

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("overlay.broadcastFec.partId")
@TLCombinatorId(0xA46962D0)
public data class OverlayBroadcastFecPartId(
    @SerialName("broadcast_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("broadcastHash")
    public val broadcastHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("data_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("dataHash")
    public val dataHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("seqno")
    public val seqno: Int,
) {
    public companion object
}
