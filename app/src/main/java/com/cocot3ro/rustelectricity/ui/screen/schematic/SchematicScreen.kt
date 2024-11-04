package com.cocot3ro.rustelectricity.ui.screen.schematic

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cocot3ro.rustelectricity.ui.screen.schematic.components.PlaygroundPanel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SchematicScreen(
    modifier: Modifier = Modifier,
    id: Long
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("Schematic $id") }
            )
        }
    ) { innerPadding ->
        PlaygroundPanel(modifier = Modifier.padding(innerPadding))
    }
}