// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messageCalendar")
@TLCombinatorId(0x9BB120E9)
public data class MessageCalendar(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @get:JvmName("days")
    public val days: List<MessageCalendarDay>,
) {
    public companion object
}
