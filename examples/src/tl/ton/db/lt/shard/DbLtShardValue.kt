// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.lt.shard

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("db.lt.shard.value")
@TLCombinatorId(0x3C739A7B)
public data class DbLtShardValue(
    @get:JvmName("workchain")
    public val workchain: Int,
    @get:JvmName("shard")
    public val shard: Long,
) {
    public companion object
}
