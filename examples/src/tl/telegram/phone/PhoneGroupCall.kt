// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.phone

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.GroupCall
import tl.telegram.GroupCallParticipant
import tl.telegram.User

@Serializable
@SerialName("phone.groupCall")
@TLCombinatorId(0x9E727AAD)
public data class PhoneGroupCall(
    @get:JvmName("call")
    public val call: GroupCall,
    @get:JvmName("participants")
    public val participants: List<GroupCallParticipant>,
    @SerialName("participants_next_offset")
    @get:JvmName("participantsNextOffset")
    public val participantsNextOffset: String,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
