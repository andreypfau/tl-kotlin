// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("filePart")
@TLCombinatorId(0x36594C36)
public data class FilePart(
    @get:JvmName("data")
    public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
