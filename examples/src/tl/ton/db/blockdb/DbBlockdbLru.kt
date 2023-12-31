// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.blockdb

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt

@Serializable
@SerialName("db.blockdb.lru")
@TLCombinatorId(0xC11655B3)
public data class DbBlockdbLru(
    @get:JvmName("id")
    public val id: TonNodeBlockIdExt,
    @TLFixedSize(value = 32)
    @get:JvmName("prev")
    public val prev: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @TLFixedSize(value = 32)
    @get:JvmName("next")
    public val next: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
