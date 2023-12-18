// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface SecureFile {
    @Serializable
    @SerialName("secureFileEmpty")
    @TLCombinatorId(0x64199744)
    public object SecureFileEmpty : tl.telegram.SecureFile

    @Serializable
    @SerialName("secureFile")
    @TLCombinatorId(0x7D09C27E)
    public data class SecureFile(
        @get:JvmName("id")
        public val id: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("size")
        public val size: Long,
        @SerialName("dc_id")
        @get:JvmName("dcId")
        public val dcId: Int,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("file_hash")
        @get:JvmName("fileHash")
        public val fileHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("secret")
        public val secret: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.telegram.SecureFile {
        public companion object
    }

    public companion object
}