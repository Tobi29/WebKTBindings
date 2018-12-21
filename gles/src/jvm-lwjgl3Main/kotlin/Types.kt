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

@file:JvmName("TypesJVMKt")
@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.gles

import org.lwjgl.opengles.GLES
import org.lwjgl.opengles.GLESCapabilities

actual abstract class GLES20 internal constructor() {
    @PublishedApi
    internal abstract val capabilities: GLESCapabilities
}

actual abstract class GLES30 internal constructor() : GLES20()

private class GLESContext : GLES30() {
    override val capabilities = GLES.createCapabilities()
}

actual inline fun contextGLES20(): GLES20 = contextGLES30()
actual fun contextGLES30(): GLES30 = GLESContext()

actual inline fun GLES20.makeCurrent() = GLES.setCapabilities(capabilities)

actual inline fun GLES20.delete() {
    if (GLES.getCapabilities() === capabilities) {
        GLES.setCapabilities(null)
    }
}

actual typealias GLBuffer = Int

actual inline val emptyGLBuffer: GLBuffer get() = 0

actual typealias GLFramebuffer = Int

actual inline val emptyGLFramebuffer: GLFramebuffer get() = 0

actual typealias GLProgram = Int

actual inline val emptyGLProgram: GLProgram get() = 0

actual typealias GLRenderbuffer = Int

actual inline val emptyGLRenderbuffer: GLRenderbuffer get() = 0

actual typealias GLShader = Int

actual inline val emptyGLShader: GLShader get() = 0

actual typealias GLTexture = Int

actual inline val emptyGLTexture: GLTexture get() = 0

actual typealias GLQuery = Int

actual inline val emptyGLQuery: GLQuery get() = 0

actual typealias GLSampler = Int

actual inline val emptyGLSampler: GLSampler get() = 0

actual typealias GLSync = Long

actual inline val emptyGLSync: GLSync get() = 0L

actual typealias GLTransformFeedback = Int

actual inline val emptyGLTransformFeedback: GLTransformFeedback get() = 0

actual typealias GLVertexArrayObject = Int

actual inline val emptyGLVertexArrayObject: GLVertexArrayObject get() = 0

actual typealias GLUniformLocation = Int

actual inline val emptyGLUniformLocation: GLUniformLocation get() = Int.MAX_VALUE
