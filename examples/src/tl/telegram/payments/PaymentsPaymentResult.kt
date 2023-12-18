// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.payments

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Updates

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface PaymentsPaymentResult {
    @Serializable
    @SerialName("payments.paymentResult")
    @TLCombinatorId(0x4E5F810D)
    public data class PaymentResult(
        @get:JvmName("updates")
        public val updates: Updates,
    ) : PaymentsPaymentResult {
        public companion object
    }

    @Serializable
    @SerialName("payments.paymentVerificationNeeded")
    @TLCombinatorId(0xD8411139)
    public data class PaymentVerificationNeeded(
        @get:JvmName("url")
        public val url: String,
    ) : PaymentsPaymentResult {
        public companion object
    }

    public companion object
}
