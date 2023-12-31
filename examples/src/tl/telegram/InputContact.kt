// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("inputPhoneContact")
@TLCombinatorId(0xF392B7F4)
public data class InputContact(
    @SerialName("client_id")
    @get:JvmName("clientId")
    public val clientId: Long,
    @get:JvmName("phone")
    public val phone: String,
    @SerialName("first_name")
    @get:JvmName("firstName")
    public val firstName: String,
    @SerialName("last_name")
    @get:JvmName("lastName")
    public val lastName: String,
) {
    public companion object
}
