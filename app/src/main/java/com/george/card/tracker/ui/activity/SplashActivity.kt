package com.george.card.tracker.ui.activity

import android.view.LayoutInflater
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.george.card.tracker.core.base.BaseActivity
import com.george.card.tracker.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun getViewBinding(inflater: LayoutInflater): ActivitySplashBinding =
        ActivitySplashBinding.inflate(inflater)

    override fun onReady() {
        installSplashScreen()
    }
}