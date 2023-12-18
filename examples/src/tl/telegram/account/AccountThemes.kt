// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.account

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import tl.telegram.Theme

@Serializable
@JsonClassDiscriminator("@type")
public sealed interface AccountThemes {
    @Serializable
    @SerialName("account.themesNotModified")
    @TLCombinatorId(0xF41EB622)
    public object ThemesNotModified : AccountThemes

    @Serializable
    @SerialName("account.themes")
    @TLCombinatorId(0x9A3D8C6D)
    public data class Themes(
        @get:JvmName("hash")
        public val hash: Long,
        @get:JvmName("themes")
        public val themes: List<Theme>,
    ) : AccountThemes {
        public companion object
    }

    public companion object
}