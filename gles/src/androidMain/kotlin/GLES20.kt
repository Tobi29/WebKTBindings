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

@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.gles

import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.read
import net.gitout.ktbindings.utils.readOrNull
import android.opengl.GLES20 as JGLES20

actual inline val GL_DEPTH_BUFFER_BIT: GLenum
    get() = JGLES20.GL_DEPTH_BUFFER_BIT
actual inline val GL_STENCIL_BUFFER_BIT: GLenum
    get() = JGLES20.GL_STENCIL_BUFFER_BIT
actual inline val GL_COLOR_BUFFER_BIT: GLenum
    get() = JGLES20.GL_COLOR_BUFFER_BIT
actual inline val GL_POINTS: GLenum
    get() = JGLES20.GL_POINTS
actual inline val GL_LINES: GLenum
    get() = JGLES20.GL_LINES
actual inline val GL_LINE_LOOP: GLenum
    get() = JGLES20.GL_LINE_LOOP
actual inline val GL_LINE_STRIP: GLenum
    get() = JGLES20.GL_LINE_STRIP
actual inline val GL_TRIANGLES: GLenum
    get() = JGLES20.GL_TRIANGLES
actual inline val GL_TRIANGLE_STRIP: GLenum
    get() = JGLES20.GL_TRIANGLE_STRIP
actual inline val GL_TRIANGLE_FAN: GLenum
    get() = JGLES20.GL_TRIANGLE_FAN
actual inline val GL_ZERO: GLenum
    get() = JGLES20.GL_ZERO
actual inline val GL_ONE: GLenum
    get() = JGLES20.GL_ONE
actual inline val GL_SRC_COLOR: GLenum
    get() = JGLES20.GL_SRC_COLOR
actual inline val GL_ONE_MINUS_SRC_COLOR: GLenum
    get() = JGLES20.GL_ONE_MINUS_SRC_COLOR
actual inline val GL_SRC_ALPHA: GLenum
    get() = JGLES20.GL_SRC_ALPHA
actual inline val GL_ONE_MINUS_SRC_ALPHA: GLenum
    get() = JGLES20.GL_ONE_MINUS_SRC_ALPHA
actual inline val GL_DST_ALPHA: GLenum
    get() = JGLES20.GL_DST_ALPHA
actual inline val GL_ONE_MINUS_DST_ALPHA: GLenum
    get() = JGLES20.GL_ONE_MINUS_DST_ALPHA
actual inline val GL_DST_COLOR: GLenum
    get() = JGLES20.GL_DST_COLOR
actual inline val GL_ONE_MINUS_DST_COLOR: GLenum
    get() = JGLES20.GL_ONE_MINUS_DST_COLOR
actual inline val GL_SRC_ALPHA_SATURATE: GLenum
    get() = JGLES20.GL_SRC_ALPHA_SATURATE
actual inline val GL_FUNC_ADD: GLenum
    get() = JGLES20.GL_FUNC_ADD
actual inline val GL_BLEND_EQUATION: GLenum
    get() = JGLES20.GL_BLEND_EQUATION
actual inline val GL_BLEND_EQUATION_RGB: GLenum
    get() = JGLES20.GL_BLEND_EQUATION_RGB
actual inline val GL_BLEND_EQUATION_ALPHA: GLenum
    get() = JGLES20.GL_BLEND_EQUATION_ALPHA
actual inline val GL_FUNC_SUBTRACT: GLenum
    get() = JGLES20.GL_FUNC_SUBTRACT
actual inline val GL_FUNC_REVERSE_SUBTRACT: GLenum
    get() = JGLES20.GL_FUNC_REVERSE_SUBTRACT
actual inline val GL_BLEND_DST_RGB: GLenum
    get() = JGLES20.GL_BLEND_DST_RGB
actual inline val GL_BLEND_SRC_RGB: GLenum
    get() = JGLES20.GL_BLEND_SRC_RGB
actual inline val GL_BLEND_DST_ALPHA: GLenum
    get() = JGLES20.GL_BLEND_DST_ALPHA
actual inline val GL_BLEND_SRC_ALPHA: GLenum
    get() = JGLES20.GL_BLEND_SRC_ALPHA
actual inline val GL_CONSTANT_COLOR: GLenum
    get() = JGLES20.GL_CONSTANT_COLOR
actual inline val GL_ONE_MINUS_CONSTANT_COLOR: GLenum
    get() = JGLES20.GL_ONE_MINUS_CONSTANT_COLOR
actual inline val GL_CONSTANT_ALPHA: GLenum
    get() = JGLES20.GL_CONSTANT_ALPHA
actual inline val GL_ONE_MINUS_CONSTANT_ALPHA: GLenum
    get() = JGLES20.GL_ONE_MINUS_CONSTANT_ALPHA
actual inline val GL_BLEND_COLOR: GLenum
    get() = JGLES20.GL_BLEND_COLOR
actual inline val GL_ARRAY_BUFFER: GLenum
    get() = JGLES20.GL_ARRAY_BUFFER
actual inline val GL_ELEMENT_ARRAY_BUFFER: GLenum
    get() = JGLES20.GL_ELEMENT_ARRAY_BUFFER
actual inline val GL_ARRAY_BUFFER_BINDING: GLenum
    get() = JGLES20.GL_ARRAY_BUFFER_BINDING
actual inline val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    get() = JGLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING
actual inline val GL_STREAM_DRAW: GLenum
    get() = JGLES20.GL_STREAM_DRAW
actual inline val GL_STATIC_DRAW: GLenum
    get() = JGLES20.GL_STATIC_DRAW
actual inline val GL_DYNAMIC_DRAW: GLenum
    get() = JGLES20.GL_DYNAMIC_DRAW
actual inline val GL_BUFFER_SIZE: GLenum
    get() = JGLES20.GL_BUFFER_SIZE
actual inline val GL_BUFFER_USAGE: GLenum
    get() = JGLES20.GL_BUFFER_USAGE
actual inline val GL_CURRENT_VERTEX_ATTRIB: GLenum
    get() = JGLES20.GL_CURRENT_VERTEX_ATTRIB
actual inline val GL_FRONT: GLenum
    get() = JGLES20.GL_FRONT
actual inline val GL_BACK: GLenum
    get() = JGLES20.GL_BACK
actual inline val GL_FRONT_AND_BACK: GLenum
    get() = JGLES20.GL_FRONT_AND_BACK
actual inline val GL_CULL_FACE: GLenum
    get() = JGLES20.GL_CULL_FACE
actual inline val GL_BLEND: GLenum
    get() = JGLES20.GL_BLEND
actual inline val GL_DITHER: GLenum
    get() = JGLES20.GL_DITHER
actual inline val GL_STENCIL_TEST: GLenum
    get() = JGLES20.GL_STENCIL_TEST
actual inline val GL_DEPTH_TEST: GLenum
    get() = JGLES20.GL_DEPTH_TEST
actual inline val GL_SCISSOR_TEST: GLenum
    get() = JGLES20.GL_SCISSOR_TEST
actual inline val GL_POLYGON_OFFSET_FILL: GLenum
    get() = JGLES20.GL_POLYGON_OFFSET_FILL
actual inline val GL_SAMPLE_ALPHA_TO_COVERAGE: GLenum
    get() = JGLES20.GL_SAMPLE_ALPHA_TO_COVERAGE
actual inline val GL_SAMPLE_COVERAGE: GLenum
    get() = JGLES20.GL_SAMPLE_COVERAGE
actual inline val GL_NO_ERROR: GLenum
    get() = JGLES20.GL_NO_ERROR
actual inline val GL_INVALID_ENUM: GLenum
    get() = JGLES20.GL_INVALID_ENUM
actual inline val GL_INVALID_VALUE: GLenum
    get() = JGLES20.GL_INVALID_VALUE
actual inline val GL_INVALID_OPERATION: GLenum
    get() = JGLES20.GL_INVALID_OPERATION
actual inline val GL_OUT_OF_MEMORY: GLenum
    get() = JGLES20.GL_OUT_OF_MEMORY
actual inline val GL_CW: GLenum
    get() = JGLES20.GL_CW
actual inline val GL_CCW: GLenum
    get() = JGLES20.GL_CCW
actual inline val GL_LINE_WIDTH: GLenum
    get() = JGLES20.GL_LINE_WIDTH
actual inline val GL_ALIASED_POINT_SIZE_RANGE: GLenum
    get() = JGLES20.GL_ALIASED_POINT_SIZE_RANGE
actual inline val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
    get() = JGLES20.GL_ALIASED_LINE_WIDTH_RANGE
actual inline val GL_CULL_FACE_MODE: GLenum
    get() = JGLES20.GL_CULL_FACE_MODE
actual inline val GL_FRONT_FACE: GLenum
    get() = JGLES20.GL_FRONT_FACE
actual inline val GL_DEPTH_RANGE: GLenum
    get() = JGLES20.GL_DEPTH_RANGE
actual inline val GL_DEPTH_WRITEMASK: GLenum
    get() = JGLES20.GL_DEPTH_WRITEMASK
actual inline val GL_DEPTH_CLEAR_VALUE: GLenum
    get() = JGLES20.GL_DEPTH_CLEAR_VALUE
actual inline val GL_DEPTH_FUNC: GLenum
    get() = JGLES20.GL_DEPTH_FUNC
actual inline val GL_STENCIL_CLEAR_VALUE: GLenum
    get() = JGLES20.GL_STENCIL_CLEAR_VALUE
actual inline val GL_STENCIL_FUNC: GLenum
    get() = JGLES20.GL_STENCIL_FUNC
actual inline val GL_STENCIL_FAIL: GLenum
    get() = JGLES20.GL_STENCIL_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_FAIL: GLenum
    get() = JGLES20.GL_STENCIL_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_PASS: GLenum
    get() = JGLES20.GL_STENCIL_PASS_DEPTH_PASS
actual inline val GL_STENCIL_REF: GLenum
    get() = JGLES20.GL_STENCIL_REF
actual inline val GL_STENCIL_VALUE_MASK: GLenum
    get() = JGLES20.GL_STENCIL_VALUE_MASK
actual inline val GL_STENCIL_WRITEMASK: GLenum
    get() = JGLES20.GL_STENCIL_WRITEMASK
actual inline val GL_STENCIL_BACK_FUNC: GLenum
    get() = JGLES20.GL_STENCIL_BACK_FUNC
actual inline val GL_STENCIL_BACK_FAIL: GLenum
    get() = JGLES20.GL_STENCIL_BACK_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    get() = JGLES20.GL_STENCIL_BACK_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    get() = JGLES20.GL_STENCIL_BACK_PASS_DEPTH_PASS
actual inline val GL_STENCIL_BACK_REF: GLenum
    get() = JGLES20.GL_STENCIL_BACK_REF
actual inline val GL_STENCIL_BACK_VALUE_MASK: GLenum
    get() = JGLES20.GL_STENCIL_BACK_VALUE_MASK
actual inline val GL_STENCIL_BACK_WRITEMASK: GLenum
    get() = JGLES20.GL_STENCIL_BACK_WRITEMASK
actual inline val GL_VIEWPORT: GLenum
    get() = JGLES20.GL_VIEWPORT
actual inline val GL_SCISSOR_BOX: GLenum
    get() = JGLES20.GL_SCISSOR_BOX
actual inline val GL_COLOR_CLEAR_VALUE: GLenum
    get() = JGLES20.GL_COLOR_CLEAR_VALUE
actual inline val GL_COLOR_WRITEMASK: GLenum
    get() = JGLES20.GL_COLOR_WRITEMASK
actual inline val GL_UNPACK_ALIGNMENT: GLenum
    get() = JGLES20.GL_UNPACK_ALIGNMENT
actual inline val GL_PACK_ALIGNMENT: GLenum
    get() = JGLES20.GL_PACK_ALIGNMENT
actual inline val GL_MAX_TEXTURE_SIZE: GLenum
    get() = JGLES20.GL_MAX_TEXTURE_SIZE
actual inline val GL_MAX_VIEWPORT_DIMS: GLenum
    get() = JGLES20.GL_MAX_VIEWPORT_DIMS
actual inline val GL_SUBPIXEL_BITS: GLenum
    get() = JGLES20.GL_SUBPIXEL_BITS
actual inline val GL_RED_BITS: GLenum
    get() = JGLES20.GL_RED_BITS
actual inline val GL_GREEN_BITS: GLenum
    get() = JGLES20.GL_GREEN_BITS
actual inline val GL_BLUE_BITS: GLenum
    get() = JGLES20.GL_BLUE_BITS
actual inline val GL_ALPHA_BITS: GLenum
    get() = JGLES20.GL_ALPHA_BITS
actual inline val GL_DEPTH_BITS: GLenum
    get() = JGLES20.GL_DEPTH_BITS
actual inline val GL_STENCIL_BITS: GLenum
    get() = JGLES20.GL_STENCIL_BITS
actual inline val GL_POLYGON_OFFSET_UNITS: GLenum
    get() = JGLES20.GL_POLYGON_OFFSET_UNITS
actual inline val GL_POLYGON_OFFSET_FACTOR: GLenum
    get() = JGLES20.GL_POLYGON_OFFSET_FACTOR
actual inline val GL_TEXTURE_BINDING_2D: GLenum
    get() = JGLES20.GL_TEXTURE_BINDING_2D
actual inline val GL_SAMPLE_BUFFERS: GLenum
    get() = JGLES20.GL_SAMPLE_BUFFERS
actual inline val GL_SAMPLES: GLenum
    get() = JGLES20.GL_SAMPLES
actual inline val GL_SAMPLE_COVERAGE_VALUE: GLenum
    get() = JGLES20.GL_SAMPLE_COVERAGE_VALUE
actual inline val GL_SAMPLE_COVERAGE_INVERT: GLenum
    get() = JGLES20.GL_SAMPLE_COVERAGE_INVERT
actual inline val GL_DONT_CARE: GLenum
    get() = JGLES20.GL_DONT_CARE
actual inline val GL_FASTEST: GLenum
    get() = JGLES20.GL_FASTEST
actual inline val GL_NICEST: GLenum
    get() = JGLES20.GL_NICEST
actual inline val GL_GENERATE_MIPMAP_HINT: GLenum
    get() = JGLES20.GL_GENERATE_MIPMAP_HINT
actual inline val GL_BYTE: GLenum
    get() = JGLES20.GL_BYTE
actual inline val GL_UNSIGNED_BYTE: GLenum
    get() = JGLES20.GL_UNSIGNED_BYTE
actual inline val GL_SHORT: GLenum
    get() = JGLES20.GL_SHORT
actual inline val GL_UNSIGNED_SHORT: GLenum
    get() = JGLES20.GL_UNSIGNED_SHORT
actual inline val GL_INT: GLenum
    get() = JGLES20.GL_INT
actual inline val GL_UNSIGNED_INT: GLenum
    get() = JGLES20.GL_UNSIGNED_INT
actual inline val GL_FLOAT: GLenum
    get() = JGLES20.GL_FLOAT
actual inline val GL_DEPTH_COMPONENT: GLenum
    get() = JGLES20.GL_DEPTH_COMPONENT
actual inline val GL_ALPHA: GLenum
    get() = JGLES20.GL_ALPHA
actual inline val GL_RGB: GLenum
    get() = JGLES20.GL_RGB
actual inline val GL_RGBA: GLenum
    get() = JGLES20.GL_RGBA
actual inline val GL_LUMINANCE: GLenum
    get() = JGLES20.GL_LUMINANCE
actual inline val GL_LUMINANCE_ALPHA: GLenum
    get() = JGLES20.GL_LUMINANCE_ALPHA
actual inline val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
    get() = JGLES20.GL_UNSIGNED_SHORT_4_4_4_4
actual inline val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
    get() = JGLES20.GL_UNSIGNED_SHORT_5_5_5_1
actual inline val GL_UNSIGNED_SHORT_5_6_5: GLenum
    get() = JGLES20.GL_UNSIGNED_SHORT_5_6_5
actual inline val GL_FRAGMENT_SHADER: GLenum
    get() = JGLES20.GL_FRAGMENT_SHADER
actual inline val GL_VERTEX_SHADER: GLenum
    get() = JGLES20.GL_VERTEX_SHADER
actual inline val GL_MAX_VERTEX_ATTRIBS: GLenum
    get() = JGLES20.GL_MAX_VERTEX_ATTRIBS
actual inline val GL_MAX_VERTEX_UNIFORM_VECTORS: GLenum
    get() = JGLES20.GL_MAX_VERTEX_UNIFORM_VECTORS
actual inline val GL_MAX_VARYING_VECTORS: GLenum
    get() = JGLES20.GL_MAX_VARYING_VECTORS
actual inline val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGLES20.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGLES20.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
    get() = JGLES20.GL_MAX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    get() = JGLES20.GL_MAX_FRAGMENT_UNIFORM_VECTORS
actual inline val GL_SHADER_TYPE: GLenum
    get() = JGLES20.GL_SHADER_TYPE
actual inline val GL_DELETE_STATUS: GLenum
    get() = JGLES20.GL_DELETE_STATUS
actual inline val GL_LINK_STATUS: GLenum
    get() = JGLES20.GL_LINK_STATUS
actual inline val GL_VALIDATE_STATUS: GLenum
    get() = JGLES20.GL_VALIDATE_STATUS
actual inline val GL_ATTACHED_SHADERS: GLenum
    get() = JGLES20.GL_ATTACHED_SHADERS
actual inline val GL_ACTIVE_UNIFORMS: GLenum
    get() = JGLES20.GL_ACTIVE_UNIFORMS
actual inline val GL_ACTIVE_ATTRIBUTES: GLenum
    get() = JGLES20.GL_ACTIVE_ATTRIBUTES
actual inline val GL_SHADING_LANGUAGE_VERSION: GLenum
    get() = JGLES20.GL_SHADING_LANGUAGE_VERSION
actual inline val GL_CURRENT_PROGRAM: GLenum
    get() = JGLES20.GL_CURRENT_PROGRAM
actual inline val GL_NEVER: GLenum
    get() = JGLES20.GL_NEVER
actual inline val GL_LESS: GLenum
    get() = JGLES20.GL_LESS
actual inline val GL_EQUAL: GLenum
    get() = JGLES20.GL_EQUAL
actual inline val GL_LEQUAL: GLenum
    get() = JGLES20.GL_LEQUAL
actual inline val GL_GREATER: GLenum
    get() = JGLES20.GL_GREATER
actual inline val GL_NOTEQUAL: GLenum
    get() = JGLES20.GL_NOTEQUAL
actual inline val GL_GEQUAL: GLenum
    get() = JGLES20.GL_GEQUAL
actual inline val GL_ALWAYS: GLenum
    get() = JGLES20.GL_ALWAYS
actual inline val GL_KEEP: GLenum
    get() = JGLES20.GL_KEEP
actual inline val GL_REPLACE: GLenum
    get() = JGLES20.GL_REPLACE
actual inline val GL_INCR: GLenum
    get() = JGLES20.GL_INCR
actual inline val GL_DECR: GLenum
    get() = JGLES20.GL_DECR
actual inline val GL_INVERT: GLenum
    get() = JGLES20.GL_INVERT
actual inline val GL_INCR_WRAP: GLenum
    get() = JGLES20.GL_INCR_WRAP
actual inline val GL_DECR_WRAP: GLenum
    get() = JGLES20.GL_DECR_WRAP
actual inline val GL_VENDOR: GLenum
    get() = JGLES20.GL_VENDOR
actual inline val GL_RENDERER: GLenum
    get() = JGLES20.GL_RENDERER
actual inline val GL_VERSION: GLenum
    get() = JGLES20.GL_VERSION
actual inline val GL_NEAREST: GLenum
    get() = JGLES20.GL_NEAREST
actual inline val GL_LINEAR: GLenum
    get() = JGLES20.GL_LINEAR
actual inline val GL_NEAREST_MIPMAP_NEAREST: GLenum
    get() = JGLES20.GL_NEAREST_MIPMAP_NEAREST
actual inline val GL_LINEAR_MIPMAP_NEAREST: GLenum
    get() = JGLES20.GL_LINEAR_MIPMAP_NEAREST
actual inline val GL_NEAREST_MIPMAP_LINEAR: GLenum
    get() = JGLES20.GL_NEAREST_MIPMAP_LINEAR
actual inline val GL_LINEAR_MIPMAP_LINEAR: GLenum
    get() = JGLES20.GL_LINEAR_MIPMAP_LINEAR
actual inline val GL_TEXTURE_MAG_FILTER: GLenum
    get() = JGLES20.GL_TEXTURE_MAG_FILTER
actual inline val GL_TEXTURE_MIN_FILTER: GLenum
    get() = JGLES20.GL_TEXTURE_MIN_FILTER
actual inline val GL_TEXTURE_WRAP_S: GLenum
    get() = JGLES20.GL_TEXTURE_WRAP_S
actual inline val GL_TEXTURE_WRAP_T: GLenum
    get() = JGLES20.GL_TEXTURE_WRAP_T
actual inline val GL_TEXTURE_2D: GLenum
    get() = JGLES20.GL_TEXTURE_2D
actual inline val GL_TEXTURE: GLenum
    get() = JGLES20.GL_TEXTURE
actual inline val GL_TEXTURE_CUBE_MAP: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP
actual inline val GL_TEXTURE_BINDING_CUBE_MAP: GLenum
    get() = JGLES20.GL_TEXTURE_BINDING_CUBE_MAP
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_Z
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    get() = JGLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z
actual inline val GL_MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    get() = JGLES20.GL_MAX_CUBE_MAP_TEXTURE_SIZE
actual inline val GL_TEXTURE0: GLenum
    get() = JGLES20.GL_TEXTURE0
actual inline val GL_TEXTURE1: GLenum
    get() = JGLES20.GL_TEXTURE1
actual inline val GL_TEXTURE2: GLenum
    get() = JGLES20.GL_TEXTURE2
actual inline val GL_TEXTURE3: GLenum
    get() = JGLES20.GL_TEXTURE3
actual inline val GL_TEXTURE4: GLenum
    get() = JGLES20.GL_TEXTURE4
actual inline val GL_TEXTURE5: GLenum
    get() = JGLES20.GL_TEXTURE5
actual inline val GL_TEXTURE6: GLenum
    get() = JGLES20.GL_TEXTURE6
actual inline val GL_TEXTURE7: GLenum
    get() = JGLES20.GL_TEXTURE7
actual inline val GL_TEXTURE8: GLenum
    get() = JGLES20.GL_TEXTURE8
actual inline val GL_TEXTURE9: GLenum
    get() = JGLES20.GL_TEXTURE9
actual inline val GL_TEXTURE10: GLenum
    get() = JGLES20.GL_TEXTURE10
actual inline val GL_TEXTURE11: GLenum
    get() = JGLES20.GL_TEXTURE11
actual inline val GL_TEXTURE12: GLenum
    get() = JGLES20.GL_TEXTURE12
actual inline val GL_TEXTURE13: GLenum
    get() = JGLES20.GL_TEXTURE13
actual inline val GL_TEXTURE14: GLenum
    get() = JGLES20.GL_TEXTURE14
actual inline val GL_TEXTURE15: GLenum
    get() = JGLES20.GL_TEXTURE15
actual inline val GL_TEXTURE16: GLenum
    get() = JGLES20.GL_TEXTURE16
actual inline val GL_TEXTURE17: GLenum
    get() = JGLES20.GL_TEXTURE17
actual inline val GL_TEXTURE18: GLenum
    get() = JGLES20.GL_TEXTURE18
actual inline val GL_TEXTURE19: GLenum
    get() = JGLES20.GL_TEXTURE19
actual inline val GL_TEXTURE20: GLenum
    get() = JGLES20.GL_TEXTURE20
actual inline val GL_TEXTURE21: GLenum
    get() = JGLES20.GL_TEXTURE21
actual inline val GL_TEXTURE22: GLenum
    get() = JGLES20.GL_TEXTURE22
actual inline val GL_TEXTURE23: GLenum
    get() = JGLES20.GL_TEXTURE23
actual inline val GL_TEXTURE24: GLenum
    get() = JGLES20.GL_TEXTURE24
actual inline val GL_TEXTURE25: GLenum
    get() = JGLES20.GL_TEXTURE25
actual inline val GL_TEXTURE26: GLenum
    get() = JGLES20.GL_TEXTURE26
actual inline val GL_TEXTURE27: GLenum
    get() = JGLES20.GL_TEXTURE27
actual inline val GL_TEXTURE28: GLenum
    get() = JGLES20.GL_TEXTURE28
actual inline val GL_TEXTURE29: GLenum
    get() = JGLES20.GL_TEXTURE29
actual inline val GL_TEXTURE30: GLenum
    get() = JGLES20.GL_TEXTURE30
actual inline val GL_TEXTURE31: GLenum
    get() = JGLES20.GL_TEXTURE31
actual inline val GL_ACTIVE_TEXTURE: GLenum
    get() = JGLES20.GL_ACTIVE_TEXTURE
actual inline val GL_REPEAT: GLenum
    get() = JGLES20.GL_REPEAT
actual inline val GL_CLAMP_TO_EDGE: GLenum
    get() = JGLES20.GL_CLAMP_TO_EDGE
actual inline val GL_MIRRORED_REPEAT: GLenum
    get() = JGLES20.GL_MIRRORED_REPEAT
actual inline val GL_FLOAT_VEC2: GLenum
    get() = JGLES20.GL_FLOAT_VEC2
actual inline val GL_FLOAT_VEC3: GLenum
    get() = JGLES20.GL_FLOAT_VEC3
actual inline val GL_FLOAT_VEC4: GLenum
    get() = JGLES20.GL_FLOAT_VEC4
actual inline val GL_INT_VEC2: GLenum
    get() = JGLES20.GL_INT_VEC2
actual inline val GL_INT_VEC3: GLenum
    get() = JGLES20.GL_INT_VEC3
actual inline val GL_INT_VEC4: GLenum
    get() = JGLES20.GL_INT_VEC4
actual inline val GL_BOOL: GLenum
    get() = JGLES20.GL_BOOL
actual inline val GL_BOOL_VEC2: GLenum
    get() = JGLES20.GL_BOOL_VEC2
actual inline val GL_BOOL_VEC3: GLenum
    get() = JGLES20.GL_BOOL_VEC3
actual inline val GL_BOOL_VEC4: GLenum
    get() = JGLES20.GL_BOOL_VEC4
actual inline val GL_FLOAT_MAT2: GLenum
    get() = JGLES20.GL_FLOAT_MAT2
actual inline val GL_FLOAT_MAT3: GLenum
    get() = JGLES20.GL_FLOAT_MAT3
actual inline val GL_FLOAT_MAT4: GLenum
    get() = JGLES20.GL_FLOAT_MAT4
actual inline val GL_SAMPLER_2D: GLenum
    get() = JGLES20.GL_SAMPLER_2D
actual inline val GL_SAMPLER_CUBE: GLenum
    get() = JGLES20.GL_SAMPLER_CUBE
actual inline val GL_VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_ENABLED
actual inline val GL_VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_SIZE
actual inline val GL_VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_STRIDE
actual inline val GL_VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_TYPE
actual inline val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED
actual inline val GL_VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_POINTER
actual inline val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    get() = JGLES20.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING
actual inline val GL_IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    get() = JGLES20.GL_IMPLEMENTATION_COLOR_READ_TYPE
actual inline val GL_IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    get() = JGLES20.GL_IMPLEMENTATION_COLOR_READ_FORMAT
actual inline val GL_COMPILE_STATUS: GLenum
    get() = JGLES20.GL_COMPILE_STATUS
actual inline val GL_LOW_FLOAT: GLenum
    get() = JGLES20.GL_LOW_FLOAT
actual inline val GL_MEDIUM_FLOAT: GLenum
    get() = JGLES20.GL_MEDIUM_FLOAT
actual inline val GL_HIGH_FLOAT: GLenum
    get() = JGLES20.GL_HIGH_FLOAT
actual inline val GL_LOW_INT: GLenum
    get() = JGLES20.GL_LOW_INT
actual inline val GL_MEDIUM_INT: GLenum
    get() = JGLES20.GL_MEDIUM_INT
actual inline val GL_HIGH_INT: GLenum
    get() = JGLES20.GL_HIGH_INT
actual inline val GL_FRAMEBUFFER: GLenum
    get() = JGLES20.GL_FRAMEBUFFER
actual inline val GL_RENDERBUFFER: GLenum
    get() = JGLES20.GL_RENDERBUFFER
actual inline val GL_RGBA4: GLenum
    get() = JGLES20.GL_RGBA4
actual inline val GL_RGB5_A1: GLenum
    get() = JGLES20.GL_RGB5_A1
actual inline val GL_RGB565: GLenum
    get() = JGLES20.GL_RGB565
actual inline val GL_DEPTH_COMPONENT16: GLenum
    get() = JGLES20.GL_DEPTH_COMPONENT16
actual inline val GL_STENCIL_INDEX8: GLenum
    get() = JGLES20.GL_STENCIL_INDEX8
actual inline val GL_RENDERBUFFER_WIDTH: GLenum
    get() = JGLES20.GL_RENDERBUFFER_WIDTH
actual inline val GL_RENDERBUFFER_HEIGHT: GLenum
    get() = JGLES20.GL_RENDERBUFFER_HEIGHT
actual inline val GL_RENDERBUFFER_INTERNAL_FORMAT: GLenum
    get() = JGLES20.GL_RENDERBUFFER_INTERNAL_FORMAT
actual inline val GL_RENDERBUFFER_RED_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_RED_SIZE
actual inline val GL_RENDERBUFFER_GREEN_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_GREEN_SIZE
actual inline val GL_RENDERBUFFER_BLUE_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_BLUE_SIZE
actual inline val GL_RENDERBUFFER_ALPHA_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_ALPHA_SIZE
actual inline val GL_RENDERBUFFER_DEPTH_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_DEPTH_SIZE
actual inline val GL_RENDERBUFFER_STENCIL_SIZE: GLenum
    get() = JGLES20.GL_RENDERBUFFER_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE
actual inline val GL_COLOR_ATTACHMENT0: GLenum
    get() = JGLES20.GL_COLOR_ATTACHMENT0
actual inline val GL_DEPTH_ATTACHMENT: GLenum
    get() = JGLES20.GL_DEPTH_ATTACHMENT
actual inline val GL_STENCIL_ATTACHMENT: GLenum
    get() = JGLES20.GL_STENCIL_ATTACHMENT
actual inline val GL_NONE: GLenum
    get() = JGLES20.GL_NONE
actual inline val GL_FRAMEBUFFER_COMPLETE: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_COMPLETE
actual inline val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS
actual inline val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_UNSUPPORTED
actual inline val GL_FRAMEBUFFER_BINDING: GLenum
    get() = JGLES20.GL_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_BINDING: GLenum
    get() = JGLES20.GL_RENDERBUFFER_BINDING
actual inline val GL_MAX_RENDERBUFFER_SIZE: GLenum
    get() = JGLES20.GL_MAX_RENDERBUFFER_SIZE
actual inline val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum
    get() = JGLES20.GL_INVALID_FRAMEBUFFER_OPERATION

actual inline fun GLES20.glActiveTexture(
    texture: GLenum
) = JGLES20.glActiveTexture(
    texture
)

actual inline fun GLES20.glAttachShader(
    program: GLProgram, shader: GLShader
) = JGLES20.glAttachShader(
    program, shader
)

actual inline fun GLES20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
) = JGLES20.glBindAttribLocation(
    program, index.toInt(), name
)

actual inline fun GLES20.glBindBuffer(
    target: GLenum, buffer: GLBuffer
) = JGLES20.glBindBuffer(
    target, buffer
)

actual inline fun GLES20.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
) = JGLES20.glBindFramebuffer(
    target, framebuffer
)

actual inline fun GLES20.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
) = JGLES20.glBindRenderbuffer(
    target, renderbuffer
)

actual inline fun GLES20.glBindTexture(
    target: GLenum, texture: GLTexture
) = JGLES20.glBindTexture(
    target, texture
)

actual inline fun GLES20.glBlendColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = JGLES20.glBlendColor(
    red, green, blue, alpha
)

actual inline fun GLES20.glBlendEquation(
    mode: GLenum
) = JGLES20.glBlendEquation(
    mode
)

actual inline fun GLES20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
) = JGLES20.glBlendEquationSeparate(
    modeRGB, modeAlpha
)

actual inline fun GLES20.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
) = JGLES20.glBlendFunc(
    sfactor, dfactor
)

actual inline fun GLES20.glBlendFuncSeparate(
    srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum
) = JGLES20.glBlendFuncSeparate(
    srcRGB, dstRGB, srcAlpha, dstAlpha
)

actual inline fun GLES20.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
) = JGLES20.glBufferData(
    target, size.toInt(), null, usage
)

actual inline fun GLES20.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
) = data.read { buffer ->
    JGLES20.glBufferData(
        target, buffer.remaining(), buffer, usage
    )
}

actual inline fun GLES20.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
) = data.read { buffer ->
    JGLES20.glBufferSubData(
        target, offset.toInt(), buffer.remaining(), buffer
    )
}

actual inline fun GLES20.glCheckFramebufferStatus(
    target: GLenum
): GLenum = JGLES20.glCheckFramebufferStatus(
    target
)

actual inline fun GLES20.glClear(
    mask: GLbitfield
) = JGLES20.glClear(
    mask
)

actual inline fun GLES20.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = JGLES20.glClearColor(
    red, green, blue, alpha
)

actual inline fun GLES20.glClearDepth(
    depth: GLclampf
) = JGLES20.glClearDepthf(
    depth
)

actual inline fun GLES20.glClearStencil(
    s: GLint
) = JGLES20.glClearStencil(
    s
)

actual inline fun GLES20.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
) = JGLES20.glColorMask(
    red, green, blue, alpha
)

actual inline fun GLES20.glCompileShader(
    shader: GLShader
) = JGLES20.glCompileShader(
    shader
)

actual inline fun GLES20.glCompressedTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, data: DataBuffer
) = data.read { buffer ->
    JGLES20.glCompressedTexImage2D(
        target, level, internalformat, width, height, border,
        buffer.remaining(), buffer
    )
}

actual inline fun GLES20.glCompressedTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, data: DataBuffer
) = data.read { buffer ->
    JGLES20.glCompressedTexSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        buffer.remaining(), buffer
    )
}

actual inline fun GLES20.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
) = JGLES20.glCopyTexImage2D(
    target, level, internalformat, x, y, width, height, border
)

actual inline fun GLES20.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGLES20.glCopyTexSubImage2D(
    target, level, xoffset, yoffset, x, y, width, height
)

actual inline fun GLES20.glCreateBuffer(
) = readInt { i0 ->
    JGLES20.glGenBuffers(
        1, i0, 0
    )
}

actual inline fun GLES20.glCreateFramebuffer(
) = readInt { i0 ->
    JGLES20.glGenFramebuffers(
        1, i0, 0
    )
}

actual inline fun GLES20.glCreateProgram(
) = JGLES20.glCreateProgram(
)

actual inline fun GLES20.glCreateRenderbuffer(
) = readInt { i0 ->
    JGLES20.glGenRenderbuffers(
        1, i0, 0
    )
}

actual inline fun GLES20.glCreateShader(
    type: GLenum
) = JGLES20.glCreateShader(
    type
)

actual inline fun GLES20.glCreateTexture(
) = readInt { i0 ->
    JGLES20.glGenTextures(
        1, i0, 0
    )
}

actual inline fun GLES20.glCullFace(
    mode: GLenum
) = JGLES20.glCullFace(
    mode
)

actual inline fun GLES20.glDeleteBuffer(
    buffer: GLBuffer
) = JGLES20.glDeleteBuffers(
    1, intArrayOf(buffer), 0
)

actual inline fun GLES20.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
) = JGLES20.glDeleteFramebuffers(
    1, intArrayOf(framebuffer), 0
)

actual inline fun GLES20.glDeleteProgram(
    program: GLProgram
) = JGLES20.glDeleteProgram(
    program
)

actual inline fun GLES20.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
) = JGLES20.glDeleteRenderbuffers(
    1, intArrayOf(renderbuffer), 0
)

actual inline fun GLES20.glDeleteShader(
    shader: GLShader
) = JGLES20.glDeleteShader(
    shader
)

actual inline fun GLES20.glDeleteTexture(
    texture: GLTexture
) = JGLES20.glDeleteTextures(
    1, intArrayOf(texture), 0
)

actual inline fun GLES20.glDepthFunc(
    func: GLenum
) = JGLES20.glDepthFunc(
    func
)

actual inline fun GLES20.glDepthMask(
    flag: GLboolean
) = JGLES20.glDepthMask(
    flag
)

actual inline fun GLES20.glDepthRange(
    zNear: GLclampf, zFar: GLclampf
) = JGLES20.glDepthRangef(
    zNear, zFar
)

actual inline fun GLES20.glDetachShader(
    program: GLProgram, shader: GLShader
) = JGLES20.glDetachShader(
    program, shader
)

actual inline fun GLES20.glDisable(
    cap: GLenum
) = JGLES20.glDisable(
    cap
)

actual inline fun GLES20.glDisableVertexAttribArray(
    index: GLuint
) = JGLES20.glDisableVertexAttribArray(
    index.toInt()
)

actual inline fun GLES20.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
) = JGLES20.glDrawArrays(
    mode, first, count
)

actual inline fun GLES20.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
) = JGLES20.glDrawElements(
    mode, count, type, offset.toInt()
)

actual inline fun GLES20.glEnable(
    cap: GLenum
) = JGLES20.glEnable(
    cap
)

actual inline fun GLES20.glEnableVertexAttribArray(
    index: GLuint
) = JGLES20.glEnableVertexAttribArray(
    index.toInt()
)

actual inline fun GLES20.glFinish(
) = JGLES20.glFinish(
)

actual inline fun GLES20.glFlush(
) = JGLES20.glFlush(
)

actual inline fun GLES20.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
) = JGLES20.glFramebufferRenderbuffer(
    target, attachment, renderbuffertarget, renderbuffer
)

actual inline fun GLES20.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
) = JGLES20.glFramebufferTexture2D(
    target, attachment, textarget, texture, level
)

actual inline fun GLES20.glFrontFace(
    mode: GLenum
) = JGLES20.glFrontFace(
    mode
)

actual inline fun GLES20.glGenerateMipmap(
    target: GLenum
) = JGLES20.glGenerateMipmap(
    target
)

actual inline fun GLES20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
) {
    val array = IntArray(shaders.size)
    JGLES20.glGetAttachedShaders(
        program, array.size, count, 0, array, 0
    )
    for (i in shaders.indices) {
        shaders[i] = array[i]
    }
}

actual inline fun GLES20.glGetAttribLocation(
    program: GLProgram, name: DOMString
) = JGLES20.glGetAttribLocation(
    program, name
)

actual inline fun GLES20.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetBufferParameteriv(
    target, pname, params, 0
)

actual inline fun GLES20.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
) = JGLES20.glGetBooleanv(
    pname, data, 0
)

actual inline fun GLES20.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
) = JGLES20.glGetFloatv(
    pname, data, 0
)

actual inline fun GLES20.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
) = JGLES20.glGetIntegerv(
    pname, data, 0
)

actual inline fun GLES20.glGetError(
) = JGLES20.glGetError(
)

actual inline fun GLES20.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetFramebufferAttachmentParameteriv(
    target, attachment, pname, params, 0
)

actual inline fun GLES20.glGetProgramb(
    program: GLProgram, pname: GLenum
): GLboolean = readInt { i0 ->
    JGLES20.glGetProgramiv(
        program, pname, i0, 0
    )
} != JGLES20.GL_FALSE

actual inline fun GLES20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetProgramiv(
    program, pname, params, 0
)

actual inline fun GLES20.glGetProgramInfoLog(
    program: GLProgram
) = JGLES20.glGetProgramInfoLog(
    program
)

actual inline fun GLES20.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetRenderbufferParameteriv(
    target, pname, params, 0
)

actual inline fun GLES20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetShaderiv(
    shader, pname, params, 0
)

actual inline fun GLES20.glGetShaderInfoLog(
    shader: GLShader
) = JGLES20.glGetShaderInfoLog(
    shader
)

actual inline fun GLES20.glGetShaderSource(
    shader: GLShader
) = JGLES20.glGetShaderSource(
    shader
)

actual inline fun GLES20.glGetString(
    pname: GLenum
) = JGLES20.glGetString(
    pname
)

actual inline fun GLES20.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetTexParameteriv(
    target, pname, params, 0
)

actual inline fun GLES20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
) = JGLES20.glGetUniformfv(
    program, location, params, 0
)

actual inline fun GLES20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
) = JGLES20.glGetUniformiv(
    program, location, params, 0
)

actual inline fun GLES20.glGetUniformLocation(
    program: GLProgram, name: DOMString
) = JGLES20.glGetUniformLocation(
    program, name
)

actual inline fun GLES20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
) = JGLES20.glGetVertexAttribfv(
    index.toInt(), pname, params, 0
)

actual inline fun GLES20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
) = JGLES20.glGetVertexAttribiv(
    index.toInt(), pname, params, 0
)

actual inline fun GLES20.glHint(
    target: GLenum, mode: GLenum
) = JGLES20.glHint(
    target, mode
)

actual inline fun GLES20.glIsBuffer(
    buffer: GLBuffer
) = JGLES20.glIsBuffer(
    buffer
)

actual inline fun GLES20.glIsEnabled(
    cap: GLenum
) = JGLES20.glIsEnabled(
    cap
)

actual inline fun GLES20.glIsFramebuffer(
    framebuffer: GLFramebuffer
) = JGLES20.glIsFramebuffer(
    framebuffer
)

actual inline fun GLES20.glIsProgram(
    program: GLProgram
) = JGLES20.glIsProgram(
    program
)

actual inline fun GLES20.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
) = JGLES20.glIsRenderbuffer(
    renderbuffer
)

actual inline fun GLES20.glIsShader(
    shader: GLShader
) = JGLES20.glIsShader(
    shader
)

actual inline fun GLES20.glIsTexture(
    texture: GLTexture
) = JGLES20.glIsTexture(
    texture
)

actual inline fun GLES20.glLineWidth(
    width: GLfloat
) = JGLES20.glLineWidth(
    width
)

actual inline fun GLES20.glLinkProgram(
    program: GLProgram
) = JGLES20.glLinkProgram(
    program
)

actual inline fun GLES20.glPixelStorei(
    pname: GLenum, param: GLint
) = JGLES20.glPixelStorei(
    pname, param
)

actual inline fun GLES20.glPolygonOffset(
    factor: GLfloat, units: GLfloat
) = JGLES20.glPolygonOffset(
    factor, units
)

actual inline fun GLES20.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
) = pixels.read { buffer ->
    JGLES20.glReadPixels(
        x, y, width, height, format, type, buffer
    )
}

actual inline fun GLES20.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
) = JGLES20.glRenderbufferStorage(
    target, internalformat, width, height
)

actual inline fun GLES20.glSampleCoverage(
    value: GLclampf, invert: GLboolean
) = JGLES20.glSampleCoverage(
    value, invert
)

actual inline fun GLES20.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGLES20.glScissor(
    x, y, width, height
)

actual inline fun GLES20.glShaderSource(
    shader: GLShader, source: DOMString
) = JGLES20.glShaderSource(
    shader, source
)

actual inline fun GLES20.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
) = JGLES20.glStencilFunc(
    func, ref, mask.toInt()
)

actual inline fun GLES20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
) = JGLES20.glStencilFuncSeparate(
    face, func, ref, mask.toInt()
)

actual inline fun GLES20.glStencilMask(
    mask: GLuint
) = JGLES20.glStencilMask(
    mask.toInt()
)

actual inline fun GLES20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
) = JGLES20.glStencilMaskSeparate(
    face, mask.toInt()
)

actual inline fun GLES20.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
) = JGLES20.glStencilOp(
    fail, zfail, zpass
)

actual inline fun GLES20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
) = JGLES20.glStencilOpSeparate(
    face, fail, zfail, zpass
)

actual inline fun GLES20.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
) = pixels.readOrNull { buffer ->
    JGLES20.glTexImage2D(
        target, level, internalformat, width, height, border,
        format, type, buffer
    )
}

actual inline fun GLES20.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
) = JGLES20.glTexParameterf(
    target, pname, param
)

actual inline fun GLES20.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
) = JGLES20.glTexParameteri(
    target, pname, param
)

actual inline fun GLES20.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
) = pixels.read { buffer ->
    JGLES20.glTexSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        type, buffer
    )
}

actual inline fun GLES20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
) = JGLES20.glUniform1f(
    location, x
)

actual inline fun GLES20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGLES20.glUniform1fv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform1i(
    location: GLUniformLocation, x: GLint
) = JGLES20.glUniform1i(
    location, x
)

actual inline fun GLES20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
) = JGLES20.glUniform1iv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
) = JGLES20.glUniform2f(
    location, x, y
)

actual inline fun GLES20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGLES20.glUniform2fv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
) = JGLES20.glUniform2i(
    location, x, y
)

actual inline fun GLES20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
) = JGLES20.glUniform2iv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
) = JGLES20.glUniform3f(
    location, x, y, z
)

actual inline fun GLES20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGLES20.glUniform3fv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
) = JGLES20.glUniform3i(
    location, x, y, z
)

actual inline fun GLES20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
) = JGLES20.glUniform3iv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = JGLES20.glUniform4f(
    location, x, y, z, w
)

actual inline fun GLES20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = JGLES20.glUniform4fv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
) = JGLES20.glUniform4i(
    location, x, y, z, w
)

actual inline fun GLES20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
) = JGLES20.glUniform4iv(
    location, v.size, v, 0
)

actual inline fun GLES20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGLES20.glUniformMatrix2fv(
    location, value.size / 4, transpose, value, 0
)

actual inline fun GLES20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGLES20.glUniformMatrix3fv(
    location, value.size / 9, transpose, value, 0
)

actual inline fun GLES20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = JGLES20.glUniformMatrix4fv(
    location, value.size / 16, transpose, value, 0
)

actual inline fun GLES20.glUseProgram(
    program: GLProgram
) = JGLES20.glUseProgram(
    program
)

actual inline fun GLES20.glValidateProgram(
    program: GLProgram
) = JGLES20.glValidateProgram(
    program
)

actual inline fun GLES20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
) = JGLES20.glVertexAttrib1f(
    indx.toInt(), x
)

actual inline fun GLES20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
) = JGLES20.glVertexAttrib1fv(
    indx.toInt(), values, 0
)

actual inline fun GLES20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
) = JGLES20.glVertexAttrib2f(
    indx.toInt(), x, y
)

actual inline fun GLES20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
) = JGLES20.glVertexAttrib2fv(
    indx.toInt(), values, 0
)

actual inline fun GLES20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
) = JGLES20.glVertexAttrib3f(
    indx.toInt(), x, y, z
)

actual inline fun GLES20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
) = JGLES20.glVertexAttrib3fv(
    indx.toInt(), values, 0
)

actual inline fun GLES20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = JGLES20.glVertexAttrib4f(
    indx.toInt(), x, y, z, w
)

actual inline fun GLES20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
) = JGLES20.glVertexAttrib4fv(
    indx.toInt(), values, 0
)

actual inline fun GLES20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
) = JGLES20.glVertexAttribPointer(
    indx.toInt(), size, type, normalized, stride, offset.toInt()
)

actual inline fun GLES20.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = JGLES20.glViewport(
    x, y, width, height
)
