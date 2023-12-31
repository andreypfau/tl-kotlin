// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.validatorsession

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("validatorSession.statsProducer")
@TLCombinatorId(0x8DFBA60D)
public data class ValidatorSessionStatsProducer(
    @TLFixedSize(value = 32)
    @get:JvmName("id")
    public val id: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("block_status")
    @get:JvmName("blockStatus")
    public val blockStatus: Int,
    @SerialName("block_timestamp")
    @get:JvmName("blockTimestamp")
    public val blockTimestamp: Long,
) {
    public companion object
}
