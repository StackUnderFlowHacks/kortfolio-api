package com.mrwhoknows

import com.mrwhoknows.config.AppConfig
import io.ktor.config.*
import io.ktor.locations.*
import io.ktor.server.testing.*
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.dsl.single

val appTestModule = module {
    single<AppConfig>()
}

fun MapApplicationConfig.createConfigForTesting() {
    put("ktor.server.isDebug", "false")
}

@KtorExperimentalLocationsAPI
fun withTestServer(koinModules: List<Module> = listOf(appTestModule), block: TestApplicationEngine.() -> Unit) {
    withTestApplication(
        {
            (environment.config as MapApplicationConfig).apply { createConfigForTesting() }
            main(true, koinModules)
        },
        block
    )
}
