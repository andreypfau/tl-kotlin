// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatFolderInviteLink")
@TLCombinatorId(0x1D7160FD)
public data class ChatFolderInviteLink(
    @SerialName("invite_link")
    @get:JvmName("inviteLink")
    public val inviteLink: String,
    @get:JvmName("name")
    public val name: String,
    @SerialName("chat_ids")
    @get:JvmName("chatIds")
    public val chatIds: List<Long>,
) {
    public companion object
}
