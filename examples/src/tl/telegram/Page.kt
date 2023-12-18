// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("page")
@TLCombinatorId(0x98657F0D)
public data class Page(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("part")
    public val part: Unit? = null,
    @TLConditional("flags", 1)
    @get:JvmName("rtl")
    public val rtl: Unit? = null,
    @TLConditional("flags", 2)
    @get:JvmName("v2")
    public val v2: Unit? = null,
    @get:JvmName("url")
    public val url: String,
    @get:JvmName("blocks")
    public val blocks: List<PageBlock>,
    @get:JvmName("photos")
    public val photos: List<Photo>,
    @get:JvmName("documents")
    public val documents: List<Document>,
    @TLConditional("flags", 3)
    @get:JvmName("views")
    public val views: Int? = null,
) {
    public companion object
}