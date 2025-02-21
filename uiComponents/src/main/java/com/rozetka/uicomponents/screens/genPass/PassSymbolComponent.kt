package com.rozetka.uicomponents.screens.genPass

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rozetka.uicomponents.R

@Composable
fun  PassSymbolComponent() {

    Card(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp), shape = RoundedCornerShape(20.dp)
    ) {

        Column(Modifier.height(324.dp)) {
            Spacer(Modifier.height(12.dp))
            Text(
                stringResource(R.string.use_symbols),
                Modifier.padding(horizontal = 12.dp, ),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            PassCharterConf("!@#$%^&*()")
            Text(
                stringResource(R.string.use_сapital_letters),
                Modifier.padding(horizontal = 12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            PassCharterConf("A-Z")
            Text(
                stringResource(R.string.use_lowercase_letters),
                Modifier.padding(horizontal = 12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            PassCharterConf("a-z")
            Text(
                stringResource(R.string.use_nember),
                Modifier.padding(horizontal = 12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            PassCharterConf("0-9")

        }

    }

}

@Composable
fun PassCharterConf(text: String){
    Box(Modifier.fillMaxWidth().padding(horizontal = 12.dp)) {
        Text(
            text,
            Modifier.align(Alignment.CenterStart),
            fontSize = 20.sp,
        )

        Switch(checked = false, onCheckedChange = {

        }, modifier = Modifier.align(Alignment.CenterEnd))
    }
}