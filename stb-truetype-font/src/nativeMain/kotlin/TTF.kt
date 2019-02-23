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

package net.gitout.ktbindings.stb.ttf

import binding.stbttf.stbtt_vertex
import kotlinx.cinterop.*
import net.gitout.ktbindings.utils.*

actual inline val STBTT_vmove
    get() = binding.stbttf.STBTT_vmove.toByte()
actual inline val STBTT_vline
    get() = binding.stbttf.STBTT_vline.toByte()
actual inline val STBTT_vcurve
    get() = binding.stbttf.STBTT_vcurve.toByte()
actual inline val STBTT_vcubic
    get() = binding.stbttf.STBTT_vcubic.toByte()
actual inline val STBTT_MACSTYLE_DONTCARE
    get() = binding.stbttf.STBTT_MACSTYLE_DONTCARE
actual inline val STBTT_MACSTYLE_BOLD
    get() = binding.stbttf.STBTT_MACSTYLE_BOLD
actual inline val STBTT_MACSTYLE_ITALIC
    get() = binding.stbttf.STBTT_MACSTYLE_ITALIC
actual inline val STBTT_MACSTYLE_UNDERSCORE
    get() = binding.stbttf.STBTT_MACSTYLE_UNDERSCORE
actual inline val STBTT_MACSTYLE_NONE
    get() = binding.stbttf.STBTT_MACSTYLE_NONE
actual inline val STBTT_PLATFORM_ID_UNICODE
    get() = binding.stbttf.STBTT_PLATFORM_ID_UNICODE.toInt()
actual inline val STBTT_PLATFORM_ID_MAC
    get() = binding.stbttf.STBTT_PLATFORM_ID_MAC.toInt()
actual inline val STBTT_PLATFORM_ID_ISO
    get() = binding.stbttf.STBTT_PLATFORM_ID_ISO.toInt()
actual inline val STBTT_PLATFORM_ID_MICROSOFT
    get() = binding.stbttf.STBTT_PLATFORM_ID_MICROSOFT.toInt()
actual inline val STBTT_UNICODE_EID_UNICODE_1_0
    get() = binding.stbttf.STBTT_UNICODE_EID_UNICODE_1_0.toInt()
actual inline val STBTT_UNICODE_EID_UNICODE_1_1
    get() = binding.stbttf.STBTT_UNICODE_EID_UNICODE_1_1.toInt()
actual inline val STBTT_UNICODE_EID_ISO_10646
    get() = binding.stbttf.STBTT_UNICODE_EID_ISO_10646.toInt()
actual inline val STBTT_UNICODE_EID_UNICODE_2_0_BMP
    get() = binding.stbttf.STBTT_UNICODE_EID_UNICODE_2_0_BMP.toInt()
actual inline val STBTT_UNICODE_EID_UNICODE_2_0_FULL
    get() = binding.stbttf.STBTT_UNICODE_EID_UNICODE_2_0_FULL.toInt()
actual inline val STBTT_MS_EID_SYMBOL
    get() = binding.stbttf.STBTT_MS_EID_SYMBOL.toInt()
actual inline val STBTT_MS_EID_UNICODE_BMP
    get() = binding.stbttf.STBTT_MS_EID_UNICODE_BMP.toInt()
actual inline val STBTT_MS_EID_SHIFTJIS
    get() = binding.stbttf.STBTT_MS_EID_SHIFTJIS.toInt()
actual inline val STBTT_MS_EID_UNICODE_FULL
    get() = binding.stbttf.STBTT_MS_EID_UNICODE_FULL.toInt()
actual inline val STBTT_MAC_EID_ROMAN
    get() = binding.stbttf.STBTT_MAC_EID_ROMAN.toInt()
actual inline val STBTT_MAC_EID_JAPANESE
    get() = binding.stbttf.STBTT_MAC_EID_JAPANESE.toInt()
actual inline val STBTT_MAC_EID_CHINESE_TRAD
    get() = binding.stbttf.STBTT_MAC_EID_CHINESE_TRAD.toInt()
actual inline val STBTT_MAC_EID_KOREAN
    get() = binding.stbttf.STBTT_MAC_EID_KOREAN.toInt()
actual inline val STBTT_MAC_EID_ARABIC
    get() = binding.stbttf.STBTT_MAC_EID_ARABIC.toInt()
actual inline val STBTT_MAC_EID_HEBREW
    get() = binding.stbttf.STBTT_MAC_EID_HEBREW.toInt()
actual inline val STBTT_MAC_EID_GREEK
    get() = binding.stbttf.STBTT_MAC_EID_GREEK.toInt()
actual inline val STBTT_MAC_EID_RUSSIAN
    get() = binding.stbttf.STBTT_MAC_EID_RUSSIAN.toInt()
actual inline val STBTT_MS_LANG_ENGLISH
    get() = binding.stbttf.STBTT_MS_LANG_ENGLISH.toInt()
actual inline val STBTT_MS_LANG_CHINESE
    get() = binding.stbttf.STBTT_MS_LANG_CHINESE.toInt()
actual inline val STBTT_MS_LANG_DUTCH
    get() = binding.stbttf.STBTT_MS_LANG_DUTCH.toInt()
actual inline val STBTT_MS_LANG_FRENCH
    get() = binding.stbttf.STBTT_MS_LANG_FRENCH.toInt()
actual inline val STBTT_MS_LANG_GERMAN
    get() = binding.stbttf.STBTT_MS_LANG_GERMAN.toInt()
actual inline val STBTT_MS_LANG_HEBREW
    get() = binding.stbttf.STBTT_MS_LANG_HEBREW.toInt()
actual inline val STBTT_MS_LANG_ITALIAN
    get() = binding.stbttf.STBTT_MS_LANG_ITALIAN.toInt()
actual inline val STBTT_MS_LANG_JAPANESE
    get() = binding.stbttf.STBTT_MS_LANG_JAPANESE.toInt()
actual inline val STBTT_MS_LANG_KOREAN
    get() = binding.stbttf.STBTT_MS_LANG_KOREAN.toInt()
actual inline val STBTT_MS_LANG_RUSSIAN
    get() = binding.stbttf.STBTT_MS_LANG_RUSSIAN.toInt()
actual inline val STBTT_MS_LANG_SPANISH
    get() = binding.stbttf.STBTT_MS_LANG_SPANISH.toInt()
actual inline val STBTT_MS_LANG_SWEDISH
    get() = binding.stbttf.STBTT_MS_LANG_SWEDISH.toInt()
actual inline val STBTT_MAC_LANG_ENGLISH
    get() = binding.stbttf.STBTT_MAC_LANG_ENGLISH.toInt()
actual inline val STBTT_MAC_LANG_ARABIC
    get() = binding.stbttf.STBTT_MAC_LANG_ARABIC.toInt()
actual inline val STBTT_MAC_LANG_DUTCH
    get() = binding.stbttf.STBTT_MAC_LANG_DUTCH.toInt()
actual inline val STBTT_MAC_LANG_FRENCH
    get() = binding.stbttf.STBTT_MAC_LANG_FRENCH.toInt()
actual inline val STBTT_MAC_LANG_GERMAN
    get() = binding.stbttf.STBTT_MAC_LANG_GERMAN.toInt()
actual inline val STBTT_MAC_LANG_HEBREW
    get() = binding.stbttf.STBTT_MAC_LANG_HEBREW.toInt()
actual inline val STBTT_MAC_LANG_ITALIAN
    get() = binding.stbttf.STBTT_MAC_LANG_ITALIAN.toInt()
actual inline val STBTT_MAC_LANG_JAPANESE
    get() = binding.stbttf.STBTT_MAC_LANG_JAPANESE.toInt()
actual inline val STBTT_MAC_LANG_KOREAN
    get() = binding.stbttf.STBTT_MAC_LANG_KOREAN.toInt()
actual inline val STBTT_MAC_LANG_RUSSIAN
    get() = binding.stbttf.STBTT_MAC_LANG_RUSSIAN.toInt()
actual inline val STBTT_MAC_LANG_SPANISH
    get() = binding.stbttf.STBTT_MAC_LANG_SPANISH.toInt()
actual inline val STBTT_MAC_LANG_SWEDISH
    get() = binding.stbttf.STBTT_MAC_LANG_SWEDISH.toInt()
actual inline val STBTT_MAC_LANG_CHINESE_SIMPLIFIED
    get() = binding.stbttf.STBTT_MAC_LANG_CHINESE_SIMPLIFIED.toInt()
actual inline val STBTT_MAC_LANG_CHINESE_TRAD
    get() = binding.stbttf.STBTT_MAC_LANG_CHINESE_TRAD.toInt()

actual inline fun stbtt_BakeFontBitmap(
    data: DataBuffer, pixel_height: Float, pixels: DataBuffer, pw: Int, ph: Int,
    first_char: Int, chardata: STBTTBakedCharBuffer
) = data.readUnsigned { buffer ->
    pixels.writeUnsigned { pixelsBuffer ->
        binding.stbttf.stbtt_BakeFontBitmap(
            buffer, 0, pixel_height, pixelsBuffer, pw, ph, first_char,
            chardata.size, chardata.ptr
        )
    }
}

actual inline fun stbtt_GetBakedQuad(
    chardata: STBTTBakedCharBuffer, pw: Int, ph: Int, char_index: Int,
    xpos: FloatArray, ypos: FloatArray, q: STBTTAlignedQuad,
    opengl_fillrule: Boolean
) = xpos.usePinned { xposBuffer ->
    ypos.usePinned { yposBuffer ->
        binding.stbttf.stbtt_GetBakedQuad(
            chardata.ptr, pw, ph, char_index, xposBuffer.toCPointer(),
            yposBuffer.toCPointer(), q.ptr, if (opengl_fillrule) 1 else 0
        )
    }
}

actual inline fun stbtt_PackBegin(
    spc: STBTTPackContext, pixels: DataBuffer?, width: Int, height: Int,
    stride_in_bytes: Int, padding: Int, alloc_context: Long
) = pixels.writeUnsignedOrNull { buffer ->
    binding.stbttf.stbtt_PackBegin(
        spc.ptr, buffer, width, height, stride_in_bytes, padding,
        alloc_context.toCPointer<ByteVar>()
    ) != 0
}

actual inline fun stbtt_PackBegin(
    spc: STBTTPackContext, pixels: DataBuffer?, width: Int, height: Int,
    stride_in_bytes: Int, padding: Int
) = pixels.writeUnsignedOrNull { buffer ->
    binding.stbttf.stbtt_PackBegin(
        spc.ptr, buffer, width, height, stride_in_bytes, padding, null
    ) != 0
}

actual inline fun stbtt_PackEnd(
    spc: STBTTPackContext
) = binding.stbttf.stbtt_PackEnd(
    spc.ptr
)

actual inline fun stbtt_point_size(
    font_size: Int
) = binding.stbttf.stbtt_point_size(
    font_size
)

actual inline fun stbtt_PackFontRange(
    spc: STBTTPackContext, fontdata: DataBuffer, font_index: Int,
    font_size: Float, first_unicode_char_in_range: Int,
    chardata_for_range: STBTTPackedcharBuffer
) = fontdata.readUnsigned { buffer ->
    binding.stbttf.stbtt_PackFontRange(
        spc.ptr, buffer, font_index, font_size, first_unicode_char_in_range,
        chardata_for_range.size, chardata_for_range.ptr
    ) != 0
}

actual inline fun stbtt_PackFontRanges(
    spc: STBTTPackContext, fontdata: DataBuffer, font_index: Int,
    ranges: STBTTPackRangeBuffer
) = fontdata.readUnsigned { buffer ->
    binding.stbttf.stbtt_PackFontRanges(
        spc.ptr, buffer, font_index, ranges.ptr, ranges.size
    ) != 0
}

actual inline fun stbtt_PackSetOversampling(
    spc: STBTTPackContext, h_oversample: Int, v_oversample: Int
) = binding.stbttf.stbtt_PackSetOversampling(
    spc.ptr, h_oversample.toUInt(), v_oversample.toUInt()
)

actual inline fun stbtt_GetPackedQuad(
    chardata: STBTTPackedcharBuffer, pw: Int, ph: Int, char_index: Int,
    xpos: FloatArray, ypos: FloatArray, q: STBTTAlignedQuad,
    align_to_integer: Boolean
) = xpos.usePinned { xposBuffer ->
    ypos.usePinned { yposBuffer ->
        binding.stbttf.stbtt_GetPackedQuad(
            chardata.ptr, pw, ph, char_index, xposBuffer.toCPointer(),
            yposBuffer.toCPointer(), q.ptr, if (align_to_integer) 1 else 0
        )
    }
}

actual inline fun stbtt_PackFontRangesGatherRects(
    spc: STBTTPackContext, info: STBTTFontinfo, ranges: STBTTPackRangeBuffer,
    rects: STBRPRectBuffer
) = binding.stbttf.stbtt_PackFontRangesGatherRects(
    spc.ptr, info.ptr, ranges.ptr, ranges.size, rects.ptr
)

actual inline fun stbtt_PackFontRangesPackRects(
    spc: STBTTPackContext, rects: STBRPRectBuffer
) = binding.stbttf.stbtt_PackFontRangesPackRects(
    spc.ptr, rects.ptr, rects.size
)

actual inline fun stbtt_PackFontRangesRenderIntoRects(
    spc: STBTTPackContext, info: STBTTFontinfo, ranges: STBTTPackRangeBuffer,
    rects: STBRPRectBuffer
) = binding.stbttf.stbtt_PackFontRangesRenderIntoRects(
    spc.ptr, info.ptr, ranges.ptr, ranges.size, rects.ptr
) != 0

actual inline fun stbtt_GetNumberOfFonts(
    data: DataBuffer
) = data.readUnsigned { buffer ->
    binding.stbttf.stbtt_GetNumberOfFonts(
        buffer
    )
}

actual inline fun stbtt_GetFontOffsetForIndex(
    data: DataBuffer, index: Int
) = data.readUnsigned { buffer ->
    binding.stbttf.stbtt_GetFontOffsetForIndex(
        buffer, index
    )
}

actual inline fun stbtt_InitFont(
    info: STBTTFontinfo, data: DataBufferPinned, offset: Int
) = binding.stbttf.stbtt_InitFont(
    info.ptr, data.buffer?.reinterpret(), offset
) != 0

actual inline fun stbtt_InitFont(
    info: STBTTFontinfo, data: DataBufferPinned
) = binding.stbttf.stbtt_InitFont(
    info.ptr, data.buffer?.reinterpret(), 0
) != 0

actual inline fun stbtt_FindGlyphIndex(
    info: STBTTFontinfo, unicode_codepoint: Int
) = binding.stbttf.stbtt_FindGlyphIndex(
    info.ptr, unicode_codepoint
)

actual inline fun stbtt_ScaleForPixelHeight(
    info: STBTTFontinfo, pixels: Float
) = binding.stbttf.stbtt_ScaleForPixelHeight(
    info.ptr, pixels
)

actual inline fun stbtt_ScaleForMappingEmToPixels(
    info: STBTTFontinfo, pixels: Float
) = binding.stbttf.stbtt_ScaleForMappingEmToPixels(
    info.ptr, pixels
)

actual inline fun stbtt_GetFontVMetrics(
    info: STBTTFontinfo, ascent: IntArray?, descent: IntArray?,
    lineGap: IntArray?
) = ascent.usePinnedOrNull { ascentBuffer ->
    descent.usePinnedOrNull { descentBuffer ->
        lineGap.usePinnedOrNull { lineGapBuffer ->
            binding.stbttf.stbtt_GetFontVMetrics(
                info.ptr,
                ascentBuffer?.toCPointer(),
                descentBuffer?.toCPointer(),
                lineGapBuffer?.toCPointer()
            )
        }
    }
}

actual inline fun stbtt_GetFontVMetricsOS2(
    info: STBTTFontinfo, typoAscent: IntArray?, typoDescent: IntArray?,
    typoLineGap: IntArray?
) = typoAscent.usePinnedOrNull { typoAscentBuffer ->
    typoDescent.usePinnedOrNull { typoDescentBuffer ->
        typoLineGap.usePinnedOrNull { typoLineGapBuffer ->
            binding.stbttf.stbtt_GetFontVMetricsOS2(
                info.ptr,
                typoAscentBuffer?.toCPointer(),
                typoDescentBuffer?.toCPointer(),
                typoLineGapBuffer?.toCPointer()
            ) != 0
        }
    }
}

actual inline fun stbtt_GetFontBoundingBox(
    info: STBTTFontinfo, x0: IntArray, y0: IntArray, x1: IntArray, y1: IntArray
) = x0.usePinned { x0Buffer ->
    y0.usePinned { y0Buffer ->
        x1.usePinned { x1Buffer ->
            y1.usePinned { y1Buffer ->
                binding.stbttf.stbtt_GetFontBoundingBox(
                    info.ptr, x0Buffer.toCPointer(),
                    y0Buffer.toCPointer(), x1Buffer.toCPointer(),
                    y1Buffer.toCPointer()
                )
            }
        }
    }
}

actual inline fun stbtt_GetCodepointHMetrics(
    info: STBTTFontinfo, codepoint: Int, advanceWidth: IntArray?,
    leftSideBearing: IntArray?
) = advanceWidth.usePinnedOrNull { advanceWidthBuffer ->
    leftSideBearing.usePinnedOrNull { leftSideBearingBuffer ->
        binding.stbttf.stbtt_GetCodepointHMetrics(
            info.ptr, codepoint, advanceWidthBuffer?.toCPointer(),
            leftSideBearingBuffer?.toCPointer()
        )
    }
}

actual inline fun stbtt_GetCodepointKernAdvance(
    info: STBTTFontinfo, ch1: Int, ch2: Int
) = binding.stbttf.stbtt_GetCodepointKernAdvance(
    info.ptr, ch1, ch2
)

actual inline fun stbtt_GetCodepointBox(
    info: STBTTFontinfo, codepoint: Int, x0: IntArray?, y0: IntArray?,
    x1: IntArray?, y1: IntArray?
) = x0.usePinnedOrNull { x0Buffer ->
    y0.usePinnedOrNull { y0Buffer ->
        x1.usePinnedOrNull { x1Buffer ->
            y1.usePinnedOrNull { y1Buffer ->
                binding.stbttf.stbtt_GetCodepointBox(
                    info.ptr, codepoint, x0Buffer?.toCPointer(),
                    y0Buffer?.toCPointer(), x1Buffer?.toCPointer(),
                    y1Buffer?.toCPointer()
                ) != 0
            }
        }
    }
}

actual inline fun stbtt_GetGlyphHMetrics(
    info: STBTTFontinfo, glyph_index: Int, advanceWidth: IntArray?,
    leftSideBearing: IntArray?
) = advanceWidth.usePinnedOrNull { advanceWidthBuffer ->
    leftSideBearing.usePinnedOrNull { leftSideBearingBuffer ->
        binding.stbttf.stbtt_GetGlyphHMetrics(
            info.ptr, glyph_index, advanceWidthBuffer?.toCPointer(),
            leftSideBearingBuffer?.toCPointer()
        )
    }
}

actual inline fun stbtt_GetGlyphKernAdvance(
    info: STBTTFontinfo, glyph1: Int, glyph2: Int
) = binding.stbttf.stbtt_GetGlyphKernAdvance(
    info.ptr, glyph1, glyph2
)

actual inline fun stbtt_GetGlyphBox(
    info: STBTTFontinfo, glyph_index: Int, x0: IntArray?, y0: IntArray?,
    x1: IntArray?, y1: IntArray?
) = x0.usePinnedOrNull { x0Buffer ->
    y0.usePinnedOrNull { y0Buffer ->
        x1.usePinnedOrNull { x1Buffer ->
            y1.usePinnedOrNull { y1Buffer ->
                binding.stbttf.stbtt_GetGlyphBox(
                    info.ptr, glyph_index, x0Buffer?.toCPointer(),
                    y0Buffer?.toCPointer(), x1Buffer?.toCPointer(),
                    y1Buffer?.toCPointer()
                ) != 0
            }
        }
    }
}

actual inline fun stbtt_IsGlyphEmpty(
    info: STBTTFontinfo, glyph_index: Int
) = binding.stbttf.stbtt_IsGlyphEmpty(
    info.ptr, glyph_index
) != 0

actual inline fun stbtt_GetCodepointShape(
    info: STBTTFontinfo, unicode_codepoint: Int
) = memScoped {
    val pointer = allocPointerTo<stbtt_vertex>()
    val length = binding.stbttf.stbtt_GetCodepointShape(
        info.ptr, unicode_codepoint, pointer.ptr
    )
    pointer.value?.let { STBTTVertexBuffer(it, length) }
}

actual inline fun stbtt_GetGlyphShape(
    info: STBTTFontinfo, glyph_index: Int
) = memScoped {
    val pointer = allocPointerTo<stbtt_vertex>()
    val length = binding.stbttf.stbtt_GetGlyphShape(
        info.ptr, glyph_index, pointer.ptr
    )
    pointer.value?.let { STBTTVertexBuffer(it, length) }
}

actual inline fun stbtt_FreeShape(
    info: STBTTFontinfo, vertices: STBTTVertexBuffer
) = binding.stbttf.stbtt_FreeShape(
    info.ptr, vertices.ptr
)

actual inline fun stbtt_FreeBitmap(
    bitmap: STBDataBuffer, userdata: Long
) = binding.stbttf.stbtt_FreeBitmap(
    bitmap.buffer.reinterpret(), userdata.toCPointer<ByteVar>()
)

actual inline fun stbtt_FreeBitmap(
    bitmap: STBDataBuffer
) = binding.stbttf.stbtt_FreeBitmap(
    bitmap.buffer.reinterpret(), null
)

actual inline fun stbtt_GetCodepointBitmap(
    info: STBTTFontinfo, scale_x: Float, scale_y: Float, codepoint: Int,
    width: IntArray, height: IntArray, xoff: IntArray?, yoff: IntArray?
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinnedOrNull { xoffBuffer ->
            yoff.usePinnedOrNull { yoffBuffer ->
                binding.stbttf.stbtt_GetCodepointBitmap(
                    info.ptr, scale_x, scale_y, codepoint,
                    widthBuffer.toCPointer(), heightBuffer.toCPointer(),
                    xoffBuffer?.toCPointer(), yoffBuffer?.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_GetCodepointBitmapSubpixel(
    info: STBTTFontinfo, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, codepoint: Int, width: IntArray, height: IntArray,
    xoff: IntArray?, yoff: IntArray?
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinnedOrNull { xoffBuffer ->
            yoff.usePinnedOrNull { yoffBuffer ->
                binding.stbttf.stbtt_GetCodepointBitmapSubpixel(
                    info.ptr, scale_x, scale_y, shift_x, shift_y, codepoint,
                    widthBuffer.toCPointer(), heightBuffer.toCPointer(),
                    xoffBuffer?.toCPointer(), yoffBuffer?.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_MakeCodepointBitmap(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, codepoint: Int
) = output.writeUnsigned { buffer ->
    binding.stbttf.stbtt_MakeCodepointBitmap(
        info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y, codepoint
    )
}

actual inline fun stbtt_MakeCodepointBitmapSubpixel(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, codepoint: Int
) = output.writeUnsigned { buffer ->
    binding.stbttf.stbtt_MakeCodepointBitmapSubpixel(
        info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y, shift_x,
        shift_y, codepoint
    )
}

actual inline fun stbtt_MakeCodepointBitmapSubpixelPrefilter(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, oversample_x: Int, oversample_y: Int, sub_x: FloatArray,
    sub_y: FloatArray, codepoint: Int
) = output.writeUnsigned { buffer ->
    sub_x.usePinned { sub_xBuffer ->
        sub_y.usePinned { sub_yBuffer ->
            binding.stbttf.stbtt_MakeCodepointBitmapSubpixelPrefilter(
                info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y,
                shift_x, shift_y, oversample_x, oversample_y,
                sub_xBuffer.toCPointer(), sub_yBuffer.toCPointer(), codepoint
            )
        }
    }
}

actual inline fun stbtt_GetCodepointBitmapBox(
    font: STBTTFontinfo, codepoint: Int, scale_x: Float, scale_y: Float,
    ix0: IntArray?, iy0: IntArray?, ix1: IntArray?, iy1: IntArray?
) = ix0.usePinnedOrNull { ix0Buffer ->
    iy0.usePinnedOrNull { iy0Buffer ->
        ix1.usePinnedOrNull { ix1Buffer ->
            iy1.usePinnedOrNull { iy1Buffer ->
                binding.stbttf.stbtt_GetCodepointBitmapBox(
                    font.ptr, codepoint, scale_x, scale_y,
                    ix0Buffer?.toCPointer(), iy0Buffer?.toCPointer(),
                    ix1Buffer?.toCPointer(), iy1Buffer?.toCPointer()
                )
            }
        }
    }
}

actual inline fun stbtt_GetCodepointBitmapBoxSubpixel(
    font: STBTTFontinfo, codepoint: Int, scale_x: Float, scale_y: Float,
    shift_x: Float, shift_y: Float, ix0: IntArray?, iy0: IntArray?,
    ix1: IntArray?, iy1: IntArray?
) = ix0.usePinnedOrNull { ix0Buffer ->
    iy0.usePinnedOrNull { iy0Buffer ->
        ix1.usePinnedOrNull { ix1Buffer ->
            iy1.usePinnedOrNull { iy1Buffer ->
                binding.stbttf.stbtt_GetCodepointBitmapBoxSubpixel(
                    font.ptr, codepoint, scale_x, scale_y, shift_x, shift_y,
                    ix0Buffer?.toCPointer(), iy0Buffer?.toCPointer(),
                    ix1Buffer?.toCPointer(), iy1Buffer?.toCPointer()
                )
            }
        }
    }
}

actual inline fun stbtt_GetGlyphBitmap(
    info: STBTTFontinfo, scale_x: Float, scale_y: Float, glyph: Int,
    width: IntArray, height: IntArray, xoff: IntArray?, yoff: IntArray?
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinnedOrNull { xoffBuffer ->
            yoff.usePinnedOrNull { yoffBuffer ->
                binding.stbttf.stbtt_GetGlyphBitmap(
                    info.ptr, scale_x, scale_y, glyph, widthBuffer.toCPointer(),
                    heightBuffer.toCPointer(), xoffBuffer?.toCPointer(),
                    yoffBuffer?.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_GetGlyphBitmapSubpixel(
    info: STBTTFontinfo, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, glyph: Int, width: IntArray, height: IntArray,
    xoff: IntArray?, yoff: IntArray?
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinnedOrNull { xoffBuffer ->
            yoff.usePinnedOrNull { yoffBuffer ->
                binding.stbttf.stbtt_GetGlyphBitmapSubpixel(
                    info.ptr, scale_x, scale_y, shift_x, shift_y, glyph,
                    widthBuffer.toCPointer(), heightBuffer.toCPointer(),
                    xoffBuffer?.toCPointer(), yoffBuffer?.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_MakeGlyphBitmap(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, glyph: Int
) = output.writeUnsigned { buffer ->
    binding.stbttf.stbtt_MakeGlyphBitmap(
        info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y, glyph
    )
}

actual inline fun stbtt_MakeGlyphBitmapSubpixel(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, glyph: Int
) = output.writeUnsigned { buffer ->
    binding.stbttf.stbtt_MakeGlyphBitmapSubpixel(
        info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y, shift_x,
        shift_y, glyph
    )
}

actual inline fun stbtt_MakeGlyphBitmapSubpixelPrefilter(
    info: STBTTFontinfo, output: DataBuffer, out_w: Int, out_h: Int,
    out_stride: Int, scale_x: Float, scale_y: Float, shift_x: Float,
    shift_y: Float, oversample_x: Int, oversample_y: Int, sub_x: FloatArray,
    sub_y: FloatArray, glyph: Int
) = output.writeUnsigned { buffer ->
    sub_x.usePinned { sub_xBuffer ->
        sub_y.usePinned { sub_yBuffer ->
            binding.stbttf.stbtt_MakeGlyphBitmapSubpixelPrefilter(
                info.ptr, buffer, out_w, out_h, out_stride, scale_x, scale_y,
                shift_x, shift_y, oversample_x, oversample_y,
                sub_xBuffer.toCPointer(), sub_yBuffer.toCPointer(), glyph
            )
        }
    }
}

actual inline fun stbtt_GetGlyphBitmapBox(
    font: STBTTFontinfo, glyph: Int, scale_x: Float, scale_y: Float,
    ix0: IntArray?, iy0: IntArray?, ix1: IntArray?, iy1: IntArray?
) = ix0.usePinnedOrNull { ix0Buffer ->
    iy0.usePinnedOrNull { iy0Buffer ->
        ix1.usePinnedOrNull { ix1Buffer ->
            iy1.usePinnedOrNull { iy1Buffer ->
                binding.stbttf.stbtt_GetGlyphBitmapBox(
                    font.ptr, glyph, scale_x, scale_y,
                    ix0Buffer?.toCPointer(), iy0Buffer?.toCPointer(),
                    ix1Buffer?.toCPointer(), iy1Buffer?.toCPointer()
                )
            }
        }
    }
}

actual inline fun stbtt_GetGlyphBitmapBoxSubpixel(
    font: STBTTFontinfo, glyph: Int, scale_x: Float, scale_y: Float,
    shift_x: Float, shift_y: Float, ix0: IntArray?, iy0: IntArray?,
    ix1: IntArray?, iy1: IntArray?
) = ix0.usePinnedOrNull { ix0Buffer ->
    iy0.usePinnedOrNull { iy0Buffer ->
        ix1.usePinnedOrNull { ix1Buffer ->
            iy1.usePinnedOrNull { iy1Buffer ->
                binding.stbttf.stbtt_GetGlyphBitmapBoxSubpixel(
                    font.ptr, glyph, scale_x, scale_y, shift_x, shift_y,
                    ix0Buffer?.toCPointer(), iy0Buffer?.toCPointer(),
                    ix1Buffer?.toCPointer(), iy1Buffer?.toCPointer()
                )
            }
        }
    }
}

actual inline fun stbtt_Rasterize(
    result: STBTTBitmap, flatness_in_pixels: Float, vertices: STBTTVertexBuffer,
    scale_x: Float, scale_y: Float, shift_x: Float, shift_y: Float, x_off: Int,
    y_off: Int, invert: Boolean
) = binding.stbttf.stbtt_Rasterize(
    result.ptr, flatness_in_pixels, vertices.ptr, vertices.size, scale_x,
    scale_y, shift_x, shift_y, x_off, y_off, if (invert) 1 else 0, null
)

actual inline fun stbtt_FreeSDF(
    bitmap: STBDataBuffer, userdata: Long
) = binding.stbttf.stbtt_FreeSDF(
    bitmap.buffer.reinterpret(), userdata.toCPointer<ByteVar>()
)

actual inline fun stbtt_FreeSDF(
    bitmap: STBDataBuffer
) = binding.stbttf.stbtt_FreeSDF(
    bitmap.buffer.reinterpret(), null
)

actual inline fun stbtt_GetGlyphSDF(
    font: STBTTFontinfo, scale: Float, glyph: Int, padding: Int,
    onedge_value: Byte, pixel_dist_scale: Float, width: IntArray,
    height: IntArray, xoff: IntArray, yoff: IntArray
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinned { xoffBuffer ->
            yoff.usePinned { yoffBuffer ->
                binding.stbttf.stbtt_GetGlyphSDF(
                    font.ptr, scale, glyph, padding, onedge_value.toUByte(),
                    pixel_dist_scale, widthBuffer.toCPointer(),
                    heightBuffer.toCPointer(), xoffBuffer.toCPointer(),
                    yoffBuffer.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_GetCodepointSDF(
    font: STBTTFontinfo, scale: Float, codepoint: Int, padding: Int,
    onedge_value: Byte, pixel_dist_scale: Float, width: IntArray,
    height: IntArray, xoff: IntArray, yoff: IntArray
) = width.usePinned { widthBuffer ->
    height.usePinned { heightBuffer ->
        xoff.usePinned { xoffBuffer ->
            yoff.usePinned { yoffBuffer ->
                binding.stbttf.stbtt_GetCodepointSDF(
                    font.ptr, scale, codepoint, padding, onedge_value.toUByte(),
                    pixel_dist_scale, widthBuffer.toCPointer(),
                    heightBuffer.toCPointer(), xoffBuffer.toCPointer(),
                    yoffBuffer.toCPointer()
                )?.let { STBDataBuffer(it, width[0] * height[0]) }
            }
        }
    }
}

actual inline fun stbtt_FindMatchingFont(
    fontdata: DataBuffer, name: String, flags: Int
) = fontdata.readUnsigned { buffer ->
    binding.stbttf.stbtt_FindMatchingFont(
        buffer, name, flags
    )
}

actual inline fun stbtt_CompareUTF8toUTF16_bigendian(
    s1: DataBuffer, s2: DataBuffer
): Boolean = s1.readUnsigned { buffer1 ->
    s2.readUnsigned { buffer2 ->
        TODO()

        /* binding.stbttf.stbtt_CompareUTF8toUTF16_bigendian(
            buffer1, s1.size, buffer2, s2.size
        ) */
    }
}

actual inline fun stbtt_GetFontNameString(
    font: STBTTFontinfo, platformID: Int, encodingID: Int, languageID: Int,
    nameID: Int
) = memScoped {
    val length = alloc<IntVar>()
    binding.stbttf.stbtt_GetFontNameString(
        font.ptr, length.ptr, platformID, encodingID, languageID, nameID
    )?.let { STBDataBuffer(it, length.value) }
}
