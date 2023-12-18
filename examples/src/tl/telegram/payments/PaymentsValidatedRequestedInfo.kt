// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.payments

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.ShippingOption

@Serializable
@SerialName("payments.validatedRequestedInfo")
@TLCombinatorId(0xD1451883)
public data class PaymentsValidatedRequestedInfo(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("id")
    public val id: String? = null,
    @SerialName("shipping_options")
    @TLConditional("flags", 1)
    @get:JvmName("shippingOptions")
    public val shippingOptions: List<ShippingOption>? = null,
) {
    public companion object
}