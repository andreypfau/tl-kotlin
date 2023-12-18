// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.tonnode

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("tonNode.blockSignature")
@TLCombinatorId(0x50F03C33)
public data class TonNodeBlockSignature(
    @TLFixedSize(value = 32)
    @get:JvmName("who")
    public val who: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("signature")
    public val signature: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}