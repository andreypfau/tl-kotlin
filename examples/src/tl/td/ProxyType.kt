// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface ProxyType {
    @Serializable
    @SerialName("proxyTypeSocks5")
    @TLCombinatorId(0xCAF342B3)
    public data class ProxyTypeSocks5(
        @get:JvmName("username")
        public val username: String,
        @get:JvmName("password")
        public val password: String,
    ) : ProxyType {
        public companion object
    }

    @Serializable
    @SerialName("proxyTypeHttp")
    @TLCombinatorId(0xA3C7C777)
    public data class ProxyTypeHttp(
        @get:JvmName("username")
        public val username: String,
        @get:JvmName("password")
        public val password: String,
        @SerialName("http_only")
        @get:JvmName("httpOnly")
        public val httpOnly: Boolean,
    ) : ProxyType {
        public companion object
    }

    @Serializable
    @SerialName("proxyTypeMtproto")
    @TLCombinatorId(0x8AE31FFD)
    public data class ProxyTypeMtproto(
        @get:JvmName("secret")
        public val secret: String,
    ) : ProxyType {
        public companion object
    }

    public companion object
}
