// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("simpleWebViewResultUrl")
@TLCombinatorId(0x882F76BB)
public data class SimpleWebViewResult(
    @get:JvmName("url")
    public val url: String,
) {
    public companion object
}
