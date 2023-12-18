// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.raw

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.`internal`.InternalTransactionId

@Serializable
@SerialName("raw.transactions")
@TLCombinatorId(0x84FAE8ED)
public data class RawTransactions(
    @get:JvmName("transactions")
    public val transactions: List<RawTransaction>,
    @SerialName("previous_transaction_id")
    @get:JvmName("previousTransactionId")
    public val previousTransactionId: InternalTransactionId,
) {
    public companion object
}
