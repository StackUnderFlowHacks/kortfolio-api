package com.mrwhoknows.plugin

import io.ktor.application.*
import io.ktor.auth.*

fun Application.configureAuthentication() {
    install(Authentication) {
    }
}
