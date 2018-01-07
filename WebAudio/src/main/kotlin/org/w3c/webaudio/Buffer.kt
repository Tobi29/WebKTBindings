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

import org.khronos.webgl.Float32Array

/*
[Exposed=Window,
 Constructor(AudioBufferOptions options)]
interface AudioBuffer {
    readonly attribute float         sampleRate;
    readonly attribute unsigned long length;
    readonly attribute double        duration;
    readonly attribute unsigned long numberOfChannels;
    Float32Array getChannelData(unsigned long channel);
    void         copyFromChannel(Float32Array destination,
                                 unsigned long channelNumber,
                                 optional unsigned long startInChannel = 0);
    void         copyToChannel(Float32Array source,
                               unsigned long channelNumber,
                               optional unsigned long startInChannel = 0);
};
 */
/**
 * Exposes the JavaScript [AudioBuffer](https://developer.mozilla.org/en/docs/Web/API/AudioBuffer) to Kotlin
 */
external class AudioBuffer {
    val sampleRate: Double
    val length: Int
    val duration: Double
    val numberOfChannels: Int

    fun getChannelData(channelNumber: Int,
                       frameCount: Int,
                       sampleRate: Double): Float32Array

    fun copyFromChannel(destination: Float32Array,
                        channelNumber: Int,
                        startInChannel: Int = definedExternally)

    fun copyToChannel(source: Float32Array,
                      channelNumber: Int,
                      startInChannel: Int = definedExternally)
}
