package com.example.scrollableapps.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reminder(
    @StringRes val dayResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val reminderResourceId: Int
)
