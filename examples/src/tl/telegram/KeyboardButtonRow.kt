// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("keyboardButtonRow")
@TLCombinatorId(0x77608B83)
public data class KeyboardButtonRow(
    @get:JvmName("buttons")
    public val buttons: List<KeyboardButton>,
) {
    public companion object
}
