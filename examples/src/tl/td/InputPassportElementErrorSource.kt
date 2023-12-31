// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface InputPassportElementErrorSource {
    @Serializable
    @SerialName("inputPassportElementErrorSourceUnspecified")
    @TLCombinatorId(0x0FED9C6F)
    public data class InputPassportElementErrorSourceUnspecified(
        @SerialName("element_hash")
        @get:JvmName("elementHash")
        public val elementHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceDataField")
    @TLCombinatorId(0xE68FA006)
    public data class InputPassportElementErrorSourceDataField(
        @SerialName("field_name")
        @get:JvmName("fieldName")
        public val fieldName: String,
        @SerialName("data_hash")
        @get:JvmName("dataHash")
        public val dataHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceFrontSide")
    @TLCombinatorId(0x230C87BD)
    public data class InputPassportElementErrorSourceFrontSide(
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceReverseSide")
    @TLCombinatorId(0x189EFDFB)
    public data class InputPassportElementErrorSourceReverseSide(
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceSelfie")
    @TLCombinatorId(0xD1E42C98)
    public data class InputPassportElementErrorSourceSelfie(
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceTranslationFile")
    @TLCombinatorId(0x1E268A7B)
    public data class InputPassportElementErrorSourceTranslationFile(
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceTranslationFiles")
    @TLCombinatorId(0xE092BDE0)
    public data class InputPassportElementErrorSourceTranslationFiles(
        @SerialName("file_hashes")
        @get:JvmName("fileHashes")
        public val fileHashes: List<@Serializable(Base64ByteStringSerializer::class) ByteString>,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceFile")
    @TLCombinatorId(0xEE355DCB)
    public data class InputPassportElementErrorSourceFile(
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    @Serializable
    @SerialName("inputPassportElementErrorSourceFiles")
    @TLCombinatorId(0x88481638)
    public data class InputPassportElementErrorSourceFiles(
        @SerialName("file_hashes")
        @get:JvmName("fileHashes")
        public val fileHashes: List<@Serializable(Base64ByteStringSerializer::class) ByteString>,
    ) : InputPassportElementErrorSource {
        public companion object
    }

    public companion object
}
