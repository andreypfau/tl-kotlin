// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("popularContact")
@TLCombinatorId(0x5CE14175)
public data class PopularContact(
    @SerialName("client_id")
    @get:JvmName("clientId")
    public val clientId: Long,
    @get:JvmName("importers")
    public val importers: Int,
) {
    public companion object
}
