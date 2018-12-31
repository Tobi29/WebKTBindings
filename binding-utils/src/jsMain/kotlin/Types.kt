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

@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.utils

import org.khronos.webgl.ArrayBufferView
import org.khronos.webgl.Float32Array
import org.khronos.webgl.Int8Array
import org.khronos.webgl.get

actual interface DataBuffer {
    fun read(): Pair<ArrayBufferView, () -> Unit> = write()
    fun write(): Pair<ArrayBufferView, () -> Unit>
}

actual class DataBufferPinned(
    val buffer: ArrayBufferView,
    private val close: () -> Unit
) : DataBuffer {
    constructor(
        pair: Pair<ArrayBufferView, () -> Unit>
    ) : this(pair.first, pair.second)

    override fun write() = buffer to {}

    actual fun close() = close.invoke()
}

actual inline fun DataBuffer.pinRead() = DataBufferPinned(read())
actual inline fun DataBuffer.pinWrite() = DataBufferPinned(write())

inline fun <R> DataBuffer.read(block: (ArrayBufferView) -> R): R {
    val buffer = this.read()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.readOrNull(block: (ArrayBufferView?) -> R): R {
    val buffer = this?.read()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun <R> DataBuffer.write(block: (ArrayBufferView) -> R): R {
    val buffer = this.write()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.writeOrNull(block: (ArrayBufferView?) -> R): R {
    val buffer = this?.write()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

actual class ByteReadBuffer(
    @PublishedApi
    internal val array: Int8Array
)

actual inline operator fun ByteReadBuffer.get(index: Int): Byte =
    array[index]

actual inline val ByteReadBuffer.size: Int
    get() = array.length

actual class FloatReadBuffer(
    @PublishedApi
    internal val array: Float32Array
)

actual inline operator fun FloatReadBuffer.get(index: Int): Float =
    array[index]

actual inline val FloatReadBuffer.size: Int
    get() = array.length
