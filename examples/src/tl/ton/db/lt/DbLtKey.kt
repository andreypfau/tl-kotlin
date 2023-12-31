// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.lt

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface DbLtKey {
    @Serializable
    @SerialName("db.lt.el.key")
    @TLCombinatorId(0xA5321AE2)
    public data class ElKey(
        @get:JvmName("workchain")
        public val workchain: Int,
        @get:JvmName("shard")
        public val shard: Long,
        @get:JvmName("idx")
        public val idx: Int,
    ) : DbLtKey {
        public companion object
    }

    @Serializable
    @SerialName("db.lt.desc.key")
    @TLCombinatorId(0xF1E3E791)
    public data class DescKey(
        @get:JvmName("workchain")
        public val workchain: Int,
        @get:JvmName("shard")
        public val shard: Long,
    ) : DbLtKey {
        public companion object
    }

    @Serializable
    @SerialName("db.lt.shard.key")
    @TLCombinatorId(0x50A6F90F)
    public data class ShardKey(
        @get:JvmName("idx")
        public val idx: Int,
    ) : DbLtKey {
        public companion object
    }

    @Serializable
    @SerialName("db.lt.status.key")
    @TLCombinatorId(0x776C6057)
    public object StatusKey : DbLtKey

    public companion object
}
