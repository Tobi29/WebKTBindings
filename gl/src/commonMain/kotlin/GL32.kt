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

expect val GL_MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
expect val GL_MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
expect val GL_MAX_SERVER_WAIT_TIMEOUT: GLenum
expect val GL_OBJECT_TYPE: GLenum
expect val GL_SYNC_CONDITION: GLenum
expect val GL_SYNC_STATUS: GLenum
expect val GL_SYNC_FLAGS: GLenum
expect val GL_SYNC_FENCE: GLenum
expect val GL_SYNC_GPU_COMMANDS_COMPLETE: GLenum
expect val GL_UNSIGNALED: GLenum
expect val GL_SIGNALED: GLenum
expect val GL_ALREADY_SIGNALED: GLenum
expect val GL_TIMEOUT_EXPIRED: GLenum
expect val GL_CONDITION_SATISFIED: GLenum
expect val GL_WAIT_FAILED: GLenum
expect val GL_SYNC_FLUSH_COMMANDS_BIT: GLenum

expect val GL_TIMEOUT_IGNORED: GLint64

expect fun GL32.glFenceSync(
    condition: GLenum, flags: GLbitfield
): GLSync

expect fun GL32.glIsSync(
    sync: GLSync
): GLboolean

expect fun GL32.glDeleteSync(
    sync: GLSync
)

expect fun GL32.glClientWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLuint64
): GLenum

expect fun GL32.glWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLint64
)

expect fun GL32.glGetSynciv(
    sync: GLSync, pname: GLenum, length: sequence_GLsizei,
    values: sequence_GLint
)
