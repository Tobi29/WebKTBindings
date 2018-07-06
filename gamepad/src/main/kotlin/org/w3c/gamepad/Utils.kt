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

import org.w3c.dom.Navigator
import org.w3c.dom.Window
import kotlin.browser.window

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
    window.asDynamic().GamepadEvent !== undefined -> standard()
    window.asDynamic().WebKitGamepadEvent !== undefined -> webkit()
    else -> unknown()
}
