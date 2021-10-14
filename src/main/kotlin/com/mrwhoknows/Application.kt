package com.mrwhoknows

import com.mrwhoknows.config.AppConfig
import com.mrwhoknows.config.setupConfig
import com.mrwhoknows.di.appModule
import com.mrwhoknows.plugin.*
import io.ktor.application.*
import org.koin.core.module.Module
import org.koin.ktor.ext.inject

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

// application.conf references the main function. This annotation prevents the IDE from marking it as unused.
@Suppress("unused")
fun Application.main(testing: Boolean = false, koinModules: List<Module> = listOf(appModule)) {

    setupDI(koinModules)
    setupConfig()
    val appConfig by inject<AppConfig>()
    val isDebug = appConfig.serverConfig.isDebug

    configureLogging(isDebug)
    configureContentNegotiation(isDebug)
    configureAuthentication()
    configureRouting()
}
