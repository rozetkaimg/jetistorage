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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.rozetka.core.SettingsData
import com.rozetka.uicomponents.ext.ConstView.DarkThemeState
import com.rozetka.uicomponents.ext.ConstView.DynamicColorState
import com.rozetka.uicomponents.ext.ConstView.StatusBarIconColor
import com.rozetka.uicomponents.ui.colors.PixelColor
import kotlinx.coroutines.Dispatchers


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)


private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFD81B60),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFF8BBD0),
    onPrimaryContainer = Color(0xFF1C1B1F),
    inversePrimary = Color(0xFFC2185B),
    secondary = Color(0xFFEC407A),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFF8BBD0),
    onSecondaryContainer = Color(0xFF1C1B1F),
    tertiary = Color(0xFFF06292),
    onTertiary = Color(0xFF1C1B1F),
    tertiaryContainer = Color(0xFFF1E0E6),
    onTertiaryContainer = Color(0xFF1C1B1F),
    background = Color(0xFFF9EBF7),
    onBackground = Color(0xFF1C1B1F),
    surface = Color(0xFFF9EBF7),
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFF8BBD0),
    onSurfaceVariant = Color(0xFF1C1B1F),
    surfaceTint = Color(0xFFD81B60),
    inverseSurface = Color(0xFFC2185B),
    inverseOnSurface = Color.White,
    error = Color(0xFFD32F2F),
    onError = Color.White,
    errorContainer = Color(0xFFF8D7DA),
    onErrorContainer = Color(0xFF1C1B1F),
    outline = Color(0xFF1C1B1F),
    outlineVariant = Color(0xFFD81B60),
    scrim = Color(0x55000000),
    surfaceBright = Color(0xFFF8BBD0),
    surfaceContainer = Color(0xFFF1E0E6),
    surfaceContainerHigh = Color(0xFFEC407A),
    surfaceContainerHighest = Color(0xFFF8BBD0),
    surfaceContainerLow = Color(0xFFF1E0E6),
    surfaceContainerLowest = Color(0xFFF8BBD0),
    surfaceDim = Color(0xFFF06292)
)

@Composable
fun DefaultApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    var context = LocalContext.current
    LaunchedEffect(Dispatchers.IO) {
        DynamicColorState.value = SettingsData(context).getMonetState(context)
        DarkThemeState.value = SettingsData(context).getThemeState(context)
    }

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
                        PixelColor().darkScheme
                    }
                }
            }
        }


        darkTheme -> PixelColor().darkScheme
        else -> PixelColor().lightScheme

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