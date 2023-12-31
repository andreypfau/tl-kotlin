// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine.validator

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.PublicKey

@Serializable
@SerialName("engine.validator.fullNodeSlave")
@TLCombinatorId(0x88256B79)
public data class EngineValidatorFullNodeSlave(
    @get:JvmName("ip")
    public val ip: Int,
    @get:JvmName("port")
    public val port: Int,
    @get:JvmName("adnl")
    public val adnl: PublicKey,
) {
    public companion object
}
