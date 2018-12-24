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

@file:JvmName("TypesJVMKt")
@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.utils

import java.nio.ByteBuffer
import java.nio.FloatBuffer

actual interface DataBuffer {
    fun read(): Pair<ByteBuffer, () -> Unit> = write()
    fun write(): Pair<ByteBuffer, () -> Unit>
}

inline fun <R> DataBuffer.read(block: (ByteBuffer) -> R): R {
    val buffer = this.read()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.readOrNull(block: (ByteBuffer?) -> R): R {
    val buffer = this?.read()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

inline fun <R> DataBuffer.write(block: (ByteBuffer) -> R): R {
    val buffer = this.write()
    try {
        return block(buffer.first)
    } finally {
        buffer.second.invoke()
    }
}

inline fun <R> DataBuffer?.writeOrNull(block: (ByteBuffer?) -> R): R {
    val buffer = this?.write()
    try {
        return block(buffer?.first)
    } finally {
        buffer?.second?.invoke()
    }
}

actual class ByteReadBuffer(
    @PublishedApi
    internal val buffer: ByteBuffer
)

actual inline operator fun ByteReadBuffer.get(index: Int): Byte =
    buffer.get(index)

actual inline val ByteReadBuffer.size: Int
    get() = buffer.remaining()

actual class FloatReadBuffer(
    @PublishedApi
    internal val buffer: FloatBuffer
)

actual inline operator fun FloatReadBuffer.get(index: Int): Float =
    buffer.get(index)

actual inline val FloatReadBuffer.size: Int
    get() = buffer.remaining()
