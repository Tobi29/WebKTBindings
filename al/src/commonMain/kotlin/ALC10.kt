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

expect val ALC_FALSE: ALCenum
expect val ALC_TRUE: ALCenum
expect val ALC_FREQUENCY: ALCenum
expect val ALC_REFRESH: ALCenum
expect val ALC_SYNC: ALCenum
expect val ALC_NO_ERROR: ALCenum
expect val ALC_INVALID_DEVICE: ALCenum
expect val ALC_INVALID_CONTEXT: ALCenum
expect val ALC_INVALID_ENUM: ALCenum
expect val ALC_INVALID_VALUE: ALCenum
expect val ALC_OUT_OF_MEMORY: ALCenum
expect val ALC_MAJOR_VERSION: ALCenum
expect val ALC_MINOR_VERSION: ALCenum
expect val ALC_ATTRIBUTES_SIZE: ALCenum
expect val ALC_ALL_ATTRIBUTES: ALCenum
expect val ALC_DEFAULT_DEVICE_SPECIFIER: ALCenum
expect val ALC_DEVICE_SPECIFIER: ALCenum
expect val ALC_EXTENSIONS: ALCenum

expect fun alcOpenDevice(
    deviceSpecifier: String?
): ALCDevice

expect fun alcCloseDevice(
    device: ALCDevice
): Boolean

expect fun alcCreateContext(
    device: ALCDevice, attrs: IntArray? = null
): ALCContext

expect fun alcMakeContextCurrent(
    context: ALCContext
): Boolean

expect fun alcProcessContext(
    context: ALCContext
)

expect fun alcSuspendContext(
    context: ALCContext
)

expect fun alcDestroyContext(
    context: ALCContext
)

expect fun alcGetCurrentContext(
): ALCContext

expect fun alcGetContextsDevice(
    context: ALCContext
): ALCDevice

expect fun alcIsExtensionPresent(
    device: ALCDevice, extension: String
): Boolean

expect fun alcGetError(
    device: ALCDevice
): Int

expect fun alcGetString(
    device: ALCDevice, param: ALCenum
): String?

expect fun alcGetInteger(
    device: ALCDevice, param: ALCenum
): Int

expect fun alcGetIntegerv(
    device: ALCDevice, param: ALCenum, values: IntArray
)
