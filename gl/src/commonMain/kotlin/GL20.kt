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

expect val GL_BLEND_EQUATION_RGB: GLenum
expect val GL_BLEND_EQUATION_ALPHA: GLenum
expect val GL_CURRENT_VERTEX_ATTRIB: GLenum
expect val GL_STENCIL_BACK_FUNC: GLenum
expect val GL_STENCIL_BACK_FAIL: GLenum
expect val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
expect val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
expect val GL_STENCIL_BACK_REF: GLenum
expect val GL_STENCIL_BACK_VALUE_MASK: GLenum
expect val GL_STENCIL_BACK_WRITEMASK: GLenum
expect val GL_FRAGMENT_SHADER: GLenum
expect val GL_VERTEX_SHADER: GLenum
expect val GL_MAX_VERTEX_ATTRIBS: GLenum
expect val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
expect val GL_SHADER_TYPE: GLenum
expect val GL_DELETE_STATUS: GLenum
expect val GL_LINK_STATUS: GLenum
expect val GL_VALIDATE_STATUS: GLenum
expect val GL_ATTACHED_SHADERS: GLenum
expect val GL_ACTIVE_UNIFORMS: GLenum
expect val GL_ACTIVE_ATTRIBUTES: GLenum
expect val GL_SHADING_LANGUAGE_VERSION: GLenum
expect val GL_CURRENT_PROGRAM: GLenum
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
expect val GL_COMPILE_STATUS: GLenum
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

expect fun GL20.glAttachShader(
    program: GLProgram, shader: GLShader
)

expect fun GL20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
)

expect fun GL20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
)

expect fun GL20.glCompileShader(
    shader: GLShader
)

expect fun GL20.glCreateProgram(
): GLProgram

expect fun GL20.glCreateShader(
    type: GLenum
): GLShader

expect fun GL20.glDeleteProgram(
    program: GLProgram
)

expect fun GL20.glDeleteShader(
    shader: GLShader
)

expect fun GL20.glDetachShader(
    program: GLProgram, shader: GLShader
)

expect fun GL20.glDisableVertexAttribArray(
    index: GLuint
)

expect fun GL20.glEnableVertexAttribArray(
    index: GLuint
)

expect fun GL20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
)

expect fun GL20.glGetAttribLocation(
    program: GLProgram, name: DOMString
): GLint

expect fun GL20.glGetProgramb(
    program: GLProgram, pname: GLenum
): GLboolean

expect fun GL20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
)

expect fun GL20.glGetProgramInfoLog(
    program: GLProgram
): DOMString?

expect fun GL20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
)

expect fun GL20.glGetShaderInfoLog(
    shader: GLShader
): DOMString?

expect fun GL20.glGetShaderSource(
    shader: GLShader
): DOMString?

expect fun GL20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
)

expect fun GL20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
)

expect fun GL20.glGetUniformLocation(
    program: GLProgram, name: DOMString
): GLUniformLocation

expect fun GL20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
)

expect fun GL20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
)

expect fun GL20.glIsProgram(
    program: GLProgram
): GLboolean

expect fun GL20.glIsShader(
    shader: GLShader
): GLboolean

expect fun GL20.glLinkProgram(
    program: GLProgram
)

expect fun GL20.glShaderSource(
    shader: GLShader, source: DOMString
)

expect fun GL20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
)

expect fun GL20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
)

expect fun GL20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
)

expect fun GL20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
)

expect fun GL20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GL20.glUniform1i(
    location: GLUniformLocation, x: GLint
)

expect fun GL20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GL20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
)

expect fun GL20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GL20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
)

expect fun GL20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GL20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
)

expect fun GL20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GL20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
)

expect fun GL20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GL20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
)

expect fun GL20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
)

expect fun GL20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
)

expect fun GL20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
)

expect fun GL20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GL20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GL20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
)

expect fun GL20.glUseProgram(
    program: GLProgram
)

expect fun GL20.glValidateProgram(
    program: GLProgram
)

expect fun GL20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
)

expect fun GL20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GL20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
)

expect fun GL20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GL20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
)

expect fun GL20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GL20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
)

expect fun GL20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
)

expect fun GL20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
)

expect fun GL20.glDrawBuffers(
    buffers: sequence_GLenum
)

