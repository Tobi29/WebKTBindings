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

@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.gl

import org.lwjgl.opengl.GL21C as JGL21C

actual inline val GL_PIXEL_PACK_BUFFER: GLenum
    get() = JGL21C.GL_PIXEL_PACK_BUFFER
actual inline val GL_PIXEL_UNPACK_BUFFER: GLenum
    get() = JGL21C.GL_PIXEL_UNPACK_BUFFER
actual inline val GL_PIXEL_PACK_BUFFER_BINDING: GLenum
    get() = JGL21C.GL_PIXEL_PACK_BUFFER_BINDING
actual inline val GL_PIXEL_UNPACK_BUFFER_BINDING: GLenum
    get() = JGL21C.GL_PIXEL_UNPACK_BUFFER_BINDING
actual inline val GL_FLOAT_MAT2x3: GLenum
    get() = JGL21C.GL_FLOAT_MAT2x3
actual inline val GL_FLOAT_MAT2x4: GLenum
    get() = JGL21C.GL_FLOAT_MAT2x4
actual inline val GL_FLOAT_MAT3x2: GLenum
    get() = JGL21C.GL_FLOAT_MAT3x2
actual inline val GL_FLOAT_MAT3x4: GLenum
    get() = JGL21C.GL_FLOAT_MAT3x4
actual inline val GL_FLOAT_MAT4x2: GLenum
    get() = JGL21C.GL_FLOAT_MAT4x2
actual inline val GL_FLOAT_MAT4x3: GLenum
    get() = JGL21C.GL_FLOAT_MAT4x3
actual inline val GL_SRGB: GLenum
    get() = JGL21C.GL_SRGB
actual inline val GL_SRGB8: GLenum
    get() = JGL21C.GL_SRGB8
actual inline val GL_SRGB8_ALPHA8: GLenum
    get() = JGL21C.GL_SRGB8_ALPHA8

actual inline fun GL21.glUniformMatrix3x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix3x2fv(
    location, transpose, data
)

actual inline fun GL21.glUniformMatrix4x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix4x2fv(
    location, transpose, data
)

actual inline fun GL21.glUniformMatrix2x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix2x3fv(
    location, transpose, data
)

actual inline fun GL21.glUniformMatrix4x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix4x3fv(
    location, transpose, data
)

actual inline fun GL21.glUniformMatrix2x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix2x4fv(
    location, transpose, data
)

actual inline fun GL21.glUniformMatrix3x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGL21C.glUniformMatrix3x4fv(
    location, transpose, data
)