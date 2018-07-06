/*
 * Copyright 2012-2018 Tobi29
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

package org.w3c.webaudio

import org.w3c.dom.HTMLAudioElement

/**
 * Constructs a new [AudioContext] using the recommended method from MDN
 */
@Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")
inline fun createAudioContext(): AudioContext =
        js("new (window.AudioContext || window.webkitAudioContext)()")

/**
 * Constructs a new [AudioContext] using the recommended method from MDN
 */
@Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")
inline fun createAudioContext(options: dynamic /* AudioContextOptions */): AudioContext =
        js("new (window.AudioContext || window.webkitAudioContext)(options)")

/**
 * Constructs a new [HTMLAudioElement] using `new Audio(...)`
 */
@Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")
inline fun Audio(url: String): HTMLAudioElement = JSAudio(url).asDynamic()

@JsName("Audio")
@PublishedApi
internal external class JSAudio(url: String)
