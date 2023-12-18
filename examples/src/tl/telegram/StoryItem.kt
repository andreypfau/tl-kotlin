// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface StoryItem {
    @Serializable
    @SerialName("storyItemDeleted")
    @TLCombinatorId(0x51E6EE4F)
    public data class StoryItemDeleted(
        @get:JvmName("id")
        public val id: Int,
    ) : tl.telegram.StoryItem {
        public companion object
    }

    @Serializable
    @SerialName("storyItemSkipped")
    @TLCombinatorId(0xFFADC913)
    public data class StoryItemSkipped(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("close_friends")
        @TLConditional("flags", 8)
        @get:JvmName("closeFriends")
        public val closeFriends: Unit? = null,
        @get:JvmName("id")
        public val id: Int,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("expire_date")
        @get:JvmName("expireDate")
        public val expireDate: Int,
    ) : tl.telegram.StoryItem {
        public companion object
    }

    @Serializable
    @SerialName("storyItem")
    @TLCombinatorId(0x44C457CE)
    public data class StoryItem(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 5)
        @get:JvmName("pinned")
        public val pinned: Unit? = null,
        @TLConditional("flags", 7)
        @get:JvmName("public")
        public val `public`: Unit? = null,
        @SerialName("close_friends")
        @TLConditional("flags", 8)
        @get:JvmName("closeFriends")
        public val closeFriends: Unit? = null,
        @TLConditional("flags", 9)
        @get:JvmName("min")
        public val min: Unit? = null,
        @TLConditional("flags", 10)
        @get:JvmName("noforwards")
        public val noforwards: Unit? = null,
        @TLConditional("flags", 11)
        @get:JvmName("edited")
        public val edited: Unit? = null,
        @TLConditional("flags", 12)
        @get:JvmName("contacts")
        public val contacts: Unit? = null,
        @SerialName("selected_contacts")
        @TLConditional("flags", 13)
        @get:JvmName("selectedContacts")
        public val selectedContacts: Unit? = null,
        @TLConditional("flags", 16)
        @get:JvmName("out")
        public val `out`: Unit? = null,
        @get:JvmName("id")
        public val id: Int,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("expire_date")
        @get:JvmName("expireDate")
        public val expireDate: Int,
        @TLConditional("flags", 0)
        @get:JvmName("caption")
        public val caption: String? = null,
        @TLConditional("flags", 1)
        @get:JvmName("entities")
        public val entities: List<MessageEntity>? = null,
        @get:JvmName("media")
        public val media: MessageMedia,
        @SerialName("media_areas")
        @TLConditional("flags", 14)
        @get:JvmName("mediaAreas")
        public val mediaAreas: List<MediaArea>? = null,
        @TLConditional("flags", 2)
        @get:JvmName("privacy")
        public val privacy: List<PrivacyRule>? = null,
        @TLConditional("flags", 3)
        @get:JvmName("views")
        public val views: StoryViews? = null,
        @SerialName("sent_reaction")
        @TLConditional("flags", 15)
        @get:JvmName("sentReaction")
        public val sentReaction: Reaction? = null,
    ) : tl.telegram.StoryItem {
        public companion object
    }

    public companion object
}
