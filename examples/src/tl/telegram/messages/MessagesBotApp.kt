// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.messages

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.BotApp

@Serializable
@SerialName("messages.botApp")
@TLCombinatorId(0xEB50ADF5)
public data class MessagesBotApp(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("inactive")
    public val inactive: Unit? = null,
    @SerialName("request_write_access")
    @TLConditional("flags", 1)
    @get:JvmName("requestWriteAccess")
    public val requestWriteAccess: Unit? = null,
    @SerialName("has_settings")
    @TLConditional("flags", 2)
    @get:JvmName("hasSettings")
    public val hasSettings: Unit? = null,
    @get:JvmName("app")
    public val app: BotApp,
) {
    public companion object
}
