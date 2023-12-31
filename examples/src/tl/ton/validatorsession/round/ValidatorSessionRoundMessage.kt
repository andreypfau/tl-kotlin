// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.validatorsession.round

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
public sealed interface ValidatorSessionRoundMessage {
    @Serializable
    @SerialName("validatorSession.message.submittedBlock")
    @TLCombinatorId(0x127624B6)
    public data class SubmittedBlock(
        @get:JvmName("round")
        public val round: Int,
        @SerialName("root_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("rootHash")
        public val rootHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("file_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("collated_data_file_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("collatedDataFileHash")
        public val collatedDataFileHash: @Serializable(Base64ByteStringSerializer::class)
                ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.approvedBlock")
    @TLCombinatorId(0x04A5B581)
    public data class ApprovedBlock(
        @get:JvmName("round")
        public val round: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("signature")
        public val signature: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.rejectedBlock")
    @TLCombinatorId(0x95884E6B)
    public data class RejectedBlock(
        @get:JvmName("round")
        public val round: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("reason")
        public val reason: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.commit")
    @TLCombinatorId(0xAC129EF5)
    public data class Commit(
        @get:JvmName("round")
        public val round: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("signature")
        public val signature: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.vote")
    @TLCombinatorId(0x9A3251C7)
    public data class Vote(
        @get:JvmName("round")
        public val round: Int,
        @get:JvmName("attempt")
        public val attempt: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.voteFor")
    @TLCombinatorId(0x61F0FE2F)
    public data class VoteFor(
        @get:JvmName("round")
        public val round: Int,
        @get:JvmName("attempt")
        public val attempt: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.precommit")
    @TLCombinatorId(0xA854B552)
    public data class Precommit(
        @get:JvmName("round")
        public val round: Int,
        @get:JvmName("attempt")
        public val attempt: Int,
        @TLFixedSize(value = 32)
        @get:JvmName("candidate")
        public val candidate: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    @Serializable
    @SerialName("validatorSession.message.empty")
    @TLCombinatorId(0x4A201FA9)
    public data class Empty(
        @get:JvmName("round")
        public val round: Int,
        @get:JvmName("attempt")
        public val attempt: Int,
    ) : ValidatorSessionRoundMessage {
        public companion object
    }

    public companion object
}
