// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.ton

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
public sealed interface TonBlockId {
    @Serializable
    @SerialName("ton.blockId")
    @TLCombinatorId(0xC50B6E70)
    public data class BlockId(
        @SerialName("root_cell_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("rootCellHash")
        public val rootCellHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("file_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : TonBlockId {
        public companion object
    }

    @Serializable
    @SerialName("ton.blockIdApprove")
    @TLCombinatorId(0x2DD44A49)
    public data class BlockIdApprove(
        @SerialName("root_cell_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("rootCellHash")
        public val rootCellHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("file_hash")
        @TLFixedSize(value = 32)
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : TonBlockId {
        public companion object
    }

    public companion object
}
