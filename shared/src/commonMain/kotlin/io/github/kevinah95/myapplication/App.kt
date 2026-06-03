package io.github.kevinah95.myapplication

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import io.github.kevinah95.myapplication.screens.ContadorScreen

@Composable
fun App() {
    MaterialTheme {
        var count by rememberSaveable { mutableStateOf(0) }
        ContadorScreen( count = count,
            onIncrement = { count++ } )
    }
}