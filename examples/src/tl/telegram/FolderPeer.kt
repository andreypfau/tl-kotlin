// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("folderPeer")
@TLCombinatorId(0xE9BAA668)
public data class FolderPeer(
    @get:JvmName("peer")
    public val peer: Peer,
    @SerialName("folder_id")
    @get:JvmName("folderId")
    public val folderId: Int,
) {
    public companion object
}
