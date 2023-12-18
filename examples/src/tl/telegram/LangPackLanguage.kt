// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("langPackLanguage")
@TLCombinatorId(0xEECA5CE3)
public data class LangPackLanguage(
    @get:JvmName("flags")
    public val flags: Int,
    @TLConditional("flags", 0)
    @get:JvmName("official")
    public val official: Unit? = null,
    @TLConditional("flags", 2)
    @get:JvmName("rtl")
    public val rtl: Unit? = null,
    @TLConditional("flags", 3)
    @get:JvmName("beta")
    public val beta: Unit? = null,
    @get:JvmName("name")
    public val name: String,
    @SerialName("native_name")
    @get:JvmName("nativeName")
    public val nativeName: String,
    @SerialName("lang_code")
    @get:JvmName("langCode")
    public val langCode: String,
    @SerialName("base_lang_code")
    @TLConditional("flags", 1)
    @get:JvmName("baseLangCode")
    public val baseLangCode: String? = null,
    @SerialName("plural_code")
    @get:JvmName("pluralCode")
    public val pluralCode: String,
    @SerialName("strings_count")
    @get:JvmName("stringsCount")
    public val stringsCount: Int,
    @SerialName("translated_count")
    @get:JvmName("translatedCount")
    public val translatedCount: Int,
    @SerialName("translations_url")
    @get:JvmName("translationsUrl")
    public val translationsUrl: String,
) {
    public companion object
}
