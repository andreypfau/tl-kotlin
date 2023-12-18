// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.files

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface DbFilesKey {
    @Serializable
    @SerialName("db.files.index.key")
    @TLCombinatorId(0x7DC40502)
    public object IndexKey : DbFilesKey

    @Serializable
    @SerialName("db.files.package.key")
    @TLCombinatorId(0xA504033E)
    public data class PackageKey(
        @SerialName("package_id")
        @get:JvmName("packageId")
        public val packageId: Int,
        @get:JvmName("key")
        public val key: Boolean,
        @get:JvmName("temp")
        public val temp: Boolean,
    ) : DbFilesKey {
        public companion object
    }

    public companion object
}