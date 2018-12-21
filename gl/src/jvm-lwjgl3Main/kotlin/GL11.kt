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
import org.lwjgl.system.MemoryStack
import org.lwjgl.opengl.GL11C as JGL11C

actual inline val GL_DEPTH_BUFFER_BIT: GLenum
    get() = JGL11C.GL_DEPTH_BUFFER_BIT
actual inline val GL_STENCIL_BUFFER_BIT: GLenum
    get() = JGL11C.GL_STENCIL_BUFFER_BIT
actual inline val GL_COLOR_BUFFER_BIT: GLenum
    get() = JGL11C.GL_COLOR_BUFFER_BIT
actual inline val GL_POINTS: GLenum
    get() = JGL11C.GL_POINTS
actual inline val GL_LINES: GLenum
    get() = JGL11C.GL_LINES
actual inline val GL_LINE_LOOP: GLenum
    get() = JGL11C.GL_LINE_LOOP
actual inline val GL_LINE_STRIP: GLenum
    get() = JGL11C.GL_LINE_STRIP
actual inline val GL_TRIANGLES: GLenum
    get() = JGL11C.GL_TRIANGLES
actual inline val GL_TRIANGLE_STRIP: GLenum
    get() = JGL11C.GL_TRIANGLE_STRIP
actual inline val GL_TRIANGLE_FAN: GLenum
    get() = JGL11C.GL_TRIANGLE_FAN
actual inline val GL_ZERO: GLenum
    get() = JGL11C.GL_ZERO
actual inline val GL_ONE: GLenum
    get() = JGL11C.GL_ONE
actual inline val GL_SRC_COLOR: GLenum
    get() = JGL11C.GL_SRC_COLOR
actual inline val GL_ONE_MINUS_SRC_COLOR: GLenum
    get() = JGL11C.GL_ONE_MINUS_SRC_COLOR
actual inline val GL_SRC_ALPHA: GLenum
    get() = JGL11C.GL_SRC_ALPHA
actual inline val GL_ONE_MINUS_SRC_ALPHA: GLenum
    get() = JGL11C.GL_ONE_MINUS_SRC_ALPHA
actual inline val GL_DST_ALPHA: GLenum
    get() = JGL11C.GL_DST_ALPHA
actual inline val GL_ONE_MINUS_DST_ALPHA: GLenum
    get() = JGL11C.GL_ONE_MINUS_DST_ALPHA
actual inline val GL_DST_COLOR: GLenum
    get() = JGL11C.GL_DST_COLOR
actual inline val GL_ONE_MINUS_DST_COLOR: GLenum
    get() = JGL11C.GL_ONE_MINUS_DST_COLOR
actual inline val GL_SRC_ALPHA_SATURATE: GLenum
    get() = JGL11C.GL_SRC_ALPHA_SATURATE
actual inline val GL_FRONT: GLenum
    get() = JGL11C.GL_FRONT
actual inline val GL_BACK: GLenum
    get() = JGL11C.GL_BACK
actual inline val GL_FRONT_AND_BACK: GLenum
    get() = JGL11C.GL_FRONT_AND_BACK
actual inline val GL_CULL_FACE: GLenum
    get() = JGL11C.GL_CULL_FACE
actual inline val GL_BLEND: GLenum
    get() = JGL11C.GL_BLEND
actual inline val GL_DITHER: GLenum
    get() = JGL11C.GL_DITHER
actual inline val GL_STENCIL_TEST: GLenum
    get() = JGL11C.GL_STENCIL_TEST
actual inline val GL_DEPTH_TEST: GLenum
    get() = JGL11C.GL_DEPTH_TEST
actual inline val GL_SCISSOR_TEST: GLenum
    get() = JGL11C.GL_SCISSOR_TEST
actual inline val GL_POLYGON_OFFSET_FILL: GLenum
    get() = JGL11C.GL_POLYGON_OFFSET_FILL
actual inline val GL_NO_ERROR: GLenum
    get() = JGL11C.GL_NO_ERROR
actual inline val GL_INVALID_ENUM: GLenum
    get() = JGL11C.GL_INVALID_ENUM
actual inline val GL_INVALID_VALUE: GLenum
    get() = JGL11C.GL_INVALID_VALUE
actual inline val GL_INVALID_OPERATION: GLenum
    get() = JGL11C.GL_INVALID_OPERATION
actual inline val GL_OUT_OF_MEMORY: GLenum
    get() = JGL11C.GL_OUT_OF_MEMORY
actual inline val GL_CW: GLenum
    get() = JGL11C.GL_CW
actual inline val GL_CCW: GLenum
    get() = JGL11C.GL_CCW
actual inline val GL_LINE_WIDTH: GLenum
    get() = JGL11C.GL_LINE_WIDTH
actual inline val GL_CULL_FACE_MODE: GLenum
    get() = JGL11C.GL_CULL_FACE_MODE
actual inline val GL_FRONT_FACE: GLenum
    get() = JGL11C.GL_FRONT_FACE
actual inline val GL_DEPTH_RANGE: GLenum
    get() = JGL11C.GL_DEPTH_RANGE
actual inline val GL_DEPTH_WRITEMASK: GLenum
    get() = JGL11C.GL_DEPTH_WRITEMASK
actual inline val GL_DEPTH_CLEAR_VALUE: GLenum
    get() = JGL11C.GL_DEPTH_CLEAR_VALUE
actual inline val GL_DEPTH_FUNC: GLenum
    get() = JGL11C.GL_DEPTH_FUNC
actual inline val GL_STENCIL_CLEAR_VALUE: GLenum
    get() = JGL11C.GL_STENCIL_CLEAR_VALUE
actual inline val GL_STENCIL_FUNC: GLenum
    get() = JGL11C.GL_STENCIL_FUNC
actual inline val GL_STENCIL_FAIL: GLenum
    get() = JGL11C.GL_STENCIL_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_FAIL: GLenum
    get() = JGL11C.GL_STENCIL_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_PASS: GLenum
    get() = JGL11C.GL_STENCIL_PASS_DEPTH_PASS
actual inline val GL_STENCIL_REF: GLenum
    get() = JGL11C.GL_STENCIL_REF
actual inline val GL_STENCIL_VALUE_MASK: GLenum
    get() = JGL11C.GL_STENCIL_VALUE_MASK
actual inline val GL_STENCIL_WRITEMASK: GLenum
    get() = JGL11C.GL_STENCIL_WRITEMASK
actual inline val GL_VIEWPORT: GLenum
    get() = JGL11C.GL_VIEWPORT
actual inline val GL_SCISSOR_BOX: GLenum
    get() = JGL11C.GL_SCISSOR_BOX
actual inline val GL_COLOR_CLEAR_VALUE: GLenum
    get() = JGL11C.GL_COLOR_CLEAR_VALUE
actual inline val GL_COLOR_WRITEMASK: GLenum
    get() = JGL11C.GL_COLOR_WRITEMASK
actual inline val GL_UNPACK_ALIGNMENT: GLenum
    get() = JGL11C.GL_UNPACK_ALIGNMENT
actual inline val GL_PACK_ALIGNMENT: GLenum
    get() = JGL11C.GL_PACK_ALIGNMENT
actual inline val GL_MAX_TEXTURE_SIZE: GLenum
    get() = JGL11C.GL_MAX_TEXTURE_SIZE
actual inline val GL_MAX_VIEWPORT_DIMS: GLenum
    get() = JGL11C.GL_MAX_VIEWPORT_DIMS
actual inline val GL_SUBPIXEL_BITS: GLenum
    get() = JGL11C.GL_SUBPIXEL_BITS
actual inline val GL_POLYGON_OFFSET_UNITS: GLenum
    get() = JGL11C.GL_POLYGON_OFFSET_UNITS
actual inline val GL_POLYGON_OFFSET_FACTOR: GLenum
    get() = JGL11C.GL_POLYGON_OFFSET_FACTOR
actual inline val GL_TEXTURE_BINDING_2D: GLenum
    get() = JGL11C.GL_TEXTURE_BINDING_2D
actual inline val GL_DONT_CARE: GLenum
    get() = JGL11C.GL_DONT_CARE
actual inline val GL_FASTEST: GLenum
    get() = JGL11C.GL_FASTEST
actual inline val GL_NICEST: GLenum
    get() = JGL11C.GL_NICEST
actual inline val GL_BYTE: GLenum
    get() = JGL11C.GL_BYTE
actual inline val GL_UNSIGNED_BYTE: GLenum
    get() = JGL11C.GL_UNSIGNED_BYTE
actual inline val GL_SHORT: GLenum
    get() = JGL11C.GL_SHORT
actual inline val GL_UNSIGNED_SHORT: GLenum
    get() = JGL11C.GL_UNSIGNED_SHORT
actual inline val GL_INT: GLenum
    get() = JGL11C.GL_INT
actual inline val GL_UNSIGNED_INT: GLenum
    get() = JGL11C.GL_UNSIGNED_INT
actual inline val GL_FLOAT: GLenum
    get() = JGL11C.GL_FLOAT
actual inline val GL_DEPTH_COMPONENT: GLenum
    get() = JGL11C.GL_DEPTH_COMPONENT
actual inline val GL_ALPHA: GLenum
    get() = JGL11C.GL_ALPHA
actual inline val GL_RGB: GLenum
    get() = JGL11C.GL_RGB
actual inline val GL_RGBA: GLenum
    get() = JGL11C.GL_RGBA
actual inline val GL_NEVER: GLenum
    get() = JGL11C.GL_NEVER
actual inline val GL_LESS: GLenum
    get() = JGL11C.GL_LESS
actual inline val GL_EQUAL: GLenum
    get() = JGL11C.GL_EQUAL
actual inline val GL_LEQUAL: GLenum
    get() = JGL11C.GL_LEQUAL
actual inline val GL_GREATER: GLenum
    get() = JGL11C.GL_GREATER
actual inline val GL_NOTEQUAL: GLenum
    get() = JGL11C.GL_NOTEQUAL
actual inline val GL_GEQUAL: GLenum
    get() = JGL11C.GL_GEQUAL
actual inline val GL_ALWAYS: GLenum
    get() = JGL11C.GL_ALWAYS
actual inline val GL_KEEP: GLenum
    get() = JGL11C.GL_KEEP
actual inline val GL_REPLACE: GLenum
    get() = JGL11C.GL_REPLACE
actual inline val GL_INCR: GLenum
    get() = JGL11C.GL_INCR
actual inline val GL_DECR: GLenum
    get() = JGL11C.GL_DECR
actual inline val GL_INVERT: GLenum
    get() = JGL11C.GL_INVERT
actual inline val GL_VENDOR: GLenum
    get() = JGL11C.GL_VENDOR
actual inline val GL_RENDERER: GLenum
    get() = JGL11C.GL_RENDERER
actual inline val GL_VERSION: GLenum
    get() = JGL11C.GL_VERSION
actual inline val GL_NEAREST: GLenum
    get() = JGL11C.GL_NEAREST
actual inline val GL_LINEAR: GLenum
    get() = JGL11C.GL_LINEAR
actual inline val GL_NEAREST_MIPMAP_NEAREST: GLenum
    get() = JGL11C.GL_NEAREST_MIPMAP_NEAREST
actual inline val GL_LINEAR_MIPMAP_NEAREST: GLenum
    get() = JGL11C.GL_LINEAR_MIPMAP_NEAREST
actual inline val GL_NEAREST_MIPMAP_LINEAR: GLenum
    get() = JGL11C.GL_NEAREST_MIPMAP_LINEAR
actual inline val GL_LINEAR_MIPMAP_LINEAR: GLenum
    get() = JGL11C.GL_LINEAR_MIPMAP_LINEAR
actual inline val GL_TEXTURE_MAG_FILTER: GLenum
    get() = JGL11C.GL_TEXTURE_MAG_FILTER
actual inline val GL_TEXTURE_MIN_FILTER: GLenum
    get() = JGL11C.GL_TEXTURE_MIN_FILTER
actual inline val GL_TEXTURE_WRAP_S: GLenum
    get() = JGL11C.GL_TEXTURE_WRAP_S
actual inline val GL_TEXTURE_WRAP_T: GLenum
    get() = JGL11C.GL_TEXTURE_WRAP_T
actual inline val GL_TEXTURE_2D: GLenum
    get() = JGL11C.GL_TEXTURE_2D
actual inline val GL_REPEAT: GLenum
    get() = JGL11C.GL_REPEAT
actual inline val GL_RGBA4: GLenum
    get() = JGL11C.GL_RGBA4
actual inline val GL_RGB5_A1: GLenum
    get() = JGL11C.GL_RGB5_A1
actual inline val GL_NONE: GLenum
    get() = JGL11C.GL_NONE
actual inline val GL_READ_BUFFER: GLenum
    get() = JGL11C.GL_READ_BUFFER
actual inline val GL_UNPACK_ROW_LENGTH: GLenum
    get() = JGL11C.GL_UNPACK_ROW_LENGTH
actual inline val GL_UNPACK_SKIP_ROWS: GLenum
    get() = JGL11C.GL_UNPACK_SKIP_ROWS
actual inline val GL_UNPACK_SKIP_PIXELS: GLenum
    get() = JGL11C.GL_UNPACK_SKIP_PIXELS
actual inline val GL_PACK_ROW_LENGTH: GLenum
    get() = JGL11C.GL_PACK_ROW_LENGTH
actual inline val GL_PACK_SKIP_ROWS: GLenum
    get() = JGL11C.GL_PACK_SKIP_ROWS
actual inline val GL_PACK_SKIP_PIXELS: GLenum
    get() = JGL11C.GL_PACK_SKIP_PIXELS
actual inline val GL_COLOR: GLenum
    get() = JGL11C.GL_COLOR
actual inline val GL_DEPTH: GLenum
    get() = JGL11C.GL_DEPTH
actual inline val GL_STENCIL: GLenum
    get() = JGL11C.GL_STENCIL
actual inline val GL_RED: GLenum
    get() = JGL11C.GL_RED
actual inline val GL_RGB8: GLenum
    get() = JGL11C.GL_RGB8
actual inline val GL_RGBA8: GLenum
    get() = JGL11C.GL_RGBA8
actual inline val GL_RGB10_A2: GLenum
    get() = JGL11C.GL_RGB10_A2

actual inline fun GL11.glBindTexture(
    target: GLenum, texture: GLTexture
) = JGL11C.glBindTexture(
    target, texture
)

actual inline fun GL11.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
) = JGL11C.glBlendFunc(
    sfactor, dfactor
)

actual inline fun GL11.glClear(
    mask: GLbitfield
) = JGL11C.glClear(
    mask
)

actual inline fun GL11.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = JGL11C.glClearColor(
    red, green, blue, alpha
)

actual inline fun GL11.glClearStencil(
    s: GLint
) = JGL11C.glClearStencil(
    s
)

actual inline fun GL11.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
) = JGL11C.glColorMask(
    red, green, blue, alpha
)

actual inline fun GL11.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
) = JGL11C.glCopyTexImage2D(
    target, level, internalformat, x, y, width, height, border
)

actual inline fun GL11.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGL11C.glCopyTexSubImage2D(
    target, level, xoffset, yoffset, x, y, width, height
)

actual inline fun GL11.glCreateTexture(
) = JGL11C.glGenTextures(
)

actual inline fun GL11.glCullFace(
    mode: GLenum
) = JGL11C.glCullFace(
    mode
)

actual inline fun GL11.glDeleteTexture(
    texture: GLTexture
) = JGL11C.glDeleteTextures(
    texture
)

actual inline fun GL11.glDepthFunc(
    func: GLenum
) = JGL11C.glDepthFunc(
    func
)

actual inline fun GL11.glDepthMask(
    flag: GLboolean
) = JGL11C.glDepthMask(
    flag
)

actual inline fun GL11.glDisable(
    cap: GLenum
) = JGL11C.glDisable(
    cap
)

actual inline fun GL11.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
) = JGL11C.glDrawArrays(
    mode, first, count
)

actual inline fun GL11.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
) = JGL11C.glDrawElements(
    mode, count, type, offset.toLong()
)

actual inline fun GL11.glEnable(
    cap: GLenum
) = JGL11C.glEnable(
    cap
)

actual inline fun GL11.glFinish(
) = JGL11C.glFinish(
)

actual inline fun GL11.glFlush(
) = JGL11C.glFlush(
)

actual inline fun GL11.glFrontFace(
    mode: GLenum
) = JGL11C.glFrontFace(
    mode
)

actual inline fun GL11.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
) {
    val stack = MemoryStack.stackPush()
    try {
        val bytes = stack.malloc(data.size)
        JGL11C.glGetBooleanv(
            pname, bytes
        )
        for (i in data.indices) {
            data[i] = bytes[i] != 0.toByte()
        }
    } finally {
        stack.pop()
    }
}

actual inline fun GL11.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
) = JGL11C.glGetFloatv(
    pname, data
)

actual inline fun GL11.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
) = JGL11C.glGetIntegerv(
    pname, data
)

actual inline fun GL11.glGetError(
) = JGL11C.glGetError(
)

actual inline fun GL11.glGetString(
    pname: GLenum
) = JGL11C.glGetString(
    pname
)

actual inline fun GL11.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGL11C.glGetTexParameteriv(
    target, pname, params
)

actual inline fun GL11.glHint(
    target: GLenum, mode: GLenum
) = JGL11C.glHint(
    target, mode
)

actual inline fun GL11.glIsEnabled(
    cap: GLenum
) = JGL11C.glIsEnabled(
    cap
)

actual inline fun GL11.glIsTexture(
    texture: GLTexture
) = JGL11C.glIsTexture(
    texture
)

actual inline fun GL11.glLineWidth(
    width: GLfloat
) = JGL11C.glLineWidth(
    width
)

actual inline fun GL11.glPixelStorei(
    pname: GLenum, param: GLint
) = JGL11C.glPixelStorei(
    pname, param
)

actual inline fun GL11.glPolygonOffset(
    factor: GLfloat, units: GLfloat
) = JGL11C.glPolygonOffset(
    factor, units
)

actual inline fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
) = pixels.read { buffer ->
    JGL11C.glReadPixels(
        x, y, width, height, format, type, buffer
    )
}

actual inline fun GL11.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGL11C.glScissor(
    x, y, width, height
)

actual inline fun GL11.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
) = JGL11C.glStencilFunc(
    func, ref, mask.toInt()
)

actual inline fun GL11.glStencilMask(
    mask: GLuint
) = JGL11C.glStencilMask(
    mask.toInt()
)

actual inline fun GL11.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
) = pixels.readOrNull { buffer ->
    JGL11C.glTexImage2D(
        target, level, internalformat, width, height, border,
        format, type, buffer
    )
}

actual inline fun GL11.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
) = JGL11C.glTexParameterf(
    target, pname, param
)

actual inline fun GL11.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
) = JGL11C.glTexParameteri(
    target, pname, param
)

actual inline fun GL11.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
) = pixels.read { buffer ->
    JGL11C.glTexSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        type, buffer
    )
}

actual inline fun GL11.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGL11C.glViewport(
    x, y, width, height
)

actual inline fun GL11.glReadBuffer(
    src: GLenum
) = JGL11C.glReadBuffer(
    src
)

actual inline fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, offset: GLintptr
) = JGL11C.glReadPixels(
    x, y, width, height, format, type, offset.toLong()
)
