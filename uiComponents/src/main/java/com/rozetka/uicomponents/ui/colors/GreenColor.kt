package com.rozetka.uicomponents.ui.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class GreenColor {
    val oneColor = Color(0xFF56624B) //secondary
    var twoColor = Color(0xFF48672F) // primary
    var threeColor = Color(0xFFC9EEA7)//  primaryContainer

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
        primary = Color(0xFF48672F), onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFC9EEA7), onPrimaryContainer = Color(0xFF314E19),
        secondary = Color(0xFF56624B), onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFDAE7C9), onSecondaryContainer = Color(0xFF3F4A34),
        tertiary = Color(0xFF386665), onTertiary = Color(0xFFFFFFFF),
        tertiaryContainer = Color(0xFFBBECEA), onTertiaryContainer = Color(0xFF1E4E4D),
        error = Color(0xFFBA1A1A), onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFFFDAD6), onErrorContainer = Color(0xFF93000A),
        background = Color(0xFFF9FAEF), onBackground = Color(0xFF1A1D16),
        surface = Color(0xFFF9FAEF), onSurface = Color(0xFF1A1D16),
        surfaceVariant = Color(0xFFE0E4D6), onSurfaceVariant = Color(0xFF44483E),
        outline = Color(0xFF74796D), outlineVariant = Color(0xFFC4C8BA),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFF2E312A),
        inverseOnSurface = Color(0xFFF0F2E7), inversePrimary = Color(0xFFADD18D),
        surfaceDim = Color(0xFFD9DBD0), surfaceBright = Color(0xFFF9FAEF),
        surfaceContainerLowest = Color(0xFFFFFFFF), surfaceContainerLow = Color(0xFFF3F5EA),
        surfaceContainer = Color(0xFFEDEFE4), surfaceContainerHigh = Color(0xFFE7E9DE),
        surfaceContainerHighest = Color(0xFFE2E3D9)
    )

    private val dark = ThemeColors(
        primary = Color(0xFFADD18D), onPrimary = Color(0xFF1B3704),
        primaryContainer = Color(0xFF314E19), onPrimaryContainer = Color(0xFFC9EEA7),
        secondary = Color(0xFFBECBAE), onSecondary = Color(0xFF29341F),
        secondaryContainer = Color(0xFF3F4A34), onSecondaryContainer = Color(0xFFDAE7C9),
        tertiary = Color(0xFFA0CFCD), onTertiary = Color(0xFF003736),
        tertiaryContainer = Color(0xFF1E4E4D), onTertiaryContainer = Color(0xFFBBECEA),
        error = Color(0xFFFFB4AB), onError = Color(0xFF690005),
        errorContainer = Color(0xFF93000A), onErrorContainer = Color(0xFFFFDAD6),
        background = Color(0xFF11140E), onBackground = Color(0xFFE2E3D9),
        surface = Color(0xFF11140E), onSurface = Color(0xFFE2E3D9),
        surfaceVariant = Color(0xFF44483E), onSurfaceVariant = Color(0xFFC4C8BA),
        outline = Color(0xFF8E9286), outlineVariant = Color(0xFF44483E),
        scrim = Color(0xFF000000), inverseSurface = Color(0xFFE2E3D9),
        inverseOnSurface = Color(0xFF2E312A), inversePrimary = Color(0xFF48672F),
        surfaceDim = Color(0xFF11140E), surfaceBright = Color(0xFF373A33),
        surfaceContainerLowest = Color(0xFF0C0F09), surfaceContainerLow = Color(0xFF1A1D16),
        surfaceContainer = Color(0xFF1E211A), surfaceContainerHigh = Color(0xFF282B24),
        surfaceContainerHighest = Color(0xFF33362F)
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
        inversePrimary = light.inversePrimary,
        surfaceDim = light.surfaceDim,
        surfaceBright = light.surfaceBright,
        surfaceContainerLowest = light.surfaceContainerLowest,
        surfaceContainerLow = light.surfaceContainerLow,
        surfaceContainer = light.surfaceContainer,
        surfaceContainerHigh = light.surfaceContainerHigh,
        surfaceContainerHighest = light.surfaceContainerHighest
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
        onSurface = dark.onSurface,
        surfaceVariant = dark.surfaceVariant,
        onSurfaceVariant = dark.onSurfaceVariant,
        outline = dark.outline,
        outlineVariant = dark.outlineVariant,
        scrim = dark.scrim,
        inverseSurface = dark.inverseSurface,
        inverseOnSurface = dark.inverseOnSurface,
        inversePrimary = dark.inversePrimary,
        surfaceDim = dark.surfaceDim,
        surfaceBright = dark.surfaceBright,
        surfaceContainerLowest = dark.surfaceContainerLowest,
        surfaceContainerLow = dark.surfaceContainerLow,
        surfaceContainer = dark.surfaceContainer,
        surfaceContainerHigh = dark.surfaceContainerHigh,
        surfaceContainerHighest = dark.surfaceContainerHighest
    )
}
