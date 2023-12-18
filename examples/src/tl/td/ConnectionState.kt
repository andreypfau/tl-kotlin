// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class ConnectionState {
    @SerialName("connectionStateWaitingForNetwork")
    @TLCombinatorId(0x650DD758)
    CONNECTION_STATE_WAITING_FOR_NETWORK,
    @SerialName("connectionStateConnectingToProxy")
    @TLCombinatorId(0xFA721359)
    CONNECTION_STATE_CONNECTING_TO_PROXY,
    @SerialName("connectionStateConnecting")
    @TLCombinatorId(0xB29BFA62)
    CONNECTION_STATE_CONNECTING,
    @SerialName("connectionStateUpdating")
    @TLCombinatorId(0xF4C9C2B7)
    CONNECTION_STATE_UPDATING,
    @SerialName("connectionStateReady")
    @TLCombinatorId(0x02E5B4EC)
    CONNECTION_STATE_READY,
    ;

    public companion object
}
