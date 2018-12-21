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

import org.lwjgl.opengl.GL40C as JGL40C

actual inline val GL_TRANSFORM_FEEDBACK: GLenum
    get() = JGL40C.GL_TRANSFORM_FEEDBACK
actual inline val GL_TRANSFORM_FEEDBACK_BINDING: GLenum
    get() = JGL40C.GL_TRANSFORM_FEEDBACK_BINDING

actual inline fun GL40.glCreateTransformFeedback(
) = JGL40C.glGenTransformFeedbacks(
)

actual inline fun GL40.glDeleteTransformFeedback(
    tf: GLTransformFeedback
) = JGL40C.glDeleteTransformFeedbacks(
    tf
)

actual inline fun GL40.glIsTransformFeedback(
    tf: GLTransformFeedback
) = JGL40C.glIsTransformFeedback(
    tf
)

actual inline fun GL40.glBindTransformFeedback(
    target: GLenum, tf: GLTransformFeedback
) = JGL40C.glBindTransformFeedback(
    target, tf
)

actual inline fun GL40.glPauseTransformFeedback(
) = JGL40C.glPauseTransformFeedback(
)

actual inline fun GL40.glResumeTransformFeedback(
) = JGL40C.glResumeTransformFeedback(
)
