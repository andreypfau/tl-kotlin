// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.validatorsession

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("validatorSession.catchainOptions")
@TLCombinatorId(0x70E249E6)
public data class ValidatorSessionCatChainOptions(
    @SerialName("idle_timeout")
    @get:JvmName("idleTimeout")
    public val idleTimeout: Double,
    @SerialName("max_deps")
    @get:JvmName("maxDeps")
    public val maxDeps: Int,
    @SerialName("max_block_size")
    @get:JvmName("maxBlockSize")
    public val maxBlockSize: Int,
    @SerialName("block_hash_covers_data")
    @get:JvmName("blockHashCoversData")
    public val blockHashCoversData: Boolean,
    @SerialName("max_block_height_ceoff")
    @get:JvmName("maxBlockHeightCeoff")
    public val maxBlockHeightCeoff: Int,
    @SerialName("debug_disable_db")
    @get:JvmName("debugDisableDb")
    public val debugDisableDb: Boolean,
) {
    public companion object
}