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
import org.lwjgl.system.MemoryStack
import org.lwjgl.openal.AL10 as JAL10

actual inline val AL_NONE: ALenum
    get() = JAL10.AL_NONE
actual inline val AL_FALSE: ALenum
    get() = JAL10.AL_FALSE
actual inline val AL_TRUE: ALenum
    get() = JAL10.AL_TRUE
actual inline val AL_SOURCE_RELATIVE: ALenum
    get() = JAL10.AL_SOURCE_RELATIVE
actual inline val AL_CONE_INNER_ANGLE: ALenum
    get() = JAL10.AL_CONE_INNER_ANGLE
actual inline val AL_CONE_OUTER_ANGLE: ALenum
    get() = JAL10.AL_CONE_OUTER_ANGLE
actual inline val AL_PITCH: ALenum
    get() = JAL10.AL_PITCH
actual inline val AL_POSITION: ALenum
    get() = JAL10.AL_POSITION
actual inline val AL_DIRECTION: ALenum
    get() = JAL10.AL_DIRECTION
actual inline val AL_VELOCITY: ALenum
    get() = JAL10.AL_VELOCITY
actual inline val AL_LOOPING: ALenum
    get() = JAL10.AL_LOOPING
actual inline val AL_BUFFER: ALenum
    get() = JAL10.AL_BUFFER
actual inline val AL_GAIN: ALenum
    get() = JAL10.AL_GAIN
actual inline val AL_MIN_GAIN: ALenum
    get() = JAL10.AL_MIN_GAIN
actual inline val AL_MAX_GAIN: ALenum
    get() = JAL10.AL_MAX_GAIN
actual inline val AL_ORIENTATION: ALenum
    get() = JAL10.AL_ORIENTATION
actual inline val AL_SOURCE_STATE: ALenum
    get() = JAL10.AL_SOURCE_STATE
actual inline val AL_INITIAL: ALenum
    get() = JAL10.AL_INITIAL
actual inline val AL_PLAYING: ALenum
    get() = JAL10.AL_PLAYING
actual inline val AL_PAUSED: ALenum
    get() = JAL10.AL_PAUSED
actual inline val AL_STOPPED: ALenum
    get() = JAL10.AL_STOPPED
actual inline val AL_BUFFERS_QUEUED: ALenum
    get() = JAL10.AL_BUFFERS_QUEUED
actual inline val AL_BUFFERS_PROCESSED: ALenum
    get() = JAL10.AL_BUFFERS_PROCESSED
actual inline val AL_REFERENCE_DISTANCE: ALenum
    get() = JAL10.AL_REFERENCE_DISTANCE
actual inline val AL_ROLLOFF_FACTOR: ALenum
    get() = JAL10.AL_ROLLOFF_FACTOR
actual inline val AL_CONE_OUTER_GAIN: ALenum
    get() = JAL10.AL_CONE_OUTER_GAIN
actual inline val AL_MAX_DISTANCE: ALenum
    get() = JAL10.AL_MAX_DISTANCE
actual inline val AL_SOURCE_TYPE: ALenum
    get() = JAL10.AL_SOURCE_TYPE
actual inline val AL_FORMAT_MONO8: ALenum
    get() = JAL10.AL_FORMAT_MONO8
actual inline val AL_FORMAT_MONO16: ALenum
    get() = JAL10.AL_FORMAT_MONO16
actual inline val AL_FORMAT_STEREO8: ALenum
    get() = JAL10.AL_FORMAT_STEREO8
actual inline val AL_FORMAT_STEREO16: ALenum
    get() = JAL10.AL_FORMAT_STEREO16
actual inline val AL_FREQUENCY: ALenum
    get() = JAL10.AL_FREQUENCY
actual inline val AL_BITS: ALenum
    get() = JAL10.AL_BITS
actual inline val AL_CHANNELS: ALenum
    get() = JAL10.AL_CHANNELS
actual inline val AL_SIZE: ALenum
    get() = JAL10.AL_SIZE
actual inline val AL_UNUSED: ALenum
    get() = JAL10.AL_UNUSED
actual inline val AL_PENDING: ALenum
    get() = JAL10.AL_PENDING
actual inline val AL_PROCESSED: ALenum
    get() = JAL10.AL_PROCESSED
actual inline val AL_NO_ERROR: ALenum
    get() = JAL10.AL_NO_ERROR
actual inline val AL_INVALID_NAME: ALenum
    get() = JAL10.AL_INVALID_NAME
actual inline val AL_INVALID_ENUM: ALenum
    get() = JAL10.AL_INVALID_ENUM
actual inline val AL_INVALID_VALUE: ALenum
    get() = JAL10.AL_INVALID_VALUE
actual inline val AL_INVALID_OPERATION: ALenum
    get() = JAL10.AL_INVALID_OPERATION
actual inline val AL_OUT_OF_MEMORY: ALenum
    get() = JAL10.AL_OUT_OF_MEMORY
actual inline val AL_VENDOR: ALenum
    get() = JAL10.AL_VENDOR
actual inline val AL_VERSION: ALenum
    get() = JAL10.AL_VERSION
actual inline val AL_RENDERER: ALenum
    get() = JAL10.AL_RENDERER
actual inline val AL_EXTENSIONS: ALenum
    get() = JAL10.AL_EXTENSIONS
actual inline val AL_DOPPLER_FACTOR: ALenum
    get() = JAL10.AL_DOPPLER_FACTOR
actual inline val AL_DISTANCE_MODEL: ALenum
    get() = JAL10.AL_DISTANCE_MODEL
actual inline val AL_INVERSE_DISTANCE: ALenum
    get() = JAL10.AL_INVERSE_DISTANCE
actual inline val AL_INVERSE_DISTANCE_CLAMPED: ALenum
    get() = JAL10.AL_INVERSE_DISTANCE_CLAMPED

actual inline fun AL10.alGetError(
) = JAL10.alGetError(
)

actual inline fun AL10.alEnable(
    target: ALenum
) = JAL10.alEnable(
    target
)

actual inline fun AL10.alDisable(
    target: ALenum
) = JAL10.alDisable(
    target
)

actual inline fun AL10.alIsEnabled(
    target: ALenum
) = JAL10.alIsEnabled(
    target
)

actual inline fun AL10.alGetBoolean(
    param: ALenum
) = JAL10.alGetBoolean(
    param
)

actual inline fun AL10.alGetInteger(
    param: ALenum
) = JAL10.alGetInteger(
    param
)

actual inline fun AL10.alGetFloat(
    param: ALenum
) = JAL10.alGetFloat(
    param
)

actual inline fun AL10.alGetDouble(
    param: ALenum
) = JAL10.alGetDouble(
    param
)

actual inline fun AL10.alGetBooleanv(
    param: ALenum, dest: BooleanArray
) {
    val stack = MemoryStack.stackPush()
    try {
        val bytes = stack.malloc(dest.size)
        JAL10.alGetBooleanv(
            param, bytes
        )
        for (i in dest.indices) {
            dest[i] = bytes[i] != 0.toByte()
        }
    } finally {
        stack.pop()
    }
}

actual inline fun AL10.alGetIntegerv(
    param: ALenum, dest: IntArray
) = JAL10.alGetIntegerv(
    param, dest
)

actual inline fun AL10.alGetFloatv(
    param: ALenum, dest: FloatArray
) = JAL10.alGetFloatv(
    param, dest
)

actual inline fun AL10.alGetDoublev(
    param: ALenum, dest: DoubleArray
) = JAL10.alGetDoublev(
    param, dest
)

actual inline fun AL10.alGetString(
    param: ALenum
) = JAL10.alGetString(
    param
)

actual inline fun AL10.alDistanceModel(
    modelName: Int
) = JAL10.alDistanceModel(
    modelName
)

actual inline fun AL10.alDopplerFactor(
    dopplerFactor: Float
) = JAL10.alDopplerFactor(
    dopplerFactor
)

actual inline fun AL10.alDopplerVelocity(
    dopplerVelocity: Float
) = JAL10.alDopplerVelocity(
    dopplerVelocity
)

actual inline fun AL10.alListenerf(
    param: ALenum, value: Float
) = JAL10.alListenerf(
    param, value
)

actual inline fun AL10.alListeneri(
    param: ALenum, value: Int
) = JAL10.alListeneri(
    param, value
)

actual inline fun AL10.alListener3f(
    param: ALenum, value1: Float, value2: Float, value3: Float
) = JAL10.alListener3f(
    param, value1, value2, value3
)

actual inline fun AL10.alListenerfv(
    param: ALenum, values: FloatArray
) = JAL10.alListenerfv(
    param, values
)

actual inline fun AL10.alGetListenerf(
    param: ALenum
) = JAL10.alGetListenerf(
    param
)

actual inline fun AL10.alGetListeneri(
    param: ALenum
) = JAL10.alGetListeneri(
    param
)

actual inline fun AL10.alGetListener3f(
    param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = JAL10.alGetListener3f(
    param, value1, value2, value3
)

actual inline fun AL10.alGetListenerfv(
    param: ALenum, values: FloatArray
) = JAL10.alGetListenerfv(
    param, values
)

actual inline fun AL10.alGenSources(
) = JAL10.alGenSources(
)

actual inline fun AL10.alDeleteSources(
    source: ALSource
) = JAL10.alDeleteSources(
    source
)

actual inline fun AL10.alIsSource(
    source: ALSource
) = JAL10.alIsSource(
    source
)

actual inline fun AL10.alSourcef(
    source: ALSource, param: ALenum, value: Float
) = JAL10.alSourcef(
    source, param, value
)

actual inline fun AL10.alSource3f(
    source: ALSource, param: ALenum, value1: Float, value2: Float, value3: Float
) = JAL10.alSource3f(
    source, param, value1, value2, value3
)

actual inline fun AL10.alSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = JAL10.alSourcefv(
    source, param, values
)

actual inline fun AL10.alSourcei(
    source: ALSource, param: ALenum, value: Int
) = JAL10.alSourcei(
    source, param, value
)

actual inline fun AL10.alSourceBuffer(
    source: ALSource, param: ALenum, value: ALBuffer
) = JAL10.alSourcei(
    source, param, value
)

actual inline fun AL10.alGetSourcef(
    source: ALSource, param: ALenum
) = JAL10.alGetSourcef(
    source, param
)

actual inline fun AL10.alGetSource3f(
    source: ALSource, param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = JAL10.alGetSource3f(
    source, param, value1, value2, value3
)

actual inline fun AL10.alGetSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = JAL10.alGetSourcefv(
    source, param, values
)

actual inline fun AL10.alGetSourcei(
    source: ALSource, param: ALenum
) = JAL10.alGetSourcei(
    source, param
)

actual inline fun AL10.alGetSourceBuffer(
    source: ALSource, param: ALenum
) = JAL10.alGetSourcei(
    source, param
)

actual inline fun AL10.alSourceQueueBuffers(
    source: ALSource, buffer: ALBuffer
) = JAL10.alSourceQueueBuffers(
    source, buffer
)

actual inline fun AL10.alSourceUnqueueBuffers(
    source: ALSource
) = JAL10.alSourceUnqueueBuffers(
    source
)

actual inline fun AL10.alSourcePlay(
    source: ALSource
) = JAL10.alSourcePlay(
    source
)

actual inline fun AL10.alSourcePause(
    source: ALSource
) = JAL10.alSourcePause(
    source
)

actual inline fun AL10.alSourceStop(
    source: ALSource
) = JAL10.alSourceStop(
    source
)

actual inline fun AL10.alSourceRewind(
    source: ALSource
) = JAL10.alSourceRewind(
    source
)

actual inline fun AL10.alSourcePlayv(
    sources: Array<ALSource>
) {
    val stack = MemoryStack.stackPush()
    try {
        val ints = stack.mallocInt(sources.size)
        for (i in sources.indices) {
            ints.put(i, sources[i])
        }
        JAL10.alSourcePlayv(
            ints
        )
    } finally {
        stack.pop()
    }
}

actual inline fun AL10.alSourcePausev(
    sources: Array<ALSource>
) {
    val stack = MemoryStack.stackPush()
    try {
        val ints = stack.mallocInt(sources.size)
        for (i in sources.indices) {
            ints.put(i, sources[i])
        }
        JAL10.alSourcePausev(
            ints
        )
    } finally {
        stack.pop()
    }
}

actual inline fun AL10.alSourceStopv(
    sources: Array<ALSource>
) {
    val stack = MemoryStack.stackPush()
    try {
        val ints = stack.mallocInt(sources.size)
        for (i in sources.indices) {
            ints.put(i, sources[i])
        }
        JAL10.alSourceStopv(
            ints
        )
    } finally {
        stack.pop()
    }
}

actual inline fun AL10.alSourceRewindv(
    sources: Array<ALSource>
) {
    val stack = MemoryStack.stackPush()
    try {
        val ints = stack.mallocInt(sources.size)
        for (i in sources.indices) {
            ints.put(i, sources[i])
        }
        JAL10.alSourceRewindv(
            ints
        )
    } finally {
        stack.pop()
    }
}

actual inline fun AL10.alGenBuffers(
) = JAL10.alGenBuffers(
)

actual inline fun AL10.alDeleteBuffers(
    buffer: ALBuffer
) = JAL10.alDeleteBuffers(
    buffer
)

actual inline fun AL10.alIsBuffer(
    buffer: ALBuffer
) = JAL10.alIsBuffer(
    buffer
)

actual inline fun AL10.alGetBufferf(
    buffer: ALBuffer, param: ALenum
) = JAL10.alGetBufferf(
    buffer, param
)

actual inline fun AL10.alGetBufferi(
    buffer: ALBuffer, param: ALenum
) = JAL10.alGetBufferi(
    buffer, param
)

actual inline fun AL10.alBufferData(
    buffer: ALBuffer, format: Int, data: DataBuffer, frequency: Int
) = data.read { bufferData ->
    JAL10.alBufferData(
        buffer, format, bufferData, frequency
    )
}
