package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mathewsmobile.testui.R

@Composable
fun HomeScreen() {
    val lazyColumnState = rememberLazyListState()
    Scaffold(
        bottomBar = {
            NavBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = CircleShape
            ) { MapFab() }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        LazyColumn(modifier = Modifier.padding(it), state = lazyColumnState) {
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { SearchBar() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { TopSection() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { HeroImage() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { ActivityBrowser() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { TrailSection("Waterfalls") }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { TrailSection("Weekend worthy") }

        }
    }
}

@Composable
fun HeroImage() {
    Box(contentAlignment = Alignment.BottomStart) {
        Image(
            painterResource(R.drawable.bierstadt_lake),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text("Explore", fontSize = 32.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp, start = 8.dp), color = Color.White)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}