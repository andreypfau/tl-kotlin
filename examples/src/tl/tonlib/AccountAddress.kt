// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("accountAddress")
@TLCombinatorId(0x2D09BDAB)
public data class AccountAddress(
    @SerialName("account_address")
    @get:JvmName("accountAddress")
    public val accountAddress: String,
) {
    public companion object
}
