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
public sealed interface InlineQueryResultsButtonType {
    @Serializable
    @SerialName("inlineQueryResultsButtonTypeStartBot")
    @TLCombinatorId(0xFE9AF0D5)
    public data class InlineQueryResultsButtonTypeStartBot(
        @get:JvmName("parameter")
        public val parameter: String,
    ) : InlineQueryResultsButtonType {
        public companion object
    }

    @Serializable
    @SerialName("inlineQueryResultsButtonTypeWebApp")
    @TLCombinatorId(0xB8A16362)
    public data class InlineQueryResultsButtonTypeWebApp(
        @get:JvmName("url")
        public val url: String,
    ) : InlineQueryResultsButtonType {
        public companion object
    }

    public companion object
}