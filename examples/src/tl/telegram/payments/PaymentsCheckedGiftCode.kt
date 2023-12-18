// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.payments

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.Peer
import tl.telegram.User

@Serializable
@SerialName("payments.checkedGiftCode")
@TLCombinatorId(0xB722F158)
public data class PaymentsCheckedGiftCode(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("via_giveaway")
    @TLConditional("flags", 2)
    @get:JvmName("viaGiveaway")
    public val viaGiveaway: Unit? = null,
    @SerialName("from_id")
    @get:JvmName("fromId")
    public val fromId: Peer,
    @SerialName("giveaway_msg_id")
    @TLConditional("flags", 3)
    @get:JvmName("giveawayMsgId")
    public val giveawayMsgId: Int? = null,
    @SerialName("to_id")
    @TLConditional("flags", 0)
    @get:JvmName("toId")
    public val toId: Long? = null,
    @get:JvmName("date")
    public val date: Int,
    @get:JvmName("months")
    public val months: Int,
    @SerialName("used_date")
    @TLConditional("flags", 1)
    @get:JvmName("usedDate")
    public val usedDate: Int? = null,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
