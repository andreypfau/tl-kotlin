// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("gzip_packed")
@TLCombinatorId(0x3072CFA1)
public data class GzipPacked(
    @SerialName("packed_data")
    @get:JvmName("packedData")
    public val packedData: String,
) {
    public companion object
}
