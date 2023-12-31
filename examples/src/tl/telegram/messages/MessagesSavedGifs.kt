// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Document

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface MessagesSavedGifs {
    @Serializable
    @SerialName("messages.savedGifsNotModified")
    @TLCombinatorId(0xE8025CA2)
    public object SavedGifsNotModified : MessagesSavedGifs

    @Serializable
    @SerialName("messages.savedGifs")
    @TLCombinatorId(0x84A02A0D)
    public data class SavedGifs(
        @get:JvmName("hash")
        public val hash: Long,
        @get:JvmName("gifs")
        public val gifs: List<Document>,
    ) : MessagesSavedGifs {
        public companion object
    }

    public companion object
}
