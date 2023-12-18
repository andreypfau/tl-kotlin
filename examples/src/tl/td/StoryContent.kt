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
public sealed interface StoryContent {
    @Serializable
    @SerialName("storyContentPhoto")
    @TLCombinatorId(0xD45F0050)
    public data class StoryContentPhoto(
        @get:JvmName("photo")
        public val photo: Photo,
    ) : StoryContent {
        public companion object
    }

    @Serializable
    @SerialName("storyContentVideo")
    @TLCombinatorId(0xB30162A6)
    public data class StoryContentVideo(
        @get:JvmName("video")
        public val video: StoryVideo,
        @SerialName("alternative_video")
        @get:JvmName("alternativeVideo")
        public val alternativeVideo: StoryVideo,
    ) : StoryContent {
        public companion object
    }

    @Serializable
    @SerialName("storyContentUnsupported")
    @TLCombinatorId(0x86C7F56E)
    public object StoryContentUnsupported : StoryContent

    public companion object
}
