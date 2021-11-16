package com.george.card.tracker.ui.activity

import android.view.LayoutInflater
import com.george.card.tracker.base.BaseActivity
import com.george.card.tracker.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(inflater: LayoutInflater): ActivityMainBinding =
        ActivityMainBinding.inflate(inflater)

    override fun onReady() {

    }
}