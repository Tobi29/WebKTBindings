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

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import org.lwjgl.opengl.GL15C as JGL15C

actual inline val GL_ARRAY_BUFFER: GLenum
    get() = JGL15C.GL_ARRAY_BUFFER
actual inline val GL_ELEMENT_ARRAY_BUFFER: GLenum
    get() = JGL15C.GL_ELEMENT_ARRAY_BUFFER
actual inline val GL_ARRAY_BUFFER_BINDING: GLenum
    get() = JGL15C.GL_ARRAY_BUFFER_BINDING
actual inline val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    get() = JGL15C.GL_ELEMENT_ARRAY_BUFFER_BINDING
actual inline val GL_STREAM_DRAW: GLenum
    get() = JGL15C.GL_STREAM_DRAW
actual inline val GL_STATIC_DRAW: GLenum
    get() = JGL15C.GL_STATIC_DRAW
actual inline val GL_DYNAMIC_DRAW: GLenum
    get() = JGL15C.GL_DYNAMIC_DRAW
actual inline val GL_BUFFER_SIZE: GLenum
    get() = JGL15C.GL_BUFFER_SIZE
actual inline val GL_BUFFER_USAGE: GLenum
    get() = JGL15C.GL_BUFFER_USAGE
actual inline val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    get() = JGL15C.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING
actual inline val GL_CURRENT_QUERY: GLenum
    get() = JGL15C.GL_CURRENT_QUERY
actual inline val GL_QUERY_RESULT: GLenum
    get() = JGL15C.GL_QUERY_RESULT
actual inline val GL_QUERY_RESULT_AVAILABLE: GLenum
    get() = JGL15C.GL_QUERY_RESULT_AVAILABLE
actual inline val GL_STREAM_READ: GLenum
    get() = JGL15C.GL_STREAM_READ
actual inline val GL_STREAM_COPY: GLenum
    get() = JGL15C.GL_STREAM_COPY
actual inline val GL_STATIC_READ: GLenum
    get() = JGL15C.GL_STATIC_READ
actual inline val GL_STATIC_COPY: GLenum
    get() = JGL15C.GL_STATIC_COPY
actual inline val GL_DYNAMIC_READ: GLenum
    get() = JGL15C.GL_DYNAMIC_READ
actual inline val GL_DYNAMIC_COPY: GLenum
    get() = JGL15C.GL_DYNAMIC_COPY

actual inline fun GL15.glBindBuffer(
    target: GLenum, buffer: GLBuffer
) = JGL15C.glBindBuffer(
    target, buffer
)

actual inline fun GL15.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
) = JGL15C.glBufferData(
    target, size.toLong(), usage
)

actual inline fun GL15.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
) = data.read { buffer ->
    JGL15C.glBufferData(
        target, buffer, usage
    )
}

actual inline fun GL15.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
) = data.read { buffer ->
    JGL15C.glBufferSubData(
        target, offset.toLong(), buffer
    )
}

actual inline fun GL15.glCreateBuffer(
) = JGL15C.glGenBuffers(
)

actual inline fun GL15.glDeleteBuffer(
    buffer: GLBuffer
) = JGL15C.glDeleteBuffers(
    buffer
)

actual inline fun GL15.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGL15C.glGetBufferParameteriv(
    target, pname, params
)

actual inline fun GL15.glIsBuffer(
    buffer: GLBuffer
) = JGL15C.glIsBuffer(
    buffer
)

actual inline fun GL15.glCreateQuery(
) = JGL15C.glGenQueries(
)

actual inline fun GL15.glDeleteQuery(
    query: GLQuery
) = JGL15C.glDeleteQueries(
    query
)

actual inline fun GL15.glIsQuery(
    query: GLQuery
) = JGL15C.glIsQuery(
    query
)

actual inline fun GL15.glBeginQuery(
    target: GLenum, query: GLQuery
) = JGL15C.glBeginQuery(
    target, query
)

actual inline fun GL15.glEndQuery(
    target: GLenum
) = JGL15C.glEndQuery(
    target
)

actual inline fun GL15.glGetQuery(
    target: GLenum, pname: GLenum
) = JGL15C.glGetQueryi(
    target, pname
)

actual inline fun GL15.glGetQueryObjectuiv(
    query: GLQuery, pname: GLenum, params: sequence_GLuint
) = JGL15C.glGetQueryObjectuiv(
    query, pname, params.asIntArray()
)
