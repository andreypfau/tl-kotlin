// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.tvm

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("tvm.tuple")
@TLCombinatorId(0xAEB3BA63)
public data class TvmTuple(
    @get:JvmName("elements")
    public val elements: List<TvmStackEntry>,
) {
    public companion object
}
