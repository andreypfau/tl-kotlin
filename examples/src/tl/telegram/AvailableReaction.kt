// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("availableReaction")
@TLCombinatorId(0xC077EC01)
public data class AvailableReaction(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("inactive")
    public val inactive: Unit? = null,
    @TLConditional("flags", 2)
    @get:JvmName("premium")
    public val premium: Unit? = null,
    @get:JvmName("reaction")
    public val reaction: String,
    @get:JvmName("title")
    public val title: String,
    @SerialName("static_icon")
    @get:JvmName("staticIcon")
    public val staticIcon: Document,
    @SerialName("appear_animation")
    @get:JvmName("appearAnimation")
    public val appearAnimation: Document,
    @SerialName("select_animation")
    @get:JvmName("selectAnimation")
    public val selectAnimation: Document,
    @SerialName("activate_animation")
    @get:JvmName("activateAnimation")
    public val activateAnimation: Document,
    @SerialName("effect_animation")
    @get:JvmName("effectAnimation")
    public val effectAnimation: Document,
    @SerialName("around_animation")
    @TLConditional("flags", 1)
    @get:JvmName("aroundAnimation")
    public val aroundAnimation: Document? = null,
    @SerialName("center_icon")
    @TLConditional("flags", 1)
    @get:JvmName("centerIcon")
    public val centerIcon: Document? = null,
) {
    public companion object
}
