// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("foundWebApp")
@TLCombinatorId(0xEEA8D01E)
public data class FoundWebApp(
    @SerialName("web_app")
    @get:JvmName("webApp")
    public val webApp: WebApp,
    @SerialName("request_write_access")
    @get:JvmName("requestWriteAccess")
    public val requestWriteAccess: Boolean,
    @SerialName("skip_confirmation")
    @get:JvmName("skipConfirmation")
    public val skipConfirmation: Boolean,
) {
    public companion object
}