// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storyViewer")
@TLCombinatorId(0xCF0FB132)
public data class StoryViewer(
    @SerialName("user_id")
    @get:JvmName("userId")
    public val userId: Long,
    @SerialName("view_date")
    @get:JvmName("viewDate")
    public val viewDate: Int,
    @SerialName("block_list")
    @get:JvmName("blockList")
    public val blockList: BlockList,
    @SerialName("chosen_reaction_type")
    @get:JvmName("chosenReactionType")
    public val chosenReactionType: ReactionType,
) {
    public companion object
}