// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.liteserver

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.PublicKey

@Serializable
@SerialName("liteserver.desc")
@TLCombinatorId(0xC449A474)
public data class LiteserverDesc(
    @get:JvmName("id")
    public val id: PublicKey,
    @get:JvmName("ip")
    public val ip: Int,
    @get:JvmName("port")
    public val port: Int,
) {
    public companion object
}
