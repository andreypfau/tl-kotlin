// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.payments

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.PaymentRequestedInfo

@Serializable
@SerialName("payments.savedInfo")
@TLCombinatorId(0xFB8FE43C)
public data class PaymentsSavedInfo(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("has_saved_credentials")
    @TLConditional("flags", 1)
    @get:JvmName("hasSavedCredentials")
    public val hasSavedCredentials: Unit? = null,
    @SerialName("saved_info")
    @TLConditional("flags", 0)
    @get:JvmName("savedInfo")
    public val savedInfo: PaymentRequestedInfo? = null,
) {
    public companion object
}