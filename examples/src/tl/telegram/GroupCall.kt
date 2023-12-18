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
public sealed interface GroupCall {
    @Serializable
    @SerialName("groupCallDiscarded")
    @TLCombinatorId(0x7780BCB4)
    public data class GroupCallDiscarded(
        @get:JvmName("id")
        public val id: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @get:JvmName("duration")
        public val duration: Int,
    ) : tl.telegram.GroupCall {
        public companion object
    }

    @Serializable
    @SerialName("groupCall")
    @TLCombinatorId(0xD597650C)
    public data class GroupCall(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("join_muted")
        @TLConditional("flags", 1)
        @get:JvmName("joinMuted")
        public val joinMuted: Unit? = null,
        @SerialName("can_change_join_muted")
        @TLConditional("flags", 2)
        @get:JvmName("canChangeJoinMuted")
        public val canChangeJoinMuted: Unit? = null,
        @SerialName("join_date_asc")
        @TLConditional("flags", 6)
        @get:JvmName("joinDateAsc")
        public val joinDateAsc: Unit? = null,
        @SerialName("schedule_start_subscribed")
        @TLConditional("flags", 8)
        @get:JvmName("scheduleStartSubscribed")
        public val scheduleStartSubscribed: Unit? = null,
        @SerialName("can_start_video")
        @TLConditional("flags", 9)
        @get:JvmName("canStartVideo")
        public val canStartVideo: Unit? = null,
        @SerialName("record_video_active")
        @TLConditional("flags", 11)
        @get:JvmName("recordVideoActive")
        public val recordVideoActive: Unit? = null,
        @SerialName("rtmp_stream")
        @TLConditional("flags", 12)
        @get:JvmName("rtmpStream")
        public val rtmpStream: Unit? = null,
        @SerialName("listeners_hidden")
        @TLConditional("flags", 13)
        @get:JvmName("listenersHidden")
        public val listenersHidden: Unit? = null,
        @get:JvmName("id")
        public val id: Long,
        @SerialName("access_hash")
        @get:JvmName("accessHash")
        public val accessHash: Long,
        @SerialName("participants_count")
        @get:JvmName("participantsCount")
        public val participantsCount: Int,
        @TLConditional("flags", 3)
        @get:JvmName("title")
        public val title: String? = null,
        @SerialName("stream_dc_id")
        @TLConditional("flags", 4)
        @get:JvmName("streamDcId")
        public val streamDcId: Int? = null,
        @SerialName("record_start_date")
        @TLConditional("flags", 5)
        @get:JvmName("recordStartDate")
        public val recordStartDate: Int? = null,
        @SerialName("schedule_date")
        @TLConditional("flags", 7)
        @get:JvmName("scheduleDate")
        public val scheduleDate: Int? = null,
        @SerialName("unmuted_video_count")
        @TLConditional("flags", 10)
        @get:JvmName("unmutedVideoCount")
        public val unmutedVideoCount: Int? = null,
        @SerialName("unmuted_video_limit")
        @get:JvmName("unmutedVideoLimit")
        public val unmutedVideoLimit: Int,
        @get:JvmName("version")
        public val version: Int,
    ) : tl.telegram.GroupCall {
        public companion object
    }

    public companion object
}