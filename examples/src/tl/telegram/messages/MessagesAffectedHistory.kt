// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("messages.affectedHistory")
@TLCombinatorId(0xB45C69D1)
public data class MessagesAffectedHistory(
    @get:JvmName("pts")
    public val pts: Int,
    @SerialName("pts_count")
    @get:JvmName("ptsCount")
    public val ptsCount: Int,
    @get:JvmName("offset")
    public val offset: Int,
) {
    public companion object
}
