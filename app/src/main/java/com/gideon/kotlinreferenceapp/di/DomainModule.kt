package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.domain.usecases.GetPosts
import org.koin.dsl.module

val domainModule = module {

    single {
        GetPosts(postsRepository = get())
    }

}