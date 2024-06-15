package com.example.composeadshub.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.composeadshub.utlis.BannerAdsID
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 15/06/2024
 */


@Composable
fun BannerScreen(modifier: Modifier){

    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.verticalScroll(state = ScrollState(2))){
        BannerItem(type = AdSize.BANNER, modifier =modifier )
        BannerItem(type = AdSize.LARGE_BANNER, modifier =modifier )
        BannerItem(type = AdSize.FULL_BANNER, modifier =modifier )
        BannerItem(type = AdSize.FLUID, modifier =modifier )
        BannerItem(type = AdSize.INVALID, modifier =modifier )
        BannerItem(type = AdSize.LEADERBOARD, modifier =modifier )
        BannerItem(type = AdSize.MEDIUM_RECTANGLE, modifier =modifier )
        BannerItem(type = AdSize.WIDE_SKYSCRAPER, modifier =modifier )
    }


}

@Composable
fun BannerItem(type:AdSize, modifier: Modifier){
    AndroidView(modifier=modifier,factory = {
        AdView(it).apply {
            setAdSize(type)
            adUnitId = BannerAdsID
            loadAd(AdRequest.Builder().build())
        }
    })
}