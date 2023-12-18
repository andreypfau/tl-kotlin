// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.contacts

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.ImportedContact
import tl.telegram.PopularContact
import tl.telegram.User

@Serializable
@SerialName("contacts.importedContacts")
@TLCombinatorId(0x77D01C3B)
public data class ContactsImportedContacts(
    @get:JvmName("imported")
    public val imported: List<ImportedContact>,
    @SerialName("popular_invites")
    @get:JvmName("popularInvites")
    public val popularInvites: List<PopularContact>,
    @SerialName("retry_contacts")
    @get:JvmName("retryContacts")
    public val retryContacts: List<Long>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
