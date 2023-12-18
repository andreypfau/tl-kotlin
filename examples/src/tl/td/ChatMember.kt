// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatMember")
@TLCombinatorId(0x6D12E175)
public data class ChatMember(
    @SerialName("member_id")
    @get:JvmName("memberId")
    public val memberId: MessageSender,
    @SerialName("inviter_user_id")
    @get:JvmName("inviterUserId")
    public val inviterUserId: Long,
    @SerialName("joined_chat_date")
    @get:JvmName("joinedChatDate")
    public val joinedChatDate: Int,
    @get:JvmName("status")
    public val status: ChatMemberStatus,
) {
    public companion object
}
