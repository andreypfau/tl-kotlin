// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.blocks

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.ton.TonBlockIdExt

@Serializable
@SerialName("blocks.blockSignatures")
@TLCombinatorId(0xE801DB9B)
public data class BlocksBlockSignatures(
    @get:JvmName("id")
    public val id: TonBlockIdExt,
    @get:JvmName("signatures")
    public val signatures: List<BlocksSignature>,
) {
    public companion object
}
