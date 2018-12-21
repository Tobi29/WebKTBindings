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

import org.lwjgl.opengl.GL32C as JGL32C

actual inline val GL_MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
    get() = JGL32C.GL_MAX_VERTEX_OUTPUT_COMPONENTS
actual inline val GL_MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
    get() = JGL32C.GL_MAX_FRAGMENT_INPUT_COMPONENTS
actual inline val GL_MAX_SERVER_WAIT_TIMEOUT: GLenum
    get() = JGL32C.GL_MAX_SERVER_WAIT_TIMEOUT
actual inline val GL_OBJECT_TYPE: GLenum
    get() = JGL32C.GL_OBJECT_TYPE
actual inline val GL_SYNC_CONDITION: GLenum
    get() = JGL32C.GL_SYNC_CONDITION
actual inline val GL_SYNC_STATUS: GLenum
    get() = JGL32C.GL_SYNC_STATUS
actual inline val GL_SYNC_FLAGS: GLenum
    get() = JGL32C.GL_SYNC_FLAGS
actual inline val GL_SYNC_FENCE: GLenum
    get() = JGL32C.GL_SYNC_FENCE
actual inline val GL_SYNC_GPU_COMMANDS_COMPLETE: GLenum
    get() = JGL32C.GL_SYNC_GPU_COMMANDS_COMPLETE
actual inline val GL_UNSIGNALED: GLenum
    get() = JGL32C.GL_UNSIGNALED
actual inline val GL_SIGNALED: GLenum
    get() = JGL32C.GL_SIGNALED
actual inline val GL_ALREADY_SIGNALED: GLenum
    get() = JGL32C.GL_ALREADY_SIGNALED
actual inline val GL_TIMEOUT_EXPIRED: GLenum
    get() = JGL32C.GL_TIMEOUT_EXPIRED
actual inline val GL_CONDITION_SATISFIED: GLenum
    get() = JGL32C.GL_CONDITION_SATISFIED
actual inline val GL_WAIT_FAILED: GLenum
    get() = JGL32C.GL_WAIT_FAILED
actual inline val GL_SYNC_FLUSH_COMMANDS_BIT: GLenum
    get() = JGL32C.GL_SYNC_FLUSH_COMMANDS_BIT

actual inline val GL_TIMEOUT_IGNORED: GLint64
    get() = JGL32C.GL_TIMEOUT_IGNORED

actual inline fun GL32.glFenceSync(
    condition: GLenum, flags: GLbitfield
) = JGL32C.glFenceSync(
    condition, flags
)

actual inline fun GL32.glIsSync(
    sync: GLSync
) = JGL32C.glIsSync(
    sync
)

actual inline fun GL32.glDeleteSync(
    sync: GLSync
) = JGL32C.glDeleteSync(
    sync
)

actual inline fun GL32.glClientWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLuint64
) = JGL32C.glClientWaitSync(
    sync, flags, timeout.toLong()
)

actual inline fun GL32.glWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLint64
) = JGL32C.glWaitSync(
    sync, flags, timeout
)

actual inline fun GL32.glGetSynciv(
    sync: GLSync, pname: GLenum, length: sequence_GLsizei,
    values: sequence_GLint
) = JGL32C.glGetSynciv(
    sync, pname, length, values
)
