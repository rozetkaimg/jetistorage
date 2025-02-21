package com.rozetka.uicomponents.screens.genPass

import androidx.lifecycle.ViewModel

class GenPassViewModel : ViewModel() {
    var useSymbols: Boolean = false
    var useNumber: Boolean = false
    var useLowercase: Boolean = false
    var useCapital: Boolean = false
    var lettersPass: Int = 0


}