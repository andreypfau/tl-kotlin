// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.dht.db

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("dht.db.key.bucket")
@TLCombinatorId(0xA368AE4C)
public data class DhtDbKey(
    @get:JvmName("id")
    public val id: Int,
) {
    public companion object
}