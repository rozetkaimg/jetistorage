package com.rozetka.uicomponents.screens.genPass

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.lifecycle.ViewModel
import com.rozetka.securelib.NativeLib

class GenPassViewModel : ViewModel() {


    fun generatePassword(
        lettersPass: Int,
        useCapital: Boolean,
        useSymbols: Boolean,
        useNumber: Boolean,
        useLowercase: Boolean,
    ): String =
        NativeLib().generatePassword(
            lettersPass,
            useCapital,
            useLowercase,
            useNumber,
            useSymbols
        )


    fun copyTextToClipboard(context: Context, text: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("", text)
        clipboard.setPrimaryClip(clip)
    }

}


