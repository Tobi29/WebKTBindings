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

expect val GL_TRANSFORM_FEEDBACK: GLenum
expect val GL_TRANSFORM_FEEDBACK_BINDING: GLenum

expect fun GL40.glCreateTransformFeedback(
): GLTransformFeedback

expect fun GL40.glDeleteTransformFeedback(
    tf: GLTransformFeedback
)

expect fun GL40.glIsTransformFeedback(
    tf: GLTransformFeedback
): GLboolean

expect fun GL40.glBindTransformFeedback(
    target: GLenum, tf: GLTransformFeedback
)

expect fun GL40.glPauseTransformFeedback(
)

expect fun GL40.glResumeTransformFeedback(
)
