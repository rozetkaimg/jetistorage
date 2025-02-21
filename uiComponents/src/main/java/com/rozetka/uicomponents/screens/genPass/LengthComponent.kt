package com.rozetka.uicomponents.screens.genPass

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rozetka.uicomponents.R


@Composable
fun LengthComponent() {

    Card(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp), shape = RoundedCornerShape(20.dp)
    ) {
        var sliderPosition by remember { mutableFloatStateOf(0f) }
        Column(Modifier.height(148.dp)) {

            Text(
                "${stringResource(R.string.length)}:  ${sliderPosition.toInt()}",
                Modifier.padding(12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            Slider(
                value = sliderPosition,
                onValueChange = { sliderPosition = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                valueRange = 4f..100f,


                )
            Box(Modifier.padding(horizontal = 12.dp).fillMaxWidth()) {
                Text(text = "4", modifier = Modifier.align (Alignment.CenterStart))
                Text("100", Modifier.align(Alignment.CenterEnd))
            }
        }

    }


}


@Preview(showBackground = false)
@Composable
fun LengthComponentPreview() {
    LengthComponent()
}

