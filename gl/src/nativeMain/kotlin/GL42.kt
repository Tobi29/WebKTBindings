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

import kotlinx.cinterop.usePinned
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_COPY_READ_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_COPY_READ_BUFFER_BINDING
actual inline val GL_COPY_WRITE_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_COPY_WRITE_BUFFER_BINDING
actual inline val GL_TRANSFORM_FEEDBACK_PAUSED: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_PAUSED
actual inline val GL_TRANSFORM_FEEDBACK_ACTIVE: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_ACTIVE
actual inline val GL_TEXTURE_IMMUTABLE_FORMAT: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_IMMUTABLE_FORMAT

actual inline fun GL42.glGetInternalformativ(
    target: GLenum, internalformat: GLenum, pname: GLenum,
    params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetInternalformativ(
        target.toUInt(), internalformat.toUInt(), pname.toUInt(),
        params.size, buffer.toCPointer()
    )
}

actual inline fun GL42.glTexStorage2D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei
) = platform.OpenGL3.glTexStorage2D(
    target.toUInt(), levels, internalformat.toUInt(), width, height
)

actual inline fun GL42.glTexStorage3D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei
) = platform.OpenGL3.glTexStorage3D(
    target.toUInt(), levels, internalformat.toUInt(), width, height, depth
)