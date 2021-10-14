package com.mrwhoknows

import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.server.testing.handleRequest
import junit.framework.TestCase.assertEquals
import org.junit.Test

@OptIn(KtorExperimentalLocationsAPI::class)
class ApplicationTest {
    @Test
    fun isApiWorking() = withTestServer {
        handleRequest(HttpMethod.Get, "/test").apply {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("API is working!", response.content)
        }
    }
}
