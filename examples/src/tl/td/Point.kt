// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("point")
@TLCombinatorId(0x1A13F5B9)
public data class Point(
    @get:JvmName("x")
    public val x: Double,
    @get:JvmName("y")
    public val y: Double,
) {
    public companion object
}
