package mx.com.satoritech.crmsatori

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import mx.com.satoritech.crmsatori.utils.Screens

@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screens.SCREEN_LOGIN
    ) {
        composable(route = Screens.SCREEN_LOGIN) {
            login(navController = navController)
        }
    }
}