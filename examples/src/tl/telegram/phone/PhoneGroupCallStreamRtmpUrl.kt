// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.phone

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("phone.groupCallStreamRtmpUrl")
@TLCombinatorId(0x2DBF3432)
public data class PhoneGroupCallStreamRtmpUrl(
    @get:JvmName("url")
    public val url: String,
    @get:JvmName("key")
    public val key: String,
) {
    public companion object
}
