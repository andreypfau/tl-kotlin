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
@SerialName("encryptedPassportElement")
@TLCombinatorId(0x7759FD11)
public data class EncryptedPassportElement(
    @get:JvmName("type")
    public val type: PassportElementType,
    @get:JvmName("data")
    public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("front_side")
    @get:JvmName("frontSide")
    public val frontSide: DatedFile,
    @SerialName("reverse_side")
    @get:JvmName("reverseSide")
    public val reverseSide: DatedFile,
    @get:JvmName("selfie")
    public val selfie: DatedFile,
    @get:JvmName("translation")
    public val translation: List<DatedFile>,
    @get:JvmName("files")
    public val files: List<DatedFile>,
    @get:JvmName("value")
    public val `value`: String,
    @get:JvmName("hash")
    public val hash: String,
) {
    public companion object
}
