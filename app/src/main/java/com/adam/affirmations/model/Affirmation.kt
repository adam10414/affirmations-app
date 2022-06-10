package com.adam.affirmations.model

import android.content.res.Resources

data class Affirmation(val stringResourceId: Int) {
    override fun toString(): String {
        return Resources.getSystem().getString(stringResourceId)
    }
}