// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.SearchResultsPosition

@Serializable
@SerialName("messages.searchResultsPositions")
@TLCombinatorId(0x53B22BAF)
public data class MessagesSearchResultsPositions(
    @get:JvmName("count")
    public val count: Int,
    @get:JvmName("positions")
    public val positions: List<SearchResultsPosition>,
) {
    public companion object
}
