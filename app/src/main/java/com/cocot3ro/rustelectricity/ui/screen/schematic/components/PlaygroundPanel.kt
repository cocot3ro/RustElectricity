package com.cocot3ro.rustelectricity.ui.screen.schematic.components

import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import androidx.compose.ui.util.fastCoerceIn
import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.pxToDp
import com.cocot3ro.rustelectricity.domain.model.RustObject
import com.cocot3ro.rustelectricity.interfaces.IDeployable
import com.cocot3ro.rustelectricity.ui.theme.DarkBlue
import kotlin.math.ceil
import kotlin.math.round

private object Values {
    const val GRID_STEP: Float = 200f

    const val MIN_SCALE: Float = 0.25f
    const val MAX_SCALE: Float = 1.5f
    const val DEFAULT_SCALE: Float = 1f

    val SCALE_INTERVAL: (Float) -> Int = { scale ->
        when (scale) {
            in MIN_SCALE..<0.5f -> 3
            in 0.5f..MAX_SCALE -> 1
            else -> {
                Log.wtf("PlaygroundPanel", "Invalid scale value: $scale. Scale interval set to 1.")
                1
            }
        }
    }
}

private val offsetSaver: Saver<MutableState<Offset>, Pair<Float, Float>> = Saver(
    save = { it -> it.value.let { it.x to it.y } },
    restore = { mutableStateOf(Offset(it.first, it.second)) }
)

@Composable
fun PlaygroundPanel(
    modifier: Modifier = Modifier,
    deployables: Array<IDeployable>,
    canAddItemsToPallet: Boolean,
    onAddMoreItems: () -> Unit,
) {
    var scale by rememberSaveable(
        key = "SCALE"
    ) { mutableFloatStateOf(Values.DEFAULT_SCALE) }

    var offset by rememberSaveable(key = "OFFSET", saver = offsetSaver) {
        mutableStateOf(Offset.Zero)
    }
    Box(modifier = modifier) {

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .background(DarkBlue)
                .pointerInput(Unit) {
                    detectTransformGestures { centroid, pan, zoom, _ ->
                        val newScale = (scale * zoom)
                            .fastCoerceIn(
                                minimumValue = Values.MIN_SCALE,
                                maximumValue = Values.MAX_SCALE
                            )

                        if (newScale != scale) {
                            val newOffset = (offset - centroid) * zoom + centroid
                            offset = newOffset + pan / newScale

                            scale = newScale
                        } else {
                            offset += pan
                        }
                    }
                }
        ) {
            val space = Values.GRID_STEP * scale
            val width = size.width
            val height = size.height

            val lineSpacing = Values.SCALE_INTERVAL.invoke(scale)

            // Dibujar líneas verticales
            for (i in 0..ceil(width / space).toInt()) {
                val x = i * space + offset.x % space

                if (x < 0) continue
                if (x > width) break

                val coordX = round(((x - offset.x) / scale) / Values.GRID_STEP).toInt()

                if (coordX % lineSpacing != 0) continue

                drawLine(
                    start = Offset(x, 0f),
                    end = Offset(x, height),
                    color = Color.White
                )
            }

            // Dibujar líneas horizontales
            for (i in 0..ceil(height / space).toInt()) {
                val y = i * space + offset.y % space

                if (y < 0) continue
                if (y > height) break

                val coordY = round(((y - offset.y) / scale) / Values.GRID_STEP).toInt()

                if (coordY % lineSpacing != 0) continue

                drawLine(
                    start = Offset(0f, y),
                    end = Offset(width, y),
                    color = Color.White
                )
            }
        }

        if (canAddItemsToPallet) {
            SmallFloatingActionButton(
                onClick = onAddMoreItems,
                modifier = Modifier
                    .padding(end = 8.dp, bottom = 8.dp)
                    .align(
                        if (LocalContext.current.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
                            Alignment.BottomEnd
                        else Alignment.TopStart
                    )
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_format_list_bulleted_add_48dp),
                    contentDescription = stringResource(R.string.pallet_add_more_description)
                )
            }
        }

        deployables.forEach { deployable: IDeployable ->
            deployable as RustObject

            var itemPosition by remember { mutableStateOf(deployable.position) }

            val bm = ImageBitmap.imageResource(deployable.imageRes)
            val context = LocalContext.current
            DrawItem(
                modifier = Modifier
                    .width(context.pxToDp(bm.width * scale))
                    .height(context.pxToDp(bm.height * scale))
                    .offset {
                        val x = itemPosition.x * scale + offset.x
                        val y = itemPosition.y * scale + offset.y

                        Offset(x, y).round()
                    }
                    .background(Color.White)
                    .pointerInput(Unit) {
                        detectDragGestures { change, dragAmount ->
                            change.consume()

                            itemPosition += dragAmount / scale
                            deployable.position = itemPosition
                        }
                    },
                item = deployable
            )
        }
    }
}

@Composable
private fun DrawItem(
    modifier: Modifier,
    item: RustObject
) {
    Image(
        modifier = modifier,
        bitmap = ImageBitmap.imageResource(item.imageRes),
        contentDescription = stringResource(item.nameRes)
    )
}
