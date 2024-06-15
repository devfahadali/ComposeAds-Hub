package com.example.composeadshub.screens

import android.app.Activity
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composeadshub.utlis.interstitialADS
import com.example.composeadshub.utlis.rewardedAdd

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 08/06/2024
 */


@Composable
fun HomeAdsScreen(navController: NavHostController, activity: Activity) {

    Column(
        verticalArrangement =Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(2))
    ) {

        Button(onClick = { interstitialADS(activity = activity) }) {

            Text(text = "Interstitial Ads")

        }
        Spacer(modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp))

        Button(onClick = { rewardedAdd(activity = activity) }) {

            Text(text = "Rewarded Ads")

        }
        Spacer(modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp))

        Button(onClick = {
            navController.navigate(Screens.BannerScreen.route)
        }) {

            Text(text = "Banner Ads ")
        }


//        AdsBannerLoad(type = AdSize.SEARCH, modifier =modifier )


    }


}