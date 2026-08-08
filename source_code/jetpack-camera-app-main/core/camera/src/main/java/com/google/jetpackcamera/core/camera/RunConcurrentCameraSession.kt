package com.google.jetpackcamera.core.camera

import kotlinx.coroutines.CoroutineScope

// Minimal stub implementation — executes the provided block.
// If the original implementation coordinated multiple concurrent camera sessions,
// this stub will allow the project to compile; replace with the proper implementation
// if/when available.
suspend fun runConcurrentCameraSession(scope: CoroutineScope, block: suspend () -> Unit) {
    block()
}
