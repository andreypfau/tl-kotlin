// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("msgs_state_req")
@TLCombinatorId(0xDA69FB52)
public data class MsgsStateReq(
    @SerialName("msg_ids")
    @get:JvmName("msgIds")
    public val msgIds: List<Long>,
) {
    public companion object
}