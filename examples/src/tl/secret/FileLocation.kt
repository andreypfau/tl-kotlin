// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.secret

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface FileLocation {
    @Serializable
    @SerialName("fileLocationUnavailable")
    @TLCombinatorId(0x7C596B46)
    public data class FileLocationUnavailable(
        @SerialName("volume_id")
        @get:JvmName("volumeId")
        public val volumeId: Long,
        @SerialName("local_id")
        @get:JvmName("localId")
        public val localId: Int,
        @get:JvmName("secret")
        public val secret: Long,
    ) : tl.secret.FileLocation {
        public companion object
    }

    @Serializable
    @SerialName("fileLocation")
    @TLCombinatorId(0x53D69076)
    public data class FileLocation(
        @SerialName("dc_id")
        @get:JvmName("dcId")
        public val dcId: Int,
        @SerialName("volume_id")
        @get:JvmName("volumeId")
        public val volumeId: Long,
        @SerialName("local_id")
        @get:JvmName("localId")
        public val localId: Int,
        @get:JvmName("secret")
        public val secret: Long,
    ) : tl.secret.FileLocation {
        public companion object
    }

    public companion object
}
