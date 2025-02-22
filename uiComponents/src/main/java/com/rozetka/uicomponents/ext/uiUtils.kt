package com.rozetka.uicomponents.ext


import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsCompat


@Composable
fun getNavigationBarHeight(): Int {
    LocalContext.current
    val view = LocalView.current
    val insets = view.rootWindowInsets
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
        } else {
            30
        }
    } else {
        30
    }
}