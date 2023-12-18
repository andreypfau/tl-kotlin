// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface VectorPathCommand {
    @Serializable
    @SerialName("vectorPathCommandLine")
    @TLCombinatorId(0xDB663C8A)
    public data class VectorPathCommandLine(
        @SerialName("end_point")
        @get:JvmName("endPoint")
        public val endPoint: Point,
    ) : VectorPathCommand {
        public companion object
    }

    @Serializable
    @SerialName("vectorPathCommandCubicBezierCurve")
    @TLCombinatorId(0x494C3E3A)
    public data class VectorPathCommandCubicBezierCurve(
        @SerialName("start_control_point")
        @get:JvmName("startControlPoint")
        public val startControlPoint: Point,
        @SerialName("end_control_point")
        @get:JvmName("endControlPoint")
        public val endControlPoint: Point,
        @SerialName("end_point")
        @get:JvmName("endPoint")
        public val endPoint: Point,
    ) : VectorPathCommand {
        public companion object
    }

    public companion object
}
