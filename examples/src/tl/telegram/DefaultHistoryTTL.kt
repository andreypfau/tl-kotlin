// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("defaultHistoryTTL")
@TLCombinatorId(0x43B46B20)
public data class DefaultHistoryTTL(
    @get:JvmName("period")
    public val period: Int,
) {
    public companion object
}
