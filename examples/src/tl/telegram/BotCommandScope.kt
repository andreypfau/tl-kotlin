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
public sealed interface BotCommandScope {
    @Serializable
    @SerialName("botCommandScopeDefault")
    @TLCombinatorId(0x2F6CB2AB)
    public object BotCommandScopeDefault : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeUsers")
    @TLCombinatorId(0x3C4F04D8)
    public object BotCommandScopeUsers : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeChats")
    @TLCombinatorId(0x6FE1A881)
    public object BotCommandScopeChats : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeChatAdmins")
    @TLCombinatorId(0xB9AA606A)
    public object BotCommandScopeChatAdmins : BotCommandScope

    @Serializable
    @SerialName("botCommandScopePeer")
    @TLCombinatorId(0xDB9D897D)
    public data class BotCommandScopePeer(
        @get:JvmName("peer")
        public val peer: InputPeer,
    ) : BotCommandScope {
        public companion object
    }

    @Serializable
    @SerialName("botCommandScopePeerAdmins")
    @TLCombinatorId(0x3FD863D1)
    public data class BotCommandScopePeerAdmins(
        @get:JvmName("peer")
        public val peer: InputPeer,
    ) : BotCommandScope {
        public companion object
    }

    @Serializable
    @SerialName("botCommandScopePeerUser")
    @TLCombinatorId(0xA1321F3)
    public data class BotCommandScopePeerUser(
        @get:JvmName("peer")
        public val peer: InputPeer,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: InputUser,
    ) : BotCommandScope {
        public companion object
    }

    public companion object
}
