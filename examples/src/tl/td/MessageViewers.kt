// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messageViewers")
@TLCombinatorId(0x7E26ED1F)
public data class MessageViewers(
    @get:JvmName("viewers")
    public val viewers: List<MessageViewer>,
) {
    public companion object
}
