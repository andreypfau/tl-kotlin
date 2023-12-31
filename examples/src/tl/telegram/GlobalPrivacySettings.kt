// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("globalPrivacySettings")
@TLCombinatorId(0x734C4CCB)
public data class GlobalPrivacySettings(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("archive_and_mute_new_noncontact_peers")
    @TLConditional("flags", 0)
    @get:JvmName("archiveAndMuteNewNoncontactPeers")
    public val archiveAndMuteNewNoncontactPeers: Unit? = null,
    @SerialName("keep_archived_unmuted")
    @TLConditional("flags", 1)
    @get:JvmName("keepArchivedUnmuted")
    public val keepArchivedUnmuted: Unit? = null,
    @SerialName("keep_archived_folders")
    @TLConditional("flags", 2)
    @get:JvmName("keepArchivedFolders")
    public val keepArchivedFolders: Unit? = null,
) {
    public companion object
}
