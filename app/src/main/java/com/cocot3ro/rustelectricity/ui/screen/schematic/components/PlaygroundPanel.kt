package com.cocot3ro.rustelectricity.ui.screen.schematic.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.util.fastCoerceIn
import com.cocot3ro.rustelectricity.ui.theme.DarkBlue
import kotlin.math.ceil
import kotlin.math.round

private object Keys {
    const val OFFSET = "OFFSET"
    const val SCALE = "SCALE"
}

private object Values {
    const val GRID_STEP: Float = 150f

    const val MIN_SCALE: Float = 0.25f
    const val MAX_SCALE: Float = 2f
    const val DEFAULT_SCALE: Float = 1f
    const val SCALE_THRESHOLD: Float = 0.5f

    const val DEFAULT_OFFSET_X: Float = 0f
    const val DEFAULT_OFFSET_Y: Float = 0f
}

val offsetSaver = object : Saver<MutableState<Offset>, Pair<Float, Float>> {
    override fun SaverScope.save(value: MutableState<Offset>): Pair<Float, Float> {
        return value.value.let { it.x to it.y }
    }

    override fun restore(value: Pair<Float, Float>): MutableState<Offset> {
        return mutableStateOf(Offset(value.first, value.second))
    }
}

@Composable
fun PlaygroundPanel(
    modifier: Modifier = Modifier
) {
    val textMeasurer = rememberTextMeasurer()
    var scale by rememberSaveable(key = Keys.SCALE) { mutableFloatStateOf(Values.DEFAULT_SCALE) }
    var offset by rememberSaveable(
        saver = offsetSaver,
        key = Keys.OFFSET
    ) { mutableStateOf(Offset(Values.DEFAULT_OFFSET_X, Values.DEFAULT_OFFSET_Y)) }
    var centerOffset by rememberSaveable(
        saver = offsetSaver
    ) { mutableStateOf(Offset.Zero) }
    var applyCenterOffset by rememberSaveable { mutableStateOf(true) }

    Canvas(
        modifier = modifier
            .fillMaxSize()
            .background(DarkBlue)
            .pointerInput(Unit) {
                detectTransformGestures { centroid, pan, zoom, _ ->
                    val newScale = (scale * zoom).fastCoerceIn(Values.MIN_SCALE, Values.MAX_SCALE)

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
        centerOffset = Offset(size.width / 2f, size.height / 2f)

        if (applyCenterOffset) {
            offset += centerOffset
            applyCenterOffset = false
        }

        val space = Values.GRID_STEP * scale
        val width = size.width
        val height = size.height

        val lineSpacing = if (scale < Values.SCALE_THRESHOLD) 3 else 1

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

            drawText(
                textMeasurer = textMeasurer,
                text = coordX.toString(),
                topLeft = Offset(x, 0f),
                style = TextStyle(color = Color.White)
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

            drawText(
                textMeasurer = textMeasurer,
                text = coordY.toString(),
                topLeft = Offset(0f, y),
                style = TextStyle(color = Color.White)
            )
        }
    }
}
