// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.options

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("options.info")
@TLCombinatorId(0xFC251C80)
public data class OptionsInfo(
    @SerialName("config_info")
    @get:JvmName("configInfo")
    public val configInfo: OptionsConfigInfo,
) {
    public companion object
}