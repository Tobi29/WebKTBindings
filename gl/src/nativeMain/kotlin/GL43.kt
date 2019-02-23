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
import net.gitout.ktbindings.utils.*

actual inline val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
    get() = platform.OpenGL3.GL_ANY_SAMPLES_PASSED_CONSERVATIVE
actual inline val GL_CONTEXT_FLAG_DEBUG_BIT: GLenum
    get() = platform.OpenGL3.GL_CONTEXT_FLAG_DEBUG_BIT
actual inline val GL_DEBUG_CALLBACK_FUNCTION: GLenum
    get() = platform.OpenGL3.GL_DEBUG_CALLBACK_FUNCTION
actual inline val GL_DEBUG_CALLBACK_USER_PARAM: GLenum
    get() = platform.OpenGL3.GL_DEBUG_CALLBACK_USER_PARAM
actual inline val GL_DEBUG_GROUP_STACK_DEPTH: GLenum
    get() = platform.OpenGL3.GL_DEBUG_GROUP_STACK_DEPTH
actual inline val GL_DEBUG_LOGGED_MESSAGES: GLenum
    get() = platform.OpenGL3.GL_DEBUG_LOGGED_MESSAGES
actual inline val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH: GLenum
    get() = platform.OpenGL3.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH
actual inline val GL_DEBUG_OUTPUT: GLenum
    get() = platform.OpenGL3.GL_DEBUG_OUTPUT
actual inline val GL_DEBUG_OUTPUT_SYNCHRONOUS: GLenum
    get() = platform.OpenGL3.GL_DEBUG_OUTPUT_SYNCHRONOUS
actual inline val GL_DEBUG_SEVERITY_HIGH: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SEVERITY_HIGH
actual inline val GL_DEBUG_SEVERITY_LOW: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SEVERITY_LOW
actual inline val GL_DEBUG_SEVERITY_MEDIUM: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SEVERITY_MEDIUM
actual inline val GL_DEBUG_SEVERITY_NOTIFICATION: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SEVERITY_NOTIFICATION
actual inline val GL_DEBUG_SOURCE_API: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_API
actual inline val GL_DEBUG_SOURCE_APPLICATION: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_APPLICATION
actual inline val GL_DEBUG_SOURCE_OTHER: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_OTHER
actual inline val GL_DEBUG_SOURCE_SHADER_COMPILER: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_SHADER_COMPILER
actual inline val GL_DEBUG_SOURCE_THIRD_PARTY: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_THIRD_PARTY
actual inline val GL_DEBUG_SOURCE_WINDOW_SYSTEM: GLenum
    get() = platform.OpenGL3.GL_DEBUG_SOURCE_WINDOW_SYSTEM
actual inline val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR
actual inline val GL_DEBUG_TYPE_ERROR: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_ERROR
actual inline val GL_DEBUG_TYPE_MARKER: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_MARKER
actual inline val GL_DEBUG_TYPE_OTHER: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_OTHER
actual inline val GL_DEBUG_TYPE_PERFORMANCE: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_PERFORMANCE
actual inline val GL_DEBUG_TYPE_POP_GROUP: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_POP_GROUP
actual inline val GL_DEBUG_TYPE_PORTABILITY: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_PORTABILITY
actual inline val GL_DEBUG_TYPE_PUSH_GROUP: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_PUSH_GROUP
actual inline val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR: GLenum
    get() = platform.OpenGL3.GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR
actual inline val GL_MAX_DEBUG_GROUP_STACK_DEPTH: GLenum
    get() = platform.OpenGL3.GL_MAX_DEBUG_GROUP_STACK_DEPTH
actual inline val GL_MAX_DEBUG_LOGGED_MESSAGES: GLenum
    get() = platform.OpenGL3.GL_MAX_DEBUG_LOGGED_MESSAGES
actual inline val GL_MAX_DEBUG_MESSAGE_LENGTH: GLenum
    get() = platform.OpenGL3.GL_MAX_DEBUG_MESSAGE_LENGTH
actual inline val GL_MAX_ELEMENT_INDEX: GLenum
    get() = platform.OpenGL3.GL_MAX_ELEMENT_INDEX
actual inline val GL_MAX_LABEL_LENGTH: GLenum
    get() = platform.OpenGL3.GL_MAX_LABEL_LENGTH
actual inline val GL_TEXTURE_IMMUTABLE_LEVELS: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_IMMUTABLE_LEVELS

actual inline fun GL43.glDebugMessageCallback(
    callback: GLDebugMessageCallback
) = platform.OpenGL3.glDebugMessageCallback(
    staticCFunction(::glDebugMessageCallbackStatic), callback.ref!!.asCPointer()
)

actual inline fun GL43.glDebugMessageControl(
    source: GLenum, type: GLenum, severity: GLenum, ids: sequence_GLuint?,
    enabled: GLboolean
) = ids.usePinnedOrNull { buffer ->
    platform.OpenGL3.glDebugMessageControl(
        source.toUInt(), type.toUInt(), severity.toUInt(),
        ids?.size ?: 0, buffer?.toCPointer(), if (enabled) 1u else 0u
    )
}

actual inline fun GL43.glInvalidateFramebuffer(
    target: GLenum, attachments: sequence_GLenum
) = attachments.asUIntArray().usePinned { buffer ->
    platform.OpenGL3.glInvalidateFramebuffer(
        target.toUInt(), attachments.size, buffer.toCPointer()
    )
}

actual inline fun GL43.glInvalidateSubFramebuffer(
    target: GLenum, attachments: sequence_GLenum,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = attachments.asUIntArray().usePinned { buffer ->
    platform.OpenGL3.glInvalidateSubFramebuffer(
        target.toUInt(), attachments.size, buffer.toCPointer(), x, y, width,
        height
    )
}
