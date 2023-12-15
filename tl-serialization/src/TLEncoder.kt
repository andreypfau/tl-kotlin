package io.github.andreypfau.tl.serialization

import io.github.andreypfau.tl.serialization.annotation.TLFlag
import io.github.andreypfau.tl.serialization.annotation.TLNullable
import io.github.andreypfau.tl.serialization.annotation.getTlConstructorId
import kotlinx.io.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.builtins.ByteArraySerializer
import kotlinx.serialization.builtins.UByteArraySerializer
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.modules.SerializersModule

@OptIn(ExperimentalSerializationApi::class)
class TLEncoder(
    private val tl: TL,
    private val sink: Sink,
    private val flagFields: MutableMap<String, Int> = HashMap()
) : CompositeEncoder, Encoder {

    override val serializersModule: SerializersModule
        get() = tl.serializersModule

    override fun encodeNull() {
        //
    }

    override fun encodeBoolean(value: Boolean) = encodeInt((if (value) 0x997275b5 else 0xbc799737).toInt())
    override fun encodeByte(value: Byte) = encodeInt(value.toInt())
    override fun encodeChar(value: Char) = encodeInt(value.code)
    override fun encodeShort(value: Short) = sink.writeShortLe(value)
    override fun encodeInt(value: Int) = sink.writeIntLe(value)
    override fun encodeLong(value: Long) = sink.writeLongLe(value)
    override fun encodeFloat(value: Float) = encodeInt(value.toBits())
    override fun encodeInline(descriptor: SerialDescriptor): Encoder = this
    override fun encodeDouble(value: Double) = encodeLong(value.toBits())
    override fun encodeString(value: String) = encodeByteArray(value.encodeToByteArray())

    override fun encodeEnum(enumDescriptor: SerialDescriptor, index: Int) =
        encodeInt(enumDescriptor.getTlConstructorId(index).toInt())


    override fun encodeBooleanElement(descriptor: SerialDescriptor, index: Int, value: Boolean) =
        encodeBoolean(value)

    override fun encodeByteElement(descriptor: SerialDescriptor, index: Int, value: Byte) =
        encodeByte(value)

    override fun encodeCharElement(descriptor: SerialDescriptor, index: Int, value: Char) =
        encodeChar(value)

    override fun encodeShortElement(descriptor: SerialDescriptor, index: Int, value: Short) =
        encodeShort(value)

    override fun encodeIntElement(descriptor: SerialDescriptor, index: Int, value: Int) {
        val annotations = descriptor.getElementAnnotations(index)
        for (k in annotations.indices) {
            val annotation = annotations[k]
            if (annotation is TLFlag) {
                flagFields[descriptor.getElementName(k)] = value
                break
            }
        }
        encodeInt(value)
    }

    override fun encodeLongElement(descriptor: SerialDescriptor, index: Int, value: Long) =
        encodeLong(value)

    @ExperimentalSerializationApi
    override fun <T : Any> encodeNullableSerializableElement(
        descriptor: SerialDescriptor,
        index: Int,
        serializer: SerializationStrategy<T>,
        value: T?
    ) {
        val annotations = descriptor.getElementAnnotations(index)
        for (k in annotations.indices) {
            val annotation = annotations[k]
            if (annotation is TLNullable) {
                val flags = flagFields[annotation.field] ?: error("No flag field '${annotation.field}' for nullable '${descriptor.getElementName(index)}'")
                if (1 shl annotation.index and flags != 0) {
                    if (value == null) {
                        throw Exception("${descriptor.getElementName(index)} flagged as not-null by '${annotation.field}' field is null")
                    } else {
                        encodeSerializableValue(serializer, value)
                    }
                }
                break
            }
        }
    }

    override fun <T> encodeSerializableElement(
        descriptor: SerialDescriptor,
        index: Int,
        serializer: SerializationStrategy<T>,
        value: T
    ) = encodeSerializableValue(serializer, value)

    override fun encodeFloatElement(descriptor: SerialDescriptor, index: Int, value: Float) =
        encodeFloat(value)

    override fun encodeDoubleElement(descriptor: SerialDescriptor, index: Int, value: Double) =
        encodeDouble(value)

    override fun encodeInlineElement(descriptor: SerialDescriptor, index: Int): Encoder =
        this

    override fun encodeStringElement(descriptor: SerialDescriptor, index: Int, value: String) =
        encodeString(value)


    @OptIn(ExperimentalUnsignedTypes::class)
    override fun <T> encodeSerializableValue(serializer: SerializationStrategy<T>, value: T) {
        when (serializer) {
            ByteArraySerializer() -> encodeByteArray(value as ByteArray)
            UByteArraySerializer() -> encodeByteArray((value as UByteArray).asByteArray())
            else -> serializer.serialize(this, value)
        }
    }

    override fun beginCollection(descriptor: SerialDescriptor, collectionSize: Int): CompositeEncoder {
        encodeInt(collectionSize)
        return beginStructure(descriptor)
    }

    override fun beginStructure(descriptor: SerialDescriptor): CompositeEncoder {
        if (descriptor.kind is PolymorphicKind) {
            encodeInt(descriptor.getTlConstructorId().toInt())
        }
        return TLEncoder(tl, sink, HashMap())
    }

    override fun endStructure(descriptor: SerialDescriptor) {
        // do nothing
    }

    fun encodeByteArray(value: ByteArray) {
        encodeBytesPadding(value.size) {
            sink.write(value)
        }
    }

    private inline fun encodeBytesPadding(size: Int, block: () -> Unit) {
        var totalLength = size
        if (totalLength < 254) {
            sink.writeUByte(totalLength.toUByte())
            totalLength++
        } else if (totalLength < (1 shl 24)) {
            sink.writeUByte(254u)
            sink.writeUByte((totalLength and 255).toUByte())
            sink.writeUByte(((totalLength shr 8) and 255).toUByte())
            sink.writeUByte((totalLength shr 16).toUByte())
            totalLength += 4
        } else if (totalLength < Int.MAX_VALUE) {
            sink.writeUByte(255u)
            sink.writeUByte((totalLength and 255).toUByte())
            sink.writeUByte(((totalLength shr 8) and 255).toUByte())
            sink.writeUByte(((totalLength shr 16) and 255).toUByte())
            sink.writeUByte(((totalLength shr 24) and 255).toUByte())
            sink.writeByte(0)
            sink.writeByte(0)
            sink.writeByte(0)
            totalLength += 8
        } else {
            error("Too big byte array: $totalLength")
        }
        block()
        while (totalLength++ % 4 > 0) {
            sink.writeByte(0)
        }
    }
}
