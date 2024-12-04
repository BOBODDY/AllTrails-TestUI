package dev.mathewsmobile.testui.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun NavBar() {
    NavigationBar {
        NavigationBarItem(icon = {
            Icon(
                Icons.Default.Home,
                contentDescription = null
            )
        }, label = { Text("Home", fontSize = 10.sp) }, selected = true, onClick = {})
        NavigationBarItem(icon = {
            Icon(
                Icons.Default.Face,
                contentDescription = null
            )
        }, label = { Text("Community", fontSize = 10.sp) }, selected = true, onClick = {})

        NavigationBarItem(icon = {
            Icon(
                Icons.Default.PlayArrow,
                contentDescription = null
            )
        }, label = { Text("Navigate", fontSize = 10.sp) }, selected = true, onClick = {})

        NavigationBarItem(icon = {
            Icon(
                Icons.Default.Star,
                contentDescription = null
            )
        }, label = { Text("Saved", fontSize = 10.sp) }, selected = true, onClick = {})

        NavigationBarItem(icon = {
            Icon(
                Icons.Default.Person,
                contentDescription = null
            )
        }, label = { Text("Profile", fontSize = 10.sp) }, selected = true, onClick = {})

    }
}
