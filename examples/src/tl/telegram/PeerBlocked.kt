// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("peerBlocked")
@TLCombinatorId(0xE8FD8014)
public data class PeerBlocked(
    @SerialName("peer_id")
    @get:JvmName("peerId")
    public val peerId: Peer,
    @get:JvmName("date")
    public val date: Int,
) {
    public companion object
}
