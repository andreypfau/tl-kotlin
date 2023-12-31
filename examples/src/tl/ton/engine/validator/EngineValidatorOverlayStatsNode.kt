// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.engine.validator

import io.github.andreypfau.tl.serialization.Base64ByteStringSerializer
import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLFixedSize
import kotlin.jvm.JvmName
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("engine.validator.overlayStatsNode")
@TLCombinatorId(0xF97220D9)
public data class EngineValidatorOverlayStatsNode(
    @SerialName("adnl_id")
    @TLFixedSize(value = 32)
    @get:JvmName("adnlId")
    public val adnlId: @Serializable(Base64ByteStringSerializer::class) ByteString,
    @SerialName("ip_addr")
    @get:JvmName("ipAddr")
    public val ipAddr: String,
    @SerialName("bdcst_errors")
    @get:JvmName("bdcstErrors")
    public val bdcstErrors: Int,
    @SerialName("fec_bdcst_errors")
    @get:JvmName("fecBdcstErrors")
    public val fecBdcstErrors: Int,
    @SerialName("last_in_query")
    @get:JvmName("lastInQuery")
    public val lastInQuery: Int,
    @SerialName("last_out_query")
    @get:JvmName("lastOutQuery")
    public val lastOutQuery: Int,
    @SerialName("t_out_bytes")
    @get:JvmName("tOutBytes")
    public val tOutBytes: Int,
    @SerialName("t_in_bytes")
    @get:JvmName("tInBytes")
    public val tInBytes: Int,
    @SerialName("t_out_pckts")
    @get:JvmName("tOutPckts")
    public val tOutPckts: Int,
    @SerialName("t_in_pckts")
    @get:JvmName("tInPckts")
    public val tInPckts: Int,
) {
    public companion object
}
