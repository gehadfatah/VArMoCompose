package com.goda.pmovie.presentation.navigation.destinations

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.goda.pmovie.presentation.ui.screens.detail.DetailScreen
import com.goda.pmovie.presentation.ui.viewmodel.SharedViewModel
import com.goda.pmovie.common.utils.Constants
import com.goda.pmovie.common.utils.Constants.DETAIL_ARGUMENT_KEY
import com.goda.pmovie.common.utils.Constants.DETAIL_SCREEN


fun NavGraphBuilder.detailComposable(
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Constants.NaviAction) -> Unit
) {
    composable(
        route = DETAIL_SCREEN,
        arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {navBackStackEntry ->
        val detailId = navBackStackEntry.arguments?.getInt(DETAIL_ARGUMENT_KEY) ?: 0
        sharedViewModel.getSelectedItem(detailId)
        val selectedArticle by sharedViewModel.selectedArticle.collectAsState()

        DetailScreen(
            selectedArticle = selectedArticle,
            navigateToListScreen = navigateToListScreen
        )
    }


}