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

@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package net.gitout.ktbindings.stb.ttf

import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.DataBuffer

actual class STBDataBuffer(
    @PublishedApi
    internal val buffer: CPointer<ByteVar>,
    override val size: Int
) : DataBuffer {
    constructor(
        buffer: CPointer<UByteVar>, size: Int
    ) : this(buffer.reinterpret<ByteVar>(), size)

    override fun write(): Pair<CPointer<ByteVar>, () -> Unit> =
        buffer.reinterpret<ByteVar>() to {}
}

actual class STBRPRect(
    val ptr: CPointer<binding.stbttf.stbrp_rect>
)

actual inline fun STBRPRect.close() = nativeHeap.free(ptr)

actual class STBRPRectBuffer(
    val ptr: CPointer<binding.stbttf.stbrp_rect>,
    val size: Int
)

actual inline val STBRPRectBuffer.size get() = size

actual inline operator fun STBRPRectBuffer.get(index: Int) =
    STBRPRect((ptr.toLong() + index * sizeOf<binding.stbttf.stbrp_rect>()).toCPointer()!!)

actual class STBTTAlignedQuad(
    val ptr: CPointer<binding.stbttf.stbtt_aligned_quad>
)

actual inline fun STBTTAlignedQuad.close() = nativeHeap.free(ptr)

actual class STBTTBakedChar(
    val ptr: CPointer<binding.stbttf.stbtt_bakedchar>
)

actual inline fun STBTTBakedChar.close() = nativeHeap.free(ptr)

actual class STBTTBakedCharBuffer(
    val ptr: CPointer<binding.stbttf.stbtt_bakedchar>,
    val size: Int
)

actual inline val STBTTBakedCharBuffer.size get() = size

actual inline operator fun STBTTBakedCharBuffer.get(index: Int) =
    STBTTBakedChar((ptr.toLong() + index * sizeOf<binding.stbttf.stbtt_bakedchar>()).toCPointer()!!)

actual class STBTTBitmap(
    val ptr: CPointer<binding.stbttf.stbtt__bitmap>
)

actual inline fun STBTTBitmap.close() = nativeHeap.free(ptr)

actual class STBTTFontinfo(
    val ptr: CPointer<binding.stbttf.stbtt_fontinfo>
)

actual inline fun STBTTFontinfo() =
    STBTTFontinfo(nativeHeap.alloc<binding.stbttf.stbtt_fontinfo>().ptr)

actual inline fun STBTTFontinfo.close() = nativeHeap.free(ptr)

actual class STBTTPackContext(
    val ptr: CPointer<binding.stbttf.stbtt_pack_context>
)

actual inline fun STBTTPackContext.close() = nativeHeap.free(ptr)

actual class STBTTPackedchar(
    val ptr: CPointer<binding.stbttf.stbtt_packedchar>
)

actual inline fun STBTTPackedchar.close() = nativeHeap.free(ptr)

actual class STBTTPackedcharBuffer(
    val ptr: CPointer<binding.stbttf.stbtt_packedchar>,
    val size: Int
)

actual inline val STBTTPackedcharBuffer.size get() = size

actual inline operator fun STBTTPackedcharBuffer.get(index: Int) =
    STBTTPackedchar((ptr.toLong() + index * sizeOf<binding.stbttf.stbtt_packedchar>()).toCPointer()!!)

actual class STBTTPackRange(
    val ptr: CPointer<binding.stbttf.stbtt_pack_range>
)

actual inline fun STBTTPackRange.close() = nativeHeap.free(ptr)

actual class STBTTPackRangeBuffer(
    val ptr: CPointer<binding.stbttf.stbtt_pack_range>,
    val size: Int
)

actual inline val STBTTPackRangeBuffer.size get() = size

actual inline operator fun STBTTPackRangeBuffer.get(index: Int) =
    STBTTPackRange((ptr.toLong() + index * sizeOf<binding.stbttf.stbtt_pack_range>()).toCPointer()!!)

actual class STBTTVertex(
    val ptr: CPointer<binding.stbttf.stbtt_vertex>
)

actual inline fun STBTTVertex.close() = nativeHeap.free(ptr)

actual class STBTTVertexBuffer(
    val ptr: CPointer<binding.stbttf.stbtt_vertex>,
    val size: Int
)

actual inline val STBTTVertexBuffer.size get() = size

actual inline operator fun STBTTVertexBuffer.get(index: Int) =
    STBTTVertex((ptr.toLong() + index * sizeOf<binding.stbttf.stbtt_vertex>()).toCPointer()!!)
