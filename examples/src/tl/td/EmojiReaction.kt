// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("emojiReaction")
@TLCombinatorId(0x60532C5F)
public data class EmojiReaction(
    @get:JvmName("emoji")
    public val emoji: String,
    @get:JvmName("title")
    public val title: String,
    @SerialName("is_active")
    @get:JvmName("isActive")
    public val isActive: Boolean,
    @SerialName("static_icon")
    @get:JvmName("staticIcon")
    public val staticIcon: Sticker,
    @SerialName("appear_animation")
    @get:JvmName("appearAnimation")
    public val appearAnimation: Sticker,
    @SerialName("select_animation")
    @get:JvmName("selectAnimation")
    public val selectAnimation: Sticker,
    @SerialName("activate_animation")
    @get:JvmName("activateAnimation")
    public val activateAnimation: Sticker,
    @SerialName("effect_animation")
    @get:JvmName("effectAnimation")
    public val effectAnimation: Sticker,
    @SerialName("around_animation")
    @get:JvmName("aroundAnimation")
    public val aroundAnimation: Sticker,
    @SerialName("center_animation")
    @get:JvmName("centerAnimation")
    public val centerAnimation: Sticker,
) {
    public companion object
}
