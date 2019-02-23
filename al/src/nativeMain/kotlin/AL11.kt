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
import net.gitout.ktbindings.utils.toCPointer

actual inline val AL_SEC_OFFSET: ALenum
    get() = binding.al.AL_SEC_OFFSET
actual inline val AL_SAMPLE_OFFSET: ALenum
    get() = binding.al.AL_SAMPLE_OFFSET
actual inline val AL_BYTE_OFFSET: ALenum
    get() = binding.al.AL_BYTE_OFFSET
actual inline val AL_STATIC: ALenum
    get() = binding.al.AL_STATIC
actual inline val AL_STREAMING: ALenum
    get() = binding.al.AL_STREAMING
actual inline val AL_UNDETERMINED: ALenum
    get() = binding.al.AL_UNDETERMINED
actual inline val AL_ILLEGAL_COMMAND: ALenum
    get() = binding.al.AL_ILLEGAL_COMMAND
actual inline val AL_SPEED_OF_SOUND: ALenum
    get() = binding.al.AL_SPEED_OF_SOUND
actual inline val AL_LINEAR_DISTANCE: ALenum
    get() = binding.al.AL_LINEAR_DISTANCE
actual inline val AL_LINEAR_DISTANCE_CLAMPED: ALenum
    get() = binding.al.AL_LINEAR_DISTANCE_CLAMPED
actual inline val AL_EXPONENT_DISTANCE: ALenum
    get() = binding.al.AL_EXPONENT_DISTANCE
actual inline val AL_EXPONENT_DISTANCE_CLAMPED: ALenum
    get() = binding.al.AL_EXPONENT_DISTANCE_CLAMPED

actual inline fun AL11.alListener3i(
    param: ALenum, value1: Int, value2: Int, value3: Int
) = binding.al.alListener3i(
    param, value1, value2, value3
)

actual inline fun AL11.alListeneriv(
    param: ALenum, values: IntArray
) = values.usePinned { buffer ->
    binding.al.alListeneriv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL11.alGetListeneriv(
    param: ALenum, values: IntArray
) = values.usePinned { buffer ->
    binding.al.alGetListeneriv(
        param, buffer.toCPointer()
    )
}

actual inline fun AL11.alSource3i(
    source: ALSource, param: ALenum, value1: Int, value2: Int, value3: Int
) = binding.al.alSource3i(
    source.toUInt(), param, value1, value2, value3
)

actual inline fun AL11.alSourceiv(
    source: ALSource, param: ALenum, values: IntArray
) = values.usePinned { buffer ->
    binding.al.alSourceiv(
        source.toUInt(), param, buffer.toCPointer()
    )
}

actual inline fun AL11.alGetSourceiv(
    source: ALSource, param: ALenum, values: IntArray
) = values.usePinned { buffer ->
    binding.al.alGetSourceiv(
        source.toUInt(), param, buffer.toCPointer()
    )
}

actual inline fun AL11.alBufferf(
    buffer: ALBuffer, param: ALenum, value: Float
) = binding.al.alBufferf(
    buffer.toUInt(), param, value
)

actual inline fun AL11.alBuffer3f(
    buffer: ALBuffer, param: ALenum, value1: Float, value2: Float, value3: Float
) = binding.al.alBuffer3f(
    buffer.toUInt(), param, value1, value2, value3
)

actual inline fun AL11.alBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
) = values.usePinned { bufferBuffer ->
    binding.al.alBufferfv(
        buffer.toUInt(), param, bufferBuffer.toCPointer()
    )
}

actual inline fun AL11.alBufferi(
    buffer: ALBuffer, param: ALenum, value: Int
) = binding.al.alBufferi(
    buffer.toUInt(), param, value
)

actual inline fun AL11.alBuffer3i(
    buffer: ALBuffer, param: ALenum, value1: Int, value2: Int, value3: Int
) = binding.al.alBuffer3i(
    buffer.toUInt(), param, value1, value2, value3
)

actual inline fun AL11.alBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
) = values.usePinned { bufferBuffer ->
    binding.al.alBufferiv(
        buffer.toUInt(), param, bufferBuffer.toCPointer()
    )
}

actual inline fun AL11.alGetBufferfv(
    buffer: ALBuffer, param: ALenum, values: FloatArray
) = values.usePinned { bufferBuffer ->
    binding.al.alGetBufferfv(
        buffer.toUInt(), param, bufferBuffer.toCPointer()
    )
}

actual inline fun AL11.alGetBufferiv(
    buffer: ALBuffer, param: ALenum, values: IntArray
) = values.usePinned { bufferBuffer ->
    binding.al.alGetBufferiv(
        buffer.toUInt(), param, bufferBuffer.toCPointer()
    )
}

actual inline fun AL11.alSpeedOfSound(
    value: Float
) = binding.al.alSpeedOfSound(
    value
)
