// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.catchain

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.ton.catchain.block.CatchainBlockDep

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface CatchainDifference {
    @Serializable
    @SerialName("catchain.difference")
    @TLCombinatorId(0x1415D1CA)
    public data class Difference(
        @SerialName("sent_upto")
        @get:JvmName("sentUpto")
        public val sentUpto: List<Int>,
    ) : CatchainDifference {
        public companion object
    }

    @Serializable
    @SerialName("catchain.differenceFork")
    @TLCombinatorId(0x4927C06F)
    public data class DifferenceFork(
        @get:JvmName("left")
        public val left: CatchainBlockDep,
        @get:JvmName("right")
        public val right: CatchainBlockDep,
    ) : CatchainDifference {
        public companion object
    }

    public companion object
}
