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
import org.khronos.webgl.Uint8Array
import org.w3c.dom.HTMLMediaElement
import org.w3c.media.MediaStream

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional AnalyserOptions options)]
interface AnalyserNode : AudioNode {
    void getFloatFrequencyData(Float32Array array);
    void getByteFrequencyData(Uint8Array array);
    void getFloatTimeDomainData(Float32Array array);
    void getByteTimeDomainData(Uint8Array array);
             attribute unsigned long fftSize;
    readonly attribute unsigned long frequencyBinCount;
             attribute double        minDecibels;
             attribute double        maxDecibels;
             attribute double        smoothingTimeConstant;
};
 */
/**
 * Exposes the JavaScript [AnalyserNode](https://developer.mozilla.org/en/docs/Web/API/AnalyserNode) to Kotlin
 */
external class AnalyserNode(
        context: BaseAudioContext,
        options: dynamic /* AnalyserOptions */ = definedExternally
) : AudioNode {
    var fftSize: Int
    val frequencyBinCount: Int
    var minDecibels: Double
    var maxDecibels: Double
    var smoothingTimeConstant: Double

    fun getFloatFrequencyData(array: Float32Array)
    fun getByteFrequencyData(array: Uint8Array)
    fun getFloatTimeDomainData(array: Float32Array)
    fun getByteTimeDomainData(array: Uint8Array)
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional AudioBufferSourceOptions options)]
interface AudioBufferSourceNode : AudioScheduledSourceNode {
             attribute AudioBuffer? buffer;
    readonly attribute AudioParam   playbackRate;
    readonly attribute AudioParam   detune;
             attribute boolean      loop;
             attribute double       loopStart;
             attribute double       loopEnd;
    void start(optional double when = 0,
               optional double offset,
               optional double duration);
    void stop(optional double when = 0);
};
 */
/**
 * Exposes the JavaScript [AudioBufferSourceNode](https://developer.mozilla.org/en/docs/Web/API/AudioBufferSourceNode) to Kotlin
 */
external class AudioBufferSourceNode(
        context: BaseAudioContext,
        options: dynamic /* AudioBufferSourceOptions */ = definedExternally
) : AudioScheduledSourceNode {
    var buffer: AudioBuffer?
    val playbackRate: AudioParam
    val detune: AudioParam
    var loop: Boolean
    var loopStart: Double
    var loopEnd: Double

    fun start(`when`: Double = definedExternally,
              offset: Double = definedExternally,
              duration: Double = definedExternally)
}

/*
[Exposed=Window]
interface AudioDestinationNode : AudioNode {
    readonly attribute unsigned long maxChannelCount;
};
 */
/**
 * Exposes the JavaScript [AudioDestinationNode](https://developer.mozilla.org/en/docs/Web/API/AudioDestinationNode) to Kotlin
 */
external abstract class AudioDestinationNode : AudioNode {
    val maxChannelCount: Int
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional BiquadFilterOptions options)]
interface BiquadFilterNode : AudioNode {
             attribute BiquadFilterType type;
    readonly attribute AudioParam       frequency;
    readonly attribute AudioParam       detune;
    readonly attribute AudioParam       Q;
    readonly attribute AudioParam       gain;
    void getFrequencyResponse(Float32Array frequencyHz,
                              Float32Array magResponse,
                              Float32Array phaseResponse);
};
 */
/**
 * Exposes the JavaScript [BiquadFilterNode](https://developer.mozilla.org/en/docs/Web/API/BiquadFilterNode) to Kotlin
 */
external class BiquadFilterNode(
        context: BaseAudioContext,
        options: dynamic /* BiquadFilterOptions */ = definedExternally
) : AudioNode {
    var type: String
    val frequency: AudioParam
    val detune: AudioParam
    val Q: AudioParam
    val gain: AudioParam

    fun getFrequencyResponse(frequencyHz: Float32Array,
                             magResponse: Float32Array,
                             phaseResponse: Float32Array)
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional ChannelMergerOptions options)]
interface ChannelMergerNode : AudioNode {
};
 */
/**
 * Exposes the JavaScript [ChannelMergerNode](https://developer.mozilla.org/en/docs/Web/API/ChannelMergerNode) to Kotlin
 */
external class ChannelMergerNode(
        context: BaseAudioContext,
        options: dynamic /* ChannelMergerOptions */ = definedExternally
) : AudioNode

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional ChannelSplitterNode options)]
interface ChannelSplitterNode : AudioNode {
};
 */
/**
 * Exposes the JavaScript [ChannelSplitterNode](https://developer.mozilla.org/en/docs/Web/API/ChannelSplitterNode) to Kotlin
 */
external class ChannelSplitterNode(
        context: BaseAudioContext,
        options: dynamic /* ChannelSplitterOptions */ = definedExternally
) : AudioNode

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional ConstantSourceOptions options)]
interface ConstantSourceNode : AudioScheduledSourceNode {
    readonly attribute AudioParam offset;
};
 */
/**
 * Exposes the JavaScript [ConstantSourceNode](https://developer.mozilla.org/en/docs/Web/API/ConstantSourceNode) to Kotlin
 */
external class ConstantSourceNode(
        context: BaseAudioContext,
        options: dynamic /* ConstantSourceOptions */ = definedExternally
) : AudioScheduledSourceNode {
    val offset: AudioParam

    fun start(`when`: Double = definedExternally,
              offset: Double = definedExternally,
              duration: Double = definedExternally)
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional ConvolverOptions options)]
interface ConvolverNode : AudioNode {
    attribute AudioBuffer? buffer;
    attribute boolean      normalize;
};
 */
/**
 * Exposes the JavaScript [ConvolverNode](https://developer.mozilla.org/en/docs/Web/API/ConvolverNode) to Kotlin
 */
external class ConvolverNode(
        context: BaseAudioContext,
        options: dynamic /* ConvolverOptions */ = definedExternally
) : AudioNode {
    var buffer: AudioBuffer?
    var normalize: Boolean
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional DelayOptions options)]
interface DelayNode : AudioNode {
    readonly attribute AudioParam delayTime;
};
 */
/**
 * Exposes the JavaScript [DelayNode](https://developer.mozilla.org/en/docs/Web/API/DelayNode) to Kotlin
 */
external class DelayNode(
        context: BaseAudioContext,
        options: dynamic /* DelayOptions */ = definedExternally
) : AudioNode {
    val delayTime: AudioParam
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional DynamicsCompressorOptions options)]
interface DynamicsCompressorNode : AudioNode {
    readonly attribute AudioParam threshold;
    readonly attribute AudioParam knee;
    readonly attribute AudioParam ratio;
    readonly attribute float      reduction;
    readonly attribute AudioParam attack;
    readonly attribute AudioParam release;
};
 */
/**
 * Exposes the JavaScript [DynamicsCompressorNode](https://developer.mozilla.org/en/docs/Web/API/DynamicsCompressorNode) to Kotlin
 */
external class DynamicsCompressorNode(
        context: BaseAudioContext,
        options: dynamic /* DynamicsCompressorOptions */ = definedExternally
) : AudioNode {
    val threshold: AudioParam
    val knee: AudioParam
    val ratio: AudioParam
    val reduction: Double
    val attack: AudioParam
    val release: AudioParam
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional GainOptions options)]
interface GainNode : AudioNode {
    readonly attribute AudioParam gain;
};
*/
/**
 * Exposes the JavaScript [GainNode](https://developer.mozilla.org/en/docs/Web/API/GainNode) to Kotlin
 */
external class GainNode(
        context: BaseAudioContext,
        options: dynamic /* GainOptions */ = definedExternally
) : AudioNode {
    val gain: AudioParam
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, IIRFilterOptions options)]
interface IIRFilterNode : AudioNode {
    void getFrequencyResponse(Float32Array frequencyHz,
                              Float32Array magResponse,
                              Float32Array phaseResponse);
};
*/
/**
 * Exposes the JavaScript [IIRFilterNode](https://developer.mozilla.org/en/docs/Web/API/IIRFilterNode) to Kotlin
 */
external class IIRFilterNode(
        context: BaseAudioContext,
        options: dynamic /* IIRFilterOptions */
) : AudioNode {
    fun getFrequencyResponse(frequencyHz: Float32Array,
                             magResponse: Float32Array,
                             phaseResponse: Float32Array)
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, MediaElementAudioSourceOptions options)]
interface MediaElementAudioSourceNode : AudioNode {
    [SameObject]
    readonly attribute HTMLMediaElement mediaElement;
};
*/
/**
 * Exposes the JavaScript [MediaElementAudioSourceNode](https://developer.mozilla.org/en/docs/Web/API/MediaElementAudioSourceNode) to Kotlin
 */
external class MediaElementAudioSourceNode(
        context: BaseAudioContext,
        options: dynamic /* MediaElementAudioSourceOptions */
) : AudioNode {
    val mediaElement: HTMLMediaElement
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional AudioNodeOptions options)]
interface MediaStreamAudioDestinationNode : AudioNode {
    readonly attribute MediaStream stream;
};
*/
/**
 * Exposes the JavaScript [MediaStreamAudioDestinationNode](https://developer.mozilla.org/en/docs/Web/API/MediaStreamAudioDestinationNode) to Kotlin
 */
external class MediaStreamAudioDestinationNode(
        context: BaseAudioContext,
        options: dynamic /* AudioNodeOptions */
) : AudioNode {
    val stream: MediaStream
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, MediaStreamAudioSourceOptions options)]
interface MediaStreamAudioSourceNode : AudioNode {
    [SameObject]
    readonly attribute MediaStream mediaStream;
};
*/
/**
 * Exposes the JavaScript [MediaStreamAudioSourceNode](https://developer.mozilla.org/en/docs/Web/API/MediaStreamAudioSourceNode) to Kotlin
 */
external class MediaStreamAudioSourceNode(
        context: BaseAudioContext,
        options: dynamic /* MediaStreamAudioSourceOptions */
) : AudioNode {
    val mediaStream: MediaStream
}

/*
[Exposed=Window,
 Constructor(AudioContext context, MediaStreamTrackAudioSourceOptions options)]
interface MediaStreamTrackAudioSourceNode : AudioNode {
};
*/
/**
 * Exposes the JavaScript [MediaStreamTrackAudioSourceNode](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrackAudioSourceNode) to Kotlin
 */
external class MediaStreamTrackAudioSourceNode(
        context: BaseAudioContext,
        options: dynamic /* MediaStreamTrackAudioSourceOptions */
) : AudioNode

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional OscillatorOptions options)]
interface OscillatorNode : AudioScheduledSourceNode {
             attribute OscillatorType type;
    readonly attribute AudioParam     frequency;
    readonly attribute AudioParam     detune;
    void setPeriodicWave(PeriodicWave periodicWave);
};
*/
/**
 * Exposes the JavaScript [OscillatorNode](https://developer.mozilla.org/en/docs/Web/API/OscillatorNode) to Kotlin
 */
external class OscillatorNode(
        context: BaseAudioContext,
        options: dynamic /* OscillatorOptions */ = definedExternally
) : AudioScheduledSourceNode {
    var type: String
    val frequency: AudioParam
    val detune: AudioParam

    fun setPeriodicWave(periodicWave: PeriodicWave)
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional PannerOptions options)]
interface PannerNode : AudioNode {
             attribute PanningModelType  panningModel;
    readonly attribute AudioParam        positionX;
    readonly attribute AudioParam        positionY;
    readonly attribute AudioParam        positionZ;
    readonly attribute AudioParam        orientationX;
    readonly attribute AudioParam        orientationY;
    readonly attribute AudioParam        orientationZ;
             attribute DistanceModelType distanceModel;
             attribute double            refDistance;
             attribute double            maxDistance;
             attribute double            rolloffFactor;
             attribute double            coneInnerAngle;
             attribute double            coneOuterAngle;
             attribute double            coneOuterGain;
    void setPosition(float x, float y, float z);
    void setOrientation(float x, float y, float z);
};
*/
/**
 * Exposes the JavaScript [PannerNode](https://developer.mozilla.org/en/docs/Web/API/PannerNode) to Kotlin
 */
external class PannerNode(
        context: BaseAudioContext,
        options: dynamic /* PannerOptions */ = definedExternally
) : AudioNode {
    var panningModel: String
    val positionX: AudioParam
    val positionY: AudioParam
    val positionZ: AudioParam
    val orientationX: AudioParam
    val orientationY: AudioParam
    val orientationZ: AudioParam
    var distanceModel: String
    var refDistance: Double
    var maxDistance: Double
    var rolloffFactor: Double
    var coneInnerAngle: Double
    var coneOuterAngle: Double
    var coneOuterGain: Double
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional StereoPannerOptions options)]
interface StereoPannerNode : AudioNode {
    readonly attribute AudioParam pan;
};
 */
/**
 * Exposes the JavaScript [StereoPannerNode](https://developer.mozilla.org/en/docs/Web/API/StereoPannerNode) to Kotlin
 */
external class StereoPannerNode(
        context: BaseAudioContext,
        options: dynamic /* StereoPannerOptions */ = definedExternally
) : AudioNode {
    val pan: AudioParam
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional WaveShaperOptions options)]
interface WaveShaperNode : AudioNode {
    attribute Float32Array?  curve;
    attribute OverSampleType oversample;
};
 */
/**
 * Exposes the JavaScript [WaveShaperNode](https://developer.mozilla.org/en/docs/Web/API/WaveShaperNode) to Kotlin
 */
external class WaveShaperNode(
        context: BaseAudioContext,
        options: dynamic /* WaveShaperOptions */ = definedExternally
) : AudioNode {
    var curve: Float32Array?
    var oversample: String
}
