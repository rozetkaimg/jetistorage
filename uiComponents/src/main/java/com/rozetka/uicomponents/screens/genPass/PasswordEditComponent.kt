package com.rozetka.uicomponents.screens.genPass

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.rozetka.uicomponents.R

@Composable
fun PasswordEditComponent(
    state: Boolean,
    clearButtonOnClick: () -> Unit,
    copyButtonOnClick: () -> Unit,
) {

    val height by animateDpAsState(
        targetValue = if (state) 56.dp else 0.dp,
        animationSpec = tween(durationMillis = 400)
    )

    val alpha by animateFloatAsState(
        targetValue = if (state) 1f else 0f,
        animationSpec = tween(durationMillis = 300)
    )
    Row(
        modifier = Modifier
            .height(height)
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .alpha(alpha),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            {
                copyButtonOnClick()

            }, Modifier
                .weight(1f)
                .align(Alignment.Top)
        ) {
            Text(stringResource(R.string.copy))
        }
        Spacer(Modifier.size(16.dp))
        Button(
            {
                clearButtonOnClick()

            }, Modifier
                .weight(0.7f)
                .align(Alignment.Top)
        ) {
            Text(stringResource(R.string.clean))
        }
    }
}





