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

import kotlinx.cinterop.*

actual inline val tinyfd_version
    get() = binding.tinyfd.tinyfd_version.toKString()
actual inline val tinyfd_needs
    get() = binding.tinyfd.tinyfd_needs.toKString()
actual inline var tinyfd_verbose
    get() = binding.tinyfd.tinyfd_verbose != 0
    set(value) {
        binding.tinyfd.tinyfd_verbose = value.toByte().toInt()
    }
actual inline var tinyfd_silent
    get() = binding.tinyfd.tinyfd_silent != 0
    set(value) {
        binding.tinyfd.tinyfd_silent = value.toByte().toInt()
    }
actual inline var tinyfd_forceConsole
    get() = binding.tinyfd.tinyfd_forceConsole != 0
    set(value) {
        binding.tinyfd.tinyfd_forceConsole = value.toByte().toInt()
    }

actual inline fun tinyfd_response(
) = binding.tinyfd.tinyfd_response.toKString()

actual inline fun tinyfd_beep(
) = binding.tinyfd.tinyfd_beep(
)

actual inline fun tinyfd_notifyPopup(
    title: String?, message: String?, iconType: String
) = binding.tinyfd.tinyfd_notifyPopup(
    title, message, iconType
)

actual inline fun tinyfd_messageBox(
    title: String?, message: String?, dialogType: String, iconType: String,
    defaultButton: Boolean
) = binding.tinyfd.tinyfd_messageBox(
    title, message, dialogType, iconType, defaultButton.toByte().toInt()
) != 0

actual inline fun tinyfd_inputBox(
    title: String?, message: String?, defaultInput: String?
) = binding.tinyfd.tinyfd_inputBox(
    title, message, defaultInput
)?.toKString()

actual inline fun tinyfd_saveFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?
) = memScoped {
    binding.tinyfd.tinyfd_saveFileDialog(
        title, defaultPathAndFile, filterPatterns?.size ?: 0,
        filterPatterns?.toCStringArray(this), singleFilterDescription
    )?.toKString()
}

actual inline fun tinyfd_openFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?, allowMultipleSelects: Boolean
) = memScoped {
    binding.tinyfd.tinyfd_openFileDialog(
        title, defaultPathAndFile, filterPatterns?.size ?: 0,
        filterPatterns?.toCStringArray(this),
        singleFilterDescription, allowMultipleSelects.toByte().toInt()
    )?.toKString()
}

actual inline fun tinyfd_selectFolderDialog(
    title: String?, defaultPath: String
) = binding.tinyfd.tinyfd_selectFolderDialog(
    title, defaultPath
)?.toKString()

actual inline fun tinyfd_colorChooser(
    title: String?, defaultHexRGB: String?, defaultRGB: ByteArray?,
    resultRGB: ByteArray
) = memScoped {
    val bufferDefault = if (defaultRGB == null) {
        null
    } else {
        val buffer = allocArray<UByteVar>(3)
        buffer[0] = defaultRGB[0].toUByte()
        buffer[1] = defaultRGB[1].toUByte()
        buffer[2] = defaultRGB[2].toUByte()
        buffer
    }
    val bufferResult = allocArray<UByteVar>(3)
    val result = binding.tinyfd.tinyfd_colorChooser(
        title, defaultHexRGB, bufferDefault, bufferResult
    )?.toKString()
    resultRGB[0] = bufferResult[0].toByte()
    resultRGB[1] = bufferResult[1].toByte()
    resultRGB[2] = bufferResult[2].toByte()
    result
}
