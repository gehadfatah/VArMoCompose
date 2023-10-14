package com.goda.pmovie.presentation.ui.screens.detail

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.utils.Constants

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun DetailScreen(
    selectedArticle: Article,
    navigateToListScreen: (Constants.NaviAction) -> Unit
) {
    Scaffold (
        topBar = {
            DetailAppBar(
                navigateToListScreen = navigateToListScreen,
                article = selectedArticle
            )
        },
        content = {
            DetailContent(
                article = selectedArticle
            )
        }
    )
}