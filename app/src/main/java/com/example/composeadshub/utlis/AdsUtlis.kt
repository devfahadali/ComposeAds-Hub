package com.example.composeadshub.utlis

import android.app.Activity
import android.widget.Toast
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 15/06/2024
 */



fun  interstitialADS(activity: Activity){

    InterstitialAd.load(activity,InterstitialAdsID,
        AdRequest.Builder().build(),object : InterstitialAdLoadCallback(){
        override fun onAdLoaded(interstailAd: InterstitialAd) {
            super.onAdLoaded(interstailAd)

            interstailAd.show(activity)
        }
    })
}

fun rewardedAdd(activity: Activity){
    val adRequest = AdRequest.Builder().build()

    RewardedAd.load(activity,RewardedAdsID,adRequest,object : RewardedAdLoadCallback() {
        override fun onAdFailedToLoad(adError: LoadAdError) {
//            rewardedAd = null
        }

        override fun onAdLoaded(rewardedAd: RewardedAd) {

            rewardedAd.fullScreenContentCallback = object : FullScreenContentCallback(){

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                    rewardedAdd(activity)

                    onAdDismissedFullScreenContent()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                }
            }

            rewardedAd.show(activity, object : OnUserEarnedRewardListener {
                override fun onUserEarnedReward(p0: RewardItem) {

                    Toast.makeText(activity, "Rewarded Done ", Toast.LENGTH_SHORT).show()
                }

            })
        }
    })
}
