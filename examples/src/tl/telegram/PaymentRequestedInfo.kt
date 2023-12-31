// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("paymentRequestedInfo")
@TLCombinatorId(0x909C3F94)
public data class PaymentRequestedInfo(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("name")
    public val name: String? = null,
    @TLConditional("flags", 1)
    @get:JvmName("phone")
    public val phone: String? = null,
    @TLConditional("flags", 2)
    @get:JvmName("email")
    public val email: String? = null,
    @SerialName("shipping_address")
    @TLConditional("flags", 3)
    @get:JvmName("shippingAddress")
    public val shippingAddress: PostAddress? = null,
) {
    public companion object
}
