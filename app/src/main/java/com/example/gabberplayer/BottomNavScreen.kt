package com.example.gabberplayer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavScreen(
        route = "home", title = "Home", icon = Icons.Default.Home
    )

    object Player : BottomNavScreen(
        route = "player", title = "Player", icon = Icons.Default.PlayArrow
    )
}
