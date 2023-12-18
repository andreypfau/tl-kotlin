// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("webViewMessageSent")
@TLCombinatorId(0xC94511C)
public data class WebViewMessageSent(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("msg_id")
    @TLConditional("flags", 0)
    @get:JvmName("msgId")
    public val msgId: InputBotInlineMessageID? = null,
) {
    public companion object
}