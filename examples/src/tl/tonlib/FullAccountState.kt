// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.`internal`.InternalTransactionId
import tl.tonlib.ton.TonBlockIdExt

@Serializable
@SerialName("fullAccountState")
@TLCombinatorId(0x56D23A49)
public data class FullAccountState(
    @get:JvmName("address")
    public val address: AccountAddress,
    @get:JvmName("balance")
    public val balance: Long,
    @SerialName("last_transaction_id")
    @get:JvmName("lastTransactionId")
    public val lastTransactionId: InternalTransactionId,
    @SerialName("block_id")
    @get:JvmName("blockId")
    public val blockId: TonBlockIdExt,
    @SerialName("sync_utime")
    @get:JvmName("syncUtime")
    public val syncUtime: Long,
    @SerialName("account_state")
    @get:JvmName("accountState")
    public val accountState: AccountState,
    @get:JvmName("revision")
    public val revision: Int,
) {
    public companion object
}
