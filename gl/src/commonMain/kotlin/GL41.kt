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

expect val GL_MAX_VERTEX_UNIFORM_VECTORS: GLenum
expect val GL_MAX_VARYING_VECTORS: GLenum
expect val GL_MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
expect val GL_IMPLEMENTATION_COLOR_READ_TYPE: GLenum
expect val GL_IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
expect val GL_LOW_FLOAT: GLenum
expect val GL_MEDIUM_FLOAT: GLenum
expect val GL_HIGH_FLOAT: GLenum
expect val GL_LOW_INT: GLenum
expect val GL_MEDIUM_INT: GLenum
expect val GL_HIGH_INT: GLenum
expect val GL_RGB565: GLenum

expect fun GL41.glClearDepth(
    depth: GLclampf
)

expect fun GL41.glDepthRange(
    zNear: GLclampf, zFar: GLclampf
)
