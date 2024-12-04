package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mathewsmobile.testui.data.TrailData

@Composable
fun TrailSection(title: String) {
    val trails = TrailData.trails

    Column(modifier = Modifier.padding(8.dp)) {
        Text(title, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))

        ScrollableTrailsSection(trails)
    }
}