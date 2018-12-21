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

expect fun contextGL11(): GL11
expect fun contextGL12(): GL12
expect fun contextGL13(): GL13
expect fun contextGL14(): GL14
expect fun contextGL15(): GL15
expect fun contextGL20(): GL20
expect fun contextGL21(): GL21
expect fun contextGL30(): GL30
expect fun contextGL31(): GL31
expect fun contextGL32(): GL32
expect fun contextGL33(): GL33
expect fun contextGL40(): GL40
expect fun contextGL41(): GL41
expect fun contextGL42(): GL42
expect fun contextGL43(): GL43

expect fun GL11.makeCurrent()
expect fun GL11.delete()