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

package net.gitout.ktbindings.gl

actual inline val GL_FUNC_ADD: GLenum
    get() = platform.OpenGL3.GL_FUNC_ADD
actual inline val GL_FUNC_SUBTRACT: GLenum
    get() = platform.OpenGL3.GL_FUNC_SUBTRACT
actual inline val GL_FUNC_REVERSE_SUBTRACT: GLenum
    get() = platform.OpenGL3.GL_FUNC_REVERSE_SUBTRACT
actual inline val GL_BLEND_DST_RGB: GLenum
    get() = platform.OpenGL3.GL_BLEND_DST_RGB
actual inline val GL_BLEND_SRC_RGB: GLenum
    get() = platform.OpenGL3.GL_BLEND_SRC_RGB
actual inline val GL_BLEND_DST_ALPHA: GLenum
    get() = platform.OpenGL3.GL_BLEND_DST_ALPHA
actual inline val GL_BLEND_SRC_ALPHA: GLenum
    get() = platform.OpenGL3.GL_BLEND_SRC_ALPHA
actual inline val GL_CONSTANT_COLOR: GLenum
    get() = platform.OpenGL3.GL_CONSTANT_COLOR
actual inline val GL_ONE_MINUS_CONSTANT_COLOR: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_CONSTANT_COLOR
actual inline val GL_CONSTANT_ALPHA: GLenum
    get() = platform.OpenGL3.GL_CONSTANT_ALPHA
actual inline val GL_ONE_MINUS_CONSTANT_ALPHA: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_CONSTANT_ALPHA
actual inline val GL_INCR_WRAP: GLenum
    get() = platform.OpenGL3.GL_INCR_WRAP
actual inline val GL_DECR_WRAP: GLenum
    get() = platform.OpenGL3.GL_DECR_WRAP
actual inline val GL_MIRRORED_REPEAT: GLenum
    get() = platform.OpenGL3.GL_MIRRORED_REPEAT
actual inline val GL_DEPTH_COMPONENT16: GLenum
    get() = platform.OpenGL3.GL_DEPTH_COMPONENT16
actual inline val GL_MIN: GLenum
    get() = platform.OpenGL3.GL_MIN
actual inline val GL_MAX: GLenum
    get() = platform.OpenGL3.GL_MAX
actual inline val GL_DEPTH_COMPONENT24: GLenum
    get() = platform.OpenGL3.GL_DEPTH_COMPONENT24
actual inline val GL_MAX_TEXTURE_LOD_BIAS: GLenum
    get() = platform.OpenGL3.GL_MAX_TEXTURE_LOD_BIAS
actual inline val GL_TEXTURE_COMPARE_MODE: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_COMPARE_MODE
actual inline val GL_TEXTURE_COMPARE_FUNC: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_COMPARE_FUNC

actual inline fun GL14.glBlendColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = platform.OpenGL3.glBlendColor(
    red, green, blue, alpha
)

actual inline fun GL14.glBlendEquation(
    mode: GLenum
) = platform.OpenGL3.glBlendEquation(
    mode.toUInt()
)

actual inline fun GL14.glBlendFuncSeparate(
    srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum
) = platform.OpenGL3.glBlendFuncSeparate(
    srcRGB.toUInt(), dstRGB.toUInt(), srcAlpha.toUInt(), dstAlpha.toUInt()
)
