// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface StoragePriorityAction {
    @Serializable
    @SerialName("storage.priorityAction.all")
    @TLCombinatorId(0xFE238940)
    public data class All(
        @get:JvmName("priority")
        public val priority: Int,
    ) : StoragePriorityAction {
        public companion object
    }

    @Serializable
    @SerialName("storage.priorityAction.idx")
    @TLCombinatorId(0x950FB728)
    public data class Idx(
        @get:JvmName("idx")
        public val idx: Long,
        @get:JvmName("priority")
        public val priority: Int,
    ) : StoragePriorityAction {
        public companion object
    }

    @Serializable
    @SerialName("storage.priorityAction.name")
    @TLCombinatorId(0x0124D1C0)
    public data class Name(
        @get:JvmName("name")
        public val name: String,
        @get:JvmName("priority")
        public val priority: Int,
    ) : StoragePriorityAction {
        public companion object
    }

    public companion object
}