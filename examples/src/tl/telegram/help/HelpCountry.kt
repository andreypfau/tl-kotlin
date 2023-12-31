// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.help

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("help.country")
@TLCombinatorId(0xC3878E23)
public data class HelpCountry(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("hidden")
    public val hidden: Unit? = null,
    @get:JvmName("iso2")
    public val iso2: String,
    @SerialName("default_name")
    @get:JvmName("defaultName")
    public val defaultName: String,
    @TLConditional("flags", 1)
    @get:JvmName("name")
    public val name: String? = null,
    @SerialName("country_codes")
    @get:JvmName("countryCodes")
    public val countryCodes: List<HelpCountryCode>,
) {
    public companion object
}
