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

import org.tobi29.scapes.engine.android.openal.bind.ALC

actual inline val ALC_FALSE: ALCenum
    get() = ALC.ALC_FALSE
actual inline val ALC_TRUE: ALCenum
    get() = ALC.ALC_TRUE
actual inline val ALC_FREQUENCY: ALCenum
    get() = ALC.ALC_FREQUENCY
actual inline val ALC_REFRESH: ALCenum
    get() = ALC.ALC_REFRESH
actual inline val ALC_SYNC: ALCenum
    get() = ALC.ALC_SYNC
actual inline val ALC_NO_ERROR: ALCenum
    get() = ALC.ALC_NO_ERROR
actual inline val ALC_INVALID_DEVICE: ALCenum
    get() = ALC.ALC_INVALID_DEVICE
actual inline val ALC_INVALID_CONTEXT: ALCenum
    get() = ALC.ALC_INVALID_CONTEXT
actual inline val ALC_INVALID_ENUM: ALCenum
    get() = ALC.ALC_INVALID_ENUM
actual inline val ALC_INVALID_VALUE: ALCenum
    get() = ALC.ALC_INVALID_VALUE
actual inline val ALC_OUT_OF_MEMORY: ALCenum
    get() = ALC.ALC_OUT_OF_MEMORY
actual inline val ALC_MAJOR_VERSION: ALCenum
    get() = ALC.ALC_MAJOR_VERSION
actual inline val ALC_MINOR_VERSION: ALCenum
    get() = ALC.ALC_MINOR_VERSION
actual inline val ALC_ATTRIBUTES_SIZE: ALCenum
    get() = ALC.ALC_ATTRIBUTES_SIZE
actual inline val ALC_ALL_ATTRIBUTES: ALCenum
    get() = ALC.ALC_ALL_ATTRIBUTES
actual inline val ALC_DEFAULT_DEVICE_SPECIFIER: ALCenum
    get() = ALC.ALC_DEFAULT_DEVICE_SPECIFIER
actual inline val ALC_DEVICE_SPECIFIER: ALCenum
    get() = ALC.ALC_DEVICE_SPECIFIER
actual inline val ALC_EXTENSIONS: ALCenum
    get() = ALC.ALC_EXTENSIONS

actual inline fun alcOpenDevice(
    deviceSpecifier: String?
) = ALC.alcOpenDevice(
    deviceSpecifier
)

actual inline fun alcCloseDevice(
    device: ALCDevice
) = ALC.alcCloseDevice(
    device
)

actual inline fun alcCreateContext(
    device: ALCDevice, attrs: IntArray?
) = ALC.alcCreateContext(
    device, attrs
)

actual inline fun alcMakeContextCurrent(
    context: ALCContext
) = ALC.alcMakeContextCurrent(
    context
)

actual inline fun alcProcessContext(
    context: ALCContext
) = ALC.alcProcessContext(
    context
)

actual inline fun alcSuspendContext(
    context: ALCContext
) = ALC.alcSuspendContext(
    context
)

actual inline fun alcDestroyContext(
    context: ALCContext
) = ALC.alcDestroyContext(
    context
)

actual inline fun alcGetCurrentContext(
) = ALC.alcGetCurrentContext(
)

actual inline fun alcGetContextsDevice(
    context: ALCContext
) = ALC.alcGetContextsDevice(
    context
)

actual inline fun alcIsExtensionPresent(
    device: ALCDevice, extension: String
) = ALC.alcIsExtensionPresent(
    device, extension
)

actual inline fun alcGetError(
    device: ALCDevice
) = ALC.alcGetError(
    device
)

actual inline fun alcGetString(
    device: ALCDevice, param: ALCenum
) = ALC.alcGetString(
    device, param
)

actual inline fun alcGetInteger(
    device: ALCDevice, param: ALCenum
) = readInt { buffer ->
    ALC.alcGetIntegerv(
        device, param, 1, buffer
    )
}

actual inline fun alcGetIntegerv(
    device: ALCDevice, param: ALCenum, values: IntArray
) = ALC.alcGetIntegerv(
    device, param, values.size, values
)
