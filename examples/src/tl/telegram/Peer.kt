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
public sealed interface Peer {
    @Serializable
    @SerialName("peerUser")
    @TLCombinatorId(0x59511722)
    public data class PeerUser(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
    ) : Peer {
        public companion object
    }

    @Serializable
    @SerialName("peerChat")
    @TLCombinatorId(0x36C6019A)
    public data class PeerChat(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : Peer {
        public companion object
    }

    @Serializable
    @SerialName("peerChannel")
    @TLCombinatorId(0xA2A5371E)
    public data class PeerChannel(
        @SerialName("channel_id")
        @get:JvmName("channelId")
        public val channelId: Long,
    ) : Peer {
        public companion object
    }

    public companion object
}
