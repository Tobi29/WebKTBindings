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

package net.gitout.ktbindings.gl

import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GLCapabilities

actual abstract class GL11 internal constructor() {
    @PublishedApi
    internal abstract val capabilities: GLCapabilities
}

actual abstract class GL12 internal constructor() : GL11()
actual abstract class GL13 internal constructor() : GL12()
actual abstract class GL14 internal constructor() : GL13()
actual abstract class GL15 internal constructor() : GL14()
actual abstract class GL20 internal constructor() : GL15()
actual abstract class GL21 internal constructor() : GL20()
actual abstract class GL30 internal constructor() : GL21()
actual abstract class GL31 internal constructor() : GL30()
actual abstract class GL32 internal constructor() : GL31()
actual abstract class GL33 internal constructor() : GL32()
actual abstract class GL40 internal constructor() : GL33()
actual abstract class GL41 internal constructor() : GL40()
actual abstract class GL42 internal constructor() : GL41()
actual abstract class GL43 internal constructor() : GL42()

private class GLContext : GL43() {
    override val capabilities = GL.createCapabilities(true)
}

actual inline fun contextGL11(): GL11 = contextGL43()
actual inline fun contextGL12(): GL12 = contextGL43()
actual inline fun contextGL13(): GL13 = contextGL43()
actual inline fun contextGL14(): GL14 = contextGL43()
actual inline fun contextGL15(): GL15 = contextGL43()
actual inline fun contextGL20(): GL20 = contextGL43()
actual inline fun contextGL21(): GL21 = contextGL43()
actual inline fun contextGL30(): GL30 = contextGL43()
actual inline fun contextGL31(): GL31 = contextGL43()
actual inline fun contextGL32(): GL32 = contextGL43()
actual inline fun contextGL33(): GL33 = contextGL43()
actual inline fun contextGL40(): GL40 = contextGL43()
actual inline fun contextGL41(): GL41 = contextGL43()
actual inline fun contextGL42(): GL42 = contextGL43()
actual fun contextGL43(): GL43 = GLContext()

actual inline fun GL11.makeCurrent() = GL.setCapabilities(capabilities)

actual inline fun GL11.delete() {
    if (GL.getCapabilities() === capabilities) {
        GL.setCapabilities(null)
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
