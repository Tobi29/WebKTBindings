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

// TODO: Make proper bindings

/*
[Exposed=Window,
SecureContext]
interface AudioWorklet : Worklet {
};
*/
external interface AudioWorklet /* : Worklet */

/*
[Global=(Worklet,AudioWorklet),
 Exposed=AudioWorklet]
interface AudioWorkletGlobalScope : WorkletGlobalScope {
    void registerProcessor(DOMString name, VoidFunction processorCtor);
    readonly attribute double currentTime;
    readonly attribute float  sampleRate;
};
 */
external abstract class AudioWorkletGlobalScope /* : WorkletGlobalScope */ {
    fun registerProcessor(name: String,
                          processCtor: dynamic /* VoidFunction */)

    val currentTime: Double
    val sampleRate: Double
}