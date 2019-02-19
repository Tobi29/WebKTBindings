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

@file:JvmName("TypesJVMKt")
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package net.gitout.ktbindings.stb.ttf

import net.gitout.ktbindings.utils.DataBuffer
import java.nio.ByteBuffer
import org.lwjgl.stb.STBRPRect as JSTBRPRect
import org.lwjgl.stb.STBTTAlignedQuad as JSTBTTAlignedQuad
import org.lwjgl.stb.STBTTBakedChar as JSTBTTBakedChar
import org.lwjgl.stb.STBTTBitmap as JSTBTTBitmap
import org.lwjgl.stb.STBTTFontinfo as JSTBTTFontinfo
import org.lwjgl.stb.STBTTPackContext as JSTBTTPackContext
import org.lwjgl.stb.STBTTPackedchar as JSTBTTPackedchar
import org.lwjgl.stb.STBTTPackRange as JSTBTTPackRange
import org.lwjgl.stb.STBTTVertex as JSTBTTVertex

actual class STBDataBuffer(
    @PublishedApi
    internal val buffer: ByteBuffer
) : DataBuffer {
    override fun write(): Pair<ByteBuffer, () -> Unit> = buffer to {}
}

actual class STBRPRect(
    @PublishedApi
    internal val struct: JSTBRPRect
)

actual inline fun STBRPRect.close() = struct.close()

actual class STBRPRectBuffer(
    @PublishedApi
    internal val struct: JSTBRPRect.Buffer
)

actual inline val STBRPRectBuffer.size get() = struct.remaining()

actual inline operator fun STBRPRectBuffer.get(index: Int) =
    STBRPRect(struct.get(struct.position() + index))

actual class STBTTAlignedQuad(
    @PublishedApi
    internal val struct: JSTBTTAlignedQuad
)

actual inline fun STBTTAlignedQuad.close() = struct.close()

actual class STBTTBakedChar(
    @PublishedApi
    internal val struct: JSTBTTBakedChar
)

actual inline fun STBTTBakedChar.close() = struct.close()

actual class STBTTBakedCharBuffer(
    @PublishedApi
    internal val struct: JSTBTTBakedChar.Buffer
)

actual inline val STBTTBakedCharBuffer.size get() = struct.remaining()

actual inline operator fun STBTTBakedCharBuffer.get(index: Int) =
    STBTTBakedChar(struct.get(struct.position() + index))

actual class STBTTBitmap(
    @PublishedApi
    internal val struct: JSTBTTBitmap
)

actual inline fun STBTTBitmap.close() = struct.close()

actual class STBTTFontinfo(
    @PublishedApi
    internal val struct: JSTBTTFontinfo
)

actual inline fun STBTTFontinfo() = STBTTFontinfo(JSTBTTFontinfo.malloc())

actual inline fun STBTTFontinfo.close() = struct.close()

actual class STBTTPackContext(
    @PublishedApi
    internal val struct: JSTBTTPackContext
)

actual inline fun STBTTPackContext.close() = struct.close()

actual class STBTTPackedchar(
    @PublishedApi
    internal val struct: JSTBTTPackedchar
)

actual inline fun STBTTPackedchar.close() = struct.close()

actual class STBTTPackedcharBuffer(
    @PublishedApi
    internal val struct: JSTBTTPackedchar.Buffer
)

actual inline val STBTTPackedcharBuffer.size get() = struct.remaining()

actual inline operator fun STBTTPackedcharBuffer.get(index: Int) =
    STBTTPackedchar(struct.get(struct.position() + index))

actual class STBTTPackRange(
    @PublishedApi
    internal val struct: JSTBTTPackRange
)

actual inline fun STBTTPackRange.close() = struct.close()

actual class STBTTPackRangeBuffer(
    @PublishedApi
    internal val struct: JSTBTTPackRange.Buffer
)

actual inline val STBTTPackRangeBuffer.size get() = struct.remaining()

actual inline operator fun STBTTPackRangeBuffer.get(index: Int) =
    STBTTPackRange(struct.get(struct.position() + index))

actual class STBTTVertex(
    @PublishedApi
    internal val struct: JSTBTTVertex
)

actual inline fun STBTTVertex.close() = struct.close()

actual class STBTTVertexBuffer(
    @PublishedApi
    internal val struct: JSTBTTVertex.Buffer
)

actual inline val STBTTVertexBuffer.size get() = struct.remaining()

actual inline operator fun STBTTVertexBuffer.get(index: Int) =
    STBTTVertex(struct.get(struct.position() + index))
