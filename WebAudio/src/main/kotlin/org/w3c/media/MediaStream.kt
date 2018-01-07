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

package org.w3c.media

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.Promise

/**
 * Exposes the JavaScript [MediaStream](https://developer.mozilla.org/en/docs/Web/API/MediaStream) to Kotlin
 */
external class MediaStream : EventTarget {
    val active: Boolean
    val ended: Boolean
    val id: String

    val onaddtrack: ((Event) -> dynamic)?
    val onremovetrack: ((Event) -> dynamic)?

    fun addTrack(track: MediaStreamTrack)
    fun clone(): MediaStream
    fun getAudioTracks(): Array<MediaStreamTrack>
    fun getTrackById(id: String): MediaStreamTrack?
    fun getTracks(): Array<MediaStreamTrack>
    fun getVideoTracks(): Array<MediaStreamTrack>
    fun removeTrack(track: MediaStreamTrack)
}

/**
 * Exposes the JavaScript [MediaStreamTrack](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrack) to Kotlin
 */
external abstract class MediaStreamTrack {
    var contentHint: String
    var enabled: Boolean
    val id: String
    val kind: String
    val label: String
    val muted: Boolean
    val readonly: Boolean
    val readyState: String

    var onstarted: ((Event) -> dynamic)?
    var onmute: ((Event) -> dynamic)?
    var onunmute: ((Event) -> dynamic)?
    var onoverconstrained: ((Event) -> dynamic)?
    var onended: ((Event) -> dynamic)?

    /**
     * @return [MediaTrackConstrains](https://developer.mozilla.org/en/docs/Web/API/MediaTrackConstrains)
     */
    fun applyConstraints(constrains: dynamic /* MediaTrackConstrains */): Promise<dynamic>

    fun clone(): MediaStreamTrack

    /**
     * @return [MediaTrackCapabilities](https://developer.mozilla.org/en/docs/Web/API/MediaTrackCapabilities)
     */
    fun getCapabilities(): dynamic /* MediaTrackCapabilities */

    /**
     * @return [MediaTrackConstrains](https://developer.mozilla.org/en/docs/Web/API/MediaTrackConstrains)
     */
    fun getConstrains(): dynamic /* MediaTrackConstrains */

    /**
     * @return [MediaTrackSettings](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSettings)
     */
    fun getSettings(): dynamic /* MediaTrackSettings */

    fun stop()
}
