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

expect val GL_R8_SNORM: GLenum
expect val GL_RG8_SNORM: GLenum
expect val GL_RGB8_SNORM: GLenum
expect val GL_RGBA8_SNORM: GLenum
expect val GL_SIGNED_NORMALIZED: GLenum
expect val GL_COPY_READ_BUFFER: GLenum
expect val GL_COPY_WRITE_BUFFER: GLenum
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

expect fun GL31.glCopyBufferSubData(
    readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr,
    writeOffset: GLintptr, size: GLsizeiptr
)

expect fun GL31.glDrawArraysInstanced(
    mode: GLenum, first: GLint, count: GLsizei, instanceCount: GLsizei
)

expect fun GL31.glDrawElementsInstanced(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr,
    instanceCount: GLsizei
)

expect fun GL31.glGetUniformIndices(
    program: GLProgram, uniformNames: sequence_DOMString,
    uniformIndices: sequence_GLuint
)

expect fun GL31.glGetActiveUniformsiv(
    program: GLProgram, uniformIndices: sequence_GLuint, pname: GLenum,
    params: sequence_GLint
)

expect fun GL31.glGetUniformBlockIndex(
    program: GLProgram, uniformBlockName: DOMString
): GLuint

expect fun GL31.glGetActiveUniformBlockiv(
    program: GLProgram, uniformBlockIndex: GLuint, pname: GLenum,
    params: sequence_GLint
)

expect fun GL31.glGetActiveUniformBlockName(
    program: GLProgram, uniformBlockIndex: GLuint
): DOMString?

expect fun GL31.glUniformBlockBinding(
    program: GLProgram, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint
)
