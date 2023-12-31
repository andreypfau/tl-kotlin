// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("unconfirmedSession")
@TLCombinatorId(0x850D49F9)
public data class UnconfirmedSession(
    @get:JvmName("id")
    public val id: Long,
    @SerialName("log_in_date")
    @get:JvmName("logInDate")
    public val logInDate: Int,
    @SerialName("device_model")
    @get:JvmName("deviceModel")
    public val deviceModel: String,
    @get:JvmName("location")
    public val location: String,
) {
    public companion object
}
