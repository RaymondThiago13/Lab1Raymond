package com.example.lab1raymond.database

import com.example.lab1raymond.models.Movie

object Movies {
    fun getMovies(): List<Movie>{
        return listOf(
            Movie(
                id = 1327819,
                imdbId = "tt26443616",
                title = "Hoppers",
                releaseDate = "2026-03-04",
                genres = listOf("Animation", "Family", "Science Fiction", "Comedy", "Adventure"),
                overview = "Scientists have discovered how to 'hop' human consciousness into lifelike robotic animals, allowing people to communicate with animals as animals. Animal lover Mabel seizes an opportunity to use the technology, uncovering mysteries within the animal world beyond anything she could have imagined.",
                homepageUrl = "https://www.pixar.com/hoppers",
                posterPath = "/xjtWQ2CL1mpmMNwuU5HeS4Iuwuu.jpg",
                backdropPath = "/u53UYu5XG2hNgWGvs3xGhAVzypl.jpg"
            ),
            Movie(
                id = 1290821,
                imdbId = "tt32357218",
                title = "Shelter",
                releaseDate = "2026-01-28",
                genres = listOf("Action", "Crime", "Thriller"),
                overview = "A man living in self-imposed exile on a remote island rescues a young girl from a violent storm, setting off a chain of events that forces him out of seclusion to protect her from enemies tied to his past.",
                homepageUrl = "https://blackbearpictures.com/film-and-tv/shelter",
                posterPath = "/buPFnHZ3xQy6vZEHxbHgL1Pc6CR.jpg",
                backdropPath = "/nHxWyy18SvAZ8jJeemtS8k1UNjM.jpg"
            ),
            Movie(
                id = 1226863,
                imdbId = "tt28650488",
                title = "The Super Mario Galaxy Movie",
                releaseDate = "2026-04-01",
                genres = listOf("Family", "Comedy", "Adventure", "Fantasy", "Animation"),
                overview = "Having thwarted Bowser's previous plot to marry Princess Peach, Mario and Luigi now face a fresh threat in Bowser Jr., who is determined to liberate his father from captivity and restore the family legacy. Alongside companions new and old, the brothers travel across the stars to stop the young heir's crusade.",
                homepageUrl = "https://www.thesupermariogalaxymovie.com",
                posterPath = "/eJGWx219ZcEMVQJhAgMiqo8tYY.jpg",
                backdropPath = "/kxQiIJ4gVcD3K6o14MJ72p5yRcE.jpg"
            ),
            Movie(
                id = 1115544,
                imdbId = "tt27552099",
                title = "Mike & Nick & Nick & Alice",
                releaseDate = "2026-03-14",
                genres = listOf("Comedy", "Science Fiction", "Crime"),
                overview = "Two gangsters and the woman they love try to survive the most dangerous night of their lives. As if that wasn't enough, there's one wild ingredient added to the mix: a time machine.",
                homepageUrl = "https://www.20thcenturystudios.com/movies/mike-and-nick-and-nick-and-alice",
                posterPath = "/7F0jc75HrSkLVcvOXR2FXAIwuEv.jpg",
                backdropPath = "/uNToXatdunyvWXyXMrTI1nLvh6r.jpg"
            ),
            Movie(
                id = 1171145,
                imdbId = "tt32430579",
                title = "Crime 101",
                releaseDate = "2026-02-11",
                genres = listOf("Crime", "Thriller"),
                overview = "When an elusive thief whose high-stakes heists unfold along the iconic 101 freeway in Los Angeles eyes the score of a lifetime, with hopes of this being his final job, his path collides with a disillusioned insurance broker who is facing her own crossroads. Determined to crack the case, a relentless detective closes in on the operation, raising the stakes even higher.",
                homepageUrl = "https://www.amazon.com/salp/crime101?hhf",
                posterPath = "/tVvpFIoteRHNnoZMhdnwIVwJpCA.jpg",
                backdropPath = "/zvGMwQ1mAFrxSzzMFT9WMEl6hxB.jpg"
            )
        )
    }
}