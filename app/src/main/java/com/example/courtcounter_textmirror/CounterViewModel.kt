package com.example.courtcounter_textmirror

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var count: Int by mutableIntStateOf(0);

    fun incrementScore(): Unit{
        count ++;
    }
}