// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.files.index

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("db.files.index.value")
@TLCombinatorId(0xA2B1DAFC)
public data class DbFilesIndexValue(
    @get:JvmName("packages")
    public val packages: List<Int>,
    @SerialName("key_packages")
    @get:JvmName("keyPackages")
    public val keyPackages: List<Int>,
    @SerialName("temp_packages")
    @get:JvmName("tempPackages")
    public val tempPackages: List<Int>,
) {
    public companion object
}
