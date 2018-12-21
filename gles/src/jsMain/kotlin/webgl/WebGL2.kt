/*
 * Generated using:
 * https://github.com/JetBrains/kotlin/tree/master/libraries/tools/idl2k
 *
 * WebIDL from:
 * https://www.khronos.org/registry/webgl/specs/latest/2.0/webgl2.idl
 */

package net.gitout.ktbindings.gles.webgl

import org.khronos.webgl.*
import org.w3c.dom.HTMLCanvasElement

public external interface WebGL2RenderingContextBase {
    val canvas: HTMLCanvasElement
    val drawingBufferWidth: Int
    val drawingBufferHeight: Int
    fun bufferData(target: Int, size: Int, usage: Int): Unit
    fun bufferData(target: Int, srcData: dynamic, usage: Int): Unit
    fun bufferSubData(target: Int, dstByteOffset: Int, srcData: dynamic): Unit
    fun bufferData(target: Int, srcData: dynamic, usage: Int, srcOffset: Int, length: Int = definedExternally): Unit
    fun bufferSubData(target: Int, dstByteOffset: Int, srcData: dynamic, srcOffset: Int, length: Int = definedExternally): Unit
    fun copyBufferSubData(readTarget: Int, writeTarget: Int, readOffset: Int, writeOffset: Int, size: Int): Unit
    fun getBufferSubData(target: Int, srcByteOffset: Int, dstBuffer: dynamic, dstOffset: Int = definedExternally, length: Int = definedExternally): Unit
    fun blitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int, filter: Int): Unit
    fun framebufferTextureLayer(target: Int, attachment: Int, texture: WebGLTexture?, level: Int, layer: Int): Unit
    fun invalidateFramebuffer(target: Int, attachments: Array<Int>): Unit
    fun invalidateSubFramebuffer(target: Int, attachments: Array<Int>, x: Int, y: Int, width: Int, height: Int): Unit
    fun readBuffer(src: Int): Unit
    fun getInternalformatParameter(target: Int, internalformat: Int, pname: Int): Any?
    fun renderbufferStorageMultisample(target: Int, samples: Int, internalformat: Int, width: Int, height: Int): Unit
    fun texStorage2D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int): Unit
    fun texStorage3D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int, depth: Int): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: dynamic): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: dynamic): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: dynamic): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: dynamic): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pboOffset: Int): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, srcData: dynamic, srcOffset: Int): Unit
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, pboOffset: Int): Unit
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: dynamic): Unit
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: dynamic, srcOffset: Int): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pboOffset: Int): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, srcData: dynamic, srcOffset: Int): Unit
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, pboOffset: Int): Unit
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: dynamic): Unit
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, srcData: dynamic, srcOffset: Int = definedExternally): Unit
    fun copyTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, offset: Int): Unit
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: dynamic, srcOffset: Int = definedExternally, srcLengthOverride: Int = definedExternally): Unit
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, imageSize: Int, offset: Int): Unit
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: dynamic, srcOffset: Int = definedExternally, srcLengthOverride: Int = definedExternally): Unit
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, offset: Int): Unit
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, srcData: dynamic, srcOffset: Int = definedExternally, srcLengthOverride: Int = definedExternally): Unit
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, imageSize: Int, offset: Int): Unit
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, srcData: dynamic, srcOffset: Int = definedExternally, srcLengthOverride: Int = definedExternally): Unit
    fun getFragDataLocation(program: WebGLProgram, name: String): Int
    fun uniform1ui(location: WebGLUniformLocation?, v0: Int): Unit
    fun uniform2ui(location: WebGLUniformLocation?, v0: Int, v1: Int): Unit
    fun uniform3ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int): Unit
    fun uniform4ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int, v3: Int): Unit
    fun uniform1fv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform2fv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform3fv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform4fv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform1iv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform2iv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform3iv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform4iv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform1uiv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform2uiv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform3uiv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniform4uiv(location: WebGLUniformLocation?, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix3x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix4x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix2x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix4x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix2x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix3x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, data: dynamic, srcOffset: Int = definedExternally, srcLength: Int = definedExternally): Unit
    fun vertexAttribI4i(index: Int, x: Int, y: Int, z: Int, w: Int): Unit
    fun vertexAttribI4iv(index: Int, values: dynamic): Unit
    fun vertexAttribI4ui(index: Int, x: Int, y: Int, z: Int, w: Int): Unit
    fun vertexAttribI4uiv(index: Int, values: dynamic): Unit
    fun vertexAttribIPointer(index: Int, size: Int, type: Int, stride: Int, offset: Int): Unit
    fun vertexAttribDivisor(index: Int, divisor: Int): Unit
    fun drawArraysInstanced(mode: Int, first: Int, count: Int, instanceCount: Int): Unit
    fun drawElementsInstanced(mode: Int, count: Int, type: Int, offset: Int, instanceCount: Int): Unit
    fun drawRangeElements(mode: Int, start: Int, end: Int, count: Int, type: Int, offset: Int): Unit
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: dynamic): Unit
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, offset: Int): Unit
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: dynamic, dstOffset: Int): Unit
    fun drawBuffers(buffers: Array<Int>): Unit
    fun clearBufferfv(buffer: Int, drawbuffer: Int, values: dynamic, srcOffset: Int = definedExternally): Unit
    fun clearBufferiv(buffer: Int, drawbuffer: Int, values: dynamic, srcOffset: Int = definedExternally): Unit
    fun clearBufferuiv(buffer: Int, drawbuffer: Int, values: dynamic, srcOffset: Int = definedExternally): Unit
    fun clearBufferfi(buffer: Int, drawbuffer: Int, depth: Float, stencil: Int): Unit
    fun createQuery(): WebGLQuery?
    fun deleteQuery(query: WebGLQuery?): Unit
    fun isQuery(query: WebGLQuery?): Boolean
    fun beginQuery(target: Int, query: WebGLQuery): Unit
    fun endQuery(target: Int): Unit
    fun getQuery(target: Int, pname: Int): WebGLQuery?
    fun getQueryParameter(query: WebGLQuery, pname: Int): Any?
    fun createSampler(): WebGLSampler?
    fun deleteSampler(sampler: WebGLSampler?): Unit
    fun isSampler(sampler: WebGLSampler?): Boolean
    fun bindSampler(unit: Int, sampler: WebGLSampler?): Unit
    fun samplerParameteri(sampler: WebGLSampler, pname: Int, param: Int): Unit
    fun samplerParameterf(sampler: WebGLSampler, pname: Int, param: Float): Unit
    fun getSamplerParameter(sampler: WebGLSampler, pname: Int): Any?
    fun fenceSync(condition: Int, flags: Int): WebGLSync?
    fun isSync(sync: WebGLSync?): Boolean
    fun deleteSync(sync: WebGLSync?): Unit
    fun clientWaitSync(sync: WebGLSync, flags: Int, timeout: Double): Int
    fun waitSync(sync: WebGLSync, flags: Int, timeout: Double): Unit
    fun getSyncParameter(sync: WebGLSync, pname: Int): Any?
    fun createTransformFeedback(): WebGLTransformFeedback?
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?): Unit
    fun isTransformFeedback(tf: WebGLTransformFeedback?): Boolean
    fun bindTransformFeedback(target: Int, tf: WebGLTransformFeedback?): Unit
    fun beginTransformFeedback(primitiveMode: Int): Unit
    fun endTransformFeedback(): Unit
    fun transformFeedbackVaryings(program: WebGLProgram, varyings: Array<String>, bufferMode: Int): Unit
    fun getTransformFeedbackVarying(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun pauseTransformFeedback(): Unit
    fun resumeTransformFeedback(): Unit
    fun bindBufferBase(target: Int, index: Int, buffer: WebGLBuffer?): Unit
    fun bindBufferRange(target: Int, index: Int, buffer: WebGLBuffer?, offset: Int, size: Int): Unit
    fun getIndexedParameter(target: Int, index: Int): Any?
    fun getUniformIndices(program: WebGLProgram, uniformNames: Array<String>): Array<Int>?
    fun getActiveUniforms(program: WebGLProgram, uniformIndices: Array<Int>, pname: Int): Any?
    fun getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Int
    fun getActiveUniformBlockParameter(program: WebGLProgram, uniformBlockIndex: Int, pname: Int): Any?
    fun getActiveUniformBlockName(program: WebGLProgram, uniformBlockIndex: Int): String?
    fun uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Int, uniformBlockBinding: Int): Unit
    fun createVertexArray(): WebGLVertexArrayObject?
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?): Unit
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): Boolean
    fun bindVertexArray(array: WebGLVertexArrayObject?): Unit
    fun getContextAttributes(): WebGLContextAttributes?
    fun isContextLost(): Boolean
    fun getSupportedExtensions(): Array<String>?
    fun getExtension(name: String): dynamic
    fun activeTexture(texture: Int): Unit
    fun attachShader(program: WebGLProgram, shader: WebGLShader): Unit
    fun bindAttribLocation(program: WebGLProgram, index: Int, name: String): Unit
    fun bindBuffer(target: Int, buffer: WebGLBuffer?): Unit
    fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?): Unit
    fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?): Unit
    fun bindTexture(target: Int, texture: WebGLTexture?): Unit
    fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    fun blendEquation(mode: Int): Unit
    fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit
    fun blendFunc(sfactor: Int, dfactor: Int): Unit
    fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int): Unit
    fun checkFramebufferStatus(target: Int): Int
    fun clear(mask: Int): Unit
    fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    fun clearDepth(depth: Float): Unit
    fun clearStencil(s: Int): Unit
    fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit
    fun compileShader(shader: WebGLShader): Unit
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: dynamic): Unit
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: dynamic): Unit
    fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit
    fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit
    fun createBuffer(): WebGLBuffer?
    fun createFramebuffer(): WebGLFramebuffer?
    fun createProgram(): WebGLProgram?
    fun createRenderbuffer(): WebGLRenderbuffer?
    fun createShader(type: Int): WebGLShader?
    fun createTexture(): WebGLTexture?
    fun cullFace(mode: Int): Unit
    fun deleteBuffer(buffer: WebGLBuffer?): Unit
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?): Unit
    fun deleteProgram(program: WebGLProgram?): Unit
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?): Unit
    fun deleteShader(shader: WebGLShader?): Unit
    fun deleteTexture(texture: WebGLTexture?): Unit
    fun depthFunc(func: Int): Unit
    fun depthMask(flag: Boolean): Unit
    fun depthRange(zNear: Float, zFar: Float): Unit
    fun detachShader(program: WebGLProgram, shader: WebGLShader): Unit
    fun disable(cap: Int): Unit
    fun disableVertexAttribArray(index: Int): Unit
    fun drawArrays(mode: Int, first: Int, count: Int): Unit
    fun drawElements(mode: Int, count: Int, type: Int, offset: Int): Unit
    fun enable(cap: Int): Unit
    fun enableVertexAttribArray(index: Int): Unit
    fun finish(): Unit
    fun flush(): Unit
    fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?): Unit
    fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int): Unit
    fun frontFace(mode: Int): Unit
    fun generateMipmap(target: Int): Unit
    fun getActiveAttrib(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getActiveUniform(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getAttachedShaders(program: WebGLProgram): Array<WebGLShader>?
    fun getAttribLocation(program: WebGLProgram, name: String): Int
    fun getBufferParameter(target: Int, pname: Int): Any?
    fun getParameter(pname: Int): Any?
    fun getError(): Int
    fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): Any?
    fun getProgramParameter(program: WebGLProgram, pname: Int): Any?
    fun getProgramInfoLog(program: WebGLProgram): String?
    fun getRenderbufferParameter(target: Int, pname: Int): Any?
    fun getShaderParameter(shader: WebGLShader, pname: Int): Any?
    fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?
    fun getShaderInfoLog(shader: WebGLShader): String?
    fun getShaderSource(shader: WebGLShader): String?
    fun getTexParameter(target: Int, pname: Int): Any?
    fun getUniform(program: WebGLProgram, location: WebGLUniformLocation): Any?
    fun getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation?
    fun getVertexAttrib(index: Int, pname: Int): Any?
    fun getVertexAttribOffset(index: Int, pname: Int): Int
    fun hint(target: Int, mode: Int): Unit
    fun isBuffer(buffer: WebGLBuffer?): Boolean
    fun isEnabled(cap: Int): Boolean
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean
    fun isProgram(program: WebGLProgram?): Boolean
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean
    fun isShader(shader: WebGLShader?): Boolean
    fun isTexture(texture: WebGLTexture?): Boolean
    fun lineWidth(width: Float): Unit
    fun linkProgram(program: WebGLProgram): Unit
    fun pixelStorei(pname: Int, param: Int): Unit
    fun polygonOffset(factor: Float, units: Float): Unit
    fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit
    fun sampleCoverage(value: Float, invert: Boolean): Unit
    fun scissor(x: Int, y: Int, width: Int, height: Int): Unit
    fun shaderSource(shader: WebGLShader, source: String): Unit
    fun stencilFunc(func: Int, ref: Int, mask: Int): Unit
    fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit
    fun stencilMask(mask: Int): Unit
    fun stencilMaskSeparate(face: Int, mask: Int): Unit
    fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit
    fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int): Unit
    fun texParameterf(target: Int, pname: Int, param: Float): Unit
    fun texParameteri(target: Int, pname: Int, param: Int): Unit
    fun uniform1f(location: WebGLUniformLocation?, x: Float): Unit
    fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float): Unit
    fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float): Unit
    fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float): Unit
    fun uniform1i(location: WebGLUniformLocation?, x: Int): Unit
    fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int): Unit
    fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int): Unit
    fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int): Unit
    fun uniform1fv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform2fv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform3fv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform4fv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform1iv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform2iv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform3iv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniform4iv(location: WebGLUniformLocation?, v: dynamic): Unit
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): Unit
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): Unit
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): Unit
    fun useProgram(program: WebGLProgram?): Unit
    fun validateProgram(program: WebGLProgram): Unit
    fun vertexAttrib1f(index: Int, x: Float): Unit
    fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit
    fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit
    fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit
    fun vertexAttrib1fv(index: Int, values: dynamic): Unit
    fun vertexAttrib2fv(index: Int, values: dynamic): Unit
    fun vertexAttrib3fv(index: Int, values: dynamic): Unit
    fun vertexAttrib4fv(index: Int, values: dynamic): Unit
    fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int): Unit
    fun viewport(x: Int, y: Int, width: Int, height: Int): Unit
}

/**
 * Exposes the JavaScript [WebGLQuery](https://developer.mozilla.org/en/docs/Web/API/WebGLQuery) to Kotlin
 */
public external abstract class WebGLQuery : WebGLObject {
}

/**
 * Exposes the JavaScript [WebGLSampler](https://developer.mozilla.org/en/docs/Web/API/WebGLSampler) to Kotlin
 */
public external abstract class WebGLSampler : WebGLObject {
}

/**
 * Exposes the JavaScript [WebGLSync](https://developer.mozilla.org/en/docs/Web/API/WebGLSync) to Kotlin
 */
public external abstract class WebGLSync : WebGLObject {
}

/**
 * Exposes the JavaScript [WebGLTransformFeedback](https://developer.mozilla.org/en/docs/Web/API/WebGLTransformFeedback) to Kotlin
 */
public external abstract class WebGLTransformFeedback : WebGLObject {
}

/**
 * Exposes the JavaScript [WebGLVertexArrayObject](https://developer.mozilla.org/en/docs/Web/API/WebGLVertexArrayObject) to Kotlin
 */
public external abstract class WebGLVertexArrayObject : WebGLObject {
}

/**
 * Exposes the JavaScript [WebGL2RenderingContext](https://developer.mozilla.org/en/docs/Web/API/WebGL2RenderingContext) to Kotlin
 */
public external abstract class WebGL2RenderingContext : WebGLRenderingContext, WebGL2RenderingContextBase {
    companion object {
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
        val DEPTH_STENCIL_ATTACHMENT: Int
        val DEPTH_STENCIL: Int
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
        val TIMEOUT_IGNORED: Double
        val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int
    }
}

