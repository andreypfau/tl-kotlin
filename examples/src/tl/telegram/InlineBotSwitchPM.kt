// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inlineBotSwitchPM")
@TLCombinatorId(0x3C20629F)
public data class InlineBotSwitchPM(
    @get:JvmName("text")
    public val text: String,
    @SerialName("start_param")
    @get:JvmName("startParam")
    public val startParam: String,
) {
    public companion object
}