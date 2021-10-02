package com.mrwhoknows.plugin

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {
    install(Routing) {
        // default test route
        get("test") {
            call.respond(HttpStatusCode.OK, "API is working!")
        }
    }
}
