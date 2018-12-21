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

package net.gitout.ktbindings.gl

expect abstract class GL11
expect abstract class GL12 : GL11
expect abstract class GL13 : GL12
expect abstract class GL14 : GL13
expect abstract class GL15 : GL14
expect abstract class GL20 : GL15
expect abstract class GL21 : GL20
expect abstract class GL30 : GL21
expect abstract class GL31 : GL30
expect abstract class GL32 : GL31
expect abstract class GL33 : GL32
expect abstract class GL40 : GL33
expect abstract class GL41 : GL40
expect abstract class GL42 : GL41
expect abstract class GL43 : GL42

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
