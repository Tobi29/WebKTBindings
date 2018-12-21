# Kotlin API bindings
Bindings to various Platform APIs.

JavaScript type information was mostly taken from
[MDN](https://developer.mozilla.org) with occasional checks into the
specifications from W3C. Mistakes from MDN are likely to show here (if any).

# Artifacts
Compiled maven artifacts can be found on
[Bintray](https://bintray.com/gitout/scapes-engine/kt-bindings).

All platform artifacts follow a naming scheme:

| Platform      | Suffix      |
|:--------------|:------------|
| Common        | -metadata   |
| JVM           | -jvm        |
| JVM (LWJGL 3) | -jvm-lwjgl3 |
| Android       | -android    |
| JS            | -js         |

# Modules

## Binding Utils
Basic data types used by bindings.

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| binding-utils           |    ✓    |       ←       |    ←    |    ✓    |

## Gamepad
Provides access to the
[Gamepad API](https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API).

Also includes some very basic utilities for compatibility with webkit-prefixed
implementations.

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| gamepad                 |         |               |         |    ✓    |

## GL
Provides access to [OpenGL](https://www.khronos.org/opengl).

Mostly only the functionality found in the `gles` module is available.

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| gl                      |    →    |       ✓       |         |         |

## GLES
Provides access to [OpenGL ES](https://www.khronos.org/opengles) and
[WebGL](https://www.khronos.org/webgl)
([WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API)).

Only a common subset of OpenGL ES and WebGL 2 is available.

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| gles                    |    →    |       ✓       |    ✓    |    ✓    |

## GLFW
Provides access to [GLFW](https://www.glfw.org).

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| glfw                    |    →    |       ✓       |         |         |


## WebAudio
Provides access to the
[Web Audio API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API).

Incomplete as of yet, but most of the Web IDL of the specification is available.

| Component               |   JVM   | JVM (LWJGL3)  | Android |   JS    |
|:------------------------|:-------:|:-------------:|:-------:|:-------:|
| webaudio                |         |               |         |    ✓    |
