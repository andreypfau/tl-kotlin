// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("statsPercentValue")
@TLCombinatorId(0xCBCE2FE0)
public data class StatsPercentValue(
    @get:JvmName("part")
    public val part: Double,
    @get:JvmName("total")
    public val total: Double,
) {
    public companion object
}
