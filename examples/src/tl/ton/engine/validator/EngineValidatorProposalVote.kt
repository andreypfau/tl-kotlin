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
@SerialName("engine.validator.proposalVote")
@TLCombinatorId(0x7F6626ED)
public data class EngineValidatorProposalVote(
    @SerialName("perm_key")
    @TLFixedSize(value = 32)
    @get:JvmName("permKey")
    public val permKey: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("to_send")
    @get:JvmName("toSend")
    public val toSend: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
