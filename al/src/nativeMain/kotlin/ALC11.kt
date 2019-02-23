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

actual inline val ALC_MONO_SOURCES: ALCenum
    get() = binding.al.ALC_MONO_SOURCES
actual inline val ALC_STEREO_SOURCES: ALCenum
    get() = binding.al.ALC_STEREO_SOURCES
actual inline val ALC_CAPTURE_DEVICE_SPECIFIER: ALCenum
    get() = binding.al.ALC_CAPTURE_DEVICE_SPECIFIER
actual inline val ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER: ALCenum
    get() = binding.al.ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER
actual inline val ALC_CAPTURE_SAMPLES: ALCenum
    get() = binding.al.ALC_CAPTURE_SAMPLES
actual inline val ALC_DEFAULT_ALL_DEVICES_SPECIFIER: ALCenum
    get() = binding.al.ALC_DEFAULT_ALL_DEVICES_SPECIFIER
actual inline val ALC_ALL_DEVICES_SPECIFIER: ALCenum
    get() = binding.al.ALC_ALL_DEVICES_SPECIFIER

actual inline fun alcCaptureOpenDevice(
    deviceName: String, frequency: Int, format: ALCenum, samples: Int
) = binding.al.alcCaptureOpenDevice(
    deviceName, frequency.toUInt(), format, samples
).let { ALCDevice(it) }

actual inline fun alcCaptureCloseDevice(
    device: ALCDevice
) = binding.al.alcCaptureCloseDevice(
    device.ptr
) != 0.toByte()

actual inline fun alcCaptureStart(
    device: ALCDevice
) = binding.al.alcCaptureStart(
    device.ptr
)

actual inline fun alcCaptureStop(
    device: ALCDevice
) = binding.al.alcCaptureStop(
    device.ptr
)

actual inline fun alcCaptureSamples(
    device: ALCDevice, data: DataBuffer, samples: Int
) = data.read { buffer ->
    binding.al.alcCaptureSamples(
        device.ptr, buffer, samples
    )
}
