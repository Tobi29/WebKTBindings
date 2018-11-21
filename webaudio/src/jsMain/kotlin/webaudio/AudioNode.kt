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

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

/*
[Exposed=Window]
interface AudioNode : EventTarget {
    AudioNode connect(AudioNode destination,
                      optional unsigned long output = 0,
                      optional unsigned long input = 0);
    void      connect(AudioParam destination,
                      optional unsigned long output = 0);
    void      disconnect();
    void      disconnect(unsigned long output);
    void      disconnect(AudioNode destination);
    void      disconnect(AudioNode destination, unsigned long output);
    void      disconnect(AudioNode destination,
                         unsigned long output,
                         unsigned long input);
    void      disconnect(AudioParam destination);
    void      disconnect(AudioParam destination, unsigned long output);
    readonly attribute BaseAudioContext      context;
    readonly attribute unsigned long         numberOfInputs;
    readonly attribute unsigned long         numberOfOutputs;
             attribute unsigned long         channelCount;
             attribute ChannelCountMode      channelCountMode;
             attribute ChannelInterpretation channelInterpretation;
};
*/
/**
 * Exposes the JavaScript [AudioNode](https://developer.mozilla.org/en/docs/Web/API/AudioNode) to Kotlin
 */
external abstract class AudioNode : EventTarget,
        AudioNodeOrParam {
    fun connect(destination: AudioNode,
                output: Int = definedExternally,
                input: Int = definedExternally): AudioNode

    fun connect(destination: AudioParam,
                output: Int = definedExternally)

    fun disconnect(output: Int = definedExternally)

    fun disconnect(destination: AudioNode,
                   output: Int = definedExternally,
                   input: Int = definedExternally)

    fun disconnect(destination: AudioParam,
                   output: Int = definedExternally)

    val context: AudioContext
    val numberOfInputs: Int
    val numberOfOutputs: Int
    var channelCount: Int
    var channelCountMode: String /* ChannelCountMode */
    var channelInterpretation: String /* ChannelInterpretation */

}

/*
[Exposed=Window]
interface AudioScheduledSourceNode : AudioNode {
    attribute EventHandler onended;
    void start(optional double when = 0);
    void stop(optional double when = 0);
};
*/
/**
 * Exposes the JavaScript [AudioScheduledSourceNode](https://developer.mozilla.org/en/docs/Web/API/AudioScheduledSourceNode) to Kotlin
 */
external abstract class AudioScheduledSourceNode : AudioNode {
    var onend: ((Event) -> dynamic)?

    fun start(`when`: Double = definedExternally)
    fun stop(`when`: Double = definedExternally)
}
