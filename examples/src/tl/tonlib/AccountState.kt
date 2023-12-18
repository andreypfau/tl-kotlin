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
import tl.tonlib.pchan.PchanConfig
import tl.tonlib.pchan.PchanState
import tl.tonlib.rwallet.RwalletConfig

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AccountState {
    @Serializable
    @SerialName("raw.accountState")
    @TLCombinatorId(0xE04B963A)
    public data class RawAccountState(
        @get:JvmName("code")
        public val code: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("data")
        public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("frozen_hash")
        @get:JvmName("frozenHash")
        public val frozenHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.v3.accountState")
    @TLCombinatorId(0x9F7AA84A)
    public data class WalletV3AccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
        @get:JvmName("seqno")
        public val seqno: Int,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.v4.accountState")
    @TLCombinatorId(0xD42E9776)
    public data class WalletV4AccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
        @get:JvmName("seqno")
        public val seqno: Int,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.highload.v1.accountState")
    @TLCombinatorId(0x6057E4DC)
    public data class WalletHighloadV1AccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
        @get:JvmName("seqno")
        public val seqno: Int,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.highload.v2.accountState")
    @TLCombinatorId(0x947D5D4F)
    public data class WalletHighloadV2AccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("dns.accountState")
    @TLCombinatorId(0x66FAD86A)
    public data class DnsAccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("rwallet.accountState")
    @TLCombinatorId(0xD3EB83D8)
    public data class RwalletAccountState(
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
        @get:JvmName("seqno")
        public val seqno: Int,
        @SerialName("unlocked_balance")
        @get:JvmName("unlockedBalance")
        public val unlockedBalance: Long,
        @get:JvmName("config")
        public val config: RwalletConfig,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("pchan.accountState")
    @TLCombinatorId(0x60226F78)
    public data class PchanAccountState(
        @get:JvmName("config")
        public val config: PchanConfig,
        @get:JvmName("state")
        public val state: PchanState,
        @get:JvmName("description")
        public val description: String,
    ) : AccountState {
        public companion object
    }

    @Serializable
    @SerialName("uninited.accountState")
    @TLCombinatorId(0x5ABD9708)
    public data class UninitedAccountState(
        @SerialName("frozen_hash")
        @get:JvmName("frozenHash")
        public val frozenHash: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : AccountState {
        public companion object
    }

    public companion object
}