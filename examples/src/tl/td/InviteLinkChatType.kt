// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class InviteLinkChatType {
    @SerialName("inviteLinkChatTypeBasicGroup")
    @TLCombinatorId(0x4D43C5EE)
    INVITE_LINK_CHAT_TYPE_BASIC_GROUP,
    @SerialName("inviteLinkChatTypeSupergroup")
    @TLCombinatorId(0x3DE86758)
    INVITE_LINK_CHAT_TYPE_SUPERGROUP,
    @SerialName("inviteLinkChatTypeChannel")
    @TLCombinatorId(0x3012EF0B)
    INVITE_LINK_CHAT_TYPE_CHANNEL,
    ;

    public companion object
}
