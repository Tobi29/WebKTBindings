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

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import org.lwjgl.opengl.GL13C as JGL13C

actual inline val GL_SAMPLE_ALPHA_TO_COVERAGE: GLenum
    get() = JGL13C.GL_SAMPLE_ALPHA_TO_COVERAGE
actual inline val GL_SAMPLE_COVERAGE: GLenum
    get() = JGL13C.GL_SAMPLE_COVERAGE
actual inline val GL_SAMPLE_BUFFERS: GLenum
    get() = JGL13C.GL_SAMPLE_BUFFERS
actual inline val GL_SAMPLES: GLenum
    get() = JGL13C.GL_SAMPLES
actual inline val GL_SAMPLE_COVERAGE_VALUE: GLenum
    get() = JGL13C.GL_SAMPLE_COVERAGE_VALUE
actual inline val GL_SAMPLE_COVERAGE_INVERT: GLenum
    get() = JGL13C.GL_SAMPLE_COVERAGE_INVERT
actual inline val GL_TEXTURE_CUBE_MAP: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP
actual inline val GL_TEXTURE_BINDING_CUBE_MAP: GLenum
    get() = JGL13C.GL_TEXTURE_BINDING_CUBE_MAP
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_POSITIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_NEGATIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_POSITIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_POSITIVE_Z
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    get() = JGL13C.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z
actual inline val GL_MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    get() = JGL13C.GL_MAX_CUBE_MAP_TEXTURE_SIZE
actual inline val GL_TEXTURE0: GLenum
    get() = JGL13C.GL_TEXTURE0
actual inline val GL_TEXTURE1: GLenum
    get() = JGL13C.GL_TEXTURE1
actual inline val GL_TEXTURE2: GLenum
    get() = JGL13C.GL_TEXTURE2
actual inline val GL_TEXTURE3: GLenum
    get() = JGL13C.GL_TEXTURE3
actual inline val GL_TEXTURE4: GLenum
    get() = JGL13C.GL_TEXTURE4
actual inline val GL_TEXTURE5: GLenum
    get() = JGL13C.GL_TEXTURE5
actual inline val GL_TEXTURE6: GLenum
    get() = JGL13C.GL_TEXTURE6
actual inline val GL_TEXTURE7: GLenum
    get() = JGL13C.GL_TEXTURE7
actual inline val GL_TEXTURE8: GLenum
    get() = JGL13C.GL_TEXTURE8
actual inline val GL_TEXTURE9: GLenum
    get() = JGL13C.GL_TEXTURE9
actual inline val GL_TEXTURE10: GLenum
    get() = JGL13C.GL_TEXTURE10
actual inline val GL_TEXTURE11: GLenum
    get() = JGL13C.GL_TEXTURE11
actual inline val GL_TEXTURE12: GLenum
    get() = JGL13C.GL_TEXTURE12
actual inline val GL_TEXTURE13: GLenum
    get() = JGL13C.GL_TEXTURE13
actual inline val GL_TEXTURE14: GLenum
    get() = JGL13C.GL_TEXTURE14
actual inline val GL_TEXTURE15: GLenum
    get() = JGL13C.GL_TEXTURE15
actual inline val GL_TEXTURE16: GLenum
    get() = JGL13C.GL_TEXTURE16
actual inline val GL_TEXTURE17: GLenum
    get() = JGL13C.GL_TEXTURE17
actual inline val GL_TEXTURE18: GLenum
    get() = JGL13C.GL_TEXTURE18
actual inline val GL_TEXTURE19: GLenum
    get() = JGL13C.GL_TEXTURE19
actual inline val GL_TEXTURE20: GLenum
    get() = JGL13C.GL_TEXTURE20
actual inline val GL_TEXTURE21: GLenum
    get() = JGL13C.GL_TEXTURE21
actual inline val GL_TEXTURE22: GLenum
    get() = JGL13C.GL_TEXTURE22
actual inline val GL_TEXTURE23: GLenum
    get() = JGL13C.GL_TEXTURE23
actual inline val GL_TEXTURE24: GLenum
    get() = JGL13C.GL_TEXTURE24
actual inline val GL_TEXTURE25: GLenum
    get() = JGL13C.GL_TEXTURE25
actual inline val GL_TEXTURE26: GLenum
    get() = JGL13C.GL_TEXTURE26
actual inline val GL_TEXTURE27: GLenum
    get() = JGL13C.GL_TEXTURE27
actual inline val GL_TEXTURE28: GLenum
    get() = JGL13C.GL_TEXTURE28
actual inline val GL_TEXTURE29: GLenum
    get() = JGL13C.GL_TEXTURE29
actual inline val GL_TEXTURE30: GLenum
    get() = JGL13C.GL_TEXTURE30
actual inline val GL_TEXTURE31: GLenum
    get() = JGL13C.GL_TEXTURE31
actual inline val GL_ACTIVE_TEXTURE: GLenum
    get() = JGL13C.GL_ACTIVE_TEXTURE

actual inline fun GL13.glActiveTexture(
    texture: GLenum
) = JGL13C.glActiveTexture(
    texture
)

actual inline fun GL13.glCompressedTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, data: DataBuffer
) = data.read { buffer ->
    JGL13C.glCompressedTexImage2D(
        target, level, internalformat, width, height, border,
        buffer
    )
}

actual inline fun GL13.glCompressedTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, data: DataBuffer
) = data.read { buffer ->
    JGL13C.glCompressedTexSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        buffer
    )
}

actual inline fun GL13.glSampleCoverage(
    value: GLclampf, invert: GLboolean
) = JGL13C.glSampleCoverage(
    value, invert
)

actual inline fun GL13.glCompressedTexImage3D(
    target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, srcData: DataBuffer
) = srcData.read { buffer ->
    JGL13C.glCompressedTexImage3D(
        target, level, internalformat, width, height, depth, border, buffer
    )
}

actual inline fun GL13.glCompressedTexSubImage3D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, srcData: DataBuffer
) = srcData.read { buffer ->
    JGL13C.glCompressedTexSubImage3D(
        target, level, xoffset, yoffset, zoffset, width, height, depth,
        format, buffer
    )
}
