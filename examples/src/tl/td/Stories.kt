// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("stories")
@TLCombinatorId(0x7499C75F)
public data class Stories(
    @SerialName("total_count")
    @get:JvmName("totalCount")
    public val totalCount: Int,
    @get:JvmName("stories")
    public val stories: List<Story>,
) {
    public companion object
}
