// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("downloadedFileCounts")
@TLCombinatorId(0x8A572842)
public data class DownloadedFileCounts(
    @SerialName("active_count")
    @get:JvmName("activeCount")
    public val activeCount: Int,
    @SerialName("paused_count")
    @get:JvmName("pausedCount")
    public val pausedCount: Int,
    @SerialName("completed_count")
    @get:JvmName("completedCount")
    public val completedCount: Int,
) {
    public companion object
}