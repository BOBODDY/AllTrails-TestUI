package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MapFab() {
    Row(modifier = Modifier.padding(horizontal = 16.dp)) {
        Icon(Icons.Default.MailOutline, contentDescription = null)
        Spacer(Modifier.width(8.dp))
        Text("Map")
    }
}
