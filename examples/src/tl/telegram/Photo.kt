// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface Photo {
    @Serializable
    @SerialName("photoEmpty")
    @TLCombinatorId(0x2331B22D)
    public data class PhotoEmpty(
        @get:JvmName("id")
        public val id: Long,
    ) : tl.telegram.Photo {
        public companion object
    }

    @Serializable
    @SerialName("photo")
    @TLCombinatorId(0xFB197A65)
    public data class Photo(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("has_stickers")
        @TLConditional("flags", 0)
        @get:JvmName("hasStickers")
        public val hasStickers: Unit? = null,
        @get:JvmName("id")
        public val id: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @SerialName("file_reference")
        @get:JvmName("fileReference")
        public val fileReference: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("date")
        public val date: Int,
        @get:JvmName("sizes")
        public val sizes: List<PhotoSize>,
        @SerialName("video_sizes")
        @TLConditional("flags", 1)
        @get:JvmName("videoSizes")
        public val videoSizes: List<VideoSize>? = null,
        @SerialName("dc_id")
        @get:JvmName("dcId")
        public val dcId: Int,
    ) : tl.telegram.Photo {
        public companion object
    }

    public companion object
}