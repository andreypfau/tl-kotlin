// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("countries")
@TLCombinatorId(0x6E8506E5)
public data class Countries(
    @get:JvmName("countries")
    public val countries: List<CountryInfo>,
) {
    public companion object
}