// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.state

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt

@Serializable
@SerialName("db.state.hardforks")
@TLCombinatorId(0x85F30D04)
public data class DbStateHardforks(
    @get:JvmName("blocks")
    public val blocks: List<TonNodeBlockIdExt>,
) {
    public companion object
}
