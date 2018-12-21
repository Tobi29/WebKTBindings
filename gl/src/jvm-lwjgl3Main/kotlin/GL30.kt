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
import net.gitout.ktbindings.utils.write
import org.lwjgl.opengl.GL30C as JGL30C

actual inline val GL_FRAMEBUFFER: GLenum
    get() = JGL30C.GL_FRAMEBUFFER
actual inline val GL_RENDERBUFFER: GLenum
    get() = JGL30C.GL_RENDERBUFFER
actual inline val GL_STENCIL_INDEX: GLenum
    get() = JGL30C.GL_STENCIL_INDEX
actual inline val GL_STENCIL_INDEX8: GLenum
    get() = JGL30C.GL_STENCIL_INDEX8
actual inline val GL_RENDERBUFFER_WIDTH: GLenum
    get() = JGL30C.GL_RENDERBUFFER_WIDTH
actual inline val GL_RENDERBUFFER_HEIGHT: GLenum
    get() = JGL30C.GL_RENDERBUFFER_HEIGHT
actual inline val GL_RENDERBUFFER_INTERNAL_FORMAT: GLenum
    get() = JGL30C.GL_RENDERBUFFER_INTERNAL_FORMAT
actual inline val GL_RENDERBUFFER_RED_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_RED_SIZE
actual inline val GL_RENDERBUFFER_GREEN_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_GREEN_SIZE
actual inline val GL_RENDERBUFFER_BLUE_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_BLUE_SIZE
actual inline val GL_RENDERBUFFER_ALPHA_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_ALPHA_SIZE
actual inline val GL_RENDERBUFFER_DEPTH_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_DEPTH_SIZE
actual inline val GL_RENDERBUFFER_STENCIL_SIZE: GLenum
    get() = JGL30C.GL_RENDERBUFFER_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE
actual inline val GL_COLOR_ATTACHMENT0: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT0
actual inline val GL_DEPTH_ATTACHMENT: GLenum
    get() = JGL30C.GL_DEPTH_ATTACHMENT
actual inline val GL_STENCIL_ATTACHMENT: GLenum
    get() = JGL30C.GL_STENCIL_ATTACHMENT
actual inline val GL_FRAMEBUFFER_COMPLETE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_COMPLETE
actual inline val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT
actual inline val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_UNSUPPORTED
actual inline val GL_FRAMEBUFFER_BINDING: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_BINDING: GLenum
    get() = JGL30C.GL_RENDERBUFFER_BINDING
actual inline val GL_MAX_RENDERBUFFER_SIZE: GLenum
    get() = JGL30C.GL_MAX_RENDERBUFFER_SIZE
actual inline val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum
    get() = JGL30C.GL_INVALID_FRAMEBUFFER_OPERATION
actual inline val GL_COMPARE_REF_TO_TEXTURE: GLenum
    get() = JGL30C.GL_COMPARE_REF_TO_TEXTURE
actual inline val GL_RGBA32F: GLenum
    get() = JGL30C.GL_RGBA32F
actual inline val GL_RGB32F: GLenum
    get() = JGL30C.GL_RGB32F
actual inline val GL_RGBA16F: GLenum
    get() = JGL30C.GL_RGBA16F
actual inline val GL_RGB16F: GLenum
    get() = JGL30C.GL_RGB16F
actual inline val GL_VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
    get() = JGL30C.GL_VERTEX_ATTRIB_ARRAY_INTEGER
actual inline val GL_MAX_ARRAY_TEXTURE_LAYERS: GLenum
    get() = JGL30C.GL_MAX_ARRAY_TEXTURE_LAYERS
actual inline val GL_MIN_PROGRAM_TEXEL_OFFSET: GLenum
    get() = JGL30C.GL_MIN_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_PROGRAM_TEXEL_OFFSET: GLenum
    get() = JGL30C.GL_MAX_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_VARYING_COMPONENTS: GLenum
    get() = JGL30C.GL_MAX_VARYING_COMPONENTS
actual inline val GL_TEXTURE_2D_ARRAY: GLenum
    get() = JGL30C.GL_TEXTURE_2D_ARRAY
actual inline val GL_TEXTURE_BINDING_2D_ARRAY: GLenum
    get() = JGL30C.GL_TEXTURE_BINDING_2D_ARRAY
actual inline val GL_R11F_G11F_B10F: GLenum
    get() = JGL30C.GL_R11F_G11F_B10F
actual inline val GL_UNSIGNED_INT_10F_11F_11F_REV: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_10F_11F_11F_REV
actual inline val GL_RGB9_E5: GLenum
    get() = JGL30C.GL_RGB9_E5
actual inline val GL_UNSIGNED_INT_5_9_9_9_REV: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_5_9_9_9_REV
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_BUFFER_MODE
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
    get() = JGL30C.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS
actual inline val GL_TRANSFORM_FEEDBACK_VARYINGS: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_VARYINGS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_START: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_BUFFER_START
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_BUFFER_SIZE
actual inline val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN
actual inline val GL_RASTERIZER_DISCARD: GLenum
    get() = JGL30C.GL_RASTERIZER_DISCARD
actual inline val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
    get() = JGL30C.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
    get() = JGL30C.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS
actual inline val GL_INTERLEAVED_ATTRIBS: GLenum
    get() = JGL30C.GL_INTERLEAVED_ATTRIBS
actual inline val GL_SEPARATE_ATTRIBS: GLenum
    get() = JGL30C.GL_SEPARATE_ATTRIBS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_BUFFER
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
    get() = JGL30C.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING
actual inline val GL_RGBA32UI: GLenum
    get() = JGL30C.GL_RGBA32UI
actual inline val GL_RGB32UI: GLenum
    get() = JGL30C.GL_RGB32UI
actual inline val GL_RGBA16UI: GLenum
    get() = JGL30C.GL_RGBA16UI
actual inline val GL_RGB16UI: GLenum
    get() = JGL30C.GL_RGB16UI
actual inline val GL_RGBA8UI: GLenum
    get() = JGL30C.GL_RGBA8UI
actual inline val GL_RGB8UI: GLenum
    get() = JGL30C.GL_RGB8UI
actual inline val GL_RGBA32I: GLenum
    get() = JGL30C.GL_RGBA32I
actual inline val GL_RGB32I: GLenum
    get() = JGL30C.GL_RGB32I
actual inline val GL_RGBA16I: GLenum
    get() = JGL30C.GL_RGBA16I
actual inline val GL_RGB16I: GLenum
    get() = JGL30C.GL_RGB16I
actual inline val GL_RGBA8I: GLenum
    get() = JGL30C.GL_RGBA8I
actual inline val GL_RGB8I: GLenum
    get() = JGL30C.GL_RGB8I
actual inline val GL_RED_INTEGER: GLenum
    get() = JGL30C.GL_RED_INTEGER
actual inline val GL_RGB_INTEGER: GLenum
    get() = JGL30C.GL_RGB_INTEGER
actual inline val GL_RGBA_INTEGER: GLenum
    get() = JGL30C.GL_RGBA_INTEGER
actual inline val GL_SAMPLER_2D_ARRAY: GLenum
    get() = JGL30C.GL_SAMPLER_2D_ARRAY
actual inline val GL_SAMPLER_2D_ARRAY_SHADOW: GLenum
    get() = JGL30C.GL_SAMPLER_2D_ARRAY_SHADOW
actual inline val GL_SAMPLER_CUBE_SHADOW: GLenum
    get() = JGL30C.GL_SAMPLER_CUBE_SHADOW
actual inline val GL_UNSIGNED_INT_VEC2: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_VEC2
actual inline val GL_UNSIGNED_INT_VEC3: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_VEC3
actual inline val GL_UNSIGNED_INT_VEC4: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_VEC4
actual inline val GL_INT_SAMPLER_2D: GLenum
    get() = JGL30C.GL_INT_SAMPLER_2D
actual inline val GL_INT_SAMPLER_3D: GLenum
    get() = JGL30C.GL_INT_SAMPLER_3D
actual inline val GL_INT_SAMPLER_CUBE: GLenum
    get() = JGL30C.GL_INT_SAMPLER_CUBE
actual inline val GL_INT_SAMPLER_2D_ARRAY: GLenum
    get() = JGL30C.GL_INT_SAMPLER_2D_ARRAY
actual inline val GL_UNSIGNED_INT_SAMPLER_2D: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_SAMPLER_2D
actual inline val GL_UNSIGNED_INT_SAMPLER_3D: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_SAMPLER_3D
actual inline val GL_UNSIGNED_INT_SAMPLER_CUBE: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_SAMPLER_CUBE
actual inline val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY
actual inline val GL_DEPTH_COMPONENT32F: GLenum
    get() = JGL30C.GL_DEPTH_COMPONENT32F
actual inline val GL_DEPTH32F_STENCIL8: GLenum
    get() = JGL30C.GL_DEPTH32F_STENCIL8
actual inline val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
    get() = JGL30C.GL_FLOAT_32_UNSIGNED_INT_24_8_REV
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_DEFAULT: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_DEFAULT
actual inline val GL_DEPTH_STENCIL_ATTACHMENT: GLenum
    get() = JGL30C.GL_DEPTH_STENCIL_ATTACHMENT
actual inline val GL_DEPTH_STENCIL: GLenum
    get() = JGL30C.GL_DEPTH_STENCIL
actual inline val GL_UNSIGNED_INT_24_8: GLenum
    get() = JGL30C.GL_UNSIGNED_INT_24_8
actual inline val GL_DEPTH24_STENCIL8: GLenum
    get() = JGL30C.GL_DEPTH24_STENCIL8
actual inline val GL_UNSIGNED_NORMALIZED: GLenum
    get() = JGL30C.GL_UNSIGNED_NORMALIZED
actual inline val GL_DRAW_FRAMEBUFFER_BINDING: GLenum
    get() = JGL30C.GL_DRAW_FRAMEBUFFER_BINDING
actual inline val GL_READ_FRAMEBUFFER: GLenum
    get() = JGL30C.GL_READ_FRAMEBUFFER
actual inline val GL_DRAW_FRAMEBUFFER: GLenum
    get() = JGL30C.GL_DRAW_FRAMEBUFFER
actual inline val GL_READ_FRAMEBUFFER_BINDING: GLenum
    get() = JGL30C.GL_READ_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_SAMPLES: GLenum
    get() = JGL30C.GL_RENDERBUFFER_SAMPLES
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER
actual inline val GL_MAX_COLOR_ATTACHMENTS: GLenum
    get() = JGL30C.GL_MAX_COLOR_ATTACHMENTS
actual inline val GL_COLOR_ATTACHMENT1: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT1
actual inline val GL_COLOR_ATTACHMENT2: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT2
actual inline val GL_COLOR_ATTACHMENT3: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT3
actual inline val GL_COLOR_ATTACHMENT4: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT4
actual inline val GL_COLOR_ATTACHMENT5: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT5
actual inline val GL_COLOR_ATTACHMENT6: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT6
actual inline val GL_COLOR_ATTACHMENT7: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT7
actual inline val GL_COLOR_ATTACHMENT8: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT8
actual inline val GL_COLOR_ATTACHMENT9: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT9
actual inline val GL_COLOR_ATTACHMENT10: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT10
actual inline val GL_COLOR_ATTACHMENT11: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT11
actual inline val GL_COLOR_ATTACHMENT12: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT12
actual inline val GL_COLOR_ATTACHMENT13: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT13
actual inline val GL_COLOR_ATTACHMENT14: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT14
actual inline val GL_COLOR_ATTACHMENT15: GLenum
    get() = JGL30C.GL_COLOR_ATTACHMENT15
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
    get() = JGL30C.GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE
actual inline val GL_MAX_SAMPLES: GLenum
    get() = JGL30C.GL_MAX_SAMPLES
actual inline val GL_HALF_FLOAT: GLenum
    get() = JGL30C.GL_HALF_FLOAT
actual inline val GL_RG: GLenum
    get() = JGL30C.GL_RG
actual inline val GL_RG_INTEGER: GLenum
    get() = JGL30C.GL_RG_INTEGER
actual inline val GL_R8: GLenum
    get() = JGL30C.GL_R8
actual inline val GL_RG8: GLenum
    get() = JGL30C.GL_RG8
actual inline val GL_R16F: GLenum
    get() = JGL30C.GL_R16F
actual inline val GL_R32F: GLenum
    get() = JGL30C.GL_R32F
actual inline val GL_RG16F: GLenum
    get() = JGL30C.GL_RG16F
actual inline val GL_RG32F: GLenum
    get() = JGL30C.GL_RG32F
actual inline val GL_R8I: GLenum
    get() = JGL30C.GL_R8I
actual inline val GL_R8UI: GLenum
    get() = JGL30C.GL_R8UI
actual inline val GL_R16I: GLenum
    get() = JGL30C.GL_R16I
actual inline val GL_R16UI: GLenum
    get() = JGL30C.GL_R16UI
actual inline val GL_R32I: GLenum
    get() = JGL30C.GL_R32I
actual inline val GL_R32UI: GLenum
    get() = JGL30C.GL_R32UI
actual inline val GL_RG8I: GLenum
    get() = JGL30C.GL_RG8I
actual inline val GL_RG8UI: GLenum
    get() = JGL30C.GL_RG8UI
actual inline val GL_RG16I: GLenum
    get() = JGL30C.GL_RG16I
actual inline val GL_RG16UI: GLenum
    get() = JGL30C.GL_RG16UI
actual inline val GL_RG32I: GLenum
    get() = JGL30C.GL_RG32I
actual inline val GL_RG32UI: GLenum
    get() = JGL30C.GL_RG32UI
actual inline val GL_VERTEX_ARRAY_BINDING: GLenum
    get() = JGL30C.GL_VERTEX_ARRAY_BINDING
actual inline val GL_CONTEXT_FLAGS: GLenum
    get() = JGL30C.GL_CONTEXT_FLAGS

actual inline fun GL30.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
) = JGL30C.glBindFramebuffer(
    target, framebuffer
)

actual inline fun GL30.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
) = JGL30C.glBindRenderbuffer(
    target, renderbuffer
)

actual inline fun GL30.glCheckFramebufferStatus(
    target: GLenum
) = JGL30C.glCheckFramebufferStatus(
    target
)

actual inline fun GL30.glCreateFramebuffer(
) = JGL30C.glGenFramebuffers(
)

actual inline fun GL30.glCreateRenderbuffer(
) = JGL30C.glGenRenderbuffers(
)

actual inline fun GL30.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
) = JGL30C.glDeleteFramebuffers(
    framebuffer
)

actual inline fun GL30.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
) = JGL30C.glDeleteRenderbuffers(
    renderbuffer
)

actual inline fun GL30.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
) = JGL30C.glFramebufferRenderbuffer(
    target, attachment, renderbuffertarget, renderbuffer
)

actual inline fun GL30.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
) = JGL30C.glFramebufferTexture2D(
    target, attachment, textarget, texture, level
)

actual inline fun GL30.glGenerateMipmap(
    target: GLenum
) = JGL30C.glGenerateMipmap(
    target
)

actual inline fun GL30.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
) = JGL30C.glGetFramebufferAttachmentParameteriv(
    target, attachment, pname, params
)

actual inline fun GL30.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGL30C.glGetRenderbufferParameteriv(
    target, pname, params
)

actual inline fun GL30.glIsFramebuffer(
    framebuffer: GLFramebuffer
) = JGL30C.glIsFramebuffer(
    framebuffer
)

actual inline fun GL30.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
) = JGL30C.glIsRenderbuffer(
    renderbuffer
)

actual inline fun GL30.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
) = JGL30C.glRenderbufferStorage(
    target, internalformat, width, height
)

actual inline fun GL30.glGetBufferSubData(
    target: GLenum, srcByteOffset: GLintptr, dstData: DataBuffer,
    dstOffset: GLuint, length: GLuint
) = dstData.write { buffer ->
    val mapped = JGL30C.glMapBufferRange(
        target, srcByteOffset.toLong(), length.toLong(),
        JGL30C.GL_MAP_READ_BIT
    ) ?: return
    buffer.duplicate().put(mapped)
    JGL30C.glUnmapBuffer(target)
}

actual inline fun GL30.glBlitFramebuffer(
    srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint,
    dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint,
    mask: GLbitfield, filter: GLenum
) = JGL30C.glBlitFramebuffer(
    srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1,
    mask, filter
)

actual inline fun GL30.glFramebufferTextureLayer(
    target: GLenum, attachment: GLenum, texture: GLTexture, level: GLint,
    layer: GLint
) = JGL30C.glFramebufferTextureLayer(
    target, attachment, texture, level, layer
)

actual inline fun GL30.glRenderbufferStorageMultisample(
    target: GLenum, samples: GLsizei, internalformat: GLenum,
    width: GLsizei, height: GLsizei
) = JGL30C.glRenderbufferStorageMultisample(
    target, samples, internalformat, width, height
)

actual inline fun GL15.glGetFragDataLocation(
    program: GLProgram, name: DOMString
) = JGL30C.glGetFragDataLocation(
    program, name
)

actual inline fun GL30.glUniform1ui(
    location: GLUniformLocation, v0: GLuint
) = JGL30C.glUniform1ui(
    location, v0.toInt()
)

actual inline fun GL30.glUniform2ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint
) = JGL30C.glUniform2ui(
    location, v0.toInt(), v1.toInt()
)

actual inline fun GL30.glUniform3ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint
) = JGL30C.glUniform3ui(
    location, v0.toInt(), v1.toInt(), v2.toInt()
)

actual inline fun GL30.glUniform4ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint
) = JGL30C.glUniform4ui(
    location, v0.toInt(), v1.toInt(), v2.toInt(), v3.toInt()
)

actual inline fun GL30.glUniform1uiv(
    location: GLUniformLocation, data: Uint32List
) = JGL30C.glUniform1uiv(
    location, data.asIntArray()
)

actual inline fun GL30.glUniform2uiv(
    location: GLUniformLocation, data: Uint32List
) = JGL30C.glUniform2uiv(
    location, data.asIntArray()
)

actual inline fun GL30.glUniform3uiv(
    location: GLUniformLocation, data: Uint32List
) = JGL30C.glUniform3uiv(
    location, data.asIntArray()
)

actual inline fun GL30.glUniform4uiv(
    location: GLUniformLocation, data: Uint32List
) = JGL30C.glUniform4uiv(
    location, data.asIntArray()
)

actual inline fun GL30.glVertexAttribI4i(
    index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint
) = JGL30C.glVertexAttribI4i(
    index.toInt(), x, y, z, w
)

actual inline fun GL30.glVertexAttribI4iv(
    index: GLuint, values: Int32List
) = JGL30C.glVertexAttribI4iv(
    index.toInt(), values
)

actual inline fun GL30.glVertexAttribI4ui(
    index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint
) = JGL30C.glVertexAttribI4ui(
    index.toInt(), x.toInt(), y.toInt(), z.toInt(), w.toInt()
)

actual inline fun GL30.glVertexAttribI4uiv(
    index: GLuint, values: Uint32List
) = JGL30C.glVertexAttribI4uiv(
    index.toInt(), values.asIntArray()
)

actual inline fun GL30.glVertexAttribIPointer(
    index: GLuint, size: GLint, type: GLenum, stride: GLsizei, offset: GLintptr
) = JGL30C.glVertexAttribIPointer(
    index.toInt(), size, type, stride, offset.toLong()
)

actual inline fun GL30.glClearBufferfv(
    buffer: GLenum, drawbuffer: GLint, values: Float32List
) = JGL30C.glClearBufferfv(
    buffer, drawbuffer, values
)

actual inline fun GL30.glClearBufferiv(
    buffer: GLenum, drawbuffer: GLint, values: Int32List
) = JGL30C.glClearBufferiv(
    buffer, drawbuffer, values
)

actual inline fun GL30.glClearBufferuiv(
    buffer: GLenum, drawbuffer: GLint, values: Uint32List
) = JGL30C.glClearBufferuiv(
    buffer, drawbuffer, values.asIntArray()
)

actual inline fun GL30.glClearBufferfi(
    buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint
) = JGL30C.glClearBufferfi(
    buffer, drawbuffer, depth, stencil
)

actual inline fun GL30.glBeginTransformFeedback(
    primitiveMode: GLenum
) = JGL30C.glBeginTransformFeedback(
    primitiveMode
)

actual inline fun GL30.glEndTransformFeedback(
) = JGL30C.glEndTransformFeedback(
)

actual inline fun GL30.glTransformFeedbackVaryings(
    program: GLProgram, varyings: sequence_DOMString, bufferMode: GLenum
) = JGL30C.glTransformFeedbackVaryings(
    program, varyings, bufferMode
)

actual inline fun GL30.glBindBufferBase(
    target: GLenum, index: GLuint, buffer: GLBuffer
) = JGL30C.glBindBufferBase(
    target, index.toInt(), buffer
)

actual inline fun GL30.glBindBufferRange(
    target: GLenum, index: GLuint, buffer: GLBuffer, offset: GLintptr,
    size: GLsizeiptr
) = JGL30C.glBindBufferRange(
    target, index.toInt(), buffer, offset.toLong(), size.toLong()
)

actual inline fun GL30.glCreateVertexArray(
) = JGL30C.glGenVertexArrays(
)

actual inline fun GL30.glDeleteVertexArray(
    vertexArray: GLVertexArrayObject
) = JGL30C.glDeleteVertexArrays(
    vertexArray
)

actual inline fun GL30.glIsVertexArray(
    vertexArray: GLVertexArrayObject
) = JGL30C.glIsVertexArray(
    vertexArray
)

actual inline fun GL30.glBindVertexArray(
    array: GLVertexArrayObject
) = JGL30C.glBindVertexArray(
    array
)
