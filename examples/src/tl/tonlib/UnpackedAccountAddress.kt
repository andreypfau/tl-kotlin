// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("unpackedAccountAddress")
@TLCombinatorId(0x70D41436)
public data class UnpackedAccountAddress(
    @SerialName("workchain_id")
    @get:JvmName("workchainId")
    public val workchainId: Int,
    @get:JvmName("bounceable")
    public val bounceable: Boolean,
    @get:JvmName("testnet")
    public val testnet: Boolean,
    @get:JvmName("addr")
    public val addr: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
