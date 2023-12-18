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
public sealed interface EncryptedChat {
    @Serializable
    @SerialName("encryptedChatEmpty")
    @TLCombinatorId(0xAB7EC0A0)
    public data class EncryptedChatEmpty(
        @get:JvmName("id")
        public val id: Int,
    ) : tl.telegram.EncryptedChat {
        public companion object
    }

    @Serializable
    @SerialName("encryptedChatWaiting")
    @TLCombinatorId(0x66B25953)
    public data class EncryptedChatWaiting(
        @get:JvmName("id")
        public val id: Int,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("admin_id")
        @get:JvmName("adminId")
        public val adminId: Long,
        @SerialName("participant_id")
        @get:JvmName("participantId")
        public val participantId: Long,
    ) : tl.telegram.EncryptedChat {
        public companion object
    }

    @Serializable
    @SerialName("encryptedChatRequested")
    @TLCombinatorId(0x48F1D94C)
    public data class EncryptedChatRequested(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("folder_id")
        @TLConditional("flags", 0)
        @get:JvmName("folderId")
        public val folderId: Int? = null,
        @get:JvmName("id")
        public val id: Int,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("admin_id")
        @get:JvmName("adminId")
        public val adminId: Long,
        @SerialName("participant_id")
        @get:JvmName("participantId")
        public val participantId: Long,
        @SerialName("g_a")
        @get:JvmName("gA")
        public val gA: @Serializable(Base64ByteStringSerializer::class) ByteString,
    ) : tl.telegram.EncryptedChat {
        public companion object
    }

    @Serializable
    @SerialName("encryptedChat")
    @TLCombinatorId(0x61F0D4C7)
    public data class EncryptedChat(
        @get:JvmName("id")
        public val id: Int,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("date")
        public val date: Int,
        @SerialName("admin_id")
        @get:JvmName("adminId")
        public val adminId: Long,
        @SerialName("participant_id")
        @get:JvmName("participantId")
        public val participantId: Long,
        @SerialName("g_a_or_b")
        @get:JvmName("gAOrB")
        public val gAOrB: @Serializable(Base64ByteStringSerializer::class) ByteString,
        @SerialName("key_fingerprint")
        @get:JvmName("keyFingerprint")
        public val keyFingerprint: Long,
    ) : tl.telegram.EncryptedChat {
        public companion object
    }

    @Serializable
    @SerialName("encryptedChatDiscarded")
    @TLCombinatorId(0x1E1C7C45)
    public data class EncryptedChatDiscarded(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("history_deleted")
        @TLConditional("flags", 0)
        @get:JvmName("historyDeleted")
        public val historyDeleted: Unit? = null,
        @get:JvmName("id")
        public val id: Int,
    ) : tl.telegram.EncryptedChat {
        public companion object
    }

    public companion object
}
