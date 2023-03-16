package com.example.gabberplayer.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PlayerScreen() {
    PlayerGreeting()
}

@Composable
fun PlayerGreeting() {
    Text(text = "Hello from playerscreen")
}