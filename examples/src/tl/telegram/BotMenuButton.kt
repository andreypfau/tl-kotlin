// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface BotMenuButton {
    @Serializable
    @SerialName("botMenuButtonDefault")
    @TLCombinatorId(0x7533A588)
    public object BotMenuButtonDefault : tl.telegram.BotMenuButton

    @Serializable
    @SerialName("botMenuButtonCommands")
    @TLCombinatorId(0x4258C205)
    public object BotMenuButtonCommands : tl.telegram.BotMenuButton

    @Serializable
    @SerialName("botMenuButton")
    @TLCombinatorId(0xC7B57CE6)
    public data class BotMenuButton(
        @get:JvmName("text")
        public val text: String,
        @get:JvmName("url")
        public val url: String,
    ) : tl.telegram.BotMenuButton {
        public companion object
    }

    public companion object
}
