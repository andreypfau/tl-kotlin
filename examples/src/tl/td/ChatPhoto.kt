// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatPhoto")
@TLCombinatorId(0xAAB6A747)
public data class ChatPhoto(
    @get:JvmName("id")
    public val id: Long,
    @SerialName("added_date")
    @get:JvmName("addedDate")
    public val addedDate: Int,
    @get:JvmName("minithumbnail")
    public val minithumbnail: Minithumbnail,
    @get:JvmName("sizes")
    public val sizes: List<PhotoSize>,
    @get:JvmName("animation")
    public val animation: AnimatedChatPhoto,
    @SerialName("small_animation")
    @get:JvmName("smallAnimation")
    public val smallAnimation: AnimatedChatPhoto,
    @get:JvmName("sticker")
    public val sticker: ChatPhotoSticker,
) {
    public companion object
}