// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("chatPosition")
@TLCombinatorId(0xDAE48755)
public data class ChatPosition(
    @get:JvmName("list")
    public val list: ChatList,
    @get:JvmName("order")
    public val order: Long,
    @SerialName("is_pinned")
    @get:JvmName("isPinned")
    public val isPinned: Boolean,
    @get:JvmName("source")
    public val source: ChatSource,
) {
    public companion object
}