package com.rozetka.uicomponents.screens.settings.components

import android.graphics.ColorFilter
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.rozetka.uicomponents.R
import com.rozetka.uicomponents.ext.Const.DynamicColorState

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun MonetItem(defaultState: Boolean, label: String, onClick: () -> Unit) {

    Row(
        Modifier
            .padding(
                16.dp, 0.dp
            )
            .fillMaxWidth()
    ) {
        Column(Modifier.weight(1f)) {
            Card(
                Modifier.height(90.dp).fillMaxWidth(),
                shape = RoundedCornerShape(24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            if (DynamicColorState.value == defaultState) {
                                MaterialTheme.colorScheme.primaryContainer
                            } else {
                                MaterialTheme.colorScheme.surfaceVariant
                            }

                        )
                        .clickable {
                            onClick()

                        }
                ) {
                    Card(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .height(50.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(100)
                    ) {
                        Box(Modifier.fillMaxSize()) {
                            Box(
                                Modifier
                                    .height(25.dp)
                                    .fillMaxWidth()
                                    .background(
                                        dynamicLightColorScheme(
                                            LocalContext.current
                                        ).secondary
                                    )
                            ) {

                            }
                            Box(
                                Modifier
                                    .size(25.dp)
                                    .background(
                                        dynamicDarkColorScheme(
                                            LocalContext.current
                                        ).primary
                                    )
                                    .align(Alignment.BottomStart)
                            ) {

                            }
                            Box(
                                Modifier
                                    .size(25.dp)
                                    .background(
                                        dynamicLightColorScheme(
                                            LocalContext.current
                                        ).primaryContainer
                                    )
                                    .align(Alignment.BottomEnd)
                            ) {

                            }
                        }

                    }
                    androidx.compose.animation.AnimatedVisibility(
                        visible = DynamicColorState.value == defaultState,
                        enter = scaleIn(),
                        exit = scaleOut(),
                        modifier = Modifier.align(Alignment.Center)
                    ) {

                        Surface(
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .clip(RoundedCornerShape(28.dp))
                                .height(50.dp)
                                .width(50.dp)
                                .align(Alignment.Center)
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.ic_done),
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onPrimary,
                                modifier = Modifier
                                    .size(24.dp)
                                    .padding(5.dp)
                            )

                        }
                    }
                }
            }
            Text(
                text = label,
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 4.dp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

