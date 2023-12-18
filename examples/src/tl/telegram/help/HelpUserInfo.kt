// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.help

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.MessageEntity

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface HelpUserInfo {
    @Serializable
    @SerialName("help.userInfoEmpty")
    @TLCombinatorId(0xF3AE2EED)
    public object UserInfoEmpty : HelpUserInfo

    @Serializable
    @SerialName("help.userInfo")
    @TLCombinatorId(0x1EB3758)
    public data class UserInfo(
        @get:JvmName("message")
        public val message: String,
        @get:JvmName("entities")
        public val entities: List<MessageEntity>,
        @get:JvmName("author")
        public val author: String,
        @get:JvmName("date")
        public val date: Int,
    ) : HelpUserInfo {
        public companion object
    }

    public companion object
}
