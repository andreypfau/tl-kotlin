// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("passportElementsWithErrors")
@TLCombinatorId(0x4E0494A4)
public data class PassportElementsWithErrors(
    @get:JvmName("elements")
    public val elements: List<PassportElement>,
    @get:JvmName("errors")
    public val errors: List<PassportElementError>,
) {
    public companion object
}