// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("poll")
@TLCombinatorId(0x86E18161)
public data class Poll(
    @get:JvmName("id")
    public val id: Long,
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("closed")
    public val closed: Unit? = null,
    @SerialName("public_voters")
    @TLConditional("flags", 1)
    @get:JvmName("publicVoters")
    public val publicVoters: Unit? = null,
    @SerialName("multiple_choice")
    @TLConditional("flags", 2)
    @get:JvmName("multipleChoice")
    public val multipleChoice: Unit? = null,
    @TLConditional("flags", 3)
    @get:JvmName("quiz")
    public val quiz: Unit? = null,
    @get:JvmName("question")
    public val question: String,
    @get:JvmName("answers")
    public val answers: List<PollAnswer>,
    @SerialName("close_period")
    @TLConditional("flags", 4)
    @get:JvmName("closePeriod")
    public val closePeriod: Int? = null,
    @SerialName("close_date")
    @TLConditional("flags", 5)
    @get:JvmName("closeDate")
    public val closeDate: Int? = null,
) {
    public companion object
}