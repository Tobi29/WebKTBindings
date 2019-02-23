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

package net.gitout.ktbindings.gl

actual inline val GL_BLEND_EQUATION: GLenum
    get() = platform.OpenGL3.GL_BLEND_EQUATION
actual inline val GL_BLEND_COLOR: GLenum
    get() = platform.OpenGL3.GL_BLEND_COLOR
actual inline val GL_ALIASED_POINT_SIZE_RANGE: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_ALIASED_POINT_SIZE_RANGE */
actual inline val GL_RED_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_RED_BITS */
actual inline val GL_GREEN_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_GREEN_BITS */
actual inline val GL_BLUE_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_BLUE_BITS */
actual inline val GL_ALPHA_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_ALPHA_BITS */
actual inline val GL_DEPTH_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_DEPTH_BITS */
actual inline val GL_STENCIL_BITS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_STENCIL_BITS */
actual inline val GL_GENERATE_MIPMAP_HINT: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_GENERATE_MIPMAP_HINT */
actual inline val GL_LUMINANCE: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_LUMINANCE */
actual inline val GL_LUMINANCE_ALPHA: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_LUMINANCE_ALPHA */
actual inline val GL_TEXTURE: GLenum
    get() = platform.OpenGL3.GL_TEXTURE
actual inline val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    get() = error("Not available") /* platform.OpenGL3.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS */
