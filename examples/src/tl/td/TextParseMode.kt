// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface TextParseMode {
    @Serializable
    @SerialName("textParseModeMarkdown")
    @TLCombinatorId(0x157648BF)
    public data class TextParseModeMarkdown(
        @get:JvmName("version")
        public val version: Int,
    ) : TextParseMode {
        public companion object
    }

    @Serializable
    @SerialName("textParseModeHTML")
    @TLCombinatorId(0x62F4C5F3)
    public object TextParseModeHTML : TextParseMode

    public companion object
}
