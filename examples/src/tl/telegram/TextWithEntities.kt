// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("textWithEntities")
@TLCombinatorId(0x751F3146)
public data class TextWithEntities(
    @get:JvmName("text")
    public val text: String,
    @get:JvmName("entities")
    public val entities: List<MessageEntity>,
) {
    public companion object
}