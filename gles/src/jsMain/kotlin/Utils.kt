/*
 * Copyright 2012-2018 Tobi29
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE", "UnsafeCastFromDynamic")

package net.gitout.ktbindings.gles

import net.gitout.ktbindings.utils.DataBuffer
import org.khronos.webgl.*

@PublishedApi
internal inline fun ArrayBufferView.asInt8Array(): Int8Array =
    Int8Array(buffer, byteOffset, byteLength)

@PublishedApi
internal inline fun ArrayBufferView.asUint8Array(): Uint8Array =
    Uint8Array(buffer, byteOffset, byteLength)

@PublishedApi
internal inline fun ArrayBufferView.asInt16Array(): Int16Array =
    Int16Array(buffer, byteOffset, byteLength ushr 1)

@PublishedApi
internal inline fun ArrayBufferView.asUint16Array(): Uint16Array =
    Uint16Array(buffer, byteOffset, byteLength ushr 1)

@PublishedApi
internal inline fun ArrayBufferView.asInt32Array(): Int32Array =
    Int32Array(buffer, byteOffset, byteLength ushr 2)

@PublishedApi
internal inline fun ArrayBufferView.asUint32Array(): Uint32Array =
    Uint32Array(buffer, byteOffset, byteLength ushr 2)

@PublishedApi
internal inline fun ArrayBufferView.asFloat32Array(): Float32Array =
    Float32Array(buffer, byteOffset, byteLength ushr 2)

@PublishedApi
internal inline fun ArrayBufferView.asFloat642Array(): Float64Array =
    Float64Array(buffer, byteOffset, byteLength ushr 3)

@PublishedApi
internal inline fun ByteArray.asTypedArray(): Int8Array = asDynamic()

@PublishedApi
internal inline fun ShortArray.asTypedArray(): Int16Array = asDynamic()

@PublishedApi
internal inline fun CharArray.asTypedArray(): Uint16Array = asDynamic()

@PublishedApi
internal inline fun IntArray.asTypedArray(): Int32Array = asDynamic()

@PublishedApi
internal inline fun FloatArray.asTypedArray(): Float32Array = asDynamic()

@PublishedApi
internal inline fun DoubleArray.asTypedArray(): Float64Array = asDynamic()

@PublishedApi
internal inline fun Int8Array.asArray(): ByteArray = asDynamic()

@PublishedApi
internal inline fun Int16Array.asArray(): ShortArray = asDynamic()

@PublishedApi
internal inline fun Uint16Array.asArray(): CharArray = asDynamic()

@PublishedApi
internal inline fun Int32Array.asArray(): IntArray = asDynamic()

@PublishedApi
internal inline fun Float32Array.asArray(): FloatArray = asDynamic()

@PublishedApi
internal inline fun Float64Array.asArray(): DoubleArray = asDynamic()

@PublishedApi
internal inline fun <T> T?.unsafeNotNull(): T = asDynamic()

inline fun DataBuffer.read(
    block: (ArrayBufferView) -> Unit
) {
    val buffer = this.read()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun DataBuffer?.readOrNull(
    block: (ArrayBufferView?) -> Unit
) {
    val buffer = this?.read()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun DataBuffer.write(
    block: (ArrayBufferView) -> Unit
) {
    val buffer = this.write()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun DataBuffer?.writeOrNull(
    block: (ArrayBufferView?) -> Unit
) {
    val buffer = this?.write()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun DataBuffer.read(
    format: GLenum, block: (ArrayBufferView) -> Unit
) = read { block(it.castBuffer(format)) }

inline fun DataBuffer?.readOrNull(
    format: GLenum, block: (ArrayBufferView?) -> Unit
) = readOrNull { block(it?.castBuffer(format)) }

inline fun DataBuffer.write(
    format: GLenum, block: (ArrayBufferView) -> Unit
) = write { block(it.castBuffer(format)) }

inline fun DataBuffer?.writeOrNull(
    format: GLenum, block: (ArrayBufferView?) -> Unit
) = writeOrNull { block(it?.castBuffer(format)) }

@PublishedApi
internal fun ArrayBufferView.castBuffer(
    type: GLenum
): ArrayBufferView = when (type) {
    GL_BYTE -> asInt8Array()
    GL_UNSIGNED_BYTE -> asUint8Array()
    GL_SHORT -> asInt16Array()
    GL_UNSIGNED_SHORT, GL_HALF_FLOAT -> asUint16Array()
    GL_INT -> asInt32Array()
    GL_UNSIGNED_INT -> asUint32Array()
    GL_FLOAT -> asFloat32Array()
    else -> throw IllegalArgumentException("Unknown type")
}

@PublishedApi
internal fun writeArrayParameter(
    parameter: BooleanArray,
    result: Any?
) {
    when (result) {
        is Array<dynamic>,
        is Int8Array, is Uint8Array,
        is Int16Array, is Uint16Array,
        is Int32Array, is Uint32Array -> {
            val array = result.asDynamic()
            for (i in 0 until array.length) {
                parameter[i] = array[i] != 0
            }
        }
        else -> parameter[0] = result.asDynamic()
    }
}

@PublishedApi
internal fun writeArrayParameter(
    parameter: IntArray,
    result: Any?
) {
    when (result) {
        is Array<dynamic> -> for (i in 0 until result.size) {
            val value = result[i]
            parameter[i] = when (value) {
                false -> 0
                true -> 1
                else -> value
            }
        }
        is Int8Array -> for (i in 0 until result.length) {
            parameter[i] = result[i].toInt()
        }
        is Uint8Array -> for (i in 0 until result.length) {
            parameter[i] = result[i].toUByte().toInt()
        }
        is Int16Array -> for (i in 0 until result.length) {
            parameter[i] = result[i].toInt()
        }
        is Uint16Array -> for (i in 0 until result.length) {
            parameter[i] = result[i].toUShort().toInt()
        }
        is Int32Array -> parameter.asTypedArray().set(result)
        is Uint32Array -> parameter.asTypedArray().set(result.asInt32Array())
        else -> {
            val value = result.asDynamic()
            parameter[0] = when (value) {
                false -> 0
                true -> 1
                else -> value
            }
        }
    }
}

@PublishedApi
internal inline fun writeArrayParameter(
    parameter: UIntArray,
    result: Any?
) = writeArrayParameter(parameter.asIntArray(), result)

@PublishedApi
internal fun writeArrayParameter(
    parameter: FloatArray,
    result: Any?
) {
    when (result) {
        is Array<dynamic> -> for (i in 0 until result.size) {
            parameter[i] = result[i]
        }
        is Float32Array -> parameter.asTypedArray().set(result)
        is Float64Array -> for (i in 0 until result.length) {
            parameter[i] = result[i].toFloat()
        }
        else -> parameter[0] = result.asDynamic()
    }
}

@PublishedApi
internal fun writeArrayParameter(
    parameter: Array<in GLShader>,
    result: Array<out WebGLShader?>
) {
    for (i in result.indices) {
        parameter[i] = result[i].toGLShader()
    }
}
