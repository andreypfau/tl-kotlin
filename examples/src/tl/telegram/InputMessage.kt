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
public sealed interface InputMessage {
    @Serializable
    @SerialName("inputMessageID")
    @TLCombinatorId(0xA676A322)
    public data class InputMessageID(
        @get:JvmName("id")
        public val id: Int,
    ) : InputMessage {
        public companion object
    }

    @Serializable
    @SerialName("inputMessageReplyTo")
    @TLCombinatorId(0xBAD88395)
    public data class InputMessageReplyTo(
        @get:JvmName("id")
        public val id: Int,
    ) : InputMessage {
        public companion object
    }

    @Serializable
    @SerialName("inputMessagePinned")
    @TLCombinatorId(0x86872538)
    public object InputMessagePinned : InputMessage

    @Serializable
    @SerialName("inputMessageCallbackQuery")
    @TLCombinatorId(0xACFA1A7E)
    public data class InputMessageCallbackQuery(
        @get:JvmName("id")
        public val id: Int,
        @SerialName("query_id")
        @get:JvmName("queryId")
        public val queryId: Long,
    ) : InputMessage {
        public companion object
    }

    public companion object
}
