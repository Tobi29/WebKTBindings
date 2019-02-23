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

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.readOrNull

actual inline val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
    get() = platform.OpenGL3.GL_ALIASED_LINE_WIDTH_RANGE
actual inline val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_SHORT_4_4_4_4
actual inline val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_SHORT_5_5_5_1
actual inline val GL_UNSIGNED_SHORT_5_6_5: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_SHORT_5_6_5
actual inline val GL_CLAMP_TO_EDGE: GLenum
    get() = platform.OpenGL3.GL_CLAMP_TO_EDGE
actual inline val GL_TEXTURE_BINDING_3D: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_BINDING_3D
actual inline val GL_UNPACK_SKIP_IMAGES: GLenum
    get() = platform.OpenGL3.GL_UNPACK_SKIP_IMAGES
actual inline val GL_UNPACK_IMAGE_HEIGHT: GLenum
    get() = platform.OpenGL3.GL_UNPACK_IMAGE_HEIGHT
actual inline val GL_TEXTURE_3D: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_3D
actual inline val GL_TEXTURE_WRAP_R: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_WRAP_R
actual inline val GL_MAX_3D_TEXTURE_SIZE: GLenum
    get() = platform.OpenGL3.GL_MAX_3D_TEXTURE_SIZE
actual inline val GL_UNSIGNED_INT_2_10_10_10_REV: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_2_10_10_10_REV
actual inline val GL_MAX_ELEMENTS_VERTICES: GLenum
    get() = platform.OpenGL3.GL_MAX_ELEMENTS_VERTICES
actual inline val GL_MAX_ELEMENTS_INDICES: GLenum
    get() = platform.OpenGL3.GL_MAX_ELEMENTS_INDICES
actual inline val GL_TEXTURE_MIN_LOD: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_MIN_LOD
actual inline val GL_TEXTURE_MAX_LOD: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_MAX_LOD
actual inline val GL_TEXTURE_BASE_LEVEL: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_BASE_LEVEL
actual inline val GL_TEXTURE_MAX_LEVEL: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_MAX_LEVEL

actual inline fun GL12.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
) = platform.OpenGL3.glStencilOp(
    fail.toUInt(), zfail.toUInt(), zpass.toUInt()
)

actual inline fun GL12.glTexImage3D(
    target: GLenum, level: GLint, internalformat: GLint, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, format: GLenum,
    type: GLenum, srcData: DataBuffer?
) = srcData.readOrNull { buffer ->
    platform.OpenGL3.glTexImage3D(
        target.toUInt(), level, internalformat, width, height, depth, border,
        format.toUInt(), type.toUInt(), buffer
    )
}

actual inline fun GL12.glTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, type: GLenum, srcData: DataBuffer
) = srcData.read { buffer ->
    platform.OpenGL3.glTexSubImage3D(
        target.toUInt(), level, xoffset, yoffset, zoffset, width, height, depth,
        format.toUInt(), type.toUInt(), buffer
    )
}

actual inline fun GL12.glCopyTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    x: GLint, y: GLint,
    width: GLsizei, height: GLsizei
) = platform.OpenGL3.glCopyTexSubImage3D(
    target.toUInt(), level, xoffset, yoffset, zoffset, x, y, width, height
)

actual inline fun GL12.glDrawRangeElements(
    mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum,
    offset: GLintptr
) = platform.OpenGL3.glDrawRangeElements(
    mode.toUInt(), start, end, count, type.toUInt(),
    offset.toLong().toCPointer<ByteVar>()
)
