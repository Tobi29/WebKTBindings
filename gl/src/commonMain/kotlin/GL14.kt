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

expect val GL_FUNC_ADD: GLenum
expect val GL_FUNC_SUBTRACT: GLenum
expect val GL_FUNC_REVERSE_SUBTRACT: GLenum
expect val GL_BLEND_DST_RGB: GLenum
expect val GL_BLEND_SRC_RGB: GLenum
expect val GL_BLEND_DST_ALPHA: GLenum
expect val GL_BLEND_SRC_ALPHA: GLenum
expect val GL_CONSTANT_COLOR: GLenum
expect val GL_ONE_MINUS_CONSTANT_COLOR: GLenum
expect val GL_CONSTANT_ALPHA: GLenum
expect val GL_ONE_MINUS_CONSTANT_ALPHA: GLenum
expect val GL_INCR_WRAP: GLenum
expect val GL_DECR_WRAP: GLenum
expect val GL_MIRRORED_REPEAT: GLenum
expect val GL_DEPTH_COMPONENT16: GLenum
expect val GL_MIN: GLenum
expect val GL_MAX: GLenum
expect val GL_DEPTH_COMPONENT24: GLenum
expect val GL_MAX_TEXTURE_LOD_BIAS: GLenum
expect val GL_TEXTURE_COMPARE_MODE: GLenum
expect val GL_TEXTURE_COMPARE_FUNC: GLenum

expect fun GL14.glBlendColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
)

expect fun GL14.glBlendEquation(
    mode: GLenum
)

expect fun GL14.glBlendFuncSeparate(
    srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum
)
