package com.soywiz.korio.util

object OS {
	val rawName = PlatformInfo.rawOsName
	val rawNameLC = rawName.toLowerCase()

	val platformName = PlatformInfo.platformName
	val platformNameLC = platformName.toLowerCase()

	val isWindows = rawNameLC.contains("win")
	val isUnix = !isWindows
	val isPosix = !isWindows
	val isLinux = rawNameLC.contains("nix") || rawNameLC.contains("nux") || rawNameLC.contains("aix")
	val isMac = rawNameLC.contains("mac")

	val isJs = Platform.isJs
	val isNative = Platform.isNative
	val isJvm = Platform.isJvm

	val isJsShell = platformNameLC == "shell.js"
	val isJsNodeJs = platformNameLC == "node.js"
	val isJsBrowser = platformNameLC == "web.js"
	val isJsWorker = platformNameLC == "worker.js"
	val isJsBrowserOrWorker = isJsBrowser || isJsWorker
}
