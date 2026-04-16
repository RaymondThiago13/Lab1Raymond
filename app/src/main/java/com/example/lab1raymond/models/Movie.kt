package com.example.lab1raymond.models

data class Movie(
    var id: Long = 0L,
    var imdbId: String,
    var title: String,
    var releaseDate: String,
    var genres: List<String>,
    var overview: String,
    var homepageUrl: String,
    var posterPath: String,
    var backdropPath: String
){
    fun getImdbUrl(): String{
        return "https://www.imdb.com/title/$imdbId/"
    }
}
