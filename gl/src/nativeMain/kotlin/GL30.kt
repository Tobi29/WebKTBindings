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

package net.gitout.ktbindings.gl

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.DataBuffer
import net.gitout.ktbindings.utils.toCPointer
import net.gitout.ktbindings.utils.write

actual inline val GL_FRAMEBUFFER: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER
actual inline val GL_RENDERBUFFER: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER
actual inline val GL_STENCIL_INDEX: GLenum
    get() = platform.OpenGL3.GL_STENCIL_INDEX
actual inline val GL_STENCIL_INDEX8: GLenum
    get() = platform.OpenGL3.GL_STENCIL_INDEX8
actual inline val GL_RENDERBUFFER_WIDTH: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_WIDTH
actual inline val GL_RENDERBUFFER_HEIGHT: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_HEIGHT
actual inline val GL_RENDERBUFFER_INTERNAL_FORMAT: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_INTERNAL_FORMAT
actual inline val GL_RENDERBUFFER_RED_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_RED_SIZE
actual inline val GL_RENDERBUFFER_GREEN_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_GREEN_SIZE
actual inline val GL_RENDERBUFFER_BLUE_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_BLUE_SIZE
actual inline val GL_RENDERBUFFER_ALPHA_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_ALPHA_SIZE
actual inline val GL_RENDERBUFFER_DEPTH_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_DEPTH_SIZE
actual inline val GL_RENDERBUFFER_STENCIL_SIZE: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE
actual inline val GL_COLOR_ATTACHMENT0: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT0
actual inline val GL_DEPTH_ATTACHMENT: GLenum
    get() = platform.OpenGL3.GL_DEPTH_ATTACHMENT
actual inline val GL_STENCIL_ATTACHMENT: GLenum
    get() = platform.OpenGL3.GL_STENCIL_ATTACHMENT
actual inline val GL_FRAMEBUFFER_COMPLETE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_COMPLETE
actual inline val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT
actual inline val GL_FRAMEBUFFER_UNSUPPORTED: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_UNSUPPORTED
actual inline val GL_FRAMEBUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_BINDING
actual inline val GL_MAX_RENDERBUFFER_SIZE: GLenum
    get() = platform.OpenGL3.GL_MAX_RENDERBUFFER_SIZE
actual inline val GL_INVALID_FRAMEBUFFER_OPERATION: GLenum
    get() = platform.OpenGL3.GL_INVALID_FRAMEBUFFER_OPERATION
actual inline val GL_COMPARE_REF_TO_TEXTURE: GLenum
    get() = platform.OpenGL3.GL_COMPARE_REF_TO_TEXTURE
actual inline val GL_RGBA32F: GLenum
    get() = platform.OpenGL3.GL_RGBA32F
actual inline val GL_RGB32F: GLenum
    get() = platform.OpenGL3.GL_RGB32F
actual inline val GL_RGBA16F: GLenum
    get() = platform.OpenGL3.GL_RGBA16F
actual inline val GL_RGB16F: GLenum
    get() = platform.OpenGL3.GL_RGB16F
actual inline val GL_VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ATTRIB_ARRAY_INTEGER
actual inline val GL_MAX_ARRAY_TEXTURE_LAYERS: GLenum
    get() = platform.OpenGL3.GL_MAX_ARRAY_TEXTURE_LAYERS
actual inline val GL_MIN_PROGRAM_TEXEL_OFFSET: GLenum
    get() = platform.OpenGL3.GL_MIN_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_PROGRAM_TEXEL_OFFSET: GLenum
    get() = platform.OpenGL3.GL_MAX_PROGRAM_TEXEL_OFFSET
actual inline val GL_MAX_VARYING_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_VARYING_COMPONENTS
actual inline val GL_TEXTURE_2D_ARRAY: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_2D_ARRAY
actual inline val GL_TEXTURE_BINDING_2D_ARRAY: GLenum
    get() = platform.OpenGL3.GL_TEXTURE_BINDING_2D_ARRAY
actual inline val GL_R11F_G11F_B10F: GLenum
    get() = platform.OpenGL3.GL_R11F_G11F_B10F
actual inline val GL_UNSIGNED_INT_10F_11F_11F_REV: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_10F_11F_11F_REV
actual inline val GL_RGB9_E5: GLenum
    get() = platform.OpenGL3.GL_RGB9_E5
actual inline val GL_UNSIGNED_INT_5_9_9_9_REV: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_5_9_9_9_REV
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BUFFER_MODE
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS
actual inline val GL_TRANSFORM_FEEDBACK_VARYINGS: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_VARYINGS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_START: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BUFFER_START
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BUFFER_SIZE
actual inline val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN
actual inline val GL_RASTERIZER_DISCARD: GLenum
    get() = platform.OpenGL3.GL_RASTERIZER_DISCARD
actual inline val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS
actual inline val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
    get() = platform.OpenGL3.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS
actual inline val GL_INTERLEAVED_ATTRIBS: GLenum
    get() = platform.OpenGL3.GL_INTERLEAVED_ATTRIBS
actual inline val GL_SEPARATE_ATTRIBS: GLenum
    get() = platform.OpenGL3.GL_SEPARATE_ATTRIBS
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BUFFER
actual inline val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING
actual inline val GL_RGBA32UI: GLenum
    get() = platform.OpenGL3.GL_RGBA32UI
actual inline val GL_RGB32UI: GLenum
    get() = platform.OpenGL3.GL_RGB32UI
actual inline val GL_RGBA16UI: GLenum
    get() = platform.OpenGL3.GL_RGBA16UI
actual inline val GL_RGB16UI: GLenum
    get() = platform.OpenGL3.GL_RGB16UI
actual inline val GL_RGBA8UI: GLenum
    get() = platform.OpenGL3.GL_RGBA8UI
actual inline val GL_RGB8UI: GLenum
    get() = platform.OpenGL3.GL_RGB8UI
actual inline val GL_RGBA32I: GLenum
    get() = platform.OpenGL3.GL_RGBA32I
actual inline val GL_RGB32I: GLenum
    get() = platform.OpenGL3.GL_RGB32I
actual inline val GL_RGBA16I: GLenum
    get() = platform.OpenGL3.GL_RGBA16I
actual inline val GL_RGB16I: GLenum
    get() = platform.OpenGL3.GL_RGB16I
actual inline val GL_RGBA8I: GLenum
    get() = platform.OpenGL3.GL_RGBA8I
actual inline val GL_RGB8I: GLenum
    get() = platform.OpenGL3.GL_RGB8I
actual inline val GL_RED_INTEGER: GLenum
    get() = platform.OpenGL3.GL_RED_INTEGER
actual inline val GL_RGB_INTEGER: GLenum
    get() = platform.OpenGL3.GL_RGB_INTEGER
actual inline val GL_RGBA_INTEGER: GLenum
    get() = platform.OpenGL3.GL_RGBA_INTEGER
actual inline val GL_SAMPLER_2D_ARRAY: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_2D_ARRAY
actual inline val GL_SAMPLER_2D_ARRAY_SHADOW: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_2D_ARRAY_SHADOW
actual inline val GL_SAMPLER_CUBE_SHADOW: GLenum
    get() = platform.OpenGL3.GL_SAMPLER_CUBE_SHADOW
actual inline val GL_UNSIGNED_INT_VEC2: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_VEC2
actual inline val GL_UNSIGNED_INT_VEC3: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_VEC3
actual inline val GL_UNSIGNED_INT_VEC4: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_VEC4
actual inline val GL_INT_SAMPLER_2D: GLenum
    get() = platform.OpenGL3.GL_INT_SAMPLER_2D
actual inline val GL_INT_SAMPLER_3D: GLenum
    get() = platform.OpenGL3.GL_INT_SAMPLER_3D
actual inline val GL_INT_SAMPLER_CUBE: GLenum
    get() = platform.OpenGL3.GL_INT_SAMPLER_CUBE
actual inline val GL_INT_SAMPLER_2D_ARRAY: GLenum
    get() = platform.OpenGL3.GL_INT_SAMPLER_2D_ARRAY
actual inline val GL_UNSIGNED_INT_SAMPLER_2D: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_SAMPLER_2D
actual inline val GL_UNSIGNED_INT_SAMPLER_3D: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_SAMPLER_3D
actual inline val GL_UNSIGNED_INT_SAMPLER_CUBE: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_SAMPLER_CUBE
actual inline val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY
actual inline val GL_DEPTH_COMPONENT32F: GLenum
    get() = platform.OpenGL3.GL_DEPTH_COMPONENT32F
actual inline val GL_DEPTH32F_STENCIL8: GLenum
    get() = platform.OpenGL3.GL_DEPTH32F_STENCIL8
actual inline val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
    get() = platform.OpenGL3.GL_FLOAT_32_UNSIGNED_INT_24_8_REV
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING
actual inline val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE
actual inline val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE
actual inline val GL_FRAMEBUFFER_DEFAULT: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_DEFAULT
actual inline val GL_DEPTH_STENCIL_ATTACHMENT: GLenum
    get() = platform.OpenGL3.GL_DEPTH_STENCIL_ATTACHMENT
actual inline val GL_DEPTH_STENCIL: GLenum
    get() = platform.OpenGL3.GL_DEPTH_STENCIL
actual inline val GL_UNSIGNED_INT_24_8: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_INT_24_8
actual inline val GL_DEPTH24_STENCIL8: GLenum
    get() = platform.OpenGL3.GL_DEPTH24_STENCIL8
actual inline val GL_UNSIGNED_NORMALIZED: GLenum
    get() = platform.OpenGL3.GL_UNSIGNED_NORMALIZED
actual inline val GL_DRAW_FRAMEBUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_DRAW_FRAMEBUFFER_BINDING
actual inline val GL_READ_FRAMEBUFFER: GLenum
    get() = platform.OpenGL3.GL_READ_FRAMEBUFFER
actual inline val GL_DRAW_FRAMEBUFFER: GLenum
    get() = platform.OpenGL3.GL_DRAW_FRAMEBUFFER
actual inline val GL_READ_FRAMEBUFFER_BINDING: GLenum
    get() = platform.OpenGL3.GL_READ_FRAMEBUFFER_BINDING
actual inline val GL_RENDERBUFFER_SAMPLES: GLenum
    get() = platform.OpenGL3.GL_RENDERBUFFER_SAMPLES
actual inline val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER
actual inline val GL_MAX_COLOR_ATTACHMENTS: GLenum
    get() = platform.OpenGL3.GL_MAX_COLOR_ATTACHMENTS
actual inline val GL_COLOR_ATTACHMENT1: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT1
actual inline val GL_COLOR_ATTACHMENT2: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT2
actual inline val GL_COLOR_ATTACHMENT3: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT3
actual inline val GL_COLOR_ATTACHMENT4: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT4
actual inline val GL_COLOR_ATTACHMENT5: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT5
actual inline val GL_COLOR_ATTACHMENT6: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT6
actual inline val GL_COLOR_ATTACHMENT7: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT7
actual inline val GL_COLOR_ATTACHMENT8: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT8
actual inline val GL_COLOR_ATTACHMENT9: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT9
actual inline val GL_COLOR_ATTACHMENT10: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT10
actual inline val GL_COLOR_ATTACHMENT11: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT11
actual inline val GL_COLOR_ATTACHMENT12: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT12
actual inline val GL_COLOR_ATTACHMENT13: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT13
actual inline val GL_COLOR_ATTACHMENT14: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT14
actual inline val GL_COLOR_ATTACHMENT15: GLenum
    get() = platform.OpenGL3.GL_COLOR_ATTACHMENT15
actual inline val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
    get() = platform.OpenGL3.GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE
actual inline val GL_MAX_SAMPLES: GLenum
    get() = platform.OpenGL3.GL_MAX_SAMPLES
actual inline val GL_HALF_FLOAT: GLenum
    get() = platform.OpenGL3.GL_HALF_FLOAT
actual inline val GL_RG: GLenum
    get() = platform.OpenGL3.GL_RG
actual inline val GL_RG_INTEGER: GLenum
    get() = platform.OpenGL3.GL_RG_INTEGER
actual inline val GL_R8: GLenum
    get() = platform.OpenGL3.GL_R8
actual inline val GL_RG8: GLenum
    get() = platform.OpenGL3.GL_RG8
actual inline val GL_R16F: GLenum
    get() = platform.OpenGL3.GL_R16F
actual inline val GL_R32F: GLenum
    get() = platform.OpenGL3.GL_R32F
actual inline val GL_RG16F: GLenum
    get() = platform.OpenGL3.GL_RG16F
actual inline val GL_RG32F: GLenum
    get() = platform.OpenGL3.GL_RG32F
actual inline val GL_R8I: GLenum
    get() = platform.OpenGL3.GL_R8I
actual inline val GL_R8UI: GLenum
    get() = platform.OpenGL3.GL_R8UI
actual inline val GL_R16I: GLenum
    get() = platform.OpenGL3.GL_R16I
actual inline val GL_R16UI: GLenum
    get() = platform.OpenGL3.GL_R16UI
actual inline val GL_R32I: GLenum
    get() = platform.OpenGL3.GL_R32I
actual inline val GL_R32UI: GLenum
    get() = platform.OpenGL3.GL_R32UI
actual inline val GL_RG8I: GLenum
    get() = platform.OpenGL3.GL_RG8I
actual inline val GL_RG8UI: GLenum
    get() = platform.OpenGL3.GL_RG8UI
actual inline val GL_RG16I: GLenum
    get() = platform.OpenGL3.GL_RG16I
actual inline val GL_RG16UI: GLenum
    get() = platform.OpenGL3.GL_RG16UI
actual inline val GL_RG32I: GLenum
    get() = platform.OpenGL3.GL_RG32I
actual inline val GL_RG32UI: GLenum
    get() = platform.OpenGL3.GL_RG32UI
actual inline val GL_VERTEX_ARRAY_BINDING: GLenum
    get() = platform.OpenGL3.GL_VERTEX_ARRAY_BINDING
actual inline val GL_CONTEXT_FLAGS: GLenum
    get() = platform.OpenGL3.GL_CONTEXT_FLAGS

actual inline fun GL30.glBindFramebuffer(
    target: GLenum, framebuffer: GLFramebuffer
) = platform.OpenGL3.glBindFramebuffer(
    target.toUInt(), framebuffer.toUInt()
)

actual inline fun GL30.glBindRenderbuffer(
    target: GLenum, renderbuffer: GLRenderbuffer
) = platform.OpenGL3.glBindRenderbuffer(
    target.toUInt(), renderbuffer.toUInt()
)

actual inline fun GL30.glCheckFramebufferStatus(
    target: GLenum
) = platform.OpenGL3.glCheckFramebufferStatus(
    target.toUInt()
).toInt()

actual inline fun GL30.glCreateFramebuffer(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenFramebuffers(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL30.glCreateRenderbuffer(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenRenderbuffers(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL30.glDeleteFramebuffer(
    framebuffer: GLFramebuffer
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = framebuffer.toUInt()
    platform.OpenGL3.glDeleteFramebuffers(
        1, buffer.ptr
    )
}

actual inline fun GL30.glDeleteRenderbuffer(
    renderbuffer: GLRenderbuffer
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = renderbuffer.toUInt()
    platform.OpenGL3.glDeleteRenderbuffers(
        1, buffer.ptr
    )
}

actual inline fun GL30.glFramebufferRenderbuffer(
    target: GLenum, attachment: GLenum, renderbuffertarget: GLenum,
    renderbuffer: GLRenderbuffer
) = platform.OpenGL3.glFramebufferRenderbuffer(
    target.toUInt(), attachment.toUInt(), renderbuffertarget.toUInt(),
    renderbuffer.toUInt()
)

actual inline fun GL30.glFramebufferTexture2D(
    target: GLenum, attachment: GLenum, textarget: GLenum,
    texture: GLTexture, level: GLint
) = platform.OpenGL3.glFramebufferTexture2D(
    target.toUInt(), attachment.toUInt(), textarget.toUInt(), texture.toUInt(),
    level
)

actual inline fun GL30.glGenerateMipmap(
    target: GLenum
) = platform.OpenGL3.glGenerateMipmap(
    target.toUInt()
)

actual inline fun GL30.glGetFramebufferAttachmentParameteriv(
    target: GLenum, attachment: GLenum, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetFramebufferAttachmentParameteriv(
        target.toUInt(),
        attachment.toUInt(),
        pname.toUInt(),
        buffer.toCPointer()
    )
}

actual inline fun GL30.glGetRenderbufferParameteriv(
    target: GLenum, pname: GLenum, params: sequence_GLint
) = params.usePinned { buffer ->
    platform.OpenGL3.glGetRenderbufferParameteriv(
        target.toUInt(), pname.toUInt(), buffer.toCPointer()
    )
}

actual inline fun GL30.glIsFramebuffer(
    framebuffer: GLFramebuffer
) = platform.OpenGL3.glIsFramebuffer(
    framebuffer.toUInt()
) != 0u.toUByte()

actual inline fun GL30.glIsRenderbuffer(
    renderbuffer: GLRenderbuffer
) = platform.OpenGL3.glIsRenderbuffer(
    renderbuffer.toUInt()
) != 0u.toUByte()

actual inline fun GL30.glRenderbufferStorage(
    target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei
) = platform.OpenGL3.glRenderbufferStorage(
    target.toUInt(), internalformat.toUInt(), width, height
)

// FIXME: Crashes compiler when used directly
@PublishedApi
internal inline val GL_MAP_READ_BIT: GLenum
    get() = platform.OpenGL3.GL_MAP_READ_BIT

actual inline fun GL30.glGetBufferSubData(
    target: GLenum, srcByteOffset: GLintptr, dstData: DataBuffer,
    dstOffset: GLuint, length: GLuint
) = dstData.write { buffer ->
    val mapped = platform.OpenGL3.glMapBufferRange(
        target.toUInt(), srcByteOffset.toLong(), length.toLong(),
        GL_MAP_READ_BIT.toUInt()
    )?.reinterpret<ByteVar>() ?: return
    // TODO: Optimize
    buffer!!
    for (i in 0 until dstData.size) {
        buffer[i] = mapped[i]
    }
    platform.OpenGL3.glUnmapBuffer(target.toUInt())
    Unit
}

actual inline fun GL30.glBlitFramebuffer(
    srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint,
    dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint,
    mask: GLbitfield, filter: GLenum
) = platform.OpenGL3.glBlitFramebuffer(
    srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1,
    mask.toUInt(), filter.toUInt()
)

actual inline fun GL30.glFramebufferTextureLayer(
    target: GLenum, attachment: GLenum, texture: GLTexture, level: GLint,
    layer: GLint
) = platform.OpenGL3.glFramebufferTextureLayer(
    target.toUInt(), attachment.toUInt(), texture.toUInt(), level, layer
)

actual inline fun GL30.glRenderbufferStorageMultisample(
    target: GLenum, samples: GLsizei, internalformat: GLenum,
    width: GLsizei, height: GLsizei
) = platform.OpenGL3.glRenderbufferStorageMultisample(
    target.toUInt(), samples, internalformat.toUInt(), width, height
)

actual inline fun GL15.glGetFragDataLocation(
    program: GLProgram, name: DOMString
) = platform.OpenGL3.glGetFragDataLocation(
    program.toUInt(), name
)

actual inline fun GL30.glUniform1ui(
    location: GLUniformLocation, v0: GLuint
) = platform.OpenGL3.glUniform1ui(
    location, v0
)

actual inline fun GL30.glUniform2ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint
) = platform.OpenGL3.glUniform2ui(
    location, v0, v1
)

actual inline fun GL30.glUniform3ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint
) = platform.OpenGL3.glUniform3ui(
    location, v0, v1, v2
)

actual inline fun GL30.glUniform4ui(
    location: GLUniformLocation, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint
) = platform.OpenGL3.glUniform4ui(
    location, v0, v1, v2, v3
)

actual inline fun GL30.glUniform1uiv(
    location: GLUniformLocation, data: Uint32List
) = data.usePinned { buffer ->
    platform.OpenGL3.glUniform1uiv(
        location, data.size, buffer.toCPointer()
    )
}

actual inline fun GL30.glUniform2uiv(
    location: GLUniformLocation, data: Uint32List
) = data.usePinned { buffer ->
    platform.OpenGL3.glUniform2uiv(
        location, data.size, buffer.toCPointer()
    )
}

actual inline fun GL30.glUniform3uiv(
    location: GLUniformLocation, data: Uint32List
) = data.usePinned { buffer ->
    platform.OpenGL3.glUniform3uiv(
        location, data.size, buffer.toCPointer()
    )
}

actual inline fun GL30.glUniform4uiv(
    location: GLUniformLocation, data: Uint32List
) = data.usePinned { buffer ->
    platform.OpenGL3.glUniform4uiv(
        location, data.size, buffer.toCPointer()
    )
}

actual inline fun GL30.glVertexAttribI4i(
    index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint
) = platform.OpenGL3.glVertexAttribI4i(
    index, x, y, z, w
)

actual inline fun GL30.glVertexAttribI4iv(
    index: GLuint, values: Int32List
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttribI4iv(
        index, buffer.toCPointer()
    )
}

actual inline fun GL30.glVertexAttribI4ui(
    index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint
) = platform.OpenGL3.glVertexAttribI4ui(
    index, x, y, z, w
)

actual inline fun GL30.glVertexAttribI4uiv(
    index: GLuint, values: Uint32List
) = values.usePinned { buffer ->
    platform.OpenGL3.glVertexAttribI4uiv(
        index, buffer.toCPointer()
    )
}

actual inline fun GL30.glVertexAttribIPointer(
    index: GLuint, size: GLint, type: GLenum, stride: GLsizei, offset: GLintptr
) = platform.OpenGL3.glVertexAttribIPointer(
    index, size, type.toUInt(), stride, offset.toLong().toCPointer<ByteVar>()
)

actual inline fun GL30.glClearBufferfv(
    buffer: GLenum, drawbuffer: GLint, values: Float32List
) = values.usePinned { bufferValues ->
    platform.OpenGL3.glClearBufferfv(
        buffer.toUInt(), drawbuffer, bufferValues.toCPointer()
    )
}

actual inline fun GL30.glClearBufferiv(
    buffer: GLenum, drawbuffer: GLint, values: Int32List
) = values.usePinned { bufferValues ->
    platform.OpenGL3.glClearBufferiv(
        buffer.toUInt(), drawbuffer, bufferValues.toCPointer()
    )
}

actual inline fun GL30.glClearBufferuiv(
    buffer: GLenum, drawbuffer: GLint, values: Uint32List
) = values.usePinned { bufferValues ->
    platform.OpenGL3.glClearBufferuiv(
        buffer.toUInt(), drawbuffer, bufferValues.toCPointer()
    )
}

actual inline fun GL30.glClearBufferfi(
    buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint
) = platform.OpenGL3.glClearBufferfi(
    buffer.toUInt(), drawbuffer, depth, stencil
)

actual inline fun GL30.glBeginTransformFeedback(
    primitiveMode: GLenum
) = platform.OpenGL3.glBeginTransformFeedback(
    primitiveMode.toUInt()
)

actual inline fun GL30.glEndTransformFeedback(
) = platform.OpenGL3.glEndTransformFeedback(
)

actual inline fun GL30.glTransformFeedbackVaryings(
    program: GLProgram, varyings: sequence_DOMString, bufferMode: GLenum
) = memScoped {
    platform.OpenGL3.glTransformFeedbackVaryings(
        program.toUInt(), varyings.size, varyings.toCStringArray(this),
        bufferMode.toUInt()
    )
}

actual inline fun GL30.glBindBufferBase(
    target: GLenum, index: GLuint, buffer: GLBuffer
) = platform.OpenGL3.glBindBufferBase(
    target.toUInt(), index, buffer.toUInt()
)

actual inline fun GL30.glBindBufferRange(
    target: GLenum, index: GLuint, buffer: GLBuffer, offset: GLintptr,
    size: GLsizeiptr
) = platform.OpenGL3.glBindBufferRange(
    target.toUInt(), index, buffer.toUInt(), offset.toLong(), size.toLong()
)

actual inline fun GL30.glCreateVertexArray(
) = memScoped {
    val buffer = alloc<UIntVar>()
    platform.OpenGL3.glGenVertexArrays(
        1, buffer.ptr
    )
    buffer.value.toInt()
}

actual inline fun GL30.glDeleteVertexArray(
    vertexArray: GLVertexArrayObject
) = memScoped {
    val buffer = alloc<UIntVar>()
    buffer.value = vertexArray.toUInt()
    platform.OpenGL3.glDeleteVertexArrays(
        1, buffer.ptr
    )
}

actual inline fun GL30.glIsVertexArray(
    vertexArray: GLVertexArrayObject
) = platform.OpenGL3.glIsVertexArray(
    vertexArray.toUInt()
) != 0u.toUByte()

actual inline fun GL30.glBindVertexArray(
    array: GLVertexArrayObject
) = platform.OpenGL3.glBindVertexArray(
    array.toUInt()
)
