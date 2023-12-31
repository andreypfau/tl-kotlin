// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.blocks

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.ton.TonBlockIdExt

@Serializable
@SerialName("blocks.header")
@TLCombinatorId(0x58298662)
public data class BlocksHeader(
    @get:JvmName("id")
    public val id: TonBlockIdExt,
    @SerialName("global_id")
    @get:JvmName("globalId")
    public val globalId: Int,
    @get:JvmName("version")
    public val version: Int,
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("after_merge")
    @get:JvmName("afterMerge")
    public val afterMerge: Boolean,
    @SerialName("after_split")
    @get:JvmName("afterSplit")
    public val afterSplit: Boolean,
    @SerialName("before_split")
    @get:JvmName("beforeSplit")
    public val beforeSplit: Boolean,
    @SerialName("want_merge")
    @get:JvmName("wantMerge")
    public val wantMerge: Boolean,
    @SerialName("want_split")
    @get:JvmName("wantSplit")
    public val wantSplit: Boolean,
    @SerialName("validator_list_hash_short")
    @get:JvmName("validatorListHashShort")
    public val validatorListHashShort: Int,
    @SerialName("catchain_seqno")
    @get:JvmName("catchainSeqno")
    public val catchainSeqno: Int,
    @SerialName("min_ref_mc_seqno")
    @get:JvmName("minRefMcSeqno")
    public val minRefMcSeqno: Int,
    @SerialName("is_key_block")
    @get:JvmName("isKeyBlock")
    public val isKeyBlock: Boolean,
    @SerialName("prev_key_block_seqno")
    @get:JvmName("prevKeyBlockSeqno")
    public val prevKeyBlockSeqno: Int,
    @SerialName("start_lt")
    @get:JvmName("startLt")
    public val startLt: Long,
    @SerialName("end_lt")
    @get:JvmName("endLt")
    public val endLt: Long,
    @SerialName("gen_utime")
    @get:JvmName("genUtime")
    public val genUtime: Long,
    @SerialName("vert_seqno")
    @get:JvmName("vertSeqno")
    public val vertSeqno: Int,
    @SerialName("prev_blocks")
    @get:JvmName("prevBlocks")
    public val prevBlocks: List<TonBlockIdExt>,
) {
    public companion object
}
