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

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import org.tobi29.scapes.engine.android.openal.bind.AL

actual inline val AL_NONE: ALenum
    get() = AL.AL_NONE
actual inline val AL_FALSE: ALenum
    get() = AL.AL_FALSE
actual inline val AL_TRUE: ALenum
    get() = AL.AL_TRUE
actual inline val AL_SOURCE_RELATIVE: ALenum
    get() = AL.AL_SOURCE_RELATIVE
actual inline val AL_CONE_INNER_ANGLE: ALenum
    get() = AL.AL_CONE_INNER_ANGLE
actual inline val AL_CONE_OUTER_ANGLE: ALenum
    get() = AL.AL_CONE_OUTER_ANGLE
actual inline val AL_PITCH: ALenum
    get() = AL.AL_PITCH
actual inline val AL_POSITION: ALenum
    get() = AL.AL_POSITION
actual inline val AL_DIRECTION: ALenum
    get() = AL.AL_DIRECTION
actual inline val AL_VELOCITY: ALenum
    get() = AL.AL_VELOCITY
actual inline val AL_LOOPING: ALenum
    get() = AL.AL_LOOPING
actual inline val AL_BUFFER: ALenum
    get() = AL.AL_BUFFER
actual inline val AL_GAIN: ALenum
    get() = AL.AL_GAIN
actual inline val AL_MIN_GAIN: ALenum
    get() = AL.AL_MIN_GAIN
actual inline val AL_MAX_GAIN: ALenum
    get() = AL.AL_MAX_GAIN
actual inline val AL_ORIENTATION: ALenum
    get() = AL.AL_ORIENTATION
actual inline val AL_SOURCE_STATE: ALenum
    get() = AL.AL_SOURCE_STATE
actual inline val AL_INITIAL: ALenum
    get() = AL.AL_INITIAL
actual inline val AL_PLAYING: ALenum
    get() = AL.AL_PLAYING
actual inline val AL_PAUSED: ALenum
    get() = AL.AL_PAUSED
actual inline val AL_STOPPED: ALenum
    get() = AL.AL_STOPPED
actual inline val AL_BUFFERS_QUEUED: ALenum
    get() = AL.AL_BUFFERS_QUEUED
actual inline val AL_BUFFERS_PROCESSED: ALenum
    get() = AL.AL_BUFFERS_PROCESSED
actual inline val AL_REFERENCE_DISTANCE: ALenum
    get() = AL.AL_REFERENCE_DISTANCE
actual inline val AL_ROLLOFF_FACTOR: ALenum
    get() = AL.AL_ROLLOFF_FACTOR
actual inline val AL_CONE_OUTER_GAIN: ALenum
    get() = AL.AL_CONE_OUTER_GAIN
actual inline val AL_MAX_DISTANCE: ALenum
    get() = AL.AL_MAX_DISTANCE
actual inline val AL_SOURCE_TYPE: ALenum
    get() = AL.AL_SOURCE_TYPE
actual inline val AL_FORMAT_MONO8: ALenum
    get() = AL.AL_FORMAT_MONO8
actual inline val AL_FORMAT_MONO16: ALenum
    get() = AL.AL_FORMAT_MONO16
actual inline val AL_FORMAT_STEREO8: ALenum
    get() = AL.AL_FORMAT_STEREO8
actual inline val AL_FORMAT_STEREO16: ALenum
    get() = AL.AL_FORMAT_STEREO16
actual inline val AL_FREQUENCY: ALenum
    get() = AL.AL_FREQUENCY
actual inline val AL_BITS: ALenum
    get() = AL.AL_BITS
actual inline val AL_CHANNELS: ALenum
    get() = AL.AL_CHANNELS
actual inline val AL_SIZE: ALenum
    get() = AL.AL_SIZE
actual inline val AL_UNUSED: ALenum
    get() = AL.AL_UNUSED
actual inline val AL_PENDING: ALenum
    get() = AL.AL_PENDING
actual inline val AL_PROCESSED: ALenum
    get() = AL.AL_PROCESSED
actual inline val AL_NO_ERROR: ALenum
    get() = AL.AL_NO_ERROR
actual inline val AL_INVALID_NAME: ALenum
    get() = AL.AL_INVALID_NAME
actual inline val AL_INVALID_ENUM: ALenum
    get() = AL.AL_INVALID_ENUM
actual inline val AL_INVALID_VALUE: ALenum
    get() = AL.AL_INVALID_VALUE
actual inline val AL_INVALID_OPERATION: ALenum
    get() = AL.AL_INVALID_OPERATION
actual inline val AL_OUT_OF_MEMORY: ALenum
    get() = AL.AL_OUT_OF_MEMORY
actual inline val AL_VENDOR: ALenum
    get() = AL.AL_VENDOR
actual inline val AL_VERSION: ALenum
    get() = AL.AL_VERSION
actual inline val AL_RENDERER: ALenum
    get() = AL.AL_RENDERER
actual inline val AL_EXTENSIONS: ALenum
    get() = AL.AL_EXTENSIONS
actual inline val AL_DOPPLER_FACTOR: ALenum
    get() = AL.AL_DOPPLER_FACTOR
actual inline val AL_DISTANCE_MODEL: ALenum
    get() = AL.AL_DISTANCE_MODEL
actual inline val AL_INVERSE_DISTANCE: ALenum
    get() = AL.AL_INVERSE_DISTANCE
actual inline val AL_INVERSE_DISTANCE_CLAMPED: ALenum
    get() = AL.AL_INVERSE_DISTANCE_CLAMPED

actual inline fun AL10.alGetError(
) = AL.alGetError(
)

actual inline fun AL10.alEnable(
    target: ALenum
) = AL.alEnable(
    target
)

actual inline fun AL10.alDisable(
    target: ALenum
) = AL.alDisable(
    target
)

actual inline fun AL10.alIsEnabled(
    target: ALenum
) = AL.alIsEnabled(
    target
)

actual inline fun AL10.alGetBoolean(
    param: ALenum
) = AL.alGetBoolean(
    param
)

actual inline fun AL10.alGetInteger(
    param: ALenum
) = AL.alGetInteger(
    param
)

actual inline fun AL10.alGetFloat(
    param: ALenum
) = AL.alGetFloat(
    param
)

actual inline fun AL10.alGetDouble(
    param: ALenum
) = AL.alGetDouble(
    param
)

actual inline fun AL10.alGetBooleanv(
    param: ALenum, dest: BooleanArray
) = AL.alGetBooleanv(
    param, dest
)

actual inline fun AL10.alGetIntegerv(
    param: ALenum, dest: IntArray
) = AL.alGetIntegerv(
    param, dest
)

actual inline fun AL10.alGetFloatv(
    param: ALenum, dest: FloatArray
) = AL.alGetFloatv(
    param, dest
)

actual inline fun AL10.alGetDoublev(
    param: ALenum, dest: DoubleArray
) = AL.alGetDoublev(
    param, dest
)

actual inline fun AL10.alGetString(
    param: ALenum
) = AL.alGetString(
    param
)

actual inline fun AL10.alDistanceModel(
    modelName: Int
) = AL.alDistanceModel(
    modelName
)

actual inline fun AL10.alDopplerFactor(
    dopplerFactor: Float
) = AL.alDopplerFactor(
    dopplerFactor
)

actual inline fun AL10.alDopplerVelocity(
    dopplerVelocity: Float
) = AL.alDopplerVelocity(
    dopplerVelocity
)

actual inline fun AL10.alListenerf(
    param: ALenum, value: Float
) = AL.alListenerf(
    param, value
)

actual inline fun AL10.alListeneri(
    param: ALenum, value: Int
) = AL.alListeneri(
    param, value
)

actual inline fun AL10.alListener3f(
    param: ALenum, value1: Float, value2: Float, value3: Float
) = AL.alListener3f(
    param, value1, value2, value3
)

actual inline fun AL10.alListenerfv(
    param: ALenum, values: FloatArray
) = AL.alListenerfv(
    param, values
)

actual inline fun AL10.alGetListenerf(
    param: ALenum
) = readFloat { buffer ->
    AL.alGetListenerf(
        param, buffer
    )
}

actual inline fun AL10.alGetListeneri(
    param: ALenum
) = readInt { buffer ->
    AL.alGetListeneri(
        param, buffer
    )
}

actual inline fun AL10.alGetListener3f(
    param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = AL.alGetListener3f(
    param, value1, value2, value3
)

actual inline fun AL10.alGetListenerfv(
    param: ALenum, values: FloatArray
) = AL.alGetListenerfv(
    param, values
)

actual inline fun AL10.alCreateSource(
) = readInt { buffer ->
    AL.alGenSources(
        1, buffer
    )
}

actual inline fun AL10.alDeleteSource(
    source: ALSource
) = AL.alDeleteSources(
    1, intArrayOf(source)
)

actual inline fun AL10.alIsSource(
    source: ALSource
) = AL.alIsSource(
    source
)

actual inline fun AL10.alSourcef(
    source: ALSource, param: ALenum, value: Float
) = AL.alSourcef(
    source, param, value
)

actual inline fun AL10.alSource3f(
    source: ALSource, param: ALenum, value1: Float, value2: Float, value3: Float
) = AL.alSource3f(
    source, param, value1, value2, value3
)

actual inline fun AL10.alSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = AL.alSourcefv(
    source, param, values
)

actual inline fun AL10.alSourcei(
    source: ALSource, param: ALenum, value: Int
) = AL.alSourcei(
    source, param, value
)

actual inline fun AL10.alSourceBuffer(
    source: ALSource, param: ALenum, value: ALBuffer
) = AL.alSourcei(
    source, param, value
)

actual inline fun AL10.alGetSourcef(
    source: ALSource, param: ALenum
) = readFloat { buffer ->
    AL.alGetSourcef(
        source, param, buffer
    )
}

actual inline fun AL10.alGetSource3f(
    source: ALSource, param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = AL.alGetSource3f(
    source, param, value1, value2, value3
)

actual inline fun AL10.alGetSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = AL.alGetSourcefv(
    source, param, values
)

actual inline fun AL10.alGetSourcei(
    source: ALSource, param: ALenum
) = readInt { buffer ->
    AL.alGetSourcei(
        source, param, buffer
    )
}

actual inline fun AL10.alGetSourceBuffer(
    source: ALSource, param: ALenum
) = readInt { buffer ->
    AL.alGetSourcei(
        source, param, buffer
    )
}

actual inline fun AL10.alSourceQueueBuffers(
    source: ALSource, buffer: ALBuffer
) = AL.alSourceQueueBuffers(
    source, 1, intArrayOf(buffer)
)

actual inline fun AL10.alSourceUnqueueBuffers(
    source: ALSource
) = readInt { buffer ->
    AL.alSourceUnqueueBuffers(
        source, 1, buffer
    )
}

actual inline fun AL10.alSourcePlay(
    source: ALSource
) = AL.alSourcePlay(
    source
)

actual inline fun AL10.alSourcePause(
    source: ALSource
) = AL.alSourcePause(
    source
)

actual inline fun AL10.alSourceStop(
    source: ALSource
) = AL.alSourceStop(
    source
)

actual inline fun AL10.alSourceRewind(
    source: ALSource
) = AL.alSourceRewind(
    source
)

actual inline fun AL10.alSourcePlayv(
    sources: Array<ALSource>
) {
    val ints = IntArray(sources.size)
    for (i in sources.indices) {
        ints[i] = sources[i]
    }
    AL.alSourcePlayv(
        sources.size, ints
    )
}

actual inline fun AL10.alSourcePausev(
    sources: Array<ALSource>
) {
    val ints = IntArray(sources.size)
    for (i in sources.indices) {
        ints[i] = sources[i]
    }
    AL.alSourcePausev(
        sources.size, ints
    )
}

actual inline fun AL10.alSourceStopv(
    sources: Array<ALSource>
) {
    val ints = IntArray(sources.size)
    for (i in sources.indices) {
        ints[i] = sources[i]
    }
    AL.alSourceStopv(
        sources.size, ints
    )
}

actual inline fun AL10.alSourceRewindv(
    sources: Array<ALSource>
) {
    val ints = IntArray(sources.size)
    for (i in sources.indices) {
        ints[i] = sources[i]
    }
    AL.alSourceRewindv(
        sources.size, ints
    )
}

actual inline fun AL10.alCreateBuffer(
) = readInt { buffer ->
    AL.alGenBuffers(
        1, buffer
    )
}

actual inline fun AL10.alDeleteBuffer(
    buffer: ALBuffer
) = AL.alDeleteBuffers(
    1, intArrayOf(buffer)
)

actual inline fun AL10.alIsBuffer(
    buffer: ALBuffer
) = AL.alIsBuffer(
    buffer
)

actual inline fun AL10.alGetBufferf(
    buffer: ALBuffer, param: ALenum
) = readFloat { bufferRead ->
    AL.alGetBufferf(
        buffer, param, bufferRead
    )
}

actual inline fun AL10.alGetBufferi(
    buffer: ALBuffer, param: ALenum
) = readInt { bufferRead ->
    AL.alGetBufferi(
        buffer, param, bufferRead
    )
}

actual inline fun AL10.alBufferData(
    buffer: ALBuffer, format: Int, data: DataBuffer, frequency: Int
) = data.read { bufferData ->
    val array = if (bufferData.hasArray()
        && bufferData.arrayOffset() == 0) {
        bufferData.array()
    } else {
        ByteArray(bufferData.remaining()) { i ->
            bufferData.get(bufferData.position() + i)
        }
    }
    AL.alBufferData(
        buffer, format, array, bufferData.remaining(), frequency
    )
}
