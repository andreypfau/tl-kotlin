// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("receivedNotifyMessage")
@TLCombinatorId(0xA384B779)
public data class ReceivedNotifyMessage(
    @get:JvmName("id")
    public val id: Int,
    @get:JvmName("flags")
    public val flags: Int,
) {
    public companion object
}
