// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("passportElementError")
@TLCombinatorId(0x91059FC5)
public data class PassportElementError(
    @get:JvmName("type")
    public val type: PassportElementType,
    @get:JvmName("message")
    public val message: String,
    @get:JvmName("source")
    public val source: PassportElementErrorSource,
) {
    public companion object
}
