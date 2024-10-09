package com.cocot3ro.rustelectricity

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltAndroidApp
class RustElectricityApplication : Application() {
    @Inject @ApplicationContext lateinit var context: Context
}