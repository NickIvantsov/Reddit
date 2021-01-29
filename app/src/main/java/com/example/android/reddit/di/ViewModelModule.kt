package com.example.android.reddit.di

import com.example.android.reddit.repository.RepositoryImpl
import com.example.android.reddit.views.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {

    viewModel {
        MainViewModel(get<RepositoryImpl>())
    }

}