package com.mrwhoknows.plugin

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.serialization.*
import kotlinx.serialization.json.Json

fun Application.configureContentNegotiation(isDebug: Boolean = false) {

    install(ContentNegotiation) {
        json(
            json = Json {
                prettyPrint = isDebug
            },
            contentType = ContentType.Application.Json
        )
    }
}
