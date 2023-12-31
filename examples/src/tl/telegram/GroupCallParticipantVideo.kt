// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("groupCallParticipantVideo")
@TLCombinatorId(0x67753AC8)
public data class GroupCallParticipantVideo(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("paused")
    public val paused: Unit? = null,
    @get:JvmName("endpoint")
    public val endpoint: String,
    @SerialName("source_groups")
    @get:JvmName("sourceGroups")
    public val sourceGroups: List<GroupCallParticipantVideoSourceGroup>,
    @SerialName("audio_source")
    @TLConditional("flags", 1)
    @get:JvmName("audioSource")
    public val audioSource: Int? = null,
) {
    public companion object
}
