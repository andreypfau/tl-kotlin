// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("animation")
@TLCombinatorId(0xCC00DB3E)
public data class Animation(
    @get:JvmName("duration")
    public val duration: Int,
    @get:JvmName("width")
    public val width: Int,
    @get:JvmName("height")
    public val height: Int,
    @SerialName("file_name")
    @get:JvmName("fileName")
    public val fileName: String,
    @SerialName("mime_type")
    @get:JvmName("mimeType")
    public val mimeType: String,
    @SerialName("has_stickers")
    @get:JvmName("hasStickers")
    public val hasStickers: Boolean,
    @get:JvmName("minithumbnail")
    public val minithumbnail: Minithumbnail,
    @get:JvmName("thumbnail")
    public val thumbnail: Thumbnail,
    @get:JvmName("animation")
    public val animation: File,
) {
    public companion object
}