// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine.validator

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validator.perfTimerStatsByName")
@TLCombinatorId(0x82BACDE4)
public data class EngineValidatorPerfTimerStatsByName(
    @get:JvmName("name")
    public val name: String,
    @get:JvmName("stats")
    public val stats: List<EngineValidatorOnePerfTimerStat>,
) {
    public companion object
}
