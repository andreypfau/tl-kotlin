// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.adnl

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AdnlMessage {
    @Serializable
    @SerialName("adnl.message.query")
    @TLCombinatorId(0xB48BF97A)
    public data class Query(
        @SerialName("query_id")
        @TLFixedSize(value = 32)
        @get:JvmName("queryId")
        public val queryId: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("query")
        public val query: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AdnlMessage {
        public companion object
    }

    @Serializable
    @SerialName("adnl.message.answer")
    @TLCombinatorId(0x0FAC8416)
    public data class Answer(
        @SerialName("query_id")
        @TLFixedSize(value = 32)
        @get:JvmName("queryId")
        public val queryId: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("answer")
        public val answer: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AdnlMessage {
        public companion object
    }

    public companion object
}