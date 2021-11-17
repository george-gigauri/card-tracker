package com.george.card.tracker.ui.activity

import android.view.LayoutInflater
import com.george.card.tracker.core.base.BaseActivity
import com.george.card.tracker.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(inflater: LayoutInflater): ActivityMainBinding =
        ActivityMainBinding.inflate(inflater)

    override fun onReady() {

    }
}