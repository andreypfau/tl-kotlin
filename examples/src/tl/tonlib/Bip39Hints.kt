// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("bip39Hints")
@TLCombinatorId(0x3C559C00)
public data class Bip39Hints(
    @get:JvmName("words")
    public val words: List<String>,
) {
    public companion object
}
