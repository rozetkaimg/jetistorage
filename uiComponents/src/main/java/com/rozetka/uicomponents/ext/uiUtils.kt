package com.rozetka.uicomponents.ext


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsCompat

@RequiresApi(Build.VERSION_CODES.R)
@Composable
fun getNavigationBarHeight(): Int {
    LocalContext.current
    val view = LocalView.current
    val insets = view.rootWindowInsets

    return    insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
}