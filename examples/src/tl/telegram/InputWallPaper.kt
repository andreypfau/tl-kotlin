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
public sealed interface InputWallPaper {
    @Serializable
    @SerialName("inputWallPaper")
    @TLCombinatorId(0xE630B979)
    public data class InputWallPaper(
        @get:JvmName("id")
        public val id: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
    ) : tl.telegram.InputWallPaper {
        public companion object
    }

    @Serializable
    @SerialName("inputWallPaperSlug")
    @TLCombinatorId(0x72091C80)
    public data class InputWallPaperSlug(
        @get:JvmName("slug")
        public val slug: String,
    ) : tl.telegram.InputWallPaper {
        public companion object
    }

    @Serializable
    @SerialName("inputWallPaperNoFile")
    @TLCombinatorId(0x967A462E)
    public data class InputWallPaperNoFile(
        @get:JvmName("id")
        public val id: Long,
    ) : tl.telegram.InputWallPaper {
        public companion object
    }

    public companion object
}
