// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine.validator

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validator.time")
@TLCombinatorId(0xDF5FA1FE)
public data class EngineValidatorTime(
    @get:JvmName("time")
    public val time: Int,
) {
    public companion object
}