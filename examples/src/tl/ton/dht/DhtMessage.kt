// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.dht

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("dht.message")
@TLCombinatorId(0xBC0CDB8E)
public data class DhtMessage(
    @get:JvmName("node")
    public val node: DhtNode,
) {
    public companion object
}
