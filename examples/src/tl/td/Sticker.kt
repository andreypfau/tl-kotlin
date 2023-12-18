// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("sticker")
@TLCombinatorId(0x44E12353)
public data class Sticker(
    @get:JvmName("id")
    public val id: Long,
    @SerialName("set_id")
    @get:JvmName("setId")
    public val setId: Long,
    @get:JvmName("width")
    public val width: Int,
    @get:JvmName("height")
    public val height: Int,
    @get:JvmName("emoji")
    public val emoji: String,
    @get:JvmName("format")
    public val format: StickerFormat,
    @SerialName("full_type")
    @get:JvmName("fullType")
    public val fullType: StickerFullType,
    @get:JvmName("outline")
    public val outline: List<ClosedVectorPath>,
    @get:JvmName("thumbnail")
    public val thumbnail: Thumbnail,
    @get:JvmName("sticker")
    public val sticker: File,
) {
    public companion object
}
