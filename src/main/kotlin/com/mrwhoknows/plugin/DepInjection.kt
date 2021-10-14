package com.mrwhoknows.plugin

import io.ktor.application.*
import org.koin.core.module.Module
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger

fun Application.setupDI(koinModules: List<Module>) {
    install(Koin) {
        slf4jLogger()
        modules(koinModules)
    }
}
