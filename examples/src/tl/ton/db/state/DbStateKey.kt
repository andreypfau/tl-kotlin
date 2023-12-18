// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.ton.db.state

import io.github.andreypfau.tl.serialization.TLCombinatorId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("@type")
public enum class DbStateKey {
    @SerialName("db.state.key.destroyedSessions")
    @TLCombinatorId(0xE8F7F159)
    DESTROYED_SESSIONS,
    @SerialName("db.state.key.initBlockId")
    @TLCombinatorId(0x758278E3)
    INIT_BLOCK_ID,
    @SerialName("db.state.key.gcBlockId")
    @TLCombinatorId(0xC379F3DE)
    GC_BLOCK_ID,
    @SerialName("db.state.key.shardClient")
    @TLCombinatorId(0xC99B3187)
    SHARD_CLIENT,
    @SerialName("db.state.key.asyncSerializer")
    @TLCombinatorId(0x29AE8A1F)
    ASYNC_SERIALIZER,
    @SerialName("db.state.key.hardforks")
    @TLCombinatorId(0xE6F427BA)
    HARDFORKS,
    @SerialName("db.state.key.dbVersion")
    @TLCombinatorId(0x724F2154)
    DB_VERSION,
    ;

    public companion object
}
