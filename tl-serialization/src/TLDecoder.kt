package io.github.andreypfau.tl.serialization

import io.github.andreypfau.tl.serialization.builtin.Int128
import io.github.andreypfau.tl.serialization.builtin.Int128Serializer
import io.github.andreypfau.tl.serialization.builtin.Int256
import io.github.andreypfau.tl.serialization.builtin.Int256Serializer
import kotlinx.io.*
import kotlinx.io.bytestring.ByteString
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.builtins.ByteArraySerializer
import kotlinx.serialization.builtins.UByteArraySerializer
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.modules.SerializersModule

class TLDecoder(
    private val tl: TL,
    private val source: Source,
    private val intValuesCache: IntArray
) : Decoder, CompositeDecoder {
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
    override fun decodeInt(): Int = source.readIntLe()
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
            if (enumDescriptor.getTlCombinatorId(i) == value) {
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

    override fun decodeIntElement(descriptor: SerialDescriptor, index: Int): Int {
        val value = decodeInt()
        intValuesCache[index] = value
        return value
    }

    override fun decodeLongElement(descriptor: SerialDescriptor, index: Int): Long = decodeLong()

    override fun decodeDoubleElement(descriptor: SerialDescriptor, index: Int): Double = decodeDouble()
    override fun decodeFloatElement(descriptor: SerialDescriptor, index: Int): Float = decodeFloat()
    override fun decodeStringElement(descriptor: SerialDescriptor, index: Int): String = decodeString()
    override fun endStructure(descriptor: SerialDescriptor) {
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
            if (annotation is TLConditional) {
                val flags = intValuesCache[descriptor.getElementIndex(annotation.field)]
                if (flags == -1) {
                    error("No value found for `${annotation.field}`")
                }
                if (1 shl (annotation.value) and flags != 0) {
                    return decodeSerializableValue(deserializer)
                }
                break
            }
        }
        return null
    }

    @OptIn(
        InternalSerializationApi::class, ExperimentalStdlibApi::class, ExperimentalSerializationApi::class,
        ExperimentalUnsignedTypes::class
    )
    @Suppress("UNCHECKED_CAST")
    override fun <T> decodeSerializableValue(deserializer: DeserializationStrategy<T>): T {
        when {
            deserializer == ByteArraySerializer() -> {
                return decodeByteArray() as T
            }

            deserializer == UByteArraySerializer() -> {
                return decodeByteArray().asUByteArray() as T
            }

            deserializer == Base64ByteStringSerializer -> {
                return ByteString(decodeByteArray()) as T
            }

            deserializer == Int128Serializer -> {
                return Int128(source.readByteString(16)) as T
            }

            deserializer == Int256Serializer -> {
                return Int256(source.readByteString(32)) as T
            }

            deserializer.descriptor.kind is PolymorphicKind -> {
                val currentConstructorId = decodeInt()

                val elementDescriptor = deserializer.descriptor.getElementDescriptor(1)
                for (i in 0 until elementDescriptor.elementsCount) {
                    val subclass = elementDescriptor.getElementDescriptor(i)
                    val elementConstructorId = subclass.getTlCombinatorId()

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

            else -> return super.decodeSerializableValue(deserializer)
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
        return decodeSerializableValue(deserializer)
    }


    override fun decodeCollectionSize(descriptor: SerialDescriptor): Int = decodeInt()

    override fun decodeElementIndex(descriptor: SerialDescriptor): Int {
        return elementIndex++
    }

    override fun beginStructure(descriptor: SerialDescriptor): CompositeDecoder {
        val intValuesCache = IntArray(descriptor.elementsCount) { -1 }
//        for (i in 0 until descriptor.elementsCount) {
//            val elementAnnotations = descriptor.getElementAnnotations(i)
//            annotations@ for (k in 0 until elementAnnotations.size) {
//                val annotation = elementAnnotations[k]
//                if (annotation is TLConditional) {
//                    val elementIndex = descriptor.getElementIndex(annotation.field)
//                    if (elementIndex == CompositeDecoder.UNKNOWN_NAME) {
//                        error("Unknown field '${annotation.field}' for nullable '${descriptor.getElementName(i)}'")
//                    }
//                    intValuesCache[elementIndex] = -1
//                }
//                if (annotation is TLFixedSize) {
//                    val elementIndex = descriptor.getElementIndex(annotation.field)
//                    if (elementIndex == CompositeDecoder.UNKNOWN_NAME) {
//                        error("Unknown field '${annotation.field}' for fixed size '${descriptor.getElementName(i)}'")
//                    }
//                    intValuesCache[elementIndex] = -1
//                }
//            }
//        }
        return TLDecoder(tl, source, intValuesCache)
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
