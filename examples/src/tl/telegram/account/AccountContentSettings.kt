// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.account

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("account.contentSettings")
@TLCombinatorId(0x57E28221)
public data class AccountContentSettings(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("sensitive_enabled")
    @TLConditional("flags", 0)
    @get:JvmName("sensitiveEnabled")
    public val sensitiveEnabled: Unit? = null,
    @SerialName("sensitive_can_change")
    @TLConditional("flags", 1)
    @get:JvmName("sensitiveCanChange")
    public val sensitiveCanChange: Unit? = null,
) {
    public companion object
}
