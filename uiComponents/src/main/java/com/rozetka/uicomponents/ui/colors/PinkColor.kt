package com.rozetka.uicomponents.ui.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


class PinkColor {

    val oneColor = Color(0xFF74565F) //secondary
    var twoColor = Color(0xFF8C4A60) // primary
    var threeColor = Color(0xFFFFD9E2) //  primaryContainer

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
        primary = Color(0xFF8C4A60), onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFFFD9E2), onPrimaryContainer = Color(0xFF703349),
        secondary = Color(0xFF74565F), onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFFFD9E2), onSecondaryContainer = Color(0xFF5A3F47),
        tertiary = Color(0xFF7C5635), onTertiary = Color(0xFFFFFFFF),
        tertiaryContainer = Color(0xFFFFDCC2), onTertiaryContainer = Color(0xFF623F20),
        error = Color(0xFFBA1A1A), onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFFFDAD6), onErrorContainer = Color(0xFF93000A),
        background = Color(0xFFFFF8F8), onBackground = Color(0xFF22191C),
        surface = Color(0xFFFFF8F8), onSurface = Color(0xFF22191C),
        surfaceVariant = Color(0xFFF2DDE2), onSurfaceVariant = Color(0xFF514347),
        outline = Color(0xFF837377), outlineVariant = Color(0xFFD5C2C6),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFF372E30),
        inverseOnSurface = Color(0xFFFDEDEF), inversePrimary = Color(0xFFFFB0C8),
        surfaceDim = Color(0xFFE6D6D9), surfaceBright = Color(0xFFFFF8F8),
        surfaceContainerLowest = Color(0xFFFFFFFF), surfaceContainerLow = Color(0xFFFFF0F2),
        surfaceContainer = Color(0xFFFAEAED), surfaceContainerHigh = Color(0xFFF5E4E7),
        surfaceContainerHighest = Color(0xFFEFDFE1)
    )

    private val dark = ThemeColors(
        primary = Color(0xFFFFB0C8), onPrimary = Color(0xFF541D32),
        primaryContainer = Color(0xFF703349), onPrimaryContainer = Color(0xFFFFD9E2),
        secondary = Color(0xFFE3BDC6), onSecondary = Color(0xFF422931),
        secondaryContainer = Color(0xFF5A3F47), onSecondaryContainer = Color(0xFFFFD9E2),
        tertiary = Color(0xFFEFBD94), onTertiary = Color(0xFF48290C),
        tertiaryContainer = Color(0xFF623F20), onTertiaryContainer = Color(0xFFFFDCC2),
        error = Color(0xFFFFB4AB), onError = Color(0xFF690005),
        errorContainer = Color(0xFF93000A), onErrorContainer = Color(0xFFFFDAD6),
        background = Color(0xFF191113), onBackground = Color(0xFFEFDFE1),
        surface = Color(0xFF191113), onSurface = Color(0xFFEFDFE1),
        surfaceVariant = Color(0xFF514347), onSurfaceVariant = Color(0xFFD5C2C6),
        outline = Color(0xFF9E8C90), outlineVariant = Color(0xFF514347),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFFEFDFE1),
        inverseOnSurface = Color(0xFF372E30), inversePrimary = Color(0xFF8C4A60),
        surfaceDim = Color(0xFF191113), surfaceBright = Color(0xFF413739),
        surfaceContainerLowest = Color(0xFF140C0E), surfaceContainerLow = Color(0xFF22191C),
        surfaceContainer = Color(0xFF261D20), surfaceContainerHigh = Color(0xFF31282A),
        surfaceContainerHighest = Color(0xFF3C3235)
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
