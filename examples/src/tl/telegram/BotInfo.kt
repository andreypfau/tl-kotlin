// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("botInfo")
@TLCombinatorId(0x8F300B57)
public data class BotInfo(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("user_id")
    @TLConditional("flags", 0)
    @get:JvmName("userId")
    public val userId: Long? = null,
    @TLConditional("flags", 1)
    @get:JvmName("description")
    public val description: String? = null,
    @SerialName("description_photo")
    @TLConditional("flags", 4)
    @get:JvmName("descriptionPhoto")
    public val descriptionPhoto: Photo? = null,
    @SerialName("description_document")
    @TLConditional("flags", 5)
    @get:JvmName("descriptionDocument")
    public val descriptionDocument: Document? = null,
    @TLConditional("flags", 2)
    @get:JvmName("commands")
    public val commands: List<BotCommand>? = null,
    @SerialName("menu_button")
    @TLConditional("flags", 3)
    @get:JvmName("menuButton")
    public val menuButton: BotMenuButton? = null,
) {
    public companion object
}