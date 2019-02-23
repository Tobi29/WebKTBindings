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

inline fun Pinned<ByteArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<UByteArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<ShortArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<UShortArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<IntArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<UIntArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<LongArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<ULongArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<FloatArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun Pinned<DoubleArray>.toCPointer() =
    if (get().isEmpty()) null else addressOf(0)

inline fun <T : Any, R> T?.usePinnedOrNull(
    block: (Pinned<T>?) -> R
): R {
    val pinned = this?.pin()
    try {
        return block(pinned)
    } finally {
        pinned?.unpin()
    }
}

inline fun receiveString(
    block: (CPointer<ByteVar>, CPointer<IntVar>, Int) -> Unit
): String? {
    var bufferSize = 0
    while (true) {
        memScoped {
            val length = alloc<IntVar>()
            length.value = -1
            val buffer = allocArray<ByteVar>(bufferSize)
            block(buffer, length.ptr, bufferSize)
            if (length.value < 0) return null
            if (length.value < bufferSize) {
                return buffer.readBytes(length.value).stringFromUtf8()
            }
            bufferSize = length.value + 1
        }
    }
}
