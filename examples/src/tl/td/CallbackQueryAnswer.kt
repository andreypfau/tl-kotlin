// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("callbackQueryAnswer")
@TLCombinatorId(0x1582685D)
public data class CallbackQueryAnswer(
    @get:JvmName("text")
    public val text: String,
    @SerialName("show_alert")
    @get:JvmName("showAlert")
    public val showAlert: Boolean,
    @get:JvmName("url")
    public val url: String,
) {
    public companion object
}