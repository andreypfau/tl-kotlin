// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validator")
@TLCombinatorId(0x885FEA29)
public data class EngineValidator(
    @TLFixedSize(value = 32)
    @get:JvmName("id")
    public val id: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("temp_keys")
    @get:JvmName("tempKeys")
    public val tempKeys: List<EngineValidatorTempKey>,
    @SerialName("adnl_addrs")
    @get:JvmName("adnlAddrs")
    public val adnlAddrs: List<EngineValidatorAdnlAddress>,
    @SerialName("election_date")
    @get:JvmName("electionDate")
    public val electionDate: Int,
    @SerialName("expire_at")
    @get:JvmName("expireAt")
    public val expireAt: Int,
) {
    public companion object
}