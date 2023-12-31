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
public sealed interface PremiumGiveawayParticipantStatus {
    @Serializable
    @SerialName("premiumGiveawayParticipantStatusEligible")
    @TLCombinatorId(0x7EE281C0)
    public object PremiumGiveawayParticipantStatusEligible : PremiumGiveawayParticipantStatus

    @Serializable
    @SerialName("premiumGiveawayParticipantStatusParticipating")
    @TLCombinatorId(0x740406D1)
    public object PremiumGiveawayParticipantStatusParticipating : PremiumGiveawayParticipantStatus

    @Serializable
    @SerialName("premiumGiveawayParticipantStatusAlreadyWasMember")
    @TLCombinatorId(0x8D3045A3)
    public data class PremiumGiveawayParticipantStatusAlreadyWasMember(
        @SerialName("joined_chat_date")
        @get:JvmName("joinedChatDate")
        public val joinedChatDate: Int,
    ) : PremiumGiveawayParticipantStatus {
        public companion object
    }

    @Serializable
    @SerialName("premiumGiveawayParticipantStatusAdministrator")
    @TLCombinatorId(0x7244DACE)
    public data class PremiumGiveawayParticipantStatusAdministrator(
        @SerialName("chat_id")
        @get:JvmName("chatId")
        public val chatId: Long,
    ) : PremiumGiveawayParticipantStatus {
        public companion object
    }

    @Serializable
    @SerialName("premiumGiveawayParticipantStatusDisallowedCountry")
    @TLCombinatorId(0x89684090)
    public data class PremiumGiveawayParticipantStatusDisallowedCountry(
        @SerialName("user_country_code")
        @get:JvmName("userCountryCode")
        public val userCountryCode: String,
    ) : PremiumGiveawayParticipantStatus {
        public companion object
    }

    public companion object
}
