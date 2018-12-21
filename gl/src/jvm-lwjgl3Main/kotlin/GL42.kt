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

import org.lwjgl.opengl.GL42C as JGL42C

actual inline val GL_COPY_READ_BUFFER_BINDING: GLenum
    get() = JGL42C.GL_COPY_READ_BUFFER_BINDING
actual inline val GL_COPY_WRITE_BUFFER_BINDING: GLenum
    get() = JGL42C.GL_COPY_WRITE_BUFFER_BINDING
actual inline val GL_TRANSFORM_FEEDBACK_PAUSED: GLenum
    get() = JGL42C.GL_TRANSFORM_FEEDBACK_PAUSED
actual inline val GL_TRANSFORM_FEEDBACK_ACTIVE: GLenum
    get() = JGL42C.GL_TRANSFORM_FEEDBACK_ACTIVE
actual inline val GL_TEXTURE_IMMUTABLE_FORMAT: GLenum
    get() = JGL42C.GL_TEXTURE_IMMUTABLE_FORMAT

actual inline fun GL42.glGetInternalformativ(
    target: GLenum, internalformat: GLenum, pname: GLenum,
    params: sequence_GLint
) = JGL42C.glGetInternalformativ(
    target, internalformat, pname, params
)

actual inline fun GL42.glTexStorage2D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei
) = JGL42C.glTexStorage2D(
    target, levels, internalformat, width, height
)

actual inline fun GL42.glTexStorage3D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei
) = JGL42C.glTexStorage3D(
    target, levels, internalformat, width, height, depth
)