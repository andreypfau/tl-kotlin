// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("config")
@TLCombinatorId(0xA44E0238)
public data class Config(
    @get:JvmName("config")
    public val config: String,
    @SerialName("blockchain_name")
    @get:JvmName("blockchainName")
    public val blockchainName: String,
    @SerialName("use_callbacks_for_network")
    @get:JvmName("useCallbacksForNetwork")
    public val useCallbacksForNetwork: Boolean,
    @SerialName("ignore_cache")
    @get:JvmName("ignoreCache")
    public val ignoreCache: Boolean,
) {
    public companion object
}
