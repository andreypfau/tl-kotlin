// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.liteserver

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("liteServer.libraryEntry")
@TLCombinatorId(0x8AFF2446)
public data class LiteServerLibraryEntry(
    @TLFixedSize(value = 32)
    @get:JvmName("hash")
    public val hash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("data")
    public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}