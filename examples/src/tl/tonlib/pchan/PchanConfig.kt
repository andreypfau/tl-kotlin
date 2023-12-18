// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.tonlib.pchan

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.tonlib.AccountAddress

@Serializable
@SerialName("pchan.config")
@TLCombinatorId(0x8486F436)
public data class PchanConfig(
    @SerialName("alice_public_key")
    @get:JvmName("alicePublicKey")
    public val alicePublicKey: String,
    @SerialName("alice_address")
    @get:JvmName("aliceAddress")
    public val aliceAddress: AccountAddress,
    @SerialName("bob_public_key")
    @get:JvmName("bobPublicKey")
    public val bobPublicKey: String,
    @SerialName("bob_address")
    @get:JvmName("bobAddress")
    public val bobAddress: AccountAddress,
    @SerialName("init_timeout")
    @get:JvmName("initTimeout")
    public val initTimeout: Int,
    @SerialName("close_timeout")
    @get:JvmName("closeTimeout")
    public val closeTimeout: Int,
    @SerialName("channel_id")
    @get:JvmName("channelId")
    public val channelId: Long,
) {
    public companion object
}
