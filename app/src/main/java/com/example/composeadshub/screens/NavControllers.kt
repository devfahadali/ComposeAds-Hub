package com.example.composeadshub.screens

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 15/06/2024
 */

@Composable
fun SetupNavGraph(navController: NavHostController,activity: Activity){

    NavHost(navController = navController, startDestination = Screens.HomeAdsScreen.route){

        composable(route= Screens.HomeAdsScreen.route){
            HomeAdsScreen(navController,activity)
        }
        composable(route= Screens.BannerScreen.route){
            BannerScreen(modifier =  Modifier.padding(10.dp))
        }
    }
}