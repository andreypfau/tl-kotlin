// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("themeSettings")
@TLCombinatorId(0xFC4C1C12)
public data class ThemeSettings(
    @SerialName("accent_color")
    @get:JvmName("accentColor")
    public val accentColor: Int,
    @get:JvmName("background")
    public val background: Background,
    @SerialName("outgoing_message_fill")
    @get:JvmName("outgoingMessageFill")
    public val outgoingMessageFill: BackgroundFill,
    @SerialName("animate_outgoing_message_fill")
    @get:JvmName("animateOutgoingMessageFill")
    public val animateOutgoingMessageFill: Boolean,
    @SerialName("outgoing_message_accent_color")
    @get:JvmName("outgoingMessageAccentColor")
    public val outgoingMessageAccentColor: Int,
) {
    public companion object
}
