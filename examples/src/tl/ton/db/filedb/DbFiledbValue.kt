// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.filedb

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("db.filedb.value")
@TLCombinatorId(0xF2DD1A2D)
public data class DbFiledbValue(
    @get:JvmName("key")
    public val key: DbFiledbKey,
    @TLFixedSize(value = 32)
    @get:JvmName("prev")
    public val prev: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @TLFixedSize(value = 32)
    @get:JvmName("next")
    public val next: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("file_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("fileHash")
    public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
