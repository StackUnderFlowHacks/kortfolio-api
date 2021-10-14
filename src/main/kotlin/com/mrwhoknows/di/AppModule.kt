package com.mrwhoknows.di

import com.mrwhoknows.config.AppConfig
import org.koin.dsl.module
import org.koin.dsl.single

val appModule = module {
    // Backend Config
    single<AppConfig>()
}
