// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.daemon.providerConfig")
@TLCombinatorId(0x7DAD0A94)
public data class StorageDaemonProviderConfig(
    @SerialName("max_contracts")
    @get:JvmName("maxContracts")
    public val maxContracts: Int,
    @SerialName("max_total_size")
    @get:JvmName("maxTotalSize")
    public val maxTotalSize: Long,
) {
    public companion object
}
