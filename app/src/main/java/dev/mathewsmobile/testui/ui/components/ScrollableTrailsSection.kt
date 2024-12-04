package dev.mathewsmobile.testui.ui.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import dev.mathewsmobile.testui.data.Trail

@Composable
fun ScrollableTrailsSection(trails: List<Trail>) {
    val scrollState = rememberLazyListState()
    LazyRow(state = scrollState) {
        items(trails.size) {
            Trail(trails[it])
        }
    }
}