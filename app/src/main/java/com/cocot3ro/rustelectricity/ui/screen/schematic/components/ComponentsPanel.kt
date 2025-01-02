package com.cocot3ro.rustelectricity.ui.screen.schematic.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun PortraitComponentsPanel(
    modifier: Modifier,
    itemPallet: Array<RustObjectType>
) {
    LazyRow(modifier = modifier) {
        items(itemPallet) { item ->
            Column(
                modifier = Modifier
                    .width(150.dp)
                    .padding(8.dp)
                    .background(
                        color = Color.LightGray.copy(alpha = 0.15f),
                        shape = MaterialTheme.shapes.extraSmall
                    )
                    .pointerInput(Unit) {
                        detectDragGestures(
                            onDragStart = { },
                            onDrag = { change, _ ->
                                change.consume()
                            },
                            onDragEnd = { }
                        )
                    },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(item.imageRes),
                    contentDescription = stringResource(item.nameRes),
                )

                Text(
                    modifier = Modifier.padding(bottom = 4.dp, start = 4.dp, end = 4.dp),
                    maxLines = 1,
                    text = stringResource(item.nameRes),
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
fun LandscapeComponentsPanel(
    modifier: Modifier,
    itemPallet: Array<RustObjectType>
) {
    LazyColumn(modifier = modifier) {
        items(itemPallet) { item ->
            ConstraintLayout(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color.LightGray.copy(alpha = 0.15f),
                        shape = MaterialTheme.shapes.extraSmall
                    )
            ) {
                val (image, text) = createRefs()

                Image(
                    modifier = Modifier
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            bottom.linkTo(parent.bottom)
                        },
                    bitmap = ImageBitmap.imageResource(item.imageRes),
                    contentDescription = stringResource(item.nameRes),
                )

                Text(
                    modifier = Modifier
                        .constrainAs(text) {
                            top.linkTo(parent.top)
                            start.linkTo(image.end, margin = 8.dp)
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
    }
}
