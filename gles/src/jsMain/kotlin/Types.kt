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

package net.gitout.ktbindings.gles

import net.gitout.ktbindings.gles.webgl.*
import org.khronos.webgl.*

actual typealias GLES20 = WebGLRenderingContext
actual typealias GLES30 = WebGL2RenderingContext

actual data class GLBuffer @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLBuffer?
)

actual val emptyGLBuffer = GLBuffer(null)

@PublishedApi
internal inline fun WebGLBuffer?.toGLBuffer(
): GLBuffer = GLBuffer(this)

actual data class GLFramebuffer @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLFramebuffer?
)

actual val emptyGLFramebuffer = GLFramebuffer(null)

@PublishedApi
internal inline fun WebGLFramebuffer?.toGLFramebuffer(
): GLFramebuffer = GLFramebuffer(this)

actual data class GLProgram @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLProgram?
)

actual val emptyGLProgram = GLProgram(null)

@PublishedApi
internal inline fun WebGLProgram?.toGLProgram(
): GLProgram = GLProgram(this)

actual data class GLRenderbuffer @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLRenderbuffer?
)

actual val emptyGLRenderbuffer = GLRenderbuffer(null)

@PublishedApi
internal inline fun WebGLRenderbuffer?.toGLRenderbuffer(
): GLRenderbuffer = GLRenderbuffer(this)

actual data class GLShader @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLShader?
)

actual val emptyGLShader = GLShader(null)

@PublishedApi
internal inline fun WebGLShader?.toGLShader(
): GLShader = GLShader(this)

actual data class GLTexture @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLTexture?
)

actual val emptyGLTexture = GLTexture(null)

@PublishedApi
internal inline fun WebGLTexture?.toGLTexture(
): GLTexture = GLTexture(this)

actual data class GLQuery @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLQuery?
)

actual val emptyGLQuery = GLQuery(null)

@PublishedApi
internal inline fun WebGLQuery?.toGLQuery(
): GLQuery = GLQuery(this)

actual data class GLSampler @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLSampler?
)

actual val emptyGLSampler = GLSampler(null)

@PublishedApi
internal inline fun WebGLSampler?.toGLSampler(
): GLSampler = GLSampler(this)

actual data class GLSync @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLSync?
)

actual val emptyGLSync = GLSync(null)

@PublishedApi
internal inline fun WebGLSync?.toGLSync(
): GLSync = GLSync(this)

actual data class GLTransformFeedback @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLTransformFeedback?
)

actual val emptyGLTransformFeedback = GLTransformFeedback(null)

@PublishedApi
internal inline fun WebGLTransformFeedback?.toGLTransformFeedback(
): GLTransformFeedback = GLTransformFeedback(this)

actual data class GLVertexArrayObject @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLVertexArrayObject?
)

actual val emptyGLVertexArrayObject = GLVertexArrayObject(null)

@PublishedApi
internal inline fun WebGLVertexArrayObject?.toGLVertexArrayObject(
): GLVertexArrayObject = GLVertexArrayObject(this)

actual data class GLUniformLocation @PublishedApi internal constructor(
    @PublishedApi internal val obj: WebGLUniformLocation?
)

actual val emptyGLUniformLocation = GLUniformLocation(null)

@PublishedApi
internal inline fun WebGLUniformLocation?.toGLUniformLocation(
): GLUniformLocation = GLUniformLocation(this)
