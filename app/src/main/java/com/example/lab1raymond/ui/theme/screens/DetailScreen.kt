package com.example.lab1raymond.ui.theme.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.example.lab1raymond.models.Movie
import com.example.lab1raymond.utils.Constants
import androidx.core.net.toUri

@Composable
fun DetailScreen(movie: Movie, modifier: Modifier){

    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ){
        AsyncImage(
            model = Constants.POSTER_IMAGE_BASE_URL + Constants.POSTER_IMAGE_BASE_WIDTH + movie.posterPath,
            contentDescription = movie.title,
            modifier = Modifier.width(120.dp).height(180.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = movie.title,
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = movie.genres.joinToString(", ")
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Open Homepage",
            color = Color.Blue,
            modifier = Modifier.clickable {
                uriHandler.openUri(movie.homepage)
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Open IMDb",
            color = Color.Blue,
            modifier = Modifier.clickable {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    movie.getImdbUrl().toUri()
                )
                context.startActivity(intent)
            }
        )
    }

}

@Composable
fun AsyncImage(model: String, contentDescription: String, modifier: Modifier) {
    TODO("Not yet implemented")
}