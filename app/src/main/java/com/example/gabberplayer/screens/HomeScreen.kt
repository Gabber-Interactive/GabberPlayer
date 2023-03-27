package com.example.gabberplayer.screens


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.gabberplayer.ui.theme.GabberPlayerTheme

@Composable
fun HomeScreen(){
    Text(text = "Home Screen")
}


@Preview(showBackground = true)
@Composable
fun HomescreenPreview(){
    GabberPlayerTheme() {
        HomeScreen()
    }
}