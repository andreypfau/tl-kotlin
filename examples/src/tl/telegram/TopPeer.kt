// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("topPeer")
@TLCombinatorId(0xEDCDC05B)
public data class TopPeer(
    @get:JvmName("peer")
    public val peer: Peer,
    @get:JvmName("rating")
    public val rating: Double,
) {
    public companion object
}
