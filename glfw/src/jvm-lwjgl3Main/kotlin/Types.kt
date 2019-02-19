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

@file:JvmName("TypesJVMKt")
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package net.gitout.ktbindings.glfw

import net.gitout.ktbindings.utils.ByteReadBuffer
import net.gitout.ktbindings.utils.FloatReadBuffer
import org.lwjgl.PointerBuffer
import org.lwjgl.glfw.GLFWGamepadState as JGLFWGamepadState
import org.lwjgl.glfw.GLFWGammaRamp as JGLFWGammaRamp
import org.lwjgl.glfw.GLFWImage as JGLFWImage
import org.lwjgl.glfw.GLFWVidMode as JGLFWVidMode

actual typealias GLFWMonitor = Long

actual class GLFWMonitorBuffer(
    @PublishedApi
    internal val struct: PointerBuffer
)

actual inline val GLFWMonitorBuffer.size get() = struct.remaining()

actual inline operator fun GLFWMonitorBuffer.get(index: Int) =
    struct.get(struct.position() + index)

actual inline val GLFWMonitor_EMPTY: GLFWMonitor get() = 0L

actual typealias GLFWWindow = Long

actual inline val GLFWWindow_EMPTY: GLFWWindow get() = 0L

actual class GLFWVidMode(
    @PublishedApi
    internal val struct: JGLFWVidMode
)

actual inline val GLFWVidMode.width get() = struct.width()

actual inline val GLFWVidMode.height get() = struct.height()

actual inline val GLFWVidMode.refreshRate get() = struct.refreshRate()

actual class GLFWVidModeBuffer(
    @PublishedApi
    internal val struct: JGLFWVidMode.Buffer
)

actual inline val GLFWVidModeBuffer.size get() = struct.remaining()

actual inline operator fun GLFWVidModeBuffer.get(index: Int) =
    GLFWVidMode(struct.get(struct.position() + index))

actual class GLFWGammaRamp(
    @PublishedApi
    internal val struct: JGLFWGammaRamp
)

actual class GLFWGamepadState(
    @PublishedApi
    internal val struct: JGLFWGamepadState
)

actual inline fun GLFWGamepadState() =
    GLFWGamepadState(JGLFWGamepadState.create())

actual inline val GLFWGamepadState.axes: FloatReadBuffer
    get() = FloatReadBuffer(struct.axes())

actual inline val GLFWGamepadState.buttons: ByteReadBuffer
    get() = ByteReadBuffer(struct.buttons())

actual inline fun GLFWGamepadState.close() = struct.close()

actual class GLFWImage(
    @PublishedApi
    internal val struct: JGLFWImage
)

actual class GLFWImageBuffer(
    @PublishedApi
    internal val struct: JGLFWImage.Buffer
)

actual inline val GLFWImageBuffer.size get() = struct.remaining()

actual inline operator fun GLFWImageBuffer.get(index: Int) =
    GLFWImage(struct.get(struct.position() + index))

actual typealias GLFWCursor = Long

actual inline val GLFWCursor_EMPTY: GLFWCursor get() = 0L

actual class GLFWCharCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWCharCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWCharCallback(
    crossinline callback: (GLFWWindow, Codepoint) -> Unit
) = GLFWCharCallback(
    org.lwjgl.glfw.GLFWCharCallback.create { window, codepoint ->
        callback(window, codepoint)
    }
)

actual class GLFWCharModsCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWCharModsCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWCharModsCallback(
    crossinline callback: (GLFWWindow, Codepoint, Int) -> Unit
) = GLFWCharModsCallback(
    org.lwjgl.glfw.GLFWCharModsCallback.create { window, codepoint, mods ->
        callback(window, codepoint, mods)
    }
)

actual class GLFWCursorEnterCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWCursorEnterCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWCursorEnterCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWCursorEnterCallback(
    org.lwjgl.glfw.GLFWCursorEnterCallback.create { window, entered ->
        callback(window, entered)
    }
)

actual class GLFWCursorPosCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWCursorPosCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWCursorPosCallback(
    crossinline callback: (GLFWWindow, Double, Double) -> Unit
) = GLFWCursorPosCallback(
    org.lwjgl.glfw.GLFWCursorPosCallback.create { window, xpos, ypos ->
        callback(window, xpos, ypos)
    }
)

actual class GLFWDropCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWDropCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWDropCallback(
    crossinline callback: (GLFWWindow, Int, Long) -> Unit
) = GLFWDropCallback(
    org.lwjgl.glfw.GLFWDropCallback.create { window, count, names ->
        callback(window, count, names)
    }
)

actual class GLFWErrorCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWErrorCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWErrorCallback(
    crossinline callback: (Int, Long) -> Unit
) = GLFWErrorCallback(
    org.lwjgl.glfw.GLFWErrorCallback.create { error, description ->
        callback(error, description)
    }
)

actual class GLFWFramebufferSizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWFramebufferSizeCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWFramebufferSizeCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWFramebufferSizeCallback(
    org.lwjgl.glfw.GLFWFramebufferSizeCallback.create { window, count, names ->
        callback(window, count, names)
    }
)

actual class GLFWJoystickCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWJoystickCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWJoystickCallback(
    crossinline callback: (Int, Int) -> Unit
) = GLFWJoystickCallback(
    org.lwjgl.glfw.GLFWJoystickCallback.create { jid, event ->
        callback(jid, event)
    }
)

actual class GLFWKeyCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWKeyCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWKeyCallback(
    crossinline callback: (GLFWWindow, Int, Int, Int, Int) -> Unit
) = GLFWKeyCallback(
    org.lwjgl.glfw.GLFWKeyCallback.create { window, key, scancode, action, mods ->
        callback(window, key, scancode, action, mods)
    }
)

actual class GLFWMonitorCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWMonitorCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWMonitorCallback(
    crossinline callback: (GLFWMonitor, Int) -> Unit
) = GLFWMonitorCallback(
    org.lwjgl.glfw.GLFWMonitorCallback.create { monitor, event ->
        callback(monitor, event)
    }
)

actual class GLFWMouseButtonCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWMouseButtonCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWMouseButtonCallback(
    crossinline callback: (GLFWWindow, Int, Int, Int) -> Unit
) = GLFWMouseButtonCallback(
    org.lwjgl.glfw.GLFWMouseButtonCallback.create { window, button, action, mods ->
        callback(window, button, action, mods)
    }
)

actual class GLFWScrollCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWScrollCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWScrollCallback(
    crossinline callback: (GLFWWindow, Double, Double) -> Unit
) = GLFWScrollCallback(
    org.lwjgl.glfw.GLFWScrollCallback.create { window, count, names ->
        callback(window, count, names)
    }
)

actual class GLFWWindowCloseCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowCloseCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowCloseCallback(
    crossinline callback: (GLFWWindow) -> Unit
) = GLFWWindowCloseCallback(
    org.lwjgl.glfw.GLFWWindowCloseCallback.create { window ->
        callback(window)
    }
)

actual class GLFWWindowContentScaleCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowContentScaleCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowContentScaleCallback(
    crossinline callback: (GLFWWindow, Float, Float) -> Unit
) = GLFWWindowContentScaleCallback(
    org.lwjgl.glfw.GLFWWindowContentScaleCallback.create { window, xscale, yscale ->
        callback(window, xscale, yscale)
    }
)

actual class GLFWWindowFocusCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowFocusCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowFocusCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowFocusCallback(
    org.lwjgl.glfw.GLFWWindowFocusCallback.create { window, focused ->
        callback(window, focused)
    }
)

actual class GLFWWindowIconifyCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowIconifyCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowIconifyCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowIconifyCallback(
    org.lwjgl.glfw.GLFWWindowIconifyCallback.create { window, iconified ->
        callback(window, iconified)
    }
)

actual class GLFWWindowMaximizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowMaximizeCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowMaximizeCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowMaximizeCallback(
    org.lwjgl.glfw.GLFWWindowMaximizeCallback.create { window, maximized ->
        callback(window, maximized)
    }
)

actual class GLFWWindowPosCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowPosCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowPosCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWWindowPosCallback(
    org.lwjgl.glfw.GLFWWindowPosCallback.create { window, xpos, ypos ->
        callback(window, xpos, ypos)
    }
)

actual class GLFWWindowRefreshCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowRefreshCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowRefreshCallback(
    crossinline callback: (GLFWWindow) -> Unit
) = GLFWWindowRefreshCallback(
    org.lwjgl.glfw.GLFWWindowRefreshCallback.create { window ->
        callback(window)
    }
)

actual class GLFWWindowSizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val callback: org.lwjgl.glfw.GLFWWindowSizeCallback
) {
    actual fun close() {
        callback.close()
    }
}

actual inline fun GLFWWindowSizeCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWWindowSizeCallback(
    org.lwjgl.glfw.GLFWWindowSizeCallback.create { window, width, height ->
        callback(window, width, height)
    }
)
