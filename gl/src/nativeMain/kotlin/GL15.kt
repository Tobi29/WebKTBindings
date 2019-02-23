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
import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_ARRAY_BUFFER: GLenum
    get() = platform.OpenGL3.GL_ARRAY_BUFFER
actual inline val GL_ELEMENT_ARRAY_BUFFER: GLenum
    get() = platform.OpenGL3.GL_ELEMENT_ARRAY_BUFFER
actual inline val GL_ARRAY_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_ARRAY_BUFFER_BINDING
actual inline val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_ELEMENT_ARRAY_BUFFER_BINDING
actual inline val GL_STREAM_DRAW: GLenum
    get() = platform.OpenGL3.GL_STREAM_DRAW
actual inline val GL_STATIC_DRAW: GLenum
    get() = platform.OpenGL3.GL_STATIC_DRAW
actual inline val GL_DYNAMIC_DRAW: GLenum
    get() = platform.OpenGL3.GL_DYNAMIC_DRAW
actual inline val GL_BUFFER_SIZE: GLenum
    get() = platform.OpenGL3.GL_BUFFER_SIZE
actual inline val GL_BUFFER_USAGE: GLenum
    get() = platform.OpenGL3.GL_BUFFER_USAGE
actual inline val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING
actual inline val GL_CURRENT_QUERY: GLenum
    get() = platform.OpenGL3.GL_CURRENT_QUERY
actual inline val GL_QUERY_RESULT: GLenum
    get() = platform.OpenGL3.GL_QUERY_RESULT
actual inline val GL_QUERY_RESULT_AVAILABLE: GLenum
    get() = platform.OpenGL3.GL_QUERY_RESULT_AVAILABLE
actual inline val GL_STREAM_READ: GLenum
    get() = platform.OpenGL3.GL_STREAM_READ
actual inline val GL_STREAM_COPY: GLenum
    get() = platform.OpenGL3.GL_STREAM_COPY
actual inline val GL_STATIC_READ: GLenum
    get() = platform.OpenGL3.GL_STATIC_READ
actual inline val GL_STATIC_COPY: GLenum
    get() = platform.OpenGL3.GL_STATIC_COPY
actual inline val GL_DYNAMIC_READ: GLenum
    get() = platform.OpenGL3.GL_DYNAMIC_READ
actual inline val GL_DYNAMIC_COPY: GLenum
    get() = platform.OpenGL3.GL_DYNAMIC_COPY

actual inline fun GL15.glBindBuffer(
    target: GLenum, buffer: GLBuffer
) = platform.OpenGL3.glBindBuffer(
    target.toUInt(), buffer.toUInt()
)

actual inline fun GL15.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
) = platform.OpenGL3.glBufferData(
    target.toUInt(), size.toLong(), null, usage.toUInt()
)

actual inline fun GL15.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
) = data.read { buffer ->
    platform.OpenGL3.glBufferData(
        target.toUInt(), data.size.toLong(), buffer, usage.toUInt()
    )
}

actual inline fun GL15.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
) = data.read { buffer ->
    platform.OpenGL3.glBufferSubData(
        target.toUInt(), offset.toLong(), data.size.toLong(), buffer
    )
}

actual inline fun GL15.glCreateBuffer(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenBuffers(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL15.glDeleteBuffer(
    buffer: GLBuffer
) = memScoped {
    val bufferBuffer = alloc<UIntVar>()
    bufferBuffer.value = buffer.toUInt()
    platform.OpenGL3.glDeleteBuffers(
        1, bufferBuffer.ptr
    )
}

actual inline fun GL15.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetBufferParameteriv(
        target.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL15.glIsBuffer(
    buffer: GLBuffer
) = platform.OpenGL3.glIsBuffer(
    buffer.toUInt()
) != 0u.toUByte()

actual inline fun GL15.glCreateQuery(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenQueries(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL15.glDeleteQuery(
    query: GLQuery
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = query.toUInt()
    platform.OpenGL3.glDeleteQueries(
        1, buffer.ptr
    )
}

actual inline fun GL15.glIsQuery(
    query: GLQuery
) = platform.OpenGL3.glIsQuery(
    query.toUInt()
) != 0u.toUByte()

actual inline fun GL15.glBeginQuery(
    target: GLenum, query: GLQuery
) = platform.OpenGL3.glBeginQuery(
    target.toUInt(), query.toUInt()
)

actual inline fun GL15.glEndQuery(
    target: GLenum
) = platform.OpenGL3.glEndQuery(
    target.toUInt()
)

actual inline fun GL15.glGetQuery(
    target: GLenum, pname: GLenum
) = memScoped {
    val buffer = alloc<IntVar>()
    platform.OpenGL3.glGetQueryiv(
        target.toUInt(), pname.toUInt(), buffer.ptr
    )
    buffer.value
}

actual inline fun GL15.glGetQueryObjectuiv(
    query: GLQuery, pname: GLenum, params: sequence_GLuint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetQueryObjectuiv(
        query.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}
