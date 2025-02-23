package com.rozetka.uicomponents.screens.settings


import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rozetka.core.SettingsData
import kotlinx.coroutines.launch


class SettingsViewModel() : ViewModel() {
    lateinit var setData: SettingsData

    fun setDataInit(context: Context) {
        setData = SettingsData(context)


    }

    fun setMonetState(monetState: Boolean, context: Context) {
        viewModelScope.launch {
            setData.saveMonetState(monetState, context)
        }
    }

    fun setThemeState(themeState: Int, context: Context) {
        viewModelScope.launch {
            setData.saveThemeState(themeState, context)
        }
    }
}



