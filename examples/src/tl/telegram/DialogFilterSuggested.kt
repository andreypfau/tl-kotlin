// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("dialogFilterSuggested")
@TLCombinatorId(0x77744D4A)
public data class DialogFilterSuggested(
    @get:JvmName("filter")
    public val filter: DialogFilter,
    @get:JvmName("description")
    public val description: String,
) {
    public companion object
}
