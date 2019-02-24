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

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.toCPointer

actual inline val AL_NONE: ALenum
    get() = binding.al.AL_NONE
actual inline val AL_FALSE: ALenum
    get() = binding.al.AL_FALSE
actual inline val AL_TRUE: ALenum
    get() = binding.al.AL_TRUE
actual inline val AL_SOURCE_RELATIVE: ALenum
    get() = binding.al.AL_SOURCE_RELATIVE
actual inline val AL_CONE_INNER_ANGLE: ALenum
    get() = binding.al.AL_CONE_INNER_ANGLE
actual inline val AL_CONE_OUTER_ANGLE: ALenum
    get() = binding.al.AL_CONE_OUTER_ANGLE
actual inline val AL_PITCH: ALenum
    get() = binding.al.AL_PITCH
actual inline val AL_POSITION: ALenum
    get() = binding.al.AL_POSITION
actual inline val AL_DIRECTION: ALenum
    get() = binding.al.AL_DIRECTION
actual inline val AL_VELOCITY: ALenum
    get() = binding.al.AL_VELOCITY
actual inline val AL_LOOPING: ALenum
    get() = binding.al.AL_LOOPING
actual inline val AL_BUFFER: ALenum
    get() = binding.al.AL_BUFFER
actual inline val AL_GAIN: ALenum
    get() = binding.al.AL_GAIN
actual inline val AL_MIN_GAIN: ALenum
    get() = binding.al.AL_MIN_GAIN
actual inline val AL_MAX_GAIN: ALenum
    get() = binding.al.AL_MAX_GAIN
actual inline val AL_ORIENTATION: ALenum
    get() = binding.al.AL_ORIENTATION
actual inline val AL_SOURCE_STATE: ALenum
    get() = binding.al.AL_SOURCE_STATE
actual inline val AL_INITIAL: ALenum
    get() = binding.al.AL_INITIAL
actual inline val AL_PLAYING: ALenum
    get() = binding.al.AL_PLAYING
actual inline val AL_PAUSED: ALenum
    get() = binding.al.AL_PAUSED
actual inline val AL_STOPPED: ALenum
    get() = binding.al.AL_STOPPED
actual inline val AL_BUFFERS_QUEUED: ALenum
    get() = binding.al.AL_BUFFERS_QUEUED
actual inline val AL_BUFFERS_PROCESSED: ALenum
    get() = binding.al.AL_BUFFERS_PROCESSED
actual inline val AL_REFERENCE_DISTANCE: ALenum
    get() = binding.al.AL_REFERENCE_DISTANCE
actual inline val AL_ROLLOFF_FACTOR: ALenum
    get() = binding.al.AL_ROLLOFF_FACTOR
actual inline val AL_CONE_OUTER_GAIN: ALenum
    get() = binding.al.AL_CONE_OUTER_GAIN
actual inline val AL_MAX_DISTANCE: ALenum
    get() = binding.al.AL_MAX_DISTANCE
actual inline val AL_SOURCE_TYPE: ALenum
    get() = binding.al.AL_SOURCE_TYPE
actual inline val AL_FORMAT_MONO8: ALenum
    get() = binding.al.AL_FORMAT_MONO8
actual inline val AL_FORMAT_MONO16: ALenum
    get() = binding.al.AL_FORMAT_MONO16
actual inline val AL_FORMAT_STEREO8: ALenum
    get() = binding.al.AL_FORMAT_STEREO8
actual inline val AL_FORMAT_STEREO16: ALenum
    get() = binding.al.AL_FORMAT_STEREO16
actual inline val AL_FREQUENCY: ALenum
    get() = binding.al.AL_FREQUENCY
actual inline val AL_BITS: ALenum
    get() = binding.al.AL_BITS
actual inline val AL_CHANNELS: ALenum
    get() = binding.al.AL_CHANNELS
actual inline val AL_SIZE: ALenum
    get() = binding.al.AL_SIZE
actual inline val AL_UNUSED: ALenum
    get() = binding.al.AL_UNUSED
actual inline val AL_PENDING: ALenum
    get() = binding.al.AL_PENDING
actual inline val AL_PROCESSED: ALenum
    get() = binding.al.AL_PROCESSED
actual inline val AL_NO_ERROR: ALenum
    get() = binding.al.AL_NO_ERROR
actual inline val AL_INVALID_NAME: ALenum
    get() = binding.al.AL_INVALID_NAME
actual inline val AL_INVALID_ENUM: ALenum
    get() = binding.al.AL_INVALID_ENUM
actual inline val AL_INVALID_VALUE: ALenum
    get() = binding.al.AL_INVALID_VALUE
actual inline val AL_INVALID_OPERATION: ALenum
    get() = binding.al.AL_INVALID_OPERATION
actual inline val AL_OUT_OF_MEMORY: ALenum
    get() = binding.al.AL_OUT_OF_MEMORY
actual inline val AL_VENDOR: ALenum
    get() = binding.al.AL_VENDOR
actual inline val AL_VERSION: ALenum
    get() = binding.al.AL_VERSION
actual inline val AL_RENDERER: ALenum
    get() = binding.al.AL_RENDERER
actual inline val AL_EXTENSIONS: ALenum
    get() = binding.al.AL_EXTENSIONS
actual inline val AL_DOPPLER_FACTOR: ALenum
    get() = binding.al.AL_DOPPLER_FACTOR
actual inline val AL_DISTANCE_MODEL: ALenum
    get() = binding.al.AL_DISTANCE_MODEL
actual inline val AL_INVERSE_DISTANCE: ALenum
    get() = binding.al.AL_INVERSE_DISTANCE
actual inline val AL_INVERSE_DISTANCE_CLAMPED: ALenum
    get() = binding.al.AL_INVERSE_DISTANCE_CLAMPED

actual inline fun AL10.alGetError(
) = binding.al.alGetError(
)

actual inline fun AL10.alEnable(
    target: ALenum
) = binding.al.alEnable(
    target
)

actual inline fun AL10.alDisable(
    target: ALenum
) = binding.al.alDisable(
    target
)

actual inline fun AL10.alIsEnabled(
    target: ALenum
) = binding.al.alIsEnabled(
    target
) != 0.toByte()

actual inline fun AL10.alGetBoolean(
    param: ALenum
) = binding.al.alGetBoolean(
    param
) != 0.toByte()

actual inline fun AL10.alGetInteger(
    param: ALenum
) = binding.al.alGetInteger(
    param
)

actual inline fun AL10.alGetFloat(
    param: ALenum
) = binding.al.alGetFloat(
    param
)

actual inline fun AL10.alGetDouble(
    param: ALenum
) = binding.al.alGetDouble(
    param
)

actual inline fun AL10.alGetBooleanv(
    param: ALenum, dest: BooleanArray
) = memScoped {
    val bytes = allocArray<ByteVar>(dest.size)
    binding.al.alGetBooleanv(
        param, bytes
    )
    for (i in dest.indices) {
        dest[i] = bytes[i] != 0.toByte()
    }
}

actual inline fun AL10.alGetIntegerv(
    param: ALenum, dest: IntArray
) = dest.usePinned { buffer ->
    binding.al.alGetIntegerv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL10.alGetFloatv(
    param: ALenum, dest: FloatArray
) = dest.usePinned { buffer ->
    binding.al.alGetFloatv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL10.alGetDoublev(
    param: ALenum, dest: DoubleArray
) = dest.usePinned { buffer ->
    binding.al.alGetDoublev(
        param, buffer.toCPointer()
    )
}

actual inline fun AL10.alGetString(
    param: ALenum
) = binding.al.alGetString(
    param
)?.toKString()

actual inline fun AL10.alDistanceModel(
    modelName: Int
) = binding.al.alDistanceModel(
    modelName
)

actual inline fun AL10.alDopplerFactor(
    dopplerFactor: Float
) = binding.al.alDopplerFactor(
    dopplerFactor
)

actual inline fun AL10.alDopplerVelocity(
    dopplerVelocity: Float
) = binding.al.alDopplerVelocity(
    dopplerVelocity
)

actual inline fun AL10.alListenerf(
    param: ALenum, value: Float
) = binding.al.alListenerf(
    param, value
)

actual inline fun AL10.alListeneri(
    param: ALenum, value: Int
) = binding.al.alListeneri(
    param, value
)

actual inline fun AL10.alListener3f(
    param: ALenum, value1: Float, value2: Float, value3: Float
) = binding.al.alListener3f(
    param, value1, value2, value3
)

actual inline fun AL10.alListenerfv(
    param: ALenum, values: FloatArray
) = values.usePinned { buffer ->
    binding.al.alListenerfv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL10.alGetListenerf(
    param: ALenum
) = memScoped {
    val buffer = alloc<FloatVar>()
    binding.al.alGetListenerf(
        param, buffer.ptr
    )
    buffer.value
}

actual inline fun AL10.alGetListeneri(
    param: ALenum
) = memScoped {
    val buffer = alloc<IntVar>()
    binding.al.alGetListeneri(
        param, buffer.ptr
    )
    buffer.value
}

actual inline fun AL10.alGetListener3f(
    param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = value1.usePinned { buffer1 ->
    value2.usePinned { buffer2 ->
        value3.usePinned { buffer3 ->
            binding.al.alGetListener3f(
                param, buffer1.toCPointer(), buffer2.toCPointer(),
                buffer3.toCPointer()
            )
        }
    }
}

actual inline fun AL10.alGetListenerfv(
    param: ALenum, values: FloatArray
) = values.usePinned { buffer ->
    binding.al.alGetListenerfv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL10.alCreateSource(
) = memScoped {
    val buffer = alloc<UIntVar>()
    binding.al.alGenSources(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun AL10.alDeleteSource(
    source: ALSource
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = source.toUInt()
    binding.al.alDeleteSources(
        1, buffer.ptr
    )
}

actual inline fun AL10.alIsSource(
    source: ALSource
) = binding.al.alIsSource(
    source.toUInt()
) != 0.toByte()

actual inline fun AL10.alSourcef(
    source: ALSource, param: ALenum, value: Float
) = binding.al.alSourcef(
    source.toUInt(), param, value
)

actual inline fun AL10.alSource3f(
    source: ALSource, param: ALenum, value1: Float, value2: Float, value3: Float
) = binding.al.alSource3f(
    source.toUInt(), param, value1, value2, value3
)

actual inline fun AL10.alSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = values.usePinned { buffer ->
    binding.al.alSourcefv(
        source.toUInt(), param, buffer.toCPointer()
    )
}

actual inline fun AL10.alSourcei(
    source: ALSource, param: ALenum, value: Int
) = binding.al.alSourcei(
    source.toUInt(), param, value
)

actual inline fun AL10.alSourceBuffer(
    source: ALSource, param: ALenum, value: ALBuffer
) = binding.al.alSourcei(
    source.toUInt(), param, value
)

actual inline fun AL10.alGetSourcef(
    source: ALSource, param: ALenum
) = memScoped {
    val buffer = alloc<FloatVar>()
    binding.al.alGetSourcef(
        source.toUInt(), param, buffer.ptr
    )
    buffer.value
}

actual inline fun AL10.alGetSource3f(
    source: ALSource, param: ALenum, value1: FloatArray, value2: FloatArray,
    value3: FloatArray
) = value1.usePinned { buffer1 ->
    value2.usePinned { buffer2 ->
        value3.usePinned { buffer3 ->
            binding.al.alGetSource3f(
                source.toUInt(), param, buffer1.toCPointer(),
                buffer2.toCPointer(), buffer3.toCPointer()
            )
        }
    }
}

actual inline fun AL10.alGetSourcefv(
    source: ALSource, param: ALenum, values: FloatArray
) = values.usePinned { buffer ->
    binding.al.alGetSourcefv(
        source.toUInt(), param, buffer.toCPointer()
    )
}

actual inline fun AL10.alGetSourcei(
    source: ALSource, param: ALenum
) = memScoped {
    val buffer = alloc<IntVar>()
    binding.al.alGetSourcei(
        source.toUInt(), param, buffer.ptr
    )
    buffer.value
}

actual inline fun AL10.alGetSourceBuffer(
    source: ALSource, param: ALenum
) = memScoped {
    val buffer = alloc<IntVar>()
    binding.al.alGetSourcei(
        source.toUInt(), param, buffer.ptr
    )
    buffer.value
}

actual inline fun AL10.alSourceQueueBuffers(
    source: ALSource, buffer: ALBuffer
) = memScoped {
    val bufferBuffer = alloc<UIntVar>()
    bufferBuffer.value = buffer.toUInt()
    binding.al.alSourceQueueBuffers(
        source.toUInt(), 1, bufferBuffer.ptr
    )
}

actual inline fun AL10.alSourceUnqueueBuffers(
    source: ALSource
) = memScoped {
    val buffer = alloc<UIntVar>()
    binding.al.alSourceUnqueueBuffers(
        source.toUInt(), 1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun AL10.alSourcePlay(
    source: ALSource
) = binding.al.alSourcePlay(
    source.toUInt()
)

actual inline fun AL10.alSourcePause(
    source: ALSource
) = binding.al.alSourcePause(
    source.toUInt()
)

actual inline fun AL10.alSourceStop(
    source: ALSource
) = binding.al.alSourceStop(
    source.toUInt()
)

actual inline fun AL10.alSourceRewind(
    source: ALSource
) = binding.al.alSourceRewind(
    source.toUInt()
)

actual inline fun AL10.alSourcePlayv(
    sources: Array<ALSource>
) {
    val ints = UIntArray(sources.size) { sources[it].toUInt() }
    ints.usePinned { buffer ->
        binding.al.alSourcePlayv(
            sources.size, buffer.toCPointer()
        )
    }
}

actual inline fun AL10.alSourcePausev(
    sources: Array<ALSource>
) {
    val ints = UIntArray(sources.size) { sources[it].toUInt() }
    ints.usePinned { buffer ->
        binding.al.alSourcePausev(
            sources.size, buffer.toCPointer()
        )
    }
}

actual inline fun AL10.alSourceStopv(
    sources: Array<ALSource>
) {
    val ints = UIntArray(sources.size) { sources[it].toUInt() }
    ints.usePinned { buffer ->
        binding.al.alSourceStopv(
            sources.size, buffer.toCPointer()
        )
    }
}

actual inline fun AL10.alSourceRewindv(
    sources: Array<ALSource>
) {
    val ints = UIntArray(sources.size) { sources[it].toUInt() }
    ints.usePinned { buffer ->
        binding.al.alSourceRewindv(
            sources.size, buffer.toCPointer()
        )
    }
}

actual inline fun AL10.alCreateBuffer(
) = memScoped {
    val buffer = alloc<UIntVar>()
    binding.al.alGenBuffers(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun AL10.alDeleteBuffer(
    buffer: ALBuffer
) = memScoped {
    val bufferBuffer = alloc<UIntVar>()
    bufferBuffer.value = buffer.toUInt()
    binding.al.alDeleteBuffers(
        1, bufferBuffer.ptr
    )
}

actual inline fun AL10.alIsBuffer(
    buffer: ALBuffer
) = binding.al.alIsBuffer(
    buffer.toUInt()
) != 0.toByte()

actual inline fun AL10.alGetBufferf(
    buffer: ALBuffer, param: ALenum
) = memScoped {
    val bufferBuffer = alloc<FloatVar>()
    binding.al.alGetBufferf(
        buffer.toUInt(), param, bufferBuffer.ptr
    )
    bufferBuffer.value
}

actual inline fun AL10.alGetBufferi(
    buffer: ALBuffer, param: ALenum
) = memScoped {
    val bufferBuffer = alloc<IntVar>()
    binding.al.alGetBufferi(
        buffer.toUInt(), param, bufferBuffer.ptr
    )
    bufferBuffer.value
}

actual inline fun AL10.alBufferData(
    buffer: ALBuffer, format: Int, data: DataBuffer, frequency: Int
) = data.read { bufferData ->
    binding.al.alBufferData(
        buffer.toUInt(), format, bufferData, data.size, frequency
    )
}
