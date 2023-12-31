// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.td

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("groupCall")
@TLCombinatorId(0xF8A46765)
public data class GroupCall(
    @get:JvmName("id")
    public val id: Int,
    @get:JvmName("title")
    public val title: String,
    @SerialName("scheduled_start_date")
    @get:JvmName("scheduledStartDate")
    public val scheduledStartDate: Int,
    @SerialName("enabled_start_notification")
    @get:JvmName("enabledStartNotification")
    public val enabledStartNotification: Boolean,
    @SerialName("is_active")
    @get:JvmName("isActive")
    public val isActive: Boolean,
    @SerialName("is_rtmp_stream")
    @get:JvmName("isRtmpStream")
    public val isRtmpStream: Boolean,
    @SerialName("is_joined")
    @get:JvmName("isJoined")
    public val isJoined: Boolean,
    @SerialName("need_rejoin")
    @get:JvmName("needRejoin")
    public val needRejoin: Boolean,
    @SerialName("can_be_managed")
    @get:JvmName("canBeManaged")
    public val canBeManaged: Boolean,
    @SerialName("participant_count")
    @get:JvmName("participantCount")
    public val participantCount: Int,
    @SerialName("has_hidden_listeners")
    @get:JvmName("hasHiddenListeners")
    public val hasHiddenListeners: Boolean,
    @SerialName("loaded_all_participants")
    @get:JvmName("loadedAllParticipants")
    public val loadedAllParticipants: Boolean,
    @SerialName("recent_speakers")
    @get:JvmName("recentSpeakers")
    public val recentSpeakers: List<GroupCallRecentSpeaker>,
    @SerialName("is_my_video_enabled")
    @get:JvmName("isMyVideoEnabled")
    public val isMyVideoEnabled: Boolean,
    @SerialName("is_my_video_paused")
    @get:JvmName("isMyVideoPaused")
    public val isMyVideoPaused: Boolean,
    @SerialName("can_enable_video")
    @get:JvmName("canEnableVideo")
    public val canEnableVideo: Boolean,
    @SerialName("mute_new_participants")
    @get:JvmName("muteNewParticipants")
    public val muteNewParticipants: Boolean,
    @SerialName("can_toggle_mute_new_participants")
    @get:JvmName("canToggleMuteNewParticipants")
    public val canToggleMuteNewParticipants: Boolean,
    @SerialName("record_duration")
    @get:JvmName("recordDuration")
    public val recordDuration: Int,
    @SerialName("is_video_recorded")
    @get:JvmName("isVideoRecorded")
    public val isVideoRecorded: Boolean,
    @get:JvmName("duration")
    public val duration: Int,
) {
    public companion object
}
