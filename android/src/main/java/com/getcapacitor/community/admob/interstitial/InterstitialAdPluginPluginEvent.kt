package com.getcapacitor.ecc521.community.admob.interstitial

import com.getcapacitor.ecc521.community.admob.models.LoadPluginEventNames

object InterstitialAdPluginPluginEvent: LoadPluginEventNames {
    const val Loaded = "interstitialAdLoaded"
    const val FailedToLoad = "interstitialAdFailedToLoad"
    override val Showed = "interstitialAdShowed"
    override val FailedToShow = "interstitialAdFailedToShow"
    override val Dismissed = "interstitialAdDismissed"
}