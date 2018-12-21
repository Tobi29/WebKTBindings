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

package net.gitout.ktbindings.gles

import net.gitout.ktbindings.utils.DataBuffer

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
expect val GL_MIN: GLenum
expect val GL_MAX: GLenum
expect val GL_DEPTH_COMPONENT24: GLenum
expect val GL_MAX_TEXTURE_LOD_BIAS: GLenum
expect val GL_TEXTURE_COMPARE_MODE: GLenum
expect val GL_TEXTURE_COMPARE_FUNC: GLenum
expect val GL_CURRENT_QUERY: GLenum
expect val GL_QUERY_RESULT: GLenum
expect val GL_QUERY_RESULT_AVAILABLE: GLenum
expect val GL_STREAM_READ: GLenum
expect val GL_STREAM_COPY: GLenum
expect val GL_STATIC_READ: GLenum
expect val GL_STATIC_COPY: GLenum
expect val GL_DYNAMIC_READ: GLenum
expect val GL_DYNAMIC_COPY: GLenum
expect val GL_MAX_DRAW_BUFFERS: GLenum
expect val GL_DRAW_BUFFER0: GLenum
expect val GL_DRAW_BUFFER1: GLenum
expect val GL_DRAW_BUFFER2: GLenum
expect val GL_DRAW_BUFFER3: GLenum
expect val GL_DRAW_BUFFER4: GLenum
expect val GL_DRAW_BUFFER5: GLenum
expect val GL_DRAW_BUFFER6: GLenum
expect val GL_DRAW_BUFFER7: GLenum
expect val GL_DRAW_BUFFER8: GLenum
expect val GL_DRAW_BUFFER9: GLenum
expect val GL_DRAW_BUFFER10: GLenum
expect val GL_DRAW_BUFFER11: GLenum
expect val GL_DRAW_BUFFER12: GLenum
expect val GL_DRAW_BUFFER13: GLenum
expect val GL_DRAW_BUFFER14: GLenum
expect val GL_DRAW_BUFFER15: GLenum
expect val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
expect val GL_MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
expect val GL_SAMPLER_3D: GLenum
expect val GL_SAMPLER_2D_SHADOW: GLenum
expect val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
expect val GL_PIXEL_PACK_BUFFER: GLenum
expect val GL_PIXEL_UNPACK_BUFFER: GLenum
expect val GL_PIXEL_PACK_BUFFER_BINDING: GLenum
expect val GL_PIXEL_UNPACK_BUFFER_BINDING: GLenum
expect val GL_FLOAT_MAT2x3: GLenum
expect val GL_FLOAT_MAT2x4: GLenum
expect val GL_FLOAT_MAT3x2: GLenum
expect val GL_FLOAT_MAT3x4: GLenum
expect val GL_FLOAT_MAT4x2: GLenum
expect val GL_FLOAT_MAT4x3: GLenum
expect val GL_SRGB: GLenum
expect val GL_SRGB8: GLenum
expect val GL_SRGB8_ALPHA8: GLenum
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
expect val GL_R8_SNORM: GLenum
expect val GL_RG8_SNORM: GLenum
expect val GL_RGB8_SNORM: GLenum
expect val GL_RGBA8_SNORM: GLenum
expect val GL_SIGNED_NORMALIZED: GLenum
expect val GL_COPY_READ_BUFFER: GLenum
expect val GL_COPY_WRITE_BUFFER: GLenum
expect val GL_COPY_READ_BUFFER_BINDING: GLenum
expect val GL_COPY_WRITE_BUFFER_BINDING: GLenum
expect val GL_UNIFORM_BUFFER: GLenum
expect val GL_UNIFORM_BUFFER_BINDING: GLenum
expect val GL_UNIFORM_BUFFER_START: GLenum
expect val GL_UNIFORM_BUFFER_SIZE: GLenum
expect val GL_MAX_VERTEX_UNIFORM_BLOCKS: GLenum
expect val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
expect val GL_MAX_COMBINED_UNIFORM_BLOCKS: GLenum
expect val GL_MAX_UNIFORM_BUFFER_BINDINGS: GLenum
expect val GL_MAX_UNIFORM_BLOCK_SIZE: GLenum
expect val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
expect val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
expect val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
expect val GL_ACTIVE_UNIFORM_BLOCKS: GLenum
expect val GL_UNIFORM_TYPE: GLenum
expect val GL_UNIFORM_SIZE: GLenum
expect val GL_UNIFORM_BLOCK_INDEX: GLenum
expect val GL_UNIFORM_OFFSET: GLenum
expect val GL_UNIFORM_ARRAY_STRIDE: GLenum
expect val GL_UNIFORM_MATRIX_STRIDE: GLenum
expect val GL_UNIFORM_IS_ROW_MAJOR: GLenum
expect val GL_UNIFORM_BLOCK_BINDING: GLenum
expect val GL_UNIFORM_BLOCK_DATA_SIZE: GLenum
expect val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
expect val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
expect val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
expect val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
expect val GL_INVALID_INDEX: GLenum
expect val GL_MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
expect val GL_MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
expect val GL_MAX_SERVER_WAIT_TIMEOUT: GLenum
expect val GL_OBJECT_TYPE: GLenum
expect val GL_SYNC_CONDITION: GLenum
expect val GL_SYNC_STATUS: GLenum
expect val GL_SYNC_FLAGS: GLenum
expect val GL_SYNC_FENCE: GLenum
expect val GL_SYNC_GPU_COMMANDS_COMPLETE: GLenum
expect val GL_UNSIGNALED: GLenum
expect val GL_SIGNALED: GLenum
expect val GL_ALREADY_SIGNALED: GLenum
expect val GL_TIMEOUT_EXPIRED: GLenum
expect val GL_CONDITION_SATISFIED: GLenum
expect val GL_WAIT_FAILED: GLenum
expect val GL_SYNC_FLUSH_COMMANDS_BIT: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
expect val GL_ANY_SAMPLES_PASSED: GLenum
expect val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
expect val GL_SAMPLER_BINDING: GLenum
expect val GL_RGB10_A2UI: GLenum
expect val GL_INT_2_10_10_10_REV: GLenum
expect val GL_TRANSFORM_FEEDBACK: GLenum
expect val GL_TRANSFORM_FEEDBACK_PAUSED: GLenum
expect val GL_TRANSFORM_FEEDBACK_ACTIVE: GLenum
expect val GL_TRANSFORM_FEEDBACK_BINDING: GLenum
expect val GL_TEXTURE_IMMUTABLE_FORMAT: GLenum
expect val GL_MAX_ELEMENT_INDEX: GLenum
expect val GL_TEXTURE_IMMUTABLE_LEVELS: GLenum

expect val GL_TIMEOUT_IGNORED: GLint64

expect fun GLES30.glCopyBufferSubData(
    readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr,
    writeOffset: GLintptr, size: GLsizeiptr
)

expect fun GLES30.glGetBufferSubData(
    target: GLenum, srcByteOffset: GLintptr, dstData: DataBuffer,
    dstOffset: GLuint = 0u, length: GLuint = 0u
)

expect fun GLES30.glBlitFramebuffer(
    srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint,
    dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint,
    mask: GLbitfield, filter: GLenum
)

expect fun GLES30.glFramebufferTextureLayer(
    target: GLenum, attachment: GLenum, texture: GLTexture, level: GLint,
    layer: GLint
)

expect fun GLES30.glInvalidateFramebuffer(
    target: GLenum, attachments: sequence_GLenum
)

expect fun GLES30.glInvalidateSubFramebuffer(
    target: GLenum, attachments: sequence_GLenum,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GLES30.glReadBuffer(
    src: GLenum
)

expect fun GLES30.glGetInternalformativ(
    target: GLenum, internalformat: GLenum, pname: GLenum,
    params: sequence_GLint
)

expect fun GLES30.glRenderbufferStorageMultisample(
    target: GLenum, samples: GLsizei, internalformat: GLenum,
    width: GLsizei, height: GLsizei
)

expect fun GLES30.glTexStorage2D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei
)

expect fun GLES30.glTexStorage3D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei
)

expect fun GLES30.glTexImage3D(
    target: GLenum, level: GLint, internalformat: GLint, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, format: GLenum,
    type: GLenum, srcData: DataBuffer?
)

expect fun GLES30.glTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, type: GLenum, srcData: DataBuffer
)

expect fun GLES30.glCopyTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    x: GLint, y: GLint,
    width: GLsizei, height: GLsizei
)

expect fun GLES30.glCompressedTexImage3D(
    target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, srcData: DataBuffer
)

expect fun GLES30.glCompressedTexSubImage3D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, srcData: DataBuffer
)

expect fun GLES30.glGetFragDataLocation(
    program: GLProgram, name: DOMString
): GLint

expect fun GLES30.glUniform1ui(
    location: GLUniformLocation, v0: GLuint
)

expect fun GLES30.glUniform2ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint
)

expect fun GLES30.glUniform3ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint
)

expect fun GLES30.glUniform4ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint
)

expect fun GLES30.glUniformMatrix3x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glUniformMatrix4x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glUniformMatrix2x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glUniformMatrix4x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glUniformMatrix2x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glUniformMatrix3x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GLES30.glVertexAttribI4i(
    index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint
)

expect fun GLES30.glVertexAttribI4iv(
    index: GLuint, values: Int32List
)

expect fun GLES30.glVertexAttribI4ui(
    index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint
)

expect fun GLES30.glVertexAttribI4uiv(
    index: GLuint, values: Uint32List
)

expect fun GLES30.glVertexAttribIPointer(
    index: GLuint, size: GLint, type: GLenum, stride: GLsizei, offset: GLintptr
)

expect fun GLES30.glVertexAttribDivisor(
    index: GLuint, divisor: GLuint
)

expect fun GLES30.glDrawArraysInstanced(
    mode: GLenum, first: GLint, count: GLsizei, instanceCount: GLsizei
)

expect fun GLES30.glDrawElementsInstanced(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr,
    instanceCount: GLsizei
)

expect fun GLES30.glDrawRangeElements(
    mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum,
    offset: GLintptr
)

expect fun GLES30.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, offset: GLintptr
)

expect fun GLES30.glDrawBuffers(
    buffers: sequence_GLenum
)

expect fun GLES30.glClearBufferfv(
    buffer: GLenum, drawbuffer: GLint, values: Float32List
)

expect fun GLES30.glClearBufferiv(
    buffer: GLenum, drawbuffer: GLint, values: Int32List
)

expect fun GLES30.glClearBufferuiv(
    buffer: GLenum, drawbuffer: GLint, values: Uint32List
)

expect fun GLES30.glClearBufferfi(
    buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint
)

expect fun GLES30.glCreateQuery(
): GLQuery

expect fun GLES30.glDeleteQuery(
    query: GLQuery
)

expect fun GLES30.glIsQuery(
    query: GLQuery
): GLboolean

expect fun GLES30.glBeginQuery(
    target: GLenum, query: GLQuery
)

expect fun GLES30.glEndQuery(
    target: GLenum
)

expect fun GLES30.glGetQuery(
    target: GLenum, pname: GLenum
): GLQuery

expect fun GLES30.glGetQueryObjectuiv(
    query: GLQuery, pname: GLenum, params: sequence_GLuint
)

expect fun GLES30.glCreateSampler(
): GLSampler

expect fun GLES30.glDeleteSampler(
    sampler: GLSampler
)

expect fun GLES30.glIsSampler(
    sampler: GLSampler
): GLboolean

expect fun GLES30.glBindSampler(
    unit: GLuint, sampler: GLSampler
)

expect fun GLES30.glSamplerParameteri(
    sampler: GLSampler, pname: GLenum, param: GLint
)

expect fun GLES30.glSamplerParameterf(
    sampler: GLSampler, pname: GLenum, param: GLfloat
)

expect fun GLES30.glGetSamplerParameteriv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLint
)

expect fun GLES30.glGetSamplerParameterfv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLfloat
)

expect fun GLES30.glFenceSync(
    condition: GLenum, flags: GLbitfield
): GLSync

expect fun GLES30.glIsSync(
    sync: GLSync
): GLboolean

expect fun GLES30.glDeleteSync(
    sync: GLSync
)

expect fun GLES30.glClientWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLuint64
): GLenum

expect fun GLES30.glWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLint64
)

expect fun GLES30.glGetSynciv(
    sync: GLSync, pname: GLenum, length: sequence_GLsizei,
    values: sequence_GLint
)

expect fun GLES30.glCreateTransformFeedback(
): GLTransformFeedback

expect fun GLES30.glDeleteTransformFeedback(
    tf: GLTransformFeedback
)

expect fun GLES30.glIsTransformFeedback(
    tf: GLTransformFeedback
): GLboolean

expect fun GLES30.glBindTransformFeedback(
    target: GLenum, tf: GLTransformFeedback
)

expect fun GLES30.glBeginTransformFeedback(
    primitiveMode: GLenum
)

expect fun GLES30.glEndTransformFeedback(
)

expect fun GLES30.glTransformFeedbackVaryings(
    program: GLProgram, varyings: sequence_DOMString, bufferMode: GLenum
)

expect fun GLES30.glPauseTransformFeedback(
)

expect fun GLES30.glResumeTransformFeedback(
)

expect fun GLES30.glBindBufferBase(
    target: GLenum, index: GLuint, buffer: GLBuffer
)

expect fun GLES30.glBindBufferRange(
    target: GLenum, index: GLuint, buffer: GLBuffer, offset: GLintptr,
    size: GLsizeiptr
)

expect fun GLES30.glGetUniformIndices(
    program: GLProgram, uniformNames: sequence_DOMString,
    uniformIndices: sequence_GLuint
)

expect fun GLES30.glGetActiveUniformsiv(
    program: GLProgram, uniformIndices: sequence_GLuint, pname: GLenum,
    params: sequence_GLint
)

expect fun GLES30.glGetUniformBlockIndex(
    program: GLProgram, uniformBlockName: DOMString
): GLuint

expect fun GLES30.glGetActiveUniformBlockiv(
    program: GLProgram, uniformBlockIndex: GLuint, pname: GLenum,
    params: sequence_GLint
)

expect fun GLES30.glGetActiveUniformBlockName(
    program: GLProgram, uniformBlockIndex: GLuint
): DOMString?

expect fun GLES30.glUniformBlockBinding(
    program: GLProgram, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint
)

expect fun GLES30.glCreateVertexArray(
): GLVertexArrayObject

expect fun GLES30.glDeleteVertexArray(
    vertexArray: GLVertexArrayObject
)

expect fun GLES30.glIsVertexArray(
    vertexArray: GLVertexArrayObject
): GLboolean

expect fun GLES30.glBindVertexArray(
    array: GLVertexArrayObject
)
