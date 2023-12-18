// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.daemon.contractInfo")
@TLCombinatorId(0xD7744F09)
public data class StorageDaemonContractInfo(
    @get:JvmName("address")
    public val address: String,
    @get:JvmName("state")
    public val state: Int,
    @TLFixedSize(value = 32)
    @get:JvmName("torrent")
    public val torrent: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("created_time")
    @get:JvmName("createdTime")
    public val createdTime: Int,
    @SerialName("file_size")
    @get:JvmName("fileSize")
    public val fileSize: Long,
    @SerialName("downloaded_size")
    @get:JvmName("downloadedSize")
    public val downloadedSize: Long,
    @get:JvmName("rate")
    public val rate: String,
    @SerialName("max_span")
    @get:JvmName("maxSpan")
    public val maxSpan: Int,
    @SerialName("client_balance")
    @get:JvmName("clientBalance")
    public val clientBalance: String,
    @SerialName("contract_balance")
    @get:JvmName("contractBalance")
    public val contractBalance: String,
) {
    public companion object
}
