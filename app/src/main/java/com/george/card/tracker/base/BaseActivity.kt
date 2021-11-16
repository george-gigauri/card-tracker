package com.george.card.tracker.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private var _binding: VB? = null
    val binding: VB get() = _binding!!

    abstract fun getViewBinding(inflater: LayoutInflater): VB

    abstract fun onReady()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding(layoutInflater)
        setContentView(binding.root)
        onReady()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}