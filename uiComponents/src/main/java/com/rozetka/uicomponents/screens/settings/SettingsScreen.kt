package com.rozetka.uicomponents.screens.settings

import android.os.Build

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentActivity
import com.rozetka.uicomponents.ext.BiometricAuthenticator




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen() {
    var isAuthenticated by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }
    var loading by remember { mutableStateOf(false) }
    var showAuthButton by remember { mutableStateOf(true) }

    val context = LocalContext.current
    val activity = context as? FragmentActivity ?: return

    val biometricAuthenticator = remember {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
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
        } else {

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
                        loading = true
                        biometricAuthenticator.authenticate()
                    },
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Text("Start Authentication")
                }
            }
        }
    }
}