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

package net.gitout.ktbindings.al

import org.tobi29.scapes.engine.android.openal.bind.AL

actual inline val AL_SEC_OFFSET: ALenum
    get() = AL.AL_SEC_OFFSET
actual inline val AL_SAMPLE_OFFSET: ALenum
    get() = AL.AL_SAMPLE_OFFSET
actual inline val AL_BYTE_OFFSET: ALenum
    get() = AL.AL_BYTE_OFFSET
actual inline val AL_STATIC: ALenum
    get() = AL.AL_STATIC
actual inline val AL_STREAMING: ALenum
    get() = AL.AL_STREAMING
actual inline val AL_UNDETERMINED: ALenum
    get() = AL.AL_UNDETERMINED
actual inline val AL_ILLEGAL_COMMAND: ALenum
    get() = AL.AL_ILLEGAL_COMMAND
actual inline val AL_SPEED_OF_SOUND: ALenum
    get() = AL.AL_SPEED_OF_SOUND
actual inline val AL_LINEAR_DISTANCE: ALenum
    get() = AL.AL_LINEAR_DISTANCE
actual inline val AL_LINEAR_DISTANCE_CLAMPED: ALenum
    get() = AL.AL_LINEAR_DISTANCE_CLAMPED
actual inline val AL_EXPONENT_DISTANCE: ALenum
    get() = AL.AL_EXPONENT_DISTANCE
actual inline val AL_EXPONENT_DISTANCE_CLAMPED: ALenum
    get() = AL.AL_EXPONENT_DISTANCE_CLAMPED

actual inline fun AL11.alListener3i(
    param: ALenum, value1: Int, value2: Int, value3: Int
) = AL.alListener3i(
    param, value1, value2, value3
)

actual inline fun AL11.alListeneriv(
    param: ALenum, values: IntArray
) = AL.alListeneriv(
    param, values
)

actual inline fun AL11.alGetListeneriv(
    param: ALenum, values: IntArray
) = AL.alGetListeneriv(
    param, values
)

actual inline fun AL11.alSource3i(
    source: ALSource, param: ALenum, value1: Int, value2: Int, value3: Int
) = AL.alSource3i(
    source, param, value1, value2, value3
)

actual inline fun AL11.alSourceiv(
    source: ALSource, param: ALenum, values: IntArray
) = AL.alSourceiv(
    source, param, values
)

actual inline fun AL11.alGetSourceiv(
    source: ALSource, param: ALenum, values: IntArray
) = AL.alGetSourceiv(
    source, param, values
)

actual inline fun AL11.alBufferf(
    buffer: ALBuffer, param: ALenum, value: Float
) = AL.alBufferf(
    buffer, param, value
)

actual inline fun AL11.alBuffer3f(
    buffer: ALBuffer, param: ALenum, value1: Float, value2: Float, value3: Float
) = AL.alBuffer3f(
    buffer, param, value1, value2, value3
)

actual inline fun AL11.alBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
) = AL.alBufferfv(
    buffer, param, values
)

actual inline fun AL11.alBufferi(
    buffer: ALBuffer, param: ALenum, value: Int
) = AL.alBufferi(
    buffer, param, value
)

actual inline fun AL11.alBuffer3i(
    buffer: ALBuffer, param: ALenum, value1: Int, value2: Int, value3: Int
) = AL.alBuffer3i(
    buffer, param, value1, value2, value3
)

actual inline fun AL11.alBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
) = AL.alBufferiv(
    buffer, param, values
)

actual inline fun AL11.alGetBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
) = AL.alGetBufferfv(
    buffer, param, values
)

actual inline fun AL11.alGetBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
) = AL.alGetBufferiv(
    buffer, param, values
)

actual inline fun AL11.alSpeedOfSound(
    value: Float
) = AL.alSpeedOfSound(
    value
)
