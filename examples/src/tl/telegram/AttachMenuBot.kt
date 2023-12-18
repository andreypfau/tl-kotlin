// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("attachMenuBot")
@TLCombinatorId(0xD90D8DFE)
public data class AttachMenuBot(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("inactive")
    public val inactive: Unit? = null,
    @SerialName("has_settings")
    @TLConditional("flags", 1)
    @get:JvmName("hasSettings")
    public val hasSettings: Unit? = null,
    @SerialName("request_write_access")
    @TLConditional("flags", 2)
    @get:JvmName("requestWriteAccess")
    public val requestWriteAccess: Unit? = null,
    @SerialName("show_in_attach_menu")
    @TLConditional("flags", 3)
    @get:JvmName("showInAttachMenu")
    public val showInAttachMenu: Unit? = null,
    @SerialName("show_in_side_menu")
    @TLConditional("flags", 4)
    @get:JvmName("showInSideMenu")
    public val showInSideMenu: Unit? = null,
    @SerialName("side_menu_disclaimer_needed")
    @TLConditional("flags", 5)
    @get:JvmName("sideMenuDisclaimerNeeded")
    public val sideMenuDisclaimerNeeded: Unit? = null,
    @SerialName("bot_id")
    @get:JvmName("botId")
    public val botId: Long,
    @SerialName("short_name")
    @get:JvmName("shortName")
    public val shortName: String,
    @SerialName("peer_types")
    @TLConditional("flags", 3)
    @get:JvmName("peerTypes")
    public val peerTypes: List<AttachMenuPeerType>? = null,
    @get:JvmName("icons")
    public val icons: List<AttachMenuBotIcon>,
) {
    public companion object
}