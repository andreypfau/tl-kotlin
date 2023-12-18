// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.validator

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.ton.engine.validator.EngineValidatorGroupMember

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface ValidatorGroup {
    @Serializable
    @SerialName("validator.group")
    @TLCombinatorId(0xF8D87EA1)
    public data class Group(
        @get:JvmName("workchain")
        public val workchain: Int,
        @get:JvmName("shard")
        public val shard: Long,
        @SerialName("catchain_seqno")
        @get:JvmName("catchainSeqno")
        public val catchainSeqno: Int,
        @SerialName("config_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("configHash")
        public val configHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("members")
        public val members: List<EngineValidatorGroupMember>,
    ) : ValidatorGroup {
        public companion object
    }

    @Serializable
    @SerialName("validator.groupEx")
    @TLCombinatorId(0x1C924DFE)
    public data class GroupEx(
        @get:JvmName("workchain")
        public val workchain: Int,
        @get:JvmName("shard")
        public val shard: Long,
        @SerialName("vertical_seqno")
        @get:JvmName("verticalSeqno")
        public val verticalSeqno: Int,
        @SerialName("catchain_seqno")
        @get:JvmName("catchainSeqno")
        public val catchainSeqno: Int,
        @SerialName("config_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("configHash")
        public val configHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("members")
        public val members: List<EngineValidatorGroupMember>,
    ) : ValidatorGroup {
        public companion object
    }

    @Serializable
    @SerialName("validator.groupNew")
    @TLCombinatorId(0x9843A14D)
    public data class GroupNew(
        @get:JvmName("workchain")
        public val workchain: Int,
        @get:JvmName("shard")
        public val shard: Long,
        @SerialName("vertical_seqno")
        @get:JvmName("verticalSeqno")
        public val verticalSeqno: Int,
        @SerialName("last_key_block_seqno")
        @get:JvmName("lastKeyBlockSeqno")
        public val lastKeyBlockSeqno: Int,
        @SerialName("catchain_seqno")
        @get:JvmName("catchainSeqno")
        public val catchainSeqno: Int,
        @SerialName("config_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("configHash")
        public val configHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("members")
        public val members: List<EngineValidatorGroupMember>,
    ) : ValidatorGroup {
        public companion object
    }

    public companion object
}