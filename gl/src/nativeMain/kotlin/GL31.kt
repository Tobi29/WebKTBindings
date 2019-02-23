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

actual inline val GL_R8_SNORM: GLenum
    get() = platform.OpenGL3.GL_R8_SNORM
actual inline val GL_RG8_SNORM: GLenum
    get() = platform.OpenGL3.GL_RG8_SNORM
actual inline val GL_RGB8_SNORM: GLenum
    get() = platform.OpenGL3.GL_RGB8_SNORM
actual inline val GL_RGBA8_SNORM: GLenum
    get() = platform.OpenGL3.GL_RGBA8_SNORM
actual inline val GL_SIGNED_NORMALIZED: GLenum
    get() = platform.OpenGL3.GL_SIGNED_NORMALIZED
actual inline val GL_COPY_READ_BUFFER: GLenum
    get() = platform.OpenGL3.GL_COPY_READ_BUFFER
actual inline val GL_COPY_WRITE_BUFFER: GLenum
    get() = platform.OpenGL3.GL_COPY_WRITE_BUFFER
actual inline val GL_UNIFORM_BUFFER: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BUFFER
actual inline val GL_UNIFORM_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BUFFER_BINDING
actual inline val GL_UNIFORM_BUFFER_START: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BUFFER_START
actual inline val GL_UNIFORM_BUFFER_SIZE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BUFFER_SIZE
actual inline val GL_MAX_VERTEX_UNIFORM_BLOCKS: GLenum
    get() = platform.OpenGL3.GL_MAX_VERTEX_UNIFORM_BLOCKS
actual inline val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
    get() = platform.OpenGL3.GL_MAX_FRAGMENT_UNIFORM_BLOCKS
actual inline val GL_MAX_COMBINED_UNIFORM_BLOCKS: GLenum
    get() = platform.OpenGL3.GL_MAX_COMBINED_UNIFORM_BLOCKS
actual inline val GL_MAX_UNIFORM_BUFFER_BINDINGS: GLenum
    get() = platform.OpenGL3.GL_MAX_UNIFORM_BUFFER_BINDINGS
actual inline val GL_MAX_UNIFORM_BLOCK_SIZE: GLenum
    get() = platform.OpenGL3.GL_MAX_UNIFORM_BLOCK_SIZE
actual inline val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT
actual inline val GL_ACTIVE_UNIFORM_BLOCKS: GLenum
    get() = platform.OpenGL3.GL_ACTIVE_UNIFORM_BLOCKS
actual inline val GL_UNIFORM_TYPE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_TYPE
actual inline val GL_UNIFORM_SIZE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_SIZE
actual inline val GL_UNIFORM_BLOCK_INDEX: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_INDEX
actual inline val GL_UNIFORM_OFFSET: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_OFFSET
actual inline val GL_UNIFORM_ARRAY_STRIDE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_ARRAY_STRIDE
actual inline val GL_UNIFORM_MATRIX_STRIDE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_MATRIX_STRIDE
actual inline val GL_UNIFORM_IS_ROW_MAJOR: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_IS_ROW_MAJOR
actual inline val GL_UNIFORM_BLOCK_BINDING: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_BINDING
actual inline val GL_UNIFORM_BLOCK_DATA_SIZE: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_DATA_SIZE
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
    get() = platform.OpenGL3.GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER
actual inline val GL_INVALID_INDEX: GLenum // FIXME: Type
    get() = platform.OpenGL3.GL_INVALID_INDEX.toInt()

actual inline fun GL31.glCopyBufferSubData(
    readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr,
    writeOffset: GLintptr, size: GLsizeiptr
) = platform.OpenGL3.glCopyBufferSubData(
    readTarget.toUInt(), writeTarget.toUInt(), readOffset.toLong(),
    writeOffset.toLong(), size.toLong()
)

actual inline fun GL31.glDrawArraysInstanced(
    mode: GLenum, first: GLint, count: GLsizei, instanceCount: GLsizei
) = platform.OpenGL3.glDrawArraysInstanced(
    mode.toUInt(), first, count, instanceCount
)

actual inline fun GL31.glDrawElementsInstanced(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr,
    instanceCount: GLsizei
) = platform.OpenGL3.glDrawElementsInstanced(
    mode.toUInt(), count, type.toUInt(), offset.toLong().toCPointer<ByteVar>(),
    instanceCount
)

actual inline fun GL31.glGetUniformIndices(
    program: GLProgram, uniformNames: sequence_DOMString,
    uniformIndices: sequence_GLuint
) = memScoped {
    uniformIndices.usePinned { buffer ->
        val pointers = uniformNames.toCStringArray(this)
        platform.OpenGL3.glGetUniformIndices(
            program.toUInt(), uniformNames.size, pointers, buffer.toCPointer()
        )
    }
}

actual inline fun GL31.glGetActiveUniformsiv(
    program: GLProgram, uniformIndices: sequence_GLuint, pname: GLenum,
    params: sequence_GLint
) = uniformIndices.usePinned { buffer ->
    params.usePinned { bufferParams ->
        platform.OpenGL3.glGetActiveUniformsiv(
            program.toUInt(), uniformIndices.size, buffer.toCPointer(),
            pname.toUInt(), bufferParams.toCPointer()
        )
    }
}

actual inline fun GL31.glGetUniformBlockIndex(
    program: GLProgram, uniformBlockName: DOMString
) = platform.OpenGL3.glGetUniformBlockIndex(
    program.toUInt(), uniformBlockName
).toUInt()

actual inline fun GL31.glGetActiveUniformBlockiv(
    program: GLProgram, uniformBlockIndex: GLuint, pname: GLenum,
    params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetActiveUniformBlockiv(
        program.toUInt(), uniformBlockIndex, pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL31.glGetActiveUniformBlockName(
    program: GLProgram, uniformBlockIndex: GLuint
) = receiveString { buffer, length, bufferSize ->
    platform.OpenGL3.glGetActiveUniformBlockName(
        program.toUInt(), uniformBlockIndex, bufferSize, length, buffer
    )
}

actual inline fun GL31.glUniformBlockBinding(
    program: GLProgram, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint
) = platform.OpenGL3.glUniformBlockBinding(
    program.toUInt(), uniformBlockIndex, uniformBlockBinding
)
