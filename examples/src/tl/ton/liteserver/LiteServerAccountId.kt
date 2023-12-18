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

@Serializable
@SerialName("liteServer.accountId")
@TLCombinatorId(0x75A0E2C5)
public data class LiteServerAccountId(
    @get:JvmName("workchain")
    public val workchain: Int,
    @TLFixedSize(value = 32)
    @get:JvmName("id")
    public val id: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
