// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("searchResultsCalendarPeriod")
@TLCombinatorId(0xC9B0539F)
public data class SearchResultsCalendarPeriod(
    @get:JvmName("date")
    public val date: Int,
    @SerialName("min_msg_id")
    @get:JvmName("minMsgId")
    public val minMsgId: Int,
    @SerialName("max_msg_id")
    @get:JvmName("maxMsgId")
    public val maxMsgId: Int,
    @get:JvmName("count")
    public val count: Int,
) {
    public companion object
}