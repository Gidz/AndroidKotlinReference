package com.example.datemplate.di

import com.example.datemplate.data.repositories.MainRepository
import org.koin.dsl.module


var repositoryModule = module {
    factory {
        MainRepository(mainAPI = get())
    }
}