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

expect val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
expect val GL_ANY_SAMPLES_PASSED: GLenum
expect val GL_SAMPLER_BINDING: GLenum
expect val GL_RGB10_A2UI: GLenum
expect val GL_INT_2_10_10_10_REV: GLenum

expect fun GL33.glVertexAttribDivisor(
    index: GLuint, divisor: GLuint
)

expect fun GL33.glCreateSampler(
): GLSampler

expect fun GL33.glDeleteSampler(
    sampler: GLSampler
)

expect fun GL33.glIsSampler(
    sampler: GLSampler
): GLboolean

expect fun GL33.glBindSampler(
    unit: GLuint, sampler: GLSampler
)

expect fun GL33.glSamplerParameteri(
    sampler: GLSampler, pname: GLenum, param: GLint
)

expect fun GL33.glSamplerParameterf(
    sampler: GLSampler, pname: GLenum, param: GLfloat
)

expect fun GL33.glGetSamplerParameteriv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLint
)

expect fun GL33.glGetSamplerParameterfv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLfloat
)
