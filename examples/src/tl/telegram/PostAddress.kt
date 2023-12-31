// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("postAddress")
@TLCombinatorId(0x1E8CAAEB)
public data class PostAddress(
    @SerialName("street_line1")
    @get:JvmName("streetLine1")
    public val streetLine1: String,
    @SerialName("street_line2")
    @get:JvmName("streetLine2")
    public val streetLine2: String,
    @get:JvmName("city")
    public val city: String,
    @get:JvmName("state")
    public val state: String,
    @SerialName("country_iso2")
    @get:JvmName("countryIso2")
    public val countryIso2: String,
    @SerialName("post_code")
    @get:JvmName("postCode")
    public val postCode: String,
) {
    public companion object
}
