// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("contactStatus")
@TLCombinatorId(0x16D9703B)
public data class ContactStatus(
    @SerialName("user_id")
    @get:JvmName("userId")
    public val userId: Long,
    @get:JvmName("status")
    public val status: UserStatus,
) {
    public companion object
}
