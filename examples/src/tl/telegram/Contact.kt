// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("contact")
@TLCombinatorId(0x145ADE0B)
public data class Contact(
    @SerialName("user_id")
    @get:JvmName("userId")
    public val userId: Long,
    @get:JvmName("mutual")
    public val mutual: Boolean,
) {
    public companion object
}
