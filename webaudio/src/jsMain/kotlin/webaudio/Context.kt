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

import org.khronos.webgl.ArrayBuffer
import org.w3c.dom.HTMLMediaElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import org.w3c.media.MediaStream
import org.w3c.media.MediaStreamTrack
import kotlin.js.Promise

/*
[Exposed=Window,
 Constructor(optional AudioContextOptions contextOptions)]
interface AudioContext : BaseAudioContext {
    readonly attribute double baseLatency;
    readonly attribute double outputLatency;
    AudioTimestamp                  getOutputTimestamp();
    Promise<void>                   suspend();
    Promise<void>                   close();
    MediaElementAudioSourceNode     createMediaElementSource(HTMLMediaElement mediaElement);
    MediaStreamAudioSourceNode      createMediaStreamSource(MediaStream mediaStream);
    MediaStreamTrackAudioSourceNode createMediaStreamTrackSource(MediaStreamTrack mediaStreamTrack);
    MediaStreamAudioDestinationNode createMediaStreamDestination();
};
 */
/**
 * Exposes the JavaScript [AudioContext](https://developer.mozilla.org/en/docs/Web/API/AudioContext) to Kotlin
 */
external open class AudioContext
@Deprecated("Use createAudioContext for better compatibility",
        ReplaceWith("createAudioContext(options)",
                "org.tobi29.scapes.engine.backends.js.audio.webaudio.createAudioContext"))
constructor(options: dynamic /* AudioContextOptions */ = definedExternally) : BaseAudioContext {
    val baseLatency: Double
    val outputLatency: Double

    fun getOutputTimestamp(): AudioTimestamp

    fun suspend(): Promise<Unit>
    fun close(): Promise<Unit>

    fun createMediaElementSource(element: HTMLMediaElement): MediaElementAudioSourceNode
    fun createMediaStreamSource(stream: MediaStream): MediaStreamAudioSourceNode
    fun createMediaStreamTrackAudioSource(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceNode
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode
}

/*
[Exposed=Window]
interface BaseAudioContext : EventTarget {
    readonly attribute AudioDestinationNode destination;
    readonly attribute float                sampleRate;
    readonly attribute double               currentTime;
    readonly attribute AudioListener        listener;
    readonly attribute AudioContextState    state;
    [SameObject,
     SecureContext]
    readonly attribute AudioWorklet         audioWorklet;
    Promise<void>          resume();
             attribute EventHandler         onstatechange;
    AudioBuffer            createBuffer(unsigned long numberOfChannels,
                                        unsigned long length,
                                        float sampleRate);
    Promise<AudioBuffer>   decodeAudioData(ArrayBuffer audioData,
                                           optional DecodeSuccessCallback successCallback,
                                           optional DecodeErrorCallback errorCallback);
    AudioBufferSourceNode  createBufferSource();
    ConstantSourceNode     createConstantSource();
    ScriptProcessorNode    createScriptProcessor(optional unsigned long bufferSize = 0,
                                                 optional unsigned long numberOfInputChannels = 2,
                                                 optional unsigned long numberOfOutputChannels = 2);
    AnalyserNode           createAnalyser();
    GainNode               createGain();
    DelayNode              createDelay(optional double maxDelayTime = 1);
    BiquadFilterNode       createBiquadFilter();
    IIRFilterNode          createIIRFilter(sequence<double> feedforward,
                                           sequence<double> feedback);
    WaveShaperNode         createWaveShaper();
    PannerNode             createPanner();
    StereoPannerNode       createStereoPanner();
    ConvolverNode          createConvolver();
    ChannelSplitterNode    createChannelSplitter(optional unsigned long numberOfOutputs = 6);
    ChannelMergerNode      createChannelMerger(optional unsigned long numberOfInputs = 6);
    DynamicsCompressorNode createDynamicsCompressor();
    OscillatorNode         createOscillator();
    PeriodicWave           createPeriodicWave(sequence<float> real,
                                              sequence<float> imag,
                                              optional PeriodicWaveConstraints constraints);
};
 */
/**
 * Exposes the JavaScript [BaseAudioContext](https://developer.mozilla.org/en/docs/Web/API/BaseAudioContext) to Kotlin
 */
external abstract class BaseAudioContext : EventTarget {
    val destination: AudioDestinationNode
    val sampleRate: Double
    val currentTime: Double
    val listener: AudioListener
    val state: String
    val audioWorklet: AudioWorklet

    fun resume(): Promise<Unit>

    var onstatechange: ((Event) -> dynamic)?

    fun createBuffer(numberOfChannels: Int,
                     length: Int,
                     sampleRate: Double): AudioBuffer

    fun decodeAudioData(audioData: ArrayBuffer,
                        successCallback: (AudioBuffer) -> dynamic = definedExternally,
                        errorCallback: () -> dynamic = definedExternally): Promise<AudioBuffer>

    fun createBufferSource(): AudioBufferSourceNode
    fun createConstantSource(): ConstantSourceNode
    fun createAnalyser(): AnalyserNode
    fun createGain(): GainNode
    fun createDelay(maxDelayTime: Double = definedExternally): DelayNode
    fun createBiquadFilter(): BiquadFilterNode
    fun createIIRFilter(feedforward: Array<Double>,
                        feedback: Array<Double>)

    fun createWaveShaper(): WaveShaperNode
    fun createPanner(): PannerNode
    fun createStereoPanner(): StereoPannerNode
    fun createConvolver(): ConvolverNode
    fun createChannelSplitter(numberOfOutputs: Int = definedExternally): ChannelSplitterNode
    fun createChannelMerger(numberOfInputs: Int = definedExternally): ChannelMergerNode
    fun createDynamicsCompressor(): DynamicsCompressorNode
    fun createOscillator(): OscillatorNode
    fun createPeriodicWave(real: Array<Double>,
                           imag: Array<Double>,
                           constraints: dynamic /* PeriodicWaveConstraints */ = definedExternally): PeriodicWave
}

// TODO: Offline context
/*
enum AudioContextState {
    "suspended",
    "running",
    "closed"
};
callback DecodeErrorCallback = void (DOMException error);
[Exposed=Window]
enum AudioContextLatencyCategory {
    "balanced",
    "interactive",
    "playback"
};
[Exposed=Window]
dictionary AudioContextOptions {
    (AudioContextLatencyCategory or double) latencyHint = "interactive";
    float                                   sampleRate;
};

[Exposed=Window,
 Constructor(OfflineAudioContextOptions contextOptions),
 Constructor(unsigned long numberOfChannels, unsigned long length, float sampleRate)]
interface OfflineAudioContext : BaseAudioContext {
    Promise<AudioBuffer> startRendering();
    Promise<void>        suspend(double suspendTime);
    readonly attribute unsigned long length;
             attribute EventHandler  oncomplete;
};
[Exposed=Window]
dictionary OfflineAudioContextOptions {
             unsigned long numberOfChannels = 1;
    required unsigned long length;
    required float         sampleRate;
};
[Exposed=Window,
 Constructor(DOMString type, OfflineAudioCompletionEventInit eventInitDict)]
interface OfflineAudioCompletionEvent : Event {
    readonly attribute AudioBuffer renderedBuffer;
};
[Exposed=Window]
dictionary OfflineAudioCompletionEventInit : EventInit {
    required AudioBuffer renderedBuffer;
};
 */
