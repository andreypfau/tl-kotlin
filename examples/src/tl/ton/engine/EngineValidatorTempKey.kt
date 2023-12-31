// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validatorTempKey")
@TLCombinatorId(0x5E4AD6DE)
public data class EngineValidatorTempKey(
    @TLFixedSize(value = 32)
    @get:JvmName("key")
    public val key: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("expire_at")
    @get:JvmName("expireAt")
    public val expireAt: Int,
) {
    public companion object
}
