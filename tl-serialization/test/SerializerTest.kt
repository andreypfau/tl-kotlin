package io.github.andreypfau.tl.serialization

import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlin.test.Test
import kotlin.test.assertEquals

class SerializerTest {

    @Serializable
    @TLCombinatorId(0xCAFEBABE)
    data class Foo(
        val flag: Int,
        @TLConditional("flag", 0)
        @Serializable(Base64ByteStringSerializer::class)
        val value: ByteString?
    )

    @Test
    fun testConditional() {
        val expected = Foo(1, ByteString(1, 2, 3))
        val bytes = TL.encodeToByteArray(expected)
        val actual = TL.decodeFromByteArray<Foo>(bytes)
        assertEquals(expected, actual)
    }

    @Test
    fun testConditionalNull() {
        val expected = Foo(0, null)
        val bytes = TL.encodeToByteArray(expected)
        val actual = TL.decodeFromByteArray<Foo>(bytes)
        assertEquals(expected, actual)
    }
}
