package io.github.andreypfau.tl.tls

import io.github.andreypfau.tl.serialization.TL
import kotlinx.io.Buffer
import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.io.readByteArray
import kotlinx.io.writeIntLe
import kotlinx.serialization.decodeFromByteArray
import kotlin.test.Test

class TlsExampleTest {
//    @Test
//    fun deserialize() {
//        val buffer = Buffer()
//
//        val s = SystemFileSystem.source(Path("/Users/andreypfau/CLionProjects/td/td/generate/auto/tlo/telegram_api.tlo"))
//
////        TL_TLO.split("\n").map {
////            it.split(" ").drop(1).map {
////                it.toUInt(16).toInt()
////            }
////        }.flatten().forEach {
////            buffer.writeIntLe(it)
////        }
////        SystemFileSystem.sink(Path("tl.tlo")).write(buffer.copy(), buffer.size)
//
//        val tls = TL.decodeFromByteArray<Tls>(s.buffered().readByteArray())
//        println(tls)
//    }
}
