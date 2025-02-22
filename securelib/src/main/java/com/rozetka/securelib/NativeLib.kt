package com.rozetka.securelib

class NativeLib {

    /**
     * A native method that is implemented by the 'securelib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun generatePassword(
        length: Int,
        useUppercase: Boolean,
        useLowercase: Boolean,
        useNumbers: Boolean,
        useSymbols: Boolean,
    ): String


    companion object {
        // Used to load the 'securelib' library on application startup.
        init {
            System.loadLibrary("securelib")
        }
    }
}