// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface Update {
    @Serializable
    @SerialName("updateSendLiteServerQuery")
    @TLCombinatorId(0xA34E95DC)
    public data class UpdateSendLiteServerQuery(
        @get:JvmName("id")
        public val id: Long,
        @get:JvmName("data")
        public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : Update {
        public companion object
    }

    @Serializable
    @SerialName("updateSyncState")
    @TLCombinatorId(0x47C823DE)
    public data class UpdateSyncState(
        @SerialName("sync_state")
        @get:JvmName("syncState")
        public val syncState: SyncState,
    ) : Update {
        public companion object
    }

    public companion object
}