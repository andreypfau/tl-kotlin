// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messages.historyImport")
@TLCombinatorId(0x1662AF0B)
public data class MessagesHistoryImport(
    @get:JvmName("id")
    public val id: Long,
) {
    public companion object
}
