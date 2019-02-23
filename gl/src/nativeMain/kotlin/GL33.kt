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
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_DIVISOR
actual inline val GL_ANY_SAMPLES_PASSED: GLenum
    get() = platform.OpenGL3.GL_ANY_SAMPLES_PASSED
actual inline val GL_SAMPLER_BINDING: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_BINDING
actual inline val GL_RGB10_A2UI: GLenum
    get() = platform.OpenGL3.GL_RGB10_A2UI
actual inline val GL_INT_2_10_10_10_REV: GLenum
    get() = platform.OpenGL3.GL_INT_2_10_10_10_REV

actual inline fun GL33.glVertexAttribDivisor(
    index: GLuint, divisor: GLuint
) = platform.OpenGL3.glVertexAttribDivisor(
    index, divisor
)

actual inline fun GL33.glCreateSampler(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenSamplers(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL33.glDeleteSampler(
    sampler: GLSampler
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = sampler.toUInt()
    platform.OpenGL3.glDeleteSamplers(
        1, buffer.ptr
    )
}

actual inline fun GL33.glIsSampler(
    sampler: GLSampler
) = platform.OpenGL3.glIsSampler(
    sampler.toUInt()
) != 0u.toUByte()

actual inline fun GL33.glBindSampler(
    unit: GLuint, sampler: GLSampler
) = platform.OpenGL3.glBindSampler(
    unit, sampler.toUInt()
)

actual inline fun GL33.glSamplerParameteri(
    sampler: GLSampler, pname: GLenum, param: GLint
) = platform.OpenGL3.glSamplerParameteri(
    sampler.toUInt(), pname.toUInt(), param
)

actual inline fun GL33.glSamplerParameterf(
    sampler: GLSampler, pname: GLenum, param: GLfloat
) = platform.OpenGL3.glSamplerParameterf(
    sampler.toUInt(), pname.toUInt(), param
)

actual inline fun GL33.glGetSamplerParameteriv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetSamplerParameteriv(
        sampler.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL33.glGetSamplerParameterfv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLfloat
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetSamplerParameterfv(
        sampler.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}
