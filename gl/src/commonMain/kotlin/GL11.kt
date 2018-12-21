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

expect val GL_DEPTH_BUFFER_BIT: GLenum
expect val GL_STENCIL_BUFFER_BIT: GLenum
expect val GL_COLOR_BUFFER_BIT: GLenum
expect val GL_POINTS: GLenum
expect val GL_LINES: GLenum
expect val GL_LINE_LOOP: GLenum
expect val GL_LINE_STRIP: GLenum
expect val GL_TRIANGLES: GLenum
expect val GL_TRIANGLE_STRIP: GLenum
expect val GL_TRIANGLE_FAN: GLenum
expect val GL_ZERO: GLenum
expect val GL_ONE: GLenum
expect val GL_SRC_COLOR: GLenum
expect val GL_ONE_MINUS_SRC_COLOR: GLenum
expect val GL_SRC_ALPHA: GLenum
expect val GL_ONE_MINUS_SRC_ALPHA: GLenum
expect val GL_DST_ALPHA: GLenum
expect val GL_ONE_MINUS_DST_ALPHA: GLenum
expect val GL_DST_COLOR: GLenum
expect val GL_ONE_MINUS_DST_COLOR: GLenum
expect val GL_SRC_ALPHA_SATURATE: GLenum
expect val GL_FRONT: GLenum
expect val GL_BACK: GLenum
expect val GL_FRONT_AND_BACK: GLenum
expect val GL_CULL_FACE: GLenum
expect val GL_BLEND: GLenum
expect val GL_DITHER: GLenum
expect val GL_STENCIL_TEST: GLenum
expect val GL_DEPTH_TEST: GLenum
expect val GL_SCISSOR_TEST: GLenum
expect val GL_POLYGON_OFFSET_FILL: GLenum
expect val GL_NO_ERROR: GLenum
expect val GL_INVALID_ENUM: GLenum
expect val GL_INVALID_VALUE: GLenum
expect val GL_INVALID_OPERATION: GLenum
expect val GL_OUT_OF_MEMORY: GLenum
expect val GL_CW: GLenum
expect val GL_CCW: GLenum
expect val GL_LINE_WIDTH: GLenum
expect val GL_CULL_FACE_MODE: GLenum
expect val GL_FRONT_FACE: GLenum
expect val GL_DEPTH_RANGE: GLenum
expect val GL_DEPTH_WRITEMASK: GLenum
expect val GL_DEPTH_CLEAR_VALUE: GLenum
expect val GL_DEPTH_FUNC: GLenum
expect val GL_STENCIL_CLEAR_VALUE: GLenum
expect val GL_STENCIL_FUNC: GLenum
expect val GL_STENCIL_FAIL: GLenum
expect val GL_STENCIL_PASS_DEPTH_FAIL: GLenum
expect val GL_STENCIL_PASS_DEPTH_PASS: GLenum
expect val GL_STENCIL_REF: GLenum
expect val GL_STENCIL_VALUE_MASK: GLenum
expect val GL_STENCIL_WRITEMASK: GLenum
expect val GL_VIEWPORT: GLenum
expect val GL_SCISSOR_BOX: GLenum
expect val GL_COLOR_CLEAR_VALUE: GLenum
expect val GL_COLOR_WRITEMASK: GLenum
expect val GL_UNPACK_ALIGNMENT: GLenum
expect val GL_PACK_ALIGNMENT: GLenum
expect val GL_MAX_TEXTURE_SIZE: GLenum
expect val GL_MAX_VIEWPORT_DIMS: GLenum
expect val GL_SUBPIXEL_BITS: GLenum
expect val GL_POLYGON_OFFSET_UNITS: GLenum
expect val GL_POLYGON_OFFSET_FACTOR: GLenum
expect val GL_TEXTURE_BINDING_2D: GLenum
expect val GL_DONT_CARE: GLenum
expect val GL_FASTEST: GLenum
expect val GL_NICEST: GLenum
expect val GL_BYTE: GLenum
expect val GL_UNSIGNED_BYTE: GLenum
expect val GL_SHORT: GLenum
expect val GL_UNSIGNED_SHORT: GLenum
expect val GL_INT: GLenum
expect val GL_UNSIGNED_INT: GLenum
expect val GL_FLOAT: GLenum
expect val GL_DEPTH_COMPONENT: GLenum
expect val GL_ALPHA: GLenum
expect val GL_RGB: GLenum
expect val GL_RGBA: GLenum
expect val GL_NEVER: GLenum
expect val GL_LESS: GLenum
expect val GL_EQUAL: GLenum
expect val GL_LEQUAL: GLenum
expect val GL_GREATER: GLenum
expect val GL_NOTEQUAL: GLenum
expect val GL_GEQUAL: GLenum
expect val GL_ALWAYS: GLenum
expect val GL_KEEP: GLenum
expect val GL_REPLACE: GLenum
expect val GL_INCR: GLenum
expect val GL_DECR: GLenum
expect val GL_INVERT: GLenum
expect val GL_VENDOR: GLenum
expect val GL_RENDERER: GLenum
expect val GL_VERSION: GLenum
expect val GL_NEAREST: GLenum
expect val GL_LINEAR: GLenum
expect val GL_NEAREST_MIPMAP_NEAREST: GLenum
expect val GL_LINEAR_MIPMAP_NEAREST: GLenum
expect val GL_NEAREST_MIPMAP_LINEAR: GLenum
expect val GL_LINEAR_MIPMAP_LINEAR: GLenum
expect val GL_TEXTURE_MAG_FILTER: GLenum
expect val GL_TEXTURE_MIN_FILTER: GLenum
expect val GL_TEXTURE_WRAP_S: GLenum
expect val GL_TEXTURE_WRAP_T: GLenum
expect val GL_TEXTURE_2D: GLenum
expect val GL_REPEAT: GLenum
expect val GL_RGBA4: GLenum
expect val GL_RGB5_A1: GLenum
expect val GL_NONE: GLenum
expect val GL_READ_BUFFER: GLenum
expect val GL_UNPACK_ROW_LENGTH: GLenum
expect val GL_UNPACK_SKIP_ROWS: GLenum
expect val GL_UNPACK_SKIP_PIXELS: GLenum
expect val GL_PACK_ROW_LENGTH: GLenum
expect val GL_PACK_SKIP_ROWS: GLenum
expect val GL_PACK_SKIP_PIXELS: GLenum
expect val GL_COLOR: GLenum
expect val GL_DEPTH: GLenum
expect val GL_STENCIL: GLenum
expect val GL_RED: GLenum
expect val GL_RGB8: GLenum
expect val GL_RGBA8: GLenum
expect val GL_RGB10_A2: GLenum

expect fun GL11.glBindTexture(
    target: GLenum, texture: GLTexture
)

expect fun GL11.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
)

expect fun GL11.glClear(
    mask: GLbitfield
)

expect fun GL11.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
)

expect fun GL11.glClearStencil(
    s: GLint
)

expect fun GL11.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
)

expect fun GL11.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
)

expect fun GL11.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GL11.glCreateTexture(
): GLTexture

expect fun GL11.glCullFace(
    mode: GLenum
)

expect fun GL11.glDeleteTexture(
    texture: GLTexture
)

expect fun GL11.glDepthFunc(
    func: GLenum
)

expect fun GL11.glDepthMask(
    flag: GLboolean
)

expect fun GL11.glDisable(
    cap: GLenum
)

expect fun GL11.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
)

expect fun GL11.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
)

expect fun GL11.glEnable(
    cap: GLenum
)

expect fun GL11.glFinish(
)

expect fun GL11.glFlush(
)

expect fun GL11.glFrontFace(
    mode: GLenum
)

expect fun GL11.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
)

expect fun GL11.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
)

expect fun GL11.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
)

expect fun GL11.glGetError(
): GLenum

expect fun GL11.glGetString(
    pname: GLenum
): DOMString?

expect fun GL11.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GL11.glHint(
    target: GLenum, mode: GLenum
)

expect fun GL11.glIsEnabled(
    cap: GLenum
): GLboolean

expect fun GL11.glIsTexture(
    texture: GLTexture
): GLboolean

expect fun GL11.glLineWidth(
    width: GLfloat
)

expect fun GL11.glPixelStorei(
    pname: GLenum, param: GLint
)

expect fun GL11.glPolygonOffset(
    factor: GLfloat, units: GLfloat
)

expect fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
)

expect fun GL11.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GL11.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
)

expect fun GL11.glStencilMask(
    mask: GLuint
)

expect fun GL11.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
)

expect fun GL11.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
)

expect fun GL11.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
)

expect fun GL11.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
)

expect fun GL11.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GL11.glReadBuffer(
    src: GLenum
)

expect fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, offset: GLintptr
)
