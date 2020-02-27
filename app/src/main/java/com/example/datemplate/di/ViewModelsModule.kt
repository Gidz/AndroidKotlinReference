package com.example.datemplate.di

import com.example.datemplate.ui.MainActivityViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel {
        MainActivityViewModel(get())
    }
}