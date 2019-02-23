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

import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned
import net.gitout.ktbindings.utils.toCPointer

actual inline val GL_MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_VERTEX_OUTPUT_COMPONENTS
actual inline val GL_MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_FRAGMENT_INPUT_COMPONENTS
actual inline val GL_MAX_SERVER_WAIT_TIMEOUT: GLenum
    get() = platform.OpenGL3.GL_MAX_SERVER_WAIT_TIMEOUT
actual inline val GL_OBJECT_TYPE: GLenum
    get() = platform.OpenGL3.GL_OBJECT_TYPE
actual inline val GL_SYNC_CONDITION: GLenum
    get() = platform.OpenGL3.GL_SYNC_CONDITION
actual inline val GL_SYNC_STATUS: GLenum
    get() = platform.OpenGL3.GL_SYNC_STATUS
actual inline val GL_SYNC_FLAGS: GLenum
    get() = platform.OpenGL3.GL_SYNC_FLAGS
actual inline val GL_SYNC_FENCE: GLenum
    get() = platform.OpenGL3.GL_SYNC_FENCE
actual inline val GL_SYNC_GPU_COMMANDS_COMPLETE: GLenum
    get() = platform.OpenGL3.GL_SYNC_GPU_COMMANDS_COMPLETE
actual inline val GL_UNSIGNALED: GLenum
    get() = platform.OpenGL3.GL_UNSIGNALED
actual inline val GL_SIGNALED: GLenum
    get() = platform.OpenGL3.GL_SIGNALED
actual inline val GL_ALREADY_SIGNALED: GLenum
    get() = platform.OpenGL3.GL_ALREADY_SIGNALED
actual inline val GL_TIMEOUT_EXPIRED: GLenum
    get() = platform.OpenGL3.GL_TIMEOUT_EXPIRED
actual inline val GL_CONDITION_SATISFIED: GLenum
    get() = platform.OpenGL3.GL_CONDITION_SATISFIED
actual inline val GL_WAIT_FAILED: GLenum
    get() = platform.OpenGL3.GL_WAIT_FAILED
actual inline val GL_SYNC_FLUSH_COMMANDS_BIT: GLenum
    get() = platform.OpenGL3.GL_SYNC_FLUSH_COMMANDS_BIT

actual inline val GL_TIMEOUT_IGNORED: GLint64
    get() = platform.OpenGL3.GL_TIMEOUT_IGNORED.toLong()

actual inline fun GL32.glFenceSync(
    condition: GLenum, flags: GLbitfield
) = platform.OpenGL3.glFenceSync(
    condition.toUInt(), flags.toUInt()
)?.toLong() ?: 0L

actual inline fun GL32.glIsSync(
    sync: GLSync
) = platform.OpenGL3.glIsSync(
    sync.toCPointer()
) != 0u.toUByte()

actual inline fun GL32.glDeleteSync(
    sync: GLSync
) = platform.OpenGL3.glDeleteSync(
    sync.toCPointer()
)

actual inline fun GL32.glClientWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLuint64
) = platform.OpenGL3.glClientWaitSync(
    sync.toCPointer(), flags.toUInt(), timeout
).toInt()

actual inline fun GL32.glWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLint64
) = platform.OpenGL3.glWaitSync(
    sync.toCPointer(), flags.toUInt(), timeout.toULong()
)

actual inline fun GL32.glGetSynciv(
    sync: GLSync, pname: GLenum, length: sequence_GLsizei,
    values: sequence_GLint
) = length.usePinned { buffer ->
    values.usePinned { bufferValues ->
        platform.OpenGL3.glGetSynciv(
            sync.toCPointer(), pname.toUInt(), length.size, buffer.toCPointer(),
            bufferValues.toCPointer()
        )
    }
}
