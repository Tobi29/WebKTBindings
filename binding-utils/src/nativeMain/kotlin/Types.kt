/*
 * Copyright 2012-2019 Tobi29
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

import kotlinx.cinterop.*

actual interface DataBuffer {
    val size: Int

    fun read(): Pair<CPointer<ByteVar>?, () -> Unit> = write()
    fun write(): Pair<CPointer<ByteVar>?, () -> Unit>
}

actual class DataBufferPinned(
    val buffer: CPointer<ByteVar>?,
    override val size: Int,
    private val close: () -> Unit
) : DataBuffer {
    constructor(
        pair: Pair<CPointer<ByteVar>?, () -> Unit>, size: Int
    ) : this(pair.first, size, pair.second)

    override fun write() = buffer to {}

    actual fun close() = close.invoke()
}

actual inline fun DataBuffer.pinRead() = DataBufferPinned(read(), size)
actual inline fun DataBuffer.pinWrite() = DataBufferPinned(write(), size)

inline fun <R> DataBuffer.read(block: (CPointer<ByteVar>?) -> R): R {
    val buffer = this.read()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.readOrNull(block: (CPointer<ByteVar>?) -> R): R {
    val buffer = this?.read()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun <R> DataBuffer.write(block: (CPointer<ByteVar>?) -> R): R {
    val buffer = this.write()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.writeOrNull(block: (CPointer<ByteVar>?) -> R): R {
    val buffer = this?.write()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun <R> DataBuffer.readUnsigned(block: (CPointer<UByteVar>?) -> R): R =
    read { block(it?.reinterpret<UByteVar>()) }

inline fun <R> DataBuffer?.readUnsignedOrNull(block: (CPointer<UByteVar>?) -> R): R =
    readOrNull { block(it?.reinterpret<UByteVar>()) }

inline fun <R> DataBuffer.writeUnsigned(block: (CPointer<UByteVar>?) -> R): R =
    write { block(it?.reinterpret<UByteVar>()) }

inline fun <R> DataBuffer?.writeUnsignedOrNull(block: (CPointer<UByteVar>?) -> R): R =
    writeOrNull { block(it?.reinterpret<UByteVar>()) }

actual class ByteReadBuffer(
    @PublishedApi
    internal val buffer: CPointer<ByteVar>?,
    @PublishedApi
    internal val size: Int
)

actual inline operator fun ByteReadBuffer.get(index: Int): Byte =
    buffer!![index]

actual inline val ByteReadBuffer.size: Int
    get() = size

actual class FloatReadBuffer(
    @PublishedApi
    internal val buffer: CPointer<FloatVar>?,
    @PublishedApi
    internal val size: Int
)

actual inline operator fun FloatReadBuffer.get(index: Int): Float =
    buffer!![index]

actual inline val FloatReadBuffer.size: Int
    get() = size
