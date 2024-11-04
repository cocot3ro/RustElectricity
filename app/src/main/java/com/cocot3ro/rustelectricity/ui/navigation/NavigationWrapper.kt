package com.cocot3ro.rustelectricity.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.cocot3ro.rustelectricity.ui.screen.home.HomeScreen
import com.cocot3ro.rustelectricity.ui.screen.schematic.SchematicScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                modifier = Modifier.fillMaxSize(),
                onClick = {
                    navController.navigate(Schematic(-1L))
                }
            )
        }

        composable<Schematic> {
            val schematic: Schematic = it.toRoute()
            SchematicScreen(modifier = Modifier.fillMaxSize(), id = schematic.id)
        }
    }
}
