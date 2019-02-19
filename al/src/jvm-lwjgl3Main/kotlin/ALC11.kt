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

import org.lwjgl.openal.ALC11 as JALC11

actual inline val ALC_MONO_SOURCES: ALCenum
    get() = JALC11.ALC_MONO_SOURCES
actual inline val ALC_STEREO_SOURCES: ALCenum
    get() = JALC11.ALC_STEREO_SOURCES
actual inline val ALC_CAPTURE_DEVICE_SPECIFIER: ALCenum
    get() = JALC11.ALC_CAPTURE_DEVICE_SPECIFIER
actual inline val ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER: ALCenum
    get() = JALC11.ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER
actual inline val ALC_CAPTURE_SAMPLES: ALCenum
    get() = JALC11.ALC_CAPTURE_SAMPLES
actual inline val ALC_DEFAULT_ALL_DEVICES_SPECIFIER: ALCenum
    get() = JALC11.ALC_DEFAULT_ALL_DEVICES_SPECIFIER
actual inline val ALC_ALL_DEVICES_SPECIFIER: ALCenum
    get() = JALC11.ALC_ALL_DEVICES_SPECIFIER

actual inline fun alcCaptureOpenDevice(
    deviceName: String, frequency: Int, format: ALCenum, samples: Int
) = JALC11.alcCaptureOpenDevice(
    deviceName, frequency, format, samples
)

actual inline fun alcCaptureCloseDevice(
    device: ALCDevice
) = JALC11.alcCaptureCloseDevice(
    device
)

actual inline fun alcCaptureStart(
    device: ALCDevice
) = JALC11.alcCaptureStart(
    device
)

actual inline fun alcCaptureStop(
    device: ALCDevice
) = JALC11.alcCaptureStop(
    device
)

actual inline fun alcCaptureSamples(
    device: ALCDevice, data: DataBuffer, samples: Int
) = data.read { buffer ->
    JALC11.alcCaptureSamples(
        device, buffer, samples
    )
}
