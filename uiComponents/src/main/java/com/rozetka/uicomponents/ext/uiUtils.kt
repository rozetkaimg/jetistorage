package com.rozetka.uicomponents.ext


import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowInsetsCompat

@RequiresApi(Build.VERSION_CODES.R)
@Composable
fun getNavigationBarHeight(): Int {
    val context = LocalContext.current
    val view = LocalView.current
    val insets = view.rootWindowInsets

    return    insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
}