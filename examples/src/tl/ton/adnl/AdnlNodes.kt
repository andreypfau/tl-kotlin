// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.adnl

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("adnl.nodes")
@TLCombinatorId(0xA209DB56)
public data class AdnlNodes(
    @get:JvmName("nodes")
    public val nodes: List<AdnlNode>,
) {
    public companion object
}