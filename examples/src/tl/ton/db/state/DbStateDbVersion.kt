// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.state

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("db.state.dbVersion")
@TLCombinatorId(0xD93720F7)
public data class DbStateDbVersion(
    @get:JvmName("version")
    public val version: Int,
) {
    public companion object
}