// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chats")
@TLCombinatorId(0x6BDD241C)
public data class Chats(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @SerialName("chat_ids")
    @get:JvmName("chatIds")
    public val chatIds: List<Long>,
) {
    public companion object
}