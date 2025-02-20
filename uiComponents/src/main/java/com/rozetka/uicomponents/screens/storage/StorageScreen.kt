package com.rozetka.uicomponents.screens.storage

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.koin.mp.KoinPlatform.getKoin

@Composable
fun StorageScreen() {
    val storageViewModel: StorageViewModel = getKoin().get()
    Text("sdsdsdsdsdsdadasdassda")
}