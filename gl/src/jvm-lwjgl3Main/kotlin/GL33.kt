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

import org.lwjgl.opengl.GL33C as JGL33C

actual inline val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
    get() = JGL33C.GL_VERTEX_ATTRIB_ARRAY_DIVISOR
actual inline val GL_ANY_SAMPLES_PASSED: GLenum
    get() = JGL33C.GL_ANY_SAMPLES_PASSED
actual inline val GL_SAMPLER_BINDING: GLenum
    get() = JGL33C.GL_SAMPLER_BINDING
actual inline val GL_RGB10_A2UI: GLenum
    get() = JGL33C.GL_RGB10_A2UI
actual inline val GL_INT_2_10_10_10_REV: GLenum
    get() = JGL33C.GL_INT_2_10_10_10_REV

actual inline fun GL33.glVertexAttribDivisor(
    index: GLuint, divisor: GLuint
) = JGL33C.glVertexAttribDivisor(
    index.toInt(), divisor.toInt()
)

actual inline fun GL33.glCreateSampler(
) = JGL33C.glGenSamplers(
)

actual inline fun GL33.glDeleteSampler(
    sampler: GLSampler
) = JGL33C.glDeleteSamplers(
    sampler
)

actual inline fun GL33.glIsSampler(
    sampler: GLSampler
) = JGL33C.glIsSampler(
    sampler
)

actual inline fun GL33.glBindSampler(
    unit: GLuint, sampler: GLSampler
) = JGL33C.glBindSampler(
    unit.toInt(), sampler
)

actual inline fun GL33.glSamplerParameteri(
    sampler: GLSampler, pname: GLenum, param: GLint
) = JGL33C.glSamplerParameteri(
    sampler, pname, param
)

actual inline fun GL33.glSamplerParameterf(
    sampler: GLSampler, pname: GLenum, param: GLfloat
) = JGL33C.glSamplerParameterf(
    sampler, pname, param
)

actual inline fun GL33.glGetSamplerParameteriv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLint
) = JGL33C.glGetSamplerParameteriv(
    sampler, pname, params
)

actual inline fun GL33.glGetSamplerParameterfv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLfloat
) = JGL33C.glGetSamplerParameterfv(
    sampler, pname, params
)
