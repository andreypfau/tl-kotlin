// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("appWebViewResultUrl")
@TLCombinatorId(0x3C1B4F0D)
public data class AppWebViewResult(
    @get:JvmName("url")
    public val url: String,
) {
    public companion object
}
