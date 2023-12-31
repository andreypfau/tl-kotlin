// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.contacts

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Contact
import tl.telegram.User

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface ContactsContacts {
    @Serializable
    @SerialName("contacts.contactsNotModified")
    @TLCombinatorId(0xB74BA9D2)
    public object ContactsNotModified : ContactsContacts

    @Serializable
    @SerialName("contacts.contacts")
    @TLCombinatorId(0xEAE87E42)
    public data class Contacts(
        @get:JvmName("contacts")
        public val contacts: List<Contact>,
        @SerialName("saved_count")
        @get:JvmName("savedCount")
        public val savedCount: Int,
        @get:JvmName("users")
        public val users: List<User>,
    ) : ContactsContacts {
        public companion object
    }

    public companion object
}
