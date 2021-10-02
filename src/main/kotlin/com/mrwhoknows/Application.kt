package com.mrwhoknows

import com.mrwhoknows.plugin.configureRouting
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

// application.conf references the main function. This annotation prevents the IDE from marking it as unused.
@Suppress("unused")
fun Application.main() {
    configureRouting()
}
