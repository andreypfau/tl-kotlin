// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("stickerSetInfo")
@TLCombinatorId(0x59718FC9)
public data class StickerSetInfo(
    @get:JvmName("id")
    public val id: Long,
    @get:JvmName("title")
    public val title: String,
    @get:JvmName("name")
    public val name: String,
    @get:JvmName("thumbnail")
    public val thumbnail: Thumbnail,
    @SerialName("thumbnail_outline")
    @get:JvmName("thumbnailOutline")
    public val thumbnailOutline: List<ClosedVectorPath>,
    @SerialName("is_installed")
    @get:JvmName("isInstalled")
    public val isInstalled: Boolean,
    @SerialName("is_archived")
    @get:JvmName("isArchived")
    public val isArchived: Boolean,
    @SerialName("is_official")
    @get:JvmName("isOfficial")
    public val isOfficial: Boolean,
    @SerialName("sticker_format")
    @get:JvmName("stickerFormat")
    public val stickerFormat: StickerFormat,
    @SerialName("sticker_type")
    @get:JvmName("stickerType")
    public val stickerType: StickerType,
    @SerialName("needs_repainting")
    @get:JvmName("needsRepainting")
    public val needsRepainting: Boolean,
    @SerialName("is_viewed")
    @get:JvmName("isViewed")
    public val isViewed: Boolean,
    @get:JvmName("size")
    public val size: Int,
    @get:JvmName("covers")
    public val covers: List<Sticker>,
) {
    public companion object
}
