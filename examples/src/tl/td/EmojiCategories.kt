// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("emojiCategories")
@TLCombinatorId(0xA9408B50)
public data class EmojiCategories(
    @get:JvmName("categories")
    public val categories: List<EmojiCategory>,
) {
    public companion object
}
