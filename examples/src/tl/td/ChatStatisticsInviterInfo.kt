// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatStatisticsInviterInfo")
@TLCombinatorId(0x2583D48B)
public data class ChatStatisticsInviterInfo(
    @SerialName("user_id")
    @get:JvmName("userId")
    public val userId: Long,
    @SerialName("added_member_count")
    @get:JvmName("addedMemberCount")
    public val addedMemberCount: Int,
) {
    public companion object
}