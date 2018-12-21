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

/* BlendEquationSeparate */
expect val GL_BLEND_EQUATION: GLenum

/* Separate Blend Functions */
expect val GL_BLEND_COLOR: GLenum

/* GetPName */
expect val GL_ALIASED_POINT_SIZE_RANGE: GLenum
expect val GL_RED_BITS: GLenum
expect val GL_GREEN_BITS: GLenum
expect val GL_BLUE_BITS: GLenum
expect val GL_ALPHA_BITS: GLenum
expect val GL_DEPTH_BITS: GLenum
expect val GL_STENCIL_BITS: GLenum

/* HintTarget */
expect val GL_GENERATE_MIPMAP_HINT: GLenum

/* PixelFormat */
expect val GL_LUMINANCE: GLenum
expect val GL_LUMINANCE_ALPHA: GLenum

/* TextureTarget */
expect val GL_TEXTURE: GLenum

/* Framebuffer Object. */
expect val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
