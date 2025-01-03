package com.cocot3ro.rustelectricity.ui.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.cocot3ro.rustelectricity.domain.model.RustObject

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItemsToPalletDialog(
    onDismissRequest: () -> Unit,
    availableItems: Array<RustObject>,
    onItemClicked: (RustObject) -> Unit
) {

    AlertDialog(
        modifier = Modifier
            .fillMaxWidth()
            .padding(WindowInsets.safeDrawing.asPaddingValues()),
        onDismissRequest = onDismissRequest,
        title = { Text("Add items to pallet") }, // TODO: String resource
        confirmButton = {
            TextButton(
                onClick = onDismissRequest
            ) {
                Text("Done") // TODO: String resource
            }
        },
        text = {
            var text by rememberSaveable(key = "TEXT") {
                mutableStateOf("")
            }

            var expanded by rememberSaveable(key = "EXPANDED") {
                mutableStateOf(false)
            }

            Column {
                SearchBar(
                    inputField = {
                        SearchBarDefaults.InputField(
                            query = text,
                            onQueryChange = { text = it },
                            onSearch = { expanded = false },
                            expanded = expanded,
                            onExpandedChange = { expanded = it },
                            placeholder = { Text("Hinted search text") }, // TODO: String resource
                            leadingIcon = {
                                Icon(
                                    Icons.Default.Search,
                                    contentDescription = null
                                )
                            }
                        )
                    },
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                ) {
                    val items = availableItems
                        .filter {
                            text == "" || stringResource(it.nameRes).contains(text, true)
                        }.toTypedArray()

                    LazyColumn {
                        items(items) { item: RustObject ->
                            DrawItem(item, onItemClicked)
                        }
                    }
                }
            }
        }
    )
}

@Composable
private fun DrawItem(item: RustObject, onClick: (RustObject) -> Unit) {
    ConstraintLayout(
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                onClick.invoke(item)
            }
            .fillMaxWidth()
            .background(
                color = Color.LightGray.copy(alpha = 0.15f),
                shape = MaterialTheme.shapes.extraSmall
            )
    ) {
        val (itemImage, itemText) = createRefs()

        Image(
            modifier = Modifier
                .constrainAs(itemImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                },
            bitmap = ImageBitmap.imageResource(item.imageRes),
            contentDescription = stringResource(item.nameRes),
        )

        Text(
            modifier = Modifier
                .constrainAs(itemText) {
                    top.linkTo(parent.top)
                    start.linkTo(itemImage.end, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                }
                .padding(horizontal = 4.dp),
            text = stringResource(item.nameRes),
            overflow = TextOverflow.Clip
        )
    }
}
