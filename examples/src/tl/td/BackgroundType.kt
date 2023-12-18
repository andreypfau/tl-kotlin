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
public sealed interface BackgroundType {
    @Serializable
    @SerialName("backgroundTypeWallpaper")
    @TLCombinatorId(0x758C4C7B)
    public data class BackgroundTypeWallpaper(
        @SerialName("is_blurred")
        @get:JvmName("isBlurred")
        public val isBlurred: Boolean,
        @SerialName("is_moving")
        @get:JvmName("isMoving")
        public val isMoving: Boolean,
    ) : BackgroundType {
        public companion object
    }

    @Serializable
    @SerialName("backgroundTypePattern")
    @TLCombinatorId(0x4CE716FD)
    public data class BackgroundTypePattern(
        @get:JvmName("fill")
        public val fill: BackgroundFill,
        @get:JvmName("intensity")
        public val intensity: Int,
        @SerialName("is_inverted")
        @get:JvmName("isInverted")
        public val isInverted: Boolean,
        @SerialName("is_moving")
        @get:JvmName("isMoving")
        public val isMoving: Boolean,
    ) : BackgroundType {
        public companion object
    }

    @Serializable
    @SerialName("backgroundTypeFill")
    @TLCombinatorId(0x3B301C2C)
    public data class BackgroundTypeFill(
        @get:JvmName("fill")
        public val fill: BackgroundFill,
    ) : BackgroundType {
        public companion object
    }

    public companion object
}
