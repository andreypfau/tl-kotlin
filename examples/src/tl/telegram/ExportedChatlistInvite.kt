// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("exportedChatlistInvite")
@TLCombinatorId(0xC5181AC)
public data class ExportedChatlistInvite(
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("title")
    public val title: String,
    @get:JvmName("url")
    public val url: String,
    @get:JvmName("peers")
    public val peers: List<Peer>,
) {
    public companion object
}
