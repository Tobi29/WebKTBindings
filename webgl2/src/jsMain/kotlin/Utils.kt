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

import org.w3c.dom.HTMLCanvasElement

/**
 * Constructs an arguments object for [HTMLCanvasElement.getContext] for WebGL 2
 */
@Suppress("NOTHING_TO_INLINE")
inline fun WebGL2Options(
        alpha: Boolean? = null,
        depth: Boolean? = null,
        stencil: Boolean? = null,
        antialias: Boolean? = null,
        premultipliedAlpha: Boolean? = null,
        preserveDrawingBuffer: Boolean? = null,
        failIfMajorPerformanceCaveat: Boolean? = null
): Any {
    val options = object {}.asDynamic()

    alpha?.let { options.alpha = it }
    depth?.let { options.depth = it }
    stencil?.let { options.stencil = it }
    antialias?.let { options.antialias = it }
    premultipliedAlpha?.let { options.premultipliedAlpha = it }
    preserveDrawingBuffer?.let { options.preserveDrawingBuffer = it }
    failIfMajorPerformanceCaveat?.let { options.failIfMajorPerformanceCaveat = it }

    @Suppress("UnsafeCastFromDynamic")
    return options
}
