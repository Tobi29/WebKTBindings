/*
 * Copyright 2012-2019 Tobi29
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

package net.gitout.ktbindings.glfw

import net.gitout.ktbindings.utils.ByteReadBuffer
import net.gitout.ktbindings.utils.FloatReadBuffer

typealias Codepoint = Int

expect class GLFWMonitor

expect class GLFWMonitorBuffer

expect val GLFWMonitorBuffer.size: Int
expect operator fun GLFWMonitorBuffer.get(index: Int): GLFWMonitor

expect val GLFWMonitor_EMPTY: GLFWMonitor

expect class GLFWWindow

expect val GLFWWindow_EMPTY: GLFWWindow

expect class GLFWVidMode

expect val GLFWVidMode.width: Int
expect val GLFWVidMode.height: Int
expect val GLFWVidMode.refreshRate: Int

expect class GLFWVidModeBuffer
expect val GLFWVidModeBuffer.size: Int
expect operator fun GLFWVidModeBuffer.get(index: Int): GLFWVidMode

expect class GLFWGammaRamp

expect class GLFWGamepadState

expect fun GLFWGamepadState(): GLFWGamepadState
expect val GLFWGamepadState.axes: FloatReadBuffer
expect val GLFWGamepadState.buttons: ByteReadBuffer
expect fun GLFWGamepadState.close()

expect class GLFWImage
expect class GLFWImageBuffer
expect val GLFWImageBuffer.size: Int
expect operator fun GLFWImageBuffer.get(index: Int): GLFWImage


expect class GLFWCursor

expect val GLFWCursor_EMPTY: GLFWCursor

expect class GLFWCharCallback {
    fun close()
}

expect fun GLFWCharCallback(
    callback: (GLFWWindow, Codepoint) -> Unit
): GLFWCharCallback

expect class GLFWCharModsCallback {
    fun close()
}

expect fun GLFWCharModsCallback(
    callback: (GLFWWindow, Codepoint, Int) -> Unit
): GLFWCharModsCallback

expect class GLFWCursorEnterCallback {
    fun close()
}

expect fun GLFWCursorEnterCallback(
    callback: (GLFWWindow, Boolean) -> Unit
): GLFWCursorEnterCallback

expect class GLFWCursorPosCallback {
    fun close()
}

expect fun GLFWCursorPosCallback(
    callback: (GLFWWindow, Double, Double) -> Unit
): GLFWCursorPosCallback

expect class GLFWDropCallback {
    fun close()
}

expect fun GLFWDropCallback(
    callback: (GLFWWindow, Int, Long) -> Unit
): GLFWDropCallback

expect class GLFWErrorCallback {
    fun close()
}

expect fun GLFWErrorCallback(
    callback: (Int, Long) -> Unit
): GLFWErrorCallback

expect class GLFWFramebufferSizeCallback {
    fun close()
}

expect fun GLFWFramebufferSizeCallback(
    callback: (GLFWWindow, Int, Int) -> Unit
): GLFWFramebufferSizeCallback

expect class GLFWJoystickCallback {
    fun close()
}

expect fun GLFWJoystickCallback(
    callback: (Int, Int) -> Unit
): GLFWJoystickCallback

expect class GLFWKeyCallback {
    fun close()
}

expect fun GLFWKeyCallback(
    callback: (GLFWWindow, Int, Int, Int, Int) -> Unit
): GLFWKeyCallback

expect class GLFWMonitorCallback {
    fun close()
}

expect fun GLFWMonitorCallback(
    callback: (GLFWMonitor, Int) -> Unit
): GLFWMonitorCallback

expect class GLFWMouseButtonCallback {
    fun close()
}

expect fun GLFWMouseButtonCallback(
    callback: (GLFWWindow, Int, Int, Int) -> Unit
): GLFWMouseButtonCallback

expect class GLFWScrollCallback {
    fun close()
}

expect fun GLFWScrollCallback(
    callback: (GLFWWindow, Double, Double) -> Unit
): GLFWScrollCallback

expect class GLFWWindowCloseCallback {
    fun close()
}

expect fun GLFWWindowCloseCallback(
    callback: (GLFWWindow) -> Unit
): GLFWWindowCloseCallback

expect class GLFWWindowContentScaleCallback {
    fun close()
}

expect fun GLFWWindowContentScaleCallback(
    callback: (GLFWWindow, Float, Float) -> Unit
): GLFWWindowContentScaleCallback

expect class GLFWWindowFocusCallback {
    fun close()
}

expect fun GLFWWindowFocusCallback(
    callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowFocusCallback

expect class GLFWWindowIconifyCallback {
    fun close()
}

expect fun GLFWWindowIconifyCallback(
    callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowIconifyCallback

expect class GLFWWindowMaximizeCallback {
    fun close()
}

expect fun GLFWWindowMaximizeCallback(
    callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowMaximizeCallback

expect class GLFWWindowPosCallback {
    fun close()
}

expect fun GLFWWindowPosCallback(
    callback: (GLFWWindow, Int, Int) -> Unit
): GLFWWindowPosCallback

expect class GLFWWindowRefreshCallback {
    fun close()
}

expect fun GLFWWindowRefreshCallback(
    callback: (GLFWWindow) -> Unit
): GLFWWindowRefreshCallback

expect class GLFWWindowSizeCallback {
    fun close()
}

expect fun GLFWWindowSizeCallback(
    callback: (GLFWWindow, Int, Int) -> Unit
): GLFWWindowSizeCallback
