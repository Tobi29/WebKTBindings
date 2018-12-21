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

@file:JvmName("TypesJVMKt")
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package net.gitout.ktbindings.glfw

import net.gitout.ktbindings.utils.ByteReadBuffer
import net.gitout.ktbindings.utils.FloatReadBuffer
import org.lwjgl.PointerBuffer
import org.lwjgl.glfw.GLFWCharCallback
import org.lwjgl.glfw.GLFWCharModsCallback
import org.lwjgl.glfw.GLFWCursorEnterCallback
import org.lwjgl.glfw.GLFWCursorPosCallback
import org.lwjgl.glfw.GLFWDropCallback
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.glfw.GLFWFramebufferSizeCallback
import org.lwjgl.glfw.GLFWJoystickCallback
import org.lwjgl.glfw.GLFWKeyCallback
import org.lwjgl.glfw.GLFWMonitorCallback
import org.lwjgl.glfw.GLFWMouseButtonCallback
import org.lwjgl.glfw.GLFWScrollCallback
import org.lwjgl.glfw.GLFWWindowCloseCallback
import org.lwjgl.glfw.GLFWWindowContentScaleCallback
import org.lwjgl.glfw.GLFWWindowFocusCallback
import org.lwjgl.glfw.GLFWWindowIconifyCallback
import org.lwjgl.glfw.GLFWWindowMaximizeCallback
import org.lwjgl.glfw.GLFWWindowPosCallback
import org.lwjgl.glfw.GLFWWindowRefreshCallback
import org.lwjgl.glfw.GLFWWindowSizeCallback

actual typealias GLFWMonitor = Long
actual typealias GLFWMonitorBuffer = PointerBuffer

actual inline val GLFWMonitorBuffer.size get() = remaining()
actual inline operator fun GLFWMonitorBuffer.get(index: Int) =
    get(position() + index)

actual inline val GLFWMonitor_EMPTY: GLFWMonitor get() = 0L

actual typealias GLFWWindow = Long

actual inline val GLFWWindow_EMPTY: GLFWWindow get() = 0L

actual typealias GLFWVidMode = org.lwjgl.glfw.GLFWVidMode

actual inline val GLFWVidMode.width get() = width()
actual inline val GLFWVidMode.height get() = height()
actual inline val GLFWVidMode.refreshRate get() = refreshRate()

actual typealias GLFWVidModeBuffer = org.lwjgl.glfw.GLFWVidMode.Buffer

actual inline val GLFWVidModeBuffer.size get() = remaining()
actual inline operator fun GLFWVidModeBuffer.get(index: Int) =
    get(position() + index)

actual typealias GLFWGammaRamp = org.lwjgl.glfw.GLFWGammaRamp

actual typealias GLFWGamepadState = org.lwjgl.glfw.GLFWGamepadState

actual inline fun GLFWGamepadState() = GLFWGamepadState.create()
actual inline val GLFWGamepadState.axes: FloatReadBuffer
    get() = FloatReadBuffer(axes())
actual inline val GLFWGamepadState.buttons: ByteReadBuffer
    get() = ByteReadBuffer(buttons())

actual inline fun GLFWGamepadState.close() = close()

actual typealias GLFWImage = org.lwjgl.glfw.GLFWImage
actual typealias GLFWImageBuffer = org.lwjgl.glfw.GLFWImage.Buffer

actual inline val GLFWImageBuffer.size get() = remaining()
actual inline operator fun GLFWImageBuffer.get(index: Int) =
    get(position() + index)

actual typealias GLFWCursor = Long

actual inline val GLFWCursor_EMPTY: GLFWCursor get() = 0L

actual typealias GLFWCharCallback = GLFWCharCallback

actual inline fun GLFWCharCallback(
    noinline callback: (GLFWWindow, Codepoint) -> Unit
): GLFWCharCallback = GLFWCharCallback.create(callback)

actual typealias GLFWCharModsCallback = GLFWCharModsCallback

actual inline fun GLFWCharModsCallback(
    noinline callback: (GLFWWindow, Codepoint, Int) -> Unit
): GLFWCharModsCallback = GLFWCharModsCallback.create(callback)

actual typealias GLFWCursorEnterCallback = GLFWCursorEnterCallback

actual inline fun GLFWCursorEnterCallback(
    noinline callback: (GLFWWindow, Boolean) -> Unit
): GLFWCursorEnterCallback = GLFWCursorEnterCallback.create(callback)

actual typealias GLFWCursorPosCallback = GLFWCursorPosCallback

actual inline fun GLFWCursorPosCallback(
    noinline callback: (GLFWWindow, Double, Double) -> Unit
): GLFWCursorPosCallback = GLFWCursorPosCallback.create(callback)

actual typealias GLFWDropCallback = GLFWDropCallback

actual inline fun GLFWDropCallback(
    noinline callback: (GLFWWindow, Int, Long) -> Unit
): GLFWDropCallback = GLFWDropCallback.create(callback)

actual typealias GLFWErrorCallback = GLFWErrorCallback

actual inline fun GLFWErrorCallback(
    noinline callback: (Int, Long) -> Unit
): GLFWErrorCallback = GLFWErrorCallback.create(callback)

actual typealias GLFWFramebufferSizeCallback = GLFWFramebufferSizeCallback

actual inline fun GLFWFramebufferSizeCallback(
    noinline callback: (GLFWWindow, Int, Int) -> Unit
): GLFWFramebufferSizeCallback = GLFWFramebufferSizeCallback.create(callback)

actual typealias GLFWJoystickCallback = GLFWJoystickCallback

actual inline fun GLFWJoystickCallback(
    noinline callback: (Int, Int) -> Unit
): GLFWJoystickCallback = GLFWJoystickCallback.create(callback)

actual typealias GLFWKeyCallback = GLFWKeyCallback

actual inline fun GLFWKeyCallback(
    noinline callback: (GLFWWindow, Int, Int, Int, Int) -> Unit
): GLFWKeyCallback = GLFWKeyCallback.create(callback)

actual typealias GLFWMonitorCallback = GLFWMonitorCallback

actual inline fun GLFWMonitorCallback(
    noinline callback: (GLFWMonitor, Int) -> Unit
): GLFWMonitorCallback = GLFWMonitorCallback.create(callback)

actual typealias GLFWMouseButtonCallback = GLFWMouseButtonCallback

actual inline fun GLFWMouseButtonCallback(
    noinline callback: (GLFWWindow, Int, Int, Int) -> Unit
): GLFWMouseButtonCallback = GLFWMouseButtonCallback.create(callback)

actual typealias GLFWScrollCallback = GLFWScrollCallback

actual inline fun GLFWScrollCallback(
    noinline callback: (GLFWWindow, Double, Double) -> Unit
): GLFWScrollCallback = GLFWScrollCallback.create(callback)

actual typealias GLFWWindowCloseCallback = GLFWWindowCloseCallback

actual inline fun GLFWWindowCloseCallback(
    noinline callback: (GLFWWindow) -> Unit
): GLFWWindowCloseCallback = GLFWWindowCloseCallback.create(callback)

actual typealias GLFWWindowContentScaleCallback = GLFWWindowContentScaleCallback

actual inline fun GLFWWindowContentScaleCallback(
    noinline callback: (GLFWWindow, Float, Float) -> Unit
): GLFWWindowContentScaleCallback =
    GLFWWindowContentScaleCallback.create(callback)

actual typealias GLFWWindowFocusCallback = GLFWWindowFocusCallback

actual inline fun GLFWWindowFocusCallback(
    noinline callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowFocusCallback = GLFWWindowFocusCallback.create(callback)

actual typealias GLFWWindowIconifyCallback = GLFWWindowIconifyCallback

actual inline fun GLFWWindowIconifyCallback(
    noinline callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowIconifyCallback = GLFWWindowIconifyCallback.create(callback)

actual typealias GLFWWindowMaximizeCallback = GLFWWindowMaximizeCallback

actual inline fun GLFWWindowMaximizeCallback(
    noinline callback: (GLFWWindow, Boolean) -> Unit
): GLFWWindowMaximizeCallback = GLFWWindowMaximizeCallback.create(callback)

actual typealias GLFWWindowPosCallback = GLFWWindowPosCallback

actual inline fun GLFWWindowPosCallback(
    noinline callback: (GLFWWindow, Int, Int) -> Unit
): GLFWWindowPosCallback = GLFWWindowPosCallback.create(callback)

actual typealias GLFWWindowRefreshCallback = GLFWWindowRefreshCallback

actual inline fun GLFWWindowRefreshCallback(
    noinline callback: (GLFWWindow) -> Unit
): GLFWWindowRefreshCallback = GLFWWindowRefreshCallback.create(callback)

actual typealias GLFWWindowSizeCallback = GLFWWindowSizeCallback

actual inline fun GLFWWindowSizeCallback(
    noinline callback: (GLFWWindow, Int, Int) -> Unit
): GLFWWindowSizeCallback = GLFWWindowSizeCallback.create(callback)
