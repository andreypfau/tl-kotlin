// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface WallPaper {
    @Serializable
    @SerialName("wallPaper")
    @TLCombinatorId(0xA437C3ED)
    public data class WallPaper(
        @get:JvmName("id")
        public val id: Long,
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("creator")
        public val creator: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("default")
        public val default: Unit? = null,
        @TLConditional("flags", 3)
        @get:JvmName("pattern")
        public val pattern: Unit? = null,
        @TLConditional("flags", 4)
        @get:JvmName("dark")
        public val dark: Unit? = null,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("slug")
        public val slug: String,
        @get:JvmName("document")
        public val document: Document,
        @TLConditional("flags", 2)
        @get:JvmName("settings")
        public val settings: WallPaperSettings? = null,
    ) : tl.telegram.WallPaper {
        public companion object
    }

    @Serializable
    @SerialName("wallPaperNoFile")
    @TLCombinatorId(0xE0804116)
    public data class WallPaperNoFile(
        @get:JvmName("id")
        public val id: Long,
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 1)
        @get:JvmName("default")
        public val default: Unit? = null,
        @TLConditional("flags", 4)
        @get:JvmName("dark")
        public val dark: Unit? = null,
        @TLConditional("flags", 2)
        @get:JvmName("settings")
        public val settings: WallPaperSettings? = null,
    ) : tl.telegram.WallPaper {
        public companion object
    }

    public companion object
}
