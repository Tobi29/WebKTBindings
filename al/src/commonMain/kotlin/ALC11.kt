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

import net.gitout.ktbindings.utils.DataBuffer

expect val ALC_MONO_SOURCES: ALCenum
expect val ALC_STEREO_SOURCES: ALCenum
expect val ALC_CAPTURE_DEVICE_SPECIFIER: ALCenum
expect val ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER: ALCenum
expect val ALC_CAPTURE_SAMPLES: ALCenum
expect val ALC_DEFAULT_ALL_DEVICES_SPECIFIER: ALCenum
expect val ALC_ALL_DEVICES_SPECIFIER: ALCenum

expect fun alcCaptureOpenDevice(
    deviceName: String, frequency: Int, format: ALCenum, samples: Int
): ALCDevice

expect fun alcCaptureCloseDevice(
    device: ALCDevice
): Boolean

expect fun alcCaptureStart(
    device: ALCDevice
)

expect fun alcCaptureStop(
    device: ALCDevice
)

expect fun alcCaptureSamples(
    device: ALCDevice, data: DataBuffer, samples: Int
)
