// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.validatorsession.round

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("validatorSession.round.id")
@TLCombinatorId(0x0025CFA5)
public data class ValidatorSessionRoundId(
    @TLFixedSize(value = 32)
    @get:JvmName("session")
    public val session: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("height")
    public val height: Long,
    @SerialName("prev_block")
    @TLFixedSize(value = 32)
    @get:JvmName("prevBlock")
    public val prevBlock: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("seqno")
    public val seqno: Int,
) {
    public companion object
}