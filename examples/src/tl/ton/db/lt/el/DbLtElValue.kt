// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.lt.el

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.ton.tonnode.TonNodeBlockIdExt

@Serializable
@SerialName("db.lt.el.value")
@TLCombinatorId(0x95E65F64)
public data class DbLtElValue(
    @get:JvmName("id")
    public val id: TonNodeBlockIdExt,
    @get:JvmName("lt")
    public val lt: Long,
    @get:JvmName("ts")
    public val ts: Int,
) {
    public companion object
}
