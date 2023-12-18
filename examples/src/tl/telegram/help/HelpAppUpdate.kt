// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.help

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Document
import tl.telegram.MessageEntity

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface HelpAppUpdate {
    @Serializable
    @SerialName("help.appUpdate")
    @TLCombinatorId(0xCCBBCE30)
    public data class AppUpdate(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("can_not_skip")
        @TLConditional("flags", 0)
        @get:JvmName("canNotSkip")
        public val canNotSkip: Unit? = null,
        @get:JvmName("id")
        public val id: Int,
        @get:JvmName("version")
        public val version: String,
        @get:JvmName("text")
        public val text: String,
        @get:JvmName("entities")
        public val entities: List<MessageEntity>,
        @TLConditional("flags", 1)
        @get:JvmName("document")
        public val document: Document? = null,
        @TLConditional("flags", 2)
        @get:JvmName("url")
        public val url: String? = null,
        @TLConditional("flags", 3)
        @get:JvmName("sticker")
        public val sticker: Document? = null,
    ) : HelpAppUpdate {
        public companion object
    }

    @Serializable
    @SerialName("help.noAppUpdate")
    @TLCombinatorId(0xC45A6536)
    public object NoAppUpdate : HelpAppUpdate

    public companion object
}
