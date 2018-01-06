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

package org.khronos.webgl2

import org.khronos.webgl.*
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.HTMLVideoElement
import org.w3c.dom.ImageData

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
external abstract class ImageBitmap {
    var width: Int
    var height: Int
    fun close()
}

/**
 * Exposes the JavaScript [WebGL2RenderingContext](https://developer.mozilla.org/en/docs/Web/API/WebGL2RenderingContext) to Kotlin
 */
external abstract class WebGL2RenderingContext : WebGLRenderingContext {
    fun bufferData(target: Int,
                   srcData: ArrayBuffer,
                   usage: Int)

    fun bufferData(target: Int,
                   srcData: ArrayBufferView,
                   usage: Int)

    fun bufferData(target: Int,
                   srcData: Nothing?,
                   usage: Int)

    fun bufferSubData(target: Int,
                      dstByteOffset: Int,
                      srcData: ArrayBuffer)

    fun bufferSubData(target: Int,
                      dstByteOffset: Int,
                      srcData: ArrayBufferView)

    fun bufferData(target: Int,
                   srcData: ArrayBufferView,
                   usage: Int,
                   srcOffset: Int,
                   length: Int? = definedExternally)

    fun bufferSubData(target: Int,
                      dstByteOffset: Int,
                      srcData: ArrayBufferView,
                      srcOffset: Int,
                      length: Int? = definedExternally)

    fun copyBufferSubData(readTarget: Int,
                          writeTarget: Int,
                          readOffset: Int,
                          writeOffset: Int,
                          size: Int)

    fun getBufferSubData(target: Int,
                         srcByteOffset: Int,
                         dstBuffer: ArrayBufferView,
                         dstOffset: Int? = definedExternally,
                         length: Int? = definedExternally)

    fun blitFramebuffer(srcX0: Int,
                        srcY0: Int,
                        srcX1: Int,
                        srcY1: Int,
                        dstX0: Int,
                        dstY0: Int,
                        dstX1: Int,
                        dstY1: Int,
                        mask: Int,
                        filter: Int)

    fun framebufferTextureLayer(target: Int,
                                attachment: Int,
                                texture: WebGLTexture?,
                                level: Int,
                                layer: Int)

    fun invalidateFramebuffer(target: Int,
                              attachments: Array<Int>)

    fun invalidateSubFramebuffer(target: Int,
                                 attachments: Array<Int>,
                                 x: Int,
                                 y: Int,
                                 width: Int,
                                 height: Int)

    fun readBuffer(src: Int)

    fun getInternalformatParameter(target: Int,
                                   internalformat: Int,
                                   pname: Int): Any

    fun renderbufferStorageMultisample(target: Int,
                                       samples: Int,
                                       internalformat: Int,
                                       width: Int,
                                       height: Int)

    fun texStorage2D(target: Int,
                     levels: Int,
                     internalformat: Int,
                     width: Int,
                     height: Int)

    fun texStorage3D(target: Int,
                     levels: Int,
                     internalformat: Int,
                     width: Int,
                     height: Int,
                     depth: Int)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   format: Int,
                   type: Int,
                   source: ImageData)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   format: Int,
                   type: Int,
                   source: HTMLImageElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   format: Int,
                   type: Int,
                   source: HTMLCanvasElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   format: Int,
                   type: Int,
                   source: HTMLVideoElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   format: Int,
                   type: Int,
                   source: ImageBitmap)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      format: Int,
                      type: Int,
                      source: ImageData)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      format: Int,
                      type: Int,
                      source: HTMLImageElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      format: Int,
                      type: Int,
                      source: HTMLCanvasElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      format: Int,
                      type: Int,
                      source: HTMLVideoElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      format: Int,
                      type: Int,
                      source: ImageBitmap)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   pboOffset: Int)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: ImageBitmap)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: ImageData)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLImageElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLCanvasElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLVideoElement)

    fun texImage2D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   srcData: ArrayBufferView,
                   srcOffset: Int)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   pboOffset: Int)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: ImageBitmap)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: ImageData)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLImageElement)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLCanvasElement)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   source: HTMLVideoElement)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   srcData: ArrayBufferView?)

    fun texImage3D(target: Int,
                   level: Int,
                   internalformat: Int,
                   width: Int,
                   height: Int,
                   depth: Int,
                   border: Int,
                   format: Int,
                   type: Int,
                   srcData: ArrayBufferView,
                   srcOffset: Int)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      pboOffset: Int)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      source: ImageBitmap)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      source: ImageData)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      source: HTMLImageElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      source: HTMLCanvasElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      source: HTMLVideoElement)

    fun texSubImage2D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      width: Int,
                      height: Int,
                      format: Int,
                      type: Int,
                      srcData: ArrayBufferView,
                      srcOffset: Int)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      pboOffset: Int)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      source: ImageBitmap)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      source: ImageData)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      source: HTMLImageElement)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      source: HTMLCanvasElement)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      source: HTMLVideoElement)

    fun texSubImage3D(target: Int,
                      level: Int,
                      xoffset: Int,
                      yoffset: Int,
                      zoffset: Int,
                      width: Int,
                      height: Int,
                      depth: Int,
                      format: Int,
                      type: Int,
                      srcData: ArrayBufferView?,
                      srcOffset: Int? = definedExternally)

    fun copyTexSubImage3D(target: Int,
                          level: Int,
                          xoffset: Int,
                          yoffset: Int,
                          zoffset: Int,
                          x: Int,
                          y: Int,
                          width: Int,
                          height: Int)

    fun compressedTexImage2D(target: Int,
                             level: Int,
                             internalformat: Int,
                             width: Int,
                             height: Int,
                             border: Int,
                             imageSize: Int,
                             offset: Int)

    fun compressedTexImage2D(target: Int,
                             level: Int,
                             internalformat: Int,
                             width: Int,
                             height: Int,
                             border: Int,
                             srcData: ArrayBufferView,
                             srcOffset: Int? = definedExternally,
                             srcLengthOverride: Int? = definedExternally)

    fun compressedTexImage3D(target: Int,
                             level: Int,
                             internalformat: Int,
                             width: Int,
                             height: Int,
                             depth: Int,
                             border: Int,
                             imageSize: Int,
                             offset: Int)

    fun compressedTexImage3D(target: Int,
                             level: Int,
                             internalformat: Int,
                             width: Int,
                             height: Int,
                             depth: Int,
                             border: Int,
                             srcData: ArrayBufferView,
                             srcOffset: Int? = definedExternally,
                             srcLengthOverride: Int? = definedExternally)

    fun compressedTexSubImage2D(target: Int,
                                level: Int,
                                xoffset: Int,
                                yoffset: Int,
                                width: Int,
                                height: Int,
                                format: Int,
                                imageSize: Int,
                                offset: Int)

    fun compressedTexSubImage2D(target: Int,
                                level: Int,
                                xoffset: Int,
                                yoffset: Int,
                                width: Int,
                                height: Int,
                                format: Int,
                                srcData: ArrayBufferView,
                                srcOffset: Int? = definedExternally,
                                srcLengthOverride: Int? = definedExternally)

    fun compressedTexSubImage3D(target: Int,
                                level: Int,
                                xoffset: Int,
                                yoffset: Int,
                                zoffset: Int,
                                width: Int,
                                height: Int,
                                depth: Int,
                                format: Int,
                                imageSize: Int,
                                offset: Int)

    fun compressedTexSubImage3D(target: Int,
                                level: Int,
                                xoffset: Int,
                                yoffset: Int,
                                zoffset: Int,
                                width: Int,
                                height: Int,
                                depth: Int,
                                format: Int,
                                srcData: ArrayBufferView,
                                srcOffset: Int? = definedExternally,
                                srcLengthOverride: Int? = definedExternally)

    fun getFragDataLocation(program: WebGLProgram,
                            name: String): Int

    fun uniform1ui(location: WebGLUniformLocation?,
                   v0: Int)

    fun uniform2ui(location: WebGLUniformLocation?,
                   v0: Int,
                   v1: Int)

    fun uniform3ui(location: WebGLUniformLocation?,
                   v0: Int,
                   v1: Int,
                   v2: Int)

    fun uniform4ui(location: WebGLUniformLocation?,
                   v0: Int,
                   v1: Int,
                   v2: Int,
                   v3: Int)

    fun uniform1fv(location: WebGLUniformLocation?,
                   data: Float32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform1fv(location: WebGLUniformLocation?,
                   data: Array<Double>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform2fv(location: WebGLUniformLocation?,
                   data: Float32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform2fv(location: WebGLUniformLocation?,
                   data: Array<Double>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform3fv(location: WebGLUniformLocation?,
                   data: Float32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform3fv(location: WebGLUniformLocation?,
                   data: Array<Double>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform4fv(location: WebGLUniformLocation?,
                   data: Float32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform4fv(location: WebGLUniformLocation?,
                   data: Array<Double>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform1iv(location: WebGLUniformLocation?,
                   data: Int32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform1iv(location: WebGLUniformLocation?,
                   data: Array<Int>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform2iv(location: WebGLUniformLocation?,
                   data: Int32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform2iv(location: WebGLUniformLocation?,
                   data: Array<Int>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform3iv(location: WebGLUniformLocation?,
                   data: Int32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform3iv(location: WebGLUniformLocation?,
                   data: Array<Int>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform4iv(location: WebGLUniformLocation?,
                   data: Int32Array,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform4iv(location: WebGLUniformLocation?,
                   data: Array<Int>,
                   srcOffset: Int? = definedExternally,
                   srcLength: Int? = definedExternally)

    fun uniform1uiv(location: WebGLUniformLocation?,
                    data: Uint32Array,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform1uiv(location: WebGLUniformLocation?,
                    data: Array<Int>,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform2uiv(location: WebGLUniformLocation?,
                    data: Uint32Array,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform2uiv(location: WebGLUniformLocation?,
                    data: Array<Int>,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform3uiv(location: WebGLUniformLocation?,
                    data: Uint32Array,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform3uiv(location: WebGLUniformLocation?,
                    data: Array<Int>,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform4uiv(location: WebGLUniformLocation?,
                    data: Uint32Array,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniform4uiv(location: WebGLUniformLocation?,
                    data: Array<Int>,
                    srcOffset: Int? = definedExternally,
                    srcLength: Int? = definedExternally)

    fun uniformMatrix2fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Float32Array,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun uniformMatrix2fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Array<Double>,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun uniformMatrix3x2fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix3x2fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix4x2fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix4x2fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix2x3fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix2x3fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix3fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Float32Array,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun uniformMatrix3fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Array<Double>,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun uniformMatrix4x3fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix4x3fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix2x4fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix2x4fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix3x4fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Float32Array,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix3x4fv(location: WebGLUniformLocation?,
                           transpose: Boolean,
                           data: Array<Double>,
                           srcOffset: Int? = definedExternally,
                           srcLength: Int? = definedExternally)

    fun uniformMatrix4fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Float32Array,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun uniformMatrix4fv(location: WebGLUniformLocation?,
                         transpose: Boolean,
                         data: Array<Double>,
                         srcOffset: Int? = definedExternally,
                         srcLength: Int? = definedExternally)

    fun vertexAttribI4i(index: Int,
                        x: Int,
                        y: Int,
                        z: Int,
                        w: Int)

    fun vertexAttribI4iv(index: Int,
                         values: Int32Array)

    fun vertexAttribI4iv(index: Int,
                         values: Array<Int>)

    fun vertexAttribI4ui(index: Int,
                         x: Int,
                         y: Int,
                         z: Int,
                         w: Int)

    fun vertexAttribI4uiv(index: Int,
                          values: Uint32Array)

    fun vertexAttribI4uiv(index: Int,
                          values: Array<Int>)

    fun vertexAttribIPointer(index: Int,
                             size: Int,
                             type: Int,
                             stride: Int,
                             offset: Int)

    fun vertexAttribDivisor(index: Int,
                            divisor: Int)

    fun drawArraysInstanced(mode: Int,
                            first: Int,
                            count: Int,
                            instanceCount: Int)

    fun drawElementsInstanced(mode: Int,
                              count: Int,
                              type: Int,
                              offset: Int,
                              instanceCount: Int)

    fun drawRangeElements(mode: Int,
                          start: Int,
                          end: Int,
                          count: Int,
                          type: Int,
                          offset: Int)

    fun readPixels(x: Int,
                   y: Int,
                   width: Int,
                   height: Int,
                   format: Int,
                   type: Int,
                   offset: Int)

    fun readPixels(x: Int,
                   y: Int,
                   width: Int,
                   height: Int,
                   format: Int,
                   type: Int,
                   dstData: ArrayBufferView,
                   dstOffset: Int)

    fun drawBuffers(buffers: Array<Int>)
    fun clearBufferfv(buffer: Int,
                      drawbuffer: Int,
                      values: Float32Array,
                      srcOffset: Int? = definedExternally)

    fun clearBufferfv(buffer: Int,
                      drawbuffer: Int,
                      values: Array<Double>,
                      srcOffset: Int? = definedExternally)

    fun clearBufferiv(buffer: Int,
                      drawbuffer: Int,
                      values: Int32Array,
                      srcOffset: Int? = definedExternally)

    fun clearBufferiv(buffer: Int,
                      drawbuffer: Int,
                      values: Array<Int>,
                      srcOffset: Int? = definedExternally)

    fun clearBufferuiv(buffer: Int,
                       drawbuffer: Int,
                       values: Uint32Array,
                       srcOffset: Int? = definedExternally)

    fun clearBufferuiv(buffer: Int,
                       drawbuffer: Int,
                       values: Array<Int>,
                       srcOffset: Int? = definedExternally)

    fun clearBufferfi(buffer: Int,
                      drawbuffer: Int,
                      depth: Int,
                      stencil: Int)

    fun createQuery(): WebGLQuery?
    fun deleteQuery(query: WebGLQuery?)
    fun isQuery(query: WebGLQuery?): Boolean
    fun beginQuery(target: Int,
                   query: WebGLQuery)

    fun endQuery(target: Int)
    fun getQuery(target: Int,
                 pname: Int): WebGLQuery?

    fun getQueryParameter(query: WebGLQuery,
                          pname: Int): Any

    fun createSampler(): WebGLSampler?
    fun deleteSampler(sampler: WebGLSampler?)
    fun isSampler(sampler: WebGLSampler?): Boolean
    fun bindSampler(unit: Int,
                    sampler: WebGLSampler?)

    fun samplerParameteri(sampler: WebGLSampler,
                          pname: Int,
                          param: Int)

    fun samplerParameterf(sampler: WebGLSampler,
                          pname: Int,
                          param: Int)

    fun getSamplerParameter(sampler: WebGLSampler,
                            pname: Int): Any

    fun fenceSync(condition: Int,
                  flags: Int): WebGLSync?

    fun isSync(sync: WebGLSync?): Boolean
    fun deleteSync(sync: WebGLSync?)
    fun clientWaitSync(sync: WebGLSync,
                       flags: Int,
                       timeout: Number): Int

    fun waitSync(sync: WebGLSync,
                 flags: Int,
                 timeout: Number)

    fun getSyncParameter(sync: WebGLSync,
                         pname: Int): Any

    fun createTransformFeedback(): WebGLTransformFeedback?
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)
    fun isTransformFeedback(tf: WebGLTransformFeedback?): Boolean
    fun bindTransformFeedback(target: Int,
                              tf: WebGLTransformFeedback?)

    fun beginTransformFeedback(primitiveMode: Int)
    fun endTransformFeedback()
    fun transformFeedbackVaryings(program: WebGLProgram,
                                  varyings: Array<String>,
                                  bufferMode: Int)

    fun getTransformFeedbackVarying(program: WebGLProgram,
                                    index: Int): WebGLActiveInfo?

    fun pauseTransformFeedback()
    fun resumeTransformFeedback()
    fun bindBufferBase(target: Int,
                       index: Int,
                       buffer: WebGLBuffer?)

    fun bindBufferRange(target: Int,
                        index: Int,
                        buffer: WebGLBuffer?,
                        offset: Int,
                        size: Int)

    fun getIndexedParameter(target: Int,
                            index: Int): Any

    fun getUniformIndices(program: WebGLProgram,
                          uniformNames: Array<String>): Array<Int>?

    fun getActiveUniforms(program: WebGLProgram,
                          uniformIndices: Array<Int>,
                          pname: Int): Any

    fun getUniformBlockIndex(program: WebGLProgram,
                             uniformBlockName: String): Int

    fun getActiveUniformBlockParameter(program: WebGLProgram,
                                       uniformBlockIndex: Int,
                                       pname: Int): Any

    fun getActiveUniformBlockName(program: WebGLProgram,
                                  uniformBlockIndex: Int): String?

    fun uniformBlockBinding(program: WebGLProgram,
                            uniformBlockIndex: Int,
                            uniformBlockBinding: Int)

    fun createVertexArray(): WebGLVertexArrayObject?
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): Boolean
    fun bindVertexArray(array: WebGLVertexArrayObject?)

    companion object {
        val ACTIVE_ATTRIBUTES: Int
        val ACTIVE_TEXTURE: Int
        val ACTIVE_UNIFORMS: Int
        val ALIASED_LINE_WIDTH_RANGE: Int
        val ALIASED_POINT_SIZE_RANGE: Int
        val ALPHA: Int
        val ALPHA_BITS: Int
        val ALWAYS: Int
        val ARRAY_BUFFER: Int
        val ARRAY_BUFFER_BINDING: Int
        val ATTACHED_SHADERS: Int
        val BACK: Int
        val BLEND: Int
        val BLEND_COLOR: Int
        val BLEND_DST_ALPHA: Int
        val BLEND_DST_RGB: Int
        val BLEND_EQUATION: Int
        val BLEND_EQUATION_ALPHA: Int
        val BLEND_EQUATION_RGB: Int
        val BLEND_SRC_ALPHA: Int
        val BLEND_SRC_RGB: Int
        val BLUE_BITS: Int
        val BOOL: Int
        val BOOL_VEC2: Int
        val BOOL_VEC3: Int
        val BOOL_VEC4: Int
        val BROWSER_DEFAULT_WEBGL: Int
        val BUFFER_SIZE: Int
        val BUFFER_USAGE: Int
        val BYTE: Int
        val CCW: Int
        val CLAMP_TO_EDGE: Int
        val COLOR_ATTACHMENT0: Int
        val COLOR_BUFFER_BIT: Int
        val COLOR_CLEAR_VALUE: Int
        val COLOR_WRITEMASK: Int
        val COMPILE_STATUS: Int
        val COMPRESSED_TEXTURE_FORMATS: Int
        val CONSTANT_ALPHA: Int
        val CONSTANT_COLOR: Int
        val CONTEXT_LOST_WEBGL: Int
        val CULL_FACE: Int
        val CULL_FACE_MODE: Int
        val CURRENT_PROGRAM: Int
        val CURRENT_VERTEX_ATTRIB: Int
        val CW: Int
        val DECR: Int
        val DECR_WRAP: Int
        val DELETE_STATUS: Int
        val DEPTH_ATTACHMENT: Int
        val DEPTH_BITS: Int
        val DEPTH_BUFFER_BIT: Int
        val DEPTH_CLEAR_VALUE: Int
        val DEPTH_COMPONENT: Int
        val DEPTH_COMPONENT16: Int
        val DEPTH_FUNC: Int
        val DEPTH_RANGE: Int
        val DEPTH_STENCIL: Int
        val DEPTH_STENCIL_ATTACHMENT: Int
        val DEPTH_TEST: Int
        val DEPTH_WRITEMASK: Int
        val DITHER: Int
        val DONT_CARE: Int
        val DST_ALPHA: Int
        val DST_COLOR: Int
        val DYNAMIC_DRAW: Int
        val ELEMENT_ARRAY_BUFFER: Int
        val ELEMENT_ARRAY_BUFFER_BINDING: Int
        val EQUAL: Int
        val FASTEST: Int
        val FLOAT: Int
        val FLOAT_MAT2: Int
        val FLOAT_MAT3: Int
        val FLOAT_MAT4: Int
        val FLOAT_VEC2: Int
        val FLOAT_VEC3: Int
        val FLOAT_VEC4: Int
        val FRAGMENT_SHADER: Int
        val FRAMEBUFFER: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        val FRAMEBUFFER_BINDING: Int
        val FRAMEBUFFER_COMPLETE: Int
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        val FRAMEBUFFER_UNSUPPORTED: Int
        val FRONT: Int
        val FRONT_AND_BACK: Int
        val FRONT_FACE: Int
        val FUNC_ADD: Int
        val FUNC_REVERSE_SUBTRACT: Int
        val FUNC_SUBTRACT: Int
        val GENERATE_MIPMAP_HINT: Int
        val GEQUAL: Int
        val GREATER: Int
        val GREEN_BITS: Int
        val HIGH_FLOAT: Int
        val HIGH_INT: Int
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        val IMPLEMENTATION_COLOR_READ_TYPE: Int
        val INCR: Int
        val INCR_WRAP: Int
        val INT: Int
        val INT_VEC2: Int
        val INT_VEC3: Int
        val INT_VEC4: Int
        val INVALID_ENUM: Int
        val INVALID_FRAMEBUFFER_OPERATION: Int
        val INVALID_OPERATION: Int
        val INVALID_VALUE: Int
        val INVERT: Int
        val KEEP: Int
        val LEQUAL: Int
        val LESS: Int
        val LINEAR: Int
        val LINEAR_MIPMAP_LINEAR: Int
        val LINEAR_MIPMAP_NEAREST: Int
        val LINES: Int
        val LINE_LOOP: Int
        val LINE_STRIP: Int
        val LINE_WIDTH: Int
        val LINK_STATUS: Int
        val LOW_FLOAT: Int
        val LOW_INT: Int
        val LUMINANCE: Int
        val LUMINANCE_ALPHA: Int
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        val MAX_RENDERBUFFER_SIZE: Int
        val MAX_TEXTURE_IMAGE_UNITS: Int
        val MAX_TEXTURE_SIZE: Int
        val MAX_VARYING_VECTORS: Int
        val MAX_VERTEX_ATTRIBS: Int
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        val MAX_VERTEX_UNIFORM_VECTORS: Int
        val MAX_VIEWPORT_DIMS: Int
        val MEDIUM_FLOAT: Int
        val MEDIUM_INT: Int
        val MIRRORED_REPEAT: Int
        val NEAREST: Int
        val NEAREST_MIPMAP_LINEAR: Int
        val NEAREST_MIPMAP_NEAREST: Int
        val NEVER: Int
        val NICEST: Int
        val NONE: Int
        val NOTEQUAL: Int
        val NO_ERROR: Int
        val ONE: Int
        val ONE_MINUS_CONSTANT_ALPHA: Int
        val ONE_MINUS_CONSTANT_COLOR: Int
        val ONE_MINUS_DST_ALPHA: Int
        val ONE_MINUS_DST_COLOR: Int
        val ONE_MINUS_SRC_ALPHA: Int
        val ONE_MINUS_SRC_COLOR: Int
        val OUT_OF_MEMORY: Int
        val PACK_ALIGNMENT: Int
        val POINTS: Int
        val POLYGON_OFFSET_FACTOR: Int
        val POLYGON_OFFSET_FILL: Int
        val POLYGON_OFFSET_UNITS: Int
        val RED_BITS: Int
        val RENDERBUFFER: Int
        val RENDERBUFFER_ALPHA_SIZE: Int
        val RENDERBUFFER_BINDING: Int
        val RENDERBUFFER_BLUE_SIZE: Int
        val RENDERBUFFER_DEPTH_SIZE: Int
        val RENDERBUFFER_GREEN_SIZE: Int
        val RENDERBUFFER_HEIGHT: Int
        val RENDERBUFFER_INTERNAL_FORMAT: Int
        val RENDERBUFFER_RED_SIZE: Int
        val RENDERBUFFER_STENCIL_SIZE: Int
        val RENDERBUFFER_WIDTH: Int
        val RENDERER: Int
        val REPEAT: Int
        val REPLACE: Int
        val RGB: Int
        val RGB565: Int
        val RGB5_A1: Int
        val RGBA: Int
        val RGBA4: Int
        val SAMPLER_2D: Int
        val SAMPLER_CUBE: Int
        val SAMPLES: Int
        val SAMPLE_ALPHA_TO_COVERAGE: Int
        val SAMPLE_BUFFERS: Int
        val SAMPLE_COVERAGE: Int
        val SAMPLE_COVERAGE_INVERT: Int
        val SAMPLE_COVERAGE_VALUE: Int
        val SCISSOR_BOX: Int
        val SCISSOR_TEST: Int
        val SHADER_TYPE: Int
        val SHADING_LANGUAGE_VERSION: Int
        val SHORT: Int
        val SRC_ALPHA: Int
        val SRC_ALPHA_SATURATE: Int
        val SRC_COLOR: Int
        val STATIC_DRAW: Int
        val STENCIL_ATTACHMENT: Int
        val STENCIL_BACK_FAIL: Int
        val STENCIL_BACK_FUNC: Int
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_PASS: Int
        val STENCIL_BACK_REF: Int
        val STENCIL_BACK_VALUE_MASK: Int
        val STENCIL_BACK_WRITEMASK: Int
        val STENCIL_BITS: Int
        val STENCIL_BUFFER_BIT: Int
        val STENCIL_CLEAR_VALUE: Int
        val STENCIL_FAIL: Int
        val STENCIL_FUNC: Int
        val STENCIL_INDEX: Int
        val STENCIL_INDEX8: Int
        val STENCIL_PASS_DEPTH_FAIL: Int
        val STENCIL_PASS_DEPTH_PASS: Int
        val STENCIL_REF: Int
        val STENCIL_TEST: Int
        val STENCIL_VALUE_MASK: Int
        val STENCIL_WRITEMASK: Int
        val STREAM_DRAW: Int
        val SUBPIXEL_BITS: Int
        val TEXTURE: Int
        val TEXTURE0: Int
        val TEXTURE1: Int
        val TEXTURE10: Int
        val TEXTURE11: Int
        val TEXTURE12: Int
        val TEXTURE13: Int
        val TEXTURE14: Int
        val TEXTURE15: Int
        val TEXTURE16: Int
        val TEXTURE17: Int
        val TEXTURE18: Int
        val TEXTURE19: Int
        val TEXTURE2: Int
        val TEXTURE20: Int
        val TEXTURE21: Int
        val TEXTURE22: Int
        val TEXTURE23: Int
        val TEXTURE24: Int
        val TEXTURE25: Int
        val TEXTURE26: Int
        val TEXTURE27: Int
        val TEXTURE28: Int
        val TEXTURE29: Int
        val TEXTURE3: Int
        val TEXTURE30: Int
        val TEXTURE31: Int
        val TEXTURE4: Int
        val TEXTURE5: Int
        val TEXTURE6: Int
        val TEXTURE7: Int
        val TEXTURE8: Int
        val TEXTURE9: Int
        val TEXTURE_2D: Int
        val TEXTURE_BINDING_2D: Int
        val TEXTURE_BINDING_CUBE_MAP: Int
        val TEXTURE_CUBE_MAP: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        val TEXTURE_MAG_FILTER: Int
        val TEXTURE_MIN_FILTER: Int
        val TEXTURE_WRAP_S: Int
        val TEXTURE_WRAP_T: Int
        val TRIANGLES: Int
        val TRIANGLE_FAN: Int
        val TRIANGLE_STRIP: Int
        val UNPACK_ALIGNMENT: Int
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        val UNPACK_FLIP_Y_WEBGL: Int
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        val UNSIGNED_BYTE: Int
        val UNSIGNED_INT: Int
        val UNSIGNED_SHORT: Int
        val UNSIGNED_SHORT_4_4_4_4: Int
        val UNSIGNED_SHORT_5_5_5_1: Int
        val UNSIGNED_SHORT_5_6_5: Int
        val VALIDATE_STATUS: Int
        val VENDOR: Int
        val VERSION: Int
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        val VERTEX_ATTRIB_ARRAY_POINTER: Int
        val VERTEX_ATTRIB_ARRAY_SIZE: Int
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        val VERTEX_ATTRIB_ARRAY_TYPE: Int
        val VERTEX_SHADER: Int
        val VIEWPORT: Int
        val ZERO: Int
        val READ_BUFFER: Int
        val UNPACK_ROW_LENGTH: Int
        val UNPACK_SKIP_ROWS: Int
        val UNPACK_SKIP_PIXELS: Int
        val PACK_ROW_LENGTH: Int
        val PACK_SKIP_ROWS: Int
        val PACK_SKIP_PIXELS: Int
        val COLOR: Int
        val DEPTH: Int
        val STENCIL: Int
        val RED: Int
        val RGB8: Int
        val RGBA8: Int
        val RGB10_A2: Int
        val TEXTURE_BINDING_3D: Int
        val UNPACK_SKIP_IMAGES: Int
        val UNPACK_IMAGE_HEIGHT: Int
        val TEXTURE_3D: Int
        val TEXTURE_WRAP_R: Int
        val MAX_3D_TEXTURE_SIZE: Int
        val UNSIGNED_INT_2_10_10_10_REV: Int
        val MAX_ELEMENTS_VERTICES: Int
        val MAX_ELEMENTS_INDICES: Int
        val TEXTURE_MIN_LOD: Int
        val TEXTURE_MAX_LOD: Int
        val TEXTURE_BASE_LEVEL: Int
        val TEXTURE_MAX_LEVEL: Int
        val MIN: Int
        val MAX: Int
        val DEPTH_COMPONENT24: Int
        val MAX_TEXTURE_LOD_BIAS: Int
        val TEXTURE_COMPARE_MODE: Int
        val TEXTURE_COMPARE_FUNC: Int
        val CURRENT_QUERY: Int
        val QUERY_RESULT: Int
        val QUERY_RESULT_AVAILABLE: Int
        val STREAM_READ: Int
        val STREAM_COPY: Int
        val STATIC_READ: Int
        val STATIC_COPY: Int
        val DYNAMIC_READ: Int
        val DYNAMIC_COPY: Int
        val MAX_DRAW_BUFFERS: Int
        val DRAW_BUFFER0: Int
        val DRAW_BUFFER1: Int
        val DRAW_BUFFER2: Int
        val DRAW_BUFFER3: Int
        val DRAW_BUFFER4: Int
        val DRAW_BUFFER5: Int
        val DRAW_BUFFER6: Int
        val DRAW_BUFFER7: Int
        val DRAW_BUFFER8: Int
        val DRAW_BUFFER9: Int
        val DRAW_BUFFER10: Int
        val DRAW_BUFFER11: Int
        val DRAW_BUFFER12: Int
        val DRAW_BUFFER13: Int
        val DRAW_BUFFER14: Int
        val DRAW_BUFFER15: Int
        val MAX_FRAGMENT_UNIFORM_COMPONENTS: Int
        val MAX_VERTEX_UNIFORM_COMPONENTS: Int
        val SAMPLER_3D: Int
        val SAMPLER_2D_SHADOW: Int
        val FRAGMENT_SHADER_DERIVATIVE_HINT: Int
        val PIXEL_PACK_BUFFER: Int
        val PIXEL_UNPACK_BUFFER: Int
        val PIXEL_PACK_BUFFER_BINDING: Int
        val PIXEL_UNPACK_BUFFER_BINDING: Int
        val FLOAT_MAT2x3: Int
        val FLOAT_MAT2x4: Int
        val FLOAT_MAT3x2: Int
        val FLOAT_MAT3x4: Int
        val FLOAT_MAT4x2: Int
        val FLOAT_MAT4x3: Int
        val SRGB: Int
        val SRGB8: Int
        val SRGB8_ALPHA8: Int
        val COMPARE_REF_TO_TEXTURE: Int
        val RGBA32F: Int
        val RGB32F: Int
        val RGBA16F: Int
        val RGB16F: Int
        val VERTEX_ATTRIB_ARRAY_INTEGER: Int
        val MAX_ARRAY_TEXTURE_LAYERS: Int
        val MIN_PROGRAM_TEXEL_OFFSET: Int
        val MAX_PROGRAM_TEXEL_OFFSET: Int
        val MAX_VARYING_COMPONENTS: Int
        val TEXTURE_2D_ARRAY: Int
        val TEXTURE_BINDING_2D_ARRAY: Int
        val R11F_G11F_B10F: Int
        val UNSIGNED_INT_10F_11F_11F_REV: Int
        val RGB9_E5: Int
        val UNSIGNED_INT_5_9_9_9_REV: Int
        val TRANSFORM_FEEDBACK_BUFFER_MODE: Int
        val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int
        val TRANSFORM_FEEDBACK_VARYINGS: Int
        val TRANSFORM_FEEDBACK_BUFFER_START: Int
        val TRANSFORM_FEEDBACK_BUFFER_SIZE: Int
        val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int
        val RASTERIZER_DISCARD: Int
        val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int
        val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int
        val INTERLEAVED_ATTRIBS: Int
        val SEPARATE_ATTRIBS: Int
        val TRANSFORM_FEEDBACK_BUFFER: Int
        val TRANSFORM_FEEDBACK_BUFFER_BINDING: Int
        val RGBA32UI: Int
        val RGB32UI: Int
        val RGBA16UI: Int
        val RGB16UI: Int
        val RGBA8UI: Int
        val RGB8UI: Int
        val RGBA32I: Int
        val RGB32I: Int
        val RGBA16I: Int
        val RGB16I: Int
        val RGBA8I: Int
        val RGB8I: Int
        val RED_INTEGER: Int
        val RGB_INTEGER: Int
        val RGBA_INTEGER: Int
        val SAMPLER_2D_ARRAY: Int
        val SAMPLER_2D_ARRAY_SHADOW: Int
        val SAMPLER_CUBE_SHADOW: Int
        val UNSIGNED_INT_VEC2: Int
        val UNSIGNED_INT_VEC3: Int
        val UNSIGNED_INT_VEC4: Int
        val INT_SAMPLER_2D: Int
        val INT_SAMPLER_3D: Int
        val INT_SAMPLER_CUBE: Int
        val INT_SAMPLER_2D_ARRAY: Int
        val UNSIGNED_INT_SAMPLER_2D: Int
        val UNSIGNED_INT_SAMPLER_3D: Int
        val UNSIGNED_INT_SAMPLER_CUBE: Int
        val UNSIGNED_INT_SAMPLER_2D_ARRAY: Int
        val DEPTH_COMPONENT32F: Int
        val DEPTH32F_STENCIL8: Int
        val FLOAT_32_UNSIGNED_INT_24_8_REV: Int
        val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int
        val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int
        val FRAMEBUFFER_DEFAULT: Int
        val UNSIGNED_INT_24_8: Int
        val DEPTH24_STENCIL8: Int
        val UNSIGNED_NORMALIZED: Int
        val DRAW_FRAMEBUFFER_BINDING: Int
        val READ_FRAMEBUFFER: Int
        val DRAW_FRAMEBUFFER: Int
        val READ_FRAMEBUFFER_BINDING: Int
        val RENDERBUFFER_SAMPLES: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int
        val MAX_COLOR_ATTACHMENTS: Int
        val COLOR_ATTACHMENT1: Int
        val COLOR_ATTACHMENT2: Int
        val COLOR_ATTACHMENT3: Int
        val COLOR_ATTACHMENT4: Int
        val COLOR_ATTACHMENT5: Int
        val COLOR_ATTACHMENT6: Int
        val COLOR_ATTACHMENT7: Int
        val COLOR_ATTACHMENT8: Int
        val COLOR_ATTACHMENT9: Int
        val COLOR_ATTACHMENT10: Int
        val COLOR_ATTACHMENT11: Int
        val COLOR_ATTACHMENT12: Int
        val COLOR_ATTACHMENT13: Int
        val COLOR_ATTACHMENT14: Int
        val COLOR_ATTACHMENT15: Int
        val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int
        val MAX_SAMPLES: Int
        val HALF_FLOAT: Int
        val RG: Int
        val RG_INTEGER: Int
        val R8: Int
        val RG8: Int
        val R16F: Int
        val R32F: Int
        val RG16F: Int
        val RG32F: Int
        val R8I: Int
        val R8UI: Int
        val R16I: Int
        val R16UI: Int
        val R32I: Int
        val R32UI: Int
        val RG8I: Int
        val RG8UI: Int
        val RG16I: Int
        val RG16UI: Int
        val RG32I: Int
        val RG32UI: Int
        val VERTEX_ARRAY_BINDING: Int
        val R8_SNORM: Int
        val RG8_SNORM: Int
        val RGB8_SNORM: Int
        val RGBA8_SNORM: Int
        val SIGNED_NORMALIZED: Int
        val COPY_READ_BUFFER: Int
        val COPY_WRITE_BUFFER: Int
        val COPY_READ_BUFFER_BINDING: Int
        val COPY_WRITE_BUFFER_BINDING: Int
        val UNIFORM_BUFFER: Int
        val UNIFORM_BUFFER_BINDING: Int
        val UNIFORM_BUFFER_START: Int
        val UNIFORM_BUFFER_SIZE: Int
        val MAX_VERTEX_UNIFORM_BLOCKS: Int
        val MAX_FRAGMENT_UNIFORM_BLOCKS: Int
        val MAX_COMBINED_UNIFORM_BLOCKS: Int
        val MAX_UNIFORM_BUFFER_BINDINGS: Int
        val MAX_UNIFORM_BLOCK_SIZE: Int
        val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int
        val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int
        val UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int
        val ACTIVE_UNIFORM_BLOCKS: Int
        val UNIFORM_TYPE: Int
        val UNIFORM_SIZE: Int
        val UNIFORM_BLOCK_INDEX: Int
        val UNIFORM_OFFSET: Int
        val UNIFORM_ARRAY_STRIDE: Int
        val UNIFORM_MATRIX_STRIDE: Int
        val UNIFORM_IS_ROW_MAJOR: Int
        val UNIFORM_BLOCK_BINDING: Int
        val UNIFORM_BLOCK_DATA_SIZE: Int
        val UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int
        val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int
        val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int
        val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int
        val INVALID_INDEX: Int
        val MAX_VERTEX_OUTPUT_COMPONENTS: Int
        val MAX_FRAGMENT_INPUT_COMPONENTS: Int
        val MAX_SERVER_WAIT_TIMEOUT: Int
        val OBJECT_TYPE: Int
        val SYNC_CONDITION: Int
        val SYNC_STATUS: Int
        val SYNC_FLAGS: Int
        val SYNC_FENCE: Int
        val SYNC_GPU_COMMANDS_COMPLETE: Int
        val UNSIGNALED: Int
        val SIGNALED: Int
        val ALREADY_SIGNALED: Int
        val TIMEOUT_EXPIRED: Int
        val CONDITION_SATISFIED: Int
        val WAIT_FAILED: Int
        val SYNC_FLUSH_COMMANDS_BIT: Int
        val VERTEX_ATTRIB_ARRAY_DIVISOR: Int
        val ANY_SAMPLES_PASSED: Int
        val ANY_SAMPLES_PASSED_CONSERVATIVE: Int
        val SAMPLER_BINDING: Int
        val RGB10_A2UI: Int
        val INT_2_10_10_10_REV: Int
        val TRANSFORM_FEEDBACK: Int
        val TRANSFORM_FEEDBACK_PAUSED: Int
        val TRANSFORM_FEEDBACK_ACTIVE: Int
        val TRANSFORM_FEEDBACK_BINDING: Int
        val TEXTURE_IMMUTABLE_FORMAT: Int
        val MAX_ELEMENT_INDEX: Int
        val TEXTURE_IMMUTABLE_LEVELS: Int
        val TIMEOUT_IGNORED: Int
        val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int
    }
}

external abstract class WebGLQuery : WebGLObject
external abstract class WebGLSampler : WebGLObject
external abstract class WebGLSync : WebGLObject
external abstract class WebGLTransformFeedback : WebGLObject
external abstract class WebGLVertexArrayObject : WebGLObject
