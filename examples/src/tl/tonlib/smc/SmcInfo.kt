// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.smc

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("smc.info")
@TLCombinatorId(0x439B963C)
public data class SmcInfo(
    @get:JvmName("id")
    public val id: Long,
) {
    public companion object
}