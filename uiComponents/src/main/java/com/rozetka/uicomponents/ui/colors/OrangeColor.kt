package com.rozetka.uicomponents.ui.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class OrangeColor {
    val oneColor = Color(0xFF77574E) //secondary
    var twoColor = Color(0xFF8F4C38) // primary
    var threeColor = Color(0xFFFFDBD1) //  primaryContainer

    private data class ThemeColors(
        val primary: Color, val onPrimary: Color,
        val primaryContainer: Color, val onPrimaryContainer: Color,
        val secondary: Color, val onSecondary: Color,
        val secondaryContainer: Color, val onSecondaryContainer: Color,
        val background: Color, val onBackground: Color,
        val surface: Color, val onSurface: Color,
        val surfaceVariant: Color, val onSurfaceVariant: Color,
        val outline: Color,
    )

    private val light = ThemeColors(
        primary = Color(0xFF8F4C38), onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFFFDBD1), onPrimaryContainer = Color(0xFF723523),
        secondary = Color(0xFF77574E), onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFFFDBD1), onSecondaryContainer = Color(0xFF5D4037),
        background = Color(0xFFFFF8F6), onBackground = Color(0xFF231917),
        surface = Color(0xFFFFF8F6), onSurface = Color(0xFF231917),
        surfaceVariant = Color(0xFFF5DED8), onSurfaceVariant = Color(0xFF53433F),
        outline = Color(0xFF85736E)
    )

    private val dark = ThemeColors(
        primary = Color(0xFFFFB5A0), onPrimary = Color(0xFF561F0F),
        primaryContainer = Color(0xFF723523), onPrimaryContainer = Color(0xFFFFDBD1),
        secondary = Color(0xFFE7BDB2), onSecondary = Color(0xFF442A22),
        secondaryContainer = Color(0xFF5D4037), onSecondaryContainer = Color(0xFFFFDBD1),
        background = Color(0xFF1A110F), onBackground = Color(0xFFF1DFDA),
        surface = Color(0xFF1A110F), onSurface = Color(0xFFF1DFDA),
        surfaceVariant = Color(0xFF53433F), onSurfaceVariant = Color(0xFFD8C2BC),
        outline = Color(0xFFA08C87)
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
        background = light.background,
        onBackground = light.onBackground,
        surface = light.surface,
        onSurface = light.onSurface,
        surfaceVariant = light.surfaceVariant,
        onSurfaceVariant = light.onSurfaceVariant,
        outline = light.outline
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
        background = dark.background,
        onBackground = dark.onBackground,
        surface = dark.surface,
        onSurface = dark.onSurface,
        surfaceVariant = dark.surfaceVariant,
        onSurfaceVariant = dark.onSurfaceVariant,
        outline = dark.outline
    )
}
