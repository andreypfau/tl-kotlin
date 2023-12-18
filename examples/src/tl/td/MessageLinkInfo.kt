// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messageLinkInfo")
@TLCombinatorId(0x2B96FB50)
public data class MessageLinkInfo(
    @SerialName("is_public")
    @get:JvmName("isPublic")
    public val isPublic: Boolean,
    @SerialName("chat_id")
    @get:JvmName("chatId")
    public val chatId: Long,
    @SerialName("message_thread_id")
    @get:JvmName("messageThreadId")
    public val messageThreadId: Long,
    @get:JvmName("message")
    public val message: Message,
    @SerialName("media_timestamp")
    @get:JvmName("mediaTimestamp")
    public val mediaTimestamp: Int,
    @SerialName("for_album")
    @get:JvmName("forAlbum")
    public val forAlbum: Boolean,
) {
    public companion object
}
