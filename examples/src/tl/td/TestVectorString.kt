// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("testVectorString")
@TLCombinatorId(0x04BAA1DB)
public data class TestVectorString(
    @get:JvmName("value")
    public val `value`: List<String>,
) {
    public companion object
}
