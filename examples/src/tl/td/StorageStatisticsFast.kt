// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storageStatisticsFast")
@TLCombinatorId(0xCB412861)
public data class StorageStatisticsFast(
    @SerialName("files_size")
    @get:JvmName("filesSize")
    public val filesSize: Long,
    @SerialName("file_count")
    @get:JvmName("fileCount")
    public val fileCount: Int,
    @SerialName("database_size")
    @get:JvmName("databaseSize")
    public val databaseSize: Long,
    @SerialName("language_pack_database_size")
    @get:JvmName("languagePackDatabaseSize")
    public val languagePackDatabaseSize: Long,
    @SerialName("log_size")
    @get:JvmName("logSize")
    public val logSize: Long,
) {
    public companion object
}
