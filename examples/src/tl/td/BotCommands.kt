// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("botCommands")
@TLCombinatorId(0x67CB1CF4)
public data class BotCommands(
    @SerialName("bot_user_id")
    @get:JvmName("botUserId")
    public val botUserId: Long,
    @get:JvmName("commands")
    public val commands: List<BotCommand>,
) {
    public companion object
}
