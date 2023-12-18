// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface InputCheckPasswordSRP {
    @Serializable
    @SerialName("inputCheckPasswordEmpty")
    @TLCombinatorId(0x9880F658)
    public object InputCheckPasswordEmpty : tl.telegram.InputCheckPasswordSRP

    @Serializable
    @SerialName("inputCheckPasswordSRP")
    @TLCombinatorId(0xD27FF082)
    public data class InputCheckPasswordSRP(
        @SerialName("srp_id")
        @get:JvmName("srpId")
        public val srpId: Long,
        @SerialName("A")
        @get:JvmName("a")
        public val a: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("M1")
        @get:JvmName("m1")
        public val m1: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.telegram.InputCheckPasswordSRP {
        public companion object
    }

    public companion object
}
