// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface InputKey {
    @Serializable
    @SerialName("inputKeyRegular")
    @TLCombinatorId(0xDEE5469E)
    public data class InputKeyRegular(
        @get:JvmName("key")
        public val key: Key,
        @SerialName("local_password")
        @get:JvmName("localPassword")
        public val localPassword: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InputKey {
        public companion object
    }

    @Serializable
    @SerialName("inputKeyFake")
    @TLCombinatorId(0xBFFB39BE)
    public object InputKeyFake : InputKey

    public companion object
}
