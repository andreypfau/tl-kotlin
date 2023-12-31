// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine.validator

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validator.electionBid")
@TLCombinatorId(0x23B27A3D)
public data class EngineValidatorElectionBid(
    @SerialName("election_date")
    @get:JvmName("electionDate")
    public val electionDate: Int,
    @SerialName("perm_key")
    @TLFixedSize(value = 32)
    @get:JvmName("permKey")
    public val permKey: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("adnl_addr")
    @TLFixedSize(value = 32)
    @get:JvmName("adnlAddr")
    public val adnlAddr: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("to_send_payload")
    @get:JvmName("toSendPayload")
    public val toSendPayload: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
