// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("premiumState")
@TLCombinatorId(0x47BC277D)
public data class PremiumState(
    @get:JvmName("state")
    public val state: FormattedText,
    @SerialName("payment_options")
    @get:JvmName("paymentOptions")
    public val paymentOptions: List<PremiumStatePaymentOption>,
    @get:JvmName("animations")
    public val animations: List<PremiumFeaturePromotionAnimation>,
) {
    public companion object
}
