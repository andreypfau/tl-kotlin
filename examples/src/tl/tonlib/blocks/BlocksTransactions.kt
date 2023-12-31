// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.blocks

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.liteserver.LiteServerTransactionId
import tl.tonlib.ton.TonBlockIdExt

@Serializable
@SerialName("blocks.transactions")
@TLCombinatorId(0x8D6BF094)
public data class BlocksTransactions(
    @get:JvmName("id")
    public val id: TonBlockIdExt,
    @SerialName("req_count")
    @get:JvmName("reqCount")
    public val reqCount: Int,
    @get:JvmName("incomplete")
    public val incomplete: Boolean,
    @get:JvmName("transactions")
    public val transactions: List<LiteServerTransactionId>,
) {
    public companion object
}
