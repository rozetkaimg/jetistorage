package com.rozetka.datastorage

import androidx.datastore.preferences.core.Preferences

interface SettingsStore {
    suspend fun saveThemeState(themeState: Int)
    suspend fun getThemeState(): Int
    suspend fun getMonetState(): Boolean
    suspend fun saveMonetState(monetState: Boolean)
    suspend fun saveDynamicColorState(dynamicColorState: Boolean)
    suspend fun getDynamicColorState(): Boolean
    suspend fun <T> containsKey(key: Preferences.Key<T>): Boolean
}