// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.daemon.torrentList")
@TLCombinatorId(0x4F1C1842)
public data class StorageDaemonTorrentList(
    @get:JvmName("torrents")
    public val torrents: List<StorageDaemonTorrent>,
) {
    public companion object
}
