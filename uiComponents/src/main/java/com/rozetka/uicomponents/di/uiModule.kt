package com.rozetka.uicomponents.di


import com.rozetka.uicomponents.screens.genPass.GenPassViewModel
import com.rozetka.uicomponents.screens.settings.SettingsViewModel
import com.rozetka.uicomponents.screens.storage.StorageViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

var uiModule = module {

    viewModel {
          SettingsViewModel()
    }
    viewModel {
        GenPassViewModel()
    }
    viewModel {
        StorageViewModel()
    }

}
