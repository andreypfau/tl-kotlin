// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("termsOfService")
@TLCombinatorId(0x2C12B185)
public data class TermsOfService(
    @get:JvmName("text")
    public val text: FormattedText,
    @SerialName("min_user_age")
    @get:JvmName("minUserAge")
    public val minUserAge: Int,
    @SerialName("show_popup")
    @get:JvmName("showPopup")
    public val showPopup: Boolean,
) {
    public companion object
}
