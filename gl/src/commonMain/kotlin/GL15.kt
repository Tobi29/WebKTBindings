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

import net.gitout.ktbindings.utils.DataBuffer

expect val GL_ARRAY_BUFFER: GLenum
expect val GL_ELEMENT_ARRAY_BUFFER: GLenum
expect val GL_ARRAY_BUFFER_BINDING: GLenum
expect val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
expect val GL_STREAM_DRAW: GLenum
expect val GL_STATIC_DRAW: GLenum
expect val GL_DYNAMIC_DRAW: GLenum
expect val GL_BUFFER_SIZE: GLenum
expect val GL_BUFFER_USAGE: GLenum
expect val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
expect val GL_CURRENT_QUERY: GLenum
expect val GL_QUERY_RESULT: GLenum
expect val GL_QUERY_RESULT_AVAILABLE: GLenum
expect val GL_STREAM_READ: GLenum
expect val GL_STREAM_COPY: GLenum
expect val GL_STATIC_READ: GLenum
expect val GL_STATIC_COPY: GLenum
expect val GL_DYNAMIC_READ: GLenum
expect val GL_DYNAMIC_COPY: GLenum

expect fun GL15.glBindBuffer(
    target: GLenum, buffer: GLBuffer
)

expect fun GL15.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
)

expect fun GL15.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
)

expect fun GL15.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
)

expect fun GL15.glCreateBuffer(
): GLBuffer

expect fun GL15.glDeleteBuffer(
    buffer: GLBuffer
)

expect fun GL15.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
)

expect fun GL15.glIsBuffer(
    buffer: GLBuffer
): GLboolean

expect fun GL15.glCreateQuery(
): GLQuery

expect fun GL15.glDeleteQuery(
    query: GLQuery
)

expect fun GL15.glIsQuery(
    query: GLQuery
): GLboolean

expect fun GL15.glBeginQuery(
    target: GLenum, query: GLQuery
)

expect fun GL15.glEndQuery(
    target: GLenum
)

expect fun GL15.glGetQuery(
    target: GLenum, pname: GLenum
): GLQuery

expect fun GL15.glGetQueryObjectuiv(
    query: GLQuery, pname: GLenum, params: sequence_GLuint
)
