// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.catchain

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("catchain.blocks")
@TLCombinatorId(0x50ECD1C1)
public data class CatchainBlocks(
    @get:JvmName("blocks")
    public val blocks: List<CatchainBlock>,
) {
    public companion object
}
