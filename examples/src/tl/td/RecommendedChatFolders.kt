// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("recommendedChatFolders")
@TLCombinatorId(0xD3F06F08)
public data class RecommendedChatFolders(
    @SerialName("chat_folders")
    @get:JvmName("chatFolders")
    public val chatFolders: List<RecommendedChatFolder>,
) {
    public companion object
}
