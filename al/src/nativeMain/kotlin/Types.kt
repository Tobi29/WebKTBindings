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

actual abstract class AL10 internal constructor()
actual abstract class AL11 internal constructor() : AL10()

private class ALContext : AL11()

actual inline fun contextAL10(): AL10 = contextAL11()
actual fun contextAL11(): AL11 = ALContext()

actual data class ALCDevice(
    val ptr: CPointer<binding.al.ALCdevice>?
)

actual inline val emptyALCDevice: ALCDevice  get() = ALCDevice(null)

actual data class ALCContext(
    val ptr: CPointer<binding.al.ALCcontext>?
)

actual inline val emptyALCContext: ALCContext  get() = ALCContext(null)

actual typealias ALBuffer = Int

actual inline val emptyALBuffer: ALBuffer get() = 0

actual typealias ALSource = Int

actual inline val emptyALSource: ALSource get() = 0
