// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.db

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("storage.db.piecesInDb")
@TLCombinatorId(0x0619B43C)
public data class StorageDbPiecesInDb(
    @get:JvmName("pieces")
    public val pieces: List<Long>,
) {
    public companion object
}
