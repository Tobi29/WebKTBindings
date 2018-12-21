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

expect val GL_COPY_READ_BUFFER_BINDING: GLenum
expect val GL_COPY_WRITE_BUFFER_BINDING: GLenum
expect val GL_TRANSFORM_FEEDBACK_PAUSED: GLenum
expect val GL_TRANSFORM_FEEDBACK_ACTIVE: GLenum
expect val GL_TEXTURE_IMMUTABLE_FORMAT: GLenum

expect fun GL42.glGetInternalformativ(
    target: GLenum, internalformat: GLenum, pname: GLenum,
    params: sequence_GLint
)

expect fun GL42.glTexStorage2D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei
)

expect fun GL42.glTexStorage3D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei
)
