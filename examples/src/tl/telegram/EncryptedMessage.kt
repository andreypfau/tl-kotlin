// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface EncryptedMessage {
    @Serializable
    @SerialName("encryptedMessage")
    @TLCombinatorId(0xED18C118)
    public data class EncryptedMessage(
        @SerialName("random_id")
        @get:JvmName("randomId")
        public val randomId: Long,
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Int,
        @get:JvmName("date")
        public val date: Int,
        @get:JvmName("bytes")
        public val bytes: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("file")
        public val `file`: EncryptedFile,
    ) : tl.telegram.EncryptedMessage {
        public companion object
    }

    @Serializable
    @SerialName("encryptedMessageService")
    @TLCombinatorId(0x23734B06)
    public data class EncryptedMessageService(
        @SerialName("random_id")
        @get:JvmName("randomId")
        public val randomId: Long,
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Int,
        @get:JvmName("date")
        public val date: Int,
        @get:JvmName("bytes")
        public val bytes: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.telegram.EncryptedMessage {
        public companion object
    }

    public companion object
}
