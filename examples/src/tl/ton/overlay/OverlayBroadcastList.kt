// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.overlay

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("overlay.broadcastList")
@TLCombinatorId(0x18D1DEDF)
public data class OverlayBroadcastList(
    @get:JvmName("hashes")
    public val hashes: List<@Serializable(Base64ByteStringSerializer::class) ByteString>,
) {
    public companion object
}
