// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.provider.db

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.provider.db.storageContract")
@TLCombinatorId(0xEEB3A732)
public data class StorageProviderDbStorageContract(
    @SerialName("torrent_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("torrentHash")
    public val torrentHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("microchunk_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("microchunkHash")
    public val microchunkHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("created_time")
    @get:JvmName("createdTime")
    public val createdTime: Int,
    @get:JvmName("state")
    public val state: Int,
    @SerialName("file_size")
    @get:JvmName("fileSize")
    public val fileSize: Long,
    @get:JvmName("rate")
    public val rate: String,
    @SerialName("max_span")
    @get:JvmName("maxSpan")
    public val maxSpan: Int,
) {
    public companion object
}
