// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("proxies")
@TLCombinatorId(0x478D5EE5)
public data class Proxies(
    @get:JvmName("proxies")
    public val proxies: List<Proxy>,
) {
    public companion object
}
