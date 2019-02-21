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

package net.gitout.ktbindings.tinyfd

import org.lwjgl.system.MemoryStack
import org.lwjgl.util.tinyfd.TinyFileDialogs as JTinyFd

actual inline val tinyfd_version
    get() = JTinyFd.tinyfd_version
actual inline val tinyfd_needs
    get() = JTinyFd.tinyfd_needs
actual inline var tinyfd_verbose
    get() = JTinyFd.tinyfd_verbose[JTinyFd.tinyfd_verbose.position()] != 0
    set(value) {
        JTinyFd.tinyfd_verbose.put(
            JTinyFd.tinyfd_verbose.position(), if (value) 1 else 0
        )
    }
actual inline var tinyfd_silent
    get() = JTinyFd.tinyfd_silent[JTinyFd.tinyfd_silent.position()] != 0
    set(value) {
        JTinyFd.tinyfd_silent.put(
            JTinyFd.tinyfd_silent.position(), if (value) 1 else 0
        )
    }
actual inline var tinyfd_forceConsole
    get() = JTinyFd.tinyfd_forceConsole[JTinyFd.tinyfd_forceConsole.position()] != 0
    set(value) {
        JTinyFd.tinyfd_forceConsole.put(
            JTinyFd.tinyfd_forceConsole.position(), if (value) 1 else 0
        )
    }

actual inline fun tinyfd_response(
) = JTinyFd.tinyfd_response(
)

actual inline fun tinyfd_beep(
) = JTinyFd.tinyfd_beep(
)

actual inline fun tinyfd_notifyPopup(
    title: String?, message: String?, iconType: String
) = JTinyFd.tinyfd_notifyPopup(
    title, message, iconType
)

actual inline fun tinyfd_messageBox(
    title: String?, message: String?, dialogType: String, iconType: String,
    defaultButton: Boolean
) = JTinyFd.tinyfd_messageBox(
    title, message, dialogType, iconType, defaultButton
)

actual inline fun tinyfd_inputBox(
    title: String?, message: String?, defaultInput: String?
) = JTinyFd.tinyfd_inputBox(
    title, message, defaultInput
)

actual inline fun tinyfd_saveFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?
): String? {
    val stack = MemoryStack.stackPush()
    try {
        val pointers = if (filterPatterns == null) {
            null
        } else {
            val pointers = stack.mallocPointer(filterPatterns.size)
            for (i in filterPatterns.indices) {
                pointers.put(i, stack.UTF8(filterPatterns[i]))
            }
            pointers
        }
        return JTinyFd.tinyfd_saveFileDialog(
            title, defaultPathAndFile, pointers, singleFilterDescription
        )
    } finally {
        stack.pop()
    }
}

actual inline fun tinyfd_openFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?, allowMultipleSelects: Boolean
): String? {
    val stack = MemoryStack.stackPush()
    try {
        val pointers = if (filterPatterns == null) {
            null
        } else {
            val pointers = stack.mallocPointer(filterPatterns.size)
            for (i in filterPatterns.indices) {
                pointers.put(i, stack.UTF8(filterPatterns[i]))
            }
            pointers
        }
        return JTinyFd.tinyfd_openFileDialog(
            title, defaultPathAndFile, pointers, singleFilterDescription,
            allowMultipleSelects
        )
    } finally {
        stack.pop()
    }
}

actual inline fun tinyfd_selectFolderDialog(
    title: String?, defaultPath: String
) = JTinyFd.tinyfd_selectFolderDialog(
    title, defaultPath
)

actual inline fun tinyfd_colorChooser(
    title: String?, defaultHexRGB: String?, defaultRGB: ByteArray?,
    resultRGB: ByteArray
): String? {
    val stack = MemoryStack.stackPush()
    try {
        val bufferDefault = if (defaultRGB == null) {
            null
        } else {
            val buffer = stack.malloc(3)
            buffer.put(0, defaultRGB[0])
            buffer.put(1, defaultRGB[1])
            buffer.put(2, defaultRGB[2])
            buffer
        }
        val bufferResult = stack.malloc(3)
        val result = JTinyFd.tinyfd_colorChooser(
            title, defaultHexRGB, bufferDefault, bufferResult
        )
        resultRGB[0] = bufferResult.get(0)
        resultRGB[1] = bufferResult.get(1)
        resultRGB[2] = bufferResult.get(2)
        return result
    } finally {
        stack.pop()
    }
}
