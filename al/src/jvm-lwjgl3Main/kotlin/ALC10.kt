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

import org.lwjgl.openal.ALC10 as JALC10

actual inline val ALC_FALSE: ALCenum
    get() = JALC10.ALC_FALSE
actual inline val ALC_TRUE: ALCenum
    get() = JALC10.ALC_TRUE
actual inline val ALC_FREQUENCY: ALCenum
    get() = JALC10.ALC_FREQUENCY
actual inline val ALC_REFRESH: ALCenum
    get() = JALC10.ALC_REFRESH
actual inline val ALC_SYNC: ALCenum
    get() = JALC10.ALC_SYNC
actual inline val ALC_NO_ERROR: ALCenum
    get() = JALC10.ALC_NO_ERROR
actual inline val ALC_INVALID_DEVICE: ALCenum
    get() = JALC10.ALC_INVALID_DEVICE
actual inline val ALC_INVALID_CONTEXT: ALCenum
    get() = JALC10.ALC_INVALID_CONTEXT
actual inline val ALC_INVALID_ENUM: ALCenum
    get() = JALC10.ALC_INVALID_ENUM
actual inline val ALC_INVALID_VALUE: ALCenum
    get() = JALC10.ALC_INVALID_VALUE
actual inline val ALC_OUT_OF_MEMORY: ALCenum
    get() = JALC10.ALC_OUT_OF_MEMORY
actual inline val ALC_MAJOR_VERSION: ALCenum
    get() = JALC10.ALC_MAJOR_VERSION
actual inline val ALC_MINOR_VERSION: ALCenum
    get() = JALC10.ALC_MINOR_VERSION
actual inline val ALC_ATTRIBUTES_SIZE: ALCenum
    get() = JALC10.ALC_ATTRIBUTES_SIZE
actual inline val ALC_ALL_ATTRIBUTES: ALCenum
    get() = JALC10.ALC_ALL_ATTRIBUTES
actual inline val ALC_DEFAULT_DEVICE_SPECIFIER: ALCenum
    get() = JALC10.ALC_DEFAULT_DEVICE_SPECIFIER
actual inline val ALC_DEVICE_SPECIFIER: ALCenum
    get() = JALC10.ALC_DEVICE_SPECIFIER
actual inline val ALC_EXTENSIONS: ALCenum
    get() = JALC10.ALC_EXTENSIONS

actual inline fun alcOpenDevice(
    deviceSpecifier: String?
) = JALC10.alcOpenDevice(
    deviceSpecifier
)

actual inline fun alcCloseDevice(
    device: ALCDevice
) = JALC10.alcCloseDevice(
    device
)

actual inline fun alcCreateContext(
    device: ALCDevice, attrs: IntArray?
) = JALC10.alcCreateContext(
    device, attrs
)

actual inline fun alcMakeContextCurrent(
    context: ALCContext
) = JALC10.alcMakeContextCurrent(
    context
)

actual inline fun alcProcessContext(
    context: ALCContext
) = JALC10.alcProcessContext(
    context
)

actual inline fun alcSuspendContext(
    context: ALCContext
) = JALC10.alcSuspendContext(
    context
)

actual inline fun alcDestroyContext(
    context: ALCContext
) = JALC10.alcDestroyContext(
    context
)

actual inline fun alcGetCurrentContext(
) = JALC10.alcGetCurrentContext(
)

actual inline fun alcGetContextsDevice(
    context: ALCContext
) = JALC10.alcGetContextsDevice(
    context
)

actual inline fun alcIsExtensionPresent(
    device: ALCDevice, extension: String
) = JALC10.alcIsExtensionPresent(
    device, extension
)

actual inline fun alcGetError(
    device: ALCDevice
) = JALC10.alcGetError(
    device
)

actual inline fun alcGetString(
    device: ALCDevice, param: ALCenum
) = JALC10.alcGetString(
    device, param
)

actual inline fun alcGetInteger(
    device: ALCDevice, param: ALCenum
) = JALC10.alcGetInteger(
    device, param
)

actual inline fun alcGetIntegerv(
    device: ALCDevice, param: ALCenum, values: IntArray
) = JALC10.alcGetIntegerv(
    device, param, values
)
