package com.rozetka.uicomponents.screens.genPass

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rozetka.uicomponents.R
import com.rozetka.uicomponents.ext.getNavigationBarHeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenPassScreen() {
    var expanded by rememberSaveable { mutableStateOf(false) }
    var useSymbols by rememberSaveable { mutableStateOf(false) }
    var useLowercase by rememberSaveable { mutableStateOf(false) }
    var useCapital by rememberSaveable { mutableStateOf(true) }
    var useNumber by rememberSaveable { mutableStateOf(false) }
    var lettersPass by rememberSaveable { mutableIntStateOf(4) }
    var passwordState by rememberSaveable { mutableStateOf("") }
    val scrollState = rememberScrollState()
    val navBarHeightDp = getNavigationBarHeight().dp
    var viewModel = GenPassViewModel()
    val context = LocalContext.current

    Scaffold(Modifier.fillMaxSize(), topBar = {
        TopAppBar(title = {
            Row {
                Spacer(Modifier.size(6.dp))
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.shield_keyhole_minimalistic),
                    contentDescription = stringResource(R.string.storage),
                    Modifier.size(32.dp)
                )
                Spacer(Modifier.size(12.dp))
                Text(
                    stringResource(id = R.string.generator),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    modifier = Modifier.align(
                        Alignment.CenterVertically
                    )
                )
            }
        })
    }) { padding ->
        Column(
            Modifier
                .padding(top = padding.calculateTopPadding())
                .verticalScroll(scrollState)
        ) {
            PassViewComponent(passwordState)
            Spacer(Modifier.size(16.dp))
            PasswordEditComponent(passwordState.isNotEmpty(), { passwordState = "" }, {
                viewModel.copyTextToClipboard(context, passwordState)
            })
            LengthComponent(
                length = lettersPass,
                onToggleLength = { newLength ->
                    lettersPass = newLength
                })
            Spacer(Modifier.size(16.dp))
            PassSymbolComponent(
                useSymbols = useSymbols,
                useNumber = useNumber,
                useLowercase = useLowercase,
                useCapital = useCapital,
                onSymbolsChanged = { useSymbols = it },
                onNumberChanged = { useNumber = it },
                onLowercaseChanged = { useLowercase = it },
                onCapitalChanged = { useCapital = it }
            )
            Spacer(Modifier.size(16.dp))
            Button(
                {
                    expanded = !expanded
                    passwordState = viewModel.generatePassword(
                        lettersPass,
                        useCapital,
                        useSymbols,
                        useNumber,
                        useLowercase
                    )

                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                enabled = useSymbols || useLowercase || useCapital || useNumber
            ) {

                Text(
                    stringResource(R.string.generate_pass),
                    Modifier.padding(horizontal = 12.dp)
                )
            }
            Spacer(Modifier.size(86.dp + navBarHeightDp))
        }
    }
}

