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

@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.glfw

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.ByteReadBuffer
import net.gitout.ktbindings.utils.FloatReadBuffer
import net.gitout.ktbindings.utils.toCPointer
import net.gitout.ktbindings.utils.usePinnedOrNull

actual inline val GLFW_VERSION_MAJOR get() = binding.glfw.GLFW_VERSION_MAJOR
actual inline val GLFW_VERSION_MINOR get() = binding.glfw.GLFW_VERSION_MINOR
actual inline val GLFW_VERSION_REVISION get() = binding.glfw.GLFW_VERSION_REVISION
actual inline val GLFW_TRUE get() = binding.glfw.GLFW_TRUE
actual inline val GLFW_FALSE get() = binding.glfw.GLFW_FALSE
actual inline val GLFW_RELEASE get() = binding.glfw.GLFW_RELEASE
actual inline val GLFW_PRESS get() = binding.glfw.GLFW_PRESS
actual inline val GLFW_REPEAT get() = binding.glfw.GLFW_REPEAT
actual inline val GLFW_HAT_CENTERED get() = binding.glfw.GLFW_HAT_CENTERED
actual inline val GLFW_HAT_UP get() = binding.glfw.GLFW_HAT_UP
actual inline val GLFW_HAT_RIGHT get() = binding.glfw.GLFW_HAT_RIGHT
actual inline val GLFW_HAT_DOWN get() = binding.glfw.GLFW_HAT_DOWN
actual inline val GLFW_HAT_LEFT get() = binding.glfw.GLFW_HAT_LEFT
actual inline val GLFW_HAT_RIGHT_UP get() = binding.glfw.GLFW_HAT_RIGHT_UP
actual inline val GLFW_HAT_RIGHT_DOWN get() = binding.glfw.GLFW_HAT_RIGHT_DOWN
actual inline val GLFW_HAT_LEFT_UP get() = binding.glfw.GLFW_HAT_LEFT_UP
actual inline val GLFW_HAT_LEFT_DOWN get() = binding.glfw.GLFW_HAT_LEFT_DOWN
actual inline val GLFW_KEY_UNKNOWN get() = binding.glfw.GLFW_KEY_UNKNOWN
actual inline val GLFW_KEY_SPACE get() = binding.glfw.GLFW_KEY_SPACE
actual inline val GLFW_KEY_APOSTROPHE get() = binding.glfw.GLFW_KEY_APOSTROPHE
actual inline val GLFW_KEY_COMMA get() = binding.glfw.GLFW_KEY_COMMA
actual inline val GLFW_KEY_MINUS get() = binding.glfw.GLFW_KEY_MINUS
actual inline val GLFW_KEY_PERIOD get() = binding.glfw.GLFW_KEY_PERIOD
actual inline val GLFW_KEY_SLASH get() = binding.glfw.GLFW_KEY_SLASH
actual inline val GLFW_KEY_0 get() = binding.glfw.GLFW_KEY_0
actual inline val GLFW_KEY_1 get() = binding.glfw.GLFW_KEY_1
actual inline val GLFW_KEY_2 get() = binding.glfw.GLFW_KEY_2
actual inline val GLFW_KEY_3 get() = binding.glfw.GLFW_KEY_3
actual inline val GLFW_KEY_4 get() = binding.glfw.GLFW_KEY_4
actual inline val GLFW_KEY_5 get() = binding.glfw.GLFW_KEY_5
actual inline val GLFW_KEY_6 get() = binding.glfw.GLFW_KEY_6
actual inline val GLFW_KEY_7 get() = binding.glfw.GLFW_KEY_7
actual inline val GLFW_KEY_8 get() = binding.glfw.GLFW_KEY_8
actual inline val GLFW_KEY_9 get() = binding.glfw.GLFW_KEY_9
actual inline val GLFW_KEY_SEMICOLON get() = binding.glfw.GLFW_KEY_SEMICOLON
actual inline val GLFW_KEY_EQUAL get() = binding.glfw.GLFW_KEY_EQUAL
actual inline val GLFW_KEY_A get() = binding.glfw.GLFW_KEY_A
actual inline val GLFW_KEY_B get() = binding.glfw.GLFW_KEY_B
actual inline val GLFW_KEY_C get() = binding.glfw.GLFW_KEY_C
actual inline val GLFW_KEY_D get() = binding.glfw.GLFW_KEY_D
actual inline val GLFW_KEY_E get() = binding.glfw.GLFW_KEY_E
actual inline val GLFW_KEY_F get() = binding.glfw.GLFW_KEY_F
actual inline val GLFW_KEY_G get() = binding.glfw.GLFW_KEY_G
actual inline val GLFW_KEY_H get() = binding.glfw.GLFW_KEY_H
actual inline val GLFW_KEY_I get() = binding.glfw.GLFW_KEY_I
actual inline val GLFW_KEY_J get() = binding.glfw.GLFW_KEY_J
actual inline val GLFW_KEY_K get() = binding.glfw.GLFW_KEY_K
actual inline val GLFW_KEY_L get() = binding.glfw.GLFW_KEY_L
actual inline val GLFW_KEY_M get() = binding.glfw.GLFW_KEY_M
actual inline val GLFW_KEY_N get() = binding.glfw.GLFW_KEY_N
actual inline val GLFW_KEY_O get() = binding.glfw.GLFW_KEY_O
actual inline val GLFW_KEY_P get() = binding.glfw.GLFW_KEY_P
actual inline val GLFW_KEY_Q get() = binding.glfw.GLFW_KEY_Q
actual inline val GLFW_KEY_R get() = binding.glfw.GLFW_KEY_R
actual inline val GLFW_KEY_S get() = binding.glfw.GLFW_KEY_S
actual inline val GLFW_KEY_T get() = binding.glfw.GLFW_KEY_T
actual inline val GLFW_KEY_U get() = binding.glfw.GLFW_KEY_U
actual inline val GLFW_KEY_V get() = binding.glfw.GLFW_KEY_V
actual inline val GLFW_KEY_W get() = binding.glfw.GLFW_KEY_W
actual inline val GLFW_KEY_X get() = binding.glfw.GLFW_KEY_X
actual inline val GLFW_KEY_Y get() = binding.glfw.GLFW_KEY_Y
actual inline val GLFW_KEY_Z get() = binding.glfw.GLFW_KEY_Z
actual inline val GLFW_KEY_LEFT_BRACKET get() = binding.glfw.GLFW_KEY_LEFT_BRACKET
actual inline val GLFW_KEY_BACKSLASH get() = binding.glfw.GLFW_KEY_BACKSLASH
actual inline val GLFW_KEY_RIGHT_BRACKET get() = binding.glfw.GLFW_KEY_RIGHT_BRACKET
actual inline val GLFW_KEY_GRAVE_ACCENT get() = binding.glfw.GLFW_KEY_GRAVE_ACCENT
actual inline val GLFW_KEY_WORLD_1 get() = binding.glfw.GLFW_KEY_WORLD_1
actual inline val GLFW_KEY_WORLD_2 get() = binding.glfw.GLFW_KEY_WORLD_2
actual inline val GLFW_KEY_ESCAPE get() = binding.glfw.GLFW_KEY_ESCAPE
actual inline val GLFW_KEY_ENTER get() = binding.glfw.GLFW_KEY_ENTER
actual inline val GLFW_KEY_TAB get() = binding.glfw.GLFW_KEY_TAB
actual inline val GLFW_KEY_BACKSPACE get() = binding.glfw.GLFW_KEY_BACKSPACE
actual inline val GLFW_KEY_INSERT get() = binding.glfw.GLFW_KEY_INSERT
actual inline val GLFW_KEY_DELETE get() = binding.glfw.GLFW_KEY_DELETE
actual inline val GLFW_KEY_RIGHT get() = binding.glfw.GLFW_KEY_RIGHT
actual inline val GLFW_KEY_LEFT get() = binding.glfw.GLFW_KEY_LEFT
actual inline val GLFW_KEY_DOWN get() = binding.glfw.GLFW_KEY_DOWN
actual inline val GLFW_KEY_UP get() = binding.glfw.GLFW_KEY_UP
actual inline val GLFW_KEY_PAGE_UP get() = binding.glfw.GLFW_KEY_PAGE_UP
actual inline val GLFW_KEY_PAGE_DOWN get() = binding.glfw.GLFW_KEY_PAGE_DOWN
actual inline val GLFW_KEY_HOME get() = binding.glfw.GLFW_KEY_HOME
actual inline val GLFW_KEY_END get() = binding.glfw.GLFW_KEY_END
actual inline val GLFW_KEY_CAPS_LOCK get() = binding.glfw.GLFW_KEY_CAPS_LOCK
actual inline val GLFW_KEY_SCROLL_LOCK get() = binding.glfw.GLFW_KEY_SCROLL_LOCK
actual inline val GLFW_KEY_NUM_LOCK get() = binding.glfw.GLFW_KEY_NUM_LOCK
actual inline val GLFW_KEY_PRINT_SCREEN get() = binding.glfw.GLFW_KEY_PRINT_SCREEN
actual inline val GLFW_KEY_PAUSE get() = binding.glfw.GLFW_KEY_PAUSE
actual inline val GLFW_KEY_F1 get() = binding.glfw.GLFW_KEY_F1
actual inline val GLFW_KEY_F2 get() = binding.glfw.GLFW_KEY_F2
actual inline val GLFW_KEY_F3 get() = binding.glfw.GLFW_KEY_F3
actual inline val GLFW_KEY_F4 get() = binding.glfw.GLFW_KEY_F4
actual inline val GLFW_KEY_F5 get() = binding.glfw.GLFW_KEY_F5
actual inline val GLFW_KEY_F6 get() = binding.glfw.GLFW_KEY_F6
actual inline val GLFW_KEY_F7 get() = binding.glfw.GLFW_KEY_F7
actual inline val GLFW_KEY_F8 get() = binding.glfw.GLFW_KEY_F8
actual inline val GLFW_KEY_F9 get() = binding.glfw.GLFW_KEY_F9
actual inline val GLFW_KEY_F10 get() = binding.glfw.GLFW_KEY_F10
actual inline val GLFW_KEY_F11 get() = binding.glfw.GLFW_KEY_F11
actual inline val GLFW_KEY_F12 get() = binding.glfw.GLFW_KEY_F12
actual inline val GLFW_KEY_F13 get() = binding.glfw.GLFW_KEY_F13
actual inline val GLFW_KEY_F14 get() = binding.glfw.GLFW_KEY_F14
actual inline val GLFW_KEY_F15 get() = binding.glfw.GLFW_KEY_F15
actual inline val GLFW_KEY_F16 get() = binding.glfw.GLFW_KEY_F16
actual inline val GLFW_KEY_F17 get() = binding.glfw.GLFW_KEY_F17
actual inline val GLFW_KEY_F18 get() = binding.glfw.GLFW_KEY_F18
actual inline val GLFW_KEY_F19 get() = binding.glfw.GLFW_KEY_F19
actual inline val GLFW_KEY_F20 get() = binding.glfw.GLFW_KEY_F20
actual inline val GLFW_KEY_F21 get() = binding.glfw.GLFW_KEY_F21
actual inline val GLFW_KEY_F22 get() = binding.glfw.GLFW_KEY_F22
actual inline val GLFW_KEY_F23 get() = binding.glfw.GLFW_KEY_F23
actual inline val GLFW_KEY_F24 get() = binding.glfw.GLFW_KEY_F24
actual inline val GLFW_KEY_F25 get() = binding.glfw.GLFW_KEY_F25
actual inline val GLFW_KEY_KP_0 get() = binding.glfw.GLFW_KEY_KP_0
actual inline val GLFW_KEY_KP_1 get() = binding.glfw.GLFW_KEY_KP_1
actual inline val GLFW_KEY_KP_2 get() = binding.glfw.GLFW_KEY_KP_2
actual inline val GLFW_KEY_KP_3 get() = binding.glfw.GLFW_KEY_KP_3
actual inline val GLFW_KEY_KP_4 get() = binding.glfw.GLFW_KEY_KP_4
actual inline val GLFW_KEY_KP_5 get() = binding.glfw.GLFW_KEY_KP_5
actual inline val GLFW_KEY_KP_6 get() = binding.glfw.GLFW_KEY_KP_6
actual inline val GLFW_KEY_KP_7 get() = binding.glfw.GLFW_KEY_KP_7
actual inline val GLFW_KEY_KP_8 get() = binding.glfw.GLFW_KEY_KP_8
actual inline val GLFW_KEY_KP_9 get() = binding.glfw.GLFW_KEY_KP_9
actual inline val GLFW_KEY_KP_DECIMAL get() = binding.glfw.GLFW_KEY_KP_DECIMAL
actual inline val GLFW_KEY_KP_DIVIDE get() = binding.glfw.GLFW_KEY_KP_DIVIDE
actual inline val GLFW_KEY_KP_MULTIPLY get() = binding.glfw.GLFW_KEY_KP_MULTIPLY
actual inline val GLFW_KEY_KP_SUBTRACT get() = binding.glfw.GLFW_KEY_KP_SUBTRACT
actual inline val GLFW_KEY_KP_ADD get() = binding.glfw.GLFW_KEY_KP_ADD
actual inline val GLFW_KEY_KP_ENTER get() = binding.glfw.GLFW_KEY_KP_ENTER
actual inline val GLFW_KEY_KP_EQUAL get() = binding.glfw.GLFW_KEY_KP_EQUAL
actual inline val GLFW_KEY_LEFT_SHIFT get() = binding.glfw.GLFW_KEY_LEFT_SHIFT
actual inline val GLFW_KEY_LEFT_CONTROL get() = binding.glfw.GLFW_KEY_LEFT_CONTROL
actual inline val GLFW_KEY_LEFT_ALT get() = binding.glfw.GLFW_KEY_LEFT_ALT
actual inline val GLFW_KEY_LEFT_SUPER get() = binding.glfw.GLFW_KEY_LEFT_SUPER
actual inline val GLFW_KEY_RIGHT_SHIFT get() = binding.glfw.GLFW_KEY_RIGHT_SHIFT
actual inline val GLFW_KEY_RIGHT_CONTROL get() = binding.glfw.GLFW_KEY_RIGHT_CONTROL
actual inline val GLFW_KEY_RIGHT_ALT get() = binding.glfw.GLFW_KEY_RIGHT_ALT
actual inline val GLFW_KEY_RIGHT_SUPER get() = binding.glfw.GLFW_KEY_RIGHT_SUPER
actual inline val GLFW_KEY_MENU get() = binding.glfw.GLFW_KEY_MENU
actual inline val GLFW_KEY_LAST get() = binding.glfw.GLFW_KEY_LAST
actual inline val GLFW_MOD_SHIFT get() = binding.glfw.GLFW_MOD_SHIFT
actual inline val GLFW_MOD_CONTROL get() = binding.glfw.GLFW_MOD_CONTROL
actual inline val GLFW_MOD_ALT get() = binding.glfw.GLFW_MOD_ALT
actual inline val GLFW_MOD_SUPER get() = binding.glfw.GLFW_MOD_SUPER
actual inline val GLFW_MOD_CAPS_LOCK get() = binding.glfw.GLFW_MOD_CAPS_LOCK
actual inline val GLFW_MOD_NUM_LOCK get() = binding.glfw.GLFW_MOD_NUM_LOCK
actual inline val GLFW_MOUSE_BUTTON_1 get() = binding.glfw.GLFW_MOUSE_BUTTON_1
actual inline val GLFW_MOUSE_BUTTON_2 get() = binding.glfw.GLFW_MOUSE_BUTTON_2
actual inline val GLFW_MOUSE_BUTTON_3 get() = binding.glfw.GLFW_MOUSE_BUTTON_3
actual inline val GLFW_MOUSE_BUTTON_4 get() = binding.glfw.GLFW_MOUSE_BUTTON_4
actual inline val GLFW_MOUSE_BUTTON_5 get() = binding.glfw.GLFW_MOUSE_BUTTON_5
actual inline val GLFW_MOUSE_BUTTON_6 get() = binding.glfw.GLFW_MOUSE_BUTTON_6
actual inline val GLFW_MOUSE_BUTTON_7 get() = binding.glfw.GLFW_MOUSE_BUTTON_7
actual inline val GLFW_MOUSE_BUTTON_8 get() = binding.glfw.GLFW_MOUSE_BUTTON_8
actual inline val GLFW_MOUSE_BUTTON_LAST get() = binding.glfw.GLFW_MOUSE_BUTTON_LAST
actual inline val GLFW_MOUSE_BUTTON_LEFT get() = binding.glfw.GLFW_MOUSE_BUTTON_LEFT
actual inline val GLFW_MOUSE_BUTTON_RIGHT get() = binding.glfw.GLFW_MOUSE_BUTTON_RIGHT
actual inline val GLFW_MOUSE_BUTTON_MIDDLE get() = binding.glfw.GLFW_MOUSE_BUTTON_MIDDLE
actual inline val GLFW_JOYSTICK_1 get() = binding.glfw.GLFW_JOYSTICK_1
actual inline val GLFW_JOYSTICK_2 get() = binding.glfw.GLFW_JOYSTICK_2
actual inline val GLFW_JOYSTICK_3 get() = binding.glfw.GLFW_JOYSTICK_3
actual inline val GLFW_JOYSTICK_4 get() = binding.glfw.GLFW_JOYSTICK_4
actual inline val GLFW_JOYSTICK_5 get() = binding.glfw.GLFW_JOYSTICK_5
actual inline val GLFW_JOYSTICK_6 get() = binding.glfw.GLFW_JOYSTICK_6
actual inline val GLFW_JOYSTICK_7 get() = binding.glfw.GLFW_JOYSTICK_7
actual inline val GLFW_JOYSTICK_8 get() = binding.glfw.GLFW_JOYSTICK_8
actual inline val GLFW_JOYSTICK_9 get() = binding.glfw.GLFW_JOYSTICK_9
actual inline val GLFW_JOYSTICK_10 get() = binding.glfw.GLFW_JOYSTICK_10
actual inline val GLFW_JOYSTICK_11 get() = binding.glfw.GLFW_JOYSTICK_11
actual inline val GLFW_JOYSTICK_12 get() = binding.glfw.GLFW_JOYSTICK_12
actual inline val GLFW_JOYSTICK_13 get() = binding.glfw.GLFW_JOYSTICK_13
actual inline val GLFW_JOYSTICK_14 get() = binding.glfw.GLFW_JOYSTICK_14
actual inline val GLFW_JOYSTICK_15 get() = binding.glfw.GLFW_JOYSTICK_15
actual inline val GLFW_JOYSTICK_16 get() = binding.glfw.GLFW_JOYSTICK_16
actual inline val GLFW_JOYSTICK_LAST get() = binding.glfw.GLFW_JOYSTICK_LAST
actual inline val GLFW_GAMEPAD_BUTTON_A get() = binding.glfw.GLFW_GAMEPAD_BUTTON_A
actual inline val GLFW_GAMEPAD_BUTTON_B get() = binding.glfw.GLFW_GAMEPAD_BUTTON_B
actual inline val GLFW_GAMEPAD_BUTTON_X get() = binding.glfw.GLFW_GAMEPAD_BUTTON_X
actual inline val GLFW_GAMEPAD_BUTTON_Y get() = binding.glfw.GLFW_GAMEPAD_BUTTON_Y
actual inline val GLFW_GAMEPAD_BUTTON_LEFT_BUMPER get() = binding.glfw.GLFW_GAMEPAD_BUTTON_LEFT_BUMPER
actual inline val GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER get() = binding.glfw.GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER
actual inline val GLFW_GAMEPAD_BUTTON_BACK get() = binding.glfw.GLFW_GAMEPAD_BUTTON_BACK
actual inline val GLFW_GAMEPAD_BUTTON_START get() = binding.glfw.GLFW_GAMEPAD_BUTTON_START
actual inline val GLFW_GAMEPAD_BUTTON_GUIDE get() = binding.glfw.GLFW_GAMEPAD_BUTTON_GUIDE
actual inline val GLFW_GAMEPAD_BUTTON_LEFT_THUMB get() = binding.glfw.GLFW_GAMEPAD_BUTTON_LEFT_THUMB
actual inline val GLFW_GAMEPAD_BUTTON_RIGHT_THUMB get() = binding.glfw.GLFW_GAMEPAD_BUTTON_RIGHT_THUMB
actual inline val GLFW_GAMEPAD_BUTTON_DPAD_UP get() = binding.glfw.GLFW_GAMEPAD_BUTTON_DPAD_UP
actual inline val GLFW_GAMEPAD_BUTTON_DPAD_RIGHT get() = binding.glfw.GLFW_GAMEPAD_BUTTON_DPAD_RIGHT
actual inline val GLFW_GAMEPAD_BUTTON_DPAD_DOWN get() = binding.glfw.GLFW_GAMEPAD_BUTTON_DPAD_DOWN
actual inline val GLFW_GAMEPAD_BUTTON_DPAD_LEFT get() = binding.glfw.GLFW_GAMEPAD_BUTTON_DPAD_LEFT
actual inline val GLFW_GAMEPAD_BUTTON_LAST get() = binding.glfw.GLFW_GAMEPAD_BUTTON_LAST
actual inline val GLFW_GAMEPAD_BUTTON_CROSS get() = binding.glfw.GLFW_GAMEPAD_BUTTON_CROSS
actual inline val GLFW_GAMEPAD_BUTTON_CIRCLE get() = binding.glfw.GLFW_GAMEPAD_BUTTON_CIRCLE
actual inline val GLFW_GAMEPAD_BUTTON_SQUARE get() = binding.glfw.GLFW_GAMEPAD_BUTTON_SQUARE
actual inline val GLFW_GAMEPAD_BUTTON_TRIANGLE get() = binding.glfw.GLFW_GAMEPAD_BUTTON_TRIANGLE
actual inline val GLFW_GAMEPAD_AXIS_LEFT_X get() = binding.glfw.GLFW_GAMEPAD_AXIS_LEFT_X
actual inline val GLFW_GAMEPAD_AXIS_LEFT_Y get() = binding.glfw.GLFW_GAMEPAD_AXIS_LEFT_Y
actual inline val GLFW_GAMEPAD_AXIS_RIGHT_X get() = binding.glfw.GLFW_GAMEPAD_AXIS_RIGHT_X
actual inline val GLFW_GAMEPAD_AXIS_RIGHT_Y get() = binding.glfw.GLFW_GAMEPAD_AXIS_RIGHT_Y
actual inline val GLFW_GAMEPAD_AXIS_LEFT_TRIGGER get() = binding.glfw.GLFW_GAMEPAD_AXIS_LEFT_TRIGGER
actual inline val GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER get() = binding.glfw.GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER
actual inline val GLFW_GAMEPAD_AXIS_LAST get() = binding.glfw.GLFW_GAMEPAD_AXIS_LAST
actual inline val GLFW_NO_ERROR get() = binding.glfw.GLFW_NO_ERROR
actual inline val GLFW_NOT_INITIALIZED get() = binding.glfw.GLFW_NOT_INITIALIZED
actual inline val GLFW_NO_CURRENT_CONTEXT get() = binding.glfw.GLFW_NO_CURRENT_CONTEXT
actual inline val GLFW_INVALID_ENUM get() = binding.glfw.GLFW_INVALID_ENUM
actual inline val GLFW_INVALID_VALUE get() = binding.glfw.GLFW_INVALID_VALUE
actual inline val GLFW_OUT_OF_MEMORY get() = binding.glfw.GLFW_OUT_OF_MEMORY
actual inline val GLFW_API_UNAVAILABLE get() = binding.glfw.GLFW_API_UNAVAILABLE
actual inline val GLFW_VERSION_UNAVAILABLE get() = binding.glfw.GLFW_VERSION_UNAVAILABLE
actual inline val GLFW_PLATFORM_ERROR get() = binding.glfw.GLFW_PLATFORM_ERROR
actual inline val GLFW_FORMAT_UNAVAILABLE get() = binding.glfw.GLFW_FORMAT_UNAVAILABLE
actual inline val GLFW_NO_WINDOW_CONTEXT get() = binding.glfw.GLFW_NO_WINDOW_CONTEXT
actual inline val GLFW_FOCUSED get() = binding.glfw.GLFW_FOCUSED
actual inline val GLFW_ICONIFIED get() = binding.glfw.GLFW_ICONIFIED
actual inline val GLFW_RESIZABLE get() = binding.glfw.GLFW_RESIZABLE
actual inline val GLFW_VISIBLE get() = binding.glfw.GLFW_VISIBLE
actual inline val GLFW_DECORATED get() = binding.glfw.GLFW_DECORATED
actual inline val GLFW_AUTO_ICONIFY get() = binding.glfw.GLFW_AUTO_ICONIFY
actual inline val GLFW_FLOATING get() = binding.glfw.GLFW_FLOATING
actual inline val GLFW_MAXIMIZED get() = binding.glfw.GLFW_MAXIMIZED
actual inline val GLFW_CENTER_CURSOR get() = binding.glfw.GLFW_CENTER_CURSOR
actual inline val GLFW_TRANSPARENT_FRAMEBUFFER get() = binding.glfw.GLFW_TRANSPARENT_FRAMEBUFFER
actual inline val GLFW_HOVERED get() = binding.glfw.GLFW_HOVERED
actual inline val GLFW_CURSOR get() = binding.glfw.GLFW_CURSOR
actual inline val GLFW_STICKY_KEYS get() = binding.glfw.GLFW_STICKY_KEYS
actual inline val GLFW_STICKY_MOUSE_BUTTONS get() = binding.glfw.GLFW_STICKY_MOUSE_BUTTONS
actual inline val GLFW_LOCK_KEY_MODS get() = binding.glfw.GLFW_LOCK_KEY_MODS
actual inline val GLFW_CURSOR_NORMAL get() = binding.glfw.GLFW_CURSOR_NORMAL
actual inline val GLFW_CURSOR_HIDDEN get() = binding.glfw.GLFW_CURSOR_HIDDEN
actual inline val GLFW_CURSOR_DISABLED get() = binding.glfw.GLFW_CURSOR_DISABLED
actual inline val GLFW_ARROW_CURSOR get() = binding.glfw.GLFW_ARROW_CURSOR
actual inline val GLFW_IBEAM_CURSOR get() = binding.glfw.GLFW_IBEAM_CURSOR
actual inline val GLFW_CROSSHAIR_CURSOR get() = binding.glfw.GLFW_CROSSHAIR_CURSOR
actual inline val GLFW_HAND_CURSOR get() = binding.glfw.GLFW_HAND_CURSOR
actual inline val GLFW_HRESIZE_CURSOR get() = binding.glfw.GLFW_HRESIZE_CURSOR
actual inline val GLFW_VRESIZE_CURSOR get() = binding.glfw.GLFW_VRESIZE_CURSOR
actual inline val GLFW_CONNECTED get() = binding.glfw.GLFW_CONNECTED
actual inline val GLFW_DISCONNECTED get() = binding.glfw.GLFW_DISCONNECTED
actual inline val GLFW_JOYSTICK_HAT_BUTTONS get() = binding.glfw.GLFW_JOYSTICK_HAT_BUTTONS
actual inline val GLFW_COCOA_CHDIR_RESOURCES get() = binding.glfw.GLFW_COCOA_CHDIR_RESOURCES
actual inline val GLFW_COCOA_MENUBAR get() = binding.glfw.GLFW_COCOA_MENUBAR
actual inline val GLFW_DONT_CARE get() = binding.glfw.GLFW_DONT_CARE
actual inline val GLFW_RED_BITS get() = binding.glfw.GLFW_RED_BITS
actual inline val GLFW_GREEN_BITS get() = binding.glfw.GLFW_GREEN_BITS
actual inline val GLFW_BLUE_BITS get() = binding.glfw.GLFW_BLUE_BITS
actual inline val GLFW_ALPHA_BITS get() = binding.glfw.GLFW_ALPHA_BITS
actual inline val GLFW_DEPTH_BITS get() = binding.glfw.GLFW_DEPTH_BITS
actual inline val GLFW_STENCIL_BITS get() = binding.glfw.GLFW_STENCIL_BITS
actual inline val GLFW_ACCUM_RED_BITS get() = binding.glfw.GLFW_ACCUM_RED_BITS
actual inline val GLFW_ACCUM_GREEN_BITS get() = binding.glfw.GLFW_ACCUM_GREEN_BITS
actual inline val GLFW_ACCUM_BLUE_BITS get() = binding.glfw.GLFW_ACCUM_BLUE_BITS
actual inline val GLFW_ACCUM_ALPHA_BITS get() = binding.glfw.GLFW_ACCUM_ALPHA_BITS
actual inline val GLFW_AUX_BUFFERS get() = binding.glfw.GLFW_AUX_BUFFERS
actual inline val GLFW_STEREO get() = binding.glfw.GLFW_STEREO
actual inline val GLFW_SAMPLES get() = binding.glfw.GLFW_SAMPLES
actual inline val GLFW_SRGB_CAPABLE get() = binding.glfw.GLFW_SRGB_CAPABLE
actual inline val GLFW_REFRESH_RATE get() = binding.glfw.GLFW_REFRESH_RATE
actual inline val GLFW_DOUBLEBUFFER get() = binding.glfw.GLFW_DOUBLEBUFFER
actual inline val GLFW_CLIENT_API get() = binding.glfw.GLFW_CLIENT_API
actual inline val GLFW_CONTEXT_VERSION_MAJOR get() = binding.glfw.GLFW_CONTEXT_VERSION_MAJOR
actual inline val GLFW_CONTEXT_VERSION_MINOR get() = binding.glfw.GLFW_CONTEXT_VERSION_MINOR
actual inline val GLFW_CONTEXT_REVISION get() = binding.glfw.GLFW_CONTEXT_REVISION
actual inline val GLFW_CONTEXT_ROBUSTNESS get() = binding.glfw.GLFW_CONTEXT_ROBUSTNESS
actual inline val GLFW_OPENGL_FORWARD_COMPAT get() = binding.glfw.GLFW_OPENGL_FORWARD_COMPAT
actual inline val GLFW_OPENGL_DEBUG_CONTEXT get() = binding.glfw.GLFW_OPENGL_DEBUG_CONTEXT
actual inline val GLFW_OPENGL_PROFILE get() = binding.glfw.GLFW_OPENGL_PROFILE
actual inline val GLFW_CONTEXT_RELEASE_BEHAVIOR get() = binding.glfw.GLFW_CONTEXT_RELEASE_BEHAVIOR
actual inline val GLFW_CONTEXT_NO_ERROR get() = binding.glfw.GLFW_CONTEXT_NO_ERROR
actual inline val GLFW_CONTEXT_CREATION_API get() = binding.glfw.GLFW_CONTEXT_CREATION_API
actual inline val GLFW_COCOA_RETINA_FRAMEBUFFER get() = binding.glfw.GLFW_COCOA_RETINA_FRAMEBUFFER
actual inline val GLFW_COCOA_FRAME_NAME get() = binding.glfw.GLFW_COCOA_FRAME_NAME
actual inline val GLFW_COCOA_GRAPHICS_SWITCHING get() = binding.glfw.GLFW_COCOA_GRAPHICS_SWITCHING
actual inline val GLFW_X11_CLASS_NAME get() = binding.glfw.GLFW_X11_CLASS_NAME
actual inline val GLFW_X11_INSTANCE_NAME get() = binding.glfw.GLFW_X11_INSTANCE_NAME
actual inline val GLFW_NO_API get() = binding.glfw.GLFW_NO_API
actual inline val GLFW_OPENGL_API get() = binding.glfw.GLFW_OPENGL_API
actual inline val GLFW_OPENGL_ES_API get() = binding.glfw.GLFW_OPENGL_ES_API
actual inline val GLFW_NO_ROBUSTNESS get() = binding.glfw.GLFW_NO_ROBUSTNESS
actual inline val GLFW_NO_RESET_NOTIFICATION get() = binding.glfw.GLFW_NO_RESET_NOTIFICATION
actual inline val GLFW_LOSE_CONTEXT_ON_RESET get() = binding.glfw.GLFW_LOSE_CONTEXT_ON_RESET
actual inline val GLFW_OPENGL_ANY_PROFILE get() = binding.glfw.GLFW_OPENGL_ANY_PROFILE
actual inline val GLFW_OPENGL_CORE_PROFILE get() = binding.glfw.GLFW_OPENGL_CORE_PROFILE
actual inline val GLFW_OPENGL_COMPAT_PROFILE get() = binding.glfw.GLFW_OPENGL_COMPAT_PROFILE
actual inline val GLFW_ANY_RELEASE_BEHAVIOR get() = binding.glfw.GLFW_ANY_RELEASE_BEHAVIOR
actual inline val GLFW_RELEASE_BEHAVIOR_FLUSH get() = binding.glfw.GLFW_RELEASE_BEHAVIOR_FLUSH
actual inline val GLFW_RELEASE_BEHAVIOR_NONE get() = binding.glfw.GLFW_RELEASE_BEHAVIOR_NONE
actual inline val GLFW_NATIVE_CONTEXT_API get() = binding.glfw.GLFW_NATIVE_CONTEXT_API
actual inline val GLFW_EGL_CONTEXT_API get() = binding.glfw.GLFW_EGL_CONTEXT_API
actual inline val GLFW_OSMESA_CONTEXT_API get() = binding.glfw.GLFW_OSMESA_CONTEXT_API

actual inline fun glfwInit(
) = binding.glfw.glfwInit(
) != 0

actual inline fun glfwTerminate(
) = binding.glfw.glfwTerminate(
)

actual inline fun glfwInitHint(
    hint: Int, value: Int
) = binding.glfw.glfwInitHint(
    hint, value
)

actual inline fun glfwGetVersion(
    major: IntArray?, minor: IntArray?, rev: IntArray?
) = major.usePinnedOrNull { majorBuffer ->
    minor.usePinnedOrNull { minorBuffer ->
        rev.usePinnedOrNull { revBuffer ->
            binding.glfw.glfwGetVersion(
                majorBuffer?.toCPointer(), minorBuffer?.toCPointer(),
                revBuffer?.toCPointer()
            )
        }
    }
}

actual inline fun glfwGetVersionString(
) = binding.glfw.glfwGetVersionString(
)!!.toKString()

actual inline fun glfwGetError(
    description: Array<String?>?
) = memScoped {
    val descriptionBuffer =
        if (description == null) null else allocPointerTo<ByteVar>()
    val result = binding.glfw.glfwGetError(descriptionBuffer?.ptr)
    if (description != null) {
        description[0] = descriptionBuffer?.value?.toKString()
    }
    result
}

actual inline fun glfwSetErrorCallback(
    cbfun: GLFWErrorCallback?
) = binding.glfw.glfwSetErrorCallback(
    cbfun?.register?.invoke()
)?.let { GLFWErrorCallback(it) }

actual inline fun glfwGetMonitors(
) = memScoped {
    val length = alloc<IntVar>()
    binding.glfw.glfwGetMonitors(
        length.ptr
    )?.let { GLFWMonitorBuffer(it, length.value) }
}

actual inline fun glfwGetPrimaryMonitor(
) = binding.glfw.glfwGetPrimaryMonitor(
).let { GLFWMonitor(it) }

actual inline fun glfwGetMonitorPos(
    monitor: GLFWMonitor, xpos: IntArray?, ypos: IntArray?
) = xpos.usePinnedOrNull { xposBuffer ->
    ypos.usePinnedOrNull { yposBuffer ->
        binding.glfw.glfwGetMonitorPos(
            monitor.ptr, xposBuffer?.toCPointer(), yposBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwGetMonitorPhysicalSize(
    monitor: GLFWMonitor, widthMM: IntArray?, heightMM: IntArray?
) = widthMM.usePinnedOrNull { widthMMBuffer ->
    heightMM.usePinnedOrNull { heightMMBuffer ->
        binding.glfw.glfwGetMonitorPhysicalSize(
            monitor.ptr, widthMMBuffer?.toCPointer(),
            heightMMBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwGetMonitorContentScale(
    monitor: GLFWMonitor, xscale: FloatArray?, yscale: FloatArray?
) = xscale.usePinnedOrNull { xscaleBuffer ->
    yscale.usePinnedOrNull { yscaleBuffer ->
        binding.glfw.glfwGetMonitorContentScale(
            monitor.ptr, xscaleBuffer?.toCPointer(), yscaleBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwGetMonitorName(
    monitor: GLFWMonitor
) = binding.glfw.glfwGetMonitorName(
    monitor.ptr
)?.toKString()

actual inline fun glfwSetMonitorUserPointer(
    monitor: GLFWMonitor, pointer: Long
) = binding.glfw.glfwSetMonitorUserPointer(
    monitor.ptr, pointer.toCPointer<ByteVar>()
)

actual inline fun glfwGetMonitorUserPointer(
    monitor: GLFWMonitor
) = binding.glfw.glfwGetMonitorUserPointer(
    monitor.ptr
).toLong()

actual inline fun glfwSetMonitorCallback(
    cbfun: GLFWMonitorCallback?
) = binding.glfw.glfwSetMonitorCallback(
    cbfun?.register?.invoke()
)?.let { GLFWMonitorCallback(it) }

actual inline fun glfwGetVideoModes(
    monitor: GLFWMonitor
) = memScoped {
    val length = alloc<IntVar>()
    binding.glfw.glfwGetVideoModes(
        monitor.ptr, length.ptr
    )?.let { GLFWVidModeBuffer(it, length.value) }
}

actual inline fun glfwGetVideoMode(
    monitor: GLFWMonitor
) = binding.glfw.glfwGetVideoMode(
    monitor.ptr
)?.let { GLFWVidMode(it) }

actual inline fun glfwSetGamma(
    monitor: GLFWMonitor, gamma: Float
) = binding.glfw.glfwSetGamma(
    monitor.ptr, gamma
)

actual inline fun glfwGetGammaRamp(
    monitor: GLFWMonitor
) = binding.glfw.glfwGetGammaRamp(
    monitor.ptr
)?.let { GLFWGammaRamp(it) }

actual inline fun glfwSetGammaRamp(
    monitor: GLFWMonitor, ramp: GLFWGammaRamp
) = binding.glfw.glfwSetGammaRamp(
    monitor.ptr, ramp.ptr
)

actual inline fun glfwDefaultWindowHints(
) = binding.glfw.glfwDefaultWindowHints(
)

actual inline fun glfwWindowHint(
    hint: Int, value: Int
) = binding.glfw.glfwWindowHint(
    hint, value
)

actual inline fun glfwWindowHintString(
    hint: Int, value: String
) = binding.glfw.glfwWindowHintString(
    hint, value
)

actual inline fun glfwCreateWindow(
    width: Int, height: Int, title: String, monitor: GLFWMonitor, share: Long
) = binding.glfw.glfwCreateWindow(
    width, height, title, monitor.ptr, share.toCPointer()
).let { GLFWWindow(it) }

actual inline fun glfwDestroyWindow(
    window: GLFWWindow
) = binding.glfw.glfwDestroyWindow(
    window.ptr
)

actual inline fun glfwWindowShouldClose(
    window: GLFWWindow
) = binding.glfw.glfwWindowShouldClose(
    window.ptr
) != 0

actual inline fun glfwSetWindowTitle(
    window: GLFWWindow, title: String
) = binding.glfw.glfwSetWindowTitle(
    window.ptr, title
)

actual inline fun glfwSetWindowIcon(
    window: GLFWWindow, images: GLFWImageBuffer
) = binding.glfw.glfwSetWindowIcon(
    window.ptr, images.size, images.ptr
)

actual inline fun glfwGetWindowPos(
    window: GLFWWindow, xpos: IntArray?, ypos: IntArray?
) = xpos.usePinnedOrNull { xposBuffer ->
    ypos.usePinnedOrNull { yposBuffer ->
        binding.glfw.glfwGetWindowPos(
            window.ptr, xposBuffer?.toCPointer(), yposBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwSetWindowPos(
    window: GLFWWindow, xpos: Int, ypos: Int
) = binding.glfw.glfwSetWindowPos(
    window.ptr, xpos, ypos
)

actual inline fun glfwGetWindowSize(
    window: GLFWWindow, width: IntArray?, height: IntArray?
) = width.usePinnedOrNull { widthBuffer ->
    height.usePinnedOrNull { heightBuffer ->
        binding.glfw.glfwGetWindowSize(
            window.ptr, widthBuffer?.toCPointer(), heightBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwSetWindowSizeLimits(
    window: GLFWWindow,
    minwidth: Int, minheight: Int,
    maxwidth: Int, maxheight: Int
) = binding.glfw.glfwSetWindowSizeLimits(
    window.ptr, minwidth, minheight, maxwidth, maxheight
)

actual inline fun glfwSetWindowAspectRatio(
    window: GLFWWindow, numer: Int, denom: Int
) = binding.glfw.glfwSetWindowAspectRatio(
    window.ptr, numer, denom
)

actual inline fun glfwSetWindowSize(
    window: GLFWWindow, width: Int, height: Int
) = binding.glfw.glfwSetWindowSize(
    window.ptr, width, height
)

actual inline fun glfwGetFramebufferSize(
    window: GLFWWindow, width: IntArray?, height: IntArray?
) = width.usePinnedOrNull { widthBuffer ->
    height.usePinnedOrNull { heightBuffer ->
        binding.glfw.glfwGetFramebufferSize(
            window.ptr, widthBuffer?.toCPointer(), heightBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwGetWindowFrameSize(
    window: GLFWWindow,
    left: IntArray?, top: IntArray?,
    right: IntArray?, bottom: IntArray?
) = left.usePinnedOrNull { leftBuffer ->
    top.usePinnedOrNull { topBuffer ->
        right.usePinnedOrNull { rightBuffer ->
            bottom.usePinnedOrNull { bottomBuffer ->
                binding.glfw.glfwGetWindowFrameSize(
                    window.ptr, leftBuffer?.toCPointer(),
                    topBuffer?.toCPointer(), rightBuffer?.toCPointer(),
                    bottomBuffer?.toCPointer()
                )
            }
        }
    }
}

actual inline fun glfwGetWindowContentScale(
    window: GLFWWindow, xscale: FloatArray?, yscale: FloatArray?
) = xscale.usePinnedOrNull { xscaleBuffer ->
    yscale.usePinnedOrNull { yscaleBuffer ->
        binding.glfw.glfwGetWindowContentScale(
            window.ptr, xscaleBuffer?.toCPointer(), yscaleBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwGetWindowOpacity(
    window: GLFWWindow
) = binding.glfw.glfwGetWindowOpacity(
    window.ptr
)

actual inline fun glfwSetWindowOpacity(
    window: GLFWWindow, opacity: Float
) = binding.glfw.glfwSetWindowOpacity(
    window.ptr, opacity
)

actual inline fun glfwIconifyWindow(
    window: GLFWWindow
) = binding.glfw.glfwIconifyWindow(
    window.ptr
)

actual inline fun glfwRestoreWindow(
    window: GLFWWindow
) = binding.glfw.glfwRestoreWindow(
    window.ptr
)

actual inline fun glfwMaximizeWindow(
    window: GLFWWindow
) = binding.glfw.glfwMaximizeWindow(
    window.ptr
)

actual inline fun glfwShowWindow(
    window: GLFWWindow
) = binding.glfw.glfwShowWindow(
    window.ptr
)

actual inline fun glfwHideWindow(
    window: GLFWWindow
) = binding.glfw.glfwHideWindow(
    window.ptr
)

actual inline fun glfwFocusWindow(
    window: GLFWWindow
) = binding.glfw.glfwFocusWindow(
    window.ptr
)

actual inline fun glfwRequestWindowAttention(
    window: GLFWWindow
) = binding.glfw.glfwRequestWindowAttention(
    window.ptr
)

actual inline fun glfwGetWindowMonitor(
    window: GLFWWindow
) = binding.glfw.glfwGetWindowMonitor(
    window.ptr
).let { GLFWMonitor(it) }

actual inline fun glfwSetWindowMonitor(
    window: GLFWWindow, monitor: GLFWMonitor,
    xpos: Int, ypos: Int, width: Int, height: Int, refreshRate: Int
) = binding.glfw.glfwSetWindowMonitor(
    window.ptr, monitor.ptr, xpos, ypos, width, height, refreshRate
)

actual inline fun glfwGetWindowAttrib(
    window: GLFWWindow, attrib: Int
) = binding.glfw.glfwGetWindowAttrib(
    window.ptr, attrib
)

actual inline fun glfwSetWindowAttrib(
    window: GLFWWindow, attrib: Int, value: Int
) = binding.glfw.glfwSetWindowAttrib(
    window.ptr, attrib, value
)

actual inline fun glfwSetWindowUserPointer(
    window: GLFWWindow, pointer: Long
) = binding.glfw.glfwSetWindowUserPointer(
    window.ptr, pointer.toCPointer<ByteVar>()
)

actual inline fun glfwGetWindowUserPointer(
    window: GLFWWindow
) = binding.glfw.glfwGetWindowUserPointer(
    window.ptr
).toLong()

actual inline fun glfwSetWindowPosCallback(
    window: GLFWWindow, cbfun: GLFWWindowPosCallback?
) = binding.glfw.glfwSetWindowPosCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowPosCallback(it) }

actual inline fun glfwSetWindowSizeCallback(
    window: GLFWWindow, cbfun: GLFWWindowSizeCallback?
) = binding.glfw.glfwSetWindowSizeCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowSizeCallback(it) }

actual inline fun glfwSetWindowCloseCallback(
    window: GLFWWindow, cbfun: GLFWWindowCloseCallback?
) = binding.glfw.glfwSetWindowCloseCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowCloseCallback(it) }

actual inline fun glfwSetWindowRefreshCallback(
    window: GLFWWindow, cbfun: GLFWWindowRefreshCallback?
) = binding.glfw.glfwSetWindowRefreshCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowRefreshCallback(it) }

actual inline fun glfwSetWindowFocusCallback(
    window: GLFWWindow, cbfun: GLFWWindowFocusCallback?
) = binding.glfw.glfwSetWindowFocusCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowFocusCallback(it) }

actual inline fun glfwSetWindowIconifyCallback(
    window: GLFWWindow, cbfun: GLFWWindowIconifyCallback?
) = binding.glfw.glfwSetWindowIconifyCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowIconifyCallback(it) }

actual inline fun glfwSetWindowMaximizeCallback(
    window: GLFWWindow, cbfun: GLFWWindowMaximizeCallback?
) = binding.glfw.glfwSetWindowMaximizeCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowMaximizeCallback(it) }

actual inline fun glfwSetFramebufferSizeCallback(
    window: GLFWWindow, cbfun: GLFWFramebufferSizeCallback?
) = binding.glfw.glfwSetFramebufferSizeCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWFramebufferSizeCallback(it) }

actual inline fun glfwSetWindowContentScaleCallback(
    window: GLFWWindow, cbfun: GLFWWindowContentScaleCallback?
) = binding.glfw.glfwSetWindowContentScaleCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWWindowContentScaleCallback(it) }

actual inline fun glfwPollEvents(
) = binding.glfw.glfwPollEvents(
)

actual inline fun glfwWaitEvents(
) = binding.glfw.glfwWaitEvents(
)

actual inline fun glfwWaitEventsTimeout(
    timeout: Double
) = binding.glfw.glfwWaitEventsTimeout(
    timeout
)

actual inline fun glfwPostEmptyEvent(
) = binding.glfw.glfwPostEmptyEvent(
)

actual inline fun glfwGetInputMode(
    window: GLFWWindow, mode: Int
) = binding.glfw.glfwGetInputMode(
    window.ptr, mode
)

actual inline fun glfwSetInputMode(
    window: GLFWWindow, mode: Int, value: Int
) = binding.glfw.glfwSetInputMode(
    window.ptr, mode, value
)

actual inline fun glfwGetKeyName(
    key: Int, scancode: Int
) = binding.glfw.glfwGetKeyName(
    key, scancode
)?.toKString()

actual inline fun glfwGetKeyScancode(
    key: Int
) = binding.glfw.glfwGetKeyScancode(
    key
)

actual inline fun glfwGetKey(
    window: GLFWWindow, key: Int
) = binding.glfw.glfwGetKey(
    window.ptr, key
)

actual inline fun glfwGetMouseButton(
    window: GLFWWindow, button: Int
) = binding.glfw.glfwGetMouseButton(
    window.ptr, button
)

actual inline fun glfwGetCursorPos(
    window: GLFWWindow, xpos: DoubleArray?, ypos: DoubleArray?
) = xpos.usePinnedOrNull { xposBuffer ->
    ypos.usePinnedOrNull { yposBuffer ->
        binding.glfw.glfwGetCursorPos(
            window.ptr, xposBuffer?.toCPointer(), yposBuffer?.toCPointer()
        )
    }
}

actual inline fun glfwSetCursorPos(
    window: GLFWWindow, xpos: Double, ypos: Double
) = binding.glfw.glfwSetCursorPos(
    window.ptr, xpos, ypos
)

actual inline fun glfwCreateCursor(
    image: GLFWImage, xhot: Int, yhot: Int
) = binding.glfw.glfwCreateCursor(
    image.ptr, xhot, yhot
).let { GLFWCursor(it) }

actual inline fun glfwCreateStandardCursor(
    shape: Int
) = binding.glfw.glfwCreateStandardCursor(
    shape
).let { GLFWCursor(it) }

actual inline fun glfwDestroyCursor(
    cursor: GLFWCursor
) = binding.glfw.glfwDestroyCursor(
    cursor.ptr
)

actual inline fun glfwSetCursor(
    window: GLFWWindow, cursor: GLFWCursor
) = binding.glfw.glfwSetCursor(
    window.ptr, cursor.ptr
)

actual inline fun glfwSetKeyCallback(
    window: GLFWWindow, cbfun: GLFWKeyCallback?
) = binding.glfw.glfwSetKeyCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWKeyCallback(it) }

actual inline fun glfwSetCharCallback(
    window: GLFWWindow, cbfun: GLFWCharCallback?
) = binding.glfw.glfwSetCharCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWCharCallback(it) }

actual inline fun glfwSetCharModsCallback(
    window: GLFWWindow, cbfun: GLFWCharModsCallback?
) = binding.glfw.glfwSetCharModsCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWCharModsCallback(it) }

actual inline fun glfwSetMouseButtonCallback(
    window: GLFWWindow, cbfun: GLFWMouseButtonCallback?
) = binding.glfw.glfwSetMouseButtonCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWMouseButtonCallback(it) }

actual inline fun glfwSetCursorPosCallback(
    window: GLFWWindow, cbfun: GLFWCursorPosCallback?
) = binding.glfw.glfwSetCursorPosCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWCursorPosCallback(it) }

actual inline fun glfwSetCursorEnterCallback(
    window: GLFWWindow, cbfun: GLFWCursorEnterCallback?
) = binding.glfw.glfwSetCursorEnterCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWCursorEnterCallback(it) }

actual inline fun glfwSetScrollCallback(
    window: GLFWWindow, cbfun: GLFWScrollCallback?
) = binding.glfw.glfwSetScrollCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWScrollCallback(it) }

actual inline fun glfwSetDropCallback(
    window: GLFWWindow, cbfun: GLFWDropCallback?
) = binding.glfw.glfwSetDropCallback(
    window.ptr, cbfun?.register?.invoke(window)
)?.let { GLFWDropCallback(it) }

actual inline fun glfwJoystickPresent(
    jid: Int
) = binding.glfw.glfwJoystickPresent(
    jid
) != 0

actual inline fun glfwGetJoystickAxes(
    jid: Int
) = memScoped {
    val length = alloc<IntVar>()
    binding.glfw.glfwGetJoystickAxes(
        jid, length.ptr
    )?.let { FloatReadBuffer(it, length.value) }
}

actual inline fun glfwGetJoystickButtons(
    jid: Int
) = memScoped {
    val length = alloc<IntVar>()
    binding.glfw.glfwGetJoystickButtons(
        jid, length.ptr
    )?.let { ByteReadBuffer(it.reinterpret(), length.value) }
}

actual inline fun glfwGetJoystickHats(
    jid: Int
) = memScoped {
    val length = alloc<IntVar>()
    binding.glfw.glfwGetJoystickHats(
        jid, length.ptr
    )?.let { ByteReadBuffer(it.reinterpret(), length.value) }
}

actual inline fun glfwGetJoystickName(
    jid: Int
) = binding.glfw.glfwGetJoystickName(
    jid
)?.toKString()

actual inline fun glfwGetJoystickGUID(
    jid: Int
) = binding.glfw.glfwGetJoystickGUID(
    jid
)?.toKString()

actual inline fun glfwSetJoystickUserPointer(
    jid: Int, pointer: Long
) = binding.glfw.glfwSetJoystickUserPointer(
    jid, pointer.toCPointer<ByteVar>()
)

actual inline fun glfwGetJoystickUserPointer(
    jid: Int
) = binding.glfw.glfwGetJoystickUserPointer(
    jid
).toLong()

actual inline fun glfwJoystickIsGamepad(
    jid: Int
) = binding.glfw.glfwJoystickIsGamepad(
    jid
) != 0

actual inline fun glfwSetJoystickCallback(
    cbfun: GLFWJoystickCallback?
) = binding.glfw.glfwSetJoystickCallback(
    cbfun?.register?.invoke()
)?.let { GLFWJoystickCallback(it) }

actual inline fun glfwUpdateGamepadMappings(
    string: String
) = binding.glfw.glfwUpdateGamepadMappings(
    string
) != 0

actual inline fun glfwGetGamepadName(
    jid: Int
) = binding.glfw.glfwGetGamepadName(
    jid
)?.toKString()

actual inline fun glfwGetGamepadState(
    jid: Int, state: GLFWGamepadState
) = binding.glfw.glfwGetGamepadState(
    jid, state.ptr
) != 0

actual inline fun glfwSetClipboardString(
    window: GLFWWindow, string: String
) = binding.glfw.glfwSetClipboardString(
    window.ptr, string
)

actual inline fun glfwGetClipboardString(
    window: GLFWWindow
) = binding.glfw.glfwGetClipboardString(
    window.ptr
)?.toKString()

actual inline fun glfwGetTime(
) = binding.glfw.glfwGetTime()

actual inline fun glfwSetTime(
    time: Double
) = binding.glfw.glfwSetTime(
    time
)

actual inline fun glfwGetTimerValue(
) = binding.glfw.glfwGetTimerValue(
).toLong()

actual inline fun glfwGetTimerFrequency(
) = binding.glfw.glfwGetTimerFrequency(
).toLong()

actual inline fun glfwMakeContextCurrent(
    window: GLFWWindow
) = binding.glfw.glfwMakeContextCurrent(
    window.ptr
)

actual inline fun glfwGetCurrentContext(
) = binding.glfw.glfwGetCurrentContext(
).let { GLFWWindow(it) }

actual inline fun glfwSwapBuffers(
    window: GLFWWindow
) = binding.glfw.glfwSwapBuffers(
    window.ptr
)

actual inline fun glfwSwapInterval(
    interval: Int
) = binding.glfw.glfwSwapInterval(
    interval
)
