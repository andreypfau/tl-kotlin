// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatBoostLinkInfo")
@TLCombinatorId(0xDC123884)
public data class ChatBoostLinkInfo(
    @SerialName("is_public")
    @get:JvmName("isPublic")
    public val isPublic: Boolean,
    @SerialName("chat_id")
    @get:JvmName("chatId")
    public val chatId: Long,
) {
    public companion object
}
