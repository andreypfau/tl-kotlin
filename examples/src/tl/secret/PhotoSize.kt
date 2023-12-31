// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.secret

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface PhotoSize {
    @Serializable
    @SerialName("photoSizeEmpty")
    @TLCombinatorId(0xE17E23C)
    public data class PhotoSizeEmpty(
        @get:JvmName("type")
        public val type: String,
    ) : tl.secret.PhotoSize {
        public companion object
    }

    @Serializable
    @SerialName("photoSize")
    @TLCombinatorId(0x77BFB61B)
    public data class PhotoSize(
        @get:JvmName("type")
        public val type: String,
        @get:JvmName("location")
        public val location: FileLocation,
        @get:JvmName("w")
        public val w: Int,
        @get:JvmName("h")
        public val h: Int,
        @get:JvmName("size")
        public val size: Int,
    ) : tl.secret.PhotoSize {
        public companion object
    }

    @Serializable
    @SerialName("photoCachedSize")
    @TLCombinatorId(0xE9A734FA)
    public data class PhotoCachedSize(
        @get:JvmName("type")
        public val type: String,
        @get:JvmName("location")
        public val location: FileLocation,
        @get:JvmName("w")
        public val w: Int,
        @get:JvmName("h")
        public val h: Int,
        @get:JvmName("bytes")
        public val bytes: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.secret.PhotoSize {
        public companion object
    }

    public companion object
}
