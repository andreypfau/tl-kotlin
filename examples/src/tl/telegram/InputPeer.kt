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
public sealed interface InputPeer {
    @Serializable
    @SerialName("inputPeerEmpty")
    @TLCombinatorId(0x7F3B18EA)
    public object InputPeerEmpty : InputPeer

    @Serializable
    @SerialName("inputPeerSelf")
    @TLCombinatorId(0x7DA07EC9)
    public object InputPeerSelf : InputPeer

    @Serializable
    @SerialName("inputPeerChat")
    @TLCombinatorId(0x35A95CB9)
    public data class InputPeerChat(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : InputPeer {
        public companion object
    }

    @Serializable
    @SerialName("inputPeerUser")
    @TLCombinatorId(0xDDE8A54C)
    public data class InputPeerUser(
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
    ) : InputPeer {
        public companion object
    }

    @Serializable
    @SerialName("inputPeerChannel")
    @TLCombinatorId(0x27BCBBFC)
    public data class InputPeerChannel(
        @SerialName("channel_id")
        @get:JvmName("channelId")
        public val channelId: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
    ) : InputPeer {
        public companion object
    }

    @Serializable
    @SerialName("inputPeerUserFromMessage")
    @TLCombinatorId(0xA87B0A1C)
    public data class InputPeerUserFromMessage(
        @get:JvmName("peer")
        public val peer: InputPeer,
        @SerialName("msg_id")
        @get:JvmName("msgId")
        public val msgId: Int,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
    ) : InputPeer {
        public companion object
    }

    @Serializable
    @SerialName("inputPeerChannelFromMessage")
    @TLCombinatorId(0xBD2A0840)
    public data class InputPeerChannelFromMessage(
        @get:JvmName("peer")
        public val peer: InputPeer,
        @SerialName("msg_id")
        @get:JvmName("msgId")
        public val msgId: Int,
        @SerialName("channel_id")
        @get:JvmName("channelId")
        public val channelId: Long,
    ) : InputPeer {
        public companion object
    }

    public companion object
}
