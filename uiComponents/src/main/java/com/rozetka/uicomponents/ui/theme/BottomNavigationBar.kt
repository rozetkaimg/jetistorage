package com.rozetka.uicomponents.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.rozetka.uicomponents.R

@Composable
fun BottomNavigationBar(navController: NavController) {

    var selectedItem by rememberSaveable { mutableStateOf("storage_screen") }
    NavigationBar {
        NavigationBarItem(
            selected = selectedItem == "storage_screen",
            onClick = {
                selectedItem = "storage_screen"
                navController.navigate("storage_screen") {
                    popUpTo("storage_screen") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Default.Home, contentDescription = stringResource(R.string.storage)) },
            label = { Text(stringResource(R.string.storage)) }
        )
        NavigationBarItem(
            selected = selectedItem == "generator_screen",
            onClick = {
                selectedItem = "generator_screen"
                navController.navigate("generator_screen") {
                    popUpTo("generator_screen") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Default.Person, contentDescription = stringResource(R.string.generator)) },
            label = { Text(stringResource(R.string.generator)) }
        )
        NavigationBarItem(
            selected = selectedItem == "settings_screen",
            onClick = {
                selectedItem = "settings_screen"
                navController.navigate("settings_screen") {
                    popUpTo("settings_screen") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Default.Settings, contentDescription = stringResource(R.string.settings)) },
            label = { Text(stringResource(R.string.settings)) }
        )
    }
}