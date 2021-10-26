package com.example.livedataexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
val messageForActivity:MutableLiveData<String> by lazy { MutableLiveData<String>() }

val messageForMainFragment:MutableLiveData<String> by lazy { MutableLiveData<String>() }

    val messageForFragment2:MutableLiveData<String> by lazy { MutableLiveData<String>() }

}