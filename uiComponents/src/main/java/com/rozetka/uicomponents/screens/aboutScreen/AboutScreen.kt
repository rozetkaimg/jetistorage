package com.rozetka.uicomponents.screens.aboutScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AboutScreen() {


    Card(Modifier.fillMaxSize())  {








    }
}


@Composable
fun PieChart(
    parts: List<Float>,
    colors: List<androidx.compose.ui.graphics.Color>,
) {
    parts.sum()


}

@Preview
@Composable
fun PieChartPreview() {
    PieChart(
        parts = listOf(0.3f, 0.4f, 0.3f),
        colors = listOf(
            androidx.compose.ui.graphics.Color.Green,
            androidx.compose.ui.graphics.Color.LightGray,
            androidx.compose.ui.graphics.Color.Blue
        )
    )
}