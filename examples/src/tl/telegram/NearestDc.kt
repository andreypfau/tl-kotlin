// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("nearestDc")
@TLCombinatorId(0x8E1A1775)
public data class NearestDc(
    @get:JvmName("country")
    public val country: String,
    @SerialName("this_dc")
    @get:JvmName("thisDc")
    public val thisDc: Int,
    @SerialName("nearest_dc")
    @get:JvmName("nearestDc")
    public val nearestDc: Int,
) {
    public companion object
}