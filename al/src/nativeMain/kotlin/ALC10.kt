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
import net.gitout.ktbindings.utils.usePinnedOrNull

actual inline val ALC_FALSE: ALCenum
    get() = binding.al.ALC_FALSE
actual inline val ALC_TRUE: ALCenum
    get() = binding.al.ALC_TRUE
actual inline val ALC_FREQUENCY: ALCenum
    get() = binding.al.ALC_FREQUENCY
actual inline val ALC_REFRESH: ALCenum
    get() = binding.al.ALC_REFRESH
actual inline val ALC_SYNC: ALCenum
    get() = binding.al.ALC_SYNC
actual inline val ALC_NO_ERROR: ALCenum
    get() = binding.al.ALC_NO_ERROR
actual inline val ALC_INVALID_DEVICE: ALCenum
    get() = binding.al.ALC_INVALID_DEVICE
actual inline val ALC_INVALID_CONTEXT: ALCenum
    get() = binding.al.ALC_INVALID_CONTEXT
actual inline val ALC_INVALID_ENUM: ALCenum
    get() = binding.al.ALC_INVALID_ENUM
actual inline val ALC_INVALID_VALUE: ALCenum
    get() = binding.al.ALC_INVALID_VALUE
actual inline val ALC_OUT_OF_MEMORY: ALCenum
    get() = binding.al.ALC_OUT_OF_MEMORY
actual inline val ALC_MAJOR_VERSION: ALCenum
    get() = binding.al.ALC_MAJOR_VERSION
actual inline val ALC_MINOR_VERSION: ALCenum
    get() = binding.al.ALC_MINOR_VERSION
actual inline val ALC_ATTRIBUTES_SIZE: ALCenum
    get() = binding.al.ALC_ATTRIBUTES_SIZE
actual inline val ALC_ALL_ATTRIBUTES: ALCenum
    get() = binding.al.ALC_ALL_ATTRIBUTES
actual inline val ALC_DEFAULT_DEVICE_SPECIFIER: ALCenum
    get() = binding.al.ALC_DEFAULT_DEVICE_SPECIFIER
actual inline val ALC_DEVICE_SPECIFIER: ALCenum
    get() = binding.al.ALC_DEVICE_SPECIFIER
actual inline val ALC_EXTENSIONS: ALCenum
    get() = binding.al.ALC_EXTENSIONS

actual inline fun alcOpenDevice(
    deviceSpecifier: String?
) = binding.al.alcOpenDevice(
    deviceSpecifier
).let { ALCDevice(it) }

actual inline fun alcCloseDevice(
    device: ALCDevice
) = binding.al.alcCloseDevice(
    device.ptr
) != 0.toByte()

actual inline fun alcCreateContext(
    device: ALCDevice, attrs: IntArray?
) = attrs.usePinnedOrNull { buffer ->
    binding.al.alcCreateContext(
        device.ptr, buffer?.toCPointer()
    ).let { ALCContext(it) }
}

actual inline fun alcMakeContextCurrent(
    context: ALCContext
) = binding.al.alcMakeContextCurrent(
    context.ptr
) != 0.toByte()

actual inline fun alcProcessContext(
    context: ALCContext
) = binding.al.alcProcessContext(
    context.ptr
)

actual inline fun alcSuspendContext(
    context: ALCContext
) = binding.al.alcSuspendContext(
    context.ptr
)

actual inline fun alcDestroyContext(
    context: ALCContext
) = binding.al.alcDestroyContext(
    context.ptr
)

actual inline fun alcGetCurrentContext(
) = binding.al.alcGetCurrentContext(
).let { ALCContext(it) }

actual inline fun alcGetContextsDevice(
    context: ALCContext
) = binding.al.alcGetContextsDevice(
    context.ptr
).let { ALCDevice(it) }

actual inline fun alcIsExtensionPresent(
    device: ALCDevice, extension: String
) = binding.al.alcIsExtensionPresent(
    device.ptr, extension
) != 0.toByte()

actual inline fun alcGetError(
    device: ALCDevice
) = binding.al.alcGetError(
    device.ptr
)

actual inline fun alcGetString(
    device: ALCDevice, param: ALCenum
) = binding.al.alcGetString(
    device.ptr, param
)?.toKString()

actual inline fun alcGetInteger(
    device: ALCDevice, param: ALCenum
) = memScoped {
    val buffer = alloc<IntVar>()
    binding.al.alcGetIntegerv(
        device.ptr, param, 1, buffer.ptr
    )
    buffer.value
}

actual inline fun alcGetIntegerv(
    device: ALCDevice, param: ALCenum, values: IntArray
) = values.usePinned { buffer ->
    binding.al.alcGetIntegerv(
        device.ptr, param, values.size, buffer.toCPointer()
    )
}
