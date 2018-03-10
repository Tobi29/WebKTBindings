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

package org.w3c.gamepad

import org.khronos.webgl.Float32Array
import org.w3c.dom.Navigator
import org.w3c.dom.Window
import org.w3c.dom.events.Event
import kotlin.browser.window
import kotlin.js.Promise

/**
 * Exposes the JavaScript [Gamepad](https://developer.mozilla.org/en/docs/Web/API/Gamepad) to Kotlin
 */
external interface Gamepad {
    val displayId: dynamic
    val id: String
    val index: Int
    val mapping: String
    val connected: Boolean
    val buttons: Array<GamepadButton>
    val axes: Array<Double>
    val timestamp: Double
    val hand: GamepadHand
    val hapticActuators: GamepadHapticActuator
    val pose: GamepadPose
}

/**
 * Exposes the JavaScript [GamepadButton](https://developer.mozilla.org/en/docs/Web/API/GamepadButton) to Kotlin
 */
external interface GamepadButton {
    val value: Double
    val pressed: Boolean
}

/**
 * Exposes the JavaScript [GamepadEvent](https://developer.mozilla.org/en/docs/Web/API/GamepadEvent) to Kotlin
 */
abstract external class GamepadEvent : Event {
    val gamepad: Gamepad
}

/**
 * Exposes the JavaScript [GamepadHapticActuator](https://developer.mozilla.org/en/docs/Web/API/GamepadHapticActuator) to Kotlin
 */
external interface GamepadHapticActuator {
    val type: GamepadHapticActuatorType
    fun pulse(value: Double, duration: Double): Promise<Boolean>
}

/**
 * Exposes the JavaScript [GamepadPose](https://developer.mozilla.org/en/docs/Web/API/GamepadPose) to Kotlin
 */
external interface GamepadPose {
    val hasOrientation: Boolean
    val hasPosition: Boolean
    val position: Float32Array?
    val linearVelocity: Float32Array?
    val linearAcceleration: Float32Array?
    val orientation: Float32Array?
    val angularVelocity: Float32Array?
    val angularAcceleration: Float32Array?
}

/**
 * GamepadHand enum, might be `"left"`, `"right"` or `""`
 */
typealias GamepadHand = String

/**
 * GamepadHapticActuatorType enum, might be `"vibration"`
 */
typealias GamepadHapticActuatorType = String

inline fun Navigator.getGamepads(): Array<Gamepad?>? =
    @Suppress("UnsafeCastFromDynamic")
    compatMode(
        standard = { asDynamic().getGamepads() },
        webkit = { asDynamic().webkitGetGamepads() },
        unknown = { null }
    )

inline val eventGamepadconnected: String?
    get() = compatMode(
        standard = { "gamepadconnected" },
        webkit = { "webkitgamepadconnected" },
        unknown = { null }
    )

inline val eventGamepaddisconnected: String?
    get() = compatMode(
        standard = { "gamepaddisconnected" },
        webkit = { "webkitgamepaddisconnected" },
        unknown = { null }
    )

inline var Window.ongamepadconnected: ((GamepadEvent) -> dynamic)?
    @Suppress("UnsafeCastFromDynamic")
    get() = asDynamic().ongamepadconnected
    set(value) {
        asDynamic().ongamepadconnected = value
    }

inline var Window.ongamepaddisconnected: ((GamepadEvent) -> dynamic)?
    @Suppress("UnsafeCastFromDynamic")
    get() = asDynamic().ongamepaddisconnected
    set(value) {
        asDynamic().ongamepaddisconnected = value
    }

@PublishedApi
internal inline fun <R> compatMode(
    standard: () -> R,
    webkit: () -> R,
    unknown: () -> R
) = when {
    window.asDynamic().GamepadEvent != undefined -> standard()
    window.asDynamic().WebKitGamepadEvent != undefined -> webkit()
    else -> unknown()
}
