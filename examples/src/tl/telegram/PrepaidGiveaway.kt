// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("prepaidGiveaway")
@TLCombinatorId(0xB2539D54)
public data class PrepaidGiveaway(
    @get:JvmName("id")
    public val id: Long,
    @get:JvmName("months")
    public val months: Int,
    @get:JvmName("quantity")
    public val quantity: Int,
    @get:JvmName("date")
    public val date: Int,
) {
    public companion object
}