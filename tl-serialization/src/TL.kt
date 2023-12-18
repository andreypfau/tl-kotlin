package io.github.andreypfau.tl.serialization

import kotlinx.io.Buffer
import kotlinx.io.Sink
import kotlinx.io.Source
import kotlinx.io.readByteArray
import kotlinx.serialization.BinaryFormat
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule

sealed class TL(
    override val serializersModule: SerializersModule
) : BinaryFormat {
    companion object Default : TL(EmptySerializersModule())

    override fun <T> encodeToByteArray(serializer: SerializationStrategy<T>, value: T): ByteArray {
        val buffer = Buffer()
        encodeToSink(serializer, buffer, value)
        return buffer.readByteArray()
    }

    override fun <T> decodeFromByteArray(deserializer: DeserializationStrategy<T>, bytes: ByteArray): T {
        val buffer = Buffer()
        buffer.write(bytes)
        return decodeFromSource(deserializer, buffer)
    }

    private fun <T> encodeToSink(serializationStrategy: SerializationStrategy<T>, sink: Sink, value: T) {
        val encoder = TLEncoder(this, sink, intArrayOf())
        encoder.encodeSerializableValue(serializationStrategy, value)
    }

    private fun <T> decodeFromSource(deserializer: DeserializationStrategy<T>, source: Source): T {
        val decoder = TLDecoder(this, source, intArrayOf())
        return decoder.decodeSerializableValue(deserializer)
    }
}
