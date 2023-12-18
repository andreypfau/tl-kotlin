// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.liteserver

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt
import tl.ton.tonnode.TonNodeZeroStateIdExt

@Serializable
@SerialName("liteServer.masterchainInfoExt")
@TLCombinatorId(0xA8CCE0F5)
public data class LiteServerMasterchainInfoExt(
    @get:JvmName("mode")
    public val mode: Int,
    @get:JvmName("version")
    public val version: Int,
    @get:JvmName("capabilities")
    public val capabilities: Long,
    @get:JvmName("last")
    public val last: TonNodeBlockIdExt,
    @SerialName("last_utime")
    @get:JvmName("lastUtime")
    public val lastUtime: Int,
    @get:JvmName("now")
    public val now: Int,
    @SerialName("state_root_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("stateRootHash")
    public val stateRootHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("init")
    public val `init`: TonNodeZeroStateIdExt,
) {
    public companion object
}