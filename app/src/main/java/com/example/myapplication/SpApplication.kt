package com.example.myapplication

import android.app.Application
import com.rozetka.core.di.coreModule
import com.rozetka.datastorage.di.dataStorageModule
import com.rozetka.uicomponents.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class SpApplication: Application() {
    override fun onCreate() {
        super.onCreate()


        GlobalContext.startKoin {
            androidContext(this@SpApplication)
            modules(listOf(coreModule, uiModule, dataStorageModule))
        }
    }

}