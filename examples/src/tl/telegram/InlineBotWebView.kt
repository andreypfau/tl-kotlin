// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inlineBotWebView")
@TLCombinatorId(0xB57295D5)
public data class InlineBotWebView(
    @get:JvmName("text")
    public val text: String,
    @get:JvmName("url")
    public val url: String,
) {
    public companion object
}
