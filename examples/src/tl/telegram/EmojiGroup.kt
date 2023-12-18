// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("emojiGroup")
@TLCombinatorId(0x7A9ABDA9)
public data class EmojiGroup(
    @get:JvmName("title")
    public val title: String,
    @SerialName("icon_emoji_id")
    @get:JvmName("iconEmojiId")
    public val iconEmojiId: Long,
    @get:JvmName("emoticons")
    public val emoticons: List<String>,
) {
    public companion object
}
