package io.github.andreypfau.tl.serialization

import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class BytesTest {
    @Test
    fun testBytes() {
        assertBytes("00 00 00 00", "")
        assertBytes("01 FF 00 00", "FF")
        assertBytes("02 FF FF 00", "FF FF")
        assertBytes("03 FF FF FF", "FF FF FF")
        assertBytes("04 FF FF FF FF 00 00 00", "FF FF FF FF")
        assertBytes("05 FF FF FF FF FF 00 00", "FF FF FF FF FF")
        assertBytes("06 FF FF FF FF FF FF 00", "FF FF FF FF FF FF")
        assertBytes("07 FF FF FF FF FF FF FF", "FF FF FF FF FF FF FF")
    }

    @Test
    fun `fuzz test bytes`() {
        repeat(25) {
            val size = 1 shl it
            val bytes = Random.nextBytes(size)
            assertEncoding(bytes)
        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun assertBytes(data: String, expected: String) {
        val serializedBytes = data.replace(" ", "").hexToByteArray()
        val expectedBytes = expected.replace(" ", "").hexToByteArray()
        val actualReadBytes = TL.decodeFromByteArray<ByteArray>(serializedBytes)
        assertContentEquals(expectedBytes, actualReadBytes)
        val actualWriteBytes = TL.encodeToByteArray(expectedBytes)
        assertTrue(actualWriteBytes.size % 4 == 0)
        assertContentEquals(serializedBytes, actualWriteBytes)
    }

    private fun assertEncoding(data: ByteArray) {
        val serializedBytes = TL.encodeToByteArray(data)
        assertTrue(serializedBytes.size % 4 == 0)
        val deserializedBytes = TL.decodeFromByteArray<ByteArray>(serializedBytes)
        assertContentEquals(data, deserializedBytes)
    }
}
