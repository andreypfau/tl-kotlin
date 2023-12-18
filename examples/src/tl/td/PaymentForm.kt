// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("paymentForm")
@TLCombinatorId(0xA878E7AE)
public data class PaymentForm(
    @get:JvmName("id")
    public val id: Long,
    @get:JvmName("invoice")
    public val invoice: Invoice,
    @SerialName("seller_bot_user_id")
    @get:JvmName("sellerBotUserId")
    public val sellerBotUserId: Long,
    @SerialName("payment_provider_user_id")
    @get:JvmName("paymentProviderUserId")
    public val paymentProviderUserId: Long,
    @SerialName("payment_provider")
    @get:JvmName("paymentProvider")
    public val paymentProvider: PaymentProvider,
    @SerialName("additional_payment_options")
    @get:JvmName("additionalPaymentOptions")
    public val additionalPaymentOptions: List<PaymentOption>,
    @SerialName("saved_order_info")
    @get:JvmName("savedOrderInfo")
    public val savedOrderInfo: OrderInfo,
    @SerialName("saved_credentials")
    @get:JvmName("savedCredentials")
    public val savedCredentials: List<SavedCredentials>,
    @SerialName("can_save_credentials")
    @get:JvmName("canSaveCredentials")
    public val canSaveCredentials: Boolean,
    @SerialName("need_password")
    @get:JvmName("needPassword")
    public val needPassword: Boolean,
    @SerialName("product_title")
    @get:JvmName("productTitle")
    public val productTitle: String,
    @SerialName("product_description")
    @get:JvmName("productDescription")
    public val productDescription: FormattedText,
    @SerialName("product_photo")
    @get:JvmName("productPhoto")
    public val productPhoto: Photo,
) {
    public companion object
}