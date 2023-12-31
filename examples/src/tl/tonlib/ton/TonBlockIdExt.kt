// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.ton

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("ton.blockIdExt")
@TLCombinatorId(0x7910FC9A)
public data class TonBlockIdExt(
    @get:JvmName("workchain")
    public val workchain: Int,
    @get:JvmName("shard")
    public val shard: Long,
    @get:JvmName("seqno")
    public val seqno: Int,
    @SerialName("root_hash")
    @get:JvmName("rootHash")
    public val rootHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("file_hash")
    @get:JvmName("fileHash")
    public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
