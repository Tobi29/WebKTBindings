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

expect val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
expect val GL_CONTEXT_FLAG_DEBUG_BIT: GLenum
expect val GL_DEBUG_GROUP_STACK_DEPTH: GLenum
expect val GL_DEBUG_CALLBACK_FUNCTION: GLenum
expect val GL_DEBUG_CALLBACK_USER_PARAM: GLenum
expect val GL_DEBUG_LOGGED_MESSAGES: GLenum
expect val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH: GLenum
expect val GL_DEBUG_OUTPUT: GLenum
expect val GL_DEBUG_OUTPUT_SYNCHRONOUS: GLenum
expect val GL_DEBUG_SEVERITY_HIGH: GLenum
expect val GL_DEBUG_SEVERITY_LOW: GLenum
expect val GL_DEBUG_SEVERITY_MEDIUM: GLenum
expect val GL_DEBUG_SEVERITY_NOTIFICATION: GLenum
expect val GL_DEBUG_SOURCE_API: GLenum
expect val GL_DEBUG_SOURCE_APPLICATION: GLenum
expect val GL_DEBUG_SOURCE_OTHER: GLenum
expect val GL_DEBUG_SOURCE_SHADER_COMPILER: GLenum
expect val GL_DEBUG_SOURCE_THIRD_PARTY: GLenum
expect val GL_DEBUG_SOURCE_WINDOW_SYSTEM: GLenum
expect val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR: GLenum
expect val GL_DEBUG_TYPE_ERROR: GLenum
expect val GL_DEBUG_TYPE_MARKER: GLenum
expect val GL_DEBUG_TYPE_OTHER: GLenum
expect val GL_DEBUG_TYPE_PERFORMANCE: GLenum
expect val GL_DEBUG_TYPE_POP_GROUP: GLenum
expect val GL_DEBUG_TYPE_PORTABILITY: GLenum
expect val GL_DEBUG_TYPE_PUSH_GROUP: GLenum
expect val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR: GLenum
expect val GL_MAX_DEBUG_GROUP_STACK_DEPTH: GLenum
expect val GL_MAX_DEBUG_LOGGED_MESSAGES: GLenum
expect val GL_MAX_DEBUG_MESSAGE_LENGTH: GLenum
expect val GL_MAX_ELEMENT_INDEX: GLenum
expect val GL_MAX_LABEL_LENGTH: GLenum
expect val GL_TEXTURE_IMMUTABLE_LEVELS: GLenum

expect fun GL43.glDebugMessageCallback(
    callback: GLDebugMessageCallback
)

expect fun GL43.glDebugMessageControl(
    source: GLenum, type: GLenum, severity: GLenum, ids: sequence_GLuint?,
    enabled: GLboolean
)

expect fun GL43.glInvalidateFramebuffer(
    target: GLenum, attachments: sequence_GLenum
)

expect fun GL43.glInvalidateSubFramebuffer(
    target: GLenum, attachments: sequence_GLenum,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
)

expect abstract class GLDebugMessageCallback {
    fun close()
}

expect fun GLDebugMessageCallback(
    callback: (
        source: GLenum, type: GLenum, id: GLuint, severity: GLenum,
        message: String?
    ) -> Unit
): GLDebugMessageCallback
