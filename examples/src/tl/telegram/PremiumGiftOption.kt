// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("premiumGiftOption")
@TLCombinatorId(0x74C34319)
public data class PremiumGiftOption(
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("months")
    public val months: Int,
    @get:JvmName("currency")
    public val currency: String,
    @get:JvmName("amount")
    public val amount: Long,
    @SerialName("bot_url")
    @get:JvmName("botUrl")
    public val botUrl: String,
    @SerialName("store_product")
    @TLConditional("flags", 0)
    @get:JvmName("storeProduct")
    public val storeProduct: String? = null,
) {
    public companion object
}
