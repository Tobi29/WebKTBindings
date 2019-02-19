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

expect val AL_SEC_OFFSET: ALenum
expect val AL_SAMPLE_OFFSET: ALenum
expect val AL_BYTE_OFFSET: ALenum
expect val AL_STATIC: ALenum
expect val AL_STREAMING: ALenum
expect val AL_UNDETERMINED: ALenum
expect val AL_ILLEGAL_COMMAND: ALenum
expect val AL_SPEED_OF_SOUND: ALenum
expect val AL_LINEAR_DISTANCE: ALenum
expect val AL_LINEAR_DISTANCE_CLAMPED: ALenum
expect val AL_EXPONENT_DISTANCE: ALenum
expect val AL_EXPONENT_DISTANCE_CLAMPED: ALenum

expect fun AL11.alListener3i(
    param: ALenum, value1: Int, value2: Int, value3: Int
)

expect fun AL11.alListeneriv(
    param: ALenum, values: IntArray
)

expect fun AL11.alGetListeneriv(
    param: ALenum, values: IntArray
)

expect fun AL11.alSource3i(
    source: ALSource, param: ALenum, value1: Int, value2: Int, value3: Int
)

expect fun AL11.alSourceiv(
    source: ALSource, param: ALenum, values: IntArray
)

expect fun AL11.alGetSourceiv(
    source: ALSource, param: ALenum, values: IntArray
)

expect fun AL11.alBufferf(
    buffer: ALBuffer, param: ALenum, value: Float
)

expect fun AL11.alBuffer3f(
    buffer: ALBuffer, param: ALenum, value1: Float, value2: Float, value3: Float
)

expect fun AL11.alBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
)

expect fun AL11.alBufferi(
    buffer: ALBuffer, param: ALenum, value: Int
)

expect fun AL11.alBuffer3i(
    buffer: ALBuffer, param: ALenum, value1: Int, value2: Int, value3: Int
)

expect fun AL11.alBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
)

expect fun AL11.alGetBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
)

expect fun AL11.alGetBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
)

expect fun AL11.alSpeedOfSound(
    value: Float
)
