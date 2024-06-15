package com.example.composeadshub.screens

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 15/06/2024
 */

const val HomePath="HomeScreen"
const val BannerPath="BannerPath"

sealed class Screens(val route:String){
    object HomeAdsScreen: Screens(HomePath)
    object BannerScreen: Screens(BannerPath)
}

