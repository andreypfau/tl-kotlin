// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface PhoneConnection {
    @Serializable
    @SerialName("phoneConnection")
    @TLCombinatorId(0x9CC123C7)
    public data class PhoneConnection(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("tcp")
        public val tcp: Unit? = null,
        @get:JvmName("id")
        public val id: Long,
        @get:JvmName("ip")
        public val ip: String,
        @get:JvmName("ipv6")
        public val ipv6: String,
        @get:JvmName("port")
        public val port: Int,
        @SerialName("peer_tag")
        @get:JvmName("peerTag")
        public val peerTag: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.telegram.PhoneConnection {
        public companion object
    }

    @Serializable
    @SerialName("phoneConnectionWebrtc")
    @TLCombinatorId(0x635FE375)
    public data class PhoneConnectionWebrtc(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("turn")
        public val turn: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("stun")
        public val stun: Unit? = null,
        @get:JvmName("id")
        public val id: Long,
        @get:JvmName("ip")
        public val ip: String,
        @get:JvmName("ipv6")
        public val ipv6: String,
        @get:JvmName("port")
        public val port: Int,
        @get:JvmName("username")
        public val username: String,
        @get:JvmName("password")
        public val password: String,
    ) : tl.telegram.PhoneConnection {
        public companion object
    }

    public companion object
}