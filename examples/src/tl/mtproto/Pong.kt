// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("pong")
@TLCombinatorId(0x347773C5)
public data class Pong(
    @SerialName("msg_id")
    @get:JvmName("msgId")
    public val msgId: Long,
    @SerialName("ping_id")
    @get:JvmName("pingId")
    public val pingId: Long,
) {
    public companion object
}
