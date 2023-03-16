package com.example.gabberplayer.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    HomeGreeting()
}

@Composable
fun HomeGreeting() {
    Text(text = "Hello from homescreen")
}