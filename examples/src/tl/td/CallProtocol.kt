// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("callProtocol")
@TLCombinatorId(0xBFE4366F)
public data class CallProtocol(
    @SerialName("udp_p2p")
    @get:JvmName("udpP2p")
    public val udpP2p: Boolean,
    @SerialName("udp_reflector")
    @get:JvmName("udpReflector")
    public val udpReflector: Boolean,
    @SerialName("min_layer")
    @get:JvmName("minLayer")
    public val minLayer: Int,
    @SerialName("max_layer")
    @get:JvmName("maxLayer")
    public val maxLayer: Int,
    @SerialName("library_versions")
    @get:JvmName("libraryVersions")
    public val libraryVersions: List<String>,
) {
    public companion object
}