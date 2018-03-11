# Kotlin Web API bindings
Bindings to various Web APIs, which are not (yet) in the standard library.

Type information was mostly taken from [MDN](https://developer.mozilla.org)
with occasional checks into the specifications from W3C. Mistakes from
MDN are likely to show here (if any).

# Modules

## Gamepad
Provides access to the
[Gamepad API](https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API).

Also includes some very basic utilities for compatibility with webkit-prefixed
implementations.

## WebAudio
Provides access to the
[Web Audio API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API).

Incomplete as of yet, but most of the Web IDL of the specification is available.

## WebGL2
Provides access to the
[WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API),
in particular WebGL 2 methods and constants.

Result of converting the
[Definitely Typed Headers](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/webgl2)
to Kotlin and subsequent cleanups to better align with the existing support
in the standard library.

Some parameter types may be wrong or not as specific as possible
(e.g. `Number` instead of `Int`).
