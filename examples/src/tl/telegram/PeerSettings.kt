// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("peerSettings")
@TLCombinatorId(0xA518110D)
public data class PeerSettings(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("report_spam")
    @TLConditional("flags", 0)
    @get:JvmName("reportSpam")
    public val reportSpam: Unit? = null,
    @SerialName("add_contact")
    @TLConditional("flags", 1)
    @get:JvmName("addContact")
    public val addContact: Unit? = null,
    @SerialName("block_contact")
    @TLConditional("flags", 2)
    @get:JvmName("blockContact")
    public val blockContact: Unit? = null,
    @SerialName("share_contact")
    @TLConditional("flags", 3)
    @get:JvmName("shareContact")
    public val shareContact: Unit? = null,
    @SerialName("need_contacts_exception")
    @TLConditional("flags", 4)
    @get:JvmName("needContactsException")
    public val needContactsException: Unit? = null,
    @SerialName("report_geo")
    @TLConditional("flags", 5)
    @get:JvmName("reportGeo")
    public val reportGeo: Unit? = null,
    @TLConditional("flags", 7)
    @get:JvmName("autoarchived")
    public val autoarchived: Unit? = null,
    @SerialName("invite_members")
    @TLConditional("flags", 8)
    @get:JvmName("inviteMembers")
    public val inviteMembers: Unit? = null,
    @SerialName("request_chat_broadcast")
    @TLConditional("flags", 10)
    @get:JvmName("requestChatBroadcast")
    public val requestChatBroadcast: Unit? = null,
    @SerialName("geo_distance")
    @TLConditional("flags", 6)
    @get:JvmName("geoDistance")
    public val geoDistance: Int? = null,
    @SerialName("request_chat_title")
    @TLConditional("flags", 9)
    @get:JvmName("requestChatTitle")
    public val requestChatTitle: String? = null,
    @SerialName("request_chat_date")
    @TLConditional("flags", 9)
    @get:JvmName("requestChatDate")
    public val requestChatDate: Int? = null,
) {
    public companion object
}
