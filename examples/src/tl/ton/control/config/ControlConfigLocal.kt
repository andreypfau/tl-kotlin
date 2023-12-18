// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.control.config

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.PrivateKey

@Serializable
@SerialName("control.config.local")
@TLCombinatorId(0x751DECED)
public data class ControlConfigLocal(
    @get:JvmName("priv")
    public val priv: PrivateKey,
    @TLFixedSize(value = 32)
    @get:JvmName("pub")
    public val pub: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @get:JvmName("port")
    public val port: Int,
) {
    public companion object
}