package com.rozetka.uicomponents.screens.genPass

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.koin.mp.KoinPlatform.getKoin

@Composable
fun GenPassScreen() {
    val settingsViewModel: GenPassViewModel = getKoin().get()
    Text("sdsdsdsdsd")
}