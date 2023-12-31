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
public sealed interface DeviceToken {
    @Serializable
    @SerialName("deviceTokenFirebaseCloudMessaging")
    @TLCombinatorId(0xD0714A07)
    public data class DeviceTokenFirebaseCloudMessaging(
        @get:JvmName("token")
        public val token: String,
        @get:JvmName("encrypt")
        public val encrypt: Boolean,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenApplePush")
    @TLCombinatorId(0x17196BC3)
    public data class DeviceTokenApplePush(
        @SerialName("device_token")
        @get:JvmName("deviceToken")
        public val deviceToken: String,
        @SerialName("is_app_sandbox")
        @get:JvmName("isAppSandbox")
        public val isAppSandbox: Boolean,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenApplePushVoIP")
    @TLCombinatorId(0x2FF045E9)
    public data class DeviceTokenApplePushVoIP(
        @SerialName("device_token")
        @get:JvmName("deviceToken")
        public val deviceToken: String,
        @SerialName("is_app_sandbox")
        @get:JvmName("isAppSandbox")
        public val isAppSandbox: Boolean,
        @get:JvmName("encrypt")
        public val encrypt: Boolean,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenWindowsPush")
    @TLCombinatorId(0xABED428F)
    public data class DeviceTokenWindowsPush(
        @SerialName("access_token")
        @get:JvmName("accessToken")
        public val accessToken: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenMicrosoftPush")
    @TLCombinatorId(0x48F8E04C)
    public data class DeviceTokenMicrosoftPush(
        @SerialName("channel_uri")
        @get:JvmName("channelUri")
        public val channelUri: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenMicrosoftPushVoIP")
    @TLCombinatorId(0xD12CA351)
    public data class DeviceTokenMicrosoftPushVoIP(
        @SerialName("channel_uri")
        @get:JvmName("channelUri")
        public val channelUri: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenWebPush")
    @TLCombinatorId(0x9AFFDEF7)
    public data class DeviceTokenWebPush(
        @get:JvmName("endpoint")
        public val endpoint: String,
        @SerialName("p256dh_base64url")
        @get:JvmName("p256dhBase64url")
        public val p256dhBase64url: String,
        @SerialName("auth_base64url")
        @get:JvmName("authBase64url")
        public val authBase64url: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenSimplePush")
    @TLCombinatorId(0x02F49A60)
    public data class DeviceTokenSimplePush(
        @get:JvmName("endpoint")
        public val endpoint: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenUbuntuPush")
    @TLCombinatorId(0x6A3C0D26)
    public data class DeviceTokenUbuntuPush(
        @get:JvmName("token")
        public val token: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenBlackBerryPush")
    @TLCombinatorId(0x5CEF0102)
    public data class DeviceTokenBlackBerryPush(
        @get:JvmName("token")
        public val token: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenTizenPush")
    @TLCombinatorId(0xAEF0DA33)
    public data class DeviceTokenTizenPush(
        @SerialName("reg_id")
        @get:JvmName("regId")
        public val regId: String,
    ) : DeviceToken {
        public companion object
    }

    @Serializable
    @SerialName("deviceTokenHuaweiPush")
    @TLCombinatorId(0x768F4E26)
    public data class DeviceTokenHuaweiPush(
        @get:JvmName("token")
        public val token: String,
        @get:JvmName("encrypt")
        public val encrypt: Boolean,
    ) : DeviceToken {
        public companion object
    }

    public companion object
}
