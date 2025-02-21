package com.rozetka.uicomponents.screens

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rozetka.uicomponents.screens.aboutScreen.AboutScreen
import com.rozetka.uicomponents.screens.genPass.GenPassScreen
import com.rozetka.uicomponents.screens.settings.SettingsScreen
import com.rozetka.uicomponents.screens.storage.StorageScreen
import com.rozetka.uicomponents.ui.theme.BottomNavigationBar
import com.rozetka.uicomponents.ui.theme.DefaultApplicationTheme



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RootScreen() {
    DefaultApplicationTheme {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                BottomNavigationBar(navController = navController)
            }
        ) {
            NavHost(
                navController = navController,
                startDestination = "storage_screen",

            ) {
                composable("storage_screen") { StorageScreen() }
                composable("generator_screen") { GenPassScreen() }
                composable("settings_screen") { SettingsScreen(navController) }
                composable("about_screen") { AboutScreen() }
            }
        }
    }
}
