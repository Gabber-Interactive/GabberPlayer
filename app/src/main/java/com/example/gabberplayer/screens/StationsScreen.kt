package com.example.gabberplayer.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gabberplayer.ui.theme.GabberPlayerTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StationsScreen(){
    Scaffold(
        floatingActionButton = {
            StationFab()
        }, content = {
            StationList(stationsList)
        })
}

@Composable
fun StationFab(){
    Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = ""
            )
        }
    } 
}

@Composable
fun StationList(stations: List<Station>) {
    LazyColumn(
        modifier = Modifier.padding(vertical = 8.dp))
    {
        items(items = stations) { station ->
            StationElement(stationName = station.stationName, station.stationDescription) }
    }
}


@Composable
fun StationElement(stationName: String, stationDescription: String){
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary),
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        StationElementContent(stationName, stationDescription)
    }
}

@Composable
fun StationElementContent(stationName: String,  stationDescription: String) {
    Row(
        modifier = Modifier
            .padding(8.dp))
    {
        Column(modifier = Modifier
            .weight(1f)
            .padding(12.dp))
        {
            Text(text = stationName, style = MaterialTheme.typography.titleLarge)
            Text(text = stationDescription, style = MaterialTheme.typography.bodyMedium)
        }
        Column(modifier = Modifier
            .padding(12.dp)) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.PlayArrow,
                    contentDescription = ""
                )
            }
        }
    }
}

data class Station(
    val stationName: String,
    val stationDescription: String,
    //val stationUrl: String
)

private val stationsList = listOf(
    Station("GabberStaaf's Burgers", "The best Hakken Drenge in town \uD83C\uDF54"),
    Station("Liquid Brunch", "Come for the cocktails, stay for the bass."),
    Station("Jacks Coffee", "Try our house blend ☕")
)

@Preview
@Composable
fun StationsListPreview(){
    GabberPlayerTheme {
        StationList(stationsList)
    }
}

@Preview
@Composable
fun DefaultPreview(){
    GabberPlayerTheme {
        StationsScreen()
    }
}