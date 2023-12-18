// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.users

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.User
import tl.telegram.UserFull

@Serializable
@SerialName("users.userFull")
@TLCombinatorId(0x3B6D152E)
public data class UsersUserFull(
    @SerialName("full_user")
    @get:JvmName("fullUser")
    public val fullUser: UserFull,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
