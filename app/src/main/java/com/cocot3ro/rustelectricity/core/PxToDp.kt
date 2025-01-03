package com.cocot3ro.rustelectricity.core

import android.content.Context
import android.util.DisplayMetrics
import androidx.compose.ui.unit.Dp

fun Context.pxToDp(px: Float): Dp {
    return Dp(px / ((resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)))
}