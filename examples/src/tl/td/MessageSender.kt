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
public sealed interface MessageSender {
    @Serializable
    @SerialName("messageSenderUser")
    @TLCombinatorId(0xEBF760E3)
    public data class MessageSenderUser(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
    ) : MessageSender {
        public companion object
    }

    @Serializable
    @SerialName("messageSenderChat")
    @TLCombinatorId(0xF1B71131)
    public data class MessageSenderChat(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : MessageSender {
        public companion object
    }

    public companion object
}
