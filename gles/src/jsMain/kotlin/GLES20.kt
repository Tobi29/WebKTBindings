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
import org.khronos.webgl.WebGLRenderingContext

actual inline val GL_DEPTH_BUFFER_BIT: GLenum
    get() = WebGLRenderingContext.DEPTH_BUFFER_BIT
actual inline val GL_STENCIL_BUFFER_BIT: GLenum
    get() = WebGLRenderingContext.STENCIL_BUFFER_BIT
actual inline val GL_COLOR_BUFFER_BIT: GLenum
    get() = WebGLRenderingContext.COLOR_BUFFER_BIT
actual inline val GL_POINTS: GLenum
    get() = WebGLRenderingContext.POINTS
actual inline val GL_LINES: GLenum
    get() = WebGLRenderingContext.LINES
actual inline val GL_LINE_LOOP: GLenum
    get() = WebGLRenderingContext.LINE_LOOP
actual inline val GL_LINE_STRIP: GLenum
    get() = WebGLRenderingContext.LINE_STRIP
actual inline val GL_TRIANGLES: GLenum
    get() = WebGLRenderingContext.TRIANGLES
actual inline val GL_TRIANGLE_STRIP: GLenum
    get() = WebGLRenderingContext.TRIANGLE_STRIP
actual inline val GL_TRIANGLE_FAN: GLenum
    get() = WebGLRenderingContext.TRIANGLE_FAN
actual inline val GL_ZERO: GLenum
    get() = WebGLRenderingContext.ZERO
actual inline val GL_ONE: GLenum
    get() = WebGLRenderingContext.ONE
actual inline val GL_SRC_COLOR: GLenum
    get() = WebGLRenderingContext.SRC_COLOR
actual inline val GL_ONE_MINUS_SRC_COLOR: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_SRC_COLOR
actual inline val GL_SRC_ALPHA: GLenum
    get() = WebGLRenderingContext.SRC_ALPHA
actual inline val GL_ONE_MINUS_SRC_ALPHA: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_SRC_ALPHA
actual inline val GL_DST_ALPHA: GLenum
    get() = WebGLRenderingContext.DST_ALPHA
actual inline val GL_ONE_MINUS_DST_ALPHA: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_DST_ALPHA
actual inline val GL_DST_COLOR: GLenum
    get() = WebGLRenderingContext.DST_COLOR
actual inline val GL_ONE_MINUS_DST_COLOR: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_DST_COLOR
actual inline val GL_SRC_ALPHA_SATURATE: GLenum
    get() = WebGLRenderingContext.SRC_ALPHA_SATURATE
actual inline val GL_FUNC_ADD: GLenum
    get() = WebGLRenderingContext.FUNC_ADD
actual inline val GL_BLEND_EQUATION: GLenum
    get() = WebGLRenderingContext.BLEND_EQUATION
actual inline val GL_BLEND_EQUATION_RGB: GLenum
    get() = WebGLRenderingContext.BLEND_EQUATION_RGB   /* same as BLEND_EQUATION */
actual inline val GL_BLEND_EQUATION_ALPHA: GLenum
    get() = WebGLRenderingContext.BLEND_EQUATION_ALPHA
actual inline val GL_FUNC_SUBTRACT: GLenum
    get() = WebGLRenderingContext.FUNC_SUBTRACT
actual inline val GL_FUNC_REVERSE_SUBTRACT: GLenum
    get() = WebGLRenderingContext.FUNC_REVERSE_SUBTRACT
actual inline val GL_BLEND_DST_RGB: GLenum
    get() = WebGLRenderingContext.BLEND_DST_RGB
actual inline val GL_BLEND_SRC_RGB: GLenum
    get() = WebGLRenderingContext.BLEND_SRC_RGB
actual inline val GL_BLEND_DST_ALPHA: GLenum
    get() = WebGLRenderingContext.BLEND_DST_ALPHA
actual inline val GL_BLEND_SRC_ALPHA: GLenum
    get() = WebGLRenderingContext.BLEND_SRC_ALPHA
actual inline val GL_CONSTANT_COLOR: GLenum
    get() = WebGLRenderingContext.CONSTANT_COLOR
actual inline val GL_ONE_MINUS_CONSTANT_COLOR: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR
actual inline val GL_CONSTANT_ALPHA: GLenum
    get() = WebGLRenderingContext.CONSTANT_ALPHA
actual inline val GL_ONE_MINUS_CONSTANT_ALPHA: GLenum
    get() = WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA
actual inline val GL_BLEND_COLOR: GLenum
    get() = WebGLRenderingContext.BLEND_COLOR
actual inline val GL_ARRAY_BUFFER: GLenum
    get() = WebGLRenderingContext.ARRAY_BUFFER
actual inline val GL_ELEMENT_ARRAY_BUFFER: GLenum
    get() = WebGLRenderingContext.ELEMENT_ARRAY_BUFFER
actual inline val GL_ARRAY_BUFFER_BINDING: GLenum
    get() = WebGLRenderingContext.ARRAY_BUFFER_BINDING
actual inline val GL_ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    get() = WebGLRenderingContext.ELEMENT_ARRAY_BUFFER_BINDING
actual inline val GL_STREAM_DRAW: GLenum
    get() = WebGLRenderingContext.STREAM_DRAW
actual inline val GL_STATIC_DRAW: GLenum
    get() = WebGLRenderingContext.STATIC_DRAW
actual inline val GL_DYNAMIC_DRAW: GLenum
    get() = WebGLRenderingContext.DYNAMIC_DRAW
actual inline val GL_BUFFER_SIZE: GLenum
    get() = WebGLRenderingContext.BUFFER_SIZE
actual inline val GL_BUFFER_USAGE: GLenum
    get() = WebGLRenderingContext.BUFFER_USAGE
actual inline val GL_CURRENT_VERTEX_ATTRIB: GLenum
    get() = WebGLRenderingContext.CURRENT_VERTEX_ATTRIB
actual inline val GL_FRONT: GLenum
    get() = WebGLRenderingContext.FRONT
actual inline val GL_BACK: GLenum
    get() = WebGLRenderingContext.BACK
actual inline val GL_FRONT_AND_BACK: GLenum
    get() = WebGLRenderingContext.FRONT_AND_BACK
actual inline val GL_CULL_FACE: GLenum
    get() = WebGLRenderingContext.CULL_FACE
actual /* inline */ val GL_BLEND: GLenum
    get() = WebGLRenderingContext.BLEND // FIXME: Compiler crash
actual inline val GL_DITHER: GLenum
    get() = WebGLRenderingContext.DITHER
actual inline val GL_STENCIL_TEST: GLenum
    get() = WebGLRenderingContext.STENCIL_TEST
actual inline val GL_DEPTH_TEST: GLenum
    get() = WebGLRenderingContext.DEPTH_TEST
actual inline val GL_SCISSOR_TEST: GLenum
    get() = WebGLRenderingContext.SCISSOR_TEST
actual inline val GL_POLYGON_OFFSET_FILL: GLenum
    get() = WebGLRenderingContext.POLYGON_OFFSET_FILL
actual inline val GL_SAMPLE_ALPHA_TO_COVERAGE: GLenum
    get() = WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE
actual inline val GL_SAMPLE_COVERAGE: GLenum
    get() = WebGLRenderingContext.SAMPLE_COVERAGE
actual inline val GL_NO_ERROR: GLenum
    get() = WebGLRenderingContext.NO_ERROR
actual inline val GL_INVALID_ENUM: GLenum
    get() = WebGLRenderingContext.INVALID_ENUM
actual inline val GL_INVALID_VALUE: GLenum
    get() = WebGLRenderingContext.INVALID_VALUE
actual inline val GL_INVALID_OPERATION: GLenum
    get() = WebGLRenderingContext.INVALID_OPERATION
actual inline val GL_OUT_OF_MEMORY: GLenum
    get() = WebGLRenderingContext.OUT_OF_MEMORY
actual inline val GL_CW: GLenum
    get() = WebGLRenderingContext.CW
actual inline val GL_CCW: GLenum
    get() = WebGLRenderingContext.CCW
actual inline val GL_LINE_WIDTH: GLenum
    get() = WebGLRenderingContext.LINE_WIDTH
actual inline val GL_ALIASED_POINT_SIZE_RANGE: GLenum
    get() = WebGLRenderingContext.ALIASED_POINT_SIZE_RANGE
actual inline val GL_ALIASED_LINE_WIDTH_RANGE: GLenum
    get() = WebGLRenderingContext.ALIASED_LINE_WIDTH_RANGE
actual inline val GL_CULL_FACE_MODE: GLenum
    get() = WebGLRenderingContext.CULL_FACE_MODE
actual inline val GL_FRONT_FACE: GLenum
    get() = WebGLRenderingContext.FRONT_FACE
actual inline val GL_DEPTH_RANGE: GLenum
    get() = WebGLRenderingContext.DEPTH_RANGE
actual inline val GL_DEPTH_WRITEMASK: GLenum
    get() = WebGLRenderingContext.DEPTH_WRITEMASK
actual inline val GL_DEPTH_CLEAR_VALUE: GLenum
    get() = WebGLRenderingContext.DEPTH_CLEAR_VALUE
actual inline val GL_DEPTH_FUNC: GLenum
    get() = WebGLRenderingContext.DEPTH_FUNC
actual inline val GL_STENCIL_CLEAR_VALUE: GLenum
    get() = WebGLRenderingContext.STENCIL_CLEAR_VALUE
actual inline val GL_STENCIL_FUNC: GLenum
    get() = WebGLRenderingContext.STENCIL_FUNC
actual inline val GL_STENCIL_FAIL: GLenum
    get() = WebGLRenderingContext.STENCIL_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_FAIL: GLenum
    get() = WebGLRenderingContext.STENCIL_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_PASS_DEPTH_PASS: GLenum
    get() = WebGLRenderingContext.STENCIL_PASS_DEPTH_PASS
actual inline val GL_STENCIL_REF: GLenum
    get() = WebGLRenderingContext.STENCIL_REF
actual inline val GL_STENCIL_VALUE_MASK: GLenum
    get() = WebGLRenderingContext.STENCIL_VALUE_MASK
actual inline val GL_STENCIL_WRITEMASK: GLenum
    get() = WebGLRenderingContext.STENCIL_WRITEMASK
actual inline val GL_STENCIL_BACK_FUNC: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_FUNC
actual inline val GL_STENCIL_BACK_FAIL: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_FAIL
actual inline val GL_STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_PASS
actual inline val GL_STENCIL_BACK_REF: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_REF
actual inline val GL_STENCIL_BACK_VALUE_MASK: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_VALUE_MASK
actual inline val GL_STENCIL_BACK_WRITEMASK: GLenum
    get() = WebGLRenderingContext.STENCIL_BACK_WRITEMASK
actual inline val GL_VIEWPORT: GLenum
    get() = WebGLRenderingContext.VIEWPORT
actual inline val GL_SCISSOR_BOX: GLenum
    get() = WebGLRenderingContext.SCISSOR_BOX
actual inline val GL_COLOR_CLEAR_VALUE: GLenum
    get() = WebGLRenderingContext.COLOR_CLEAR_VALUE
actual inline val GL_COLOR_WRITEMASK: GLenum
    get() = WebGLRenderingContext.COLOR_WRITEMASK
actual inline val GL_UNPACK_ALIGNMENT: GLenum
    get() = WebGLRenderingContext.UNPACK_ALIGNMENT
actual inline val GL_PACK_ALIGNMENT: GLenum
    get() = WebGLRenderingContext.PACK_ALIGNMENT
actual inline val GL_MAX_TEXTURE_SIZE: GLenum
    get() = WebGLRenderingContext.MAX_TEXTURE_SIZE
actual inline val GL_MAX_VIEWPORT_DIMS: GLenum
    get() = WebGLRenderingContext.MAX_VIEWPORT_DIMS
actual inline val GL_SUBPIXEL_BITS: GLenum
    get() = WebGLRenderingContext.SUBPIXEL_BITS
actual inline val GL_RED_BITS: GLenum
    get() = WebGLRenderingContext.RED_BITS
actual inline val GL_GREEN_BITS: GLenum
    get() = WebGLRenderingContext.GREEN_BITS
actual inline val GL_BLUE_BITS: GLenum
    get() = WebGLRenderingContext.BLUE_BITS
actual inline val GL_ALPHA_BITS: GLenum
    get() = WebGLRenderingContext.ALPHA_BITS
actual inline val GL_DEPTH_BITS: GLenum
    get() = WebGLRenderingContext.DEPTH_BITS
actual inline val GL_STENCIL_BITS: GLenum
    get() = WebGLRenderingContext.STENCIL_BITS
actual inline val GL_POLYGON_OFFSET_UNITS: GLenum
    get() = WebGLRenderingContext.POLYGON_OFFSET_UNITS
actual inline val GL_POLYGON_OFFSET_FACTOR: GLenum
    get() = WebGLRenderingContext.POLYGON_OFFSET_FACTOR
actual inline val GL_TEXTURE_BINDING_2D: GLenum
    get() = WebGLRenderingContext.TEXTURE_BINDING_2D
actual inline val GL_SAMPLE_BUFFERS: GLenum
    get() = WebGLRenderingContext.SAMPLE_BUFFERS
actual inline val GL_SAMPLES: GLenum
    get() = WebGLRenderingContext.SAMPLES
actual inline val GL_SAMPLE_COVERAGE_VALUE: GLenum
    get() = WebGLRenderingContext.SAMPLE_COVERAGE_VALUE
actual inline val GL_SAMPLE_COVERAGE_INVERT: GLenum
    get() = WebGLRenderingContext.SAMPLE_COVERAGE_INVERT
actual inline val GL_DONT_CARE: GLenum
    get() = WebGLRenderingContext.DONT_CARE
actual inline val GL_FASTEST: GLenum
    get() = WebGLRenderingContext.FASTEST
actual inline val GL_NICEST: GLenum
    get() = WebGLRenderingContext.NICEST
actual inline val GL_GENERATE_MIPMAP_HINT: GLenum
    get() = WebGLRenderingContext.GENERATE_MIPMAP_HINT
actual inline val GL_BYTE: GLenum
    get() = WebGLRenderingContext.BYTE
actual inline val GL_UNSIGNED_BYTE: GLenum
    get() = WebGLRenderingContext.UNSIGNED_BYTE
actual inline val GL_SHORT: GLenum
    get() = WebGLRenderingContext.SHORT
actual inline val GL_UNSIGNED_SHORT: GLenum
    get() = WebGLRenderingContext.UNSIGNED_SHORT
actual inline val GL_INT: GLenum
    get() = WebGLRenderingContext.INT
actual inline val GL_UNSIGNED_INT: GLenum
    get() = WebGLRenderingContext.UNSIGNED_INT
actual inline val GL_FLOAT: GLenum
    get() = WebGLRenderingContext.FLOAT
actual inline val GL_DEPTH_COMPONENT: GLenum
    get() = WebGLRenderingContext.DEPTH_COMPONENT
actual inline val GL_ALPHA: GLenum
    get() = WebGLRenderingContext.ALPHA
actual inline val GL_RGB: GLenum
    get() = WebGLRenderingContext.RGB
actual inline val GL_RGBA: GLenum
    get() = WebGLRenderingContext.RGBA
actual inline val GL_LUMINANCE: GLenum
    get() = WebGLRenderingContext.LUMINANCE
actual inline val GL_LUMINANCE_ALPHA: GLenum
    get() = WebGLRenderingContext.LUMINANCE_ALPHA
actual inline val GL_UNSIGNED_SHORT_4_4_4_4: GLenum
    get() = WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4
actual inline val GL_UNSIGNED_SHORT_5_5_5_1: GLenum
    get() = WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1
actual inline val GL_UNSIGNED_SHORT_5_6_5: GLenum
    get() = WebGLRenderingContext.UNSIGNED_SHORT_5_6_5
actual inline val GL_FRAGMENT_SHADER: GLenum
    get() = WebGLRenderingContext.FRAGMENT_SHADER
actual inline val GL_VERTEX_SHADER: GLenum
    get() = WebGLRenderingContext.VERTEX_SHADER
actual inline val GL_MAX_VERTEX_ATTRIBS: GLenum
    get() = WebGLRenderingContext.MAX_VERTEX_ATTRIBS
actual inline val GL_MAX_VERTEX_UNIFORM_VECTORS: GLenum
    get() = WebGLRenderingContext.MAX_VERTEX_UNIFORM_VECTORS
actual inline val GL_MAX_VARYING_VECTORS: GLenum
    get() = WebGLRenderingContext.MAX_VARYING_VECTORS
actual inline val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    get() = WebGLRenderingContext.MAX_COMBINED_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    get() = WebGLRenderingContext.MAX_VERTEX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_TEXTURE_IMAGE_UNITS: GLenum
    get() = WebGLRenderingContext.MAX_TEXTURE_IMAGE_UNITS
actual inline val GL_MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    get() = WebGLRenderingContext.MAX_FRAGMENT_UNIFORM_VECTORS
actual inline val GL_SHADER_TYPE: GLenum
    get() = WebGLRenderingContext.SHADER_TYPE
actual inline val GL_DELETE_STATUS: GLenum
    get() = WebGLRenderingContext.DELETE_STATUS
actual inline val GL_LINK_STATUS: GLenum
    get() = WebGLRenderingContext.LINK_STATUS
actual inline val GL_VALIDATE_STATUS: GLenum
    get() = WebGLRenderingContext.VALIDATE_STATUS
actual inline val GL_ATTACHED_SHADERS: GLenum
    get() = WebGLRenderingContext.ATTACHED_SHADERS
actual inline val GL_ACTIVE_UNIFORMS: GLenum
    get() = WebGLRenderingContext.ACTIVE_UNIFORMS
actual inline val GL_ACTIVE_ATTRIBUTES: GLenum
    get() = WebGLRenderingContext.ACTIVE_ATTRIBUTES
actual inline val GL_SHADING_LANGUAGE_VERSION: GLenum
    get() = WebGLRenderingContext.SHADING_LANGUAGE_VERSION
actual inline val GL_CURRENT_PROGRAM: GLenum
    get() = WebGLRenderingContext.CURRENT_PROGRAM
actual inline val GL_NEVER: GLenum
    get() = WebGLRenderingContext.NEVER
actual inline val GL_LESS: GLenum
    get() = WebGLRenderingContext.LESS
actual inline val GL_EQUAL: GLenum
    get() = WebGLRenderingContext.EQUAL
actual inline val GL_LEQUAL: GLenum
    get() = WebGLRenderingContext.LEQUAL
actual inline val GL_GREATER: GLenum
    get() = WebGLRenderingContext.GREATER
actual inline val GL_NOTEQUAL: GLenum
    get() = WebGLRenderingContext.NOTEQUAL
actual inline val GL_GEQUAL: GLenum
    get() = WebGLRenderingContext.GEQUAL
actual inline val GL_ALWAYS: GLenum
    get() = WebGLRenderingContext.ALWAYS
actual inline val GL_KEEP: GLenum
    get() = WebGLRenderingContext.KEEP
actual inline val GL_REPLACE: GLenum
    get() = WebGLRenderingContext.REPLACE
actual inline val GL_INCR: GLenum
    get() = WebGLRenderingContext.INCR
actual inline val GL_DECR: GLenum
    get() = WebGLRenderingContext.DECR
actual inline val GL_INVERT: GLenum
    get() = WebGLRenderingContext.INVERT
actual inline val GL_INCR_WRAP: GLenum
    get() = WebGLRenderingContext.INCR_WRAP
actual inline val GL_DECR_WRAP: GLenum
    get() = WebGLRenderingContext.DECR_WRAP
actual inline val GL_VENDOR: GLenum
    get() = WebGLRenderingContext.VENDOR
actual inline val GL_RENDERER: GLenum
    get() = WebGLRenderingContext.RENDERER
actual inline val GL_VERSION: GLenum
    get() = WebGLRenderingContext.VERSION
actual inline val GL_NEAREST: GLenum
    get() = WebGLRenderingContext.NEAREST
actual inline val GL_LINEAR: GLenum
    get() = WebGLRenderingContext.LINEAR
actual inline val GL_NEAREST_MIPMAP_NEAREST: GLenum
    get() = WebGLRenderingContext.NEAREST_MIPMAP_NEAREST
actual inline val GL_LINEAR_MIPMAP_NEAREST: GLenum
    get() = WebGLRenderingContext.LINEAR_MIPMAP_NEAREST
actual inline val GL_NEAREST_MIPMAP_LINEAR: GLenum
    get() = WebGLRenderingContext.NEAREST_MIPMAP_LINEAR
actual inline val GL_LINEAR_MIPMAP_LINEAR: GLenum
    get() = WebGLRenderingContext.LINEAR_MIPMAP_LINEAR
actual inline val GL_TEXTURE_MAG_FILTER: GLenum
    get() = WebGLRenderingContext.TEXTURE_MAG_FILTER
actual inline val GL_TEXTURE_MIN_FILTER: GLenum
    get() = WebGLRenderingContext.TEXTURE_MIN_FILTER
actual inline val GL_TEXTURE_WRAP_S: GLenum
    get() = WebGLRenderingContext.TEXTURE_WRAP_S
actual inline val GL_TEXTURE_WRAP_T: GLenum
    get() = WebGLRenderingContext.TEXTURE_WRAP_T
actual inline val GL_TEXTURE_2D: GLenum
    get() = WebGLRenderingContext.TEXTURE_2D
actual inline val GL_TEXTURE: GLenum
    get() = WebGLRenderingContext.TEXTURE
actual inline val GL_TEXTURE_CUBE_MAP: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP
actual inline val GL_TEXTURE_BINDING_CUBE_MAP: GLenum
    get() = WebGLRenderingContext.TEXTURE_BINDING_CUBE_MAP
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y
actual inline val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z
actual inline val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    get() = WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z
actual inline val GL_MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    get() = WebGLRenderingContext.MAX_CUBE_MAP_TEXTURE_SIZE
actual inline val GL_TEXTURE0: GLenum
    get() = WebGLRenderingContext.TEXTURE0
actual inline val GL_TEXTURE1: GLenum
    get() = WebGLRenderingContext.TEXTURE1
actual inline val GL_TEXTURE2: GLenum
    get() = WebGLRenderingContext.TEXTURE2
actual inline val GL_TEXTURE3: GLenum
    get() = WebGLRenderingContext.TEXTURE3
actual inline val GL_TEXTURE4: GLenum
    get() = WebGLRenderingContext.TEXTURE4
actual inline val GL_TEXTURE5: GLenum
    get() = WebGLRenderingContext.TEXTURE5
actual inline val GL_TEXTURE6: GLenum
    get() = WebGLRenderingContext.TEXTURE6
actual inline val GL_TEXTURE7: GLenum
    get() = WebGLRenderingContext.TEXTURE7
actual inline val GL_TEXTURE8: GLenum
    get() = WebGLRenderingContext.TEXTURE8
actual inline val GL_TEXTURE9: GLenum
    get() = WebGLRenderingContext.TEXTURE9
actual inline val GL_TEXTURE10: GLenum
    get() = WebGLRenderingContext.TEXTURE10
actual inline val GL_TEXTURE11: GLenum
    get() = WebGLRenderingContext.TEXTURE11
actual inline val GL_TEXTURE12: GLenum
    get() = WebGLRenderingContext.TEXTURE12
actual inline val GL_TEXTURE13: GLenum
    get() = WebGLRenderingContext.TEXTURE13
actual inline val GL_TEXTURE14: GLenum
    get() = WebGLRenderingContext.TEXTURE14
actual inline val GL_TEXTURE15: GLenum
    get() = WebGLRenderingContext.TEXTURE15
actual inline val GL_TEXTURE16: GLenum
    get() = WebGLRenderingContext.TEXTURE16
actual inline val GL_TEXTURE17: GLenum
    get() = WebGLRenderingContext.TEXTURE17
actual inline val GL_TEXTURE18: GLenum
    get() = WebGLRenderingContext.TEXTURE18
actual inline val GL_TEXTURE19: GLenum
    get() = WebGLRenderingContext.TEXTURE19
actual inline val GL_TEXTURE20: GLenum
    get() = WebGLRenderingContext.TEXTURE20
actual inline val GL_TEXTURE21: GLenum
    get() = WebGLRenderingContext.TEXTURE21
actual inline val GL_TEXTURE22: GLenum
    get() = WebGLRenderingContext.TEXTURE22
actual inline val GL_TEXTURE23: GLenum
    get() = WebGLRenderingContext.TEXTURE23
actual inline val GL_TEXTURE24: GLenum
    get() = WebGLRenderingContext.TEXTURE24
actual inline val GL_TEXTURE25: GLenum
    get() = WebGLRenderingContext.TEXTURE25
actual inline val GL_TEXTURE26: GLenum
    get() = WebGLRenderingContext.TEXTURE26
actual inline val GL_TEXTURE27: GLenum
    get() = WebGLRenderingContext.TEXTURE27
actual inline val GL_TEXTURE28: GLenum
    get() = WebGLRenderingContext.TEXTURE28
actual inline val GL_TEXTURE29: GLenum
    get() = WebGLRenderingContext.TEXTURE29
actual inline val GL_TEXTURE30: GLenum
    get() = WebGLRenderingContext.TEXTURE30
actual inline val GL_TEXTURE31: GLenum
    get() = WebGLRenderingContext.TEXTURE31
actual inline val GL_ACTIVE_TEXTURE: GLenum
    get() = WebGLRenderingContext.ACTIVE_TEXTURE
actual inline val GL_REPEAT: GLenum
    get() = WebGLRenderingContext.REPEAT
actual inline val GL_CLAMP_TO_EDGE: GLenum
    get() = WebGLRenderingContext.CLAMP_TO_EDGE
actual inline val GL_MIRRORED_REPEAT: GLenum
    get() = WebGLRenderingContext.MIRRORED_REPEAT
actual inline val GL_FLOAT_VEC2: GLenum
    get() = WebGLRenderingContext.FLOAT_VEC2
actual inline val GL_FLOAT_VEC3: GLenum
    get() = WebGLRenderingContext.FLOAT_VEC3
actual inline val GL_FLOAT_VEC4: GLenum
    get() = WebGLRenderingContext.FLOAT_VEC4
actual inline val GL_INT_VEC2: GLenum
    get() = WebGLRenderingContext.INT_VEC2
actual inline val GL_INT_VEC3: GLenum
    get() = WebGLRenderingContext.INT_VEC3
actual inline val GL_INT_VEC4: GLenum
    get() = WebGLRenderingContext.INT_VEC4
actual inline val GL_BOOL: GLenum
    get() = WebGLRenderingContext.BOOL
actual inline val GL_BOOL_VEC2: GLenum
    get() = WebGLRenderingContext.BOOL_VEC2
actual inline val GL_BOOL_VEC3: GLenum
    get() = WebGLRenderingContext.BOOL_VEC3
actual inline val GL_BOOL_VEC4: GLenum
    get() = WebGLRenderingContext.BOOL_VEC4
actual inline val GL_FLOAT_MAT2: GLenum
    get() = WebGLRenderingContext.FLOAT_MAT2
actual inline val GL_FLOAT_MAT3: GLenum
    get() = WebGLRenderingContext.FLOAT_MAT3
actual inline val GL_FLOAT_MAT4: GLenum
    get() = WebGLRenderingContext.FLOAT_MAT4
actual inline val GL_SAMPLER_2D: GLenum
    get() = WebGLRenderingContext.SAMPLER_2D
actual inline val GL_SAMPLER_CUBE: GLenum
    get() = WebGLRenderingContext.SAMPLER_CUBE
actual inline val GL_VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_ENABLED
actual inline val GL_VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_SIZE
actual inline val GL_VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_STRIDE
actual inline val GL_VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_TYPE
actual inline val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_NORMALIZED
actual inline val GL_VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER
actual inline val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    get() = WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING
actual inline val GL_IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    get() = WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_TYPE
actual inline val GL_IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    get() = WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_FORMAT
actual inline val GL_COMPILE_STATUS: GLenum
    get() = WebGLRenderingContext.COMPILE_STATUS
actual inline val GL_LOW_FLOAT: GLenum
    get() = WebGLRenderingContext.LOW_FLOAT
actual inline val GL_MEDIUM_FLOAT: GLenum
    get() = WebGLRenderingContext.MEDIUM_FLOAT
actual inline val GL_HIGH_FLOAT: GLenum
    get() = WebGLRenderingContext.HIGH_FLOAT
actual inline val GL_LOW_INT: GLenum
    get() = WebGLRenderingContext.LOW_INT
actual inline val GL_MEDIUM_INT: GLenum
    get() = WebGLRenderingContext.MEDIUM_INT
actual inline val GL_HIGH_INT: GLenum
    get() = WebGLRenderingContext.HIGH_INT
actual inline val GL_FRAMEBUFFER: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER
actual inline val GL_RENDERBUFFER: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER
actual inline val GL_RGBA4: GLenum
    get() = WebGLRenderingContext.RGBA4
actual inline val GL_RGB5_A1: GLenum
    get() = WebGLRenderingContext.RGB5_A1
actual inline val GL_RGB565: GLenum
    get() = WebGLRenderingContext.RGB565
actual inline val GL_DEPTH_COMPONENT16: GLenum
    get() = WebGLRenderingContext.DEPTH_COMPONENT16
actual inline val GL_STENCIL_INDEX8: GLenum
    get() = WebGLRenderingContext.STENCIL_INDEX8
actual inline val GL_RENDERBUFFER_WIDTH: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_WIDTH
actual inline val GL_RENDERBUFFER_HEIGHT: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_HEIGHT
actual inline val GL_RENDERBUFFER_INTERNAL_FORMAT: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_INTERNAL_FORMAT
actual inline val GL_RENDERBUFFER_RED_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_RED_SIZE
actual inline val GL_RENDERBUFFER_GREEN_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_GREEN_SIZE
actual inline val GL_RENDERBUFFER_BLUE_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_BLUE_SIZE
actual inline val GL_RENDERBUFFER_ALPHA_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_ALPHA_SIZE
actual inline val GL_RENDERBUFFER_DEPTH_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_DEPTH_SIZE
actual inline val GL_RENDERBUFFER_STENCIL_SIZE: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE
actual inline val GL_COLOR_ATTACHMENT0: GLenum
    get() = WebGLRenderingContext.COLOR_ATTACHMENT0
actual inline val GL_DEPTH_ATTACHMENT: GLenum
    get() = WebGLRenderingContext.DEPTH_ATTACHMENT
actual inline val GL_STENCIL_ATTACHMENT: GLenum
    get() = WebGLRenderingContext.STENCIL_ATTACHMENT
actual inline val GL_NONE: GLenum
    get() = WebGLRenderingContext.NONE
actual inline val GL_FRAMEBUFFER_COMPLETE: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_COMPLETE
actual inline val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_DIMENSIONS
actual inline val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_UNSUPPORTED
actual inline val GL_FRAMEBUFFER_BINDING: GLenum
    get() = WebGLRenderingContext.FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_BINDING: GLenum
    get() = WebGLRenderingContext.RENDERBUFFER_BINDING
actual inline val GL_MAX_RENDERBUFFER_SIZE: GLenum
    get() = WebGLRenderingContext.MAX_RENDERBUFFER_SIZE
actual inline val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum
    get() = WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION

actual inline fun GLES20.glActiveTexture(
    texture: GLenum
) = activeTexture(
    texture
)

actual inline fun GLES20.glAttachShader(
    program: GLProgram, shader: GLShader
) = attachShader(
    program.obj, shader.obj
)

actual inline fun GLES20.glBindAttribLocation(
    program: GLProgram, index: GLuint, name: DOMString
) = bindAttribLocation(
    program.obj, index.toInt(), name
)

actual inline fun GLES20.glBindBuffer(
    target: GLenum, buffer: GLBuffer
) = bindBuffer(
    target, buffer.obj
)

actual inline fun GLES20.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
) = bindFramebuffer(
    target, framebuffer.obj
)

actual inline fun GLES20.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
) = bindRenderbuffer(
    target, renderbuffer.obj
)

actual inline fun GLES20.glBindTexture(
    target: GLenum, texture: GLTexture
) = bindTexture(
    target, texture.obj
)

actual inline fun GLES20.glBlendColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = blendColor(
    red, green, blue, alpha
)

actual inline fun GLES20.glBlendEquation(
    mode: GLenum
) = blendEquation(
    mode
)

actual inline fun GLES20.glBlendEquationSeparate(
    modeRGB: GLenum, modeAlpha: GLenum
) = blendEquationSeparate(
    modeRGB, modeAlpha
)

actual inline fun GLES20.glBlendFunc(
    sfactor: GLenum, dfactor: GLenum
) = blendFunc(
    sfactor, dfactor
)

actual inline fun GLES20.glBlendFuncSeparate(
    srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum
) = blendFuncSeparate(
    srcRGB, dstRGB, srcAlpha, dstAlpha
)

actual inline fun GLES20.glBufferData(
    target: GLenum, size: GLsizeiptr, usage: GLenum
) = bufferData(
    target, size.toInt(), usage
)

actual inline fun GLES20.glBufferData(
    target: GLenum, data: DataBuffer, usage: GLenum
) = data.read { buffer ->
    bufferData(
        target, buffer, usage
    )
}

actual inline fun GLES20.glBufferSubData(
    target: GLenum, offset: GLintptr, data: DataBuffer
) = data.read { buffer ->
    bufferSubData(
        target, offset.toInt(), buffer
    )
}

actual inline fun GLES20.glCheckFramebufferStatus(
    target: GLenum
) = checkFramebufferStatus(
    target
)

actual inline fun GLES20.glClear(
    mask: GLbitfield
) = clear(
    mask
)

actual inline fun GLES20.glClearColor(
    red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf
) = clearColor(
    red, green, blue, alpha
)

actual inline fun GLES20.glClearDepth(
    depth: GLclampf
) = clearDepth(
    depth
)

actual inline fun GLES20.glClearStencil(
    s: GLint
) = clearStencil(
    s
)

actual inline fun GLES20.glColorMask(
    red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean
) = colorMask(
    red, green, blue, alpha
)

actual inline fun GLES20.glCompileShader(
    shader: GLShader
) = compileShader(
    shader.obj
)

actual inline fun GLES20.glCompressedTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, data: DataBuffer
) = data.read { buffer ->
    compressedTexImage2D(
        target, level, internalformat, width, height, border,
        buffer
    )
}

actual inline fun GLES20.glCompressedTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, data: DataBuffer
) = data.read { buffer ->
    compressedTexSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        buffer
    )
}

actual inline fun GLES20.glCopyTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
    width: GLsizei, height: GLsizei, border: GLint
) = copyTexImage2D(
    target, level, internalformat, x, y, width, height, border
)

actual inline fun GLES20.glCopyTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = copyTexSubImage2D(
    target, level, xoffset, yoffset, x, y, width, height
)

actual inline fun GLES20.glCreateBuffer(
) = createBuffer(
).toGLBuffer()

actual inline fun GLES20.glCreateFramebuffer(
) = createFramebuffer(
).toGLFramebuffer()

actual inline fun GLES20.glCreateProgram(
) = createProgram(
).toGLProgram()

actual inline fun GLES20.glCreateRenderbuffer(
) = createRenderbuffer(
).toGLRenderbuffer()

actual inline fun GLES20.glCreateShader(
    type: GLenum
) = createShader(
    type
).toGLShader()

actual inline fun GLES20.glCreateTexture(
) = createTexture(
).toGLTexture()

actual inline fun GLES20.glCullFace(
    mode: GLenum
) = cullFace(
    mode
)

actual inline fun GLES20.glDeleteBuffer(
    buffer: GLBuffer
) = deleteBuffer(
    buffer.obj
)

actual inline fun GLES20.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
) = deleteFramebuffer(
    framebuffer.obj
)

actual inline fun GLES20.glDeleteProgram(
    program: GLProgram
) = deleteProgram(
    program.obj
)

actual inline fun GLES20.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
) = deleteRenderbuffer(
    renderbuffer.obj
)

actual inline fun GLES20.glDeleteShader(
    shader: GLShader
) = deleteShader(
    shader.obj
)

actual inline fun GLES20.glDeleteTexture(
    texture: GLTexture
) = deleteTexture(
    texture.obj
)

actual inline fun GLES20.glDepthFunc(
    func: GLenum
) = depthFunc(
    func
)

actual inline fun GLES20.glDepthMask(
    flag: GLboolean
) = depthMask(
    flag
)

actual inline fun GLES20.glDepthRange(
    zNear: GLclampf, zFar: GLclampf
) = depthRange(
    zNear, zFar
)

actual inline fun GLES20.glDetachShader(
    program: GLProgram, shader: GLShader
) = detachShader(
    program.obj, shader.obj
)

actual inline fun GLES20.glDisable(
    cap: GLenum
) = disable(
    cap
)

actual inline fun GLES20.glDisableVertexAttribArray(
    index: GLuint
) = disableVertexAttribArray(
    index.toInt()
)

actual inline fun GLES20.glDrawArrays(
    mode: GLenum, first: GLint, count: GLsizei
) = drawArrays(
    mode, first, count
)

actual inline fun GLES20.glDrawElements(
    mode: GLenum, count: GLsizei, type: GLenum, offset: GLintptr
) = drawElements(
    mode, count, type, offset.toInt()
)

actual inline fun GLES20.glEnable(
    cap: GLenum
) = enable(
    cap
)

actual inline fun GLES20.glEnableVertexAttribArray(
    index: GLuint
) = enableVertexAttribArray(
    index.toInt()
)

actual inline fun GLES20.glFinish(
) = finish(
)

actual inline fun GLES20.glFlush(
) = flush(
)

actual inline fun GLES20.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
) = framebufferRenderbuffer(
    target, attachment, renderbuffertarget,
    renderbuffer.obj
)

actual inline fun GLES20.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
) = framebufferTexture2D(
    target, attachment, textarget, texture.obj, level
)

actual inline fun GLES20.glFrontFace(
    mode: GLenum
) = frontFace(
    mode
)

actual inline fun GLES20.glGenerateMipmap(
    target: GLenum
) = generateMipmap(
    target
)

actual inline fun GLES20.glGetAttachedShaders(
    program: GLProgram, count: sequence_GLsizei, shaders: sequence_GLShader
) {
    writeArrayParameter(
        shaders, getAttachedShaders(
            program.obj
        ) ?: return
    )
}

actual inline fun GLES20.glGetAttribLocation(
    program: GLProgram, name: DOMString
) = getAttribLocation(
    program.obj, name
)

actual inline fun GLES20.glGetBufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getBufferParameter(
        target, pname
    )
)

actual inline fun GLES20.glGetBooleanv(
    pname: GLenum, data: sequence_GLboolean
) = writeArrayParameter(
    data, getParameter(
        pname
    )
)

actual inline fun GLES20.glGetFloatv(
    pname: GLenum, data: sequence_GLfloat
) = writeArrayParameter(
    data, getParameter(
        pname
    )
)

actual inline fun GLES20.glGetIntegerv(
    pname: GLenum, data: sequence_GLint
) = writeArrayParameter(
    data, getParameter(
        pname
    )
)

actual inline fun GLES20.glGetError(
) = getError(
)

actual inline fun GLES20.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getFramebufferAttachmentParameter(
        target, attachment, pname
    )
)

actual inline fun GLES20.glGetProgramb(
    program: GLProgram, pname: GLenum
): GLboolean = getProgramParameter(
    program.obj, pname
).asDynamic()

actual inline fun GLES20.glGetProgramiv(
    program: GLProgram, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getProgramParameter(
        program.obj, pname
    )
)

actual inline fun GLES20.glGetProgramInfoLog(
    program: GLProgram
) = getProgramInfoLog(
    program.obj
)

actual inline fun GLES20.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getRenderbufferParameter(
        target, pname
    )
)

actual inline fun GLES20.glGetShaderiv(
    shader: GLShader, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getShaderParameter(
        shader.obj, pname
    )
)

actual inline fun GLES20.glGetShaderInfoLog(
    shader: GLShader
) = getShaderInfoLog(
    shader.obj
)

actual inline fun GLES20.glGetShaderSource(
    shader: GLShader
) = getShaderSource(
    shader.obj
)

actual inline fun GLES20.glGetString(
    pname: GLenum
) = getParameter(
    pname
).asDynamic()

actual inline fun GLES20.glGetTexParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getTexParameter(
        target, pname
    )
)

actual inline fun GLES20.glGetUniformfv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLfloat
) = writeArrayParameter(
    params, getUniform(
        program.obj, location.obj
    )
)

actual inline fun GLES20.glGetUniformiv(
    program: GLProgram, location: GLUniformLocation, params: sequence_GLint
) = writeArrayParameter(
    params, getUniform(
        program.obj, location.obj
    )
)

actual inline fun GLES20.glGetUniformLocation(
    program: GLProgram, name: DOMString
) = getUniformLocation(
    program.obj, name
).toGLUniformLocation()

actual inline fun GLES20.glGetVertexAttribfv(
    index: GLuint, pname: GLenum, params: sequence_GLfloat
) = writeArrayParameter(
    params, getVertexAttrib(
        index.toInt(), pname
    )
)

actual inline fun GLES20.glGetVertexAttribiv(
    index: GLuint, pname: GLenum, params: sequence_GLint
) = writeArrayParameter(
    params, getVertexAttrib(
        index.toInt(), pname
    )
)

actual inline fun GLES20.glHint(
    target: GLenum, mode: GLenum
) = hint(
    target, mode
)

actual inline fun GLES20.glIsBuffer(
    buffer: GLBuffer
) = isBuffer(
    buffer.obj
)

actual inline fun GLES20.glIsEnabled(
    cap: GLenum
) = isEnabled(
    cap
)

actual inline fun GLES20.glIsFramebuffer(
    framebuffer: GLFramebuffer
) = isFramebuffer(
    framebuffer.obj
)

actual inline fun GLES20.glIsProgram(
    program: GLProgram
) = isProgram(
    program.obj
)

actual inline fun GLES20.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
) = isRenderbuffer(
    renderbuffer.obj
)

actual inline fun GLES20.glIsShader(
    shader: GLShader
) = isShader(
    shader.obj
)

actual inline fun GLES20.glIsTexture(
    texture: GLTexture
) = isTexture(
    texture.obj
)

actual inline fun GLES20.glLineWidth(
    width: GLfloat
) = lineWidth(
    width
)

actual inline fun GLES20.glLinkProgram(
    program: GLProgram
) = linkProgram(
    program.obj
)

actual inline fun GLES20.glPixelStorei(
    pname: GLenum, param: GLint
) = pixelStorei(
    pname, param
)

actual inline fun GLES20.glPolygonOffset(
    factor: GLfloat, units: GLfloat
) = polygonOffset(
    factor, units
)

actual inline fun GLES20.glReadPixels(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum,
    type: GLenum, pixels: DataBuffer
) = pixels.write(type) { buffer ->
    readPixels(
        x, y, width, height, format, type, buffer
    )
}

actual inline fun GLES20.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
) = renderbufferStorage(
    target, internalformat, width, height
)

actual inline fun GLES20.glSampleCoverage(
    value: GLclampf, invert: GLboolean
) = sampleCoverage(
    value, invert
)

actual inline fun GLES20.glScissor(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = scissor(
    x, y, width, height
)

actual inline fun GLES20.glShaderSource(
    shader: GLShader, source: DOMString
) = shaderSource(
    shader.obj, source
)

actual inline fun GLES20.glStencilFunc(
    func: GLenum, ref: GLint, mask: GLuint
) = stencilFunc(
    func, ref, mask.toInt()
)

actual inline fun GLES20.glStencilFuncSeparate(
    face: GLenum, func: GLenum, ref: GLint, mask: GLuint
) = stencilFuncSeparate(
    face, func, ref, mask.toInt()
)

actual inline fun GLES20.glStencilMask(
    mask: GLuint
) = stencilMask(
    mask.toInt()
)

actual inline fun GLES20.glStencilMaskSeparate(
    face: GLenum, mask: GLuint
) = stencilMaskSeparate(
    face, mask.toInt()
)

actual inline fun GLES20.glStencilOp(
    fail: GLenum, zfail: GLenum, zpass: GLenum
) = stencilOp(
    fail, zfail, zpass
)

actual inline fun GLES20.glStencilOpSeparate(
    face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum
) = stencilOpSeparate(
    face, fail, zfail, zpass
)

actual inline fun GLES20.glTexImage2D(
    target: GLenum, level: GLint, internalformat: GLenum,
    width: GLsizei, height: GLsizei, border: GLint, format: GLenum,
    type: GLenum, pixels: DataBuffer?
) = pixels.readOrNull(type) { buffer ->
    texImage2D(
        target, level, internalformat, width, height, border,
        format, type, buffer
    )
}

actual inline fun GLES20.glTexParameterf(
    target: GLenum, pname: GLenum, param: GLfloat
) = texParameterf(
    target, pname, param
)

actual inline fun GLES20.glTexParameteri(
    target: GLenum, pname: GLenum, param: GLint
) = texParameteri(
    target, pname, param
)

actual inline fun GLES20.glTexSubImage2D(
    target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
    width: GLsizei, height: GLsizei, format: GLenum, type: GLenum,
    pixels: DataBuffer
) = pixels.read(type) { buffer ->
    texSubImage2D(
        target, level, xoffset, yoffset, width, height, format,
        type, buffer
    )
}

actual inline fun GLES20.glUniform1f(
    location: GLUniformLocation, x: GLfloat
) = uniform1f(
    location.obj, x
)

actual inline fun GLES20.glUniform1fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = uniform1fv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform1i(
    location: GLUniformLocation, x: GLint
) = uniform1i(
    location.obj, x
)

actual inline fun GLES20.glUniform1iv(
    location: GLUniformLocation, v: sequence_long
) = uniform1iv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform2f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat
) = uniform2f(
    location.obj, x, y
)

actual inline fun GLES20.glUniform2fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = uniform2fv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform2i(
    location: GLUniformLocation, x: GLint, y: GLint
) = uniform2i(
    location.obj, x, y
)

actual inline fun GLES20.glUniform2iv(
    location: GLUniformLocation, v: sequence_long
) = uniform2iv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform3f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat
) = uniform3f(
    location.obj, x, y, z
)

actual inline fun GLES20.glUniform3fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = uniform3fv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform3i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint
) = uniform3i(
    location.obj, x, y, z
)

actual inline fun GLES20.glUniform3iv(
    location: GLUniformLocation, v: sequence_long
) = uniform3iv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform4f(
    location: GLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = uniform4f(
    location.obj, x, y, z, w
)

actual inline fun GLES20.glUniform4fv(
    location: GLUniformLocation, v: sequence_GLfloat
) = uniform4fv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniform4i(
    location: GLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint
) = uniform4i(
    location.obj, x, y, z, w
)

actual inline fun GLES20.glUniform4iv(
    location: GLUniformLocation, v: sequence_long
) = uniform4iv(
    location.obj, v.asTypedArray()
)

actual inline fun GLES20.glUniformMatrix2fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = uniformMatrix2fv(
    location.obj, transpose, value.asTypedArray()
)

actual inline fun GLES20.glUniformMatrix3fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = uniformMatrix3fv(
    location.obj, transpose, value.asTypedArray()
)

actual inline fun GLES20.glUniformMatrix4fv(
    location: GLUniformLocation, transpose: GLboolean, value: sequence_GLfloat
) = uniformMatrix4fv(
    location.obj, transpose, value.asTypedArray()
)

actual inline fun GLES20.glUseProgram(
    program: GLProgram
) = useProgram(
    program.obj
)

actual inline fun GLES20.glValidateProgram(
    program: GLProgram
) = validateProgram(
    program.obj
)

actual inline fun GLES20.glVertexAttrib1f(
    indx: GLuint, x: GLfloat
) = vertexAttrib1f(
    indx.toInt(), x
)

actual inline fun GLES20.glVertexAttrib1fv(
    indx: GLuint, values: sequence_GLfloat
) = vertexAttrib1fv(
    indx.toInt(), values
)

actual inline fun GLES20.glVertexAttrib2f(
    indx: GLuint, x: GLfloat, y: GLfloat
) = vertexAttrib2f(
    indx.toInt(), x, y
)

actual inline fun GLES20.glVertexAttrib2fv(
    indx: GLuint, values: sequence_GLfloat
) = vertexAttrib2fv(
    indx.toInt(), values
)

actual inline fun GLES20.glVertexAttrib3f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat
) = vertexAttrib3f(
    indx.toInt(), x, y, z
)

actual inline fun GLES20.glVertexAttrib3fv(
    indx: GLuint, values: sequence_GLfloat
) = vertexAttrib3fv(
    indx.toInt(), values
)

actual inline fun GLES20.glVertexAttrib4f(
    indx: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat
) = vertexAttrib4f(
    indx.toInt(), x, y, z, w
)

actual inline fun GLES20.glVertexAttrib4fv(
    indx: GLuint, values: sequence_GLfloat
) = vertexAttrib4fv(
    indx.toInt(), values
)

actual inline fun GLES20.glVertexAttribPointer(
    indx: GLuint, size: GLint, type: GLenum, normalized: GLboolean,
    stride: GLsizei, offset: GLintptr
) = vertexAttribPointer(
    indx.toInt(), size, type, normalized, stride, offset.toInt()
)

actual inline fun GLES20.glViewport(
    x: GLint, y: GLint, width: GLsizei, height: GLsizei
) = viewport(
    x, y, width, height
)
