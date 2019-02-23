#define GLFW_INCLUDE_NONE
#include <GLFW/glfw3.h>
#undef GLFW_INCLUDE_NONE

#if defined __APPLE__

#define _GLFW_COCOA

#elif defined __unix__

#define _GLFW_X11

#elif defined _WIN32

#error TODO

#else
#error Unsupported platform
#endif

#include "glfw/src/context.c"
#include "glfw/src/init.c"
#include "glfw/src/input.c"
#include "glfw/src/monitor.c"
#include "glfw/src/vulkan.c"
#include "glfw/src/window.c"

#if defined _GLFW_COCOA
#include "glfw/src/cocoa_init.m"
#include "glfw/src/cocoa_joystick.m"
#include "glfw/src/cocoa_monitor.m"
#include "glfw/src/cocoa_window.m"
#include "glfw/src/cocoa_time.c"
#include "glfw/src/posix_thread.c"
#include "glfw/src/nsgl_context.m"
#include "glfw/src/egl_context.c"
#include "glfw/src/osmesa_context.c"
#endif

#if defined _GLFW_X11
#include "glfw/src/x11_init.c"
#include "glfw/src/x11_monitor.c"
#include "glfw/src/x11_window.c"
#include "glfw/src/xkb_unicode.c"
#include "glfw/src/posix_time.c"
#include "glfw/src/posix_thread.c"
#include "glfw/src/glx_context.c"
#include "glfw/src/egl_context.c"
#include "glfw/src/osmesa_context.c"
#endif

#if defined _GLFW_X11
#include "glfw/src/linux_joystick.c"
#endif
