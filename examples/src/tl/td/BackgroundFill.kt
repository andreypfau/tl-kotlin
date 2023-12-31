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
public sealed interface BackgroundFill {
    @Serializable
    @SerialName("backgroundFillSolid")
    @TLCombinatorId(0x3C3DBC1D)
    public data class BackgroundFillSolid(
        @get:JvmName("color")
        public val color: Int,
    ) : BackgroundFill {
        public companion object
    }

    @Serializable
    @SerialName("backgroundFillGradient")
    @TLCombinatorId(0x925FF17F)
    public data class BackgroundFillGradient(
        @SerialName("top_color")
        @get:JvmName("topColor")
        public val topColor: Int,
        @SerialName("bottom_color")
        @get:JvmName("bottomColor")
        public val bottomColor: Int,
        @SerialName("rotation_angle")
        @get:JvmName("rotationAngle")
        public val rotationAngle: Int,
    ) : BackgroundFill {
        public companion object
    }

    @Serializable
    @SerialName("backgroundFillFreeformGradient")
    @TLCombinatorId(0xBBB986B9)
    public data class BackgroundFillFreeformGradient(
        @get:JvmName("colors")
        public val colors: List<Int>,
    ) : BackgroundFill {
        public companion object
    }

    public companion object
}
