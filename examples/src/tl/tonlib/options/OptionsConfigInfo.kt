// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.options

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("options.configInfo")
@TLCombinatorId(0x07B75F16)
public data class OptionsConfigInfo(
    @SerialName("default_wallet_id")
    @get:JvmName("defaultWalletId")
    public val defaultWalletId: Long,
    @SerialName("default_rwallet_init_public_key")
    @get:JvmName("defaultRwalletInitPublicKey")
    public val defaultRwalletInitPublicKey: String,
) {
    public companion object
}
