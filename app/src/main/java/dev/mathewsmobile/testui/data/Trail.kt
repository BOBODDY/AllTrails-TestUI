package dev.mathewsmobile.testui.data

data class Trail(
    val name: String,
    val difficulty: Difficulty,
    val rating: Reviews,
    val location: String,
    val length: Float, // Length of the trail, in miles
    val time: Float, // Estimated number of minutes to complete trail
)

enum class Difficulty {
    Easy, Medium, Hard
}

data class Reviews(
    val score: Float,
    val numReviews: Int
)

object TrailData {
    val trails = listOf(
        Trail(
            name = "East Palisades Trail and Bamboo Forest",
            difficulty = Difficulty.Medium,
            rating = Reviews(4.6f, 5618),
            location = "Chattahoochee River National Recreational Area",
            length = 3.9f,
            time = 98f
        ),
        Trail(
            name = "Vickery Creek Trail",
            difficulty = Difficulty.Easy,
            rating = Reviews(4.6f, 3537),
            location = "Vickery Creek Unit- Chattahoochee River National Recreational Area",
            length = 3.4f,
            time = 82f
        ),
        Trail(
            name = "Stone Mountain Cherokee Loop",
            difficulty = Difficulty.Medium,
            rating = Reviews(4.7f, 4402),
            location = "Stone Mountain Park",
            length = 5.1f,
            time = 92f
        )

    )
}