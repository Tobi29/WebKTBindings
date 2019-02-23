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

@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package net.gitout.ktbindings.glfw

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.ByteReadBuffer
import net.gitout.ktbindings.utils.FloatReadBuffer

actual data class GLFWMonitor(
    val ptr: CPointer<binding.glfw.GLFWmonitor>?
)

actual class GLFWMonitorBuffer(
    val ptr: CPointer<CPointerVar<binding.glfw.GLFWmonitor>>,
    val size: Int
)

actual inline val GLFWMonitorBuffer.size get() = size

actual inline operator fun GLFWMonitorBuffer.get(index: Int) =
    GLFWMonitor(ptr[index])

actual inline val GLFWMonitor_EMPTY: GLFWMonitor get() = GLFWMonitor(null)

actual data class GLFWWindow(
    val ptr: CPointer<binding.glfw.GLFWwindow>?
)

actual inline val GLFWWindow_EMPTY: GLFWWindow get() = GLFWWindow(null)

actual data class GLFWVidMode(
    val ptr: CPointer<binding.glfw.GLFWvidmode>
)

actual inline val GLFWVidMode.width get() = ptr.pointed.width

actual inline val GLFWVidMode.height get() = ptr.pointed.height

actual inline val GLFWVidMode.refreshRate get() = ptr.pointed.refreshRate

actual class GLFWVidModeBuffer(
    val ptr: CPointer<binding.glfw.GLFWvidmode>,
    val size: Int
)

actual inline val GLFWVidModeBuffer.size get() = size

actual inline operator fun GLFWVidModeBuffer.get(index: Int) =
    GLFWVidMode(ptr[index].ptr)

actual data class GLFWGammaRamp(
    val ptr: CPointer<binding.glfw.GLFWgammaramp>
)

actual data class GLFWGamepadState(
    val ptr: CPointer<binding.glfw.GLFWgamepadstate>?
)

actual inline fun GLFWGamepadState() =
    GLFWGamepadState(nativeHeap.alloc<binding.glfw.GLFWgamepadstate>().ptr)

actual inline val GLFWGamepadState.axes: FloatReadBuffer
    get() = FloatReadBuffer(ptr!!.pointed.axes, GLFW_GAMEPAD_AXIS_LAST)

actual inline val GLFWGamepadState.buttons: ByteReadBuffer
    get() = ByteReadBuffer(
        ptr!!.pointed.buttons.reinterpret(), GLFW_GAMEPAD_BUTTON_LAST
    )

actual inline fun GLFWGamepadState.close() = nativeHeap.free(ptr!!.pointed)

actual data class GLFWImage(
    val ptr: CPointer<binding.glfw.GLFWimage>
)

actual class GLFWImageBuffer(
    val ptr: CPointer<binding.glfw.GLFWimage>,
    val size: Int
)

actual inline val GLFWImageBuffer.size get() = size

actual inline operator fun GLFWImageBuffer.get(index: Int) =
    GLFWImage(ptr[index].ptr)

actual data class GLFWCursor(
    val ptr: CPointer<binding.glfw.GLFWcursor>?
)

actual inline val GLFWCursor_EMPTY: GLFWCursor get() = GLFWCursor(null)

@ThreadLocal
@PublishedApi
internal object Callbacks {
    val char =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWCharCallbackHandler>()
    val charMods =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWCharModsCallbackHandler>()
    val cursorEnter =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWCursorEnterCallbackHandler>()
    val cursorPos =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWCursorPosCallbackHandler>()
    val drop =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWDropCallbackHandler>()
    var error: GLFWErrorCallbackHandler? = null
    val framebufferSize =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWFramebufferSizeCallbackHandler>()
    var joystick: GLFWJoystickCallbackHandler? = null
    val key =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWKeyCallbackHandler>()
    var monitor: GLFWMonitorCallbackHandler? = null
    val mouseButton =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWMouseButtonCallbackHandler>()
    val scroll =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWScrollCallbackHandler>()
    val windowClose =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowCloseCallbackHandler>()
    val windowContentScale =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowContentScaleCallbackHandler>()
    val windowFocus =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowFocusCallbackHandler>()
    val windowIconify =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowIconifyCallbackHandler>()
    val windowMaximize =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowMaximizeCallbackHandler>()
    val windowPos =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowPosCallbackHandler>()
    val windowRefresh =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowRefreshCallbackHandler>()
    val windowSize =
        HashMap<CPointer<binding.glfw.GLFWwindow>, GLFWWindowSizeCallbackHandler>()
}

//

actual class GLFWCharCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWcharfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWCharCallbackHandler {
    operator fun invoke(window: GLFWWindow, codepoint: Codepoint)
}

actual inline fun GLFWCharCallback(
    crossinline callback: (GLFWWindow, Codepoint) -> Unit
) = GLFWCharCallback(object : GLFWCharCallbackHandler {
    override fun invoke(window: GLFWWindow, codepoint: Codepoint) {
        callback(window, codepoint)
    }
})

@PublishedApi
internal fun GLFWCharCallback(
    callback: GLFWCharCallbackHandler
) = GLFWCharCallback({ window ->
    Callbacks.char[window.ptr!!] = callback
    staticCFunction(::char)
}, {
    Callbacks.char.values.removeAll { it === callback }
})

fun GLFWCharCallback(
    ptr: binding.glfw.GLFWcharfun
) = GLFWCharCallback({ ptr }, {})

private fun char(
    window: CPointer<binding.glfw.GLFWwindow>?, codepoint: UInt
) {
    Callbacks.char[window]?.invoke(GLFWWindow(window), codepoint.toInt())
}

//

actual class GLFWCharModsCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWcharmodsfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWCharModsCallbackHandler {
    operator fun invoke(window: GLFWWindow, codepoint: Codepoint, mods: Int)
}

actual inline fun GLFWCharModsCallback(
    crossinline callback: (GLFWWindow, Codepoint, Int) -> Unit
) = GLFWCharModsCallback(object : GLFWCharModsCallbackHandler {
    override fun invoke(window: GLFWWindow, codepoint: Codepoint, mods: Int) {
        callback(window, codepoint, mods)
    }
})

@PublishedApi
internal fun GLFWCharModsCallback(
    callback: GLFWCharModsCallbackHandler
) = GLFWCharModsCallback({ window ->
    Callbacks.charMods[window.ptr!!] = callback
    staticCFunction(::charMods)
}, {
    Callbacks.charMods.values.removeAll { it === callback }
})

fun GLFWCharModsCallback(
    ptr: binding.glfw.GLFWcharmodsfun
) = GLFWCharModsCallback({ ptr }, {})

private fun charMods(
    window: CPointer<binding.glfw.GLFWwindow>?, codepoint: UInt, mods: Int
) {
    Callbacks.charMods[window]?.invoke(
        GLFWWindow(window), codepoint.toInt(), mods
    )
}

//

actual class GLFWCursorEnterCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWcursorenterfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWCursorEnterCallbackHandler {
    operator fun invoke(window: GLFWWindow, entered: Boolean)
}

actual inline fun GLFWCursorEnterCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWCursorEnterCallback(object : GLFWCursorEnterCallbackHandler {
    override fun invoke(window: GLFWWindow, entered: Boolean) {
        callback(window, entered)
    }
})

@PublishedApi
internal fun GLFWCursorEnterCallback(
    callback: GLFWCursorEnterCallbackHandler
) = GLFWCursorEnterCallback({ window ->
    Callbacks.cursorEnter[window.ptr!!] = callback
    staticCFunction(::cursorEnter)
}, {
    Callbacks.cursorEnter.values.removeAll { it === callback }
})

fun GLFWCursorEnterCallback(
    ptr: binding.glfw.GLFWcursorenterfun
) = GLFWCursorEnterCallback({ ptr }, {})

private fun cursorEnter(
    window: CPointer<binding.glfw.GLFWwindow>?, entered: Int
) {
    Callbacks.cursorEnter[window]?.invoke(GLFWWindow(window), entered != 0)
}

//

actual class GLFWCursorPosCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWcursorposfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWCursorPosCallbackHandler {
    operator fun invoke(window: GLFWWindow, xpos: Double, ypos: Double)
}

actual inline fun GLFWCursorPosCallback(
    crossinline callback: (GLFWWindow, Double, Double) -> Unit
) = GLFWCursorPosCallback(object : GLFWCursorPosCallbackHandler {
    override fun invoke(window: GLFWWindow, xpos: Double, ypos: Double) {
        callback(window, xpos, ypos)
    }
})

@PublishedApi
internal fun GLFWCursorPosCallback(
    callback: GLFWCursorPosCallbackHandler
) = GLFWCursorPosCallback({ window ->
    Callbacks.cursorPos[window.ptr!!] = callback
    staticCFunction(::cursorPos)
}, {
    Callbacks.cursorPos.values.removeAll { it === callback }
})

fun GLFWCursorPosCallback(
    ptr: binding.glfw.GLFWcursorposfun
) = GLFWCursorPosCallback({ ptr }, {})

private fun cursorPos(
    window: CPointer<binding.glfw.GLFWwindow>?, xpos: Double, ypos: Double
) {
    Callbacks.cursorPos[window]?.invoke(GLFWWindow(window), xpos, ypos)
}

//

actual class GLFWDropCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWdropfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWDropCallbackHandler {
    operator fun invoke(window: GLFWWindow, count: Int, names: Long)
}

actual inline fun GLFWDropCallback(
    crossinline callback: (GLFWWindow, Int, Long) -> Unit
) = GLFWDropCallback(object : GLFWDropCallbackHandler {
    override fun invoke(window: GLFWWindow, count: Int, names: Long) {
        callback(window, count, names)
    }
})

@PublishedApi
internal fun GLFWDropCallback(
    callback: GLFWDropCallbackHandler
) = GLFWDropCallback({ window ->
    Callbacks.drop[window.ptr!!] = callback
    staticCFunction(::drop)
}, {
    Callbacks.drop.values.removeAll { it === callback }
})

fun GLFWDropCallback(
    ptr: binding.glfw.GLFWdropfun
) = GLFWDropCallback({ ptr }, {})

private fun drop(
    window: CPointer<binding.glfw.GLFWwindow>?, count: Int,
    names: CPointer<CPointerVar<ByteVar>>?
) {
    Callbacks.drop[window]?.invoke(GLFWWindow(window), count, names.toLong())
}

//

actual class GLFWErrorCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: () -> binding.glfw.GLFWerrorfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWErrorCallbackHandler {
    operator fun invoke(error: Int, description: Long)
}

actual inline fun GLFWErrorCallback(
    crossinline callback: (Int, Long) -> Unit
) = GLFWErrorCallback(object : GLFWErrorCallbackHandler {
    override fun invoke(error: Int, description: Long) {
        callback(error, description)
    }
})

@PublishedApi
internal fun GLFWErrorCallback(
    callback: GLFWErrorCallbackHandler
) = GLFWErrorCallback({
    Callbacks.error = callback
    staticCFunction(::error)
}, {
    if (Callbacks.error === callback) Callbacks.error = null
})

fun GLFWErrorCallback(
    ptr: binding.glfw.GLFWerrorfun
) = GLFWErrorCallback({ ptr }, {})

private fun error(
    error: Int, description: CPointer<ByteVar>?
) {
    Callbacks.error?.invoke(error, description.toLong())
}

//

actual class GLFWFramebufferSizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWframebuffersizefun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWFramebufferSizeCallbackHandler {
    operator fun invoke(window: GLFWWindow, width: Int, height: Int)
}

actual inline fun GLFWFramebufferSizeCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWFramebufferSizeCallback(object : GLFWFramebufferSizeCallbackHandler {
    override fun invoke(window: GLFWWindow, width: Int, height: Int) {
        callback(window, width, height)
    }
})

@PublishedApi
internal fun GLFWFramebufferSizeCallback(
    callback: GLFWFramebufferSizeCallbackHandler
) = GLFWFramebufferSizeCallback({ window ->
    Callbacks.framebufferSize[window.ptr!!] = callback
    staticCFunction(::framebufferSize)
}, {
    Callbacks.framebufferSize.values.removeAll { it === callback }
})

fun GLFWFramebufferSizeCallback(
    ptr: binding.glfw.GLFWframebuffersizefun
) = GLFWFramebufferSizeCallback({ ptr }, {})

private fun framebufferSize(
    window: CPointer<binding.glfw.GLFWwindow>?, width: Int, height: Int
) {
    Callbacks.framebufferSize[window]?.invoke(GLFWWindow(window), width, height)
}

//

actual class GLFWJoystickCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: () -> binding.glfw.GLFWjoystickfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWJoystickCallbackHandler {
    operator fun invoke(jid: Int, event: Int)
}

actual inline fun GLFWJoystickCallback(
    crossinline callback: (Int, Int) -> Unit
) = GLFWJoystickCallback(object : GLFWJoystickCallbackHandler {
    override fun invoke(jid: Int, event: Int) {
        callback(jid, event)
    }
})

@PublishedApi
internal fun GLFWJoystickCallback(
    callback: GLFWJoystickCallbackHandler
) = GLFWJoystickCallback({
    Callbacks.joystick = callback
    staticCFunction(::joystick)
}, {
    if (Callbacks.joystick === callback) Callbacks.joystick = null
})

fun GLFWJoystickCallback(
    ptr: binding.glfw.GLFWjoystickfun
) = GLFWJoystickCallback({ ptr }, {})

private fun joystick(
    jid: Int, event: Int
) {
    Callbacks.joystick?.invoke(jid, event)
}

//

actual class GLFWKeyCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWkeyfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWKeyCallbackHandler {
    operator fun invoke(
        window: GLFWWindow, key: Int, scancode: Int, action: Int, mods: Int
    )
}

actual inline fun GLFWKeyCallback(
    crossinline callback: (GLFWWindow, Int, Int, Int, Int) -> Unit
) = GLFWKeyCallback(object : GLFWKeyCallbackHandler {
    override fun invoke(
        window: GLFWWindow, key: Int, scancode: Int, action: Int, mods: Int
    ) {
        callback(window, key, scancode, action, mods)
    }
})

@PublishedApi
internal fun GLFWKeyCallback(
    callback: GLFWKeyCallbackHandler
) = GLFWKeyCallback({ window ->
    Callbacks.key[window.ptr!!] = callback
    staticCFunction(::key)
}, {
    Callbacks.key.values.removeAll { it === callback }
})

fun GLFWKeyCallback(
    ptr: binding.glfw.GLFWkeyfun
) = GLFWKeyCallback({ ptr }, {})

private fun key(
    window: CPointer<binding.glfw.GLFWwindow>?, key: Int, scancode: Int,
    action: Int, mods: Int
) {
    Callbacks.key[window]?.invoke(
        GLFWWindow(window),
        key,
        scancode,
        action,
        mods
    )
}

//

actual class GLFWMonitorCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: () -> binding.glfw.GLFWmonitorfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWMonitorCallbackHandler {
    operator fun invoke(monitor: GLFWMonitor, event: Int)
}

actual inline fun GLFWMonitorCallback(
    crossinline callback: (GLFWMonitor, Int) -> Unit
) = GLFWMonitorCallback(object : GLFWMonitorCallbackHandler {
    override fun invoke(monitor: GLFWMonitor, event: Int) {
        callback(monitor, event)
    }
})

@PublishedApi
internal fun GLFWMonitorCallback(
    callback: GLFWMonitorCallbackHandler
) = GLFWMonitorCallback({
    Callbacks.monitor = callback
    staticCFunction(::monitor)
}, {
    if (Callbacks.monitor === callback) Callbacks.monitor = null
})

fun GLFWMonitorCallback(
    ptr: binding.glfw.GLFWmonitorfun
) = GLFWMonitorCallback({ ptr }, {})

private fun monitor(
    monitor: CPointer<binding.glfw.GLFWmonitor>?, event: Int
) {
    Callbacks.monitor?.invoke(GLFWMonitor(monitor), event)
}

//

actual class GLFWMouseButtonCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWmousebuttonfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWMouseButtonCallbackHandler {
    operator fun invoke(window: GLFWWindow, button: Int, action: Int, mods: Int)
}

actual inline fun GLFWMouseButtonCallback(
    crossinline callback: (GLFWWindow, Int, Int, Int) -> Unit
) = GLFWMouseButtonCallback(object : GLFWMouseButtonCallbackHandler {
    override fun invoke(
        window: GLFWWindow, button: Int, action: Int, mods: Int
    ) {
        callback(window, button, action, mods)
    }
})

@PublishedApi
internal fun GLFWMouseButtonCallback(
    callback: GLFWMouseButtonCallbackHandler
) = GLFWMouseButtonCallback({ window ->
    Callbacks.mouseButton[window.ptr!!] = callback
    staticCFunction(::mouseButton)
}, {
    Callbacks.mouseButton.values.removeAll { it === callback }
})

fun GLFWMouseButtonCallback(
    ptr: binding.glfw.GLFWmousebuttonfun
) = GLFWMouseButtonCallback({ ptr }, {})

private fun mouseButton(
    window: CPointer<binding.glfw.GLFWwindow>?, button: Int, action: Int,
    mods: Int
) {
    Callbacks.mouseButton[window]?.invoke(
        GLFWWindow(window), button, action, mods
    )
}

//

actual class GLFWScrollCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWscrollfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWScrollCallbackHandler {
    operator fun invoke(window: GLFWWindow, xoffset: Double, yoffset: Double)
}

actual inline fun GLFWScrollCallback(
    crossinline callback: (GLFWWindow, Double, Double) -> Unit
) = GLFWScrollCallback(object : GLFWScrollCallbackHandler {
    override fun invoke(window: GLFWWindow, xoffset: Double, yoffset: Double) {
        callback(window, xoffset, yoffset)
    }
})

@PublishedApi
internal fun GLFWScrollCallback(
    callback: GLFWScrollCallbackHandler
) = GLFWScrollCallback({ window ->
    Callbacks.scroll[window.ptr!!] = callback
    staticCFunction(::scroll)
}, {
    Callbacks.scroll.values.removeAll { it === callback }
})

fun GLFWScrollCallback(
    ptr: binding.glfw.GLFWscrollfun
) = GLFWScrollCallback({ ptr }, {})

private fun scroll(
    window: CPointer<binding.glfw.GLFWwindow>?, xoffset: Double, yoffset: Double
) {
    Callbacks.scroll[window]?.invoke(GLFWWindow(window), xoffset, yoffset)
}

//

actual class GLFWWindowCloseCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowclosefun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowCloseCallbackHandler {
    operator fun invoke(window: GLFWWindow)
}

actual inline fun GLFWWindowCloseCallback(
    crossinline callback: (GLFWWindow) -> Unit
) = GLFWWindowCloseCallback(object : GLFWWindowCloseCallbackHandler {
    override fun invoke(window: GLFWWindow) {
        callback(window)
    }
})

@PublishedApi
internal fun GLFWWindowCloseCallback(
    callback: GLFWWindowCloseCallbackHandler
) = GLFWWindowCloseCallback({ window ->
    Callbacks.windowClose[window.ptr!!] = callback
    staticCFunction(::windowClose)
}, {
    Callbacks.windowClose.values.removeAll { it === callback }
})

fun GLFWWindowCloseCallback(
    ptr: binding.glfw.GLFWwindowclosefun
) = GLFWWindowCloseCallback({ ptr }, {})

private fun windowClose(
    window: CPointer<binding.glfw.GLFWwindow>?
) {
    Callbacks.windowClose[window]?.invoke(GLFWWindow(window))
}

//

actual class GLFWWindowContentScaleCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowcontentscalefun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowContentScaleCallbackHandler {
    operator fun invoke(window: GLFWWindow, xscale: Float, yscale: Float)
}

actual inline fun GLFWWindowContentScaleCallback(
    crossinline callback: (GLFWWindow, Float, Float) -> Unit
) = GLFWWindowContentScaleCallback(object :
    GLFWWindowContentScaleCallbackHandler {
    override fun invoke(window: GLFWWindow, xscale: Float, yscale: Float) {
        callback(window, xscale, yscale)
    }
})

@PublishedApi
internal fun GLFWWindowContentScaleCallback(
    callback: GLFWWindowContentScaleCallbackHandler
) = GLFWWindowContentScaleCallback({ window ->
    Callbacks.windowContentScale[window.ptr!!] = callback
    staticCFunction(::windowContentScale)
}, {
    Callbacks.windowContentScale.values.removeAll { it === callback }
})

fun GLFWWindowContentScaleCallback(
    ptr: binding.glfw.GLFWwindowcontentscalefun
) = GLFWWindowContentScaleCallback({ ptr }, {})

private fun windowContentScale(
    window: CPointer<binding.glfw.GLFWwindow>?, xscale: Float, yscale: Float
) {
    Callbacks.windowContentScale[window]?.invoke(
        GLFWWindow(window), xscale, yscale
    )
}

//

actual class GLFWWindowFocusCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowfocusfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowFocusCallbackHandler {
    operator fun invoke(window: GLFWWindow, focused: Boolean)
}

actual inline fun GLFWWindowFocusCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowFocusCallback(object : GLFWWindowFocusCallbackHandler {
    override fun invoke(window: GLFWWindow, focused: Boolean) {
        callback(window, focused)
    }
})

@PublishedApi
internal fun GLFWWindowFocusCallback(
    callback: GLFWWindowFocusCallbackHandler
) = GLFWWindowFocusCallback({ window ->
    Callbacks.windowFocus[window.ptr!!] = callback
    staticCFunction(::windowFocus)
}, {
    Callbacks.windowFocus.values.removeAll { it === callback }
})

fun GLFWWindowFocusCallback(
    ptr: binding.glfw.GLFWwindowfocusfun
) = GLFWWindowFocusCallback({ ptr }, {})

private fun windowFocus(
    window: CPointer<binding.glfw.GLFWwindow>?, focused: Int
) {
    Callbacks.windowFocus[window]?.invoke(GLFWWindow(window), focused != 0)
}

//

actual class GLFWWindowIconifyCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowiconifyfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowIconifyCallbackHandler {
    operator fun invoke(window: GLFWWindow, iconified: Boolean)
}

actual inline fun GLFWWindowIconifyCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowIconifyCallback(object : GLFWWindowIconifyCallbackHandler {
    override fun invoke(window: GLFWWindow, iconified: Boolean) {
        callback(window, iconified)
    }
})

@PublishedApi
internal fun GLFWWindowIconifyCallback(
    callback: GLFWWindowIconifyCallbackHandler
) = GLFWWindowIconifyCallback({ window ->
    Callbacks.windowIconify[window.ptr!!] = callback
    staticCFunction(::windowIconify)
}, {
    Callbacks.windowIconify.values.removeAll { it === callback }
})

fun GLFWWindowIconifyCallback(
    ptr: binding.glfw.GLFWwindowiconifyfun
) = GLFWWindowIconifyCallback({ ptr }, {})

private fun windowIconify(
    window: CPointer<binding.glfw.GLFWwindow>?, iconified: Int
) {
    Callbacks.windowIconify[window]?.invoke(GLFWWindow(window), iconified != 0)
}

//

actual class GLFWWindowMaximizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowmaximizefun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowMaximizeCallbackHandler {
    operator fun invoke(window: GLFWWindow, maximized: Boolean)
}

actual inline fun GLFWWindowMaximizeCallback(
    crossinline callback: (GLFWWindow, Boolean) -> Unit
) = GLFWWindowMaximizeCallback(object : GLFWWindowMaximizeCallbackHandler {
    override fun invoke(window: GLFWWindow, maximized: Boolean) {
        callback(window, maximized)
    }
})

@PublishedApi
internal fun GLFWWindowMaximizeCallback(
    callback: GLFWWindowMaximizeCallbackHandler
) = GLFWWindowMaximizeCallback({ window ->
    Callbacks.windowMaximize[window.ptr!!] = callback
    staticCFunction(::windowMaximize)
}, {
    Callbacks.windowMaximize.values.removeAll { it === callback }
})

fun GLFWWindowMaximizeCallback(
    ptr: binding.glfw.GLFWwindowmaximizefun
) = GLFWWindowMaximizeCallback({ ptr }, {})

private fun windowMaximize(
    window: CPointer<binding.glfw.GLFWwindow>?, maximized: Int
) {
    Callbacks.windowMaximize[window]?.invoke(GLFWWindow(window), maximized != 0)
}

//

actual class GLFWWindowPosCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowposfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowPosCallbackHandler {
    operator fun invoke(window: GLFWWindow, xpos: Int, ypos: Int)
}

actual inline fun GLFWWindowPosCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWWindowPosCallback(object : GLFWWindowPosCallbackHandler {
    override fun invoke(window: GLFWWindow, xpos: Int, ypos: Int) {
        callback(window, xpos, ypos)
    }
})

@PublishedApi
internal fun GLFWWindowPosCallback(
    callback: GLFWWindowPosCallbackHandler
) = GLFWWindowPosCallback({ window ->
    Callbacks.windowPos[window.ptr!!] = callback
    staticCFunction(::windowPos)
}, {
    Callbacks.windowPos.values.removeAll { it === callback }
})

fun GLFWWindowPosCallback(
    ptr: binding.glfw.GLFWwindowposfun
) = GLFWWindowPosCallback({ ptr }, {})

private fun windowPos(
    window: CPointer<binding.glfw.GLFWwindow>?, xpos: Int, ypos: Int
) {
    Callbacks.windowPos[window]?.invoke(GLFWWindow(window), xpos, ypos)
}

//

actual class GLFWWindowRefreshCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowrefreshfun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowRefreshCallbackHandler {
    operator fun invoke(window: GLFWWindow)
}

actual inline fun GLFWWindowRefreshCallback(
    crossinline callback: (GLFWWindow) -> Unit
) = GLFWWindowRefreshCallback(object : GLFWWindowRefreshCallbackHandler {
    override fun invoke(window: GLFWWindow) {
        callback(window)
    }
})

@PublishedApi
internal fun GLFWWindowRefreshCallback(
    callback: GLFWWindowRefreshCallbackHandler
) = GLFWWindowRefreshCallback({ window ->
    Callbacks.windowRefresh[window.ptr!!] = callback
    staticCFunction(::windowRefresh)
}, {
    Callbacks.windowRefresh.values.removeAll { it === callback }
})

fun GLFWWindowRefreshCallback(
    ptr: binding.glfw.GLFWwindowrefreshfun
) = GLFWWindowRefreshCallback({ ptr }, {})

private fun windowRefresh(
    window: CPointer<binding.glfw.GLFWwindow>?
) {
    Callbacks.windowRefresh[window]?.invoke(GLFWWindow(window))
}

//

actual class GLFWWindowSizeCallback @PublishedApi internal constructor(
    @PublishedApi
    internal val register: (window: GLFWWindow) -> binding.glfw.GLFWwindowsizefun,
    @PublishedApi
    internal val closeImpl: () -> Unit
) {
    actual fun close() = closeImpl()
}

interface GLFWWindowSizeCallbackHandler {
    operator fun invoke(window: GLFWWindow, width: Int, height: Int)
}

actual inline fun GLFWWindowSizeCallback(
    crossinline callback: (GLFWWindow, Int, Int) -> Unit
) = GLFWWindowSizeCallback(object : GLFWWindowSizeCallbackHandler {
    override fun invoke(window: GLFWWindow, width: Int, height: Int) {
        callback(window, width, height)
    }
})

@PublishedApi
internal fun GLFWWindowSizeCallback(
    callback: GLFWWindowSizeCallbackHandler
) = GLFWWindowSizeCallback({ window ->
    Callbacks.windowSize[window.ptr!!] = callback
    staticCFunction(::windowSize)
}, {
    Callbacks.windowSize.values.removeAll { it === callback }
})

fun GLFWWindowSizeCallback(
    ptr: binding.glfw.GLFWwindowsizefun
) = GLFWWindowSizeCallback({ ptr }, {})

private fun windowSize(
    window: CPointer<binding.glfw.GLFWwindow>?, width: Int, height: Int
) {
    Callbacks.windowSize[window]?.invoke(GLFWWindow(window), width, height)
}

//
