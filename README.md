# Kotlin API bindings
Bindings to various Platform APIs.

JavaScript type information was mostly taken from
[MDN](https://developer.mozilla.org) with occasional checks into the
specifications from W3C. Mistakes from MDN are likely to show here (if any).

# Artifacts
Compiled maven artifacts can be found on
[Bintray](https://bintray.com/gitout/scapes-engine/kt-bindings).

All platform artifacts follow a naming scheme:

| Platform              | Suffix                    |
|----------------------:|:--------------------------|
| Common                | -metadata                 |
| JVM                   | -jvm                      |
| JVM (LWJGL 3)         | -jvm-lwjgl3               |
| Android               | -android                  |
| JS                    | -js                       |
| Native Linux x64      | -nativelinuxx64           |
| Native Linux Arm32Hfp | -nativelinuxarm32hfp      |
| Native Linux Mips32   | -nativelinuxmips32        |
| Native Linux Mipsel32 | -nativelinuxmipsel32      |
| Native Android Arm32  | -nativeandroidnativearm32 |
| Native Android Arm64  | -nativeandroidnativearm64 |
| Native Wasm32         | -nativewasm32             |

# Modules

## Binding Utils
Basic data types used by bindings.

## AL
Provides access to [OpenAL](https://openal.org).

For web applications, consider using `webaudio`.

## Gamepad
Provides access to the
[Gamepad API](https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API).

Also includes some very basic utilities for compatibility with webkit-prefixed
implementations.

For non-web applications, consider using `glfw`.

## GL
Provides access to [OpenGL](https://www.khronos.org/opengl).

Mostly only the functionality found in the `gles` module is available.

## GLES
Provides access to [OpenGL ES](https://www.khronos.org/opengles) and
[WebGL](https://www.khronos.org/webgl)
([WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API)).

Only a common subset of OpenGL ES and WebGL 2 is available.

For better driver compatibility (especially on macOS), consider using
`gl` as well, when appropriate.

## GLFW
Provides access to [GLFW](https://www.glfw.org).

For web applications, consider using `gles` (which has some context utilities)
and `gamepad`.

## STB TrueType Font
Provides access to [STB TrueType Font](https://github.com/nothings/stb).

For web and Android applications, platform specific apis are usually sufficient.

## TinyFd
Provides access to
[Tiny File Dialogs](https://sourceforge.net/projects/tinyfiledialogs).

For web and Android applications, platform specific apis have to be used.

## WebAudio
Provides access to the
[Web Audio API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API).

Incomplete as of yet, but most of the Web IDL of the specification is available.

For non-web applications, consider using `al`.

# Platform Availability

Table showing what platforms each module is available for,
in case of more generic or specific alternatives being available arrows are
used.

More platforms and better coverage of existing ones should be possible in the
future, apart from nonsensical combinations.

| Platform              | binding-utils | al  | gamepad | gl  | gles  | glfw  |
|----------------------:|:-------------:|:---:|:-------:|:---:|:-----:|:-----:|
| Common                |       ✓       |  ✓  |    ✓    |  ✓  |   ✓   |   ✓   |
| JVM                   |       ✓       |  ↓  |         |  ↓  |   ↓   |   ↓   |
| JVM (LWJGL 3)         |       ↑       |  ✓  |         |  ✓  |   ✓   |   ✓   |
| Android               |       ↑       |  ✓  |         |     |   ✓   |       |
| JS                    |       ✓       |     |    ✓    |     |   ✓   |       |
| Native Linux x64      |       ✓       |  ✓  |         |  ✓  |       |   ✓   |
| Native Linux Arm32Hfp |       ✓       |  ✓  |         |     |       |       |
| Native Linux Mips32   |       ✓       |  ✓  |         |     |       |       |
| Native Linux Mipsel32 |       ✓       |  ✓  |         |     |       |       |
| Native Android Arm32  |       ✓       |     |         |     |       |       |
| Native Android Arm64  |       ✓       |     |         |     |       |       |
| Native Wasm32         |       ✓       |     |         |     |       |       |

| Platform              | stb-truetype-font | tinyfd  | webaudio  |
|----------------------:|:-----------------:|:-------:|:---------:|
| Common                |         ✓         |    ✓    |     ✓     |
| JVM                   |         ↓         |    ↓    |           |
| JVM (LWJGL 3)         |         ✓         |    ✓    |           |
| Android               |                   |         |           |
| JS                    |                   |         |     ✓     |
| Native Linux x64      |         ✓         |    ✓    |           |
| Native Linux Arm32Hfp |         ✓         |    ✓    |           |
| Native Linux Mips32   |         ✓         |         |           |
| Native Linux Mipsel32 |         ✓         |         |           |
| Native Android Arm32  |         ✓         |         |           |
| Native Android Arm64  |         ✓         |         |           |
| Native Wasm32         |         ✓         |         |           |
