// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("sponsoredMessages")
@TLCombinatorId(0xDFF3BD6B)
public data class SponsoredMessages(
    @get:JvmName("messages")
    public val messages: List<SponsoredMessage>,
    @SerialName("messages_between")
    @get:JvmName("messagesBetween")
    public val messagesBetween: Int,
) {
    public companion object
}
