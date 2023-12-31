// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.daemon.fileInfo")
@TLCombinatorId(0x7177DBFE)
public data class StorageDaemonFileInfo(
    @get:JvmName("name")
    public val name: String,
    @get:JvmName("size")
    public val size: Long,
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("priority")
    public val priority: Int,
    @SerialName("downloaded_size")
    @get:JvmName("downloadedSize")
    public val downloadedSize: Long,
) {
    public companion object
}
