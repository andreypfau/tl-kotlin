// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storyInteractionInfo")
@TLCombinatorId(0xCD8ACB0F)
public data class StoryInteractionInfo(
    @SerialName("view_count")
    @get:JvmName("viewCount")
    public val viewCount: Int,
    @SerialName("forward_count")
    @get:JvmName("forwardCount")
    public val forwardCount: Int,
    @SerialName("reaction_count")
    @get:JvmName("reactionCount")
    public val reactionCount: Int,
    @SerialName("recent_viewer_user_ids")
    @get:JvmName("recentViewerUserIds")
    public val recentViewerUserIds: List<Long>,
) {
    public companion object
}