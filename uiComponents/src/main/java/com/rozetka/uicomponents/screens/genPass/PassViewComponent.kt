package com.rozetka.uicomponents.screens.genPass

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PassViewComponent(text: String) {

    Card(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(86.dp), shape = RoundedCornerShape(20.dp)
    ) {
        Text(
            text, Modifier.padding(16.dp),
            fontSize = 16.sp,
            maxLines = 2
        )

    }


}