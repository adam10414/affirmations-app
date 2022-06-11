package com.adam.affirmations.model

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
) {
    override fun toString(): String {
        return Resources.getSystem().getString(stringResourceId)
    }
}