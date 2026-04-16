package com.example.lab1raymond

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lab1raymond.Routes.Routes
import com.example.lab1raymond.database.Movies
import com.example.lab1raymond.ui.theme.Lab1RaymondTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1RaymondTheme {
                runApp()
                }
            }
        }
    }
}

@Composable
fun runApp() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { MyTopBar (navController) }
    ) {innerpadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.LIST
        ){
            composable(Routes.LIST){
                ListScreen(
                    movies = Movies.getMovies(),
                    navController = navController,
                    modifier = Modifier.padding(innerpadding)
                )
            }

            composable(
                route = Routes.Detail,
                arguments = listOf(navArgument("movieId") {type = NavType.LongType})
            ){
                backStackEntry ->
                val movieId = backStackEntry.arguments?.getLong("movieId")

                val movie = Movies.getMovies().find { it.id == movieId }

                if(movie != null){
                    DetailScreen(
                        movie = movie,
                        modifier = Modifier.padding(innerpadding)
                    )
                }
            }

            composable(Routes.INFO){
                infoScreen(modifier = Modifier.padding(innerpadding))
            }
        }
    }
}

@Composable
fun MyTopBar(navController: NavHostController){
    CenterAlignedTopAppBar(
        title = {
            Text("My Movie App")
        },

        //NavigationIcon stands for the button on the left.
        navigationIcon = {
            IconButton(onClick = {
                navController.navigate(Routes.LIST){ popUpTo(Routes.LIST) }
            }) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home"
                )
            }
        },

        //actions stand for the button on the right.
        actions = {
            IconButton(onClick = {
                navController.navigate(Routes.INFO)
            }) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Info"
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1RaymondTheme {
        Greeting("Android")
    }
}