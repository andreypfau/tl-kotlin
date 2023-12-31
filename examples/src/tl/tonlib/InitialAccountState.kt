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

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface InitialAccountState {
    @Serializable
    @SerialName("raw.initialAccountState")
    @TLCombinatorId(0xEBDB5C47)
    public data class RawInitialAccountState(
        @get:JvmName("code")
        public val code: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @get:JvmName("data")
        public val `data`: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.v3.initialAccountState")
    @TLCombinatorId(0xF8F65540)
    public data class WalletV3InitialAccountState(
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.v4.initialAccountState")
    @TLCombinatorId(0xD0E9C2C5)
    public data class WalletV4InitialAccountState(
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.highload.v1.initialAccountState")
    @TLCombinatorId(0xEC749E46)
    public data class WalletHighloadV1InitialAccountState(
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("wallet.highload.v2.initialAccountState")
    @TLCombinatorId(0x75347929)
    public data class WalletHighloadV2InitialAccountState(
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("rwallet.initialAccountState")
    @TLCombinatorId(0x45B90C14)
    public data class RwalletInitialAccountState(
        @SerialName("init_public_key")
        @get:JvmName("initPublicKey")
        public val initPublicKey: String,
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("dns.initialAccountState")
    @TLCombinatorId(0x6DCBA4BF)
    public data class DnsInitialAccountState(
        @SerialName("public_key")
        @get:JvmName("publicKey")
        public val publicKey: String,
        @SerialName("wallet_id")
        @get:JvmName("walletId")
        public val walletId: Long,
    ) : InitialAccountState {
        public companion object
    }

    @Serializable
    @SerialName("pchan.initialAccountState")
    @TLCombinatorId(0xB23E1D44)
    public data class PchanInitialAccountState(
        @get:JvmName("config")
        public val config: PchanConfig,
    ) : InitialAccountState {
        public companion object
    }

    public companion object
}
