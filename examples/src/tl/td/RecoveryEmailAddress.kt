// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("recoveryEmailAddress")
@TLCombinatorId(0x4CEBDDEB)
public data class RecoveryEmailAddress(
    @SerialName("recovery_email_address")
    @get:JvmName("recoveryEmailAddress")
    public val recoveryEmailAddress: String,
) {
    public companion object
}
