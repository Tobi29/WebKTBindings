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

expect val GL_FRAMEBUFFER: GLenum
expect val GL_RENDERBUFFER: GLenum
expect val GL_STENCIL_INDEX: GLenum
expect val GL_STENCIL_INDEX8: GLenum
expect val GL_RENDERBUFFER_WIDTH: GLenum
expect val GL_RENDERBUFFER_HEIGHT: GLenum
expect val GL_RENDERBUFFER_INTERNAL_FORMAT: GLenum
expect val GL_RENDERBUFFER_RED_SIZE: GLenum
expect val GL_RENDERBUFFER_GREEN_SIZE: GLenum
expect val GL_RENDERBUFFER_BLUE_SIZE: GLenum
expect val GL_RENDERBUFFER_ALPHA_SIZE: GLenum
expect val GL_RENDERBUFFER_DEPTH_SIZE: GLenum
expect val GL_RENDERBUFFER_STENCIL_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
expect val GL_COLOR_ATTACHMENT0: GLenum
expect val GL_DEPTH_ATTACHMENT: GLenum
expect val GL_STENCIL_ATTACHMENT: GLenum
expect val GL_FRAMEBUFFER_COMPLETE: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
expect val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
expect val GL_FRAMEBUFFER_BINDING: GLenum
expect val GL_RENDERBUFFER_BINDING: GLenum
expect val GL_MAX_RENDERBUFFER_SIZE: GLenum
expect val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum
expect val GL_COMPARE_REF_TO_TEXTURE: GLenum
expect val GL_RGBA32F: GLenum
expect val GL_RGB32F: GLenum
expect val GL_RGBA16F: GLenum
expect val GL_RGB16F: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
expect val GL_MAX_ARRAY_TEXTURE_LAYERS: GLenum
expect val GL_MIN_PROGRAM_TEXEL_OFFSET: GLenum
expect val GL_MAX_PROGRAM_TEXEL_OFFSET: GLenum
expect val GL_MAX_VARYING_COMPONENTS: GLenum
expect val GL_TEXTURE_2D_ARRAY: GLenum
expect val GL_TEXTURE_BINDING_2D_ARRAY: GLenum
expect val GL_R11F_G11F_B10F: GLenum
expect val GL_UNSIGNED_INT_10F_11F_11F_REV: GLenum
expect val GL_RGB9_E5: GLenum
expect val GL_UNSIGNED_INT_5_9_9_9_REV: GLenum
expect val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
expect val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
expect val GL_TRANSFORM_FEEDBACK_VARYINGS: GLenum
expect val GL_TRANSFORM_FEEDBACK_BUFFER_START: GLenum
expect val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
expect val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
expect val GL_RASTERIZER_DISCARD: GLenum
expect val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
expect val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
expect val GL_INTERLEAVED_ATTRIBS: GLenum
expect val GL_SEPARATE_ATTRIBS: GLenum
expect val GL_TRANSFORM_FEEDBACK_BUFFER: GLenum
expect val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
expect val GL_RGBA32UI: GLenum
expect val GL_RGB32UI: GLenum
expect val GL_RGBA16UI: GLenum
expect val GL_RGB16UI: GLenum
expect val GL_RGBA8UI: GLenum
expect val GL_RGB8UI: GLenum
expect val GL_RGBA32I: GLenum
expect val GL_RGB32I: GLenum
expect val GL_RGBA16I: GLenum
expect val GL_RGB16I: GLenum
expect val GL_RGBA8I: GLenum
expect val GL_RGB8I: GLenum
expect val GL_RED_INTEGER: GLenum
expect val GL_RGB_INTEGER: GLenum
expect val GL_RGBA_INTEGER: GLenum
expect val GL_SAMPLER_2D_ARRAY: GLenum
expect val GL_SAMPLER_2D_ARRAY_SHADOW: GLenum
expect val GL_SAMPLER_CUBE_SHADOW: GLenum
expect val GL_UNSIGNED_INT_VEC2: GLenum
expect val GL_UNSIGNED_INT_VEC3: GLenum
expect val GL_UNSIGNED_INT_VEC4: GLenum
expect val GL_INT_SAMPLER_2D: GLenum
expect val GL_INT_SAMPLER_3D: GLenum
expect val GL_INT_SAMPLER_CUBE: GLenum
expect val GL_INT_SAMPLER_2D_ARRAY: GLenum
expect val GL_UNSIGNED_INT_SAMPLER_2D: GLenum
expect val GL_UNSIGNED_INT_SAMPLER_3D: GLenum
expect val GL_UNSIGNED_INT_SAMPLER_CUBE: GLenum
expect val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
expect val GL_DEPTH_COMPONENT32F: GLenum
expect val GL_DEPTH32F_STENCIL8: GLenum
expect val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
expect val GL_FRAMEBUFFER_DEFAULT: GLenum
expect val GL_DEPTH_STENCIL_ATTACHMENT: GLenum
expect val GL_DEPTH_STENCIL: GLenum
expect val GL_UNSIGNED_INT_24_8: GLenum
expect val GL_DEPTH24_STENCIL8: GLenum
expect val GL_UNSIGNED_NORMALIZED: GLenum
expect val GL_DRAW_FRAMEBUFFER_BINDING: GLenum
expect val GL_READ_FRAMEBUFFER: GLenum
expect val GL_DRAW_FRAMEBUFFER: GLenum
expect val GL_READ_FRAMEBUFFER_BINDING: GLenum
expect val GL_RENDERBUFFER_SAMPLES: GLenum
expect val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
expect val GL_MAX_COLOR_ATTACHMENTS: GLenum
expect val GL_COLOR_ATTACHMENT1: GLenum
expect val GL_COLOR_ATTACHMENT2: GLenum
expect val GL_COLOR_ATTACHMENT3: GLenum
expect val GL_COLOR_ATTACHMENT4: GLenum
expect val GL_COLOR_ATTACHMENT5: GLenum
expect val GL_COLOR_ATTACHMENT6: GLenum
expect val GL_COLOR_ATTACHMENT7: GLenum
expect val GL_COLOR_ATTACHMENT8: GLenum
expect val GL_COLOR_ATTACHMENT9: GLenum
expect val GL_COLOR_ATTACHMENT10: GLenum
expect val GL_COLOR_ATTACHMENT11: GLenum
expect val GL_COLOR_ATTACHMENT12: GLenum
expect val GL_COLOR_ATTACHMENT13: GLenum
expect val GL_COLOR_ATTACHMENT14: GLenum
expect val GL_COLOR_ATTACHMENT15: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
expect val GL_MAX_SAMPLES: GLenum
expect val GL_HALF_FLOAT: GLenum
expect val GL_RG: GLenum
expect val GL_RG_INTEGER: GLenum
expect val GL_R8: GLenum
expect val GL_RG8: GLenum
expect val GL_R16F: GLenum
expect val GL_R32F: GLenum
expect val GL_RG16F: GLenum
expect val GL_RG32F: GLenum
expect val GL_R8I: GLenum
expect val GL_R8UI: GLenum
expect val GL_R16I: GLenum
expect val GL_R16UI: GLenum
expect val GL_R32I: GLenum
expect val GL_R32UI: GLenum
expect val GL_RG8I: GLenum
expect val GL_RG8UI: GLenum
expect val GL_RG16I: GLenum
expect val GL_RG16UI: GLenum
expect val GL_RG32I: GLenum
expect val GL_RG32UI: GLenum
expect val GL_VERTEX_ARRAY_BINDING: GLenum
expect val GL_CONTEXT_FLAGS: GLenum

expect fun GL30.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
)

expect fun GL30.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
)

expect fun GL30.glCheckFramebufferStatus(
    target: GLenum
): GLenum

expect fun GL30.glCreateFramebuffer(
): GLFramebuffer

expect fun GL30.glCreateRenderbuffer(
): GLRenderbuffer

expect fun GL30.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
)

expect fun GL30.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
)

expect fun GL30.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
)

expect fun GL30.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
)

expect fun GL30.glGenerateMipmap(
    target: GLenum
)

expect fun GL30.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GL30.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GL30.glIsFramebuffer(
    framebuffer: GLFramebuffer
): GLboolean

expect fun GL30.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
): GLboolean

expect fun GL30.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
)

expect fun GL30.glGetBufferSubData(
    target: GLenum, srcByteOffset: GLintptr, dstData: DataBuffer,
    dstOffset: GLuint, length: GLuint
)

expect fun GL30.glBlitFramebuffer(
    srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint,
    dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint,
    mask: GLbitfield, filter: GLenum
)

expect fun GL30.glFramebufferTextureLayer(
    target: GLenum, attachment: GLenum, texture: GLTexture, level: GLint,
    layer: GLint
)

expect fun GL30.glRenderbufferStorageMultisample(
    target: GLenum, samples: GLsizei, internalformat: GLenum,
    width: GLsizei, height: GLsizei
)

expect fun GL15.glGetFragDataLocation(
    program: GLProgram, name: DOMString
): GLint

expect fun GL30.glUniform1ui(
    location: GLUniformLocation, v0: GLuint
)

expect fun GL30.glUniform2ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint
)

expect fun GL30.glUniform3ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint
)

expect fun GL30.glUniform4ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint
)

expect fun GL30.glUniform1uiv(
    location: GLUniformLocation, data: Uint32List
)

expect fun GL30.glUniform2uiv(
    location: GLUniformLocation, data: Uint32List
)

expect fun GL30.glUniform3uiv(
    location: GLUniformLocation, data: Uint32List
)

expect fun GL30.glUniform4uiv(
    location: GLUniformLocation, data: Uint32List
)

expect fun GL30.glVertexAttribI4i(
    index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint
)

expect fun GL30.glVertexAttribI4iv(
    index: GLuint, values: Int32List
)

expect fun GL30.glVertexAttribI4ui(
    index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint
)

expect fun GL30.glVertexAttribI4uiv(
    index: GLuint, values: Uint32List
)

expect fun GL30.glVertexAttribIPointer(
    index: GLuint, size: GLint, type: GLenum, stride: GLsizei, offset: GLintptr
)

expect fun GL30.glClearBufferfv(
    buffer: GLenum, drawbuffer: GLint, values: Float32List
)

expect fun GL30.glClearBufferiv(
    buffer: GLenum, drawbuffer: GLint, values: Int32List
)

expect fun GL30.glClearBufferuiv(
    buffer: GLenum, drawbuffer: GLint, values: Uint32List
)

expect fun GL30.glClearBufferfi(
    buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint
)

expect fun GL30.glBeginTransformFeedback(
    primitiveMode: GLenum
)

expect fun GL30.glEndTransformFeedback(
)

expect fun GL30.glTransformFeedbackVaryings(
    program: GLProgram, varyings: sequence_DOMString, bufferMode: GLenum
)

expect fun GL30.glBindBufferBase(
    target: GLenum, index: GLuint, buffer: GLBuffer
)

expect fun GL30.glBindBufferRange(
    target: GLenum, index: GLuint, buffer: GLBuffer, offset: GLintptr,
    size: GLsizeiptr
)

expect fun GL30.glCreateVertexArray(
): GLVertexArrayObject

expect fun GL30.glDeleteVertexArray(
    vertexArray: GLVertexArrayObject
)

expect fun GL30.glIsVertexArray(
    vertexArray: GLVertexArrayObject
): GLboolean

expect fun GL30.glBindVertexArray(
    array: GLVertexArrayObject
)
