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

import org.lwjgl.system.MemoryStack
import org.lwjgl.opengl.GL31C as JGL31C

actual inline val GL_R8_SNORM: GLenum
    get() = JGL31C.GL_R8_SNORM
actual inline val GL_RG8_SNORM: GLenum
    get() = JGL31C.GL_RG8_SNORM
actual inline val GL_RGB8_SNORM: GLenum
    get() = JGL31C.GL_RGB8_SNORM
actual inline val GL_RGBA8_SNORM: GLenum
    get() = JGL31C.GL_RGBA8_SNORM
actual inline val GL_SIGNED_NORMALIZED: GLenum
    get() = JGL31C.GL_SIGNED_NORMALIZED
actual inline val GL_COPY_READ_BUFFER: GLenum
    get() = JGL31C.GL_COPY_READ_BUFFER
actual inline val GL_COPY_WRITE_BUFFER: GLenum
    get() = JGL31C.GL_COPY_WRITE_BUFFER
actual inline val GL_UNIFORM_BUFFER: GLenum
    get() = JGL31C.GL_UNIFORM_BUFFER
actual inline val GL_UNIFORM_BUFFER_BINDING: GLenum
    get() = JGL31C.GL_UNIFORM_BUFFER_BINDING
actual inline val GL_UNIFORM_BUFFER_START: GLenum
    get() = JGL31C.GL_UNIFORM_BUFFER_START
actual inline val GL_UNIFORM_BUFFER_SIZE: GLenum
    get() = JGL31C.GL_UNIFORM_BUFFER_SIZE
actual inline val GL_MAX_VERTEX_UNIFORM_BLOCKS: GLenum
    get() = JGL31C.GL_MAX_VERTEX_UNIFORM_BLOCKS
actual inline val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
    get() = JGL31C.GL_MAX_FRAGMENT_UNIFORM_BLOCKS
actual inline val GL_MAX_COMBINED_UNIFORM_BLOCKS: GLenum
    get() = JGL31C.GL_MAX_COMBINED_UNIFORM_BLOCKS
actual inline val GL_MAX_UNIFORM_BUFFER_BINDINGS: GLenum
    get() = JGL31C.GL_MAX_UNIFORM_BUFFER_BINDINGS
actual inline val GL_MAX_UNIFORM_BLOCK_SIZE: GLenum
    get() = JGL31C.GL_MAX_UNIFORM_BLOCK_SIZE
actual inline val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = JGL31C.GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = JGL31C.GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
    get() = JGL31C.GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT
actual inline val GL_ACTIVE_UNIFORM_BLOCKS: GLenum
    get() = JGL31C.GL_ACTIVE_UNIFORM_BLOCKS
actual inline val GL_UNIFORM_TYPE: GLenum
    get() = JGL31C.GL_UNIFORM_TYPE
actual inline val GL_UNIFORM_SIZE: GLenum
    get() = JGL31C.GL_UNIFORM_SIZE
actual inline val GL_UNIFORM_BLOCK_INDEX: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_INDEX
actual inline val GL_UNIFORM_OFFSET: GLenum
    get() = JGL31C.GL_UNIFORM_OFFSET
actual inline val GL_UNIFORM_ARRAY_STRIDE: GLenum
    get() = JGL31C.GL_UNIFORM_ARRAY_STRIDE
actual inline val GL_UNIFORM_MATRIX_STRIDE: GLenum
    get() = JGL31C.GL_UNIFORM_MATRIX_STRIDE
actual inline val GL_UNIFORM_IS_ROW_MAJOR: GLenum
    get() = JGL31C.GL_UNIFORM_IS_ROW_MAJOR
actual inline val GL_UNIFORM_BLOCK_BINDING: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_BINDING
actual inline val GL_UNIFORM_BLOCK_DATA_SIZE: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_DATA_SIZE
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
    get() = JGL31C.GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER
actual inline val GL_INVALID_INDEX: GLenum
    get() = JGL31C.GL_INVALID_INDEX

actual inline fun GL31.glCopyBufferSubData(
    readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr,
    writeOffset: GLintptr, size: GLsizeiptr
) = JGL31C.glCopyBufferSubData(
    readTarget, writeTarget, readOffset.toLong(),
    writeOffset.toLong(), size.toLong()
)

actual inline fun GL31.glDrawArraysInstanced(
    mode: GLenum, first: GLint, count: GLsizei, instanceCount: GLsizei
) = JGL31C.glDrawArraysInstanced(
    mode, first, count, instanceCount
)

actual inline fun GL31.glDrawElementsInstanced(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr,
    instanceCount: GLsizei
) = JGL31C.glDrawElementsInstanced(
    mode, count, type, offset.toLong(), instanceCount
)

actual inline fun GL31.glGetUniformIndices(
    program: GLProgram, uniformNames: sequence_DOMString,
    uniformIndices: sequence_GLuint
) {
    val stack = MemoryStack.stackPush()
    try {
        val pointers = stack.mallocPointer(uniformNames.size)
        for (s in uniformNames) {
            pointers.put(stack.UTF8(s))
        }
        JGL31C.glGetUniformIndices(
            program, pointers, uniformIndices.asIntArray()
        )
    } finally {
        stack.pop()
    }
}

actual inline fun GL31.glGetActiveUniformsiv(
    program: GLProgram, uniformIndices: sequence_GLuint, pname: GLenum,
    params: sequence_GLint
) = JGL31C.glGetActiveUniformsiv(
    program, uniformIndices.asIntArray(), pname, params
)

actual inline fun GL31.glGetUniformBlockIndex(
    program: GLProgram, uniformBlockName: DOMString
) = JGL31C.glGetUniformBlockIndex(
    program, uniformBlockName
).toUInt()

actual inline fun GL31.glGetActiveUniformBlockiv(
    program: GLProgram, uniformBlockIndex: GLuint, pname: GLenum,
    params: sequence_GLint
) = JGL31C.glGetActiveUniformBlockiv(
    program, uniformBlockIndex.toInt(), pname, params
)

actual inline fun GL31.glGetActiveUniformBlockName(
    program: GLProgram, uniformBlockIndex: GLuint
) = JGL31C.glGetActiveUniformBlockName(
    program, uniformBlockIndex.toInt()
)

actual inline fun GL31.glUniformBlockBinding(
    program: GLProgram, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint
) = JGL31C.glUniformBlockBinding(
    program, uniformBlockIndex.toInt(), uniformBlockBinding.toInt()
)
