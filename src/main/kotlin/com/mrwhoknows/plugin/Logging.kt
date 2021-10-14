package com.mrwhoknows.plugin

import ch.qos.logback.classic.Logger
import io.ktor.application.*
import io.ktor.features.*
import org.slf4j.LoggerFactory
import org.slf4j.event.Level

fun Application.configureLogging(isDebug: Boolean) {

    // Logging for debug
    if (isDebug) {
        val root = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME) as Logger
        root.level = ch.qos.logback.classic.Level.TRACE
    }

    install(CallLogging) {
        level = Level.INFO
    }
}
