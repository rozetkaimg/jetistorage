package com.rozetka.uicomponents.ext

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf

object ConstView {

    val DynamicColorState: MutableState<Boolean> = mutableStateOf(true)

    //Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
    val StatusBarIconColor: MutableState<Boolean> = mutableStateOf(false)
    val DarkThemeState: MutableState<Int> = mutableIntStateOf(0)

}