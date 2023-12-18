// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("notificationGroup")
@TLCombinatorId(0x2E886855)
public data class NotificationGroup(
    @get:JvmName("id")
    public val id: Int,
    @get:JvmName("type")
    public val type: NotificationGroupType,
    @SerialName("chat_id")
    @get:JvmName("chatId")
    public val chatId: Long,
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @get:JvmName("notifications")
    public val notifications: List<Notification>,
) {
    public companion object
}
