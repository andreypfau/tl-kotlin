// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class MaskPoint {
    @SerialName("maskPointForehead")
    @TLCombinatorId(0x3D3E96C5)
    MASK_POINT_FOREHEAD,
    @SerialName("maskPointEyes")
    @TLCombinatorId(0x68351B4D)
    MASK_POINT_EYES,
    @SerialName("maskPointMouth")
    @TLCombinatorId(0x188B29DE)
    MASK_POINT_MOUTH,
    @SerialName("maskPointChin")
    @TLCombinatorId(0x1FE36187)
    MASK_POINT_CHIN,
    ;

    public companion object
}