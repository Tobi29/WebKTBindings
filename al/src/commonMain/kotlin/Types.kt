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

package net.gitout.ktbindings.al

expect abstract class AL10
expect abstract class AL11 : AL10

expect fun contextAL10(): AL10
expect fun contextAL11(): AL11

expect class ALCDevice

expect val emptyALCDevice: ALCDevice

expect class ALCContext

expect val emptyALCContext: ALCContext

expect class ALBuffer

expect val emptyALBuffer: ALBuffer

expect class ALSource

expect val emptyALSource: ALSource

typealias ALCenum = Int
typealias ALenum = Int

@PublishedApi
internal inline fun readInt(block: (IntArray) -> Unit): Int {
    val array = IntArray(1)
    block(array)
    return array[0]
}

@PublishedApi
internal inline fun readFloat(block: (FloatArray) -> Unit): Float {
    val array = FloatArray(1)
    block(array)
    return array[0]
}
