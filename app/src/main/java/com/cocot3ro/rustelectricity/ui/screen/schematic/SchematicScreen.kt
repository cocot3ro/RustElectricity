package com.cocot3ro.rustelectricity.ui.screen.schematic

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem
import com.cocot3ro.rustelectricity.generated.domain.model.deployables
import com.cocot3ro.rustelectricity.ui.dialog.AddItemsToPalletDialog
import com.cocot3ro.rustelectricity.ui.screen.schematic.components.LandscapeComponentsPanel
import com.cocot3ro.rustelectricity.ui.screen.schematic.components.PlaygroundPanel
import com.cocot3ro.rustelectricity.ui.screen.schematic.components.PortraitComponentsPanel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SchematicScreen(
    modifier: Modifier = Modifier,
    viewModel: SchematicViewModel = hiltViewModel(),
    id: Long
) {
    viewModel.loadSchematic(id)

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("Schematic $id") }
            )
        }
    ) { innerPadding ->
        val itemPallet = viewModel.itemPallet.collectAsState().value.toTypedArray()
        val deployables = viewModel.deployables.collectAsState().value.toTypedArray()

        var showDialog by rememberSaveable(key = "SHOW_DIALOG") {
            mutableStateOf(false)
        }

        val availableItems = RustObjectItem.deployables.subtract(itemPallet.toSet()).toTypedArray()

        when (LocalContext.current.resources.configuration.orientation) {

            Configuration.ORIENTATION_PORTRAIT -> {
                Column(modifier = Modifier.padding(innerPadding)) {
                    PlaygroundPanel(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        deployables = deployables,
                        canAddItemsToPallet = availableItems.isNotEmpty()
                    ) { showDialog = true }

                    PortraitComponentsPanel(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        itemPallet = itemPallet
                    )
                }
            }

            Configuration.ORIENTATION_LANDSCAPE -> {
                Row(modifier = Modifier.padding(innerPadding)) {
                    LandscapeComponentsPanel(
                        modifier = Modifier
                            .width(250.dp)
                            .fillMaxHeight(),
                        itemPallet = itemPallet
                    )

                    PlaygroundPanel(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        deployables = deployables,
                        canAddItemsToPallet = availableItems.isNotEmpty()
                    ) { showDialog = true }
                }
            }

            else -> throw IllegalStateException("Unsupported orientation")
        }

        if (showDialog) {
            AddItemsToPalletDialog(
                onDismissRequest = { showDialog = false },
                availableItems = availableItems,
                onItemClicked = { viewModel.addItemToPallet(it) }
            )
        }
    }
}
