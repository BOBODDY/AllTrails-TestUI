package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {
    Box(modifier = Modifier.padding(16.dp)) {
        ElevatedCard(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Search, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Find locations")
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.Gray.copy(alpha = 0.5f))
                        .padding(4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}