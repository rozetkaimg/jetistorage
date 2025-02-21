package com.rozetka.uicomponents.screens.genPass

import android.annotation.SuppressLint
import android.os.Build
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rozetka.uicomponents.R
import com.rozetka.uicomponents.ext.getNavigationBarHeight

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GenPassScreen() {

    val scrollState = rememberScrollState()
    val navBarHeightDp = with(LocalDensity.current) { if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        getNavigationBarHeight().toDp()
    } else {
        30.dp
    }
    }



    Scaffold(Modifier.fillMaxSize(), topBar = {
        TopAppBar(title = { Text(stringResource(id = R.string.generator)) })

    }) { padding ->
        Column(Modifier.padding(top = padding.calculateTopPadding()).verticalScroll(scrollState)) {
            PassViewComponent("ddddddddddddsadfewfk-394i5934uit2i-f2")
            Spacer(Modifier.size(18.dp))

            LengthComponent()
            Spacer(Modifier.size(18.dp))

            PassSymbolComponent()
            Spacer(Modifier.size(18.dp))
            Button( {

            }, modifier = Modifier.align(Alignment.CenterHorizontally)) {

                Text(
                    stringResource(R.string.generate_pass),
                    Modifier.padding(horizontal = 12.dp),
                    fontSize = 20.sp,

                )

            }

            Spacer(Modifier.size(86.dp + navBarHeightDp))

        }


    }


}

