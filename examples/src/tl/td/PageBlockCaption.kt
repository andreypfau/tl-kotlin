// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("pageBlockCaption")
@TLCombinatorId(0xB9A9A476)
public data class PageBlockCaption(
    @get:JvmName("text")
    public val text: RichText,
    @get:JvmName("credit")
    public val credit: RichText,
) {
    public companion object
}