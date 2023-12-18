// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.payments

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.DataJSON
import tl.telegram.Invoice
import tl.telegram.PaymentFormMethod
import tl.telegram.PaymentRequestedInfo
import tl.telegram.PaymentSavedCredentials
import tl.telegram.User
import tl.telegram.WebDocument

@Serializable
@SerialName("payments.paymentForm")
@TLCombinatorId(0xA0058751)
public data class PaymentsPaymentForm(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("can_save_credentials")
    @TLConditional("flags", 2)
    @get:JvmName("canSaveCredentials")
    public val canSaveCredentials: Unit? = null,
    @SerialName("password_missing")
    @TLConditional("flags", 3)
    @get:JvmName("passwordMissing")
    public val passwordMissing: Unit? = null,
    @SerialName("form_id")
    @get:JvmName("formId")
    public val formId: Long,
    @SerialName("bot_id")
    @get:JvmName("botId")
    public val botId: Long,
    @get:JvmName("title")
    public val title: String,
    @get:JvmName("description")
    public val description: String,
    @TLConditional("flags", 5)
    @get:JvmName("photo")
    public val photo: WebDocument? = null,
    @get:JvmName("invoice")
    public val invoice: Invoice,
    @SerialName("provider_id")
    @get:JvmName("providerId")
    public val providerId: Long,
    @get:JvmName("url")
    public val url: String,
    @SerialName("native_provider")
    @TLConditional("flags", 4)
    @get:JvmName("nativeProvider")
    public val nativeProvider: String? = null,
    @SerialName("native_params")
    @TLConditional("flags", 4)
    @get:JvmName("nativeParams")
    public val nativeParams: DataJSON? = null,
    @SerialName("additional_methods")
    @TLConditional("flags", 6)
    @get:JvmName("additionalMethods")
    public val additionalMethods: List<PaymentFormMethod>? = null,
    @SerialName("saved_info")
    @TLConditional("flags", 0)
    @get:JvmName("savedInfo")
    public val savedInfo: PaymentRequestedInfo? = null,
    @SerialName("saved_credentials")
    @TLConditional("flags", 1)
    @get:JvmName("savedCredentials")
    public val savedCredentials: List<PaymentSavedCredentials>? = null,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
