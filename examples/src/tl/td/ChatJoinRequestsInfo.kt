// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatJoinRequestsInfo")
@TLCombinatorId(0x34F5F5BF)
public data class ChatJoinRequestsInfo(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @SerialName("user_ids")
    @get:JvmName("userIds")
    public val userIds: List<Long>,
) {
    public companion object
}