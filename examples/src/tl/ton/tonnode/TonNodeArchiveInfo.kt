// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.tonnode

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface TonNodeArchiveInfo {
    @Serializable
    @SerialName("tonNode.archiveNotFound")
    @TLCombinatorId(0x99291683)
    public object ArchiveNotFound : TonNodeArchiveInfo

    @Serializable
    @SerialName("tonNode.archiveInfo")
    @TLCombinatorId(0x19EFFF8C)
    public data class ArchiveInfo(
        @get:JvmName("id")
        public val id: Long,
    ) : TonNodeArchiveInfo {
        public companion object
    }

    public companion object
}
