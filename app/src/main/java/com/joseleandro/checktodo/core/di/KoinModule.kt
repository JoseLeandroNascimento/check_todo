package com.joseleandro.checktodo.core.di

import com.joseleandro.checktodo.ui.viewModel.NavigationViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {

    viewModelOf(::NavigationViewModel)
}