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

package net.gitout.ktbindings.tinyfd

expect val tinyfd_version: String
expect val tinyfd_needs: String
expect val tinyfd_verbose: Boolean
expect val tinyfd_silent: Boolean
expect val tinyfd_forceConsole: Boolean

expect fun tinyfd_response(
): String

expect fun tinyfd_beep(
)

expect fun tinyfd_notifyPopup(
    title: String?, message: String?, iconType: String
): Int

expect fun tinyfd_messageBox(
    title: String?, message: String?, dialogType: String, iconType: String,
    defaultButton: Boolean
): Boolean

expect fun tinyfd_inputBox(
    title: String?, message: String?, defaultInput: String?
): String?

expect fun tinyfd_saveFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?
): String?

expect fun tinyfd_openFileDialog(
    title: String?, defaultPathAndFile: String?, filterPatterns: Array<String>?,
    singleFilterDescription: String?, allowMultipleSelects: Boolean
): String?

expect fun tinyfd_selectFolderDialog(
    title: String?, defaultPath: String
): String?

expect fun tinyfd_colorChooser(
    title: String?, defaultHexRGB: String?, defaultRGB: ByteArray?,
    resultRGB: ByteArray
): String?
