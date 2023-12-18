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
public sealed interface PageBlock {
    @Serializable
    @SerialName("pageBlockUnsupported")
    @TLCombinatorId(0x13567E8A)
    public object PageBlockUnsupported : PageBlock

    @Serializable
    @SerialName("pageBlockTitle")
    @TLCombinatorId(0x70ABC3FD)
    public data class PageBlockTitle(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockSubtitle")
    @TLCombinatorId(0x8FFA9A1F)
    public data class PageBlockSubtitle(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockAuthorDate")
    @TLCombinatorId(0xBAAFE5E0)
    public data class PageBlockAuthorDate(
        @get:JvmName("author")
        public val author: RichText,
        @SerialName("published_date")
        @get:JvmName("publishedDate")
        public val publishedDate: Int,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockHeader")
    @TLCombinatorId(0xBFD064EC)
    public data class PageBlockHeader(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockSubheader")
    @TLCombinatorId(0xF12BB6E1)
    public data class PageBlockSubheader(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockParagraph")
    @TLCombinatorId(0x467A0766)
    public data class PageBlockParagraph(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockPreformatted")
    @TLCombinatorId(0xC070D93E)
    public data class PageBlockPreformatted(
        @get:JvmName("text")
        public val text: RichText,
        @get:JvmName("language")
        public val language: String,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockFooter")
    @TLCombinatorId(0x48870999)
    public data class PageBlockFooter(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockDivider")
    @TLCombinatorId(0xDB20B188)
    public object PageBlockDivider : PageBlock

    @Serializable
    @SerialName("pageBlockAnchor")
    @TLCombinatorId(0xCE0D37B0)
    public data class PageBlockAnchor(
        @get:JvmName("name")
        public val name: String,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockList")
    @TLCombinatorId(0xE4E88011)
    public data class PageBlockList(
        @get:JvmName("items")
        public val items: List<PageListItem>,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockBlockquote")
    @TLCombinatorId(0x263D7C26)
    public data class PageBlockBlockquote(
        @get:JvmName("text")
        public val text: RichText,
        @get:JvmName("caption")
        public val caption: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockPullquote")
    @TLCombinatorId(0x4F4456D3)
    public data class PageBlockPullquote(
        @get:JvmName("text")
        public val text: RichText,
        @get:JvmName("caption")
        public val caption: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockPhoto")
    @TLCombinatorId(0x1759C560)
    public data class PageBlockPhoto(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("photo_id")
        @get:JvmName("photoId")
        public val photoId: Long,
        @get:JvmName("caption")
        public val caption: PageCaption,
        @TLConditional("flags", 0)
        @get:JvmName("url")
        public val url: String? = null,
        @SerialName("webpage_id")
        @TLConditional("flags", 0)
        @get:JvmName("webpageId")
        public val webpageId: Long? = null,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockVideo")
    @TLCombinatorId(0x7C8FE7B6)
    public data class PageBlockVideo(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("autoplay")
        public val autoplay: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("loop")
        public val loop: Unit? = null,
        @SerialName("video_id")
        @get:JvmName("videoId")
        public val videoId: Long,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockCover")
    @TLCombinatorId(0x39F23300)
    public data class PageBlockCover(
        @get:JvmName("cover")
        public val cover: PageBlock,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockEmbed")
    @TLCombinatorId(0xA8718DC5)
    public data class PageBlockEmbed(
        @get:JvmName("flags")
        public val flags: Int,
        @SerialName("full_width")
        @TLConditional("flags", 0)
        @get:JvmName("fullWidth")
        public val fullWidth: Unit? = null,
        @SerialName("allow_scrolling")
        @TLConditional("flags", 3)
        @get:JvmName("allowScrolling")
        public val allowScrolling: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("url")
        public val url: String? = null,
        @TLConditional("flags", 2)
        @get:JvmName("html")
        public val html: String? = null,
        @SerialName("poster_photo_id")
        @TLConditional("flags", 4)
        @get:JvmName("posterPhotoId")
        public val posterPhotoId: Long? = null,
        @TLConditional("flags", 5)
        @get:JvmName("w")
        public val w: Int? = null,
        @TLConditional("flags", 5)
        @get:JvmName("h")
        public val h: Int? = null,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockEmbedPost")
    @TLCombinatorId(0xF259A80B)
    public data class PageBlockEmbedPost(
        @get:JvmName("url")
        public val url: String,
        @SerialName("webpage_id")
        @get:JvmName("webpageId")
        public val webpageId: Long,
        @SerialName("author_photo_id")
        @get:JvmName("authorPhotoId")
        public val authorPhotoId: Long,
        @get:JvmName("author")
        public val author: String,
        @get:JvmName("date")
        public val date: Int,
        @get:JvmName("blocks")
        public val blocks: List<PageBlock>,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockCollage")
    @TLCombinatorId(0x65A0FA4D)
    public data class PageBlockCollage(
        @get:JvmName("items")
        public val items: List<PageBlock>,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockSlideshow")
    @TLCombinatorId(0x31F9590)
    public data class PageBlockSlideshow(
        @get:JvmName("items")
        public val items: List<PageBlock>,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockChannel")
    @TLCombinatorId(0xEF1751B5)
    public data class PageBlockChannel(
        @get:JvmName("channel")
        public val channel: Chat,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockAudio")
    @TLCombinatorId(0x804361EA)
    public data class PageBlockAudio(
        @SerialName("audio_id")
        @get:JvmName("audioId")
        public val audioId: Long,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockKicker")
    @TLCombinatorId(0x1E148390)
    public data class PageBlockKicker(
        @get:JvmName("text")
        public val text: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockTable")
    @TLCombinatorId(0xBF4DEA82)
    public data class PageBlockTable(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("bordered")
        public val bordered: Unit? = null,
        @TLConditional("flags", 1)
        @get:JvmName("striped")
        public val striped: Unit? = null,
        @get:JvmName("title")
        public val title: RichText,
        @get:JvmName("rows")
        public val rows: List<PageTableRow>,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockOrderedList")
    @TLCombinatorId(0x9A8AE1E1)
    public data class PageBlockOrderedList(
        @get:JvmName("items")
        public val items: List<PageListOrderedItem>,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockDetails")
    @TLCombinatorId(0x76768BED)
    public data class PageBlockDetails(
        @get:JvmName("flags")
        public val flags: Int,
        @TLConditional("flags", 0)
        @get:JvmName("open")
        public val `open`: Unit? = null,
        @get:JvmName("blocks")
        public val blocks: List<PageBlock>,
        @get:JvmName("title")
        public val title: RichText,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockRelatedArticles")
    @TLCombinatorId(0x16115A96)
    public data class PageBlockRelatedArticles(
        @get:JvmName("title")
        public val title: RichText,
        @get:JvmName("articles")
        public val articles: List<PageRelatedArticle>,
    ) : PageBlock {
        public companion object
    }

    @Serializable
    @SerialName("pageBlockMap")
    @TLCombinatorId(0xA44F3EF6)
    public data class PageBlockMap(
        @get:JvmName("geo")
        public val geo: GeoPoint,
        @get:JvmName("zoom")
        public val zoom: Int,
        @get:JvmName("w")
        public val w: Int,
        @get:JvmName("h")
        public val h: Int,
        @get:JvmName("caption")
        public val caption: PageCaption,
    ) : PageBlock {
        public companion object
    }

    public companion object
}
