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

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.readOrNull
import org.lwjgl.opengl.GL12C as JGL12C

actual inline val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
    get() = JGL12C.GL_ALIASED_LINE_WIDTH_RANGE
actual inline val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
    get() = JGL12C.GL_UNSIGNED_SHORT_4_4_4_4
actual inline val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
    get() = JGL12C.GL_UNSIGNED_SHORT_5_5_5_1
actual inline val GL_UNSIGNED_SHORT_5_6_5: GLenum
    get() = JGL12C.GL_UNSIGNED_SHORT_5_6_5
actual inline val GL_CLAMP_TO_EDGE: GLenum
    get() = JGL12C.GL_CLAMP_TO_EDGE
actual inline val GL_TEXTURE_BINDING_3D: GLenum
    get() = JGL12C.GL_TEXTURE_BINDING_3D
actual inline val GL_UNPACK_SKIP_IMAGES: GLenum
    get() = JGL12C.GL_UNPACK_SKIP_IMAGES
actual inline val GL_UNPACK_IMAGE_HEIGHT: GLenum
    get() = JGL12C.GL_UNPACK_IMAGE_HEIGHT
actual inline val GL_TEXTURE_3D: GLenum
    get() = JGL12C.GL_TEXTURE_3D
actual inline val GL_TEXTURE_WRAP_R: GLenum
    get() = JGL12C.GL_TEXTURE_WRAP_R
actual inline val GL_MAX_3D_TEXTURE_SIZE: GLenum
    get() = JGL12C.GL_MAX_3D_TEXTURE_SIZE
actual inline val GL_UNSIGNED_INT_2_10_10_10_REV: GLenum
    get() = JGL12C.GL_UNSIGNED_INT_2_10_10_10_REV
actual inline val GL_MAX_ELEMENTS_VERTICES: GLenum
    get() = JGL12C.GL_MAX_ELEMENTS_VERTICES
actual inline val GL_MAX_ELEMENTS_INDICES: GLenum
    get() = JGL12C.GL_MAX_ELEMENTS_INDICES
actual inline val GL_TEXTURE_MIN_LOD: GLenum
    get() = JGL12C.GL_TEXTURE_MIN_LOD
actual inline val GL_TEXTURE_MAX_LOD: GLenum
    get() = JGL12C.GL_TEXTURE_MAX_LOD
actual inline val GL_TEXTURE_BASE_LEVEL: GLenum
    get() = JGL12C.GL_TEXTURE_BASE_LEVEL
actual inline val GL_TEXTURE_MAX_LEVEL: GLenum
    get() = JGL12C.GL_TEXTURE_MAX_LEVEL

actual inline fun GL12.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
) = JGL12C.glStencilOp(
    fail, zfail, zpass
)

actual inline fun GL12.glTexImage3D(
    target: GLenum, level: GLint, internalformat: GLint, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, format: GLenum,
    type: GLenum, srcData: DataBuffer?
) = srcData.readOrNull { buffer ->
    JGL12C.glTexImage3D(
        target, level, internalformat, width, height, depth, border,
        format, type, buffer
    )
}

actual inline fun GL12.glTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, type: GLenum, srcData: DataBuffer
) = srcData.read { buffer ->
    JGL12C.glTexSubImage3D(
        target, level, xoffset, yoffset, zoffset, width, height, depth,
        format, type, buffer
    )
}

actual inline fun GL12.glCopyTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    x: GLint, y: GLint,
    width: GLsizei, height: GLsizei
) = JGL12C.glCopyTexSubImage3D(
    target, level, xoffset, yoffset, zoffset, x, y, width, height
)

actual inline fun GL12.glDrawRangeElements(
    mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum,
    offset: GLintptr
) = JGL12C.glDrawRangeElements(
    mode, start.toInt(), end.toInt(), count, type,
    offset.toLong()
)
