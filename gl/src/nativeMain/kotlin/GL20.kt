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
import net.gitout.ktbindings.utils.receiveString
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_BLEND_EQUATION_RGB: GLenum
    get() = platform.OpenGL3.GL_BLEND_EQUATION_RGB
actual inline val GL_BLEND_EQUATION_ALPHA: GLenum
    get() = platform.OpenGL3.GL_BLEND_EQUATION_ALPHA
actual inline val GL_CURRENT_VERTEX_ATTRIB: GLenum
    get() = platform.OpenGL3.GL_CURRENT_VERTEX_ATTRIB
actual inline val GL_STENCIL_BACK_FUNC: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_FUNC
actual inline val GL_STENCIL_BACK_FAIL: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_PASS_DEPTH_PASS
actual inline val GL_STENCIL_BACK_REF: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_REF
actual inline val GL_STENCIL_BACK_VALUE_MASK: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_VALUE_MASK
actual inline val GL_STENCIL_BACK_WRITEMASK: GLenum
    get() = platform.OpenGL3.GL_STENCIL_BACK_WRITEMASK
actual inline val GL_FRAGMENT_SHADER: GLenum
    get() = platform.OpenGL3.GL_FRAGMENT_SHADER
actual inline val GL_VERTEX_SHADER: GLenum
    get() = platform.OpenGL3.GL_VERTEX_SHADER
actual inline val GL_MAX_VERTEX_ATTRIBS: GLenum
    get() = platform.OpenGL3.GL_MAX_VERTEX_ATTRIBS
actual inline val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    get() = platform.OpenGL3.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    get() = platform.OpenGL3.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
    get() = platform.OpenGL3.GL_MAX_TEXTURE_IMAGE_UNITS
actual inline val GL_SHADER_TYPE: GLenum
    get() = platform.OpenGL3.GL_SHADER_TYPE
actual inline val GL_DELETE_STATUS: GLenum
    get() = platform.OpenGL3.GL_DELETE_STATUS
actual inline val GL_LINK_STATUS: GLenum
    get() = platform.OpenGL3.GL_LINK_STATUS
actual inline val GL_VALIDATE_STATUS: GLenum
    get() = platform.OpenGL3.GL_VALIDATE_STATUS
actual inline val GL_ATTACHED_SHADERS: GLenum
    get() = platform.OpenGL3.GL_ATTACHED_SHADERS
actual inline val GL_ACTIVE_UNIFORMS: GLenum
    get() = platform.OpenGL3.GL_ACTIVE_UNIFORMS
actual inline val GL_ACTIVE_ATTRIBUTES: GLenum
    get() = platform.OpenGL3.GL_ACTIVE_ATTRIBUTES
actual inline val GL_SHADING_LANGUAGE_VERSION: GLenum
    get() = platform.OpenGL3.GL_SHADING_LANGUAGE_VERSION
actual inline val GL_CURRENT_PROGRAM: GLenum
    get() = platform.OpenGL3.GL_CURRENT_PROGRAM
actual inline val GL_FLOAT_VEC2: GLenum
    get() = platform.OpenGL3.GL_FLOAT_VEC2
actual inline val GL_FLOAT_VEC3: GLenum
    get() = platform.OpenGL3.GL_FLOAT_VEC3
actual inline val GL_FLOAT_VEC4: GLenum
    get() = platform.OpenGL3.GL_FLOAT_VEC4
actual inline val GL_INT_VEC2: GLenum
    get() = platform.OpenGL3.GL_INT_VEC2
actual inline val GL_INT_VEC3: GLenum
    get() = platform.OpenGL3.GL_INT_VEC3
actual inline val GL_INT_VEC4: GLenum
    get() = platform.OpenGL3.GL_INT_VEC4
actual inline val GL_BOOL: GLenum
    get() = platform.OpenGL3.GL_BOOL
actual inline val GL_BOOL_VEC2: GLenum
    get() = platform.OpenGL3.GL_BOOL_VEC2
actual inline val GL_BOOL_VEC3: GLenum
    get() = platform.OpenGL3.GL_BOOL_VEC3
actual inline val GL_BOOL_VEC4: GLenum
    get() = platform.OpenGL3.GL_BOOL_VEC4
actual inline val GL_FLOAT_MAT2: GLenum
    get() = platform.OpenGL3.GL_FLOAT_MAT2
actual inline val GL_FLOAT_MAT3: GLenum
    get() = platform.OpenGL3.GL_FLOAT_MAT3
actual inline val GL_FLOAT_MAT4: GLenum
    get() = platform.OpenGL3.GL_FLOAT_MAT4
actual inline val GL_SAMPLER_2D: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_2D
actual inline val GL_SAMPLER_CUBE: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_CUBE
actual inline val GL_VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_ENABLED
actual inline val GL_VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_SIZE
actual inline val GL_VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_STRIDE
actual inline val GL_VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_TYPE
actual inline val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED
actual inline val GL_VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_POINTER
actual inline val GL_COMPILE_STATUS: GLenum
    get() = platform.OpenGL3.GL_COMPILE_STATUS
actual inline val GL_MAX_DRAW_BUFFERS: GLenum
    get() = platform.OpenGL3.GL_MAX_DRAW_BUFFERS
actual inline val GL_DRAW_BUFFER0: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER0
actual inline val GL_DRAW_BUFFER1: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER1
actual inline val GL_DRAW_BUFFER2: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER2
actual inline val GL_DRAW_BUFFER3: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER3
actual inline val GL_DRAW_BUFFER4: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER4
actual inline val GL_DRAW_BUFFER5: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER5
actual inline val GL_DRAW_BUFFER6: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER6
actual inline val GL_DRAW_BUFFER7: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER7
actual inline val GL_DRAW_BUFFER8: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER8
actual inline val GL_DRAW_BUFFER9: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER9
actual inline val GL_DRAW_BUFFER10: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER10
actual inline val GL_DRAW_BUFFER11: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER11
actual inline val GL_DRAW_BUFFER12: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER12
actual inline val GL_DRAW_BUFFER13: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER13
actual inline val GL_DRAW_BUFFER14: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER14
actual inline val GL_DRAW_BUFFER15: GLenum
    get() = platform.OpenGL3.GL_DRAW_BUFFER15
actual inline val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_SAMPLER_3D: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_3D
actual inline val GL_SAMPLER_2D_SHADOW: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_2D_SHADOW
actual inline val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
    get() = platform.OpenGL3.GL_FRAGMENT_SHADER_DERIVATIVE_HINT

actual inline fun GL20.glAttachShader(
    program: GLProgram, shader: GLShader
) = platform.OpenGL3.glAttachShader(
    program.toUInt(), shader.toUInt()
)

actual inline fun GL20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
) = platform.OpenGL3.glBindAttribLocation(
    program.toUInt(), index, name
)

actual inline fun GL20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
) = platform.OpenGL3.glBlendEquationSeparate(
    modeRGB.toUInt(), modeAlpha.toUInt()
)

actual inline fun GL20.glCompileShader(
    shader: GLShader
) = platform.OpenGL3.glCompileShader(
    shader.toUInt()
)

actual inline fun GL20.glCreateProgram(
) = platform.OpenGL3.glCreateProgram(
).toInt()

actual inline fun GL20.glCreateShader(
    type: GLenum
) = platform.OpenGL3.glCreateShader(
    type.toUInt()
).toInt()

actual inline fun GL20.glDeleteProgram(
    program: GLProgram
) = platform.OpenGL3.glDeleteProgram(
    program.toUInt()
)

actual inline fun GL20.glDeleteShader(
    shader: GLShader
) = platform.OpenGL3.glDeleteShader(
    shader.toUInt()
)

actual inline fun GL20.glDetachShader(
    program: GLProgram, shader: GLShader
) = platform.OpenGL3.glDetachShader(
    program.toUInt(), shader.toUInt()
)

actual inline fun GL20.glDisableVertexAttribArray(
    index: GLuint
) = platform.OpenGL3.glDisableVertexAttribArray(
    index
)

actual inline fun GL20.glEnableVertexAttribArray(
    index: GLuint
) = platform.OpenGL3.glEnableVertexAttribArray(
    index
)

actual inline fun GL20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
) {
    val array = UIntArray(shaders.size)
    array.usePinned { buffer ->
        count.usePinned { bufferCount ->
            platform.OpenGL3.glGetAttachedShaders(
                program.toUInt(), array.size, bufferCount.toCPointer(),
                buffer.toCPointer()
            )
        }
    }
    for (i in shaders.indices) {
        shaders[i] = array[i].toInt()
    }
}

actual inline fun GL20.glGetAttribLocation(
    program: GLProgram, name: DOMString
) = platform.OpenGL3.glGetAttribLocation(
    program.toUInt(), name
)

actual inline fun GL20.glGetProgramb(
    program: GLProgram, pname: GLenum
) = memScoped {
    val buffer = alloc<IntVar>()
    platform.OpenGL3.glGetProgramiv(
        program.toUInt(), pname.toUInt(), buffer.ptr
    )
    buffer.value != platform.OpenGL3.GL_FALSE
}

actual inline fun GL20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetProgramiv(
        program.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL20.glGetProgramInfoLog(
    program: GLProgram
) = receiveString { buffer, length, bufferSize ->
    platform.OpenGL3.glGetProgramInfoLog(
        program.toUInt(), bufferSize, length, buffer
    )
}

actual inline fun GL20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetShaderiv(
        shader.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL20.glGetShaderInfoLog(
    shader: GLShader
) = receiveString { buffer, length, bufferSize ->
    platform.OpenGL3.glGetShaderInfoLog(
        shader.toUInt(), bufferSize, length, buffer
    )
}

actual inline fun GL20.glGetShaderSource(
    shader: GLShader
) = receiveString { buffer, length, bufferSize ->
    platform.OpenGL3.glGetShaderSource(
        shader.toUInt(), bufferSize, length, buffer
    )
}

actual inline fun GL20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetUniformfv(
        program.toUInt(), location, buffer.toCPointer()
    )
}

actual inline fun GL20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetUniformiv(
        program.toUInt(), location, buffer.toCPointer()
    )
}

actual inline fun GL20.glGetUniformLocation(
    program: GLProgram, name: DOMString
) = platform.OpenGL3.glGetUniformLocation(
    program.toUInt(), name
)

actual inline fun GL20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetVertexAttribfv(
        index, pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetVertexAttribiv(
        index, pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL20.glIsProgram(
    program: GLProgram
) = platform.OpenGL3.glIsProgram(
    program.toUInt()
) != 0u.toUByte()

actual inline fun GL20.glIsShader(
    shader: GLShader
) = platform.OpenGL3.glIsShader(
    shader.toUInt()
) != 0u.toUByte()

actual inline fun GL20.glLinkProgram(
    program: GLProgram
) = platform.OpenGL3.glLinkProgram(
    program.toUInt()
)

actual inline fun GL20.glShaderSource(
    shader: GLShader, source: DOMString
) = memScoped {
    source.toUtf8().usePinned { buffer ->
        val pointers = alloc<CPointerVar<ByteVar>>()
        val length = alloc<IntVar>()
        pointers.value = buffer.toCPointer()
        length.value = buffer.get().size
        platform.OpenGL3.glShaderSource(
            shader.toUInt(), 1, pointers.ptr, length.ptr
        )
    }
}

actual inline fun GL20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
) = platform.OpenGL3.glStencilFuncSeparate(
    face.toUInt(), func.toUInt(), ref, mask
)

actual inline fun GL20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
) = platform.OpenGL3.glStencilMaskSeparate(
    face.toUInt(), mask
)

actual inline fun GL20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
) = platform.OpenGL3.glStencilOpSeparate(
    face.toUInt(), fail.toUInt(), zfail.toUInt(), zpass.toUInt()
)

actual inline fun GL20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
) = platform.OpenGL3.glUniform1f(
    location, x
)

actual inline fun GL20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform1fv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform1i(
    location: GLUniformLocation, x: GLint
) = platform.OpenGL3.glUniform1i(
    location, x
)

actual inline fun GL20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform1iv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
) = platform.OpenGL3.glUniform2f(
    location, x, y
)

actual inline fun GL20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform2fv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
) = platform.OpenGL3.glUniform2i(
    location, x, y
)

actual inline fun GL20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform2iv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
) = platform.OpenGL3.glUniform3f(
    location, x, y, z
)

actual inline fun GL20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform3fv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
) = platform.OpenGL3.glUniform3i(
    location, x, y, z
)

actual inline fun GL20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform3iv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = platform.OpenGL3.glUniform4f(
    location, x, y, z, w
)

actual inline fun GL20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform4fv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
) = platform.OpenGL3.glUniform4i(
    location, x, y, z, w
)

actual inline fun GL20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
) = v.usePinned { buffer ->
    platform.OpenGL3.glUniform4iv(
        location, v.size, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = value.usePinned { buffer ->
    platform.OpenGL3.glUniformMatrix2fv(
        location, value.size / 4, if (transpose) 1u else 0u, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = value.usePinned { buffer ->
    platform.OpenGL3.glUniformMatrix3fv(
        location, value.size / 9, if (transpose) 1u else 0u, buffer.toCPointer()
    )
}

actual inline fun GL20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = value.usePinned { buffer ->
    platform.OpenGL3.glUniformMatrix4fv(
        location, value.size / 16, if (transpose) 1u else 0u,
        buffer.toCPointer()
    )
}

actual inline fun GL20.glUseProgram(
    program: GLProgram
) = platform.OpenGL3.glUseProgram(
    program.toUInt()
)

actual inline fun GL20.glValidateProgram(
    program: GLProgram
) = platform.OpenGL3.glValidateProgram(
    program.toUInt()
)

actual inline fun GL20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
) = platform.OpenGL3.glVertexAttrib1f(
    indx, x
)

actual inline fun GL20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttrib1fv(
        indx, buffer.toCPointer()
    )
}

actual inline fun GL20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
) = platform.OpenGL3.glVertexAttrib2f(
    indx, x, y
)

actual inline fun GL20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttrib2fv(
        indx, buffer.toCPointer()
    )
}

actual inline fun GL20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
) = platform.OpenGL3.glVertexAttrib3f(
    indx, x, y, z
)

actual inline fun GL20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttrib3fv(
        indx, buffer.toCPointer()
    )
}

actual inline fun GL20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = platform.OpenGL3.glVertexAttrib4f(
    indx, x, y, z, w
)

actual inline fun GL20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttrib4fv(
        indx, buffer.toCPointer()
    )
}

actual inline fun GL20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
) = platform.OpenGL3.glVertexAttribPointer(
    indx, size, type.toUInt(), if (normalized) 1u else 0u, stride,
    offset.toLong().toCPointer<ByteVar>()
)

actual inline fun GL20.glDrawBuffers(
    buffers: sequence_GLenum
) = buffers.asUIntArray().usePinned { buffer ->
    platform.OpenGL3.glDrawBuffers(
        buffers.size, buffer.toCPointer()
    )
}

