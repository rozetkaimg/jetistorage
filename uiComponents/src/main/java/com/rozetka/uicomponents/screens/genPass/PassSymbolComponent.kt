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
fun PassSymbolComponent(
    useSymbols: Boolean,
    useNumber: Boolean,
    useLowercase: Boolean,
    useCapital: Boolean,
    onSymbolsChanged: (Boolean) -> Unit,
    onNumberChanged: (Boolean) -> Unit,
    onLowercaseChanged: (Boolean) -> Unit,
    onCapitalChanged: (Boolean) -> Unit,
) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column {
            Spacer(Modifier.height(12.dp))

            // Use Symbols
            Text(
                stringResource(R.string.use_symbols),
                Modifier.padding(horizontal = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            PassCharterConf(
                text = "!@#$%^&*()",
                checked = useSymbols,
                onCheckedChange = onSymbolsChanged
            )

            // Use Capital Letters
            Text(
                stringResource(R.string.use_сapital_letters),
                Modifier.padding(horizontal = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            PassCharterConf(
                text = "A-Z",
                checked = useCapital,
                onCheckedChange = onCapitalChanged
            )

            // Use Lowercase Letters
            Text(
                stringResource(R.string.use_lowercase_letters),
                Modifier.padding(horizontal = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            PassCharterConf(
                text = "a-z",
                checked = useLowercase,
                onCheckedChange = onLowercaseChanged
            )

            // Use Numbers
            Text(
                stringResource(R.string.use_nember),
                Modifier.padding(horizontal = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            PassCharterConf(
                text = "0-9",
                checked = useNumber,
                onCheckedChange = onNumberChanged
            )
        }
    }
}

@Composable
fun PassCharterConf(text: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = text,
            Modifier.align(Alignment.CenterStart),
            fontSize = 20.sp
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange, // передаем функцию для изменения состояния
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}