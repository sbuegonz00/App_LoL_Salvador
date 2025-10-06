package com.example.app_lol_salvador

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ChampionView : ViewModel() {
    private val _champions = MutableStateFlow(Champions.champions)
    val champions: StateFlow<List<ChampionClass>> = _champions
}