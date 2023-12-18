// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("remoteFile")
@TLCombinatorId(0x2C917856)
public data class RemoteFile(
    @get:JvmName("id")
    public val id: String,
    @SerialName("unique_id")
    @get:JvmName("uniqueId")
    public val uniqueId: String,
    @SerialName("is_uploading_active")
    @get:JvmName("isUploadingActive")
    public val isUploadingActive: Boolean,
    @SerialName("is_uploading_completed")
    @get:JvmName("isUploadingCompleted")
    public val isUploadingCompleted: Boolean,
    @SerialName("uploaded_size")
    @get:JvmName("uploadedSize")
    public val uploadedSize: Long,
) {
    public companion object
}