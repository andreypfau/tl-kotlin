// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class EmojiCategoryType {
    @SerialName("emojiCategoryTypeDefault")
    @TLCombinatorId(0x46DB626B)
    EMOJI_CATEGORY_TYPE_DEFAULT,
    @SerialName("emojiCategoryTypeEmojiStatus")
    @TLCombinatorId(0x5254B347)
    EMOJI_CATEGORY_TYPE_EMOJI_STATUS,
    @SerialName("emojiCategoryTypeChatPhoto")
    @TLCombinatorId(0x3F200529)
    EMOJI_CATEGORY_TYPE_CHAT_PHOTO,
    ;

    public companion object
}
