// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface Hashable {
    @Serializable
    @SerialName("hashable.bool")
    @TLCombinatorId(0xCF61441C)
    public data class Bool(
        @get:JvmName("value")
        public val `value`: Boolean,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.int32")
    @TLCombinatorId(0xD3B59356)
    public data class Int32(
        @get:JvmName("value")
        public val `value`: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.int64")
    @TLCombinatorId(0xE7DA8E42)
    public data class Int64(
        @get:JvmName("value")
        public val `value`: Long,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.int256")
    @TLCombinatorId(0x3A2313CF)
    public data class Int256(
        @TLFixedSize(value = 32)
        @get:JvmName("value")
        public val `value`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.bytes")
    @TLCombinatorId(0x0713DE12)
    public data class Bytes(
        @get:JvmName("value")
        public val `value`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.pair")
    @TLCombinatorId(0xC7E56895)
    public data class Pair(
        @get:JvmName("left")
        public val left: Int,
        @get:JvmName("right")
        public val right: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.vector")
    @TLCombinatorId(0xDF34C36D)
    public data class Vector(
        @get:JvmName("value")
        public val `value`: List<Int>,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.validatorSessionOldRound")
    @TLCombinatorId(0x478B67A9)
    public data class ValidatorSessionOldRound(
        @get:JvmName("seqno")
        public val seqno: Int,
        @get:JvmName("block")
        public val block: Int,
        @get:JvmName("signatures")
        public val signatures: Int,
        @SerialName("approve_signatures")
        @get:JvmName("approveSignatures")
        public val approveSignatures: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.validatorSessionRoundAttempt")
    @TLCombinatorId(0x4C11FFAD)
    public data class ValidatorSessionRoundAttempt(
        @get:JvmName("seqno")
        public val seqno: Int,
        @get:JvmName("votes")
        public val votes: Int,
        @get:JvmName("precommitted")
        public val precommitted: Int,
        @SerialName("vote_for_inited")
        @get:JvmName("voteForInited")
        public val voteForInited: Int,
        @SerialName("vote_for")
        @get:JvmName("voteFor")
        public val voteFor: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.validatorSessionRound")
    @TLCombinatorId(0x35774FE3)
    public data class ValidatorSessionRound(
        @SerialName("locked_round")
        @get:JvmName("lockedRound")
        public val lockedRound: Int,
        @SerialName("locked_block")
        @get:JvmName("lockedBlock")
        public val lockedBlock: Int,
        @get:JvmName("seqno")
        public val seqno: Int,
        @get:JvmName("precommitted")
        public val precommitted: Boolean,
        @SerialName("first_attempt")
        @get:JvmName("firstAttempt")
        public val firstAttempt: Int,
        @SerialName("approved_blocks")
        @get:JvmName("approvedBlocks")
        public val approvedBlocks: Int,
        @get:JvmName("signatures")
        public val signatures: Int,
        @get:JvmName("attempts")
        public val attempts: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.blockSignature")
    @TLCombinatorId(0x37E192A2)
    public data class BlockSignature(
        @get:JvmName("signature")
        public val signature: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.sentBlock")
    @TLCombinatorId(0xBDB9952B)
    public data class SentBlock(
        @get:JvmName("src")
        public val src: Int,
        @SerialName("root_hash")
        @get:JvmName("rootHash")
        public val rootHash: Int,
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: Int,
        @SerialName("collated_data_file_hash")
        @get:JvmName("collatedDataFileHash")
        public val collatedDataFileHash: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.sentBlockEmpty")
    @TLCombinatorId(0x9EF246AF)
    public object SentBlockEmpty : Hashable

    @Serializable
    @SerialName("hashable.vote")
    @TLCombinatorId(0xAEBF2BC5)
    public data class Vote(
        @get:JvmName("block")
        public val block: Int,
        @get:JvmName("node")
        public val node: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.blockCandidate")
    @TLCombinatorId(0x0BA9B10D)
    public data class BlockCandidate(
        @get:JvmName("block")
        public val block: Int,
        @get:JvmName("approved")
        public val approved: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.blockVoteCandidate")
    @TLCombinatorId(0xCF0D6FE5)
    public data class BlockVoteCandidate(
        @get:JvmName("block")
        public val block: Int,
        @get:JvmName("approved")
        public val approved: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.blockCandidateAttempt")
    @TLCombinatorId(0x3F5C7D0B)
    public data class BlockCandidateAttempt(
        @get:JvmName("block")
        public val block: Int,
        @get:JvmName("votes")
        public val votes: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.cntVector")
    @TLCombinatorId(0x0B286F38)
    public data class CntVector(
        @get:JvmName("data")
        public val `data`: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.cntSortedVector")
    @TLCombinatorId(0x7B964659)
    public data class CntSortedVector(
        @get:JvmName("data")
        public val `data`: Int,
    ) : Hashable {
        public companion object
    }

    @Serializable
    @SerialName("hashable.validatorSession")
    @TLCombinatorId(0x681263D5)
    public data class ValidatorSession(
        @get:JvmName("ts")
        public val ts: Int,
        @SerialName("old_rounds")
        @get:JvmName("oldRounds")
        public val oldRounds: Int,
        @SerialName("cur_round")
        @get:JvmName("curRound")
        public val curRound: Int,
    ) : Hashable {
        public companion object
    }

    public companion object
}