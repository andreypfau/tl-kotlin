// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("textEntities")
@TLCombinatorId(0xC86082BC)
public data class TextEntities(
    @get:JvmName("entities")
    public val entities: List<TextEntity>,
) {
    public companion object
}
