// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("customRequestResult")
@TLCombinatorId(0x88326FFC)
public data class CustomRequestResult(
    @get:JvmName("result")
    public val result: String,
) {
    public companion object
}