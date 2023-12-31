// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("pageRelatedArticle")
@TLCombinatorId(0xB390DC08)
public data class PageRelatedArticle(
    @get:JvmName("flags")
    public val flags: Int,
    @get:JvmName("url")
    public val url: String,
    @SerialName("webpage_id")
    @get:JvmName("webpageId")
    public val webpageId: Long,
    @TLConditional("flags", 0)
    @get:JvmName("title")
    public val title: String? = null,
    @TLConditional("flags", 1)
    @get:JvmName("description")
    public val description: String? = null,
    @SerialName("photo_id")
    @TLConditional("flags", 2)
    @get:JvmName("photoId")
    public val photoId: Long? = null,
    @TLConditional("flags", 3)
    @get:JvmName("author")
    public val author: String? = null,
    @SerialName("published_date")
    @TLConditional("flags", 4)
    @get:JvmName("publishedDate")
    public val publishedDate: Int? = null,
) {
    public companion object
}
