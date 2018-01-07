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

external interface AudioNodeOrParam

/*
dictionary AudioParamDescriptor {
    required DOMString name;
             float     defaultValue = 0;
             float     minValue = -3.4028235e+38;
             float     maxValue = 3.4028235e+38;
};
 */

/*
[Exposed=Window]
interface AudioParam {
             attribute float value;
    readonly attribute float defaultValue;
    readonly attribute float minValue;
    readonly attribute float maxValue;
    AudioParam setValueAtTime(float value, double startTime);
    AudioParam linearRampToValueAtTime(float value, double endTime);
    AudioParam exponentialRampToValueAtTime(float value, double endTime);
    AudioParam setTargetAtTime(float target,
                               double startTime,
                               float timeConstant);
    AudioParam setValueCurveAtTime(sequence<float> values,
                                   double startTime,
                                   double duration);
    AudioParam cancelScheduledValues(double cancelTime);
    AudioParam cancelAndHoldAtTime(double cancelTime);
};
 */
/**
 * Exposes the JavaScript [AudioParam](https://developer.mozilla.org/en/docs/Web/API/AudioParam) to Kotlin
 */
external interface AudioParam : AudioNodeOrParam {
    val defaultValue: Double
    val maxValue: Double
    val minValue: Double
    var value: Double

    fun setValueAtTime(value: Double,
                       startTime: Double): AudioParam

    fun linearRampToValueAtTime(value: Double,
                                endTime: Double): AudioParam

    fun exponentialRampToValueAtTime(value: Double,
                                     endTime: Double): AudioParam

    fun setTargetAtTime(target: Double,
                        startTime: Double,
                        timeConstant: Double): AudioParam

    fun setCurveAtTime(value: Float32Array,
                       startTime: Double,
                       duration: Double): AudioParam

    fun cancelScheduledValues(startTime: Double): AudioParam

    fun cancelAndHoldAtTime(cancelTime: Double): AudioParam
}

/*
[Exposed=Window]
dictionary AudioTimestamp {
    double              contextTime;
    DOMHighResTimeStamp performanceTime;
};
 */
/**
 * Exposes the JavaScript AudioTimestamp
 * @see AudioContext.getOutputTimestamp
 */
external interface AudioTimestamp {
    val contextTime: Double
    val performanceTime: Double
}

/*
[Exposed=Window]
interface AudioListener {
    readonly attribute AudioParam positionX;
    readonly attribute AudioParam positionY;
    readonly attribute AudioParam positionZ;
    readonly attribute AudioParam forwardX;
    readonly attribute AudioParam forwardY;
    readonly attribute AudioParam forwardZ;
    readonly attribute AudioParam upX;
    readonly attribute AudioParam upY;
    readonly attribute AudioParam upZ;
    void setPosition(float x, float y, float z);
    void setOrientation(float x,
                        float y,
                        float z,
                        float xUp,
                        float yUp,
                        float zUp);
};
 */
/**
 * Exposes the JavaScript [AudioListener](https://developer.mozilla.org/en/docs/Web/API/AudioListener) to Kotlin
 */
external abstract class AudioListener : AudioNode {
    val positionX: AudioParam
    val positionY: AudioParam
    val positionZ: AudioParam
    val forwardX: AudioParam
    val forwardY: AudioParam
    val forwardZ: AudioParam
    val upX: AudioParam
    val upY: AudioParam
    val upZ: AudioParam
}

/*
[Exposed=Window,
 Constructor(BaseAudioContext context, optional PeriodicWaveOptions options)]
interface PeriodicWave {
};
 */
external class PeriodicWave(
        context: BaseAudioContext,
        options: dynamic /* PeriodicWaveOptions */ = definedExternally
)

/*
dictionary PeriodicWaveConstraints {
    boolean disableNormalization = false;
};
*/
