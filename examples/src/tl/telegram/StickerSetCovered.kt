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
public sealed interface StickerSetCovered {
    @Serializable
    @SerialName("stickerSetCovered")
    @TLCombinatorId(0x6410A5D2)
    public data class StickerSetCovered(
        @get:JvmName("set")
        public val `set`: StickerSet,
        @get:JvmName("cover")
        public val cover: Document,
    ) : tl.telegram.StickerSetCovered {
        public companion object
    }

    @Serializable
    @SerialName("stickerSetMultiCovered")
    @TLCombinatorId(0x3407E51B)
    public data class StickerSetMultiCovered(
        @get:JvmName("set")
        public val `set`: StickerSet,
        @get:JvmName("covers")
        public val covers: List<Document>,
    ) : tl.telegram.StickerSetCovered {
        public companion object
    }

    @Serializable
    @SerialName("stickerSetFullCovered")
    @TLCombinatorId(0x40D13C0E)
    public data class StickerSetFullCovered(
        @get:JvmName("set")
        public val `set`: StickerSet,
        @get:JvmName("packs")
        public val packs: List<StickerPack>,
        @get:JvmName("keywords")
        public val keywords: List<StickerKeyword>,
        @get:JvmName("documents")
        public val documents: List<Document>,
    ) : tl.telegram.StickerSetCovered {
        public companion object
    }

    @Serializable
    @SerialName("stickerSetNoCovered")
    @TLCombinatorId(0x77B15D1C)
    public data class StickerSetNoCovered(
        @get:JvmName("set")
        public val `set`: StickerSet,
    ) : tl.telegram.StickerSetCovered {
        public companion object
    }

    public companion object
}
