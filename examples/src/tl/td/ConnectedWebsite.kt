// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("connectedWebsite")
@TLCombinatorId(0x75E7A78A)
public data class ConnectedWebsite(
    @get:JvmName("id")
    public val id: Long,
    @SerialName("domain_name")
    @get:JvmName("domainName")
    public val domainName: String,
    @SerialName("bot_user_id")
    @get:JvmName("botUserId")
    public val botUserId: Long,
    @get:JvmName("browser")
    public val browser: String,
    @get:JvmName("platform")
    public val platform: String,
    @SerialName("log_in_date")
    @get:JvmName("logInDate")
    public val logInDate: Int,
    @SerialName("last_active_date")
    @get:JvmName("lastActiveDate")
    public val lastActiveDate: Int,
    @SerialName("ip_address")
    @get:JvmName("ipAddress")
    public val ipAddress: String,
    @get:JvmName("location")
    public val location: String,
) {
    public companion object
}
