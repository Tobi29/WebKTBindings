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

import org.lwjgl.opengl.*
import org.lwjgl.opengl.GL20C as JGL20C

actual inline val GL_BLEND_EQUATION_RGB: GLenum
    get() = JGL20C.GL_BLEND_EQUATION_RGB
actual inline val GL_BLEND_EQUATION_ALPHA: GLenum
    get() = JGL20C.GL_BLEND_EQUATION_ALPHA
actual inline val GL_CURRENT_VERTEX_ATTRIB: GLenum
    get() = JGL20C.GL_CURRENT_VERTEX_ATTRIB
actual inline val GL_STENCIL_BACK_FUNC: GLenum
    get() = JGL20C.GL_STENCIL_BACK_FUNC
actual inline val GL_STENCIL_BACK_FAIL: GLenum
    get() = JGL20C.GL_STENCIL_BACK_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    get() = JGL20C.GL_STENCIL_BACK_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    get() = JGL20C.GL_STENCIL_BACK_PASS_DEPTH_PASS
actual inline val GL_STENCIL_BACK_REF: GLenum
    get() = JGL20C.GL_STENCIL_BACK_REF
actual inline val GL_STENCIL_BACK_VALUE_MASK: GLenum
    get() = JGL20C.GL_STENCIL_BACK_VALUE_MASK
actual inline val GL_STENCIL_BACK_WRITEMASK: GLenum
    get() = JGL20C.GL_STENCIL_BACK_WRITEMASK
actual inline val GL_FRAGMENT_SHADER: GLenum
    get() = JGL20C.GL_FRAGMENT_SHADER
actual inline val GL_VERTEX_SHADER: GLenum
    get() = JGL20C.GL_VERTEX_SHADER
actual inline val GL_MAX_VERTEX_ATTRIBS: GLenum
    get() = JGL20C.GL_MAX_VERTEX_ATTRIBS
actual inline val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGL20C.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGL20C.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGL20C.GL_MAX_TEXTURE_IMAGE_UNITS
actual inline val GL_SHADER_TYPE: GLenum
    get() = JGL20C.GL_SHADER_TYPE
actual inline val GL_DELETE_STATUS: GLenum
    get() = JGL20C.GL_DELETE_STATUS
actual inline val GL_LINK_STATUS: GLenum
    get() = JGL20C.GL_LINK_STATUS
actual inline val GL_VALIDATE_STATUS: GLenum
    get() = JGL20C.GL_VALIDATE_STATUS
actual inline val GL_ATTACHED_SHADERS: GLenum
    get() = JGL20C.GL_ATTACHED_SHADERS
actual inline val GL_ACTIVE_UNIFORMS: GLenum
    get() = JGL20C.GL_ACTIVE_UNIFORMS
actual inline val GL_ACTIVE_ATTRIBUTES: GLenum
    get() = JGL20C.GL_ACTIVE_ATTRIBUTES
actual inline val GL_SHADING_LANGUAGE_VERSION: GLenum
    get() = JGL20C.GL_SHADING_LANGUAGE_VERSION
actual inline val GL_CURRENT_PROGRAM: GLenum
    get() = JGL20C.GL_CURRENT_PROGRAM
actual inline val GL_FLOAT_VEC2: GLenum
    get() = JGL20C.GL_FLOAT_VEC2
actual inline val GL_FLOAT_VEC3: GLenum
    get() = JGL20C.GL_FLOAT_VEC3
actual inline val GL_FLOAT_VEC4: GLenum
    get() = JGL20C.GL_FLOAT_VEC4
actual inline val GL_INT_VEC2: GLenum
    get() = JGL20C.GL_INT_VEC2
actual inline val GL_INT_VEC3: GLenum
    get() = JGL20C.GL_INT_VEC3
actual inline val GL_INT_VEC4: GLenum
    get() = JGL20C.GL_INT_VEC4
actual inline val GL_BOOL: GLenum
    get() = JGL20C.GL_BOOL
actual inline val GL_BOOL_VEC2: GLenum
    get() = JGL20C.GL_BOOL_VEC2
actual inline val GL_BOOL_VEC3: GLenum
    get() = JGL20C.GL_BOOL_VEC3
actual inline val GL_BOOL_VEC4: GLenum
    get() = JGL20C.GL_BOOL_VEC4
actual inline val GL_FLOAT_MAT2: GLenum
    get() = JGL20C.GL_FLOAT_MAT2
actual inline val GL_FLOAT_MAT3: GLenum
    get() = JGL20C.GL_FLOAT_MAT3
actual inline val GL_FLOAT_MAT4: GLenum
    get() = JGL20C.GL_FLOAT_MAT4
actual inline val GL_SAMPLER_2D: GLenum
    get() = JGL20C.GL_SAMPLER_2D
actual inline val GL_SAMPLER_CUBE: GLenum
    get() = JGL20C.GL_SAMPLER_CUBE
actual inline val GL_VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_ENABLED
actual inline val GL_VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_SIZE
actual inline val GL_VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_STRIDE
actual inline val GL_VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_TYPE
actual inline val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED
actual inline val GL_VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    get() = JGL20C.GL_VERTEX_ATTRIB_ARRAY_POINTER
actual inline val GL_COMPILE_STATUS: GLenum
    get() = JGL20C.GL_COMPILE_STATUS
actual inline val GL_MAX_DRAW_BUFFERS: GLenum
    get() = JGL20C.GL_MAX_DRAW_BUFFERS
actual inline val GL_DRAW_BUFFER0: GLenum
    get() = JGL20C.GL_DRAW_BUFFER0
actual inline val GL_DRAW_BUFFER1: GLenum
    get() = JGL20C.GL_DRAW_BUFFER1
actual inline val GL_DRAW_BUFFER2: GLenum
    get() = JGL20C.GL_DRAW_BUFFER2
actual inline val GL_DRAW_BUFFER3: GLenum
    get() = JGL20C.GL_DRAW_BUFFER3
actual inline val GL_DRAW_BUFFER4: GLenum
    get() = JGL20C.GL_DRAW_BUFFER4
actual inline val GL_DRAW_BUFFER5: GLenum
    get() = JGL20C.GL_DRAW_BUFFER5
actual inline val GL_DRAW_BUFFER6: GLenum
    get() = JGL20C.GL_DRAW_BUFFER6
actual inline val GL_DRAW_BUFFER7: GLenum
    get() = JGL20C.GL_DRAW_BUFFER7
actual inline val GL_DRAW_BUFFER8: GLenum
    get() = JGL20C.GL_DRAW_BUFFER8
actual inline val GL_DRAW_BUFFER9: GLenum
    get() = JGL20C.GL_DRAW_BUFFER9
actual inline val GL_DRAW_BUFFER10: GLenum
    get() = JGL20C.GL_DRAW_BUFFER10
actual inline val GL_DRAW_BUFFER11: GLenum
    get() = JGL20C.GL_DRAW_BUFFER11
actual inline val GL_DRAW_BUFFER12: GLenum
    get() = JGL20C.GL_DRAW_BUFFER12
actual inline val GL_DRAW_BUFFER13: GLenum
    get() = JGL20C.GL_DRAW_BUFFER13
actual inline val GL_DRAW_BUFFER14: GLenum
    get() = JGL20C.GL_DRAW_BUFFER14
actual inline val GL_DRAW_BUFFER15: GLenum
    get() = JGL20C.GL_DRAW_BUFFER15
actual inline val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = JGL20C.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = JGL20C.GL_MAX_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_SAMPLER_3D: GLenum
    get() = JGL20C.GL_SAMPLER_3D
actual inline val GL_SAMPLER_2D_SHADOW: GLenum
    get() = JGL20C.GL_SAMPLER_2D_SHADOW
actual inline val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
    get() = JGL20C.GL_FRAGMENT_SHADER_DERIVATIVE_HINT

actual inline fun GL20.glAttachShader(
    program: GLProgram, shader: GLShader
) = JGL20C.glAttachShader(
    program, shader
)

actual inline fun GL20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
) = JGL20C.glBindAttribLocation(
    program, index.toInt(), name
)

actual inline fun GL20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
) = JGL20C.glBlendEquationSeparate(
    modeRGB, modeAlpha
)

actual inline fun GL20.glCompileShader(
    shader: GLShader
) = JGL20C.glCompileShader(
    shader
)

actual inline fun GL20.glCreateProgram(
) = JGL20C.glCreateProgram(
)

actual inline fun GL20.glCreateShader(
    type: GLenum
) = JGL20C.glCreateShader(
    type
)

actual inline fun GL20.glDeleteProgram(
    program: GLProgram
) = JGL20C.glDeleteProgram(
    program
)

actual inline fun GL20.glDeleteShader(
    shader: GLShader
) = JGL20C.glDeleteShader(
    shader
)

actual inline fun GL20.glDetachShader(
    program: GLProgram, shader: GLShader
) = JGL20C.glDetachShader(
    program, shader
)

actual inline fun GL20.glDisableVertexAttribArray(
    index: GLuint
) = JGL20C.glDisableVertexAttribArray(
    index.toInt()
)

actual inline fun GL20.glEnableVertexAttribArray(
    index: GLuint
) = JGL20C.glEnableVertexAttribArray(
    index.toInt()
)

actual inline fun GL20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
) {
    val array = IntArray(shaders.size)
    JGL20C.glGetAttachedShaders(
        program, count, array
    )
    for (i in shaders.indices) {
        shaders[i] = array[i]
    }
}

actual inline fun GL20.glGetAttribLocation(
    program: GLProgram, name: DOMString
) = JGL20C.glGetAttribLocation(
    program, name
)

actual inline fun GL20.glGetProgramb(
    program: GLProgram, pname: GLenum
) = JGL20C.glGetProgrami(
    program, pname
) != JGL20C.GL_FALSE

actual inline fun GL20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
) = JGL20C.glGetProgramiv(
    program, pname, params
)

actual inline fun GL20.glGetProgramInfoLog(
    program: GLProgram
) = JGL20C.glGetProgramInfoLog(
    program
)

actual inline fun GL20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
) = JGL20C.glGetShaderiv(
    shader, pname, params
)

actual inline fun GL20.glGetShaderInfoLog(
    shader: GLShader
) = JGL20C.glGetShaderInfoLog(
    shader
)

actual inline fun GL20.glGetShaderSource(
    shader: GLShader
) = JGL20C.glGetShaderSource(
    shader
)

actual inline fun GL20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
) = JGL20C.glGetUniformfv(
    program, location, params
)

actual inline fun GL20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
) = JGL20C.glGetUniformiv(
    program, location, params
)

actual inline fun GL20.glGetUniformLocation(
    program: GLProgram, name: DOMString
) = JGL20C.glGetUniformLocation(
    program, name
)

actual inline fun GL20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
) = JGL20C.glGetVertexAttribfv(
    index.toInt(), pname, params
)

actual inline fun GL20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
) = JGL20C.glGetVertexAttribiv(
    index.toInt(), pname, params
)

actual inline fun GL20.glIsProgram(
    program: GLProgram
) = JGL20C.glIsProgram(
    program
)

actual inline fun GL20.glIsShader(
    shader: GLShader
) = JGL20C.glIsShader(
    shader
)

actual inline fun GL20.glLinkProgram(
    program: GLProgram
) = JGL20C.glLinkProgram(
    program
)

actual inline fun GL20.glShaderSource(
    shader: GLShader, source: DOMString
) = JGL20C.glShaderSource(
    shader, source
)

actual inline fun GL20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
) = JGL20C.glStencilFuncSeparate(
    face, func, ref, mask.toInt()
)

actual inline fun GL20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
) = JGL20C.glStencilMaskSeparate(
    face, mask.toInt()
)

actual inline fun GL20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
) = JGL20C.glStencilOpSeparate(
    face, fail, zfail, zpass
)

actual inline fun GL20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
) = JGL20C.glUniform1f(
    location, x
)

actual inline fun GL20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGL20C.glUniform1fv(
    location, v
)

actual inline fun GL20.glUniform1i(
    location: GLUniformLocation, x: GLint
) = JGL20C.glUniform1i(
    location, x
)

actual inline fun GL20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
) = JGL20C.glUniform1iv(
    location, v
)

actual inline fun GL20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
) = JGL20C.glUniform2f(
    location, x, y
)

actual inline fun GL20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGL20C.glUniform2fv(
    location, v
)

actual inline fun GL20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
) = JGL20C.glUniform2i(
    location, x, y
)

actual inline fun GL20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
) = JGL20C.glUniform2iv(
    location, v
)

actual inline fun GL20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
) = JGL20C.glUniform3f(
    location, x, y, z
)

actual inline fun GL20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGL20C.glUniform3fv(
    location, v
)

actual inline fun GL20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
) = JGL20C.glUniform3i(
    location, x, y, z
)

actual inline fun GL20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
) = JGL20C.glUniform3iv(
    location, v
)

actual inline fun GL20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = JGL20C.glUniform4f(
    location, x, y, z, w
)

actual inline fun GL20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGL20C.glUniform4fv(
    location, v
)

actual inline fun GL20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
) = JGL20C.glUniform4i(
    location, x, y, z, w
)

actual inline fun GL20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
) = JGL20C.glUniform4iv(
    location, v
)

actual inline fun GL20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGL20C.glUniformMatrix2fv(
    location, transpose, value
)

actual inline fun GL20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGL20C.glUniformMatrix3fv(
    location, transpose, value
)

actual inline fun GL20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGL20C.glUniformMatrix4fv(
    location, transpose, value
)

actual inline fun GL20.glUseProgram(
    program: GLProgram
) = JGL20C.glUseProgram(
    program
)

actual inline fun GL20.glValidateProgram(
    program: GLProgram
) = JGL20C.glValidateProgram(
    program
)

actual inline fun GL20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
) = JGL20C.glVertexAttrib1f(
    indx.toInt(), x
)

actual inline fun GL20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
) = JGL20C.glVertexAttrib1fv(
    indx.toInt(), values
)

actual inline fun GL20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
) = JGL20C.glVertexAttrib2f(
    indx.toInt(), x, y
)

actual inline fun GL20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
) = JGL20C.glVertexAttrib2fv(
    indx.toInt(), values
)

actual inline fun GL20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
) = JGL20C.glVertexAttrib3f(
    indx.toInt(), x, y, z
)

actual inline fun GL20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
) = JGL20C.glVertexAttrib3fv(
    indx.toInt(), values
)

actual inline fun GL20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = JGL20C.glVertexAttrib4f(
    indx.toInt(), x, y, z, w
)

actual inline fun GL20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
) = JGL20C.glVertexAttrib4fv(
    indx.toInt(), values
)

actual inline fun GL20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
) = JGL20C.glVertexAttribPointer(
    indx.toInt(), size, type, normalized, stride, offset.toLong()
)

actual inline fun GL20.glDrawBuffers(
    buffers: sequence_GLenum
) = JGL20C.glDrawBuffers(
    buffers
)

