// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("usernames")
@TLCombinatorId(0x2FA90EF5)
public data class Usernames(
    @SerialName("active_usernames")
    @get:JvmName("activeUsernames")
    public val activeUsernames: List<String>,
    @SerialName("disabled_usernames")
    @get:JvmName("disabledUsernames")
    public val disabledUsernames: List<String>,
    @SerialName("editable_username")
    @get:JvmName("editableUsername")
    public val editableUsername: String,
) {
    public companion object
}
