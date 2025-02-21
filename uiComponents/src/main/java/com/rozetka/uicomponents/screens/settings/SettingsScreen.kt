package com.rozetka.uicomponents.screens.settings

import android.annotation.SuppressLint
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Android
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.rozetka.uicomponents.R
import com.rozetka.uicomponents.ext.BiometricAuthenticator
import com.rozetka.uicomponents.ext.Const.DarkThemeState
import com.rozetka.uicomponents.ext.Const.DynamicColorState
import com.rozetka.uicomponents.screens.settings.components.MonetItem
import com.rozetka.uicomponents.screens.settings.components.ThemeItem

@SuppressLint("NewApi", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavHostController) {
    var isAuthenticated by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }
    var loading by remember { mutableStateOf(false) }
    var showAuthButton by remember { mutableStateOf(true) }
    val systemUiController = rememberSystemUiController()
    var statusBarIconColor = getStatusBarIconState()
    val context = LocalContext.current
    val activity = context as? FragmentActivity ?: return

    val biometricAuthenticator = remember {

        BiometricAuthenticator(
            activity,
            onAuthSuccess = {
                isAuthenticated = true
                errorMessage = ""
                loading = false
                showAuthButton = false
            },
            onAuthFailure = {
                errorMessage = it
                loading = false
                showAuthButton = true
            }
        )

    }

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {


    }
    ) { paddingValues ->
        Column(Modifier
            .padding(top = paddingValues.calculateTopPadding())
            .fillMaxSize()) {
            Row(
                Modifier.padding(
                    top = 34.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
            ) {

                Box(Modifier.weight(1f)) {
                    ThemeItem({
                        DarkThemeState.value = 0
                        systemUiController.setSystemBarsColor(
                            color = Color.Transparent,
                            darkIcons = statusBarIconColor
                        )
                    }, stringResource(id = R.string.systemic), Icons.Rounded.Android, 0)
                }
                Spacer(modifier = Modifier.size(8.dp))
                Box(Modifier.weight(1f)) {
                    ThemeItem(
                        { DarkThemeState.value = 1
                            systemUiController.setSystemBarsColor(
                                color = Color.Transparent,
                                darkIcons = statusBarIconColor
                            )},
                        stringResource(id = R.string.light),
                        Icons.Rounded.LightMode,
                        1
                    )
                }
                Spacer(modifier = Modifier.size(8.dp))
                Box(Modifier.weight(1f)) {
                    ThemeItem(
                        { DarkThemeState.value = 2
                            systemUiController.setSystemBarsColor(
                                color = Color.Transparent,
                                darkIcons = statusBarIconColor
                            )},
                        stringResource(id = R.string.dark),
                        Icons.Rounded.DarkMode,
                        2
                    )
                }


            }


            Row(Modifier.fillMaxWidth()) {
                Box(Modifier.weight(1f)) { MonetItem(true, "dddd") {
                    DynamicColorState.value = true

                }
                }
                Spacer(Modifier.size(8.dp))
                Box(Modifier.weight(1f)) { MonetItem(false, "dddd", {DynamicColorState.value = false}) }
            }
        }

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (loading) {
            CircularProgressIndicator()
        } else {
            if (isAuthenticated) {
                Text("Authentication Successful!")
            } else if (errorMessage.isNotEmpty()) {
                Text("Authentication Failed: $errorMessage")
            }

            if (showAuthButton) {
                Button(
                    onClick = {
                        navController.navigate("about_screen")



                    },
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Text("Start Authentication")
                }
            }
        }
    }
}

@Composable
fun getStatusBarIconState(): Boolean {
    return when (DarkThemeState.value) {
        0 ->
            isSystemInDarkTheme()

        1 -> true

        2-> false
        else -> false
    }

}