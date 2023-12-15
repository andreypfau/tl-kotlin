package io.github.andreypfau.tl.serialization

import io.github.andreypfau.tl.serialization.annotation.TLFlag
import io.github.andreypfau.tl.serialization.annotation.TLNullable
import io.github.andreypfau.tl.serialization.annotation.getTlConstructorId
import kotlinx.io.*
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.builtins.ByteArraySerializer
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.modules.SerializersModule

class TLDecoder(
    private val tl: TL,
    private val source: Source,
) : Decoder, CompositeDecoder {
    private val flagFields: MutableMap<String, Int> = HashMap()
    override val serializersModule: SerializersModule
        get() = tl.serializersModule

    private var elementIndex: Int = 0

    override fun decodeBoolean(): Boolean {
        return when (val value = decodeInt()) {
            0x997275b5.toInt() -> true
            0xbc799737.toInt() -> false
            else -> error("Invalid boolean value: $value")
        }
    }

    override fun decodeByte(): Byte = decodeInt().toByte()
    override fun decodeChar(): Char = decodeInt().toChar()
    override fun decodeShort(): Short = source.readShortLe()
    @OptIn(ExperimentalStdlibApi::class)
    override fun decodeInt(): Int = source.readIntLe().also {
//        println("decoded int: $it - ${it.toHexString()}")
    }
    override fun decodeLong(): Long = source.readLongLe()

    @ExperimentalSerializationApi
    override fun decodeNotNullMark(): Boolean = true

    @ExperimentalSerializationApi
    override fun decodeNull(): Nothing? = null

    override fun decodeFloat(): Float = Float.fromBits(decodeInt())
    override fun decodeInline(descriptor: SerialDescriptor): Decoder = this

    override fun decodeDouble(): Double = Double.fromBits(decodeLong())

    @OptIn(ExperimentalSerializationApi::class)
    override fun decodeEnum(enumDescriptor: SerialDescriptor): Int {
        val value = decodeInt()
        for (i in 0 until enumDescriptor.elementsCount) {
            if (enumDescriptor.getTlConstructorId(i) == value) {
                return i
            }
        }
        error("No enum value found for $value")
    }

    override fun decodeString(): String = decodeByteArray().decodeToString()

    override fun decodeBooleanElement(descriptor: SerialDescriptor, index: Int): Boolean = decodeBoolean()
    override fun decodeByteElement(descriptor: SerialDescriptor, index: Int): Byte = decodeByte()
    override fun decodeCharElement(descriptor: SerialDescriptor, index: Int): Char = decodeChar()
    override fun decodeShortElement(descriptor: SerialDescriptor, index: Int): Short = decodeShort()

    @OptIn(ExperimentalSerializationApi::class)
    override fun decodeIntElement(descriptor: SerialDescriptor, index: Int): Int {
//        println("decodeIntElement: $descriptor - $index")
        val value = decodeInt()
        val annotations = descriptor.getElementAnnotations(index)
        for (k in annotations.indices) {
            val annotation = annotations[k]
            if (annotation is TLFlag) {
                flagFields[descriptor.getElementName(index)] = value
                break
            }
        }
        return value.also {
//            println("decoded: $it | ${it.toString(16)}")
        }
    }

    override fun decodeLongElement(descriptor: SerialDescriptor, index: Int): Long = decodeLong()

    override fun decodeDoubleElement(descriptor: SerialDescriptor, index: Int): Double = decodeDouble()
    override fun decodeFloatElement(descriptor: SerialDescriptor, index: Int): Float = decodeFloat()
    override fun decodeStringElement(descriptor: SerialDescriptor, index: Int): String = decodeString().also {
//        println("decoded string: $it - $index - ${descriptor.serialName}")
    }
    override fun endStructure(descriptor: SerialDescriptor) {
//        println("endStructure: $descriptor")
        // do nothing
    }

    override fun decodeInlineElement(descriptor: SerialDescriptor, index: Int): Decoder = this

    @ExperimentalSerializationApi
    override fun <T : Any> decodeNullableSerializableElement(
        descriptor: SerialDescriptor,
        index: Int,
        deserializer: DeserializationStrategy<T?>,
        previousValue: T?
    ): T? {
        val annotations = descriptor.getElementAnnotations(index)
        for (k in annotations.indices) {
            val annotation = annotations[k]
            if (annotation is TLNullable) {
                val flags = flagFields[annotation.field]
                    ?: error("No flag field '${annotation.field}' for nullable '${descriptor.getElementName(index)}'")
//                println("decode nullable by flag: ${flags.toUInt().toString(2)} | $index | $deserializer")
                if (1 shl (annotation.index) and flags != 0) {
                    return decodeSerializableValue(deserializer).also {
//                        println("decoded by flag ${flags.toUInt().toString(2)} $index: $it")
                    }
                }
                break
            }
        }
        return null
    }

    @OptIn(InternalSerializationApi::class, ExperimentalStdlibApi::class)
    @Suppress("UNCHECKED_CAST")
    override fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<T>): T {
        if (deserializer == ByteArraySerializer()) {
            return decodeByteArray() as T
        }
        if (deserializer.descriptor.kind is PolymorphicKind) {
            val currentConstructorId = decodeInt()

            val elementDescriptor = deserializer.descriptor.getElementDescriptor(1)
            for (i in 0 until elementDescriptor.elementsCount) {
                val subclass = elementDescriptor.getElementDescriptor(i)
                val elementConstructorId = subclass.getTlConstructorId()

                if (currentConstructorId == elementConstructorId) {
                    val serialName = subclass.serialName
                    val subclassDeserializer =
                        (deserializer as SealedClassSerializer<*>).findPolymorphicSerializerOrNull(this, serialName)
                            ?: error("No polymorphic serializer for $serialName")
                    return decodeSerializableValue(subclassDeserializer) as T
                }
            }
            throw IllegalStateException("No constructor id $currentConstructorId (${currentConstructorId.toHexString()}) found in ${elementDescriptor.serialName}")
        }
        return super.decodeSerializableValue(deserializer).also {
            println("decodedSerializableValue: $it")
        }
    }

    @ExperimentalSerializationApi
    override fun decodeSequentially(): Boolean = true

    override fun <T> decodeSerializableElement(
        descriptor: SerialDescriptor,
        index: Int,
        deserializer: DeserializationStrategy<T>,
        previousValue: T?
    ): T {
//        println("decode: $descriptor - $index - $deserializer")
        return decodeSerializableValue(deserializer)
    }


    override fun decodeCollectionSize(descriptor: SerialDescriptor): Int = decodeInt()

    override fun decodeElementIndex(descriptor: SerialDescriptor): Int {
        return elementIndex++
    }

    override fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder {
        println("beginStructure: $descriptor")
        return TLDecoder(tl, source)
    }

    fun decodeByteArray(): ByteArray {
        var resultLength = source.readUByte().toInt()
        val resultAlignedLength: Int = if (resultLength < 254) {
            resultLength + 1
        } else if (resultLength == 254) {
            resultLength = source.readUByte().toInt() or
                    (source.readUByte().toInt() shl 8) or
                    (source.readUByte().toInt() shl 16)
            resultLength + 4
        } else {
            val resultLengthLong = source.readUByte().toLong() or
                    (source.readUByte().toLong() shl 8) or
                    (source.readUByte().toLong() shl 16) or
                    (source.readUByte().toLong() shl 24) or
                    (source.readUByte().toLong() shl 32) or
                    (source.readUByte().toLong() shl 40) or
                    (source.readUByte().toLong() shl 48)
            check(resultLengthLong <= Int.MAX_VALUE) {
                "Too big byte array: $resultLengthLong"
            }
            resultLength = resultLengthLong.toInt()
            resultLength + 8
        }
        val result = source.readByteArray(resultLength)
        source.skip(((4 - resultAlignedLength % 4) % 4).toLong())
        return result
    }
}
