// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("dataJSON")
@TLCombinatorId(0x7D748D04)
public data class DataJSON(
    @get:JvmName("data")
    public val `data`: String,
) {
    public companion object
}