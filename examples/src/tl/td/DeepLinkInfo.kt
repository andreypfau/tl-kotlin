// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("deepLinkInfo")
@TLCombinatorId(0x6F1BA0FE)
public data class DeepLinkInfo(
    @get:JvmName("text")
    public val text: FormattedText,
    @SerialName("need_update_application")
    @get:JvmName("needUpdateApplication")
    public val needUpdateApplication: Boolean,
) {
    public companion object
}
