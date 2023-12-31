// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface InputGeoPoint {
    @Serializable
    @SerialName("inputGeoPointEmpty")
    @TLCombinatorId(0xE4C123D6)
    public object InputGeoPointEmpty : tl.telegram.InputGeoPoint

    @Serializable
    @SerialName("inputGeoPoint")
    @TLCombinatorId(0x48222FAF)
    public data class InputGeoPoint(
        @get:JvmName("flags")
        public val flags: Int,
        @get:JvmName("lat")
        public val lat: Double,
        @get:JvmName("long")
        public val long: Double,
        @SerialName("accuracy_radius")
        @TLConditional("flags", 0)
        @get:JvmName("accuracyRadius")
        public val accuracyRadius: Int? = null,
    ) : tl.telegram.InputGeoPoint {
        public companion object
    }

    public companion object
}
