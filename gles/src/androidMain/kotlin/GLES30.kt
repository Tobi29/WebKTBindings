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

package net.gitout.ktbindings.gles

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.readOrNull
import net.gitout.ktbindings.utils.write
import java.nio.ByteBuffer
import android.opengl.GLES30 as JGLES30

actual inline val GL_READ_BUFFER: GLenum
    get() = JGLES30.GL_READ_BUFFER
actual inline val GL_UNPACK_ROW_LENGTH: GLenum
    get() = JGLES30.GL_UNPACK_ROW_LENGTH
actual inline val GL_UNPACK_SKIP_ROWS: GLenum
    get() = JGLES30.GL_UNPACK_SKIP_ROWS
actual inline val GL_UNPACK_SKIP_PIXELS: GLenum
    get() = JGLES30.GL_UNPACK_SKIP_PIXELS
actual inline val GL_PACK_ROW_LENGTH: GLenum
    get() = JGLES30.GL_PACK_ROW_LENGTH
actual inline val GL_PACK_SKIP_ROWS: GLenum
    get() = JGLES30.GL_PACK_SKIP_ROWS
actual inline val GL_PACK_SKIP_PIXELS: GLenum
    get() = JGLES30.GL_PACK_SKIP_PIXELS
actual inline val GL_COLOR: GLenum
    get() = JGLES30.GL_COLOR
actual inline val GL_DEPTH: GLenum
    get() = JGLES30.GL_DEPTH
actual inline val GL_STENCIL: GLenum
    get() = JGLES30.GL_STENCIL
actual inline val GL_RED: GLenum
    get() = JGLES30.GL_RED
actual inline val GL_RGB8: GLenum
    get() = JGLES30.GL_RGB8
actual inline val GL_RGBA8: GLenum
    get() = JGLES30.GL_RGBA8
actual inline val GL_RGB10_A2: GLenum
    get() = JGLES30.GL_RGB10_A2
actual inline val GL_TEXTURE_BINDING_3D: GLenum
    get() = JGLES30.GL_TEXTURE_BINDING_3D
actual inline val GL_UNPACK_SKIP_IMAGES: GLenum
    get() = JGLES30.GL_UNPACK_SKIP_IMAGES
actual inline val GL_UNPACK_IMAGE_HEIGHT: GLenum
    get() = JGLES30.GL_UNPACK_IMAGE_HEIGHT
actual inline val GL_TEXTURE_3D: GLenum
    get() = JGLES30.GL_TEXTURE_3D
actual inline val GL_TEXTURE_WRAP_R: GLenum
    get() = JGLES30.GL_TEXTURE_WRAP_R
actual inline val GL_MAX_3D_TEXTURE_SIZE: GLenum
    get() = JGLES30.GL_MAX_3D_TEXTURE_SIZE
actual inline val GL_UNSIGNED_INT_2_10_10_10_REV: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_2_10_10_10_REV
actual inline val GL_MAX_ELEMENTS_VERTICES: GLenum
    get() = JGLES30.GL_MAX_ELEMENTS_VERTICES
actual inline val GL_MAX_ELEMENTS_INDICES: GLenum
    get() = JGLES30.GL_MAX_ELEMENTS_INDICES
actual inline val GL_TEXTURE_MIN_LOD: GLenum
    get() = JGLES30.GL_TEXTURE_MIN_LOD
actual inline val GL_TEXTURE_MAX_LOD: GLenum
    get() = JGLES30.GL_TEXTURE_MAX_LOD
actual inline val GL_TEXTURE_BASE_LEVEL: GLenum
    get() = JGLES30.GL_TEXTURE_BASE_LEVEL
actual inline val GL_TEXTURE_MAX_LEVEL: GLenum
    get() = JGLES30.GL_TEXTURE_MAX_LEVEL
actual inline val GL_MIN: GLenum
    get() = JGLES30.GL_MIN
actual inline val GL_MAX: GLenum
    get() = JGLES30.GL_MAX
actual inline val GL_DEPTH_COMPONENT24: GLenum
    get() = JGLES30.GL_DEPTH_COMPONENT24
actual inline val GL_MAX_TEXTURE_LOD_BIAS: GLenum
    get() = JGLES30.GL_MAX_TEXTURE_LOD_BIAS
actual inline val GL_TEXTURE_COMPARE_MODE: GLenum
    get() = JGLES30.GL_TEXTURE_COMPARE_MODE
actual inline val GL_TEXTURE_COMPARE_FUNC: GLenum
    get() = JGLES30.GL_TEXTURE_COMPARE_FUNC
actual inline val GL_CURRENT_QUERY: GLenum
    get() = JGLES30.GL_CURRENT_QUERY
actual inline val GL_QUERY_RESULT: GLenum
    get() = JGLES30.GL_QUERY_RESULT
actual inline val GL_QUERY_RESULT_AVAILABLE: GLenum
    get() = JGLES30.GL_QUERY_RESULT_AVAILABLE
actual inline val GL_STREAM_READ: GLenum
    get() = JGLES30.GL_STREAM_READ
actual inline val GL_STREAM_COPY: GLenum
    get() = JGLES30.GL_STREAM_COPY
actual inline val GL_STATIC_READ: GLenum
    get() = JGLES30.GL_STATIC_READ
actual inline val GL_STATIC_COPY: GLenum
    get() = JGLES30.GL_STATIC_COPY
actual inline val GL_DYNAMIC_READ: GLenum
    get() = JGLES30.GL_DYNAMIC_READ
actual inline val GL_DYNAMIC_COPY: GLenum
    get() = JGLES30.GL_DYNAMIC_COPY
actual inline val GL_MAX_DRAW_BUFFERS: GLenum
    get() = JGLES30.GL_MAX_DRAW_BUFFERS
actual inline val GL_DRAW_BUFFER0: GLenum
    get() = JGLES30.GL_DRAW_BUFFER0
actual inline val GL_DRAW_BUFFER1: GLenum
    get() = JGLES30.GL_DRAW_BUFFER1
actual inline val GL_DRAW_BUFFER2: GLenum
    get() = JGLES30.GL_DRAW_BUFFER2
actual inline val GL_DRAW_BUFFER3: GLenum
    get() = JGLES30.GL_DRAW_BUFFER3
actual inline val GL_DRAW_BUFFER4: GLenum
    get() = JGLES30.GL_DRAW_BUFFER4
actual inline val GL_DRAW_BUFFER5: GLenum
    get() = JGLES30.GL_DRAW_BUFFER5
actual inline val GL_DRAW_BUFFER6: GLenum
    get() = JGLES30.GL_DRAW_BUFFER6
actual inline val GL_DRAW_BUFFER7: GLenum
    get() = JGLES30.GL_DRAW_BUFFER7
actual inline val GL_DRAW_BUFFER8: GLenum
    get() = JGLES30.GL_DRAW_BUFFER8
actual inline val GL_DRAW_BUFFER9: GLenum
    get() = JGLES30.GL_DRAW_BUFFER9
actual inline val GL_DRAW_BUFFER10: GLenum
    get() = JGLES30.GL_DRAW_BUFFER10
actual inline val GL_DRAW_BUFFER11: GLenum
    get() = JGLES30.GL_DRAW_BUFFER11
actual inline val GL_DRAW_BUFFER12: GLenum
    get() = JGLES30.GL_DRAW_BUFFER12
actual inline val GL_DRAW_BUFFER13: GLenum
    get() = JGLES30.GL_DRAW_BUFFER13
actual inline val GL_DRAW_BUFFER14: GLenum
    get() = JGLES30.GL_DRAW_BUFFER14
actual inline val GL_DRAW_BUFFER15: GLenum
    get() = JGLES30.GL_DRAW_BUFFER15
actual inline val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_SAMPLER_3D: GLenum
    get() = JGLES30.GL_SAMPLER_3D
actual inline val GL_SAMPLER_2D_SHADOW: GLenum
    get() = JGLES30.GL_SAMPLER_2D_SHADOW
actual inline val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
    get() = JGLES30.GL_FRAGMENT_SHADER_DERIVATIVE_HINT
actual inline val GL_PIXEL_PACK_BUFFER: GLenum
    get() = JGLES30.GL_PIXEL_PACK_BUFFER
actual inline val GL_PIXEL_UNPACK_BUFFER: GLenum
    get() = JGLES30.GL_PIXEL_UNPACK_BUFFER
actual inline val GL_PIXEL_PACK_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_PIXEL_PACK_BUFFER_BINDING
actual inline val GL_PIXEL_UNPACK_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_PIXEL_UNPACK_BUFFER_BINDING
actual inline val GL_FLOAT_MAT2x3: GLenum
    get() = JGLES30.GL_FLOAT_MAT2x3
actual inline val GL_FLOAT_MAT2x4: GLenum
    get() = JGLES30.GL_FLOAT_MAT2x4
actual inline val GL_FLOAT_MAT3x2: GLenum
    get() = JGLES30.GL_FLOAT_MAT3x2
actual inline val GL_FLOAT_MAT3x4: GLenum
    get() = JGLES30.GL_FLOAT_MAT3x4
actual inline val GL_FLOAT_MAT4x2: GLenum
    get() = JGLES30.GL_FLOAT_MAT4x2
actual inline val GL_FLOAT_MAT4x3: GLenum
    get() = JGLES30.GL_FLOAT_MAT4x3
actual inline val GL_SRGB: GLenum
    get() = JGLES30.GL_SRGB
actual inline val GL_SRGB8: GLenum
    get() = JGLES30.GL_SRGB8
actual inline val GL_SRGB8_ALPHA8: GLenum
    get() = JGLES30.GL_SRGB8_ALPHA8
actual inline val GL_COMPARE_REF_TO_TEXTURE: GLenum
    get() = JGLES30.GL_COMPARE_REF_TO_TEXTURE
actual inline val GL_RGBA32F: GLenum
    get() = JGLES30.GL_RGBA32F
actual inline val GL_RGB32F: GLenum
    get() = JGLES30.GL_RGB32F
actual inline val GL_RGBA16F: GLenum
    get() = JGLES30.GL_RGBA16F
actual inline val GL_RGB16F: GLenum
    get() = JGLES30.GL_RGB16F
actual inline val GL_VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
    get() = JGLES30.GL_VERTEX_ATTRIB_ARRAY_INTEGER
actual inline val GL_MAX_ARRAY_TEXTURE_LAYERS: GLenum
    get() = JGLES30.GL_MAX_ARRAY_TEXTURE_LAYERS
actual inline val GL_MIN_PROGRAM_TEXEL_OFFSET: GLenum
    get() = JGLES30.GL_MIN_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_PROGRAM_TEXEL_OFFSET: GLenum
    get() = JGLES30.GL_MAX_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_VARYING_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_VARYING_COMPONENTS
actual inline val GL_TEXTURE_2D_ARRAY: GLenum
    get() = JGLES30.GL_TEXTURE_2D_ARRAY
actual inline val GL_TEXTURE_BINDING_2D_ARRAY: GLenum
    get() = JGLES30.GL_TEXTURE_BINDING_2D_ARRAY
actual inline val GL_R11F_G11F_B10F: GLenum
    get() = JGLES30.GL_R11F_G11F_B10F
actual inline val GL_UNSIGNED_INT_10F_11F_11F_REV: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_10F_11F_11F_REV
actual inline val GL_RGB9_E5: GLenum
    get() = JGLES30.GL_RGB9_E5
actual inline val GL_UNSIGNED_INT_5_9_9_9_REV: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_5_9_9_9_REV
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BUFFER_MODE
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS
actual inline val GL_TRANSFORM_FEEDBACK_VARYINGS: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_VARYINGS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_START: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BUFFER_START
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BUFFER_SIZE
actual inline val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN
actual inline val GL_RASTERIZER_DISCARD: GLenum
    get() = JGLES30.GL_RASTERIZER_DISCARD
actual inline val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
    get() = JGLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS
actual inline val GL_INTERLEAVED_ATTRIBS: GLenum
    get() = JGLES30.GL_INTERLEAVED_ATTRIBS
actual inline val GL_SEPARATE_ATTRIBS: GLenum
    get() = JGLES30.GL_SEPARATE_ATTRIBS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BUFFER
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING
actual inline val GL_RGBA32UI: GLenum
    get() = JGLES30.GL_RGBA32UI
actual inline val GL_RGB32UI: GLenum
    get() = JGLES30.GL_RGB32UI
actual inline val GL_RGBA16UI: GLenum
    get() = JGLES30.GL_RGBA16UI
actual inline val GL_RGB16UI: GLenum
    get() = JGLES30.GL_RGB16UI
actual inline val GL_RGBA8UI: GLenum
    get() = JGLES30.GL_RGBA8UI
actual inline val GL_RGB8UI: GLenum
    get() = JGLES30.GL_RGB8UI
actual inline val GL_RGBA32I: GLenum
    get() = JGLES30.GL_RGBA32I
actual inline val GL_RGB32I: GLenum
    get() = JGLES30.GL_RGB32I
actual inline val GL_RGBA16I: GLenum
    get() = JGLES30.GL_RGBA16I
actual inline val GL_RGB16I: GLenum
    get() = JGLES30.GL_RGB16I
actual inline val GL_RGBA8I: GLenum
    get() = JGLES30.GL_RGBA8I
actual inline val GL_RGB8I: GLenum
    get() = JGLES30.GL_RGB8I
actual inline val GL_RED_INTEGER: GLenum
    get() = JGLES30.GL_RED_INTEGER
actual inline val GL_RGB_INTEGER: GLenum
    get() = JGLES30.GL_RGB_INTEGER
actual inline val GL_RGBA_INTEGER: GLenum
    get() = JGLES30.GL_RGBA_INTEGER
actual inline val GL_SAMPLER_2D_ARRAY: GLenum
    get() = JGLES30.GL_SAMPLER_2D_ARRAY
actual inline val GL_SAMPLER_2D_ARRAY_SHADOW: GLenum
    get() = JGLES30.GL_SAMPLER_2D_ARRAY_SHADOW
actual inline val GL_SAMPLER_CUBE_SHADOW: GLenum
    get() = JGLES30.GL_SAMPLER_CUBE_SHADOW
actual inline val GL_UNSIGNED_INT_VEC2: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_VEC2
actual inline val GL_UNSIGNED_INT_VEC3: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_VEC3
actual inline val GL_UNSIGNED_INT_VEC4: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_VEC4
actual inline val GL_INT_SAMPLER_2D: GLenum
    get() = JGLES30.GL_INT_SAMPLER_2D
actual inline val GL_INT_SAMPLER_3D: GLenum
    get() = JGLES30.GL_INT_SAMPLER_3D
actual inline val GL_INT_SAMPLER_CUBE: GLenum
    get() = JGLES30.GL_INT_SAMPLER_CUBE
actual inline val GL_INT_SAMPLER_2D_ARRAY: GLenum
    get() = JGLES30.GL_INT_SAMPLER_2D_ARRAY
actual inline val GL_UNSIGNED_INT_SAMPLER_2D: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_SAMPLER_2D
actual inline val GL_UNSIGNED_INT_SAMPLER_3D: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_SAMPLER_3D
actual inline val GL_UNSIGNED_INT_SAMPLER_CUBE: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_SAMPLER_CUBE
actual inline val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY
actual inline val GL_DEPTH_COMPONENT32F: GLenum
    get() = JGLES30.GL_DEPTH_COMPONENT32F
actual inline val GL_DEPTH32F_STENCIL8: GLenum
    get() = JGLES30.GL_DEPTH32F_STENCIL8
actual inline val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
    get() = JGLES30.GL_FLOAT_32_UNSIGNED_INT_24_8_REV
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_DEFAULT: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_DEFAULT
actual inline val GL_DEPTH_STENCIL_ATTACHMENT: GLenum
    get() = JGLES30.GL_DEPTH_STENCIL_ATTACHMENT
actual inline val GL_DEPTH_STENCIL: GLenum
    get() = JGLES30.GL_DEPTH_STENCIL
actual inline val GL_UNSIGNED_INT_24_8: GLenum
    get() = JGLES30.GL_UNSIGNED_INT_24_8
actual inline val GL_DEPTH24_STENCIL8: GLenum
    get() = JGLES30.GL_DEPTH24_STENCIL8
actual inline val GL_UNSIGNED_NORMALIZED: GLenum
    get() = JGLES30.GL_UNSIGNED_NORMALIZED
actual inline val GL_DRAW_FRAMEBUFFER_BINDING: GLenum
    get() = JGLES30.GL_DRAW_FRAMEBUFFER_BINDING
actual inline val GL_READ_FRAMEBUFFER: GLenum
    get() = JGLES30.GL_READ_FRAMEBUFFER
actual inline val GL_DRAW_FRAMEBUFFER: GLenum
    get() = JGLES30.GL_DRAW_FRAMEBUFFER
actual inline val GL_READ_FRAMEBUFFER_BINDING: GLenum
    get() = JGLES30.GL_READ_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_SAMPLES: GLenum
    get() = JGLES30.GL_RENDERBUFFER_SAMPLES
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER
actual inline val GL_MAX_COLOR_ATTACHMENTS: GLenum
    get() = JGLES30.GL_MAX_COLOR_ATTACHMENTS
actual inline val GL_COLOR_ATTACHMENT1: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT1
actual inline val GL_COLOR_ATTACHMENT2: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT2
actual inline val GL_COLOR_ATTACHMENT3: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT3
actual inline val GL_COLOR_ATTACHMENT4: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT4
actual inline val GL_COLOR_ATTACHMENT5: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT5
actual inline val GL_COLOR_ATTACHMENT6: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT6
actual inline val GL_COLOR_ATTACHMENT7: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT7
actual inline val GL_COLOR_ATTACHMENT8: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT8
actual inline val GL_COLOR_ATTACHMENT9: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT9
actual inline val GL_COLOR_ATTACHMENT10: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT10
actual inline val GL_COLOR_ATTACHMENT11: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT11
actual inline val GL_COLOR_ATTACHMENT12: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT12
actual inline val GL_COLOR_ATTACHMENT13: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT13
actual inline val GL_COLOR_ATTACHMENT14: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT14
actual inline val GL_COLOR_ATTACHMENT15: GLenum
    get() = JGLES30.GL_COLOR_ATTACHMENT15
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
    get() = JGLES30.GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE
actual inline val GL_MAX_SAMPLES: GLenum
    get() = JGLES30.GL_MAX_SAMPLES
actual inline val GL_HALF_FLOAT: GLenum
    get() = JGLES30.GL_HALF_FLOAT
actual inline val GL_RG: GLenum
    get() = JGLES30.GL_RG
actual inline val GL_RG_INTEGER: GLenum
    get() = JGLES30.GL_RG_INTEGER
actual inline val GL_R8: GLenum
    get() = JGLES30.GL_R8
actual inline val GL_RG8: GLenum
    get() = JGLES30.GL_RG8
actual inline val GL_R16F: GLenum
    get() = JGLES30.GL_R16F
actual inline val GL_R32F: GLenum
    get() = JGLES30.GL_R32F
actual inline val GL_RG16F: GLenum
    get() = JGLES30.GL_RG16F
actual inline val GL_RG32F: GLenum
    get() = JGLES30.GL_RG32F
actual inline val GL_R8I: GLenum
    get() = JGLES30.GL_R8I
actual inline val GL_R8UI: GLenum
    get() = JGLES30.GL_R8UI
actual inline val GL_R16I: GLenum
    get() = JGLES30.GL_R16I
actual inline val GL_R16UI: GLenum
    get() = JGLES30.GL_R16UI
actual inline val GL_R32I: GLenum
    get() = JGLES30.GL_R32I
actual inline val GL_R32UI: GLenum
    get() = JGLES30.GL_R32UI
actual inline val GL_RG8I: GLenum
    get() = JGLES30.GL_RG8I
actual inline val GL_RG8UI: GLenum
    get() = JGLES30.GL_RG8UI
actual inline val GL_RG16I: GLenum
    get() = JGLES30.GL_RG16I
actual inline val GL_RG16UI: GLenum
    get() = JGLES30.GL_RG16UI
actual inline val GL_RG32I: GLenum
    get() = JGLES30.GL_RG32I
actual inline val GL_RG32UI: GLenum
    get() = JGLES30.GL_RG32UI
actual inline val GL_VERTEX_ARRAY_BINDING: GLenum
    get() = JGLES30.GL_VERTEX_ARRAY_BINDING
actual inline val GL_R8_SNORM: GLenum
    get() = JGLES30.GL_R8_SNORM
actual inline val GL_RG8_SNORM: GLenum
    get() = JGLES30.GL_RG8_SNORM
actual inline val GL_RGB8_SNORM: GLenum
    get() = JGLES30.GL_RGB8_SNORM
actual inline val GL_RGBA8_SNORM: GLenum
    get() = JGLES30.GL_RGBA8_SNORM
actual inline val GL_SIGNED_NORMALIZED: GLenum
    get() = JGLES30.GL_SIGNED_NORMALIZED
actual inline val GL_COPY_READ_BUFFER: GLenum
    get() = JGLES30.GL_COPY_READ_BUFFER
actual inline val GL_COPY_WRITE_BUFFER: GLenum
    get() = JGLES30.GL_COPY_WRITE_BUFFER
actual inline val GL_COPY_READ_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_COPY_READ_BUFFER_BINDING
actual inline val GL_COPY_WRITE_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_COPY_WRITE_BUFFER_BINDING
actual inline val GL_UNIFORM_BUFFER: GLenum
    get() = JGLES30.GL_UNIFORM_BUFFER
actual inline val GL_UNIFORM_BUFFER_BINDING: GLenum
    get() = JGLES30.GL_UNIFORM_BUFFER_BINDING
actual inline val GL_UNIFORM_BUFFER_START: GLenum
    get() = JGLES30.GL_UNIFORM_BUFFER_START
actual inline val GL_UNIFORM_BUFFER_SIZE: GLenum
    get() = JGLES30.GL_UNIFORM_BUFFER_SIZE
actual inline val GL_MAX_VERTEX_UNIFORM_BLOCKS: GLenum
    get() = JGLES30.GL_MAX_VERTEX_UNIFORM_BLOCKS
actual inline val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
    get() = JGLES30.GL_MAX_FRAGMENT_UNIFORM_BLOCKS
actual inline val GL_MAX_COMBINED_UNIFORM_BLOCKS: GLenum
    get() = JGLES30.GL_MAX_COMBINED_UNIFORM_BLOCKS
actual inline val GL_MAX_UNIFORM_BUFFER_BINDINGS: GLenum
    get() = JGLES30.GL_MAX_UNIFORM_BUFFER_BINDINGS
actual inline val GL_MAX_UNIFORM_BLOCK_SIZE: GLenum
    get() = JGLES30.GL_MAX_UNIFORM_BLOCK_SIZE
actual inline val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS
actual inline val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS
actual inline val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
    get() = JGLES30.GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT
actual inline val GL_ACTIVE_UNIFORM_BLOCKS: GLenum
    get() = JGLES30.GL_ACTIVE_UNIFORM_BLOCKS
actual inline val GL_UNIFORM_TYPE: GLenum
    get() = JGLES30.GL_UNIFORM_TYPE
actual inline val GL_UNIFORM_SIZE: GLenum
    get() = JGLES30.GL_UNIFORM_SIZE
actual inline val GL_UNIFORM_BLOCK_INDEX: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_INDEX
actual inline val GL_UNIFORM_OFFSET: GLenum
    get() = JGLES30.GL_UNIFORM_OFFSET
actual inline val GL_UNIFORM_ARRAY_STRIDE: GLenum
    get() = JGLES30.GL_UNIFORM_ARRAY_STRIDE
actual inline val GL_UNIFORM_MATRIX_STRIDE: GLenum
    get() = JGLES30.GL_UNIFORM_MATRIX_STRIDE
actual inline val GL_UNIFORM_IS_ROW_MAJOR: GLenum
    get() = JGLES30.GL_UNIFORM_IS_ROW_MAJOR
actual inline val GL_UNIFORM_BLOCK_BINDING: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_BINDING
actual inline val GL_UNIFORM_BLOCK_DATA_SIZE: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_DATA_SIZE
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS
actual inline val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER
actual inline val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
    get() = JGLES30.GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER
actual inline val GL_INVALID_INDEX: GLenum
    get() = JGLES30.GL_INVALID_INDEX
actual inline val GL_MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_VERTEX_OUTPUT_COMPONENTS
actual inline val GL_MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
    get() = JGLES30.GL_MAX_FRAGMENT_INPUT_COMPONENTS
actual inline val GL_MAX_SERVER_WAIT_TIMEOUT: GLenum
    get() = JGLES30.GL_MAX_SERVER_WAIT_TIMEOUT
actual inline val GL_OBJECT_TYPE: GLenum
    get() = JGLES30.GL_OBJECT_TYPE
actual inline val GL_SYNC_CONDITION: GLenum
    get() = JGLES30.GL_SYNC_CONDITION
actual inline val GL_SYNC_STATUS: GLenum
    get() = JGLES30.GL_SYNC_STATUS
actual inline val GL_SYNC_FLAGS: GLenum
    get() = JGLES30.GL_SYNC_FLAGS
actual inline val GL_SYNC_FENCE: GLenum
    get() = JGLES30.GL_SYNC_FENCE
actual inline val GL_SYNC_GPU_COMMANDS_COMPLETE: GLenum
    get() = JGLES30.GL_SYNC_GPU_COMMANDS_COMPLETE
actual inline val GL_UNSIGNALED: GLenum
    get() = JGLES30.GL_UNSIGNALED
actual inline val GL_SIGNALED: GLenum
    get() = JGLES30.GL_SIGNALED
actual inline val GL_ALREADY_SIGNALED: GLenum
    get() = JGLES30.GL_ALREADY_SIGNALED
actual inline val GL_TIMEOUT_EXPIRED: GLenum
    get() = JGLES30.GL_TIMEOUT_EXPIRED
actual inline val GL_CONDITION_SATISFIED: GLenum
    get() = JGLES30.GL_CONDITION_SATISFIED
actual inline val GL_WAIT_FAILED: GLenum
    get() = JGLES30.GL_WAIT_FAILED
actual inline val GL_SYNC_FLUSH_COMMANDS_BIT: GLenum
    get() = JGLES30.GL_SYNC_FLUSH_COMMANDS_BIT
actual inline val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
    get() = JGLES30.GL_VERTEX_ATTRIB_ARRAY_DIVISOR
actual inline val GL_ANY_SAMPLES_PASSED: GLenum
    get() = JGLES30.GL_ANY_SAMPLES_PASSED
actual inline val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
    get() = JGLES30.GL_ANY_SAMPLES_PASSED_CONSERVATIVE
actual inline val GL_SAMPLER_BINDING: GLenum
    get() = JGLES30.GL_SAMPLER_BINDING
actual inline val GL_RGB10_A2UI: GLenum
    get() = JGLES30.GL_RGB10_A2UI
actual inline val GL_INT_2_10_10_10_REV: GLenum
    get() = JGLES30.GL_INT_2_10_10_10_REV
actual inline val GL_TRANSFORM_FEEDBACK: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK
actual inline val GL_TRANSFORM_FEEDBACK_PAUSED: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_PAUSED
actual inline val GL_TRANSFORM_FEEDBACK_ACTIVE: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_ACTIVE
actual inline val GL_TRANSFORM_FEEDBACK_BINDING: GLenum
    get() = JGLES30.GL_TRANSFORM_FEEDBACK_BINDING
actual inline val GL_TEXTURE_IMMUTABLE_FORMAT: GLenum
    get() = JGLES30.GL_TEXTURE_IMMUTABLE_FORMAT
actual inline val GL_MAX_ELEMENT_INDEX: GLenum
    get() = JGLES30.GL_MAX_ELEMENT_INDEX
actual inline val GL_TEXTURE_IMMUTABLE_LEVELS: GLenum
    get() = JGLES30.GL_TEXTURE_IMMUTABLE_LEVELS
actual inline val GL_TIMEOUT_IGNORED: GLint64
    get() = JGLES30.GL_TIMEOUT_IGNORED

actual inline fun GLES30.glCopyBufferSubData(
    readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr,
    writeOffset: GLintptr, size: GLsizeiptr
) = JGLES30.glCopyBufferSubData(
    readTarget, writeTarget, readOffset.toInt(),
    writeOffset.toInt(), size.toInt()
)

actual inline fun GLES30.glGetBufferSubData(
    target: GLenum, srcByteOffset: GLintptr, dstData: DataBuffer,
    dstOffset: GLuint, length: GLuint
) = dstData.write { buffer ->
    val mapped = JGLES30.glMapBufferRange(
        target, srcByteOffset.toInt(), length.toInt(),
        JGLES30.GL_MAP_READ_BIT
    ) ?: return
    mapped as ByteBuffer
    buffer.duplicate().put(mapped)
    JGLES30.glUnmapBuffer(target)
    Unit
}

actual inline fun GLES30.glBlitFramebuffer(
    srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint,
    dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint,
    mask: GLbitfield, filter: GLenum
) = JGLES30.glBlitFramebuffer(
    srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1,
    mask, filter
)

actual inline fun GLES30.glFramebufferTextureLayer(
    target: GLenum, attachment: GLenum, texture: GLTexture, level: GLint,
    layer: GLint
) = JGLES30.glFramebufferTextureLayer(
    target, attachment, texture, level, layer
)

actual inline fun GLES30.glInvalidateFramebuffer(
    target: GLenum, attachments: sequence_GLenum
) = JGLES30.glInvalidateFramebuffer(
    target, attachments.size, attachments, 0
)

actual inline fun GLES30.glInvalidateSubFramebuffer(
    target: GLenum, attachments: sequence_GLenum,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGLES30.glInvalidateSubFramebuffer(
    target, attachments.size, attachments, 0, x, y, width, height
)

actual inline fun GLES30.glReadBuffer(
    src: GLenum
) = JGLES30.glReadBuffer(
    src
)

actual inline fun GLES30.glGetInternalformativ(
    target: GLenum, internalformat: GLenum, pname: GLenum,
    params: sequence_GLint
) = JGLES30.glGetInternalformativ(
    target, internalformat, pname, params.size, params, 0
)

actual inline fun GLES30.glRenderbufferStorageMultisample(
    target: GLenum, samples: GLsizei, internalformat: GLenum,
    width: GLsizei, height: GLsizei
) = JGLES30.glRenderbufferStorageMultisample(
    target, samples, internalformat, width, height
)

actual inline fun GLES30.glTexStorage2D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei
) = JGLES30.glTexStorage2D(
    target, levels, internalformat, width, height
)

actual inline fun GLES30.glTexStorage3D(
    target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei
) = JGLES30.glTexStorage3D(
    target, levels, internalformat, width, height, depth
)

actual inline fun GLES30.glTexImage3D(
    target: GLenum, level: GLint, internalformat: GLint, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, format: GLenum,
    type: GLenum, srcData: DataBuffer?
) = srcData.readOrNull { buffer ->
    JGLES30.glTexImage3D(
        target, level, internalformat, width, height, depth, border,
        format, type, buffer
    )
}

actual inline fun GLES30.glTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, type: GLenum, srcData: DataBuffer
) = srcData.read { buffer ->
    JGLES30.glTexSubImage3D(
        target, level, xoffset, yoffset, zoffset, width, height, depth,
        format, type, buffer
    )
}

actual inline fun GLES30.glCopyTexSubImage3D(
    target: GLenum, level: GLint,
    xoffset: GLint, yoffset: GLint, zoffset: GLint,
    x: GLint, y: GLint,
    width: GLsizei, height: GLsizei
) = JGLES30.glCopyTexSubImage3D(
    target, level, xoffset, yoffset, zoffset, x, y, width, height
)

actual inline fun GLES30.glCompressedTexImage3D(
    target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei,
    height: GLsizei, depth: GLsizei, border: GLint, srcData: DataBuffer
) = srcData.read { buffer ->
    JGLES30.glCompressedTexImage3D(
        target, level, internalformat, width, height, depth, border,
        buffer.remaining(), buffer
    )
}

actual inline fun GLES30.glCompressedTexSubImage3D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei,
    format: GLenum, srcData: DataBuffer
) = srcData.read { buffer ->
    JGLES30.glCompressedTexSubImage3D(
        target, level, xoffset, yoffset, zoffset, width, height, depth,
        format, buffer.remaining(), buffer
    )
}

actual inline fun GLES30.glGetFragDataLocation(
    program: GLProgram, name: DOMString
) = JGLES30.glGetFragDataLocation(
    program, name
)

actual inline fun GLES30.glUniform1ui(
    location: GLUniformLocation, v0: GLuint
) = JGLES30.glUniform1ui(
    location, v0.toInt()
)

actual inline fun GLES30.glUniform2ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint
) = JGLES30.glUniform2ui(
    location, v0.toInt(), v1.toInt()
)

actual inline fun GLES30.glUniform3ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint
) = JGLES30.glUniform3ui(
    location, v0.toInt(), v1.toInt(), v2.toInt()
)

actual inline fun GLES30.glUniform4ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint
) = JGLES30.glUniform4ui(
    location, v0.toInt(), v1.toInt(), v2.toInt(), v3.toInt()
)

actual inline fun GLES30.glUniformMatrix3x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix3x2fv(
    location, data.size / 6, transpose, data, 0
)

actual inline fun GLES30.glUniformMatrix4x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix4x2fv(
    location, data.size / 8, transpose, data, 0
)

actual inline fun GLES30.glUniformMatrix2x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix2x3fv(
    location, data.size / 6, transpose, data, 0
)

actual inline fun GLES30.glUniformMatrix4x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix4x3fv(
    location, data.size / 12, transpose, data, 0
)

actual inline fun GLES30.glUniformMatrix2x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix2x4fv(
    location, data.size / 8, transpose, data, 0
)

actual inline fun GLES30.glUniformMatrix3x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
) = JGLES30.glUniformMatrix3x4fv(
    location, data.size / 12, transpose, data, 0
)

actual inline fun GLES30.glVertexAttribI4i(
    index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint
) = JGLES30.glVertexAttribI4i(
    index.toInt(), x, y, z, w
)

actual inline fun GLES30.glVertexAttribI4iv(
    index: GLuint, values: Int32List
) = JGLES30.glVertexAttribI4iv(
    index.toInt(), values, 0
)

actual inline fun GLES30.glVertexAttribI4ui(
    index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint
) = JGLES30.glVertexAttribI4ui(
    index.toInt(), x.toInt(), y.toInt(), z.toInt(), w.toInt()
)

actual inline fun GLES30.glVertexAttribI4uiv(
    index: GLuint, values: Uint32List
) = JGLES30.glVertexAttribI4uiv(
    index.toInt(), values.asIntArray(), 0
)

actual inline fun GLES30.glVertexAttribIPointer(
    index: GLuint, size: GLint, type: GLenum, stride: GLsizei, offset: GLintptr
) = JGLES30.glVertexAttribIPointer(
    index.toInt(), size, type, stride, offset.toInt()
)

actual inline fun GLES30.glVertexAttribDivisor(
    index: GLuint, divisor: GLuint
) = JGLES30.glVertexAttribDivisor(
    index.toInt(), divisor.toInt()
)

actual inline fun GLES30.glDrawArraysInstanced(
    mode: GLenum, first: GLint, count: GLsizei, instanceCount: GLsizei
) = JGLES30.glDrawArraysInstanced(
    mode, first, count, instanceCount
)

actual inline fun GLES30.glDrawElementsInstanced(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr,
    instanceCount: GLsizei
) = JGLES30.glDrawElementsInstanced(
    mode, count, type, offset.toInt(), instanceCount
)

actual inline fun GLES30.glDrawRangeElements(
    mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum,
    offset: GLintptr
) = JGLES30.glDrawRangeElements(
    mode, start.toInt(), end.toInt(), count, type,
    offset.toInt()
)

actual inline fun GLES30.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, offset: GLintptr
) = JGLES30.glReadPixels(
    x, y, width, height, format, type, offset.toInt()
)

actual inline fun GLES30.glDrawBuffers(
    buffers: sequence_GLenum
) = JGLES30.glDrawBuffers(
    buffers.size, buffers, 0
)

actual inline fun GLES30.glClearBufferfv(
    buffer: GLenum, drawbuffer: GLint, values: Float32List
) = JGLES30.glClearBufferfv(
    buffer, drawbuffer, values, 0
)

actual inline fun GLES30.glClearBufferiv(
    buffer: GLenum, drawbuffer: GLint, values: Int32List
) = JGLES30.glClearBufferiv(
    buffer, drawbuffer, values, 0
)

actual inline fun GLES30.glClearBufferuiv(
    buffer: GLenum, drawbuffer: GLint, values: Uint32List
) = JGLES30.glClearBufferuiv(
    buffer, drawbuffer, values.asIntArray(), 0
)

actual inline fun GLES30.glClearBufferfi(
    buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint
) = JGLES30.glClearBufferfi(
    buffer, drawbuffer, depth, stencil
)

actual inline fun GLES30.glCreateQuery(
) = readInts { i0 ->
    JGLES30.glGenQueries(
        1, i0
    )
}

actual inline fun GLES30.glDeleteQuery(
    query: GLQuery
) = intBuffers(query) { i0 ->
    JGLES30.glDeleteQueries(
        1, i0
    )
}

actual inline fun GLES30.glIsQuery(
    query: GLQuery
) = JGLES30.glIsQuery(
    query
)

actual inline fun GLES30.glBeginQuery(
    target: GLenum, query: GLQuery
) = JGLES30.glBeginQuery(
    target, query
)

actual inline fun GLES30.glEndQuery(
    target: GLenum
) = JGLES30.glEndQuery(
    target
)

actual inline fun GLES30.glGetQuery(
    target: GLenum, pname: GLenum
) = readInts { i0 ->
    JGLES30.glGetQueryiv(
        target, pname, i0
    )
}

actual inline fun GLES30.glGetQueryObjectuiv(
    query: GLQuery, pname: GLenum, params: sequence_GLuint
) = JGLES30.glGetQueryObjectuiv(
    query, pname, params.asIntArray(), 0
)

actual inline fun GLES30.glCreateSampler(
) = readInts { i0 ->
    JGLES30.glGenSamplers(
        1, i0
    )
}

actual inline fun GLES30.glDeleteSampler(
    sampler: GLSampler
) = intBuffers(sampler) { i0 ->
    JGLES30.glDeleteSamplers(
        1, i0
    )
}

actual inline fun GLES30.glIsSampler(
    sampler: GLSampler
) = JGLES30.glIsSampler(
    sampler
)

actual inline fun GLES30.glBindSampler(
    unit: GLuint, sampler: GLSampler
) = JGLES30.glBindSampler(
    unit.toInt(), sampler
)

actual inline fun GLES30.glSamplerParameteri(
    sampler: GLSampler, pname: GLenum, param: GLint
) = JGLES30.glSamplerParameteri(
    sampler, pname, param
)

actual inline fun GLES30.glSamplerParameterf(
    sampler: GLSampler, pname: GLenum, param: GLfloat
) = JGLES30.glSamplerParameterf(
    sampler, pname, param
)

actual inline fun GLES30.glGetSamplerParameteriv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLint
) = JGLES30.glGetSamplerParameteriv(
    sampler, pname, params, 0
)

actual inline fun GLES30.glGetSamplerParameterfv(
    sampler: GLSampler, pname: GLenum, params: sequence_GLfloat
) = JGLES30.glGetSamplerParameterfv(
    sampler, pname, params, 0
)

actual inline fun GLES30.glFenceSync(
    condition: GLenum, flags: GLbitfield
) = JGLES30.glFenceSync(
    condition, flags
)

actual inline fun GLES30.glIsSync(
    sync: GLSync
) = JGLES30.glIsSync(
    sync
)

actual inline fun GLES30.glDeleteSync(
    sync: GLSync
) = JGLES30.glDeleteSync(
    sync
)

actual inline fun GLES30.glClientWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLuint64
) = JGLES30.glClientWaitSync(
    sync, flags, timeout.toLong()
)

actual inline fun GLES30.glWaitSync(
    sync: GLSync, flags: GLbitfield, timeout: GLint64
) = JGLES30.glWaitSync(
    sync, flags, timeout
)

actual inline fun GLES30.glGetSynciv(
    sync: GLSync, pname: GLenum, length: sequence_GLsizei,
    values: sequence_GLint
) = JGLES30.glGetSynciv(
    sync, pname, values.size, length, 0, values, 0
)

actual inline fun GLES30.glCreateTransformFeedback(
) = readInts { i0 ->
    JGLES30.glGenTransformFeedbacks(
        1, i0
    )
}

actual inline fun GLES30.glDeleteTransformFeedback(
    tf: GLTransformFeedback
) = intBuffers(tf) { i0 ->
    JGLES30.glDeleteTransformFeedbacks(
        1, i0
    )
}

actual inline fun GLES30.glIsTransformFeedback(
    tf: GLTransformFeedback
) = JGLES30.glIsTransformFeedback(
    tf
)

actual inline fun GLES30.glBindTransformFeedback(
    target: GLenum, tf: GLTransformFeedback
) = JGLES30.glBindTransformFeedback(
    target, tf
)

actual inline fun GLES30.glBeginTransformFeedback(
    primitiveMode: GLenum
) = JGLES30.glBeginTransformFeedback(
    primitiveMode
)

actual inline fun GLES30.glEndTransformFeedback(
) = JGLES30.glEndTransformFeedback(
)

actual inline fun GLES30.glTransformFeedbackVaryings(
    program: GLProgram, varyings: sequence_DOMString, bufferMode: GLenum
) = JGLES30.glTransformFeedbackVaryings(
    program, varyings, bufferMode
)

actual inline fun GLES30.glPauseTransformFeedback(
) = JGLES30.glPauseTransformFeedback(
)

actual inline fun GLES30.glResumeTransformFeedback(
) = JGLES30.glResumeTransformFeedback(
)

actual inline fun GLES30.glBindBufferBase(
    target: GLenum, index: GLuint, buffer: GLBuffer
) = JGLES30.glBindBufferBase(
    target, index.toInt(), buffer
)

actual inline fun GLES30.glBindBufferRange(
    target: GLenum, index: GLuint, buffer: GLBuffer, offset: GLintptr,
    size: GLsizeiptr
) = JGLES30.glBindBufferRange(
    target, index.toInt(), buffer, offset.toInt(), size.toInt()
)

actual inline fun GLES30.glGetUniformIndices(
    program: GLProgram, uniformNames: sequence_DOMString,
    uniformIndices: sequence_GLuint
) = JGLES30.glGetUniformIndices(
    program, uniformNames, uniformIndices.asIntArray(), 0
)

actual inline fun GLES30.glGetActiveUniformsiv(
    program: GLProgram, uniformIndices: sequence_GLuint, pname: GLenum,
    params: sequence_GLint
) = JGLES30.glGetActiveUniformsiv(
    program, uniformIndices.size, uniformIndices.asIntArray(), 0, pname, params,
    0
)

actual inline fun GLES30.glGetUniformBlockIndex(
    program: GLProgram, uniformBlockName: DOMString
) = JGLES30.glGetUniformBlockIndex(
    program, uniformBlockName
).toUInt()

actual inline fun GLES30.glGetActiveUniformBlockiv(
    program: GLProgram, uniformBlockIndex: GLuint, pname: GLenum,
    params: sequence_GLint
) = JGLES30.glGetActiveUniformBlockiv(
    program, uniformBlockIndex.toInt(), pname, params, 0
)

actual inline fun GLES30.glGetActiveUniformBlockName(
    program: GLProgram, uniformBlockIndex: GLuint
) = JGLES30.glGetActiveUniformBlockName(
    program, uniformBlockIndex.toInt()
)

actual inline fun GLES30.glUniformBlockBinding(
    program: GLProgram, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint
) = JGLES30.glUniformBlockBinding(
    program, uniformBlockIndex.toInt(), uniformBlockBinding.toInt()
)

actual inline fun GLES30.glCreateVertexArray(
) = readInts { i0 ->
    JGLES30.glGenVertexArrays(
        1, i0
    )
}

actual inline fun GLES30.glDeleteVertexArray(
    vertexArray: GLVertexArrayObject
) = intBuffers(vertexArray) { i0 ->
    JGLES30.glDeleteVertexArrays(
        1, i0
    )
}

actual inline fun GLES30.glIsVertexArray(
    vertexArray: GLVertexArrayObject
) = JGLES30.glIsVertexArray(
    vertexArray
)

actual inline fun GLES30.glBindVertexArray(
    array: GLVertexArrayObject
) = JGLES30.glBindVertexArray(
    array
)
