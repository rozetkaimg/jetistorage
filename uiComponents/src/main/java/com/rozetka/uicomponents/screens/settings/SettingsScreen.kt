package com.rozetka.uicomponents.screens.settings

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.rozetka.uicomponents.R
import com.rozetka.uicomponents.ext.ConstView.DarkThemeState
import com.rozetka.uicomponents.ext.ConstView.DynamicColorState
import com.rozetka.uicomponents.screens.settings.components.MonetItem
import com.rozetka.uicomponents.screens.settings.components.ThemeComponent

@SuppressLint("NewApi", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavHostController) {

    LocalContext.current


    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        TopAppBar(title = {
            Row {
                Spacer(Modifier.size(6.dp))
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.settings_minimalistic),
                    contentDescription = stringResource(R.string.storage),
                    Modifier.size(32.dp)
                )
                Spacer(Modifier.size(12.dp))
                Text(
                    stringResource(id = R.string.settings),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    modifier = Modifier.align(
                        Alignment.CenterVertically
                    )
                )
            }
        })

    }
    ) { paddingValues ->
        Column(Modifier
            .padding(top = paddingValues.calculateTopPadding())
            .fillMaxSize()) {
            Text(
                stringResource(id = R.string.theme),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 16.dp, bottom = 12.dp, top = 16.dp)
            )
            ThemeComponent()
            Text(
                stringResource(id = R.string.colors),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 16.dp, bottom = 12.dp, top = 16.dp)
            )

            Row(Modifier.fillMaxWidth()) {
                Box(Modifier.weight(1f)) {
                    MonetItem(
                        true,
                        stringResource(R.string.monet),
                        { DynamicColorState.value = true },
                        dynamicLightColorScheme(LocalContext.current).secondary,
                        dynamicDarkColorScheme(LocalContext.current).primary,
                        dynamicLightColorScheme(LocalContext.current).primaryContainer
                    )
                }
                Spacer(Modifier.size(8.dp))
                Box(Modifier.weight(1f)) {
                    MonetItem(
                        false,
                        stringResource(R.string.static_),
                        { DynamicColorState.value = false },
                        lightColorScheme().secondary,
                        darkColorScheme().primary,
                        lightColorScheme().primaryContainer
                    )
                }
            }
        }

    }


}

@Composable
fun getStatusBarIconState(): Boolean {
    return when (DarkThemeState.value) {
        0 ->
            isSystemInDarkTheme()

        1 -> true
        else -> false
    }

}