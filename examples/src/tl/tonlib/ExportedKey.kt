// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("exportedKey")
@TLCombinatorId(0xA99E39D7)
public data class ExportedKey(
    @SerialName("word_list")
    @get:JvmName("wordList")
    public val wordList: List<String>,
) {
    public companion object
}