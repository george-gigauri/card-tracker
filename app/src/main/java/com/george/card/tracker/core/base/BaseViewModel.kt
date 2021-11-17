package com.george.card.tracker.core.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel<T> : ViewModel() {

    protected val _state: MutableLiveData<T> = MutableLiveData()
    val state: LiveData<T> = _state
}