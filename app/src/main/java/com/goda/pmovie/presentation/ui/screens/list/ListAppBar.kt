package com.goda.pmovie.presentation.ui.screens.list

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.goda.pmovie.presentation.ui.theme.topBarColor
import com.goda.pmovie.R
import com.goda.pmovie.presentation.ui.theme.colorPrimary
import com.goda.pmovie.presentation.ui.theme.colorPrimaryDark

@Composable
fun ListAppBar(

) {
    TopAppBar (
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        backgroundColor = colorPrimaryDark,
        contentColor = MaterialTheme.colors.onSurface
    )
}

@Composable
@Preview
private fun ListAppBarPreview () {
    ListAppBar()
}