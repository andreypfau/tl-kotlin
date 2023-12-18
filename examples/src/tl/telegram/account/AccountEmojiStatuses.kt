// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.account

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.EmojiStatus

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AccountEmojiStatuses {
    @Serializable
    @SerialName("account.emojiStatusesNotModified")
    @TLCombinatorId(0xD08CE645)
    public object EmojiStatusesNotModified : AccountEmojiStatuses

    @Serializable
    @SerialName("account.emojiStatuses")
    @TLCombinatorId(0x90C467D1)
    public data class EmojiStatuses(
        @get:JvmName("hash")
        public val hash: Long,
        @get:JvmName("statuses")
        public val statuses: List<EmojiStatus>,
    ) : AccountEmojiStatuses {
        public companion object
    }

    public companion object
}