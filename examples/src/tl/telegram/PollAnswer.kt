// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("pollAnswer")
@TLCombinatorId(0x6CA9C2E9)
public data class PollAnswer(
    @get:JvmName("text")
    public val text: String,
    @get:JvmName("option")
    public val option: @Serializable(Base64ByteStringSerializer::class) ByteString,
) {
    public companion object
}
