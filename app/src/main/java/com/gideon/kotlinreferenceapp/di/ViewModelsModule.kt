package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.ui.MainActivityViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel {
        MainActivityViewModel(get())
    }
}