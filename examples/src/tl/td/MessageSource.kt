// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class MessageSource {
    @SerialName("messageSourceChatHistory")
    @TLCombinatorId(0xBF02073C)
    MESSAGE_SOURCE_CHAT_HISTORY,
    @SerialName("messageSourceMessageThreadHistory")
    @TLCombinatorId(0x114F9106)
    MESSAGE_SOURCE_MESSAGE_THREAD_HISTORY,
    @SerialName("messageSourceForumTopicHistory")
    @TLCombinatorId(0xA5842CB7)
    MESSAGE_SOURCE_FORUM_TOPIC_HISTORY,
    @SerialName("messageSourceHistoryPreview")
    @TLCombinatorId(0x3D0CE411)
    MESSAGE_SOURCE_HISTORY_PREVIEW,
    @SerialName("messageSourceChatList")
    @TLCombinatorId(0x85F70FEA)
    MESSAGE_SOURCE_CHAT_LIST,
    @SerialName("messageSourceSearch")
    @TLCombinatorId(0x72853771)
    MESSAGE_SOURCE_SEARCH,
    @SerialName("messageSourceChatEventLog")
    @TLCombinatorId(0xC2AE19BC)
    MESSAGE_SOURCE_CHAT_EVENT_LOG,
    @SerialName("messageSourceNotification")
    @TLCombinatorId(0xC1A11BED)
    MESSAGE_SOURCE_NOTIFICATION,
    @SerialName("messageSourceScreenshot")
    @TLCombinatorId(0x1C035D0A)
    MESSAGE_SOURCE_SCREENSHOT,
    @SerialName("messageSourceOther")
    @TLCombinatorId(0x35C0A702)
    MESSAGE_SOURCE_OTHER,
    ;

    public companion object
}