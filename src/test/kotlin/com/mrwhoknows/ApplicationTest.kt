package com.mrwhoknows

import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ApplicationTest {
    @Test
    fun isApiWorking() {
        withTestApplication({ main() }) {
            handleRequest(HttpMethod.Get, "/test").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("API is working!", response.content)
            }
        }
    }
}
