// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("boost")
@TLCombinatorId(0x2A1C8C71)
public data class Boost(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 1)
    @get:JvmName("gift")
    public val gift: Unit? = null,
    @TLConditional("flags", 2)
    @get:JvmName("giveaway")
    public val giveaway: Unit? = null,
    @TLConditional("flags", 3)
    @get:JvmName("unclaimed")
    public val unclaimed: Unit? = null,
    @get:JvmName("id")
    public val id: String,
    @SerialName("user_id")
    @TLConditional("flags", 0)
    @get:JvmName("userId")
    public val userId: Long? = null,
    @SerialName("giveaway_msg_id")
    @TLConditional("flags", 2)
    @get:JvmName("giveawayMsgId")
    public val giveawayMsgId: Int? = null,
    @get:JvmName("date")
    public val date: Int,
    @get:JvmName("expires")
    public val expires: Int,
    @SerialName("used_gift_slug")
    @TLConditional("flags", 4)
    @get:JvmName("usedGiftSlug")
    public val usedGiftSlug: String? = null,
    @TLConditional("flags", 5)
    @get:JvmName("multiplier")
    public val multiplier: Int? = null,
) {
    public companion object
}
