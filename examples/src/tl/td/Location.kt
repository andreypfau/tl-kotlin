// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("location")
@TLCombinatorId(0xE5925F73)
public data class Location(
    @get:JvmName("latitude")
    public val latitude: Double,
    @get:JvmName("longitude")
    public val longitude: Double,
    @SerialName("horizontal_accuracy")
    @get:JvmName("horizontalAccuracy")
    public val horizontalAccuracy: Double,
) {
    public companion object
}