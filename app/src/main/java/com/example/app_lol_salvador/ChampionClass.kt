package com.example.app_lol_salvador

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ChampionClass(
    val id: Int,
    @StringRes val name: Int,@StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
