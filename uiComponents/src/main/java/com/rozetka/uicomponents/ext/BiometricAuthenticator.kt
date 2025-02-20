package com.rozetka.uicomponents.ext

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

@RequiresApi(Build.VERSION_CODES.P)
class BiometricAuthenticator(
    activity: FragmentActivity,
    private val onAuthSuccess: () -> Unit,
    private val onAuthFailure: (String) -> Unit
) {

    private val executor = ContextCompat.getMainExecutor(activity)
    private val biometricPrompt = BiometricPrompt(
        activity, executor, object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                onAuthFailure("Error: $errString")
            }

            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                onAuthSuccess()
            }

            override fun onAuthenticationFailed() {
                onAuthFailure("Authentication failed")
            }
        })

    private val promptInfo = BiometricPrompt.PromptInfo.Builder()
        .setTitle("Use face unlock else fingerprint to authenticate")
        .setSubtitle("click to authenticate")
        .setNegativeButtonText("Cancel")
        .build()

    fun authenticate() {
        biometricPrompt.authenticate(promptInfo)
    }
}