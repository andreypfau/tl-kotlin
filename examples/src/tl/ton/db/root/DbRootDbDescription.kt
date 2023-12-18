// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.root

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt

@Serializable
@SerialName("db.root.dbDescription")
@TLCombinatorId(0xB41873F3)
public data class DbRootDbDescription(
    @get:JvmName("version")
    public val version: Int,
    @SerialName("first_masterchain_block_id")
    @get:JvmName("firstMasterchainBlockId")
    public val firstMasterchainBlockId: TonNodeBlockIdExt,
    @get:JvmName("flags")
    public val flags: Int,
) {
    public companion object
}