// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("authenticationCodeInfo")
@TLCombinatorId(0xCCB82BB8)
public data class AuthenticationCodeInfo(
    @SerialName("phone_number")
    @get:JvmName("phoneNumber")
    public val phoneNumber: String,
    @get:JvmName("type")
    public val type: AuthenticationCodeType,
    @SerialName("next_type")
    @get:JvmName("nextType")
    public val nextType: AuthenticationCodeType,
    @get:JvmName("timeout")
    public val timeout: Int,
) {
    public companion object
}
