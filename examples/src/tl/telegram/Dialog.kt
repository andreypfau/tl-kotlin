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
public sealed interface Dialog {
    @Serializable
    @SerialName("dialog")
    @TLCombinatorId(0xD58A08C6)
    public data class Dialog(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 2)
        @get:JvmName("pinned")
        public val pinned: Unit? = null,
        @SerialName("unread_mark")
        @TLConditional("flags", 3)
        @get:JvmName("unreadMark")
        public val unreadMark: Unit? = null,
        @get:JvmName("peer")
        public val peer: Peer,
        @SerialName("top_message")
        @get:JvmName("topMessage")
        public val topMessage: Int,
        @SerialName("read_inbox_max_id")
        @get:JvmName("readInboxMaxId")
        public val readInboxMaxId: Int,
        @SerialName("read_outbox_max_id")
        @get:JvmName("readOutboxMaxId")
        public val readOutboxMaxId: Int,
        @SerialName("unread_count")
        @get:JvmName("unreadCount")
        public val unreadCount: Int,
        @SerialName("unread_mentions_count")
        @get:JvmName("unreadMentionsCount")
        public val unreadMentionsCount: Int,
        @SerialName("unread_reactions_count")
        @get:JvmName("unreadReactionsCount")
        public val unreadReactionsCount: Int,
        @SerialName("notify_settings")
        @get:JvmName("notifySettings")
        public val notifySettings: PeerNotifySettings,
        @TLConditional("flags", 0)
        @get:JvmName("pts")
        public val pts: Int? = null,
        @TLConditional("flags", 1)
        @get:JvmName("draft")
        public val draft: DraftMessage? = null,
        @SerialName("folder_id")
        @TLConditional("flags", 4)
        @get:JvmName("folderId")
        public val folderId: Int? = null,
        @SerialName("ttl_period")
        @TLConditional("flags", 5)
        @get:JvmName("ttlPeriod")
        public val ttlPeriod: Int? = null,
    ) : tl.telegram.Dialog {
        public companion object
    }

    @Serializable
    @SerialName("dialogFolder")
    @TLCombinatorId(0x71BD134C)
    public data class DialogFolder(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 2)
        @get:JvmName("pinned")
        public val pinned: Unit? = null,
        @get:JvmName("folder")
        public val folder: Folder,
        @get:JvmName("peer")
        public val peer: Peer,
        @SerialName("top_message")
        @get:JvmName("topMessage")
        public val topMessage: Int,
        @SerialName("unread_muted_peers_count")
        @get:JvmName("unreadMutedPeersCount")
        public val unreadMutedPeersCount: Int,
        @SerialName("unread_unmuted_peers_count")
        @get:JvmName("unreadUnmutedPeersCount")
        public val unreadUnmutedPeersCount: Int,
        @SerialName("unread_muted_messages_count")
        @get:JvmName("unreadMutedMessagesCount")
        public val unreadMutedMessagesCount: Int,
        @SerialName("unread_unmuted_messages_count")
        @get:JvmName("unreadUnmutedMessagesCount")
        public val unreadUnmutedMessagesCount: Int,
    ) : tl.telegram.Dialog {
        public companion object
    }

    public companion object
}
