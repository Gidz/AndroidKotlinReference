package com.example.datemplate.di

import com.example.datemplate.domain.GetPosts
import org.koin.dsl.module

val domainModule = module {

    single {
        GetPosts(postsRepository = get())
    }

}