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
public sealed interface UserProfilePhoto {
    @Serializable
    @SerialName("userProfilePhotoEmpty")
    @TLCombinatorId(0x4F11BAE1)
    public object UserProfilePhotoEmpty : tl.telegram.UserProfilePhoto

    @Serializable
    @SerialName("userProfilePhoto")
    @TLCombinatorId(0x82D1F706)
    public data class UserProfilePhoto(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("has_video")
        @TLConditional("flags", 0)
        @get:JvmName("hasVideo")
        public val hasVideo: Unit? = null,
        @TLConditional("flags", 2)
        @get:JvmName("personal")
        public val personal: Unit? = null,
        @SerialName("photo_id")
        @get:JvmName("photoId")
        public val photoId: Long,
        @SerialName("stripped_thumb")
        @TLConditional("flags", 1)
        @get:JvmName("strippedThumb")
        public val strippedThumb: @Serializable(Base64ByteStringSerializer::class) ByteString? =
                null,
        @SerialName("dc_id")
        @get:JvmName("dcId")
        public val dcId: Int,
    ) : tl.telegram.UserProfilePhoto {
        public companion object
    }

    public companion object
}
