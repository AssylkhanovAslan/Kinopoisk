package com.example.kinoposik.data

import com.example.kinoposik.models.Movie
import com.example.kinoposik.models.MovieCategory

object LocalData {

    fun getParentItemList(): List<MovieCategory> {
        return listOf(
            MovieCategory("Fantasy", getFantasyMovies()),
            MovieCategory("Action", getChildMovies()),
            MovieCategory("Cartoon", getChildMovies()),
            MovieCategory("Games", getChildMovies())
        )
    }

    private val imgURL =
        "https://static.wikia.nocookie.net/ani-manga/images/d/de/Hunter_x_Hunter_Poster.jpg/revision/latest?cb=20210819154626&path-prefix=ru"

    private fun getChildMovies(): List<Movie> {
        return listOf(
            Movie(0, "Spider man", imgURL, "Some description"),
            Movie(1, "Iron man", imgURL, "Some description"),
            Movie(2, "Bat man", imgURL, "Some description"),
            Movie(3, "Super man", imgURL, "Some description"),
        )
    }

    private const val deadpool = "Deadpool"
    private const val deadpoolImgUrl =
        "https://pbs.twimg.com/profile_images/1208234904405757953/mT0cFOVQ_400x400.jpg"
    private val deadpoolMovieDescription =
        "Ajax, a twisted scientist, experiments on Wade Wilson, a mercenary, to cure him of cancer and give him healing powers. " +
                "However, the experiment leaves Wade disfigured and he decides to exact revenge."

    private const val logan = "Logan"
    private const val loganImgUrl =
        "https://lumiere-a.akamaihd.net/v1/images/logan_584x800_9a5af33a.jpeg"
    private const val loganMovieDescription =
        "Logan comes out of retirement to escort a young mutant named Laura to a safe place. " +
                "He meets with other mutants, who run from an evil corporation that has been experimenting with them, along the way."

    private const val fantasticFour = "Fantastic Four"
    private const val fantasticFourImgUrl =
        "https://m.media-amazon.com/images/M/MV5BMTk0OTMyMDA0OF5BMl5BanBnXkFtZTgwMzY5NTkzNTE@._V1_.jpg"
    private const val fantasticFourDescription =
        "The four characters traditionally associated with the Fantastic Four, who gained superpowers after exposure" +
                " to cosmic rays during a scientific mission to outer space, are: Mister Fantastic (Reed Richards), a scientific genius and the leader of the group, " +
                "who can stretch his body into incredible lengths and shapes;"

    private const val warcraft = "Warcraft"
    private const val warcraftImgUrl = "https://pics.filmaffinity.com/Warcraft-333696701-mmed.jpg"
    private const val warcraftDescription =
        "A few human survivors must team up with a group of dissenting Orcs to stop an Orc horde from invading their planet through a magic portal."

    private fun getFantasyMovies(): List<Movie> {
        return listOf(
            Movie(
                0,
                title = deadpool,
                img = deadpoolImgUrl,
                description = deadpoolMovieDescription
            ),
            Movie(
                1,
                title = logan,
                img = loganImgUrl,
                description = loganMovieDescription
            ),
            Movie(
                2,
                title = fantasticFour,
                img = fantasticFourImgUrl,
                description = fantasticFourDescription
            ),
            Movie(
                3,
                title = warcraft,
                img = warcraftImgUrl,
                description = warcraftDescription
            )
        )
    }


}