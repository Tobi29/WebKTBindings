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

package net.gitout.ktbindings.utils

expect interface DataBuffer
expect class DataBufferPinned : DataBuffer {
    fun close()
}

expect fun DataBuffer.pinRead(): DataBufferPinned
expect fun DataBuffer.pinWrite(): DataBufferPinned

expect class ByteReadBuffer

expect operator fun ByteReadBuffer.get(index: Int): Byte
expect val ByteReadBuffer.size: Int

expect class FloatReadBuffer

expect operator fun FloatReadBuffer.get(index: Int): Float
expect val FloatReadBuffer.size: Int
