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

package net.gitout.ktbindings.gles

expect abstract class GLES20
expect abstract class GLES30 : GLES20

typealias GLint64 = Long
typealias GLuint64 = ULong

typealias Float32List = FloatArray
typealias Int32List = IntArray
typealias Uint32List = UIntArray

expect class GLBuffer 

expect val emptyGLBuffer: GLBuffer

expect class GLFramebuffer 

expect val emptyGLFramebuffer: GLFramebuffer

expect class GLProgram 

expect val emptyGLProgram: GLProgram

expect class GLRenderbuffer 

expect val emptyGLRenderbuffer: GLRenderbuffer

expect class GLShader 

expect val emptyGLShader: GLShader

expect class GLTexture 

expect val emptyGLTexture: GLTexture

expect class GLQuery 

expect val emptyGLQuery: GLQuery

expect class GLSampler 

expect val emptyGLSampler: GLSampler

expect class GLSync 

expect val emptyGLSync: GLSync

expect class GLTransformFeedback 

expect val emptyGLTransformFeedback: GLTransformFeedback

expect class GLVertexArrayObject 

expect val emptyGLVertexArrayObject: GLVertexArrayObject

expect class GLUniformLocation

expect val emptyGLUniformLocation: GLUniformLocation

typealias DOMString = String

typealias sequence_DOMString = Array<String>
typealias sequence_GLboolean = BooleanArray
typealias sequence_GLfloat = FloatArray
typealias sequence_GLint = IntArray
typealias sequence_GLuint = UIntArray
typealias sequence_GLsizei = IntArray
typealias sequence_GLenum = IntArray
typealias sequence_GLShader = Array<GLShader>
typealias sequence_long = IntArray

typealias GLenum = Int
typealias GLboolean = Boolean
typealias GLbitfield = Int
typealias GLbyte = Byte
typealias GLshort = Short
typealias GLint = Int
typealias GLsizei = Int
typealias GLintptr = UInt
typealias GLsizeiptr = UInt
typealias GLubyte = UByte
typealias GLushort = UShort
typealias GLuint = UInt
typealias GLfloat = Float
typealias GLclampf = Float
