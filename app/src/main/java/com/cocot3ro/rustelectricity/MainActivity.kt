package com.cocot3ro.rustelectricity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cocot3ro.rustelectricity.ui.navigation.NavigationWrapper
import com.cocot3ro.rustelectricity.ui.theme.RustElectricityTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navHostController = rememberNavController()

            RustElectricityTheme {
                NavigationWrapper(navHostController)
            }
        }
    }
}
