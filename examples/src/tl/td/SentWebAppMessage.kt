// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("sentWebAppMessage")
@TLCombinatorId(0x4A24EEC0)
public data class SentWebAppMessage(
    @SerialName("inline_message_id")
    @get:JvmName("inlineMessageId")
    public val inlineMessageId: String,
) {
    public companion object
}
