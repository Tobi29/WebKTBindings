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

actual inline val GL_TRANSFORM_FEEDBACK: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK
actual inline val GL_TRANSFORM_FEEDBACK_BINDING: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BINDING

actual inline fun GL40.glCreateTransformFeedback(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenTransformFeedbacks(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL40.glDeleteTransformFeedback(
    tf: GLTransformFeedback
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = tf.toUInt()
    platform.OpenGL3.glDeleteTransformFeedbacks(
        1, buffer.ptr
    )
}

actual inline fun GL40.glIsTransformFeedback(
    tf: GLTransformFeedback
) = platform.OpenGL3.glIsTransformFeedback(
    tf.toUInt()
) != 0u.toUByte()

actual inline fun GL40.glBindTransformFeedback(
    target: GLenum, tf: GLTransformFeedback
) = platform.OpenGL3.glBindTransformFeedback(
    target.toUInt(), tf.toUInt()
)

actual inline fun GL40.glPauseTransformFeedback(
) = platform.OpenGL3.glPauseTransformFeedback(
)

actual inline fun GL40.glResumeTransformFeedback(
) = platform.OpenGL3.glResumeTransformFeedback(
)
