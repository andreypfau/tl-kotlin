// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("foundPosition")
@TLCombinatorId(0x8F8ADF88)
public data class FoundPosition(
    @get:JvmName("position")
    public val position: Int,
) {
    public companion object
}
