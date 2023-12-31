// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.stories

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.Chat
import tl.telegram.StoryItem
import tl.telegram.User

@Serializable
@SerialName("stories.stories")
@TLCombinatorId(0x5DD8C3C8)
public data class StoriesStories(
    @get:JvmName("count")
    public val count: Int,
    @get:JvmName("stories")
    public val stories: List<StoryItem>,
    @get:JvmName("chats")
    public val chats: List<Chat>,
    @get:JvmName("users")
    public val users: List<User>,
) {
    public companion object
}
