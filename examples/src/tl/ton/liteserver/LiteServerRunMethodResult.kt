// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.liteserver

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt

@Serializable
@SerialName("liteServer.runMethodResult")
@TLCombinatorId(0xA39A616B)
public data class LiteServerRunMethodResult(
    @get:JvmName("mode")
    public val mode: Int,
    @get:JvmName("id")
    public val id: TonNodeBlockIdExt,
    @get:JvmName("shardblk")
    public val shardblk: TonNodeBlockIdExt,
    @SerialName("shard_proof")
    @TLConditional("mode", 0)
    @get:JvmName("shardProof")
    public val shardProof: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
    @TLConditional("mode", 0)
    @get:JvmName("proof")
    public val proof: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
    @SerialName("state_proof")
    @TLConditional("mode", 1)
    @get:JvmName("stateProof")
    public val stateProof: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
    @SerialName("init_c7")
    @TLConditional("mode", 3)
    @get:JvmName("initC7")
    public val initC7: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
    @SerialName("lib_extras")
    @TLConditional("mode", 4)
    @get:JvmName("libExtras")
    public val libExtras: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
    @SerialName("exit_code")
    @get:JvmName("exitCode")
    public val exitCode: Int,
    @TLConditional("mode", 2)
    @get:JvmName("result")
    public val result: @Serializable(Base64ByteStringSerializer::class) ByteString? = null,
) {
    public companion object
}