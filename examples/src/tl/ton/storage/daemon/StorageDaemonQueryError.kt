// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.daemon.queryError")
@TLCombinatorId(0x04BDBAC4)
public data class StorageDaemonQueryError(
    @get:JvmName("message")
    public val message: String,
) {
    public companion object
}
