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
public sealed interface BotCommandScope {
    @Serializable
    @SerialName("botCommandScopeDefault")
    @TLCombinatorId(0x2F6CB2AB)
    public object BotCommandScopeDefault : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeAllPrivateChats")
    @TLCombinatorId(0xEB716739)
    public object BotCommandScopeAllPrivateChats : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeAllGroupChats")
    @TLCombinatorId(0xC585C85E)
    public object BotCommandScopeAllGroupChats : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeAllChatAdministrators")
    @TLCombinatorId(0x771C1551)
    public object BotCommandScopeAllChatAdministrators : BotCommandScope

    @Serializable
    @SerialName("botCommandScopeChat")
    @TLCombinatorId(0xE65B22A5)
    public data class BotCommandScopeChat(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : BotCommandScope {
        public companion object
    }

    @Serializable
    @SerialName("botCommandScopeChatAdministrators")
    @TLCombinatorId(0x42BCFE4E)
    public data class BotCommandScopeChatAdministrators(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : BotCommandScope {
        public companion object
    }

    @Serializable
    @SerialName("botCommandScopeChatMember")
    @TLCombinatorId(0xF36696F2)
    public data class BotCommandScopeChatMember(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
        @SerialName("user_id")
        @get:JvmName("userId")
        public val userId: Long,
    ) : BotCommandScope {
        public companion object
    }

    public companion object
}
