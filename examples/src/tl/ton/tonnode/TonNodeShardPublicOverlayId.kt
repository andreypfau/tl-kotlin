// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.tonnode

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("tonNode.shardPublicOverlayId")
@TLCombinatorId(0x4D9ED329)
public data class TonNodeShardPublicOverlayId(
    @get:JvmName("workchain")
    public val workchain: Int,
    @get:JvmName("shard")
    public val shard: Long,
    @SerialName("zero_state_file_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("zeroStateFileHash")
    public val zeroStateFileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
