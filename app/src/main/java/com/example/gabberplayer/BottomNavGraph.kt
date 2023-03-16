package com.example.gabberplayer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gabberplayer.screens.HomeScreen
import com.example.gabberplayer.screens.PlayerScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavScreen.Home.route){
        composable(route = BottomNavScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomNavScreen.Player.route){
             PlayerScreen()
        }
    }
}
