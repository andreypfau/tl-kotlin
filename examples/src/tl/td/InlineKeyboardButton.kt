// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inlineKeyboardButton")
@TLCombinatorId(0xE9D21E18)
public data class InlineKeyboardButton(
    @get:JvmName("text")
    public val text: String,
    @get:JvmName("type")
    public val type: InlineKeyboardButtonType,
) {
    public companion object
}
