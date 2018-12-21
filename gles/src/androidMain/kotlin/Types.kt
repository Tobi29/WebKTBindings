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

import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.IntBuffer

actual abstract class GLES20 internal constructor() {
    @PublishedApi
    internal val i4at0 = ByteBuffer.allocateDirect(16).order(
        ByteOrder.nativeOrder()
    ).asIntBuffer()
    @PublishedApi
    internal val i3at0 = i4at0.slice(0, 3)
    @PublishedApi
    internal val i2at0 = i4at0.slice(0, 2)
    @PublishedApi
    internal val i2at2 = i4at0.slice(2, 4)
    @PublishedApi
    internal val i1at0 = i4at0.slice(0, 1)
    @PublishedApi
    internal val i1at1 = i4at0.slice(1, 2)
    @PublishedApi
    internal val i1at2 = i4at0.slice(2, 3)
    @PublishedApi
    internal val i1at3 = i4at0.slice(3, 4)
}

actual abstract class GLES30 internal constructor() : GLES20()

private class GLESContext : GLES30()

actual inline fun contextGLES20(): GLES20 = contextGLES30()
actual fun contextGLES30(): GLES30 = GLESContext()

actual inline fun GLES20.makeCurrent() {}

actual inline fun GLES20.delete() {}

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

private fun IntBuffer.slice(
    start: Int,
    end: Int
): IntBuffer {
    _position(start)
    _limit(end)
    val slice = slice()
    _clear()
    return slice
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(block: (IntBuffer) -> R): R {
    val i0 = i1at0
    try {
        return block(i0)
    } finally {
        i0._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(block: (IntBuffer, IntBuffer) -> R): R {
    val i0 = i1at0
    val i1 = i1at1
    try {
        return block(i0, i1)
    } finally {
        i0._clear()
        i1._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(block: (IntBuffer, IntBuffer, IntBuffer) -> R): R {
    val i0 = i1at0
    val i1 = i1at1
    val i2 = i1at2
    try {
        return block(i0, i1, i2)
    } finally {
        i0._clear()
        i1._clear()
        i2._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(block: (IntBuffer, IntBuffer, IntBuffer, IntBuffer) -> R): R {
    val i0 = i1at0
    val i1 = i1at1
    val i2 = i1at2
    val i3 = i1at3
    try {
        return block(i0, i1, i2, i3)
    } finally {
        i0._clear()
        i1._clear()
        i2._clear()
        i3._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers2(block: (IntBuffer) -> R): R {
    val i0 = i2at0
    try {
        return block(i0)
    } finally {
        i0._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers2(block: (IntBuffer, IntBuffer) -> R): R {
    val i0 = i2at0
    val i1 = i2at2
    try {
        return block(i0, i1)
    } finally {
        i0._clear()
        i1._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers3(block: (IntBuffer) -> R): R {
    val i0 = i3at0
    try {
        return block(i0)
    } finally {
        i0._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers4(block: (IntBuffer) -> R): R {
    val i0 = i4at0
    try {
        return block(i0)
    } finally {
        i0._clear()
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(
    v0: Int,
    block: (IntBuffer) -> R
): R {
    intBuffers { i0 ->
        i0.put(0, v0)
        return block(i0)
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(
    v0: Int,
    v1: Int,
    block: (IntBuffer, IntBuffer) -> R
): R {
    intBuffers { i0, i1 ->
        i0.put(0, v0)
        i1.put(0, v1)
        return block(i0, i1)
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(
    v0: Int,
    v1: Int,
    v2: Int,
    block: (IntBuffer, IntBuffer, IntBuffer) -> R
): R {
    intBuffers { i0, i1, i2 ->
        i0.put(0, v0)
        i1.put(0, v1)
        i2.put(0, v2)
        return block(i0, i1, i2)
    }
}

@PublishedApi
internal inline fun <R> GLES20.intBuffers(
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
    block: (IntBuffer, IntBuffer, IntBuffer, IntBuffer) -> R
): R {
    intBuffers { i0, i1, i2, i3 ->
        i0.put(0, v0)
        i1.put(0, v1)
        i2.put(0, v2)
        i3.put(0, v3)
        return block(i0, i1, i2, i3)
    }
}

@PublishedApi
internal inline fun GLES20.readInts(block: (IntBuffer) -> Unit) =
    intBuffers { i0 ->
        block(i0)
        i0[0]
    }

@PublishedApi
internal inline fun GLES20.readInts(block: (IntBuffer, IntBuffer) -> Unit) =
    intBuffers { i0, i1 ->
        block(i0, i1)
        Pair(i0[0], i1[0])
    }

@PublishedApi
internal inline fun GLES20.readInts(block: (IntBuffer, IntBuffer, IntBuffer) -> Unit) =
    intBuffers { i0, i1, i2 ->
        block(i0, i1, i2)
        Triple(i0[0], i1[0], i2[0])
    }

@PublishedApi
internal inline fun <B : Buffer> B._position(newPosition: Int): B =
    apply { position(newPosition) }

@PublishedApi
internal inline fun <B : Buffer> B._limit(newLimit: Int): B =
    apply { limit(newLimit) }

@PublishedApi
internal inline fun <B : Buffer> B._clear(): B =
    apply { clear() }
