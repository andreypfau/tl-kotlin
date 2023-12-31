// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.User
import tl.telegram.WebPage

@Serializable
@SerialName("messages.webPage")
@TLCombinatorId(0xFD5E12BD)
public data class MessagesWebPage(
    @get:JvmName("webpage")
    public val webpage: WebPage,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
