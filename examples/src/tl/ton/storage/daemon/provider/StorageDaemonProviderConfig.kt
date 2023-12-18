// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.storage.daemon.provider

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.PublicKey

@Serializable
@SerialName("storage.daemon.config")
@TLCombinatorId(0xF0C694B7)
public data class StorageDaemonProviderConfig(
    @SerialName("server_key")
    @get:JvmName("serverKey")
    public val serverKey: PublicKey,
    @SerialName("cli_key_hash")
    @TLFixedSize(value = 32)
    @get:JvmName("cliKeyHash")
    public val cliKeyHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("provider_address")
    @get:JvmName("providerAddress")
    public val providerAddress: String,
    @SerialName("adnl_id")
    @get:JvmName("adnlId")
    public val adnlId: PublicKey,
    @SerialName("dht_id")
    @get:JvmName("dhtId")
    public val dhtId: PublicKey,
) {
    public companion object
}
