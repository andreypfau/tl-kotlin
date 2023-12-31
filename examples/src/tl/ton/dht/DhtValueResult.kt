// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.dht

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface DhtValueResult {
    @Serializable
    @SerialName("dht.valueNotFound")
    @TLCombinatorId(0xA2620568)
    public data class ValueNotFound(
        @get:JvmName("nodes")
        public val nodes: DhtNodes,
    ) : DhtValueResult {
        public companion object
    }

    @Serializable
    @SerialName("dht.valueFound")
    @TLCombinatorId(0xE40CF774)
    public data class ValueFound(
        @get:JvmName("value")
        public val `value`: DhtValue,
    ) : DhtValueResult {
        public companion object
    }

    public companion object
}
