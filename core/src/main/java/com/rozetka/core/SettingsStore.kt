package com.rozetka.core

import android.content.Context

interface SettingsStoreInt {
    suspend fun saveThemeState(themeState: Int, context: Context)
    suspend fun getThemeState(context: Context): Int
    suspend fun getMonetState(context: Context): Boolean
    suspend fun saveMonetState(monetState: Boolean, context: Context)
    suspend fun saveDynamicColorState(dynamicColorState: Boolean)
}