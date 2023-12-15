@file:OptIn(ExperimentalSerializationApi::class)

package io.github.andreypfau.tl.serialization.annotation

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialInfo
import kotlinx.serialization.descriptors.SerialDescriptor

@SerialInfo
@Target(AnnotationTarget.CLASS)
annotation class TLConstructorId(
    val id: Long
)

@SerialInfo
@Target(AnnotationTarget.PROPERTY)
annotation class TLFlag

@SerialInfo
@Target(AnnotationTarget.PROPERTY)
annotation class TLNullable(
    val field: String,
    val index: Int
)

fun SerialDescriptor.getTlConstructorId(): Int {
    for (i in annotations.indices) {
        val annotation = annotations[i]
        if (annotation is TLConstructorId) {
            return annotation.id.toInt()
        }
    }
    error("No TLConstructorId annotation found for $serialName")
}

fun SerialDescriptor.getTlConstructorId(element: Int): Int {
    val annotations = getElementAnnotations(element)

    for (i in annotations.indices) {
        val annotation = annotations[i]
        if (annotation is TLConstructorId) {
            return annotation.id.toInt()
        }
    }
    error("No TLConstructorId annotation found for $serialName")
}
