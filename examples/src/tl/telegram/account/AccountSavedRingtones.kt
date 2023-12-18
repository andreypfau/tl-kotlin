// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.account

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Document

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AccountSavedRingtones {
    @Serializable
    @SerialName("account.savedRingtonesNotModified")
    @TLCombinatorId(0xFBF6E8B1)
    public object SavedRingtonesNotModified : AccountSavedRingtones

    @Serializable
    @SerialName("account.savedRingtones")
    @TLCombinatorId(0xC1E92CC5)
    public data class SavedRingtones(
        @get:JvmName("hash")
        public val hash: Long,
        @get:JvmName("ringtones")
        public val ringtones: List<Document>,
    ) : AccountSavedRingtones {
        public companion object
    }

    public companion object
}
