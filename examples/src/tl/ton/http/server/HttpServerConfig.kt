// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.http.server

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("http.server.config")
@TLCombinatorId(0x3A1477FC)
public data class HttpServerConfig(
    @get:JvmName("dhs")
    public val dhs: List<HttpServerDnsEntry>,
    @SerialName("local_hosts")
    @get:JvmName("localHosts")
    public val localHosts: List<HttpServerHost>,
) {
    public companion object
}
