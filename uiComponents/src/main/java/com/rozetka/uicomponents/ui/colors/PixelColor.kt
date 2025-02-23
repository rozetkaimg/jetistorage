package com.rozetka.uicomponents.ui.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class PixelColor {
    val oneColor = Color(0xFF565F71) //secondary
    var twoColor = Color(0xFF415F91) // primary
    var threeColor = Color(0xFFD6E3FF) //  primaryContainer

    private data class ThemeColors(
        val primary: Color, val onPrimary: Color,
        val primaryContainer: Color, val onPrimaryContainer: Color,
        val secondary: Color, val onSecondary: Color,
        val secondaryContainer: Color, val onSecondaryContainer: Color,
        val tertiary: Color, val onTertiary: Color,
        val tertiaryContainer: Color, val onTertiaryContainer: Color,
        val error: Color, val onError: Color,
        val errorContainer: Color, val onErrorContainer: Color,
        val background: Color, val onBackground: Color,
        val surface: Color, val onSurface: Color,
        val surfaceVariant: Color, val onSurfaceVariant: Color,
        val outline: Color, val outlineVariant: Color,
        val scrim: Color, val inverseSurface: Color,
        val inverseOnSurface: Color, val inversePrimary: Color,
        val surfaceDim: Color, val surfaceBright: Color,
        val surfaceContainerLowest: Color, val surfaceContainerLow: Color,
        val surfaceContainer: Color, val surfaceContainerHigh: Color,
        val surfaceContainerHighest: Color,
    )

    private val light = ThemeColors(
        primary = Color(0xFF415F91), onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFD6E3FF), onPrimaryContainer = Color(0xFF284777),
        secondary = Color(0xFF565F71), onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFDAE2F9), onSecondaryContainer = Color(0xFF3E4759),
        tertiary = Color(0xFF705575), onTertiary = Color(0xFFFFFFFF),
        tertiaryContainer = Color(0xFFFAD8FD), onTertiaryContainer = Color(0xFF573E5C),
        error = Color(0xFFBA1A1A), onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFFFDAD6), onErrorContainer = Color(0xFF93000A),
        background = Color(0xFFF9F9FF), onBackground = Color(0xFF191C20),
        surface = Color(0xFFF9F9FF), onSurface = Color(0xFF191C20),
        surfaceVariant = Color(0xFFE0E2EC), onSurfaceVariant = Color(0xFF44474E),
        outline = Color(0xFF74777F), outlineVariant = Color(0xFFC4C6D0),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFF2E3036),
        inverseOnSurface = Color(0xFFF0F0F7), inversePrimary = Color(0xFFAAC7FF),
        surfaceDim = Color(0xFFD9D9E0), surfaceBright = Color(0xFFF9F9FF),
        surfaceContainerLowest = Color(0xFFFFFFFF), surfaceContainerLow = Color(0xFFF3F3FA),
        surfaceContainer = Color(0xFFEDEDF4), surfaceContainerHigh = Color(0xFFE7E8EE),
        surfaceContainerHighest = Color(0xFFE2E2E9)
    )

    private val dark = ThemeColors(
        primary = Color(0xFFAAC7FF), onPrimary = Color(0xFF0A305F),
        primaryContainer = Color(0xFF284777), onPrimaryContainer = Color(0xFFD6E3FF),
        secondary = Color(0xFFBEC6DC), onSecondary = Color(0xFF283141),
        secondaryContainer = Color(0xFF3E4759), onSecondaryContainer = Color(0xFFDAE2F9),
        tertiary = Color(0xFFDDBCE0), onTertiary = Color(0xFF3F2844),
        tertiaryContainer = Color(0xFF573E5C), onTertiaryContainer = Color(0xFFFAD8FD),
        error = Color(0xFFFFB4AB), onError = Color(0xFF690005),
        errorContainer = Color(0xFF93000A), onErrorContainer = Color(0xFFFFDAD6),
        background = Color(0xFF111318), onBackground = Color(0xFFE2E2E9),
        surface = Color(0xFF111318), onSurface = Color(0xFFE2E2E9),
        surfaceVariant = Color(0xFF44474E), onSurfaceVariant = Color(0xFFC4C6D0),
        outline = Color(0xFF8E9099), outlineVariant = Color(0xFF44474E),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFFE2E2E9),
        inverseOnSurface = Color(0xFF2E3036), inversePrimary = Color(0xFF415F91),
        surfaceDim = Color(0xFF111318), surfaceBright = Color(0xFF37393E),
        surfaceContainerLowest = Color(0xFF0C0E13), surfaceContainerLow = Color(0xFF191C20),
        surfaceContainer = Color(0xFF1D2024), surfaceContainerHigh = Color(0xFF282A2F),
        surfaceContainerHighest = Color(0xFF33353A)
    )

    val lightScheme = lightColorScheme(
        primary = light.primary,
        onPrimary = light.onPrimary,
        primaryContainer = light.primaryContainer,
        onPrimaryContainer = light.onPrimaryContainer,
        secondary = light.secondary,
        onSecondary = light.onSecondary,
        secondaryContainer = light.secondaryContainer,
        onSecondaryContainer = light.onSecondaryContainer,
        tertiary = light.tertiary,
        onTertiary = light.onTertiary,
        tertiaryContainer = light.tertiaryContainer,
        onTertiaryContainer = light.onTertiaryContainer,
        error = light.error,
        onError = light.onError,
        errorContainer = light.errorContainer,
        onErrorContainer = light.onErrorContainer,
        background = light.background,
        onBackground = light.onBackground,
        surface = light.surface,
        onSurface = light.onSurface,
        surfaceVariant = light.surfaceVariant,
        onSurfaceVariant = light.onSurfaceVariant,
        outline = light.outline,
        outlineVariant = light.outlineVariant,
        scrim = light.scrim,
        inverseSurface = light.inverseSurface,
        inverseOnSurface = light.inverseOnSurface,
        inversePrimary = light.inversePrimary
    )

    val darkScheme = darkColorScheme(
        primary = dark.primary,
        onPrimary = dark.onPrimary,
        primaryContainer = dark.primaryContainer,
        onPrimaryContainer = dark.onPrimaryContainer,
        secondary = dark.secondary,
        onSecondary = dark.onSecondary,
        secondaryContainer = dark.secondaryContainer,
        onSecondaryContainer = dark.onSecondaryContainer,
        tertiary = dark.tertiary,
        onTertiary = dark.onTertiary,
        tertiaryContainer = dark.tertiaryContainer,
        onTertiaryContainer = dark.onTertiaryContainer,
        error = dark.error,
        onError = dark.onError,
        errorContainer = dark.errorContainer,
        onErrorContainer = dark.onErrorContainer,
        background = dark.background,
        onBackground = dark.onBackground,
        surface = dark.surface,
        onSurface = dark.onSurface
    )
}
