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
public sealed interface UserPrivacySettingRule {
    @Serializable
    @SerialName("userPrivacySettingRuleAllowAll")
    @TLCombinatorId(0x8ABF1C3F)
    public object UserPrivacySettingRuleAllowAll : UserPrivacySettingRule

    @Serializable
    @SerialName("userPrivacySettingRuleAllowContacts")
    @TLCombinatorId(0x8F2F2D10)
    public object UserPrivacySettingRuleAllowContacts : UserPrivacySettingRule

    @Serializable
    @SerialName("userPrivacySettingRuleAllowUsers")
    @TLCombinatorId(0x4238562E)
    public data class UserPrivacySettingRuleAllowUsers(
        @SerialName("user_ids")
        @get:JvmName("userIds")
        public val userIds: List<Long>,
    ) : UserPrivacySettingRule {
        public companion object
    }

    @Serializable
    @SerialName("userPrivacySettingRuleAllowChatMembers")
    @TLCombinatorId(0x85E28ED9)
    public data class UserPrivacySettingRuleAllowChatMembers(
        @SerialName("chat_ids")
        @get:JvmName("chatIds")
        public val chatIds: List<Long>,
    ) : UserPrivacySettingRule {
        public companion object
    }

    @Serializable
    @SerialName("userPrivacySettingRuleRestrictAll")
    @TLCombinatorId(0xAC2A9550)
    public object UserPrivacySettingRuleRestrictAll : UserPrivacySettingRule

    @Serializable
    @SerialName("userPrivacySettingRuleRestrictContacts")
    @TLCombinatorId(0x3C1ACD02)
    public object UserPrivacySettingRuleRestrictContacts : UserPrivacySettingRule

    @Serializable
    @SerialName("userPrivacySettingRuleRestrictUsers")
    @TLCombinatorId(0x251F1EEA)
    public data class UserPrivacySettingRuleRestrictUsers(
        @SerialName("user_ids")
        @get:JvmName("userIds")
        public val userIds: List<Long>,
    ) : UserPrivacySettingRule {
        public companion object
    }

    @Serializable
    @SerialName("userPrivacySettingRuleRestrictChatMembers")
    @TLCombinatorId(0x17658BD1)
    public data class UserPrivacySettingRuleRestrictChatMembers(
        @SerialName("chat_ids")
        @get:JvmName("chatIds")
        public val chatIds: List<Long>,
    ) : UserPrivacySettingRule {
        public companion object
    }

    public companion object
}