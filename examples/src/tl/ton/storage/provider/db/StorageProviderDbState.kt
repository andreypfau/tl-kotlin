// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.provider.db

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.provider.db.state")
@TLCombinatorId(0x01A955F3)
public data class StorageProviderDbState(
    @SerialName("last_processed_lt")
    @get:JvmName("lastProcessedLt")
    public val lastProcessedLt: Long,
) {
    public companion object
}