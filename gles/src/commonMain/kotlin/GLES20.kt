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
expect val GL_FUNC_ADD: GLenum
expect val GL_BLEND_EQUATION: GLenum
expect val GL_BLEND_EQUATION_RGB: GLenum
expect val GL_BLEND_EQUATION_ALPHA: GLenum
expect val GL_FUNC_SUBTRACT: GLenum
expect val GL_FUNC_REVERSE_SUBTRACT: GLenum
expect val GL_BLEND_DST_RGB: GLenum
expect val GL_BLEND_SRC_RGB: GLenum
expect val GL_BLEND_DST_ALPHA: GLenum
expect val GL_BLEND_SRC_ALPHA: GLenum
expect val GL_CONSTANT_COLOR: GLenum
expect val GL_ONE_MINUS_CONSTANT_COLOR: GLenum
expect val GL_CONSTANT_ALPHA: GLenum
expect val GL_ONE_MINUS_CONSTANT_ALPHA: GLenum
expect val GL_BLEND_COLOR: GLenum
expect val GL_ARRAY_BUFFER: GLenum
expect val GL_ELEMENT_ARRAY_BUFFER: GLenum
expect val GL_ARRAY_BUFFER_BINDING: GLenum
expect val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
expect val GL_STREAM_DRAW: GLenum
expect val GL_STATIC_DRAW: GLenum
expect val GL_DYNAMIC_DRAW: GLenum
expect val GL_BUFFER_SIZE: GLenum
expect val GL_BUFFER_USAGE: GLenum
expect val GL_CURRENT_VERTEX_ATTRIB: GLenum
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
expect val GL_SAMPLE_ALPHA_TO_COVERAGE: GLenum
expect val GL_SAMPLE_COVERAGE: GLenum
expect val GL_NO_ERROR: GLenum
expect val GL_INVALID_ENUM: GLenum
expect val GL_INVALID_VALUE: GLenum
expect val GL_INVALID_OPERATION: GLenum
expect val GL_OUT_OF_MEMORY: GLenum
expect val GL_CW: GLenum
expect val GL_CCW: GLenum
expect val GL_LINE_WIDTH: GLenum
expect val GL_ALIASED_POINT_SIZE_RANGE: GLenum
expect val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
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
expect val GL_STENCIL_BACK_FUNC: GLenum
expect val GL_STENCIL_BACK_FAIL: GLenum
expect val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
expect val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
expect val GL_STENCIL_BACK_REF: GLenum
expect val GL_STENCIL_BACK_VALUE_MASK: GLenum
expect val GL_STENCIL_BACK_WRITEMASK: GLenum
expect val GL_VIEWPORT: GLenum
expect val GL_SCISSOR_BOX: GLenum
expect val GL_COLOR_CLEAR_VALUE: GLenum
expect val GL_COLOR_WRITEMASK: GLenum
expect val GL_UNPACK_ALIGNMENT: GLenum
expect val GL_PACK_ALIGNMENT: GLenum
expect val GL_MAX_TEXTURE_SIZE: GLenum
expect val GL_MAX_VIEWPORT_DIMS: GLenum
expect val GL_SUBPIXEL_BITS: GLenum
expect val GL_RED_BITS: GLenum
expect val GL_GREEN_BITS: GLenum
expect val GL_BLUE_BITS: GLenum
expect val GL_ALPHA_BITS: GLenum
expect val GL_DEPTH_BITS: GLenum
expect val GL_STENCIL_BITS: GLenum
expect val GL_POLYGON_OFFSET_UNITS: GLenum
expect val GL_POLYGON_OFFSET_FACTOR: GLenum
expect val GL_TEXTURE_BINDING_2D: GLenum
expect val GL_SAMPLE_BUFFERS: GLenum
expect val GL_SAMPLES: GLenum
expect val GL_SAMPLE_COVERAGE_VALUE: GLenum
expect val GL_SAMPLE_COVERAGE_INVERT: GLenum
expect val GL_DONT_CARE: GLenum
expect val GL_FASTEST: GLenum
expect val GL_NICEST: GLenum
expect val GL_GENERATE_MIPMAP_HINT: GLenum
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
expect val GL_LUMINANCE: GLenum
expect val GL_LUMINANCE_ALPHA: GLenum
expect val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
expect val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
expect val GL_UNSIGNED_SHORT_5_6_5: GLenum
expect val GL_FRAGMENT_SHADER: GLenum
expect val GL_VERTEX_SHADER: GLenum
expect val GL_MAX_VERTEX_ATTRIBS: GLenum
expect val GL_MAX_VERTEX_UNIFORM_VECTORS: GLenum
expect val GL_MAX_VARYING_VECTORS: GLenum
expect val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
expect val GL_SHADER_TYPE: GLenum
expect val GL_DELETE_STATUS: GLenum
expect val GL_LINK_STATUS: GLenum
expect val GL_VALIDATE_STATUS: GLenum
expect val GL_ATTACHED_SHADERS: GLenum
expect val GL_ACTIVE_UNIFORMS: GLenum
expect val GL_ACTIVE_ATTRIBUTES: GLenum
expect val GL_SHADING_LANGUAGE_VERSION: GLenum
expect val GL_CURRENT_PROGRAM: GLenum
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
expect val GL_INCR_WRAP: GLenum
expect val GL_DECR_WRAP: GLenum
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
expect val GL_TEXTURE: GLenum
expect val GL_TEXTURE_CUBE_MAP: GLenum
expect val GL_TEXTURE_BINDING_CUBE_MAP: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
expect val GL_MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
expect val GL_TEXTURE0: GLenum
expect val GL_TEXTURE1: GLenum
expect val GL_TEXTURE2: GLenum
expect val GL_TEXTURE3: GLenum
expect val GL_TEXTURE4: GLenum
expect val GL_TEXTURE5: GLenum
expect val GL_TEXTURE6: GLenum
expect val GL_TEXTURE7: GLenum
expect val GL_TEXTURE8: GLenum
expect val GL_TEXTURE9: GLenum
expect val GL_TEXTURE10: GLenum
expect val GL_TEXTURE11: GLenum
expect val GL_TEXTURE12: GLenum
expect val GL_TEXTURE13: GLenum
expect val GL_TEXTURE14: GLenum
expect val GL_TEXTURE15: GLenum
expect val GL_TEXTURE16: GLenum
expect val GL_TEXTURE17: GLenum
expect val GL_TEXTURE18: GLenum
expect val GL_TEXTURE19: GLenum
expect val GL_TEXTURE20: GLenum
expect val GL_TEXTURE21: GLenum
expect val GL_TEXTURE22: GLenum
expect val GL_TEXTURE23: GLenum
expect val GL_TEXTURE24: GLenum
expect val GL_TEXTURE25: GLenum
expect val GL_TEXTURE26: GLenum
expect val GL_TEXTURE27: GLenum
expect val GL_TEXTURE28: GLenum
expect val GL_TEXTURE29: GLenum
expect val GL_TEXTURE30: GLenum
expect val GL_TEXTURE31: GLenum
expect val GL_ACTIVE_TEXTURE: GLenum
expect val GL_REPEAT: GLenum
expect val GL_CLAMP_TO_EDGE: GLenum
expect val GL_MIRRORED_REPEAT: GLenum
expect val GL_FLOAT_VEC2: GLenum
expect val GL_FLOAT_VEC3: GLenum
expect val GL_FLOAT_VEC4: GLenum
expect val GL_INT_VEC2: GLenum
expect val GL_INT_VEC3: GLenum
expect val GL_INT_VEC4: GLenum
expect val GL_BOOL: GLenum
expect val GL_BOOL_VEC2: GLenum
expect val GL_BOOL_VEC3: GLenum
expect val GL_BOOL_VEC4: GLenum
expect val GL_FLOAT_MAT2: GLenum
expect val GL_FLOAT_MAT3: GLenum
expect val GL_FLOAT_MAT4: GLenum
expect val GL_SAMPLER_2D: GLenum
expect val GL_SAMPLER_CUBE: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_SIZE: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_TYPE: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_POINTER: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
expect val GL_IMPLEMENTATION_COLOR_READ_TYPE: GLenum
expect val GL_IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
expect val GL_COMPILE_STATUS: GLenum
expect val GL_LOW_FLOAT: GLenum
expect val GL_MEDIUM_FLOAT: GLenum
expect val GL_HIGH_FLOAT: GLenum
expect val GL_LOW_INT: GLenum
expect val GL_MEDIUM_INT: GLenum
expect val GL_HIGH_INT: GLenum
expect val GL_FRAMEBUFFER: GLenum
expect val GL_RENDERBUFFER: GLenum
expect val GL_RGBA4: GLenum
expect val GL_RGB5_A1: GLenum
expect val GL_RGB565: GLenum
expect val GL_DEPTH_COMPONENT16: GLenum
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
expect val GL_NONE: GLenum
expect val GL_FRAMEBUFFER_COMPLETE: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
expect val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
expect val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
expect val GL_FRAMEBUFFER_BINDING: GLenum
expect val GL_RENDERBUFFER_BINDING: GLenum
expect val GL_MAX_RENDERBUFFER_SIZE: GLenum
expect val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum

expect fun GLES20.glActiveTexture(
    texture: GLenum
)

expect fun GLES20.glAttachShader(
    program: GLProgram, shader: GLShader
)

expect fun GLES20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
)

expect fun GLES20.glBindBuffer(
    target: GLenum, buffer: GLBuffer
)

expect fun GLES20.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
)

expect fun GLES20.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
)

expect fun GLES20.glBindTexture(
    target: GLenum, texture: GLTexture
)

expect fun GLES20.glBlendColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
)

expect fun GLES20.glBlendEquation(
    mode: GLenum
)

expect fun GLES20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
)

expect fun GLES20.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
)

expect fun GLES20.glBlendFuncSeparate(
    srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum
)

expect fun GLES20.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
)

expect fun GLES20.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
)

expect fun GLES20.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
)

expect fun GLES20.glCheckFramebufferStatus(
    target: GLenum
): GLenum

expect fun GLES20.glClear(
    mask: GLbitfield
)

expect fun GLES20.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
)

expect fun GLES20.glClearDepth(
    depth: GLclampf
)

expect fun GLES20.glClearStencil(
    s: GLint
)

expect fun GLES20.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
)

expect fun GLES20.glCompileShader(
    shader: GLShader
)

expect fun GLES20.glCompressedTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, data: DataBuffer
)

expect fun GLES20.glCompressedTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, data: DataBuffer
)

expect fun GLES20.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
)

expect fun GLES20.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GLES20.glCreateBuffer(
): GLBuffer

expect fun GLES20.glCreateFramebuffer(
): GLFramebuffer

expect fun GLES20.glCreateProgram(
): GLProgram

expect fun GLES20.glCreateRenderbuffer(
): GLRenderbuffer

expect fun GLES20.glCreateShader(
    type: GLenum
): GLShader

expect fun GLES20.glCreateTexture(
): GLTexture

expect fun GLES20.glCullFace(
    mode: GLenum
)

expect fun GLES20.glDeleteBuffer(
    buffer: GLBuffer
)

expect fun GLES20.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
)

expect fun GLES20.glDeleteProgram(
    program: GLProgram
)

expect fun GLES20.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
)

expect fun GLES20.glDeleteShader(
    shader: GLShader
)

expect fun GLES20.glDeleteTexture(
    texture: GLTexture
)

expect fun GLES20.glDepthFunc(
    func: GLenum
)

expect fun GLES20.glDepthMask(
    flag: GLboolean
)

expect fun GLES20.glDepthRange(
    zNear: GLclampf, zFar: GLclampf
)

expect fun GLES20.glDetachShader(
    program: GLProgram, shader: GLShader
)

expect fun GLES20.glDisable(
    cap: GLenum
)

expect fun GLES20.glDisableVertexAttribArray(
    index: GLuint
)

expect fun GLES20.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
)

expect fun GLES20.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
)

expect fun GLES20.glEnable(
    cap: GLenum
)

expect fun GLES20.glEnableVertexAttribArray(
    index: GLuint
)

expect fun GLES20.glFinish(
)

expect fun GLES20.glFlush(
)

expect fun GLES20.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
)

expect fun GLES20.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
)

expect fun GLES20.glFrontFace(
    mode: GLenum
)

expect fun GLES20.glGenerateMipmap(
    target: GLenum
)

expect fun GLES20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
)

expect fun GLES20.glGetAttribLocation(
    program: GLProgram, name: DOMString
): GLint

expect fun GLES20.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
)

expect fun GLES20.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
)

expect fun GLES20.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
)

expect fun GLES20.glGetError(
): GLenum

expect fun GLES20.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetProgramb(
    program: GLProgram, pname: GLenum
): GLboolean

expect fun GLES20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetProgramInfoLog(
    program: GLProgram
): DOMString?

expect fun GLES20.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetShaderInfoLog(
    shader: GLShader
): DOMString?

expect fun GLES20.glGetShaderSource(
    shader: GLShader
): DOMString?

expect fun GLES20.glGetString(
    pname: GLenum
): DOMString?

expect fun GLES20.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
)

expect fun GLES20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
)

expect fun GLES20.glGetUniformLocation(
    program: GLProgram, name: DOMString
): GLUniformLocation

expect fun GLES20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
)

expect fun GLES20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
)

expect fun GLES20.glHint(
    target: GLenum, mode: GLenum
)

expect fun GLES20.glIsBuffer(
    buffer: GLBuffer
): GLboolean

expect fun GLES20.glIsEnabled(
    cap: GLenum
): GLboolean

expect fun GLES20.glIsFramebuffer(
    framebuffer: GLFramebuffer
): GLboolean

expect fun GLES20.glIsProgram(
    program: GLProgram
): GLboolean

expect fun GLES20.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
): GLboolean

expect fun GLES20.glIsShader(
    shader: GLShader
): GLboolean

expect fun GLES20.glIsTexture(
    texture: GLTexture
): GLboolean

expect fun GLES20.glLineWidth(
    width: GLfloat
)

expect fun GLES20.glLinkProgram(
    program: GLProgram
)

expect fun GLES20.glPixelStorei(
    pname: GLenum, param: GLint
)

expect fun GLES20.glPolygonOffset(
    factor: GLfloat, units: GLfloat
)

expect fun GLES20.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
)

expect fun GLES20.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
)

expect fun GLES20.glSampleCoverage(
    value: GLclampf, invert: GLboolean
)

expect fun GLES20.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect fun GLES20.glShaderSource(
    shader: GLShader, source: DOMString
)

expect fun GLES20.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
)

expect fun GLES20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
)

expect fun GLES20.glStencilMask(
    mask: GLuint
)

expect fun GLES20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
)

expect fun GLES20.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
)

expect fun GLES20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
)

expect fun GLES20.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
)

expect fun GLES20.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
)

expect fun GLES20.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
)

expect fun GLES20.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
)

expect fun GLES20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
)

expect fun GLES20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GLES20.glUniform1i(
    location: GLUniformLocation, x: GLint
)

expect fun GLES20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GLES20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
)

expect fun GLES20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GLES20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
)

expect fun GLES20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GLES20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
)

expect fun GLES20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GLES20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
)

expect fun GLES20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GLES20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
)

expect fun GLES20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GLES20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
)

expect fun GLES20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GLES20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GLES20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GLES20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GLES20.glUseProgram(
    program: GLProgram
)

expect fun GLES20.glValidateProgram(
    program: GLProgram
)

expect fun GLES20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
)

expect fun GLES20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GLES20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
)

expect fun GLES20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GLES20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
)

expect fun GLES20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GLES20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
)

expect fun GLES20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GLES20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
)

expect fun GLES20.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)
