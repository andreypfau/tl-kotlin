// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.catchain

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("catchain.blockUpdate")
@TLCombinatorId(0x236758C4)
public data class CatchainUpdate(
    @get:JvmName("block")
    public val block: CatchainBlock,
) {
    public companion object
}