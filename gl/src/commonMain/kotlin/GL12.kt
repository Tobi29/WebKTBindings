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

package net.gitout.ktbindings.gl

import net.gitout.ktbindings.utils.DataBuffer

expect val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
expect val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
expect val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
expect val GL_UNSIGNED_SHORT_5_6_5: GLenum
expect val GL_CLAMP_TO_EDGE: GLenum
expect val GL_TEXTURE_BINDING_3D: GLenum
expect val GL_UNPACK_SKIP_IMAGES: GLenum
expect val GL_UNPACK_IMAGE_HEIGHT: GLenum
expect val GL_TEXTURE_3D: GLenum
expect val GL_TEXTURE_WRAP_R: GLenum
expect val GL_MAX_3D_TEXTURE_SIZE: GLenum
expect val GL_UNSIGNED_INT_2_10_10_10_REV: GLenum
expect val GL_MAX_ELEMENTS_VERTICES: GLenum
expect val GL_MAX_ELEMENTS_INDICES: GLenum
expect val GL_TEXTURE_MIN_LOD: GLenum
expect val GL_TEXTURE_MAX_LOD: GLenum
expect val GL_TEXTURE_BASE_LEVEL: GLenum
expect val GL_TEXTURE_MAX_LEVEL: GLenum

expect fun GL12.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
)

expect fun GL12.glTexImage3D(
    target: GLenum, level: GLint, internalformat: GLint, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, format: GLenum,
    type: GLenum, srcData: DataBuffer?
)

expect fun GL12.glTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, type: GLenum, srcData: DataBuffer
)

expect fun GL12.glCopyTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    x: GLint, y: GLint,
    width: GLsizei, height: GLsizei
)

expect fun GL12.glDrawRangeElements(
    mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum,
    offset: GLintptr
)
