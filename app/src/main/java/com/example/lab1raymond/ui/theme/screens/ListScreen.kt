package com.example.lab1raymond.ui.theme.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab1raymond.models.Movie

@Composable
fun ListScreen(
    movies: List<Movie>,
    navController: NavController,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier){
        items(movies){ movie ->
            MovieItem(movie, navController)
        }
    }
}

@Composable
fun MovieItem(movie: Movie, navController: NavController){
    Card(
        modifier = Modifier.padding(8.dp).fillMaxWidth().clickable{ navController.navigate("detail/${movie.id}") }
    ){
        Column(modifier = Modifier.padding(16.dp)){
            Text(
                text = movie.title,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = movie.overview,
                maxLines = 2
            )
        }
    }
}