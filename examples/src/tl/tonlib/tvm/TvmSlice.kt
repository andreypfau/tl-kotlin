// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.tvm

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("tvm.slice")
@TLCombinatorId(0x20068AE7)
public data class TvmSlice(
    @get:JvmName("bytes")
    public val bytes: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
