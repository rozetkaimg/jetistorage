package com.rozetka.uicomponents.ui.theme

import android.os.Build
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.rozetka.uicomponents.ext.ConstView.DarkThemeState
import com.rozetka.uicomponents.ext.ConstView.DynamicColorState
import com.rozetka.uicomponents.ext.ConstView.StatusBarIconColor


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun DefaultApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {


    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            LocalContext.current
            when (DarkThemeState.value) {
                0 -> if (isSystemInDarkTheme()) {
                    if (DynamicColorState.value) {
                        StatusBarIconColor.value = false
                        dynamicDarkColorScheme(LocalContext.current)
                    } else {
                        StatusBarIconColor.value = false
                        DarkColorScheme
                    }
                } else {
                    if (DynamicColorState.value) {
                        StatusBarIconColor.value = true
                        dynamicLightColorScheme(LocalContext.current)
                    } else {
                        StatusBarIconColor.value = true
                        LightColorScheme
                    }
                }
                1 -> {
                    if (DynamicColorState.value) {
                        StatusBarIconColor.value = true
                        dynamicLightColorScheme(LocalContext.current)
                    } else {
                        StatusBarIconColor.value = true
                        LightColorScheme
                    }
                }

                else -> {
                    if (DynamicColorState.value) {
                        StatusBarIconColor.value = true
                        dynamicDarkColorScheme(LocalContext.current)
                    } else {
                        StatusBarIconColor.value = false
                        DarkColorScheme
                    }
                }
            }
        }


        darkTheme -> DarkColorScheme
        else -> LightColorScheme

    }

    SideEffect {

    }

    MaterialTheme(
        colorScheme = colorScheme.switch(),
        typography = Typography,
        content = content
    )
}

@Composable
fun animateColor(targetValue: Color) =
    animateColorAsState(
        targetValue = targetValue,
        animationSpec = tween(durationMillis = 700)
    ).value

@Composable
fun ColorScheme.switch() = copy(
    primary = animateColor(primary),
    onPrimary = animateColor(onPrimary),
    primaryContainer = animateColor(primaryContainer),
    onPrimaryContainer = animateColor(onPrimaryContainer),
    inversePrimary = animateColor(inversePrimary),
    secondary = animateColor(secondary),
    onSecondary = animateColor(onSecondary),
    secondaryContainer = animateColor(secondaryContainer),
    onSecondaryContainer = animateColor(onSecondaryContainer),
    tertiary = animateColor(tertiary),
    onTertiary = animateColor(onTertiary),
    tertiaryContainer = animateColor(tertiaryContainer),
    onTertiaryContainer = animateColor(onTertiaryContainer),
    background = animateColor(background),
    onBackground = animateColor(onBackground),
    surface = animateColor(surface),
    onSurface = animateColor(onSurface),
    surfaceVariant = animateColor(surfaceVariant),
    onSurfaceVariant = animateColor(onSurfaceVariant),
    surfaceTint = animateColor(surfaceTint),
    inverseSurface = animateColor(inverseSurface),
    inverseOnSurface = animateColor(inverseOnSurface),
    error = animateColor(error),
    onError = animateColor(onError),
    errorContainer = animateColor(errorContainer),
    onErrorContainer = animateColor(onErrorContainer),
    outline = animateColor(outline),
    outlineVariant = animateColor(outlineVariant),
    scrim = animateColor(scrim)
)