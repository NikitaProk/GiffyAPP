package com.example.giffyapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.giffyapp.screens.FullGiffScreen
import com.example.giffyapp.screens.MainScreen
import com.example.giffyapp.utils.Constants

sealed class Screens(val route: String){
    object Main: Screens(route = Constants.Screens.MAIN_SCREEN)
    object FullGiff: Screens(route = Constants.Screens.FULL_GIFF_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Main.route
    ) {

        composable(route = Screens.Main.route){
            MainScreen()
        }

        composable(route = Screens.FullGiff.route){
            FullGiffScreen()
        }
    }

}