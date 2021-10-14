package com.mrwhoknows.config

import io.ktor.application.*
import org.koin.ktor.ext.inject

class AppConfig {
    lateinit var serverConfig: ServerConfig
}

fun Application.setupConfig() {
    val appConfig by inject<AppConfig>()

    // Server
    val serverObject = environment.config.config("ktor.server")
    val isDebug = serverObject.property("isDebug").getString().toBoolean()
    appConfig.serverConfig = ServerConfig(isDebug)
}

data class ServerConfig(val isDebug: Boolean)
