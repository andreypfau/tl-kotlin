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
public sealed interface InputFile {
    @Serializable
    @SerialName("inputFileId")
    @TLCombinatorId(0x6AA08B0D)
    public data class InputFileId(
        @get:JvmName("id")
        public val id: Int,
    ) : InputFile {
        public companion object
    }

    @Serializable
    @SerialName("inputFileRemote")
    @TLCombinatorId(0xF9968B3E)
    public data class InputFileRemote(
        @get:JvmName("id")
        public val id: String,
    ) : InputFile {
        public companion object
    }

    @Serializable
    @SerialName("inputFileLocal")
    @TLCombinatorId(0x7A8C8AC7)
    public data class InputFileLocal(
        @get:JvmName("path")
        public val path: String,
    ) : InputFile {
        public companion object
    }

    @Serializable
    @SerialName("inputFileGenerated")
    @TLCombinatorId(0xB0862800)
    public data class InputFileGenerated(
        @SerialName("original_path")
        @get:JvmName("originalPath")
        public val originalPath: String,
        @get:JvmName("conversion")
        public val conversion: String,
        @SerialName("expected_size")
        @get:JvmName("expectedSize")
        public val expectedSize: Long,
    ) : InputFile {
        public companion object
    }

    public companion object
}