package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mathewsmobile.testui.R
import dev.mathewsmobile.testui.data.Trail
import dev.mathewsmobile.testui.data.TrailData
import kotlin.math.floor

@Composable
fun Trail(trailData: Trail) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(256.dp)
    ) {
        Image(
            painterResource(R.drawable.ic_trail_1),
            modifier = Modifier.clip(RoundedCornerShape(8.dp)),
            contentDescription = "content description"
        )
        Spacer(Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(trailData.difficulty.name, fontSize = 10.sp)
            Spacer(Modifier.width(4.dp))
            Text("*", fontSize = 8.sp)
            Spacer(Modifier.width(4.dp))
            Icon(Icons.Default.Star, contentDescription = null, tint = Color.Green, modifier = Modifier.size(10.dp))
            Text("${trailData.rating.score}", fontSize = 10.sp)
            Spacer(Modifier.width(4.dp))
            Text("(${trailData.rating.numReviews})", fontSize = 10.sp)
        }

        Text(trailData.name, overflow = TextOverflow.Ellipsis)

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(trailData.location, fontSize = 10.sp, overflow = TextOverflow.Ellipsis)
                Text("Length: ${trailData.length} mi * Est. ${minutesToTime(trailData.time)}", fontSize = 10.sp)
            }

            Icon(Icons.Default.KeyboardArrowDown, contentDescription = null)
        }
    }
}

fun minutesToTime(minutes: Float): String {
    return "${floor(minutes / 60).toInt()}h ${(minutes % 60).toInt()}m"
}

@Preview
@Composable
fun TrailPreview() {
    Trail(TrailData.trails.first())
}