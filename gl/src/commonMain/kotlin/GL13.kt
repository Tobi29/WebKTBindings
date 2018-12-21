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

import net.gitout.ktbindings.utils.DataBuffer

expect val GL_SAMPLE_ALPHA_TO_COVERAGE: GLenum
expect val GL_SAMPLE_COVERAGE: GLenum
expect val GL_SAMPLE_BUFFERS: GLenum
expect val GL_SAMPLES: GLenum
expect val GL_SAMPLE_COVERAGE_VALUE: GLenum
expect val GL_SAMPLE_COVERAGE_INVERT: GLenum
expect val GL_TEXTURE_CUBE_MAP: GLenum
expect val GL_TEXTURE_BINDING_CUBE_MAP: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
expect val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
expect val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
expect val GL_MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
expect val GL_TEXTURE0: GLenum
expect val GL_TEXTURE1: GLenum
expect val GL_TEXTURE2: GLenum
expect val GL_TEXTURE3: GLenum
expect val GL_TEXTURE4: GLenum
expect val GL_TEXTURE5: GLenum
expect val GL_TEXTURE6: GLenum
expect val GL_TEXTURE7: GLenum
expect val GL_TEXTURE8: GLenum
expect val GL_TEXTURE9: GLenum
expect val GL_TEXTURE10: GLenum
expect val GL_TEXTURE11: GLenum
expect val GL_TEXTURE12: GLenum
expect val GL_TEXTURE13: GLenum
expect val GL_TEXTURE14: GLenum
expect val GL_TEXTURE15: GLenum
expect val GL_TEXTURE16: GLenum
expect val GL_TEXTURE17: GLenum
expect val GL_TEXTURE18: GLenum
expect val GL_TEXTURE19: GLenum
expect val GL_TEXTURE20: GLenum
expect val GL_TEXTURE21: GLenum
expect val GL_TEXTURE22: GLenum
expect val GL_TEXTURE23: GLenum
expect val GL_TEXTURE24: GLenum
expect val GL_TEXTURE25: GLenum
expect val GL_TEXTURE26: GLenum
expect val GL_TEXTURE27: GLenum
expect val GL_TEXTURE28: GLenum
expect val GL_TEXTURE29: GLenum
expect val GL_TEXTURE30: GLenum
expect val GL_TEXTURE31: GLenum
expect val GL_ACTIVE_TEXTURE: GLenum

expect fun GL13.glActiveTexture(
    texture: GLenum
)

expect fun GL13.glCompressedTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, data: DataBuffer
)

expect fun GL13.glCompressedTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, data: DataBuffer
)

expect fun GL13.glSampleCoverage(
    value: GLclampf, invert: GLboolean
)

expect fun GL13.glCompressedTexImage3D(
    target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, srcData: DataBuffer
)

expect fun GL13.glCompressedTexSubImage3D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, srcData: DataBuffer
)
