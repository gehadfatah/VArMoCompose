package com.goda.pmovie.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary =colorPrimary,
    primaryVariant = colorPrimaryDark,
    secondary = Teal200,
    background = BackGround,
    surface = colorPrimary

)


@Composable
fun PopularMoviesTheme(
    content: @Composable () -> Unit
) {
    val colors = DarkColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}