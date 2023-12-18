// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("sendAsPeer")
@TLCombinatorId(0xB81C7034)
public data class SendAsPeer(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("premium_required")
    @TLConditional("flags", 0)
    @get:JvmName("premiumRequired")
    public val premiumRequired: Unit? = null,
    @get:JvmName("peer")
    public val peer: Peer,
) {
    public companion object
}
