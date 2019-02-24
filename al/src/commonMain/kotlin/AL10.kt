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

import net.gitout.ktbindings.utils.DataBuffer

expect val AL_NONE: ALenum
expect val AL_FALSE: ALenum
expect val AL_TRUE: ALenum
expect val AL_SOURCE_RELATIVE: ALenum
expect val AL_CONE_INNER_ANGLE: ALenum
expect val AL_CONE_OUTER_ANGLE: ALenum
expect val AL_PITCH: ALenum
expect val AL_POSITION: ALenum
expect val AL_DIRECTION: ALenum
expect val AL_VELOCITY: ALenum
expect val AL_LOOPING: ALenum
expect val AL_BUFFER: ALenum
expect val AL_GAIN: ALenum
expect val AL_MIN_GAIN: ALenum
expect val AL_MAX_GAIN: ALenum
expect val AL_ORIENTATION: ALenum
expect val AL_SOURCE_STATE: ALenum
expect val AL_INITIAL: ALenum
expect val AL_PLAYING: ALenum
expect val AL_PAUSED: ALenum
expect val AL_STOPPED: ALenum
expect val AL_BUFFERS_QUEUED: ALenum
expect val AL_BUFFERS_PROCESSED: ALenum
expect val AL_REFERENCE_DISTANCE: ALenum
expect val AL_ROLLOFF_FACTOR: ALenum
expect val AL_CONE_OUTER_GAIN: ALenum
expect val AL_MAX_DISTANCE: ALenum
expect val AL_SOURCE_TYPE: ALenum
expect val AL_FORMAT_MONO8: ALenum
expect val AL_FORMAT_MONO16: ALenum
expect val AL_FORMAT_STEREO8: ALenum
expect val AL_FORMAT_STEREO16: ALenum
expect val AL_FREQUENCY: ALenum
expect val AL_BITS: ALenum
expect val AL_CHANNELS: ALenum
expect val AL_SIZE: ALenum
expect val AL_UNUSED: ALenum
expect val AL_PENDING: ALenum
expect val AL_PROCESSED: ALenum
expect val AL_NO_ERROR: ALenum
expect val AL_INVALID_NAME: ALenum
expect val AL_INVALID_ENUM: ALenum
expect val AL_INVALID_VALUE: ALenum
expect val AL_INVALID_OPERATION: ALenum
expect val AL_OUT_OF_MEMORY: ALenum
expect val AL_VENDOR: ALenum
expect val AL_VERSION: ALenum
expect val AL_RENDERER: ALenum
expect val AL_EXTENSIONS: ALenum
expect val AL_DOPPLER_FACTOR: ALenum
expect val AL_DISTANCE_MODEL: ALenum
expect val AL_INVERSE_DISTANCE: ALenum
expect val AL_INVERSE_DISTANCE_CLAMPED: ALenum

expect fun AL10.alGetError(
): ALenum

expect fun AL10.alEnable(
    target: ALenum
)

expect fun AL10.alDisable(
    target: ALenum
)

expect fun AL10.alIsEnabled(
    target: ALenum
): Boolean

expect fun AL10.alGetBoolean(
    param: ALenum
): Boolean

expect fun AL10.alGetInteger(
    param: ALenum
): Int

expect fun AL10.alGetFloat(
    param: ALenum
): Float

expect fun AL10.alGetDouble(
    param: ALenum
): Double

expect fun AL10.alGetBooleanv(
    param: ALenum, dest: BooleanArray
)

expect fun AL10.alGetIntegerv(
    param: ALenum, dest: IntArray
)

expect fun AL10.alGetFloatv(
    param: ALenum, dest: FloatArray
)

expect fun AL10.alGetDoublev(
    param: ALenum, dest: DoubleArray
)

expect fun AL10.alGetString(
    param: ALenum
): String?

expect fun AL10.alDistanceModel(
    modelName: Int
)

expect fun AL10.alDopplerFactor(
    dopplerFactor: Float
)

expect fun AL10.alDopplerVelocity(
    dopplerVelocity: Float
)

expect fun AL10.alListenerf(
    param: ALenum, value: Float
)

expect fun AL10.alListeneri(
    param: ALenum, value: Int
)

expect fun AL10.alListener3f(
    param: ALenum, value1: Float, value2: Float, value3: Float
)

expect fun AL10.alListenerfv(
    param: ALenum, values: FloatArray
)

expect fun AL10.alGetListenerf(
    param: ALenum
): Float

expect fun AL10.alGetListeneri(
    param: ALenum
): Int

expect fun AL10.alGetListener3f(
    param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
)

expect fun AL10.alGetListenerfv(
    param: ALenum, values: FloatArray
)

expect fun AL10.alCreateSource(
): ALSource

expect fun AL10.alDeleteSource(
    source: ALSource
)

expect fun AL10.alIsSource(
    source: ALSource
): Boolean

expect fun AL10.alSourcef(
    source: ALSource, param: ALenum, value: Float
)

expect fun AL10.alSource3f(
    source: ALSource, param: ALenum, value1: Float, value2: Float, value3: Float
)

expect fun AL10.alSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
)

expect fun AL10.alSourcei(
    source: ALSource, param: ALenum, value: Int
)

expect fun AL10.alSourceBuffer(
    source: ALSource, param: ALenum, value: ALBuffer
)

expect fun AL10.alGetSourcef(
    source: ALSource, param: ALenum
): Float

expect fun AL10.alGetSource3f(
    source: ALSource, param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
)

expect fun AL10.alGetSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
)

expect fun AL10.alGetSourcei(
    source: ALSource, param: ALenum
): Int

expect fun AL10.alGetSourceBuffer(
    source: ALSource, param: ALenum
): ALBuffer

expect fun AL10.alSourceQueueBuffers(
    source: ALSource, buffer: ALBuffer
)

expect fun AL10.alSourceUnqueueBuffers(
    source: ALSource
): ALBuffer

expect fun AL10.alSourcePlay(
    source: ALSource
)

expect fun AL10.alSourcePause(
    source: ALSource
)

expect fun AL10.alSourceStop(
    source: ALSource
)

expect fun AL10.alSourceRewind(
    source: ALSource
)

expect fun AL10.alSourcePlayv(
    sources: Array<ALSource>
)

expect fun AL10.alSourcePausev(
    sources: Array<ALSource>
)

expect fun AL10.alSourceStopv(
    sources: Array<ALSource>
)

expect fun AL10.alSourceRewindv(
    sources: Array<ALSource>
)

expect fun AL10.alCreateBuffer(
): ALBuffer

expect fun AL10.alDeleteBuffer(
    buffer: ALBuffer
)

expect fun AL10.alIsBuffer(
    buffer: ALBuffer
): Boolean

expect fun AL10.alGetBufferf(
    buffer: ALBuffer, param: ALenum
): Float

expect fun AL10.alGetBufferi(
    buffer: ALBuffer, param: ALenum
): Int

expect fun AL10.alBufferData(
    buffer: ALBuffer, format: Int, data: DataBuffer, frequency: Int
)
