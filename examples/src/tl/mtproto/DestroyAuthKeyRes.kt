// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.mtproto

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class DestroyAuthKeyRes {
    @SerialName("destroy_auth_key_ok")
    @TLCombinatorId(0xF660E1D4)
    DESTROY_AUTH_KEY_OK,
    @SerialName("destroy_auth_key_none")
    @TLCombinatorId(0x0A9F2259)
    DESTROY_AUTH_KEY_NONE,
    @SerialName("destroy_auth_key_fail")
    @TLCombinatorId(0xEA109B13)
    DESTROY_AUTH_KEY_FAIL,
    ;

    public companion object
}
