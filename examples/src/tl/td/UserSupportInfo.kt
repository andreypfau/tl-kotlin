// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("userSupportInfo")
@TLCombinatorId(0xB50E1C29)
public data class UserSupportInfo(
    @get:JvmName("message")
    public val message: FormattedText,
    @get:JvmName("author")
    public val author: String,
    @get:JvmName("date")
    public val date: Int,
) {
    public companion object
}
