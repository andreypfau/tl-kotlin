// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatBackground")
@TLCombinatorId(0x62891968)
public data class ChatBackground(
    @get:JvmName("background")
    public val background: Background,
    @SerialName("dark_theme_dimming")
    @get:JvmName("darkThemeDimming")
    public val darkThemeDimming: Int,
) {
    public companion object
}
