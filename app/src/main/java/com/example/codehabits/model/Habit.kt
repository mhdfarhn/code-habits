package com.example.codehabits.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Habit(
    val day: Int,
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
)
