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

/*
dictionary AudioBufferOptions {
             unsigned long numberOfChannels = 1;
    required unsigned long length;
    required float         sampleRate;
};
dictionary AudioNodeOptions {
    unsigned long         channelCount;
    ChannelCountMode      channelCountMode;
    ChannelInterpretation channelInterpretation;
};
dictionary AnalyserOptions : AudioNodeOptions {
    unsigned long fftSize = 2048;
    double        maxDecibels = -30;
    double        minDecibels = -100;
    double        smoothingTimeConstant = 0.8;
};
dictionary AudioBufferSourceOptions {
    AudioBuffer? buffer;
    float        detune = 0;
    boolean      loop = false;
    double       loopEnd = 0;
    double       loopStart = 0;
    float        playbackRate = 1;
};
dictionary BiquadFilterOptions : AudioNodeOptions {
    BiquadFilterType type = "lowpass";
    float            Q = 1;
    float            detune = 0;
    float            frequency = 350;
    float            gain = 0;
};
dictionary ChannelMergerOptions : AudioNodeOptions {
    unsigned long numberOfInputs = 6;
};
dictionary ChannelSplitterOptions : AudioNodeOptions {
    unsigned long numberOfOutputs = 6;
};
dictionary ConstantSourceOptions {
    float offset = 1;
};
dictionary ConvolverOptions : AudioNodeOptions {
    AudioBuffer? buffer;
    boolean      disableNormalization = false;
};
dictionary DelayOptions : AudioNodeOptions {
    double maxDelayTime = 1;
    double delayTime = 0;
};
dictionary DynamicsCompressorOptions : AudioNodeOptions {
    float attack = 0.003;
    float knee = 30;
    float ratio = 12;
    float release = 0.25;
    float threshold = -24;
};
dictionary GainOptions : AudioNodeOptions {
    float gain = 1;
};
dictionary IIRFilterOptions : AudioNodeOptions {
    required sequence<double> feedforward;
    required sequence<double> feedback;
};
dictionary MediaElementAudioSourceOptions {
    required HTMLMediaElement mediaElement;
};
[Exposed=Window]
interface AudioParamMap {
    readonly maplike<DOMString, AudioParam>;
};
[Exposed=Window,
 SecureContext,
 Constructor(BaseAudioContext context, optional AudioWorkletOptions options)]
interface AudioWorkletNode : AudioNode {
    readonly attribute AudioParamMap              parameters;
    readonly attribute MessagePort                port;
    readonly attribute AudioWorkletProcessorState processorState;
             attribute EventHandler               onprocessorstatechange;
};
[Exposed=AudioWorklet,
 Constructor(optional AudioWorkletOptions options)]
interface AudioWorkletProcessor {
    readonly attribute MessagePort port;
};
dictionary MediaStreamAudioSourceOptions {
    required MediaStream mediaStream;
};
dictionary MediaStreamTrackAudioSourceOptions {
    required MediaStreamTrack mediaStreamTrack;
};
dictionary PannerOptions : AudioNodeOptions {
    PanningModelType  panningModel = "equalpower";
    DistanceModelType distanceModel = "inverse";
    float             positionX = 0;
    float             positionY = 0;
    float             positionZ = 0;
    float             orientationX = 1;
    float             orientationY = 0;
    float             orientationZ = 0;
    double            refDistance = 1;
    double            maxDistance = 10000;
    double            rolloffFactor = 1;
    double            coneInnerAngle = 360;
    double            coneOuterAngle = 360;
    double            coneOuterGain = 0;
};
dictionary OscillatorOptions : AudioNodeOptions {
    OscillatorType type = "sine";
    float          frequency = 440;
    float          detune = 0;
    PeriodicWave   periodicWave;
};
dictionary PeriodicWaveOptions : PeriodicWaveConstraints {
    sequence<float> real;
    sequence<float> imag;
};
dictionary StereoPannerOptions : AudioNodeOptions {
    float pan = 0;
};
dictionary WaveShaperOptions : AudioNodeOptions {
    sequence<float> curve;
    OverSampleType  oversample = "none";
};
dictionary AudioWorkletNodeOptions : AudioNodeOptions {
    unsigned long             numberOfInputs = 1;
    unsigned long             numberOfOutputs = 1;
    sequence<unsigned long>   outputChannelCount;
    record<DOMString, double> parameterData;
};
 */
