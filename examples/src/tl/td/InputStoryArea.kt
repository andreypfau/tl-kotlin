// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inputStoryArea")
@TLCombinatorId(0x0752AE7F)
public data class InputStoryArea(
    @get:JvmName("position")
    public val position: StoryAreaPosition,
    @get:JvmName("type")
    public val type: InputStoryAreaType,
) {
    public companion object
}
