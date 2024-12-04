package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mathewsmobile.testui.R

@Composable
fun ActivityBrowser() {
    val activities = listOf("Hiking", "Mountain biking", "Running", "Backpacking")
    Column(modifier = Modifier
        .padding(8.dp)
        .background(Color.Yellow.copy(alpha = 0.1f)).fillMaxWidth()) {
        Text("Browse by activity", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(8.dp))

        LazyRow {
            items(activities.size) {
                val activity = activities[it]

                Spacer(Modifier.width(8.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(R.drawable.ic_trail_1), contentScale = ContentScale.FillHeight, contentDescription = null, modifier = Modifier
                        .clip(
                            CircleShape
                        )
                        .size(32.dp))
                    Text(activity, fontSize = 8.sp)
                }
                Spacer(Modifier.width(8.dp))
            }
        }
    }
}

@Preview
@Composable
fun ActivityPreview() {
    ActivityBrowser()
}