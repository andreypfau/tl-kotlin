// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatBoostStatus")
@TLCombinatorId(0xEB4E9FE2)
public data class ChatBoostStatus(
    @SerialName("boost_url")
    @get:JvmName("boostUrl")
    public val boostUrl: String,
    @SerialName("applied_slot_ids")
    @get:JvmName("appliedSlotIds")
    public val appliedSlotIds: List<Int>,
    @get:JvmName("level")
    public val level: Int,
    @SerialName("gift_code_boost_count")
    @get:JvmName("giftCodeBoostCount")
    public val giftCodeBoostCount: Int,
    @SerialName("boost_count")
    @get:JvmName("boostCount")
    public val boostCount: Int,
    @SerialName("current_level_boost_count")
    @get:JvmName("currentLevelBoostCount")
    public val currentLevelBoostCount: Int,
    @SerialName("next_level_boost_count")
    @get:JvmName("nextLevelBoostCount")
    public val nextLevelBoostCount: Int,
    @SerialName("premium_member_count")
    @get:JvmName("premiumMemberCount")
    public val premiumMemberCount: Int,
    @SerialName("premium_member_percentage")
    @get:JvmName("premiumMemberPercentage")
    public val premiumMemberPercentage: Double,
    @SerialName("prepaid_giveaways")
    @get:JvmName("prepaidGiveaways")
    public val prepaidGiveaways: List<PrepaidPremiumGiveaway>,
) {
    public companion object
}
