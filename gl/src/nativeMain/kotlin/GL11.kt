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

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.readOrNull
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_DEPTH_BUFFER_BIT: GLenum
    get() = platform.OpenGL3.GL_DEPTH_BUFFER_BIT
actual inline val GL_STENCIL_BUFFER_BIT: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BUFFER_BIT
actual inline val GL_COLOR_BUFFER_BIT: GLenum
    get() = platform.OpenGL3.GL_COLOR_BUFFER_BIT
actual inline val GL_POINTS: GLenum
    get() = platform.OpenGL3.GL_POINTS
actual inline val GL_LINES: GLenum
    get() = platform.OpenGL3.GL_LINES
actual inline val GL_LINE_LOOP: GLenum
    get() = platform.OpenGL3.GL_LINE_LOOP
actual inline val GL_LINE_STRIP: GLenum
    get() = platform.OpenGL3.GL_LINE_STRIP
actual inline val GL_TRIANGLES: GLenum
    get() = platform.OpenGL3.GL_TRIANGLES
actual inline val GL_TRIANGLE_STRIP: GLenum
    get() = platform.OpenGL3.GL_TRIANGLE_STRIP
actual inline val GL_TRIANGLE_FAN: GLenum
    get() = platform.OpenGL3.GL_TRIANGLE_FAN
actual inline val GL_ZERO: GLenum
    get() = platform.OpenGL3.GL_ZERO
actual inline val GL_ONE: GLenum
    get() = platform.OpenGL3.GL_ONE
actual inline val GL_SRC_COLOR: GLenum
    get() = platform.OpenGL3.GL_SRC_COLOR
actual inline val GL_ONE_MINUS_SRC_COLOR: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_SRC_COLOR
actual inline val GL_SRC_ALPHA: GLenum
    get() = platform.OpenGL3.GL_SRC_ALPHA
actual inline val GL_ONE_MINUS_SRC_ALPHA: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_SRC_ALPHA
actual inline val GL_DST_ALPHA: GLenum
    get() = platform.OpenGL3.GL_DST_ALPHA
actual inline val GL_ONE_MINUS_DST_ALPHA: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_DST_ALPHA
actual inline val GL_DST_COLOR: GLenum
    get() = platform.OpenGL3.GL_DST_COLOR
actual inline val GL_ONE_MINUS_DST_COLOR: GLenum
    get() = platform.OpenGL3.GL_ONE_MINUS_DST_COLOR
actual inline val GL_SRC_ALPHA_SATURATE: GLenum
    get() = platform.OpenGL3.GL_SRC_ALPHA_SATURATE
actual inline val GL_FRONT: GLenum
    get() = platform.OpenGL3.GL_FRONT
actual inline val GL_BACK: GLenum
    get() = platform.OpenGL3.GL_BACK
actual inline val GL_FRONT_AND_BACK: GLenum
    get() = platform.OpenGL3.GL_FRONT_AND_BACK
actual inline val GL_CULL_FACE: GLenum
    get() = platform.OpenGL3.GL_CULL_FACE
actual inline val GL_BLEND: GLenum
    get() = platform.OpenGL3.GL_BLEND
actual inline val GL_DITHER: GLenum
    get() = platform.OpenGL3.GL_DITHER
actual inline val GL_STENCIL_TEST: GLenum
    get() = platform.OpenGL3.GL_STENCIL_TEST
actual inline val GL_DEPTH_TEST: GLenum
    get() = platform.OpenGL3.GL_DEPTH_TEST
actual inline val GL_SCISSOR_TEST: GLenum
    get() = platform.OpenGL3.GL_SCISSOR_TEST
actual inline val GL_POLYGON_OFFSET_FILL: GLenum
    get() = platform.OpenGL3.GL_POLYGON_OFFSET_FILL
actual inline val GL_NO_ERROR: GLenum
    get() = platform.OpenGL3.GL_NO_ERROR
actual inline val GL_INVALID_ENUM: GLenum
    get() = platform.OpenGL3.GL_INVALID_ENUM
actual inline val GL_INVALID_VALUE: GLenum
    get() = platform.OpenGL3.GL_INVALID_VALUE
actual inline val GL_INVALID_OPERATION: GLenum
    get() = platform.OpenGL3.GL_INVALID_OPERATION
actual inline val GL_OUT_OF_MEMORY: GLenum
    get() = platform.OpenGL3.GL_OUT_OF_MEMORY
actual inline val GL_CW: GLenum
    get() = platform.OpenGL3.GL_CW
actual inline val GL_CCW: GLenum
    get() = platform.OpenGL3.GL_CCW
actual inline val GL_LINE_WIDTH: GLenum
    get() = platform.OpenGL3.GL_LINE_WIDTH
actual inline val GL_CULL_FACE_MODE: GLenum
    get() = platform.OpenGL3.GL_CULL_FACE_MODE
actual inline val GL_FRONT_FACE: GLenum
    get() = platform.OpenGL3.GL_FRONT_FACE
actual inline val GL_DEPTH_RANGE: GLenum
    get() = platform.OpenGL3.GL_DEPTH_RANGE
actual inline val GL_DEPTH_WRITEMASK: GLenum
    get() = platform.OpenGL3.GL_DEPTH_WRITEMASK
actual inline val GL_DEPTH_CLEAR_VALUE: GLenum
    get() = platform.OpenGL3.GL_DEPTH_CLEAR_VALUE
actual inline val GL_DEPTH_FUNC: GLenum
    get() = platform.OpenGL3.GL_DEPTH_FUNC
actual inline val GL_STENCIL_CLEAR_VALUE: GLenum
    get() = platform.OpenGL3.GL_STENCIL_CLEAR_VALUE
actual inline val GL_STENCIL_FUNC: GLenum
    get() = platform.OpenGL3.GL_STENCIL_FUNC
actual inline val GL_STENCIL_FAIL: GLenum
    get() = platform.OpenGL3.GL_STENCIL_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_FAIL: GLenum
    get() = platform.OpenGL3.GL_STENCIL_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_PASS: GLenum
    get() = platform.OpenGL3.GL_STENCIL_PASS_DEPTH_PASS
actual inline val GL_STENCIL_REF: GLenum
    get() = platform.OpenGL3.GL_STENCIL_REF
actual inline val GL_STENCIL_VALUE_MASK: GLenum
    get() = platform.OpenGL3.GL_STENCIL_VALUE_MASK
actual inline val GL_STENCIL_WRITEMASK: GLenum
    get() = platform.OpenGL3.GL_STENCIL_WRITEMASK
actual inline val GL_VIEWPORT: GLenum
    get() = platform.OpenGL3.GL_VIEWPORT
actual inline val GL_SCISSOR_BOX: GLenum
    get() = platform.OpenGL3.GL_SCISSOR_BOX
actual inline val GL_COLOR_CLEAR_VALUE: GLenum
    get() = platform.OpenGL3.GL_COLOR_CLEAR_VALUE
actual inline val GL_COLOR_WRITEMASK: GLenum
    get() = platform.OpenGL3.GL_COLOR_WRITEMASK
actual inline val GL_UNPACK_ALIGNMENT: GLenum
    get() = platform.OpenGL3.GL_UNPACK_ALIGNMENT
actual inline val GL_PACK_ALIGNMENT: GLenum
    get() = platform.OpenGL3.GL_PACK_ALIGNMENT
actual inline val GL_MAX_TEXTURE_SIZE: GLenum
    get() = platform.OpenGL3.GL_MAX_TEXTURE_SIZE
actual inline val GL_MAX_VIEWPORT_DIMS: GLenum
    get() = platform.OpenGL3.GL_MAX_VIEWPORT_DIMS
actual inline val GL_SUBPIXEL_BITS: GLenum
    get() = platform.OpenGL3.GL_SUBPIXEL_BITS
actual inline val GL_POLYGON_OFFSET_UNITS: GLenum
    get() = platform.OpenGL3.GL_POLYGON_OFFSET_UNITS
actual inline val GL_POLYGON_OFFSET_FACTOR: GLenum
    get() = platform.OpenGL3.GL_POLYGON_OFFSET_FACTOR
actual inline val GL_TEXTURE_BINDING_2D: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_BINDING_2D
actual inline val GL_DONT_CARE: GLenum
    get() = platform.OpenGL3.GL_DONT_CARE
actual inline val GL_FASTEST: GLenum
    get() = platform.OpenGL3.GL_FASTEST
actual inline val GL_NICEST: GLenum
    get() = platform.OpenGL3.GL_NICEST
actual inline val GL_BYTE: GLenum
    get() = platform.OpenGL3.GL_BYTE
actual inline val GL_UNSIGNED_BYTE: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_BYTE
actual inline val GL_SHORT: GLenum
    get() = platform.OpenGL3.GL_SHORT
actual inline val GL_UNSIGNED_SHORT: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_SHORT
actual inline val GL_INT: GLenum
    get() = platform.OpenGL3.GL_INT
actual inline val GL_UNSIGNED_INT: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT
actual inline val GL_FLOAT: GLenum
    get() = platform.OpenGL3.GL_FLOAT
actual inline val GL_DEPTH_COMPONENT: GLenum
    get() = platform.OpenGL3.GL_DEPTH_COMPONENT
actual inline val GL_ALPHA: GLenum
    get() = platform.OpenGL3.GL_ALPHA
actual inline val GL_RGB: GLenum
    get() = platform.OpenGL3.GL_RGB
actual inline val GL_RGBA: GLenum
    get() = platform.OpenGL3.GL_RGBA
actual inline val GL_NEVER: GLenum
    get() = platform.OpenGL3.GL_NEVER
actual inline val GL_LESS: GLenum
    get() = platform.OpenGL3.GL_LESS
actual inline val GL_EQUAL: GLenum
    get() = platform.OpenGL3.GL_EQUAL
actual inline val GL_LEQUAL: GLenum
    get() = platform.OpenGL3.GL_LEQUAL
actual inline val GL_GREATER: GLenum
    get() = platform.OpenGL3.GL_GREATER
actual inline val GL_NOTEQUAL: GLenum
    get() = platform.OpenGL3.GL_NOTEQUAL
actual inline val GL_GEQUAL: GLenum
    get() = platform.OpenGL3.GL_GEQUAL
actual inline val GL_ALWAYS: GLenum
    get() = platform.OpenGL3.GL_ALWAYS
actual inline val GL_KEEP: GLenum
    get() = platform.OpenGL3.GL_KEEP
actual inline val GL_REPLACE: GLenum
    get() = platform.OpenGL3.GL_REPLACE
actual inline val GL_INCR: GLenum
    get() = platform.OpenGL3.GL_INCR
actual inline val GL_DECR: GLenum
    get() = platform.OpenGL3.GL_DECR
actual inline val GL_INVERT: GLenum
    get() = platform.OpenGL3.GL_INVERT
actual inline val GL_VENDOR: GLenum
    get() = platform.OpenGL3.GL_VENDOR
actual inline val GL_RENDERER: GLenum
    get() = platform.OpenGL3.GL_RENDERER
actual inline val GL_VERSION: GLenum
    get() = platform.OpenGL3.GL_VERSION
actual inline val GL_NEAREST: GLenum
    get() = platform.OpenGL3.GL_NEAREST
actual inline val GL_LINEAR: GLenum
    get() = platform.OpenGL3.GL_LINEAR
actual inline val GL_NEAREST_MIPMAP_NEAREST: GLenum
    get() = platform.OpenGL3.GL_NEAREST_MIPMAP_NEAREST
actual inline val GL_LINEAR_MIPMAP_NEAREST: GLenum
    get() = platform.OpenGL3.GL_LINEAR_MIPMAP_NEAREST
actual inline val GL_NEAREST_MIPMAP_LINEAR: GLenum
    get() = platform.OpenGL3.GL_NEAREST_MIPMAP_LINEAR
actual inline val GL_LINEAR_MIPMAP_LINEAR: GLenum
    get() = platform.OpenGL3.GL_LINEAR_MIPMAP_LINEAR
actual inline val GL_TEXTURE_MAG_FILTER: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_MAG_FILTER
actual inline val GL_TEXTURE_MIN_FILTER: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_MIN_FILTER
actual inline val GL_TEXTURE_WRAP_S: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_WRAP_S
actual inline val GL_TEXTURE_WRAP_T: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_WRAP_T
actual inline val GL_TEXTURE_2D: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_2D
actual inline val GL_REPEAT: GLenum
    get() = platform.OpenGL3.GL_REPEAT
actual inline val GL_RGBA4: GLenum
    get() = platform.OpenGL3.GL_RGBA4
actual inline val GL_RGB5_A1: GLenum
    get() = platform.OpenGL3.GL_RGB5_A1
actual inline val GL_NONE: GLenum
    get() = platform.OpenGL3.GL_NONE
actual inline val GL_READ_BUFFER: GLenum
    get() = platform.OpenGL3.GL_READ_BUFFER
actual inline val GL_UNPACK_ROW_LENGTH: GLenum
    get() = platform.OpenGL3.GL_UNPACK_ROW_LENGTH
actual inline val GL_UNPACK_SKIP_ROWS: GLenum
    get() = platform.OpenGL3.GL_UNPACK_SKIP_ROWS
actual inline val GL_UNPACK_SKIP_PIXELS: GLenum
    get() = platform.OpenGL3.GL_UNPACK_SKIP_PIXELS
actual inline val GL_PACK_ROW_LENGTH: GLenum
    get() = platform.OpenGL3.GL_PACK_ROW_LENGTH
actual inline val GL_PACK_SKIP_ROWS: GLenum
    get() = platform.OpenGL3.GL_PACK_SKIP_ROWS
actual inline val GL_PACK_SKIP_PIXELS: GLenum
    get() = platform.OpenGL3.GL_PACK_SKIP_PIXELS
actual inline val GL_COLOR: GLenum
    get() = platform.OpenGL3.GL_COLOR
actual inline val GL_DEPTH: GLenum
    get() = platform.OpenGL3.GL_DEPTH
actual inline val GL_STENCIL: GLenum
    get() = platform.OpenGL3.GL_STENCIL
actual inline val GL_RED: GLenum
    get() = platform.OpenGL3.GL_RED
actual inline val GL_RGB8: GLenum
    get() = platform.OpenGL3.GL_RGB8
actual inline val GL_RGBA8: GLenum
    get() = platform.OpenGL3.GL_RGBA8
actual inline val GL_RGB10_A2: GLenum
    get() = platform.OpenGL3.GL_RGB10_A2

actual inline fun GL11.glBindTexture(
    target: GLenum, texture: GLTexture
) = platform.OpenGL3.glBindTexture(
    target.toUInt(), texture.toUInt()
)

actual inline fun GL11.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
) = platform.OpenGL3.glBlendFunc(
    sfactor.toUInt(), dfactor.toUInt()
)

actual inline fun GL11.glClear(
    mask: GLbitfield
) = platform.OpenGL3.glClear(
    mask.toUInt()
)

actual inline fun GL11.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = platform.OpenGL3.glClearColor(
    red, green, blue, alpha
)

actual inline fun GL11.glClearStencil(
    s: GLint
) = platform.OpenGL3.glClearStencil(
    s
)

actual inline fun GL11.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
) = platform.OpenGL3.glColorMask(
    if (red) 1u else 0u, if (green) 1u else 0u, if (blue) 1u else 0u,
    if (alpha) 1u else 0u
)

actual inline fun GL11.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
) = platform.OpenGL3.glCopyTexImage2D(
    target.toUInt(), level, internalformat.toUInt(), x, y, width, height, border
)

actual inline fun GL11.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = platform.OpenGL3.glCopyTexSubImage2D(
    target.toUInt(), level, xoffset, yoffset, x, y, width, height
)

actual inline fun GL11.glCreateTexture(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenTextures(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL11.glCullFace(
    mode: GLenum
) = platform.OpenGL3.glCullFace(
    mode.toUInt()
)

actual inline fun GL11.glDeleteTexture(
    texture: GLTexture
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = texture.toUInt()
    platform.OpenGL3.glDeleteTextures(
        1, buffer.ptr
    )
}

actual inline fun GL11.glDepthFunc(
    func: GLenum
) = platform.OpenGL3.glDepthFunc(
    func.toUInt()
)

actual inline fun GL11.glDepthMask(
    flag: GLboolean
) = platform.OpenGL3.glDepthMask(
    if (flag) 1u else 0u
)

actual inline fun GL11.glDisable(
    cap: GLenum
) = platform.OpenGL3.glDisable(
    cap.toUInt()
)

actual inline fun GL11.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
) = platform.OpenGL3.glDrawArrays(
    mode.toUInt(), first, count
)

actual inline fun GL11.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
) = platform.OpenGL3.glDrawElements(
    mode.toUInt(), count, type.toUInt(), offset.toLong().toCPointer<ByteVar>()
)

actual inline fun GL11.glEnable(
    cap: GLenum
) = platform.OpenGL3.glEnable(
    cap.toUInt()
)

actual inline fun GL11.glFinish(
) = platform.OpenGL3.glFinish(
)

actual inline fun GL11.glFlush(
) = platform.OpenGL3.glFlush(
)

actual inline fun GL11.glFrontFace(
    mode: GLenum
) = platform.OpenGL3.glFrontFace(
    mode.toUInt()
)

actual inline fun GL11.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
) = memScoped {
    val bytes = allocArray<UByteVar>(data.size)
    platform.OpenGL3.glGetBooleanv(
        pname.toUInt(), bytes
    )
    for (i in data.indices) {
        data[i] = bytes[i] != 0u.toUByte()
    }
}

actual inline fun GL11.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
) = data.usePinned { buffer ->
    platform.OpenGL3.glGetFloatv(
        pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL11.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
) = data.usePinned { buffer ->
    platform.OpenGL3.glGetIntegerv(
        pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL11.glGetError(
) = platform.OpenGL3.glGetError(
).toInt()

actual inline fun GL11.glGetString(
    pname: GLenum
) = platform.OpenGL3.glGetString(
    pname.toUInt()
)?.reinterpret<ByteVar>()?.toKString()

actual inline fun GL11.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetTexParameteriv(
        target.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL11.glHint(
    target: GLenum, mode: GLenum
) = platform.OpenGL3.glHint(
    target.toUInt(), mode.toUInt()
)

actual inline fun GL11.glIsEnabled(
    cap: GLenum
) = platform.OpenGL3.glIsEnabled(
    cap.toUInt()
) != 0u.toUByte()

actual inline fun GL11.glIsTexture(
    texture: GLTexture
) = platform.OpenGL3.glIsTexture(
    texture.toUInt()
) != 0u.toUByte()

actual inline fun GL11.glLineWidth(
    width: GLfloat
) = platform.OpenGL3.glLineWidth(
    width
)

actual inline fun GL11.glPixelStorei(
    pname: GLenum, param: GLint
) = platform.OpenGL3.glPixelStorei(
    pname.toUInt(), param
)

actual inline fun GL11.glPolygonOffset(
    factor: GLfloat, units: GLfloat
) = platform.OpenGL3.glPolygonOffset(
    factor, units
)

actual inline fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
) = pixels.read { buffer ->
    platform.OpenGL3.glReadPixels(
        x, y, width, height, format.toUInt(), type.toUInt(), buffer
    )
}

actual inline fun GL11.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = platform.OpenGL3.glScissor(
    x, y, width, height
)

actual inline fun GL11.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
) = platform.OpenGL3.glStencilFunc(
    func.toUInt(), ref, mask
)

actual inline fun GL11.glStencilMask(
    mask: GLuint
) = platform.OpenGL3.glStencilMask(
    mask
)

actual inline fun GL11.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
) = pixels.readOrNull { buffer ->
    platform.OpenGL3.glTexImage2D(
        target.toUInt(), level, internalformat, width, height, border,
        format.toUInt(), type.toUInt(), buffer
    )
}

actual inline fun GL11.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
) = platform.OpenGL3.glTexParameterf(
    target.toUInt(), pname.toUInt(), param
)

actual inline fun GL11.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
) = platform.OpenGL3.glTexParameteri(
    target.toUInt(), pname.toUInt(), param
)

actual inline fun GL11.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
) = pixels.read { buffer ->
    platform.OpenGL3.glTexSubImage2D(
        target.toUInt(), level, xoffset, yoffset, width, height,
        format.toUInt(), type.toUInt(), buffer
    )
}

actual inline fun GL11.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = platform.OpenGL3.glViewport(
    x, y, width, height
)

actual inline fun GL11.glReadBuffer(
    src: GLenum
) = platform.OpenGL3.glReadBuffer(
    src.toUInt()
)

actual inline fun GL11.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, offset: GLintptr
) = platform.OpenGL3.glReadPixels(
    x, y, width, height, format.toUInt(), type.toUInt(),
    offset.toLong().toCPointer<ByteVar>()
)
