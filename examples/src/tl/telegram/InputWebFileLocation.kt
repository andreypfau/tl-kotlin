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
public sealed interface InputWebFileLocation {
    @Serializable
    @SerialName("inputWebFileLocation")
    @TLCombinatorId(0xC239D686)
    public data class InputWebFileLocation(
        @get:JvmName("url")
        public val url: String,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
    ) : tl.telegram.InputWebFileLocation {
        public companion object
    }

    @Serializable
    @SerialName("inputWebFileGeoPointLocation")
    @TLCombinatorId(0x9F2221C9)
    public data class InputWebFileGeoPointLocation(
        @SerialName("geo_point")
        @get:JvmName("geoPoint")
        public val geoPoint: InputGeoPoint,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("w")
        public val w: Int,
        @get:JvmName("h")
        public val h: Int,
        @get:JvmName("zoom")
        public val zoom: Int,
        @get:JvmName("scale")
        public val scale: Int,
    ) : tl.telegram.InputWebFileLocation {
        public companion object
    }

    @Serializable
    @SerialName("inputWebFileAudioAlbumThumbLocation")
    @TLCombinatorId(0xF46FE924)
    public data class InputWebFileAudioAlbumThumbLocation(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 2)
        @get:JvmName("small")
        public val small: Unit? = null,
        @TLConditional("flags", 0)
        @get:JvmName("document")
        public val document: InputDocument? = null,
        @TLConditional("flags", 1)
        @get:JvmName("title")
        public val title: String? = null,
        @TLConditional("flags", 1)
        @get:JvmName("performer")
        public val performer: String? = null,
    ) : tl.telegram.InputWebFileLocation {
        public companion object
    }

    public companion object
}
